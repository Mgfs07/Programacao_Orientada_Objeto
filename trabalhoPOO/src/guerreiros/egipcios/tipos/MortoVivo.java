package guerreiros.egipcios.tipos;

import guerreiros.egipcios.Egipcios;

public class MortoVivo extends Egipcios {
    public MortoVivo(String nome, Integer idade, Integer peso) {
        super(nome, idade, peso);
    }

    @Override
    public void setDano(Integer dano) {
        super.setDano(5);
    }
}
