package br.com.dio;

import br.com.dio.model.Gato;
import br.com.dio.model.Livro;

public class PrimeiroPrograma {
    public static void main(String[] args) {

        Gato gato = new Gato();
        System.out.println(gato);

        Livro livro = new Livro("Iniciando em Java", 575);
        System.out.println(livro);

        Livro livro1 = new Livro("Iniciando em JavaScript", 482);
        System.out.println(livro1);


        /*int a = 13;
        double b = 2.6;
        System.out.println("Olá Mundo Intellij " + (b + a));*/
    }
}