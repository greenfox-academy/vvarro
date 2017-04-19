public class Card {

  public enum Rank {
    TWO(2), THREE(3), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10), J(10), Q(10), K(10), A
      (11);

    private int RankValue;

    Rank(int value) {
      this.RankValue = value;
    }
  }

  public enum Suit {
    CLUBS(Color.BLACK), DIAMONDS(Color.RED), HEARTS(Color.RED), SPADES(Color.BLACK);

    private Color color;

    Suit(Color color) {
      this.color = color;
    }
  }

  public enum Color {
    BLACK(Color.BLACK), RED(Color.RED);

    private Color color;

    Color(Color color) {
      this.color = color;
    }
  }

  private final Rank rank;
  private final Suit suit;
  private final Color color;

  private Card(Rank rank, Suit suit, Color color) {
    this.rank = rank;
    this.suit = suit;
    this.color = color;
  }

  public Rank rank() {
    return this.rank;
  }

  public Suit suit() {
    return this.suit;
  }

  public Color color() {
    return this.color;
  }

}