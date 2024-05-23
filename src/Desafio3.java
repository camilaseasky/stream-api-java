import java.util.Arrays;
import java.util.List;

public class Desafio3 {
  
  private List<Integer> numeros;

  public Desafio3(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Boolean verificarTodosNumerosPositivos() {
  
    return this.numeros.stream().filter( n -> n >= 0).count() == this.numeros.size();
  }

  public static void main(String[] args) {
    Desafio3 lista = new Desafio3(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.verificarTodosNumerosPositivos());
  }
}
