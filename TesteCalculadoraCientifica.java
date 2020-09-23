public class TesteCalculadoraCientifica {
    public static void main(String[] args) {
        CalculadoraCientifica calc = new CalculadoraCientifica();
        byte byte1 = 5;
        byte byte2 = 3; 
        System.out.println("Testando a Calculadora cientifica");
        System.out.println("Raiz do 49: "+ calc.raiz(49));
        System.out.println("Raiz do 60.2: "+calc.raiz(60.2));
        System.out.println("Raiz do '10.5': "+calc.raiz("10.5"));
        System.out.println("Potencia de 5 elevado a 3: "+calc.potencia(byte1,byte2));
        System.out.println("Potencia de 2 elevado a 6: "+calc.potencia("2", "6"));
        System.out.println("Potencia de 1 elevado a 5.3: "+calc.potencia(1, 5.3));
    }
}