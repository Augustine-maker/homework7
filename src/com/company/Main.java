/*
Создать интерфейс HavingSuperAbility (имеющий суперспособность) добавить в него 1 абстрактный метод applySuperAbility(String superAbilityType);
Создать абстрактный класс Hero с полями здоровье, урон и тип суперспособности и реализовать интерфейс HavingSuperAbility.
Создать 3 класса героев Magic, Medic, Warrior и наследовать их от класса Hero. В каждом классе по своему реализовать метод applySuperAbility(String superAbilityType) следующим образом - просто распечатать что то вроде того “Warrior применил суперспособность CRITICAL DAMAGE”.
В классе Main создать массив из 3х разных героев, затем через цикл применить суперспособность каждого героя
*/


package com.company;

public class Main {

    public static void main(String[] args) {

        String mas[] = new String[];
        mas[3] = mas {
            Warrior,} ;


        Hero medic = new Medic("CRITICAL HEALER ", 21);
        System.out.println(medic.info() + "Medic push CRITICAL HEALER");

        Hero magic = new Magic(12, "CRITICAL MAG");
        System.out.println(magic.info() + "Magic push CRITICAL DAMAGE");

        Hero warrior = new Warrior("CRITICAL DAMAGE ", 21);
        System.out.println(warrior.info() + "Warrior push CRITICAL DAMAGE");
    }
}
