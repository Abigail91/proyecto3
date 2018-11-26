package com.NKSA.graph;

import java.util.ArrayList;
/**
 * 
 * @author NKSA
 *
 * @param <T>
 */

public class Vertex<T extends Comparable<T>> {
	
	/**
	 * Atributos de la clase
	 */
	private ArrayList<Edge> neighborhood;
	private Integer distance = Integer.MAX_VALUE;
	@SuppressWarnings("rawtypes")
	private Vertex previous;
	private T tag;
	
	
	/**
	 * Constructor que recibe un par�metro por el cual se le conocer� al v�rtice
	 * @param tag
	 */
	public Vertex(T tag) {
		this.tag = tag;
		this.neighborhood = new ArrayList<Edge>();	
	}
	
	
	
	/**
	 * M�todo que revisa que si no existe la arista que se le pasa como par�metro
	 * la agrega
	 * 
	 * @param edge
	 */
	public void insertNeighbor(Edge edge) {
		if(!this.neighborhood.contains(edge)) {
			this.neighborhood.add(edge);
		}
	}

	/**
	 * M�todo que retorna si la arista ya est� definida
	 * 
	 * @param edge
	 * @return
	 */
	public boolean containsNeighbor(Edge edge) {
		return this.neighborhood.contains(edge);
	}
	
	/**
	 * Getters y setters
	 */
	
	/**
	 * @param index
	 * @return
	 */
	public Edge getNeighbor(int index) {
		return this.neighborhood.get(index);
	}
	
	public Edge deleteNeighbor(int index) {
		return this.neighborhood.remove(index);
	}
	
	/**
	 * @param edge
	 */
	public void deleteNeighbor(Edge edge) {
		this.neighborhood.remove(edge);
	}
	
	public int getCountNeighbors() {
		return this.neighborhood.size();
	}
	
	public T getTag() {
		return this.tag;
	}
	
	
	
	/**
	 * M�todo que compara las etiquetas de 2 v�rtices
	 * 
	 * @param v2
	 * @return:
	 * 			true, si las etiquetas tienen el mismo valor, de lo contrario, false
	 */
	public boolean equals(Object v2) {
		if(!(v2 instanceof Vertex)) {
			return false;
		}
		@SuppressWarnings("unchecked")
		Vertex<T> v = (Vertex<T>) v2;
		return this.tag.equals(v.tag);
	}
	
	
	
	/**
	 * M�todo que devuelve el identificador del v�rtice como un string
	 * 
	 * @return:
	 * 			String que contiene la etiqueta con la que que se identifica el v�rtice
	 */
	public String toString() {
		return "Vertex: " + (String) this.tag;
	}
	
	/**
	 * M�todo que devuelve el valor del v�rtice
	 * @return
	 */
	public int hashCode() {
		return this.getTag().hashCode();
	}
	
	
	/**
	 * M�todo que devuelve la lista con los v�rtices o nodos adyacentes
	 * 
	 * @return:
	 * 			ArrayList con los v�rtices adyacentes
	 */
	public ArrayList<Edge> getNeighbors(){
		return this.neighborhood;
	}

	/**
	 * Getters y setters 
	 */ 


	public Integer getDistance() {
		return distance;
	}



	public void setDistance(Integer minDistance) {
		this.distance = minDistance;
	}



	@SuppressWarnings("rawtypes")
	public Vertex getPrevious() {
		return previous;
	}



	@SuppressWarnings("rawtypes")
	public void setPrevious(Vertex previous) {
		this.previous = previous;
	}

}
