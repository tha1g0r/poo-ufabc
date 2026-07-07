package copiaobjetos.multimidia;

public class Programa {
    public static void main(String[] args) {
        ArquivoMultimidia video = new ArquivoVideo("aniversario.mp4", 16, 9);
        System.out.println(video);

        ArquivoMultimidia audio = new ArquivoAudio("antigas_luan_santana.mp3", false);
        System.out.println(audio);
    }
}
