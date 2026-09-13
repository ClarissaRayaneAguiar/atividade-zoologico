public class Cachorro extends Animal {
    public Cachorro(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz: Au Au");
    }

    @Override
    public void mover() {
        System.out.println(getNome() + " está correndo.");
    }
}

