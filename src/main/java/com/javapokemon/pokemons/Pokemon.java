package com.javapokemon.pokemons;
/**
 * Базовый класс наследник для всех покемонов.
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class Pokemon {
    /** Поле с именем покемона */
    private String name;
    /** Поле с уровнем покемона*/
    private int level;
    /** Поле с здоровьем покемона*/
    private int hp;



    public Pokemon(String name, int level){
        this.name = name;
        this.level = level;
        this.hp = 100;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
