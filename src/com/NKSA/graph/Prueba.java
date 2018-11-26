package com.NKSA.graph;

import java.util.ArrayList;

//import java.util.ArrayList;

public class Prueba {
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static <T> void main(String args[]) {
		String[] list = {"A","B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "Ñ", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z", "#", "ç","TEC"};
		String[] list2 = {"A","B","B","C","C","D","D","E","E","F","A","G","B","H","C","I","D","J","E","K","F","L","G","H","H","I","I","J","J","K","K","L","G","M","H","N","I","Ñ","K","O","L","P","M","N","N","Ñ","O","P","M","Q","N","R","Ñ","S","P","U","Q","R","R","S","S","T","Q","V","R","W","S","X","T","Y","U","#","V","W","W","X","X","Y","Y","Z","Z","#","V","ç","ç","TEC","X","TEC","#","TEC"};
		ArrayList<String> list1 = new ArrayList<>();
		ArrayList<String> list3 = new ArrayList<>();
		for(int i = 0; i < list.length; i++) {
			list1.add(list[i]);
		}
		for(int i = 0; i < list2.length; i++) {
			list3.add(list2[i]);
		}
		
		Graph graph = new Graph<>(list1, list3);
		System.out.println(graph.getEdges());
		System.out.println(graph.getWeights());
		
		Dijkstra<T> dijkstra = new Dijkstra<>();
		dijkstra.computePaths(graph.getVertex("C"), graph.getVertex("O"));
		System.out.println("Distance to" + graph.getVertex("O") + ":" + graph.getVertex("O").getDistance());
		System.out.println(dijkstra.getShortestPath());
	}
//		Graph graph = new Graph();
//		Vertex vertex = new Vertex<String>("hola");
//		Vertex vertex0 = new Vertex<String>("adios");
//		Vertex vertex00 = new Vertex<String>("mmm...");
//		Vertex vertex000 = new Vertex<String>("prueba");
//		Vertex vertex1 = new Vertex<String>("espero");
//		Vertex vertex2 = new Vertex<String>("que");
//		Vertex vertex3 = new Vertex<String>("funcione");
//		
//		
//		graph.insertVertex(vertex, false);
//		graph.insertVertex(vertex0, false);
//		graph.insertVertex(vertex00, false);
//		graph.insertVertex(vertex000, false);
//		graph.insertVertex(vertex1, false);
//		graph.insertVertex(vertex2, false);
//		graph.insertVertex(vertex3, false);
//		graph.insertEdge(vertex, vertex0, 9);
//		graph.insertEdge(vertex00, vertex, 5);
//		graph.insertEdge(vertex, vertex000, 4);
//		graph.insertEdge(vertex, vertex1, 1);
//		graph.insertEdge(vertex3, vertex2, 7);
//		graph.insertEdge(vertex2, vertex000, 3);
//		graph.insertEdge(vertex3, vertex, 15);
//		graph.insertEdge(vertex0, vertex3, 3);
//		graph.insertEdge(vertex, vertex2, 8);
//		
//		
//		System.out.println(vertex.getNeighbors());
//		System.out.println(" ");
//		System.out.println(graph.vertexKeys());
//		System.out.println(" ");
//		System.out.println(graph.getEdge());
//		System.out.println(" ");
//		
//		System.out.println(graph.getEdges());
//		System.out.println(" ");
//		
//		graph.createAdjMatrix();
//		System.out.println(graph.getAdjMatrix());
//		System.out.println(" ");
//		System.out.println(graph.getAdjMatrix().size());
//		
//		
//		
//		Dijkstra dijkstra = new Dijkstra();
//		dijkstra.computePaths(vertex, vertex2);
//		System.out.println("Distance to " + vertex2 + ": " + vertex2.getDistance());
//		System.out.println("Path: " + dijkstra.getShortestPath());
//		
//	}
}
