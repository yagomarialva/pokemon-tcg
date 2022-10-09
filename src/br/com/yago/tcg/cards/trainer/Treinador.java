package br.com.yago.tcg.cards.trainer;

import java.util.Objects;

public class Treinador {
    private String nome;
    private boolean usoUnico;
    private String efeito;

    public Treinador(String nome, boolean usoUnico, String efeito) {
        this.nome = nome;
        this.usoUnico = usoUnico;
        this.efeito = efeito;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isUsoUnico() {
        return usoUnico;
    }

    public void setUsoUnico(boolean usoUnico) {
        this.usoUnico = usoUnico;
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
        Treinador treinador = (Treinador) o;
        return usoUnico == treinador.usoUnico && Objects.equals(nome, treinador.nome) && Objects.equals(efeito, treinador.efeito);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, usoUnico, efeito);
    }

    @Override
    public String toString() {
        return "Treinador{" +
                "nome='" + nome + '\'' +
                ", usoUnico=" + usoUnico +
                ", efeito='" + efeito + '\'' +
                '}';
    }
}
