import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Desafio14 {
  
  private List<Integer> numeros;

  public Desafio14(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Optional<Integer> maiorNumeroPrimo() {
    return this.numeros.stream().filter( n -> Desafio14.isPrime(n)).max(Integer::compareTo);
  }

  public static boolean isPrime(int num) {
    if (num <= 1) {
        return false;
    }
    for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
            return false;
        }
    }
    return true;
  }

  public static void main(String[] args) {
    Desafio14 lista = new Desafio14(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3, 13));
    System.out.println(lista.maiorNumeroPrimo().get());
  }

}
