import java.util.Arrays;
import java.util.List;

public class Desafio18 {
  
  private List<Integer> numeros;

  public Desafio18(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Boolean verificaTodosIguais() {
    return this.numeros.stream().distinct().count() <= 1;
  }

  public static void main(String[] args) {
    Desafio18 lista = new Desafio18(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    System.out.println(lista.verificaTodosIguais());
  }

}
