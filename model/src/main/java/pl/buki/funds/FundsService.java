package pl.buki.funds;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
class FundsService {

  private final FundsRepository fundsRepository;

  int addFunds(String playerId, int amount) {
    final Funds funds = getFunds(playerId);
    funds.addFunds(amount);
    fundsRepository.save(funds);
    return funds.getBalance();
  }

  private Funds getFunds(String playerId) {
    return fundsRepository.findByPlayerId(playerId)
        .orElseThrow(() -> new PlayerNotFound(playerId));
  }
}
