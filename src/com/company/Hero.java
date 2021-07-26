package com.company;

public abstract class Hero {

    private String name;
    private Integer HP;
    private Integer damage;
    private String abilityType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getHP() {
        return HP;
    }

    public void setHP(Integer HP) {
        this.HP = HP;
    }

    public Integer getDamage() {
        return damage;
    }

    public void setDamage(Integer damage) {
        this.damage = damage;
    }

    public String getAbilityType() {
        return abilityType;
    }

    public void setAbilityType(String abilityType) {
        this.abilityType = abilityType;
    }

    abstract void HavingSuperAbility();

    public abstract String superAbilityType(String type);

    protected abstract String superAbilityType();


    public String info(){
        return superAbilityType();
    }
}
