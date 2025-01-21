package Graphs;

import java.util.Scanner;

class GraphMatrix {
    private int vertices;
    private int[][] adjMatrix;

    public GraphMatrix(int vertices) {
        this.vertices = vertices;
        adjMatrix = new int[vertices][vertices];
    }

    public void addEdge(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
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
}

public class GraphUsingAdjMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vertices:");
        int vertices = sc.nextInt();

        GraphMatrix graph = new GraphMatrix(vertices);

        System.out.println("Enter number of edges:");
        int edges = sc.nextInt();

        System.out.println("Enter edges (u v):");
        for (int i = 0; i < edges; i++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            graph.addEdge(u, v);
        }

        graph.printAdjMatrix();
        sc.close();
    }
}
