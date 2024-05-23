import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio13 {
  
  private List<Integer> numeros;

  public Desafio13(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public List<Integer> retornarNumeroIntervalo(Integer numeroInicial, Integer numeroFinal) {
    return this.numeros.stream().filter(n -> n >= numeroInicial && n <= numeroFinal).distinct().sorted().collect(Collectors.toList());
  }

  public static void main(String[] args) {
    Desafio13 lista = new Desafio13(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.retornarNumeroIntervalo(3, 10));
  }
}
