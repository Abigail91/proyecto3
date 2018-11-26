package com.NKSA.graph;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 
 * @author NKSA
 *
 * @param <T>
 */
public class Graph<T extends Comparable<T>> {
	
	/**
	 * Atributos de la clase
	 */
	@SuppressWarnings("rawtypes")
	private HashMap<T, Vertex> vertex;
	private HashMap<Integer, Edge> edge;
	private ArrayList<ArrayList<T>> adjMatrix = new ArrayList<>();
	private ArrayList<Edge> edges = new ArrayList<>();
	@SuppressWarnings("rawtypes")
	private ArrayList<Vertex> vertexes = new ArrayList<>();
	@SuppressWarnings("rawtypes")
	private ArrayList<Vertex> vertexes1 = new ArrayList<>();
	private ArrayList<Integer> weights = new ArrayList<>();
	
    /**
     * Constructor de la clase por defecto
     */
    @SuppressWarnings({ "rawtypes", "unchecked" })
	public Graph(ArrayList<T> list, ArrayList<T> relation) {
		this.vertex = new HashMap<T, Vertex>();
    	this.edge = new HashMap<Integer, Edge>();
    	Integer posTag1 = 0;
    	Integer posTag2 = 0;
    	
    	for(int i = 0; i < 30; i++) {
    		Vertex v = new Vertex(list.get(i));
    		this.vertexes1.add(v);
    		this.vertex.put((T) v.getTag(), v);
    	}
    	while(relation.size() > 1) {
    		for(int i = 0; i < this.vertexes1.size(); i ++) {
    			if(this.vertexes1.get(i).getTag().equals(relation.get(0))) {
        			posTag1 = i;
        		}else if(this.vertexes1.get(i).getTag().equals(relation.get(1))) {
        			posTag2 = i;
        		}
    		}
    		
    		Integer weight1 = (int) (Math.random() * 10);
    		this.weights.add(weight1);
    		this.insertEdge(this.vertexes1.get(posTag1), this.vertexes1.get(posTag2), weight1);
    		this.insertEdge(this.vertexes1.get(posTag2), this.vertexes1.get(posTag1), weight1);
    		relation.remove(0);
    		relation.remove(0);
    	}
    	
    	
    }
    
//    /**
//     * Constructor de la clase que recibe una lista de vértices
//     * 
//     * @param vertex
//     */
//    @SuppressWarnings({ "rawtypes", "unchecked" })
//	public Graph(ArrayList<Vertex> vertex) {
//    	this.vertex = new HashMap<T, Vertex>();
//    	this.edge = new HashMap<Integer, Edge>();
//    	
//    	for(Vertex v : vertex)
//    	    {
//    		this.vertex.put((T) v.getTag(), v);
//    		
//    	    }
//    }
    

	/**
	 * Este método valida que no exista la arista que se está pretendiendo crear
	 * y si no está creada, se hace la relación entre los vértices
	 * 
	 * @param v1
	 * @param v2
	 * @param weight
	 * @return:
	 * 			true si se crea la arista y se añade a la matriz de adyacencia, y false si ya existía
	 */
	@SuppressWarnings({ "rawtypes"})
	public boolean insertEdge(Vertex v1, Vertex v2, int weight) {
		if(v1.equals(v2)) {
			return false;
		}
		
		Edge edge = new Edge(v1, v2, weight);
		
		if((this.edge.containsKey(edge.hashCode()))) {
			return false;
		}
		else if(v1.containsNeighbor(edge) || v2.containsNeighbor(edge)) {
			return false;
		}
		
		this.edge.put(edge.hashCode(), edge);
		v1.insertNeighbor(edge);
		v2.insertNeighbor(edge);
		this.edges.add(edge);
		return true;
	}
	
	
	/**
	 * Método que retorna si una arista ya está relacionada
	 * 
	 * @param edge
	 * @return:
	 * 			true si las arista existe, false si la arista que se insertó no tiene
	 * 			relación con algún vértice (o bien, no existe)
	 */
	public boolean containsEdge(Edge edge) {
		if(edge.getVertex1() == null || edge.getVertex2() == null) {
			return false;
		}
		return this.edge.containsKey(edge.hashCode());
	}

