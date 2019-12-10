package com.javapokemon.pokemons;


import com.javapokemon.attack.model.Stat;

import java.util.Arrays;

/**
 * Базовый класс наследник для всех покемонов.
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class Pokemon {
    private String name;

    private double hp;

    private double attack;

    private double defense;

    /** скорость (speed) */
    private int speed;

    /** специальная атака (special attack) */
    private int specialAttack;

    /** специальная защита (special defense) */
    private int specialDefense;

    private int accuracy;
    private int evasion;
    private int[] baseStat;

    public Pokemon(String name){
        this.name = name;
        this.baseStat = new int[Stat.values().length];
    }

    public int[] getBaseStat() {
        return baseStat;
    }

    /** Устанавливает базовые значения характеристик покемона в виде натуральных чисел */
    public final void setStats(double hp, double attack, double defense){
        this.hp = hp;
        this.attack = attack;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }

    public double getAttack() {
        return attack;
    }

    public void setAttack(double attack) {
        this.attack = attack;
    }

    public double getDefense() {
        return defense;
    }

    public void setDefense(double defense) {
        this.defense = defense;
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "name='" + name + '\'' +
                ", hp=" + hp +
                ", attack=" + attack +
                ", defense=" + defense +
                '}';
    }
}
