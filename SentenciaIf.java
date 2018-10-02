public class SentenciaIf {
  public static void main(String[] args) {
    String linea;
    
    System.out.println("Le voy a decir que si el numero introducido es par o impar.");
    System.out.println("Introduzca el numero:");
    
    linea = System.console().readLine();
    int numero = Integer.parseInt(linea);
    
    if( (numero%2) == 0) {
      System.out.printf("El numero %d es par.\n",numero);
      } else {
      System.out.printf("El numero %d es impar.\n",numero);
  }
 } 
}
