package pl.buki.funds

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders
import org.springframework.test.web.servlet.result.MockMvcResultMatchers
import spock.lang.Specification

@SpringBootTest
@AutoConfigureMockMvc
class FundsIntegrationTest extends Specification {

    @Autowired
    MockMvc mockMvc

    @Autowired
    FundsRepository fundsRepository

    def 'should add funds'() {
        given:
        def playerId = '726db1f7-ba01-43f7-b1a7-89f53486fe7e'
        def request = '{ "euroGoals": "1237" }'
        def funds = new Funds(playerId)
        funds.addFunds(100)

        fundsRepository.save(funds)

        when:
        mockMvc
                .perform(MockMvcRequestBuilders.post("/players/${playerId}/funds")
                        .contentType(MediaType.APPLICATION_JSON)
                        .accept(MediaType.APPLICATION_JSON)
                        .content(request)
                )
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn()
                .getResponse()


        then:
        funds.balance == 1337
    }

}
