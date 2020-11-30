package Animais;

public class Cachorro extends Mamifero {
    public Cachorro(String nome) {
        super(nome, 4);
        System.out.printf("Oi, sou um Cachorro, meu nome é %s%n", nome);
    }
}