package com.company;

public class Monster {
    // public constant accessible from outside the class
    public final String TOMBSTONE = "Here Lies a Dead Monster";

    // private constant only accessible from the class
    private int health = 500;
    private int attack = 20;
    private int movement = 2;
    private int xPosition = 0;
    private int yPosition = 0;
    private boolean alive = true;

    public String name = "Big Monster";

    // You should strive to have as many private fields as possible.

    // accessor methods allow others to get the value without access to modify it.
    public int getAttack() {
        return attack;
    }

    public int getMovement() {
        return movement;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int decreaseHealth) {
        health = health - decreaseHealth;
        if (health <= 0) {
            alive = false;
        }
    }

    // we may receive a double for the above method, so lets "overload" with this method
    public void setHealth(double decreaseHealth) {
        int intDecreaseHealth = (int) decreaseHealth;
        health = health - intDecreaseHealth;
        if (health <= 0) {
            alive = false;
        }
    }

    // constructor method
    public Monster(int newHealth, int newAttach, int newMovement) {
        health = newHealth;
        attack = newAttach;
        movement = newMovement;
    }

    // overloading the constructor (Default constructor)
    public Monster() {

    }

    // you can also do this with two constructors
    public Monster(int newHealth) {
        health = newHealth;
    }

    public Monster(int newHealth, int newAttack) {
        this(newHealth); //this is a call to the above constructor
        attack = newAttack;
    }

}
