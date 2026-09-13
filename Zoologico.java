import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private List<Animal> animais = new ArrayList<>();

    public void adicionarAnimal(Animal animal) {
        this.animais.add(animal);
    }

    public void visitar() {
        for (Animal a : animais) {
            a.emitirSom();
            a.mover();

            // Desafio Extra (opcional)
            if (a instanceof Voador) {
                ((Voador) a).voar();
            }
            if (a instanceof Nadador) {
                ((Nadador) a).nadar();
            }
            System.out.println("-------------------");
        }
    }
}