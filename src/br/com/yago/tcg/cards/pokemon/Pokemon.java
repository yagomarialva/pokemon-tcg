package br.com.yago.tcg.cards.pokemon;

import java.util.Objects;

public class Pokemon {
    private String nome;
    private String tipo;
    private String estagio;
    private String habilidade;

    public Pokemon(String nome, String tipo, String estagio, String habilidade) {
        this.nome = nome;
        this.tipo = tipo;
        this.estagio = estagio;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getEstagio() {
        return estagio;
    }

    public void setEstagio(String estagio) {
        this.estagio = estagio;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pokemon pokemon = (Pokemon) o;
        return Objects.equals(nome, pokemon.nome) && Objects.equals(tipo, pokemon.tipo)  && Objects.equals(estagio, pokemon.estagio) && Objects.equals(habilidade, pokemon.habilidade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, tipo, estagio, habilidade);
    }

    @Override
    public String toString() {
        return "Pokemon{" +
                "nome='" + nome + '\'' +
                ", tipo='" + tipo + '\'' +
                ", estagio='" + estagio + '\'' +
                ", habilidade='" + habilidade + '\'' +
                '}';
    }


}
