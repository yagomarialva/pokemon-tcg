package br.com.yago.tcg.cards.energy;

import java.util.Objects;

public class EnergiaEspecial extends Energia {

    private String efeito;


    public EnergiaEspecial(String tipo, String elemento, String efeito) {
        super(tipo, elemento);
        this.efeito = efeito;
    }

    public String getEfeito() {
        return efeito;
    }

    public void setEfeito(String efeito) {
        this.efeito = efeito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        EnergiaEspecial that = (EnergiaEspecial) o;
        return Objects.equals(efeito, that.efeito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), efeito);
    }

    @Override
    public String toString() {
        return "EnergiaEspecial{" +
                "efeito='" + efeito + '\'' +
                '}';
    }
}
