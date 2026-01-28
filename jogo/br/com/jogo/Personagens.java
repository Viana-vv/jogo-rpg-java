package br.com.jogo;
public class Personagens {
private int vida;
private int poder;
private int segundoPoder;
private int terceiroPoder;


    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }


    public int getTerceiroPoder() {
        return terceiroPoder;
    }

    public void setTerceiroPoder(int terceiroPoder) {
        this.terceiroPoder = terceiroPoder;
    }

    public int getSegundoPoder() {
        return segundoPoder;
    }

    public void setSegundoPoder(int segundoPoder) {
        this.segundoPoder = segundoPoder;
    }

    public int getPoder() {
        return poder;
    }

    public void setPoder(int poder) {
        this.poder = poder;
    }
}
