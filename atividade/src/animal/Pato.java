package animal;

public class Pato implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Quack quack");
    }

    @Override
    public void comer() {
        System.out.println("Pato comendo");
    }
    
}
