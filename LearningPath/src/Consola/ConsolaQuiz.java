package Consola;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import LearningPath.Pregunta;
import Persistencia.CentralPersistenciaQuiz;

public class ConsolaQuiz {
	
	private Scanner entrada;
	

    public ConsolaQuiz() {
        entrada = new Scanner(System.in);
    }
    
    public List<Pregunta> mostrarMenu() {
    	
    	List<Pregunta> preguntas = new ArrayList<>();
    	
    	System.out.print("Ingrese el numero de preguntas del quiz: ");
        int numPreguntas = entrada.nextInt();
        entrada.nextLine();
        
        for(int i=1; i<=numPreguntas; i++) {
        	
        	System.out.println("Ingrese la pregunta #" + i + ": ");
        	String pregunta = entrada.nextLine();
        	List<String> opciones = new ArrayList<String>();
            for (int x=1; x<= 4; x++) {
                System.out.print("Ingrese la opcion " + x + " de la pregunta #" + i + ": ");
                String opcionPregunta = entrada.nextLine();
                opciones.add(opcionPregunta);  
            }
            System.out.println("Ingrese la opcion correcta(1, 2, 3 o 4) de la pregunta #" + i + ": ");
        	String respuesta = entrada.nextLine();
        	Pregunta nuevaPregunta = new Pregunta (pregunta, opciones, respuesta);
            preguntas.add(nuevaPregunta);
            
        	
        }
            
            
            return preguntas;
            
    }

}
