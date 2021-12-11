package learning.static_keyword;

public class Friend {
  String name;
  static int numberOfFriends;

  Friend(String name) {
    this.name = name;
    numberOfFriends++;
  }

  public static void displayFriend() {
    System.out.println("You have " + numberOfFriends + " friends.");
  }
}
