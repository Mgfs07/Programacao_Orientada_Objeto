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

    public void ataque(List<Guerreiro> ladoAliado , List<Guerreiro> ladoAdversario){
        ladoAdversario.get(0).setEnergia(getEnergia() - this.dano);
        enviarGuerreiroFinalFila(ladoAdversario, ladoAdversario.get(0));
        enviarGuerreiroFinalFila(ladoAliado, ladoAliado.get(0));
    }

    public void enviarGuerreiroFinalFila(List<Guerreiro> lista, Guerreiro guerreiro){
        lista.set(lista.size() - 1, guerreiro);
        removerDaFila(lista);
    }

    public void removerDaFila(List<Guerreiro> lista){
        lista.remove(lista.get(0));
    }
}
