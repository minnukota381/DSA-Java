package Graphs;

import java.util.*;

class Graph {
    private int vertices; 
    private int[][] adjMatrix; 
    private List<List<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;

        adjMatrix = new int[vertices][vertices];

        adjList = new ArrayList<>();
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdgeMatrix(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1; 
    }

    public void addEdgeList(int u, int v) {
        adjList.get(u).add(v);
        adjList.get(v).add(u); 
    }

    public void printAdjMatrix() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void printAdjList() {
        System.out.println("Adjacency List:");
        for (int i = 0; i < vertices; i++) {
            System.out.print(i + ": ");
            for (int neighbor : adjList.get(i)) {
                System.out.print(neighbor + " ");
            }
            System.out.println();
        }
    }
}

public class GraphRepresentation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int vertices = sc.nextInt();

        Graph graph = new Graph(vertices);

        System.out.println("Enter number of edges:");
        int edges = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();

            graph.addEdgeMatrix(u, v);
            graph.addEdgeList(u, v);
        }

        graph.printAdjMatrix();
        graph.printAdjList();

        sc.close();
    }
}
