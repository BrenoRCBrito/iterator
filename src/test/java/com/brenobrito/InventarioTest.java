package com.brenobrito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class InventarioTest
{

  private Estufa estufa;

  @BeforeEach
  void encherAEstufa()
  {
    this.estufa = new Estufa();
    estufa.plantar(new Muda("Ipe", 45));
    estufa.plantar(new Muda("Ipe", 12));
    estufa.plantar(new Muda("Jacaranda", 30));
    estufa.plantar(new Muda("Jacaranda", 8));
    estufa.plantar(new Muda("Pau-brasil", 60));
  }

  @Test
  void deveContarTodasAsMudas()
  {
    assertEquals(5, Inventario.contarTotal(estufa));
  }

  @Test
  void deveContarApenasAsProntasParaPlantio()
  {
    assertEquals(3, Inventario.contarProntasParaPlantio(estufa));
  }

  @Test
  void deveConsiderarProntaAMudaExatamenteNoLimite()
  {
    assertTrue(new Muda("Jacaranda", 30).isProntaParaPlantio());
    assertFalse(new Muda("Jacaranda", 29).isProntaParaPlantio());
  }

  @Test
  void deveContarPorEspecie()
  {
    assertEquals(2, Inventario.contarPorEspecie(estufa, "Ipe"));
    assertEquals(1, Inventario.contarPorEspecie(estufa, "Pau-brasil"));
    assertEquals(0, Inventario.contarPorEspecie(estufa, "Cedro"));
  }

  @Test
  void deveContarZeroNaEstufaVazia()
  {
    assertEquals(0, Inventario.contarTotal(new Estufa()));
    assertEquals(0, Inventario.contarProntasParaPlantio(new Estufa()));
  }

  @Test
  void devePermitirPercorrerComForEach()
  {
    int quantidade = 0;
    for (Muda muda : estufa)
    {
      quantidade++;
    }

    assertEquals(5, quantidade);
  }

  @Test
  void deveEntregarUmIteradorNovoACadaPercurso()
  {
    assertEquals(Inventario.contarTotal(estufa), Inventario.contarTotal(estufa));
  }
}
