package co.edu.utp.misiontic2021.c2;

import java.util.Scanner;

public class PromedioNotas {
    
// Paso a paso del algoritmo ->
    // 1- recoger informacion codigo del estudiante y 5 notas.
    // 2- identificar cual es la peor nota
    // 3 - hallar el promedio ajustado (descartar la peor de las notas)
    // 4 - realizar la conversion a escala 0 a 5
    // 5 - reportar el promedio con el formato indicado

    // Funciones que resulven el problema -> moduralizado
public static int obtenerPeorNota ( int nota1, int nota2, int nota3, int nota4, int nota5 ){
    // declarar variable
    int peorNota;
    // inicializar variable
    peorNota = nota1;

    // 2. comparación de notas una por una

    if (peorNota>nota2){

        peorNota = nota2;
    }

    if (peorNota > nota3){

        peorNota = nota3;
    }

    if (peorNota > nota4){

        peorNota = nota4;
    }

    if (peorNota > nota5){

        peorNota = nota5;
    }

    return peorNota;

}

// 3. Hallar el promedio ajustado (descartar la peor de las notas) -> ( 0 a 5 , decimal)

public static double calcularPromedioAjustado(int nota1, int nota2, int nota3, int nota4, int nota5){

    int peorNota = obtenerPeorNota(nota1, nota2, nota3, nota4, nota5);

    int sumatoria = 0;

    double promedioAjustado = 0;

    sumatoria = (nota1+nota2+nota3+nota4+nota5)-peorNota;

    promedioAjustado = (double) sumatoria/4;

    return promedioAjustado;

}

// 4. conversion de escala 0 a 5    

public static double convertirEscala ( double promedio100){
    return (promedio100/20);

    }

// 5. reportar el promedio con el formato indicado

    public static void reportarPromedioAjustado ( String codigo, double promedioAjustado){

        System.out.println("El promedio ajustado del estudiante " + codigo +" es: " + promedioAjustado);

}
    // Seccion principal para consumir estas funciones
 
    public static void main(String[] args) {

         // 1- recoger informacion codigo del estudiante y 5 notas.

        Scanner sc = new Scanner (System.in);
        System.out.print("Ingrese el codigo del estudiante: ");
        String codigoEstudiante = sc.nextLine();
        System.out.print("Ingrese la nota1: ");
        int nota1 = sc.nextInt();
        System.out.print("Ingrese la nota2: ");
        int nota2 = sc.nextInt();
        System.out.print("Ingrese la nota3: ");
        int nota3 = sc.nextInt();
        System.out.print("Ingrese la nota4: ");
        int nota4 = sc.nextInt();
        System.out.print("Ingrese la nota5: ");
        int nota5 = sc.nextInt();
        sc.close();

        // ejecutar las funciones

        double promedioAjustado = convertirEscala(calcularPromedioAjustado(nota1, nota2, nota3, nota4, nota5)) ;


        // reportar el resultado

        reportarPromedioAjustado(codigoEstudiante, promedioAjustado);



    }



}
