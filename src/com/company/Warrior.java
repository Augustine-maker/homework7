package com.company;



public class Warrior extends Hero{



    public Warrior(String x, int i) {
        super();
    }

    @Override
    void HavingSuperAbility() {

    }

    @Override
    public String superAbilityType(String type) {
        return null;
    }

    @Override
    protected String superAbilityType() {
        return null;
    }
    public String info(){
        return super.info() + " " + SuperAbility.SUPER_ABILITY;
    }
}
