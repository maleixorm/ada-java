public class funcoes {
    public static void main(String[] args) {
        saudacao("Marcos");
        int resultado = soma(4, 3);
        System.out.println(resultado);
    }

    public static void saudacao(String nome) {
        System.out.println("Hello, " + nome);
    }

    public static int soma(int a, int b) {
        return a+b;
    }
}
