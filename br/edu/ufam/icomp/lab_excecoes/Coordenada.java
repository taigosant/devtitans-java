package br.edu.ufam.icomp.lab_excecoes;

public class Coordenada {
  private int posX;
  private int posY;
  private int digito;

  public Coordenada(int posX, int posY, int digito)
      throws CoordenadaNegativaException, CoordenadaForaDosLimitesException, DigitoInvalidoException {
    // 1. Check for negative coordinates
    if (posX < 0 || posY < 0)
      throw new CoordenadaNegativaException("Coordenada negativa: posX=" + posX + ", posY=" + posY);

    // 2. Check for coordinates out of [0, 30000]
    if (posX > 30000 || posY > 30000)
      throw new CoordenadaForaDosLimitesException("Coordenada fora dos limites: posX=" + posX + ", posY=" + posY);

    // 3. Check for invalid digit
    int soma = posX + posY;
    if (digito < 0 || digito > 9 || (soma % 10 != digito))
      throw new DigitoInvalidoException("Dígito inválido: esperado " + (soma % 10) + ", recebido " + digito);

    this.posX = posX;
    this.posY = posY;
    this.digito = digito;
  }

  public int getPosX() {
    return posX;
  }

  public int getPosY() {
    return posY;
  }

  public double distancia(Coordenada coordenada) {
    int dx = this.posX - coordenada.getPosX();
    int dy = this.posY - coordenada.getPosY();
    return Math.sqrt(dx * dx + dy * dy);
  }

  @Override
  public String toString() {
    return posX + ", " + posY;
  }
}
