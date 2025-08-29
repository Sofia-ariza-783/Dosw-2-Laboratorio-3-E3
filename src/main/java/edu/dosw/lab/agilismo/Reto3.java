package edu.dosw.lab.agilismo;

import java.util.*;

public class Reto3 {
    private static Scanner input = new Scanner(System.in);

    public static void run() {
        HashMap<String, Integer> tareasDefinidas = new HashMap<>();
        List<Integer> listaComplejidad;

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
                        tareasDefinidas.put(nombreTarea,complejidad);
                    }
                    else{
                        j=0;
                        System.out.println("Votos divergentes  Discutan y vuelvan a votar");
                    }
                    listaComplejidad.clear();
                }
                input.nextLine();
            }
        }

        System.out.println("------------ Resumen Planning poker ------------\n");
        for (Map.Entry<String, Integer> e : tareasDefinidas.entrySet()) {
            System.out.println("La tarea "+ e.getKey()+ " se definio con una complejidad de "+ e.getValue()+"\n");
        }
    }
}
