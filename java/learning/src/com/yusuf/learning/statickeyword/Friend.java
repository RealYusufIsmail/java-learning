package com.yusuf.learning.statickeyword;

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
