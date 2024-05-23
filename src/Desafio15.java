import java.util.Arrays;
import java.util.List;

public class Desafio15 {
  
  private List<Integer> numeros;

  public Desafio15(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Boolean verificaSeExisteNumeroNegativo() {
    return this.numeros.stream().anyMatch(n -> n < 0);
  }

  public static void main(String[] args) {
    Desafio15 lista = new Desafio15(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.verificaSeExisteNumeroNegativo());
  }

}