	/**
	 * Método que define entre cuáles nodos no hay camino y lo inserta en la matriz de adyacencia
	 */
	@SuppressWarnings("unchecked")
	public void createAdjMatrix() {
		for(int i = 0; i < this.vertexes.size() ; i++) {
			for(int j = 0; j < this.vertexes.size(); j++) {
				for(int k = 0; k < this.edges.size(); k++) {
					ArrayList<T> temp = new ArrayList<>();
					temp.add((T) this.vertexes.get(i).getTag());
					temp.add((T) this.vertexes.get(j).getTag());
					
					if((this.edges.get(k).getVertex1().equals(this.vertexes.get(i)) && this.edges.get(k).getVertex2().equals(this.vertexes.get(j)))) {
						temp.add((T) this.edges.get(k).getWeight());
						if(!isInAdjMatrix(temp)) {
							adjMatrix.add(temp);
						}
						
					}else {
						Integer q = -1;
						temp.add((T) q);
						if(!isInAdjMatrix(temp)) {
							adjMatrix.add(temp);
						}
					}
				}
				
			}
		}
			
	}
	/**
	 * Método que se encarga de definir si ya se estableció una relación entre los 2 vértices incluidos en la lista
	 * @param list
	 * @return:
	 * 		   true, si ya la relación está definida
	 * 		   false, si no
	 */
	private boolean isInAdjMatrix(ArrayList<T> list) {
		boolean b = false;
		if(this.adjMatrix != null) {
			for(int i = 0; i < this.adjMatrix.size(); i++) {
				if(this.adjMatrix.get(i).get(0).equals(list.get(0)) && this.adjMatrix.get(i).get(1).equals(list.get(1))) {
					b = true;
					addAdjMatrix(list, i);
					break;
				}
			}
		}
		return b;
	}
	
	/**
	 * Método que se encarga de analizar si el peso entre 2 nodos está incorrecto y lo corrije
	 * @param list
	 * @param indexM
	 */
	private void addAdjMatrix(ArrayList<T> list, int indexM) {
		if(this.adjMatrix.get(indexM).get(2).equals(-1)) {
			this.adjMatrix.get(indexM).remove(2);
			this.adjMatrix.get(indexM).add(2, list.get(2));
		}
	}
	
	
	/**
	 * Método que elimina la relación (arista) entre dos vértices
	 * 
	 * @param edge
	 * @return
	 */
	public Edge deleteEdge(Edge edge) {
		edge.getVertex1().deleteNeighbor(edge);
		edge.getVertex2().deleteNeighbor(edge);
		this.edges.remove(edge);
		return this.edge.remove(edge.hashCode());
	}
	
	/**
	 * Método que retorna si existe el vértice indicado en el grafo
	 * 
	 * @param vertex
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public boolean containsVertex(Vertex vertex) {
		return (this.vertex.get(vertex.getTag()) != null);
	}
	
	/**
	 * Método con el que se obtiene el vértice con cierta etiqueta
	 * 
	 * @param tag
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public Vertex getVertex(T tag) {
		return this.vertex.get(tag);
	}
	
	/**
	 * Método que revisa si el vértice no está, crea uno nuevo,
	 * en caso de que esté, se sobreescribe o no se hace nada
	 * 
	 * @param vertex
	 * @param overrideVertex
	 * @return
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean insertVertex(Vertex vertex, boolean overrideVertex) {
		Vertex current = this.vertex.get(vertex.getTag());
		if(current != null) {
			if(!overrideVertex) {
				return false;
			}
			
			while(current.getCountNeighbors() >= 0) {
				this.deleteEdge(current.getNeighbor(0));
			}
		}
		this.vertex.put((T) vertex.getTag(), vertex);
		this.vertexes.add(vertex);
		return true;
	}

	/**
	 * Método que busca y elimina un nodo o vértice por su etiqueta
	 * @param tag
	 * @return:
	 * 		   el vértice eliminado
	 */
	@SuppressWarnings("rawtypes")
	public Vertex deleteVertex(T tag) {
		Vertex vertex = this.vertex.remove(tag);
		this.vertexes.remove(vertex);
		
		while(vertex.getCountNeighbors() >= 0) {
			this.deleteEdge(vertex.getNeighbor(0));
		}
		return vertex;
	}
		
	
	
	/**
	 * Método para conocer las etiquetas del grafo
	 * 
	 * @return:
	 * 			Las etiquetas de los vértices contenidos en el grafo
	 */
	public Set<T> vertexKeys(){
		return this.vertex.keySet();
	}
	
	/**
	 * Método que retorna los valores de las aristas
	 * @return
	 */
	public Set<Edge> getEdge() {
		return new HashSet<Edge>(this.edge.values());
	}


	public ArrayList<ArrayList<T>> getAdjMatrix() {
		return adjMatrix;
	}

	public ArrayList<Edge> getEdges() {
		return edges;
	}

	@SuppressWarnings("rawtypes")
	public ArrayList<Vertex> getVertexes() {
		return vertexes;
	}

	public ArrayList<Integer> getWeights() {
		return weights;
	}


}
