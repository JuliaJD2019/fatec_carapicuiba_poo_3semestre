public class Carro{
    public String cor;
    public int velocidade;

    public Carro(String cor, int velocidade){
        setCor(cor);
        setVelocidade(velocidade);
    }

    public void acelerar() {
        this.velocidade += 1;
    
    }

    public void trocaDeCor(String cor) {
        setCor(cor);
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade= velocidade;
    }

    public String getCor() {
        return this.cor;
    }

    public int getvelocidade() {
        return this.velocidade;
    }
}