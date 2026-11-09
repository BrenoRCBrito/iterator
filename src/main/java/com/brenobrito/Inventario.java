package com.brenobrito;

import java.util.Iterator;

public class Inventario
{

  public static int contarTotal(Estufa estufa)
  {
    int quantidade = 0;
    for (Iterator<Muda> i = estufa.iterator(); i.hasNext(); )
    {
      i.next();
      quantidade++;
    }
    return quantidade;
  }

  public static int contarProntasParaPlantio(Estufa estufa)
  {
    int quantidade = 0;
    for (Muda muda : estufa)
    {
      if (muda.isProntaParaPlantio())
      {
        quantidade++;
      }
    }
    return quantidade;
  }

  public static int contarPorEspecie(Estufa estufa, String especie)
  {
    int quantidade = 0;
    for (Muda muda : estufa)
    {
      if (muda.getEspecie().equals(especie))
      {
        quantidade++;
      }
    }
    return quantidade;
  }
}
