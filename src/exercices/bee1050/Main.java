package exercices.bee1050;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws IOException {

    Scanner scanner = new Scanner(System.in);

    int codigoDDD = scanner.nextInt();

    Map<Integer, String> codigos = new HashMap<>();
    criarMapCodigosDDD(codigos);

    String resultado = codigos.getOrDefault(codigoDDD, "DDD nao cadastrado");
    System.out.println(resultado);
  
    scanner.close();
    
  }

  private static void criarMapCodigosDDD(Map<Integer, String> codigos) {

    codigos.put(61, "Brasilia");
    codigos.put(71, "Salvador");
    codigos.put(11, "Sao Paulo");
    codigos.put(21, "Rio de Janeiro");
    codigos.put(32, "Juiz de Fora");
    codigos.put(19, "Campinas");
    codigos.put(27, "Vitoria");
    codigos.put(31, "Belo Horizonte");

  }
  
}
