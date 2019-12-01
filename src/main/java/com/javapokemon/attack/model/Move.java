package com.javapokemon.attack.model;

import com.javapokemon.pokemons.Pokemon;
/**
 * Интерфейс для описания атак покемона
 * @autor Виктор Самойленко
 * @version 0.1
 */
public interface Move {
    void attack(Pokemon att, Pokemon def);
}
