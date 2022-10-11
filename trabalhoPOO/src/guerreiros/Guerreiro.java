package guerreiros;

import java.util.List;

public abstract class Guerreiro {

    private String nome;
    private Integer idade;
    private Integer peso;
    private Integer energia;
    private Integer dano;

    protected Guerreiro(String nome, Integer idade,
                        Integer peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        setEnergia(100);
        setDano(0);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Integer getPeso() {
        return peso;
    }

    public void setPeso(Integer peso) {
        this.peso = peso;
    }

    public Integer getEnergia() {
        return energia;
    }

    public void setEnergia(Integer energia) {
        this.energia = energia;
    }

    public Integer getDano() {
        return dano;
    }

    public void setDano(Integer dano) {
        this.dano = dano;
    }

    public static final Integer PRIMEIRA_POSICAO = 0;
    public static final Integer SEGUNDA_POSICAO = 1;
    public static final Integer TERCEIRA_POSICAO = 2;

    public void ataque(List<Guerreiro> ladoAliado, List<Guerreiro> ladoAdversario) {
        tirarEnergiaAdversario(ladoAdversario, PRIMEIRA_POSICAO);
        tirarEnergiaAdversario(ladoAliado, PRIMEIRA_POSICAO);
//        morte(ladoAdversario);
//        morte(ladoAliado);
    }

    public void tirarEnergiaAdversario(List<Guerreiro> ladoAtacado, Integer posicao) {
        ladoAtacado.get(posicao).setEnergia(ladoAtacado.get(posicao).getEnergia() - this.dano);
        morte(ladoAtacado, posicao);
    }


    public void enviarGuerreiroFinalFila(List<Guerreiro> lista, Guerreiro guerreiro) {
        lista.set(ultimoLista(lista), guerreiro);
        removerDaFila(lista, PRIMEIRA_POSICAO);
    }

    public void removerDaFila(List<Guerreiro> lista, Integer posicao) {
        lista.remove(lista.get(posicao));
    }

    public void morte(List<Guerreiro> lista, Integer posicao) {
        if (lista.get(posicao).getEnergia() <= 0) {
            removerDaFila(lista, posicao);
        }else{
            if(posicao.equals(PRIMEIRA_POSICAO)){
                enviarGuerreiroFinalFila(lista, lista.get(PRIMEIRA_POSICAO));
            }
        }
    }


    public Integer ultimoLista(List<Guerreiro> lista){
        return lista.size() - 1;
    }
}
