package com.company;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISaveable {
    private String name;
    private int hitPoints;
    private int strength;
    private String weapon;

    public Player(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
        this.weapon = "Sword";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public void setHitPoints(int hitPoints) {
        this.hitPoints = hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                ", weapon='" + weapon + '\'' +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> objectWrite = new ArrayList<>();
        objectWrite.add(0, this.name);
        objectWrite.add(1, ""+this.hitPoints);
        objectWrite.add(2, ""+this.strength);
        objectWrite.add(3, this.weapon);

        return objectWrite;
    }

    @Override
    public void read(List<String> objectToload) {
        if ((objectToload != null) && (objectToload.size() > 0)) {
            this.name = objectToload.get(0);
            this.hitPoints = Integer.parseInt(objectToload.get(1));
            this.strength = Integer.parseInt(objectToload.get(2));
            this.weapon = objectToload.get(3);
        }
    }
}
