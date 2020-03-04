package pl.buki.funds

import com.blogspot.toomuchcoding.spock.subjcollabs.Collaborator
import com.blogspot.toomuchcoding.spock.subjcollabs.Subject
import spock.lang.Specification

class FundsServiceTest extends Specification {

    @Collaborator
    FundsRepository fundsRepository = Stub()

    @Subject
    FundsService sub

    def 'should add funds to player'() {
        given:
        def playerId = 'abc123'
        def amount = 1237
        def funds = new Funds('abc123')
        funds.addFunds(100)

        fundsRepository.findByPlayerId(playerId) >> Optional.of(funds)

        when:
        def result = sub.addFunds(playerId, amount)

        then:
        result == 1337
    }

    def 'should not add negative funds to player'() {
        given:
        def playerId = 'abc123'
        def amount = -100

        fundsRepository.findByPlayerId(playerId) >> Optional.of(
                new Funds('abc123')
        )

        when:
        sub.addFunds(playerId, amount)

        then:
        thrown(InvalidAmount)
    }

    def 'should not add funds to non existing player'() {
        given:
        def playerId = 'abc124'
        def amount = 1337

        fundsRepository.findByPlayerId(_) >> Optional.empty()

        when:
        sub.addFunds(playerId, amount)

        then:
        thrown(PlayerNotFound)
    }

}
