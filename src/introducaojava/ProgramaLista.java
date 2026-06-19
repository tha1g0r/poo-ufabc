package introducaojava;

import java.util.Scanner;

public class ProgramaLista {
    public static int[] lerVetor(Scanner leitor) {
        int n = leitor.nextInt();

        int[] lista = new int[n];

        for (int i = 0; i < n; i++) {
            lista[i] = leitor.nextInt();
        }

        return lista;
    }

    public static void imprimirVetor(int[] vetor) {
        int n = vetor.length;

        for (int i = 0; i < n-1; i++) {
            System.out.printf("%d ", vetor[i]);
        }
        System.out.println(vetor[n-1]);
    }

    public static boolean inserir(int numero, int[] v) {
        int n = v.length;

        // 1. verificação de espaço
        if (v[n - 1] != -1) {
            return false;
        }

        // 2. busca pela posição
        int posicao = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] > numero || v[i] == -1) {
                posicao = i;
                break;
            }
        }

        // 3. deslocamento
        for (int i = n - 2; i >= posicao; i--) {
            v[i + 1] = v[i];
        }

        // 4. inserção
        v[posicao] = numero;

        return true;
    }
    
    public static boolean remover(int numero, int[] v) {
        int n = v.length;

        int posicao = 0;
        boolean retorno= false;
        for (int i = 0; i < n; i++) {
            if (v[i] == numero) {
                posicao = i;
                retorno = true;
                break;
            }
        }

        if (retorno) {
            for (int i = posicao; i < n - 1; i++) {
                v[i] = v[i + 1];
            }
            v[n - 1] = -1;
        }

        return retorno;
    }
    
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        // 1. lê o tipo de teste
        int teste = leitor.nextInt();

        // 2. lê o tamanho do vetor e preenche os elementos dele
        int[] vetor = lerVetor(leitor);

        // 3. imprime o tipo de teste e mostra a lista original
        if (teste == 1) {
            System.out.println("main");
        } if (teste == 2) {
            System.out.println("metodo");
        }
        imprimirVetor(vetor);

        // 4. lê o código da operação e o valor a ser usado
        int operacao = leitor.nextInt();
        int numero = leitor.nextInt();

        // 5. executa o método correspondente
        // 6. imprime o resultado da operação
        boolean resultado;
        switch (operacao) {
            case 1:
                resultado = inserir(numero, vetor);
                System.out.println("Inserir: " + resultado);
                break;
            case 2:
                resultado = remover(numero, vetor);
                System.out.println("Remover: " + resultado);
                break;
        }

        // 7. imprime como o vetor ficou no final
        imprimirVetor(vetor);

        leitor.close();
    }
}
