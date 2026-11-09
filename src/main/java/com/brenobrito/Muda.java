package com.brenobrito;

public class Muda
{

  private final String especie;

  private final int alturaCm;

  public Muda(String especie, int alturaCm)
  {
    this.especie = especie;
    this.alturaCm = alturaCm;
  }

  public String getEspecie()
  {
    return especie;
  }

  public int getAlturaCm()
  {
    return alturaCm;
  }

  public boolean isProntaParaPlantio()
  {
    return this.alturaCm >= 30;
  }
}
