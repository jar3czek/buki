package pl.buki.funds;

class InvalidAmount extends RuntimeException {

  InvalidAmount(int amount) {
    super("Invalid amount = " + amount);
  }

}
