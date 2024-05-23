import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio4 {
  
  private List<Integer> numeros;

  public Desafio4(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public List<Integer> removerNumerosImpares() {
    this.numeros = this.numeros.stream().filter( n -> n % 2 == 0).collect(Collectors.toList());
    return this.numeros;
  }

  public static void main(String[] args) {
    Desafio4 lista = new Desafio4(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.removerNumerosImpares());
  }

}
