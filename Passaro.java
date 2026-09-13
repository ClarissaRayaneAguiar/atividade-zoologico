public class Passaro extends Animal implements Voador {
    public Passaro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Piu Piu");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está se movendo.");
    }

    @Override
    public void voar() {
        System.out.println(getNome() + " está voando pelo céu.");
    }
}