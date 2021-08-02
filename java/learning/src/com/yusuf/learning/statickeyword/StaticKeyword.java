package com.yusuf.learning.statickeyword;

public class StaticKeyword {
    public static void main(String[] args) {
        // static = modifier. A single copy of a variable/method is created and shared.
        //			The class "owns" the static member

        Friend friend1 = new Friend("Muzamil");
        Friend friend2 = new Friend("Issa");
        Friend friend3 = new Friend("Omar");

        Friend.displayFriend();
        //System.out.println(Friend.numberOfFriends);
    }
}
