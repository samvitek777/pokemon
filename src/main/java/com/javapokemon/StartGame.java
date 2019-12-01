package com.javapokemon;

import com.javapokemon.pokemons.Pokemon;
/**
 * Старт игры
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class StartGame {
    public static void main(String[] args) {
        Pokemon p1 = new Pokemon("Vitka", 1);
        Pokemon p2 = new Pokemon("Anton", 1);

        Battle battle = new Battle();
        battle.addPokemon(p1, p2);
        battle.go();
    }
}
