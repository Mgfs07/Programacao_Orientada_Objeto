import guerreiros.Guerreiro;
import guerreiros.atlantes.tipos.Argus;
import guerreiros.atlantes.tipos.Prometeano;
import guerreiros.atlantes.tipos.Satiro;
import guerreiros.egipcios.tipos.Anubita;
import guerreiros.egipcios.tipos.Mumia;
import guerreiros.grego.tipos.Ciclope;
import guerreiros.grego.tipos.Hidra;
import guerreiros.grego.tipos.LeaoNemeia;
import guerreiros.nordicos.tipos.LoboFenris;
import guerreiros.nordicos.tipos.Valquiria;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LeitorDeArquivo {

    public static List<Guerreiro> leitor(String path, Boolean lado1) throws IOException {
        List<Guerreiro> lista = new ArrayList<>();
        Path paths = Paths.get(path);
        Files.lines(paths).forEach(u -> lista.add(criarGuerreiro(separarFrase(u), lado1)));
        return lista;
    }

    private static Guerreiro criarGuerreiro(List<String> guerreiro, Boolean lado1) {
        Guerreiro tipoGuerreiro = null;
        if (lado1.equals(Boolean.TRUE)) {
            switch (Integer.parseInt(guerreiro.get(0))) {
                case 1:
                    tipoGuerreiro = new Ciclope(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 2:
                    tipoGuerreiro = new LeaoNemeia(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 3:
                    tipoGuerreiro = new Hidra(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 4:
                    tipoGuerreiro = new Valquiria(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 5:
                    tipoGuerreiro = new LoboFenris(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                default:
            }
        } else {
            switch (Integer.parseInt(guerreiro.get(0))) {
                case 1:
                    tipoGuerreiro =  new Prometeano(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 2:
                    tipoGuerreiro =  new Satiro(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 3:
                    tipoGuerreiro = new Argus(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 4:
                    tipoGuerreiro = new Anubita(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                case 5:
                    tipoGuerreiro = new Mumia(guerreiro.get(1), Integer.parseInt(guerreiro.get(2)), Integer.parseInt(guerreiro.get(3)));
                    break;
                default:
            }
        }
        return tipoGuerreiro;
    }

    private static List<String> separarFrase(String frase){
        String[] strings = frase.split(" ");
        return List.of(strings);
    }
}
