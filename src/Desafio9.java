import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Desafio9 {
  

  private List<Integer> numeros;

  public Desafio9(List<Integer> numeros) {
    this.numeros = numeros;
  }

  public List<Integer> getNumeros() {
    return numeros;
  }
  
  public Boolean verificaSeExistemRepetidos() {
    var listaSemRepetidos = this.numeros.stream().distinct();
    return listaSemRepetidos.count() != this.numeros.size();
  }

  public Set<Integer> exibeNumerosRepetidos() {
    Set<Integer> numerosUnicos = new HashSet<>();
    Set<Integer> numerosRepetidos = this.numeros.stream().filter( n -> !numerosUnicos.add(n)).collect(Collectors.toSet());
    return numerosRepetidos;
  }

  public static void main(String[] args) {
    Desafio9 lista = new Desafio9(Arrays.asList(1, 2, 3, 4, -5, 6, 7, 8, 9, 10, 5, 4, 3));
    
    if(lista.verificaSeExistemRepetidos()) {
      System.out.println(lista.exibeNumerosRepetidos());
    }
  }

}
