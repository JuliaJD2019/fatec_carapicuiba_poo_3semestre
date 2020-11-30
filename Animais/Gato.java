package Animais;

public class Gato extends Mamifero {
    public Gato(String nome) {
        super(nome, 4);
        System.out.printf("Oi sou um Gato, meu nome é %s%n", nome);
    }
}