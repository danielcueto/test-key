package com.mycompany.zooproject;

public class Fish {
    protected String name;
    protected String gender;
    protected String type;
    protected ReproductionLogicFish logic;

    public Fish(String name, String gender, String type) {
        this.name = name;
        this.gender = gender;
        this.type = type;
    }

    public void setLogic(ReproductionLogicFish logic) {
        this.logic = logic;
    }

    public Hippocampus reproduceWith(Fish partner) {
        if (logic.canReproduceWith(this, partner)) {
            return logic.reproduce(this, partner);
        } else {
            System.out.println("  Reproduction not allowed between " + this.name + " and " + partner.name);
            return null;
        }
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public String getType() {
        return type;
    }
}
