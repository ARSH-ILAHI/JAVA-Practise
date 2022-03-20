package com.company;

import java.util.ArrayList;
import java.util.List;

public class Monster implements ISaveable{
    private String name;
    private int hitPoints;
    private int strength;

    public Monster(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

    @Override
    public List<String> write() {
        List<String> objectWrite = new ArrayList<>();
        objectWrite.add(0, this.name);
        objectWrite.add(1, ""+this.hitPoints);
        objectWrite.add(2, ""+this.strength);

        return objectWrite;
    }

    @Override
    public void read(List<String> objectToload) {
        if ((objectToload != null) && (objectToload.size() > 0)) {
            this.name = objectToload.get(0);
            this.hitPoints = Integer.parseInt(objectToload.get(1));
            this.strength = Integer.parseInt(objectToload.get(2));
        }
    }
}
