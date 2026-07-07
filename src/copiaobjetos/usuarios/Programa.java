package copiaobjetos.usuarios;

public class Programa {
    public static void main(String[] args) {
        PerfilUsuario normal = new PerfilRedeSocial("Thiago", "thi12lopes", "Machine Learning Engineer");
        normal.imprimir();
        System.out.println("Nome de `normal`: " + normal.getNome());
        System.out.println(
            ((PerfilRedeSocial) normal).getPerfil()
        );

        System.out.println("==================================================");

        PerfilUsuario anonimo = new PerfilAnonimo();
        anonimo.imprimir();
        System.out.println("Nome de `anonimo`: " + anonimo.getNome());
    }
}
