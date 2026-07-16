package padroesprojetosoftware.dispositivos;

public class Programa {
    public static void main(String[] args) {
        DispositivoInteligente lampada = new LampadaInteligente();
        DispositivoInteligente interruptor = new InterruptorInteligente();
        DispositivoInteligente tomada1 = new TomadaInteligente();
        DispositivoInteligente tomada2 = new TomadaInteligente();
        DispositivoInteligente tomada3 = new TomadaInteligente();

        Gerenciador app = new Gerenciador();
        app.adicionarDispositivo(lampada);
        app.adicionarDispositivo(interruptor);
        app.adicionarDispositivo(tomada1);
        app.adicionarDispositivo(tomada2);
        app.adicionarDispositivo(tomada3);

        app.obterEstados();
        System.out.println("=====");

        app.ligarTodosDispositivos();

        app.obterEstados();
        System.out.println("=====");

        app.desligarTodosDispositivos();
        
        app.obterEstados();
        System.out.println("=====");
    }
}
