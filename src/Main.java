//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    double resultado;
    Scanner scanner = new Scanner(System.in);

    // 1. Lectura de datos (Código Base compartido)
    System.out.print("Ingrese su peso en kg: ");
    double peso = scanner.nextDouble();

    System.out.print("Ingrese su estatura en metros (ej. 1.75): ");
    double estatura = scanner.nextDouble();
    System.out.println("\n--- RESULTADOS ---");

    double imc = calcularIMC(peso, estatura);
    System.out.printf("Su Índice de Masa Corporal (IMC) es: %.2f\n", imc);

    String clasificacion = clasificarIMC(imc);
    System.out.println("Clasificación: " + clasificacion);

    double pesoMinimo = calcularPesoMinimo(estatura);
    System.out.printf("Su peso mínimo saludable debería ser: %.2f kg\n", pesoMinimo);
}

public static double calcularIMC(double peso, double estatura) {
    return peso / (estatura * estatura);
}

public static String clasificarIMC(double imc) {
    if (imc < 18.5) {
        return "Bajo peso";
    } else if (imc >= 18.5 && imc < 25) {
        return "Normal (Saludable)";
    } else if (imc >= 25 && imc < 30) {
        return "Sobrepeso";
    } else {
        return "Obesidad";
    }
}

public static double calcularPesoMinimo(double estatura) {
    return 18.5 * (estatura * estatura);
}