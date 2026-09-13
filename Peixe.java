public class Peixe extends Animal implements Nadador {
    public Peixe(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Glub Glub");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está se movendo na água.");
    }

    @Override
    public void nadar() {
        System.out.println(getNome() + " está nadando nas profundezas.");
    }
}