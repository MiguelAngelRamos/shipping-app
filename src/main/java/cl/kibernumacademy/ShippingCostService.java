package cl.kibernumacademy;

/*
 * Servicio que calcula el costo de envió 
 * según el peso del paquete  y si es frágil
 */
public class ShippingCostService {
  
  public double calcularCosto(double peso, boolean fragil) {
    double tarifaBase;
    // - Paquetes hasta 1 kg: tarifa base $5
    // - Paquetes mayores de 1 kg y hasta 5 kg: tarifa base $10
    //- Paquetes mayores de 5 kg: tarifa base $20
    if(peso <= 1.0) {
      tarifaBase = 5.0;
    } else if (peso <= 5.0) {
      tarifaBase = 10.0;
    } else {
      tarifaBase = 20.0;
    }
  // Si el paquete es frágil, se añade un recargo de $5 extra.
    return fragil ? tarifaBase + 5.0 : tarifaBase;
  }
}
