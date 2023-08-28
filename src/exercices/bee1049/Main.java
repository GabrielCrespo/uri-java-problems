package exercices.bee1049;

import java.io.IOException;
import java.util.Scanner;

public class Main {

  private static final String TIPO_ANIMAL_VERTEBRADO = "vertebrado";
  private static final String TIPO_ANIMAL_INVERTEBRADO = "invertebrado";

  private static final String TIPO_ANIMAL_AVE = "ave";
  private static final String TIPO_ANIMAL_MAMIFERO = "mamifero";
  private static final String TIPO_ANIMAL_INSETO = "inseto";
  private static final String TIPO_ANIMAL_ANELIDEO = "anelideo";

  private static final String TIPO_ANIMAL_CARNIVORO = "carnivoro";
  private static final String TIPO_ANIMAL_ONIVORO = "onivoro";
  private static final String TIPO_ANIMAL_HERBIVORO = "herbivoro";
  private static final String TIPO_ANIMAL_HEMATOFAGO = "hematofago";

  public static void main(String[] args) throws IOException {

    Scanner sc = new Scanner(System.in);

    String primeiroTipoDeAnimal = sc.next();
    String segundoTipoDeAnimal = sc.next();
    String terceiroTipoDeAnimal = sc.next();

    String resultadoTipoAnimal = defineTipodeAnimal(primeiroTipoDeAnimal, segundoTipoDeAnimal, terceiroTipoDeAnimal);
    System.out.println(resultadoTipoAnimal);

    sc.close();

  }

  private static String defineTipodeAnimal(String primeiroTipo, String segundoTipo, String terceiroTipo) {

    if (TIPO_ANIMAL_VERTEBRADO.equals(primeiroTipo)) {

      if (TIPO_ANIMAL_AVE.equals(segundoTipo) && TIPO_ANIMAL_CARNIVORO.equals(terceiroTipo)) {
        return "aguia";
      } else if (TIPO_ANIMAL_AVE.equals(segundoTipo) && TIPO_ANIMAL_ONIVORO.equals(terceiroTipo)) {
        return "pomba";
      } else if (TIPO_ANIMAL_MAMIFERO.equals(segundoTipo) && TIPO_ANIMAL_ONIVORO.equals(terceiroTipo)) {
        return "homem";
      } else if (TIPO_ANIMAL_MAMIFERO.equals(segundoTipo) && TIPO_ANIMAL_HERBIVORO.equals(terceiroTipo)) {
        return "vaca";
      }

    } else if (TIPO_ANIMAL_INVERTEBRADO.equals(primeiroTipo)) {
      if (TIPO_ANIMAL_INSETO.equals(segundoTipo) && TIPO_ANIMAL_HEMATOFAGO.equals(terceiroTipo)) {
        return "pulga";
      } else if (TIPO_ANIMAL_INSETO.equals(segundoTipo) && TIPO_ANIMAL_HERBIVORO.equals(terceiroTipo)) {
        return "lagarta";
      } else if (TIPO_ANIMAL_ANELIDEO.equals(segundoTipo) && TIPO_ANIMAL_HEMATOFAGO.equals(terceiroTipo)) {
        return "sanguessuga";
      } else if (TIPO_ANIMAL_ANELIDEO.equals(segundoTipo) && TIPO_ANIMAL_ONIVORO.equals(terceiroTipo)) {
        return "minhoca";
      }
    }

    return null;

  }

}