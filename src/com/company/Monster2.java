package com.company;

public class Monster2 {

    public static void main(String[] args) {
        Monster Cody = new Monster();
        Cody.name = "Cody";
        // we can set public variables like above, and we can get private variables like below:
        System.out.println(Cody.name + " has an attack value of " + Cody.getAttack());
    }
}
