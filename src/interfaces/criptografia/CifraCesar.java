package interfaces.criptografia;

public class CifraCesar implements Cifra {
    private int n;
    private char[] alfabeto = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm',
                                            'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    public CifraCesar(int nShifts) {
        this.n = nShifts;
    }

    private char shift(char c, int n) {
        int posicao = 0;
        for (int i = 0; i < alfabeto.length; i++) {
            if (alfabeto[i] == c) {
                posicao = i;
                break;
            }
        }

        if (n > 0) return alfabeto[(posicao + n) % 26];
        else if (n < 0) return alfabeto[(posicao + n + 26) % 26];
        return c;
    }

    @Override
    public String cifrar(String mensagem) {
        char[] mensagemCifrada = new char[mensagem.length()];
        for (int i = 0; i < mensagem.length(); i++) {
            char charAtual = mensagem.charAt(i);
            if (charAtual == ' ') mensagemCifrada[i] = ' ';
            else mensagemCifrada[i] = shift(charAtual, this.n);
        }
        return new String(mensagemCifrada);
    }

    @Override
    public String decifrar(String mensagem) {
        char[] mensagemDecifrada = new char[mensagem.length()];
        for (int i = 0; i < mensagem.length(); i++) {
            char charAtual = mensagem.charAt(i);
            if (charAtual == ' ') mensagemDecifrada[i] = ' ';
            else mensagemDecifrada[i] = shift(charAtual, -this.n);
        }
        return new String(mensagemDecifrada);
    }
}
