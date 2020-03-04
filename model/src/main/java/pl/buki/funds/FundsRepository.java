package pl.buki.funds;

import java.util.Optional;

interface FundsRepository {

  Optional<Funds> findByPlayerId(String playerId);

  void save(Funds funds);
}
