public class Pato extends Animal implements Nadador, Voador {
    public Pato(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Quack Quack");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está andando no lago.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando na superfície.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando baixo.");
    }
}