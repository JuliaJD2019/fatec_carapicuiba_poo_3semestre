public class TesteCarro {
    public static void main(String[] args) {
        int velocidade = 0;
        String corAzul = "Azul";
        String corVermelha = "Vermelho";
        Carro carroA = new Carro(corAzul,velocidade);
        Carro carroB = new Carro(corVermelha,velocidade);

        carroA.setCor(corAzul);
        carroA.setVelocidade(velocidade);
        carroA.trocaDeCor("Amarelo");
        System.out.println("a nova cor do carro A é: "+ carroA.getCor());

        carroB.setCor(corVermelha);
        carroB.setVelocidade(velocidade);
        carroB.trocaDeCor("Preto");
        System.out.println("a nova cor do carro B é: "+ carroB.getCor());
        
    }
}