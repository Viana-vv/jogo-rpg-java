package br.com.jogo;

public class Boss extends Personagens{
    private int semAcao;
    private int vida = 3000;
    private int poder = 200;
    private int segundoPoder = 200;
    private int terceiroPoder = 900;


    public void receberDano(int dano){
        this.vida -= dano;
    }

    public int getSemAcao() {
        return semAcao;
    }

    public void setSemAcao(int semAcao) {
        this.semAcao = semAcao;
    }

    @Override
    public int getVida() {
        return vida;
    }

    @Override
    public void setVida(int vida) {
        this.vida = vida;
    }

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public void setPoder(int poder) {
        this.poder = poder;
    }

    @Override
    public int getTerceiroPoder() {
        return terceiroPoder;
    }

    @Override
    public void setTerceiroPoder(int terceiroPoder) {
        this.terceiroPoder = terceiroPoder;
    }

    @Override
    public int getSegundoPoder() {
        return segundoPoder;
    }

    @Override
    public void setSegundoPoder(int segundoPoder) {
        this.segundoPoder = segundoPoder;
    }
}
