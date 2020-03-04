package pl.buki.funds;

import java.util.Optional;
import java.util.concurrent.ConcurrentHashMap;
import org.springframework.stereotype.Component;

@Component
class FundsInMemoryRepository implements FundsRepository {

  private final ConcurrentHashMap<String, Funds> db = new ConcurrentHashMap<>();

  @Override
  public Optional<Funds> findByPlayerId(String playerId) {
    return Optional.ofNullable(db.get(playerId));
  }

  @Override
  public void save(Funds funds) {
    db.put(funds.getPlayerId(), funds);
  }
}
