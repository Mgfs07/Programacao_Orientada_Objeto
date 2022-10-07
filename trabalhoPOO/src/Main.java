import guerreiros.Guerreiro;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {

        String lado1 = "src/arquivos/lado1.txt";
        String lado2 = "src/arquivos/lado2.txt";

        List<Guerreiro> ld1 =  LeitorDeArquivo.leitor(lado2, false);
//        List<Guerreiro> ld2 =  LeitorDeArquivo.leitor(lado2, false);

        System.out.println(ld1);
//        LeitorDeArquivo.leitor(lado2);

//        List<Guerreiro> guerreiro =  new ArrayList<>();
//        Ciclope ciclope = new Ciclope("teste", 20, 20.50);
//        guerreiro.add(ciclope);
//        guerreiro.forEach(u -> u.ataque(guerreiro));
//        System.out.println(guerreiro.getClass());

    }
}