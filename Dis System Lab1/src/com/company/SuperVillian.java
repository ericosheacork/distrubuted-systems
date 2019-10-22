package com.company;

import java.io.Serializable;

public class SuperVillian implements Serializable   {
    private String villianName;
    private boolean evilness = true;
    private boolean flyPerson;
    private int strongMan;

    public SuperVillian(String villianName, boolean evilness, boolean flyPerson, int strongMan) {
        this.villianName = villianName;
        this.evilness = evilness;
        this.flyPerson = flyPerson;
        this.strongMan = strongMan;
    }

    public String getVillianName() {
        return villianName;
    }

    public void setVillianName(String villianName) {
        this.villianName = villianName;
    }

    public boolean isEvilness() {
        return evilness;
    }

    public void setEvilness(boolean evilness) {
        this.evilness = evilness;
    }

    public boolean isFlyPerson() {
        return flyPerson;
    }

    public void setFlyPerson(boolean flyPerson) {
        this.flyPerson = flyPerson;
    }

    public int getStrongMan() {
        return strongMan;
    }

    public void setStrongMan(int strongMan) {
        this.strongMan = strongMan;
    }
}
