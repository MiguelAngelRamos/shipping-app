## Ejercicio: Servicio de Cálculo de Envío

Caso de uso: una tienda en línea necesita calcular el costo de envío según el peso del paquete y si el contenido es frágil.

- Paquetes hasta 1 kg: tarifa base $5

- Paquetes mayores de 1 kg y hasta 5 kg: tarifa base $10

- Paquetes mayores de 5 kg: tarifa base $20

Si el paquete es frágil, se añade un recargo de $5 extra.

3 rangos pesos 
2 posible de fragilidad

3x2 = 6

1. Peso <= 1k, no fragil
2. Peso = 1kg, Fragil
3. 1kg < peso  < 5kg, no fragil
4. Peso = 5kg, Fragil
5. Peso > 5kg, no fragil
6. Peso > 5kg, fragil