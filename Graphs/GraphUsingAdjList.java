package Graphs;

import java.util.*;

class GraphList {
    private int vertices; // Number of vertices
    private List<List<Integer>> adjList; // Adjacency list

    public GraphList(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<>(); // Initialize the adjacency list
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>()); // Add an empty list for each vertex
        }
    }

    public void addEdge(int u, int v) {
        adjList.get(u).add(v); // Add v to u's list
        adjList.get(v).add(u); // For undirected graph, add u to v's list
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

public class GraphUsingAdjList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int vertices = sc.nextInt();

        GraphList graph = new GraphList(vertices);

        System.out.println("Enter number of edges:");
        int edges = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        graph.printAdjList();
        sc.close();
    }
}

