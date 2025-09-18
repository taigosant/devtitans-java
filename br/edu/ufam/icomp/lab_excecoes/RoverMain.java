package br.edu.ufam.icomp.lab_excecoes;

public class RoverMain {
  public static void main(String[] args) {

    Caminho caminho = new Caminho(6);
    try {
      // Teste 1: Coordenada com valor negativo
      // Coordenada coord1 = new Coordenada(-1, 5, 0);
      Coordenada coord2 = new Coordenada(3, 4, 0);
      Coordenada coord3 = new Coordenada(2, 2, 0);
      Coordenada coord4 = new Coordenada(1, 1, 0);
      Coordenada coord5 = new Coordenada(0, 0, 0);
      Coordenada coord6 = new Coordenada(10, 10, 0);
      System.out.println("Coordenadas criadas com sucesso.");

      caminho.addCoordenada(coord2);
      caminho.addCoordenada(coord3);
      caminho.addCoordenada(coord4);
      caminho.addCoordenada(coord5);
      caminho.addCoordenada(coord6);

      // caminho.addCoordenada(coord1);

    } catch (RoverException e) {
      System.out.println("Exceção geral de rover capturada: " + e.getMessage());
      caminho.reset();
    } finally {
      System.out.println("Execução finalizada.");

      System.out.println(caminho.toString());
    }
  }
}
