package edu.dosw.lab.agilismo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reto3 {
    public static void main(String[] args) {
        List<Integer> listaTareasDefinidas = new ArrayList<>();
        List<Integer> listaComplejidad ;
        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el numero de integrantes tiene su equipo: ");
        Integer cantidadIntegrantes = input.nextInt();
        System.out.println("Escriba la cantidad de tareas que desea discutir: ");
        Integer cantidadTareas = input.nextInt();
        input.nextLine();
        for (int i = 1; i <= cantidadTareas; i++) {
            listaComplejidad = new ArrayList<>();
            System.out.println("Escriba el nombre de la tarea "+i+": ");
            String nombreTarea = input.nextLine();
            for (int j = 1; j <= cantidadIntegrantes; j++) {
                System.out.println("Miembro "+j);
                System.out.println("Escriba el numero de la complejidad de la tarea "+nombreTarea);
                Integer complejidad = input.nextInt();
                listaComplejidad.add(complejidad);
                if (listaComplejidad.size()==cantidadIntegrantes) {
                    if (listaComplejidad.stream().distinct().count() == 1){
                        System.out.println("Se logro un consenso sobre la tarea "+nombreTarea+" se definio con una complejidad de "+ complejidad);
                        listaTareasDefinidas.add(complejidad);
                    }
                    else{
                        j=1;
                        System.out.println("Votos divergentes  Discutan y vuelvan a votar");
                    }
                }
            }
        }
    }
}
