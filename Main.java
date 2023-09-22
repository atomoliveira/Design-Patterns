public class Fila {
//instancia unica armazena  uma variavel estaica privada 
  private static Fila instancia;


  //Contrutor privado para que evita a criação de instancias fora da classe
  private Fila () {
    //Inicialize aqui, se necessario

    
  }
  //Metodo estatico para obter a instancia unica 
   public static Fila getInstance() {

     //Lazy initiilization: cria  a instancia apenas quando necessario
     if (instancia == null){
       instancia = new Fila ();
      }
     return instancia;
   }
}