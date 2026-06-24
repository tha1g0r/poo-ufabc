package interfaces.criptografia;

public class ZenitPolar implements Cifra {
    @Override
    public String cifrar(String mensagem) {
        String mensagemCifrada = "";
        for (int i = 0; i < mensagem.length(); i++) {
            char charAtual = mensagem.charAt(i);
            switch (charAtual) {
                // ZENIT -> POLAR
                case 'z': mensagemCifrada += 'p'; break;
                case 'e': mensagemCifrada += 'o'; break;
                case 'n': mensagemCifrada += 'l'; break;
                case 'i': mensagemCifrada += 'a'; break;
                case 't': mensagemCifrada += 'r'; break;
                // POLAR -> ZENIT
                case 'p': mensagemCifrada += 'z'; break;
                case 'o': mensagemCifrada += 'e'; break;
                case 'l': mensagemCifrada += 'n'; break;
                case 'a': mensagemCifrada += 'i'; break;
                case 'r': mensagemCifrada += 't'; break;

                default: mensagemCifrada += charAtual; break;
            }
        }

        return mensagemCifrada;
    }

    @Override
    public String decifrar(String mensagem) {
        return cifrar(mensagem);
    }
}
