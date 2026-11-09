package com.brenobrito;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Estufa implements Iterable<Muda>
{

  private final List<Muda> mudas = new ArrayList<>();

  public void plantar(Muda muda)
  {
    this.mudas.add(muda);
  }

  @Override
  public Iterator<Muda> iterator()
  {
    return this.mudas.iterator();
  }
}
