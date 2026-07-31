package tratamentoexcecoes.acesso;

import java.util.Scanner;

public class AutenticacaoUsuario {
    private static Usuario getUsuarioPeloLogin(String login, Usuario[] usuarios) {
        for (int i = 0; i < usuarios.length; i++) {
            Usuario usuarioAtual = usuarios[i];
            if (usuarioAtual.getLogin().equals(login)) return usuarioAtual;
        }

        return null;
    }

    public static void main(String[] args) throws SenhaInvalida, UsuarioBloqueado {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        Usuario[] usuarios = new Usuario[n];
        for (int i = 0; i < n; i++) {
            String login = scan.next();
            String senha = scan.next();
            usuarios[i] = new Usuario(login, senha);
        }

        int k = scan.nextInt();
        for (int i = 0; i < k; i++) {
            String login = scan.next();
            Usuario usuarioReferido = getUsuarioPeloLogin(login, usuarios);

            String senha = scan.next();
            
            try {
                usuarioReferido.autenticar(senha);

                System.out.println(usuarioReferido);
            } catch (SenhaInvalida e) {
                System.out.println(e);
            } catch (UsuarioBloqueado e) {
                System.out.println(e);
            }
        }

        scan.close();
    }
}
