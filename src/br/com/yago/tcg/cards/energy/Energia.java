package br.com.yago.tcg.cards.energy;

import java.util.Objects;

public class Energia {
    private String tipo;
    private String elemento;

    public Energia(String tipo, String elemento) {
        this.tipo = tipo;
        this.elemento = elemento;
    }

    public String getElemento() {
        return elemento;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Energia{" +
                "tipo='" + tipo + '\'' +
                ", elemento='" + elemento + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Energia energia = (Energia) o;
        return Objects.equals(tipo, energia.tipo) && Objects.equals(elemento, energia.elemento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tipo, elemento);
    }
}
