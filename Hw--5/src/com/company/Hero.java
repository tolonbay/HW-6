package com.company;

public class Hero {
    private int heroHealth = 300;
    private int heroDamage = 30;
    private String superSkills;



    public Hero(int heroHealth, int heroDamage, String superSkills) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
        this.superSkills = superSkills;
    }

    public Hero(int heroHealth, int heroDamage) {
        this.heroHealth = heroHealth;
        this.heroDamage = heroDamage;
    }

    public int getHeroHealth() {
        return heroHealth;
    }

    public int getHeroDamage() {
        return heroDamage;
    }

    public String getSuperSkills() {
        return superSkills;
    }
}

