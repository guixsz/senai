package animal;

public class Cachorro implements Animal{

    @Override
    public void emitirSom() {
        System.out.println("Auau"); 
    }

    @Override
    public void comer() {
        System.out.println("Cachorro comendo");
    }
    
}
