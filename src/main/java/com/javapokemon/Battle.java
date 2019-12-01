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
        while (true){
            try {
                Thread.currentThread().sleep(1000);
                physialMove.attack(pokemonOne, pokemonTwo);
                if(pokemonOne.getHp() <=0){
                    System.out.println("Покемон 2 выйграл");
                    return;
                }
                physialMove.attack(pokemonTwo, pokemonOne);
                if(pokemonOne.getHp() <=0){
                    System.out.println("Покемон 1 выйграл");
                    return;
                }
            } catch (Exception e){
                System.out.println("Ошибка потока!");
            }


        }
    }

}
