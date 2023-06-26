package graph;

import java.util.ArrayList;

public class Graph {
    int vertices;
    ArrayList<ArrayList<Integer>> adjList;

    Graph(int x) {
        this.vertices = x;
        adjList = new ArrayList<>(x);
        for (int i = 0; i <= x; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }
    void addEdge(int src, int dst) {
        adjList.get(src).add(dst);
        adjList.get(dst).add(src);
    }
    void printGraph() {
        for (int i = 1; i <= vertices; i++) {
            System.out.print(i + " : ");
            for (int j = 0; j < adjList.get(i).size(); j++) {
                System.out.print(adjList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(1,2);
        graph.addEdge(1,4);
        graph.addEdge(1,5);
        graph.addEdge(2,4);
        graph.addEdge(3,5);
        graph.addEdge(4,5);

        graph.printGraph();
    }
}
