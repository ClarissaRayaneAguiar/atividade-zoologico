public class Main {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();

        zoo.adicionarAnimal(new Cachorro("Simba", 3, 12.5));
        zoo.adicionarAnimal(new Gato("Garfield", 2, 4.0));
        zoo.adicionarAnimal(new Passaro("Red", 1, 0.2));
        zoo.adicionarAnimal(new Peixe("Nemo", 1, 0.1));
        zoo.adicionarAnimal(new Pato("Donald", 4, 2.3));

        zoo.visitar();
    }
}