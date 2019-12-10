package com.javapokemon;

import com.javapokemon.pokemons.Charmander;
import com.javapokemon.pokemons.Pikachu;
import com.javapokemon.pokemons.Pokemon;
/**
 * Старт игры
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class StartGame {
    public static void main(String[] args) {
        Pokemon charmander = new Charmander("loh");
        Pokemon pikachu = new Pikachu("lohtwo");
        Battle battle = new Battle();
        battle.addPokemon(charmander, pikachu);
        battle.go();
    }
}
