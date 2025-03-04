
package exer2;

public class Livro {
    
    public String titulo, autor, genero;
    public int anoPublicacao;
    
    public Livro(String titulo, String autor, String genero, int anoPublicacao){
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anoPublicacao = anoPublicacao;
}
    
    public void exibir(){
          System.out.println("Titulo: " + titulo);
          System.out.println("Autor: " + autor);
          System.out.println("Genero: " + genero);
          System.out.println("Ano de Publicação: " + anoPublicacao);
      }
    
    public String getTitulo(){
          return titulo; 
      }
    
    public void setTitulo(String titulo){
          this.titulo = titulo;
      }
    
    public String getAutor(){
          return autor; 
      }
    
    public void setAutor(String autor){
          this.autor = autor;
      }
    
    public int getAnoPublicacao(){
          return anoPublicacao; 
      }
    
    public void setAnoPublicacao(int anoPublicacao){
          this.anoPublicacao = anoPublicacao;
      }
    
    public boolean pertenceGenero(String generoDesejado){
        return this.genero.equalsIgnoreCase(generoDesejado);
    }
    
}
