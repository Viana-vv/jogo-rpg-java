package br.com.jogo;

public class Heroi extends Personagens {
    private int cura = 500;
    private int vida = 1000;
    private int poder = 250;
    private int segundoPoder = 250;
    private int terceiroPoder = 500;


    public void aplicarCura() {
        this.vida += this.cura;
    }

    public void receberDano(int dano){
        this.vida -= dano;
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

    @Override
    public int getPoder() {
        return poder;
    }

    @Override
    public void setPoder(int poder) {
        this.poder = poder;
    }
}
