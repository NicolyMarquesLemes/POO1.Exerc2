
package exer2;

public class Exer2 {

    public static void main(String[] args) {
        Livro objLivro1 = new Livro("O que é o amor?", "Betty Milan", "Romance", 2018 );
       objLivro1.exibir();
        System.out.println("O genero procurado é o mesmo do livro? " + objLivro1.pertenceGenero("Aventura"));
    }
    
}
