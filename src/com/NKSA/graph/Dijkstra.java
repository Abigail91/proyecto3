package com.NKSA.graph;

import java.util.ArrayList;
/**
 * 
 * @author NKSA
 *
 * @param <T>
 */
public class Dijkstra<T> {
	/**
	 * Atributo
	 */
	private ArrayList<T> shortestPath = new ArrayList<>();
	
	/**
	 * Método encargado de calcular la distancia más corta entre 2 nodos, así como el camino
	 * @param source
	 * 				: nodo del que se parte
	 * @param target
	 * 				: nodo destino
	 */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public void computePaths(Vertex source, Vertex target)
    {
        source.setDistance(0);
        ArrayList<Vertex> nonVisited = new ArrayList<>();
        ArrayList<Vertex> visited = new ArrayList<>();
        source.setPrevious(null);
        nonVisited.add(source);

        
        while(nonVisited.size() > 0) {
        	Vertex temp = nonVisited.get(0);
        	if(temp.getCountNeighbors() != 0) {
        		for(int i = 0; i < temp.getCountNeighbors(); i++) {
            		Vertex temp1 = temp.getNeighbor(i).getNeighborOf(temp);
            		Integer weight = (temp.getNeighbor(i).getWeight() != 0 ? temp.getNeighbor(i).getWeight() : 100);
            		Integer distance = ((temp.getDistance()!= Integer.MAX_VALUE && (temp.equals(source) ? temp.getDistance() >= 0 : temp.getDistance() > 0 )) ? temp.getDistance() + weight : weight);
            		if(distance < temp1.getDistance()) {
            			temp1.setDistance(distance);
            			temp1.setPrevious(temp);

            		}
            		if(!isInList(nonVisited, visited, temp1)) {
            			nonVisited.add(temp1);
            		}
            	}
        	}
        	nonVisited.remove(0);
        	visited.add(temp);
        }
        for(int i = 0; i < visited.size(); i++) {
        	if(visited.get(i).equals(target)) {
        		Vertex temp1 = visited.get(i);
        		while(temp1 != null) {
        			shortestPath.add((T) temp1.getTag());
        			temp1 = temp1.getPrevious();
        		}
        		shortestPath = reverseList(shortestPath);
        	}
        }
    }
    
    /**
     * Método encargado de comprobar si el elemento se encuentra en alguna de las 2 listas 
     * @param list
     * @param list2
     * @param element
     * @return:
     * 		  true, si el elemento está
     * 		  false, si no
     */
    @SuppressWarnings({ "rawtypes" })
	private boolean isInList(ArrayList<Vertex> list, ArrayList<Vertex> list2, Vertex element) {
		if(list == null && list2 == null) {
			return false;
		}else {
			for(int i = 0; i < list.size(); i++) {
				if(list.get(i).equals(element)) {
					return true;
				}
			}
			for(int i = 0; i < list2.size(); i++) {
				if(list2.get(i).equals(element)) {
					return true;
				}
			}
			return false;
		}
	}
    
    /**
     * Método para revertir el orden de una lista
     * @param list
     * @return:
     * 		   lista revertirda
     */
	private ArrayList<T> reverseList(ArrayList<T> list) {
    	ArrayList<T> reverseL = new ArrayList<>();
    	for(int i= list.size()-1; i > -1; i--) {
    		reverseL.add(list.get(i));
    	}
    	return reverseL;
    }
	
	/**
	 * Getter
	 * @return:
	 * 		    ArrayList<T> que contiene las etiquetas de los vértices que forman el camino más corto
	 */
	public ArrayList<T> getShortestPath() {
		return shortestPath;
	}
}