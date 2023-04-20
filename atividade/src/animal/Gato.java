package animal;

public class Gato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }

    @Override
    public void comer() {
        System.out.println("Gato comendo");
    }
    
}
