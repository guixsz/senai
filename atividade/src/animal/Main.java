package animal;

public class Main {
    public static void main(String[] args) {
        Gato gato = new Gato();
        Cachorro cachorro = new Cachorro();
        Pato pato =  new Pato();
        Galo galo = new Galo();
        
        gato.emitirSom();
        gato.comer();
        
        cachorro.emitirSom();
        cachorro.comer();
        
        galo.emitirSom();
        galo.comer();
        
        pato.emitirSom();
        pato.comer();
    }
}
