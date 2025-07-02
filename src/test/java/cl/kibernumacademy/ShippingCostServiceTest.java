package cl.kibernumacademy;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/*
 * Patrones AAA 
 */

@DisplayName("Tests para ShippingCostService")
public class ShippingCostServiceTest {
  private ShippingCostService shippingCostService;

  @BeforeEach
  void setUp() {
    shippingCostService = new ShippingCostService();
  }

  @Test
  @DisplayName("Arr <= 1KG, No Frágil ->Act, calcular -> Assert: $5")
  void paqueteLigeroNoFragil() {

    // Arrange: Preparando los datos de entrada
    double peso = 0.5;
    boolean fragil = false;
    double esperado = 5.0;

    // Act: Ejecutar la acción a probar
    double resultado = shippingCostService.calcularCosto(peso, fragil);

    // Assert: Verificar el resultado
    assertEquals(esperado, resultado, "Hasta 1kg sin fragilidad debe costar $5" );
  }


  @Test
  @DisplayName("Arr <= 1KG, No Frágil ->Act, calcular -> Assert: $5")
  void paqueteExacto1kgFragil() {

    // Arrange: Preparando los datos de entrada
    double peso = 1.0;
    boolean fragil = true;
    double esperado = 10.0;

    // Act: Ejecutar la acción a probar
    double resultado = shippingCostService.calcularCosto(peso, fragil);

    // Assert: Verificar el resultado
    assertEquals(esperado, resultado, "1kg con fragilidad debe costar $10" );
  }

}
