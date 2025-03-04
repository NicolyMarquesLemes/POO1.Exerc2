
package exer3;

public class Produto {
     public String nome;
     public double preco;
     public int quantidade;
     
     public Produto(String nome, double preco){
         this.nome = nome;
          this.preco = preco;
          this.quantidade = 0;
        
     }
     
      public void exibir(){
          System.out.println("Nome: " + nome);
          System.out.println("Preço: " + preco);
          System.out.println("Quantidade: " + quantidade);
      }
      
      public String getNome(){
          return nome; 
      }
      
      public void setNome(String nome){
          this.nome = nome;
      }
      
      public double getPreco(){
          return preco; 
      }
      
      public void setPreco(double preco){
          this.preco = preco;
      }
      
      public int getQuantidade(){
          return quantidade; 
      }
      
       public void setQuantidade(int quantidade){
          this.quantidade += quantidade;
          if(this.quantidade < 0){
              this.quantidade -= quantidade;
          }
              
      }
}


