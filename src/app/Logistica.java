package app;

public class Logistica {
    public static void main (String[] args) {
        // Irá criar os transportes das fábricas
        FabricaTransporte fabricaCaminhao = new FabricaCaminhao();
        FabricaTransporte fabricaNavio = new FabricaNavio();
        // Irá criar os objetos dos transportes
        Transporte caminhao = fabricaCaminhao.criarTransporte();
        caminhao.entregar();

        Transporte navio = fabricaNavio.criarTransporte();
        navio.entregar();
    }
}
