package pl.buki.funds;

import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@RequiredArgsConstructor
@Configuration
class FundsConfiguration {

  private final FundsInMemoryRepository fundsInMemoryRepository;

  @Bean
  FundsService fundsService() {
    return new FundsService(fundsInMemoryRepository);
  }

}
