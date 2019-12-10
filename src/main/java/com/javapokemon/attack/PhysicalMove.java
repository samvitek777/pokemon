package com.javapokemon.attack;

import com.javapokemon.attack.model.Move;
import com.javapokemon.attack.model.Stat;
import com.javapokemon.pokemons.Pokemon;
/**
 * Класс физической атаки покемона
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class PhysicalMove implements Move {
    private Pokemon attPokemon;
    private Pokemon defPokemon;
    private double damage;

    public void attack(Pokemon att, Pokemon def) {
        this.damage = (Math.random() * 6) * (def.getDefense() / att.getAttack());
        System.out.println("Pokemon " + att.getName() + " damage " + damage);
        def.setHp(def.getHp() - damage );

    }
}
