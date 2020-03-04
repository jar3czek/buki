package pl.buki.funds;

import lombok.Getter;

class Funds {

  @Getter
  private final String playerId;

  @Getter
  private int balance;

  Funds(String playerId) {
    this.playerId = playerId;
  }

  void addFunds(int amount) {
    if (amount <= 0) {
      throw new InvalidAmount(amount);
    }

    balance += amount;
  }
}
