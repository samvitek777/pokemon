package com.javapokemon.attack;

import com.javapokemon.attack.model.Move;
import com.javapokemon.pokemons.Pokemon;
/**
 * Класс физической атаки покемона
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class PhysicalMove implements Move {
    private Pokemon attPokemon;
    private Pokemon defPokemon;
    private int damage;

    public void attack(Pokemon att, Pokemon def) {
        damage = (int) (Math.random() * 10);
        System.out.println("Покемон с именем " + att.getName() + " нанес урон " +  def.getName() + " на " + damage + " единиц");
        def.setHp(def.getHp() - damage);
        System.out.println(def.getHp());
    }
}
