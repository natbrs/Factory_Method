package app;

public class Navio implements Transporte{
    // Irá sobrescrever o método "entregar()" para navio
    @Override
    public void entregar() {
        System.out.println("Entregando por navio...");
    }
}