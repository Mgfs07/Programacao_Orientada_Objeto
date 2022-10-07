package guerreiros.egipcios;

import guerreiros.Guerreiro;

import java.util.List;

public abstract class Egipcios extends Guerreiro {

    protected Egipcios(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        System.out.println("Um Egipsio esta atacando");
    }
}
