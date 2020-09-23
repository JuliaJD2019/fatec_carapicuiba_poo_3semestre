public class TesteImpressora {
  public static void main(String[] args) {
    Impressora impressora = new Impressora();
    System.out.println("Testando sobrecarga");
    System.out.println("Um float:");
    impressora.exibir(17.5f);
    System.out.println("Dois float:");
    impressora.exibir(16.4f, 1231.5f);
    System.out.println("Um float e um texto:");
    impressora.exibir(1.5f, "texto");
    System.out.println("Um texto e um float:");
    impressora.exibir("texto", 1.5f);
    System.out.println("Três Strings:");
    impressora.exibir("texto", "é um", "teste");
    System.out.println("Dois ints e uma string:");
    impressora.exibir(1, 2, "três");
  }
}