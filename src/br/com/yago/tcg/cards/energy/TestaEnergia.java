package br.com.yago.tcg.cards.energy;

public class TestaEnergia {
    public static void main(String[] args) {
        Energia energia = new Energia("básica", "agua");
        System.out.println(energia);

        EnergiaEspecial energiaDupla = new EnergiaEspecial("especial", "incolor", "Adiciona duas energias");
        System.out.println(energiaDupla);
    }
}
