package graph;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Graph {
    int vertices;
    Map<Integer, LinkedList<Integer>> adjList;

    Graph(int x) {
        this.vertices = x;
        adjList = new HashMap<>();
        for (int i = 1; i <= x; i++) {
            adjList.put(i, new LinkedList<>());
        }
    }
    void addEdge(int src, int dst) {
        adjList.get(src).add(dst);
        adjList.get(dst).add(src);
    }
    void printGraph() {
        for (int vertex : adjList.keySet()) {
            System.out.print(vertex + " : ");
            for (int neighbour : adjList.get(vertex)) {
                System.out.print(neighbour + " ");
                if (! (adjList.get(vertex).indexOf(neighbour) == adjList.get(vertex).size()-1)) {
                    System.out.print("--> ");
                }
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
