package com.javapokemon;

import com.javapokemon.attack.PhysicalMove;
import com.javapokemon.attack.model.Move;
import com.javapokemon.pokemons.Pokemon;
/**
 * Класс битвы двух покемонов
 * @autor Виктор Самойленко
 * @version 0.1
 */
public class Battle {
    private Pokemon pokemonOne, pokemonTwo;
    private Move physialMove;

    public void addPokemon(Pokemon pokemonOne, Pokemon pokemonTwo){
        this.pokemonOne = pokemonOne;
        this.pokemonTwo = pokemonTwo;
    }

    public void go(){
        physialMove = new PhysicalMove();
        while (true) {
            try {
                System.out.println("HP1 " + pokemonOne.getHp());
                System.out.println("HP2 " + pokemonTwo.getHp());
                physialMove.attack(pokemonOne, pokemonTwo);
                if(pokemonTwo.getHp() <= 0) {
                    System.out.println("Pokemon one win");
                    break;
                }
                Thread.sleep(500);
                physialMove.attack(pokemonTwo, pokemonOne);
                if(pokemonOne.getHp() <= 0) {
                    System.out.println("Pokemon two win");
                    break;
                }
                Thread.sleep(500);
            } catch (Exception e){

            }

        }

    }

}
