package src.introducaopoo;

public class Operacoes {
    private int valorA;
    private int valorB;
    private int valorC;
    private int[] resultados = new int[100];
    private int n = 0;

    void setA(int a) {
        this.valorA = a;
    }

    void setB(int b) {
        this.valorB = b;
    }

    void setC(int c) {
        this.valorC = c;
    }

    int soma2() {
        int resultado = valorA + valorB;
        resultados[n++] = resultado;

        return resultado;
    }

    int soma3() {
        int resultado = valorA + valorB + valorC;
        resultados[n++] = resultado;

        return resultado;
    }

    int multiplica() {
        int resultado = valorA * valorB;
        resultados[n++] = resultado;

        return resultado;
    }

    int getMin() {
        int idxMin = 0;
        for (int i = 1; i < n; i++) {
            if (resultados[i] < resultados[idxMin]) {
                idxMin = i;
            }
        }

        return resultados[idxMin];
    }

    int getMax() {
        int idxMax = 0;
        for (int i = 1; i < n; i++) {
            if (resultados[i] > resultados[idxMax]) {
                idxMax = i;
            }
        }

        return resultados[idxMax];
    }

    public static void main(String[] args) {
        Operacoes op = new Operacoes();

        // Configurando valores iniciais
        op.setA(5);
        op.setB(10);
        op.setC(2);

        // Testando as operações
        System.out.println("Soma 2 (5 + 10): " + op.soma2()); // Esperado: 15
        System.out.println("Mínimo atual: " + op.getMin());   // Esperado: 15
        System.out.println("Máximo atual: " + op.getMax());   // Esperado: 15
        System.out.println("-------------------------");

        System.out.println("Soma 3 (5 + 10 + 2): " + op.soma3()); // Esperado: 17
        System.out.println("Mínimo atual: " + op.getMin());      // Esperado: 15
        System.out.println("Máximo atual: " + op.getMax());      // Esperado: 17
        System.out.println("-------------------------");

        System.out.println("Multiplica (5 * 10): " + op.multiplica()); // Esperado: 50
        System.out.println("Mínimo atual: " + op.getMin());          // Esperado: 15
        System.out.println("Máximo atual: " + op.getMax());          // Esperado: 50
        System.out.println("-------------------------");

        // Mudando valores para testar novos mínimos
        op.setA(-2);
        op.setB(3);
        System.out.println("Multiplica (-2 * 3): " + op.multiplica()); // Esperado: -6
        System.out.println("Mínimo final: " + op.getMin());           // Esperado: -6
        System.out.println("Máximo final: " + op.getMax());           // Esperado: 50
    }
}
