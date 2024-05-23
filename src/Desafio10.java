import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Desafio10 {
  
  private List<Integer> numeros;

  public Desafio10(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public List<Integer> agruparMultiplosTresOuCinco() {
    return this.numeros.stream().filter( n -> (n % 2 ==0 &&  (n % 3 == 0 || n % 5 == 0))).collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Desafio10 lista = new Desafio10(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.agruparMultiplosTresOuCinco());
  }

}
