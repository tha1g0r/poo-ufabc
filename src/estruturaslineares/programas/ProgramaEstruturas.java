package estruturaslineares.programas;

import estruturaslineares.estruturas.*;

public class ProgramaEstruturas {
    public static void main(String[] args) {
        Conjunto conj1 = new Conjunto();
        conj1.adicionar(2);
        conj1.adicionar(9);
        conj1.adicionar(1);
        System.out.println(conj1);

        Conjunto conj2 = new Conjunto();
        conj2.adicionar(3);
        conj2.adicionar(8);
        conj2.adicionar(9);
        conj2.adicionar(5);
        System.out.println(conj2);

        System.out.println(conj1.uniao(conj2));

        Conjunto conj3 = new Conjunto();
        conj3.adicionar(1);
        conj3.adicionar(8);
        conj3.adicionar(9);
        conj3.adicionar(5);
        System.out.println(conj3);

        System.out.println(conj1.intersecao(conj3));
    }
}
