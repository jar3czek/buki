package pl.buki.funds;

class PlayerNotFound extends RuntimeException {

  PlayerNotFound(String playerId) {
    super("Player with id " + playerId + " not found.");
  }

}
