package graph;

import java.util.*;

public class BFS_Search {
    int vertices;
    Map<Integer, LinkedList<Integer>> adjList;
    BFS_Search(int x) {
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

    void bfs(int vertex) {
        Map<Integer, Boolean> visited = new HashMap<>();
        Queue<Integer> queue = new LinkedList<>();

        int i = 0;
        Map<Integer, LinkedList<Integer>> levels = new HashMap<>();
        levels.put(i, new LinkedList<>(List.of(vertex)));
        i++;
        visited.put(vertex, true);
        queue.add(vertex);

        while (!queue.isEmpty()) {
            int v = queue.poll();
            System.out.print(v + " ");
            List<Integer> neighbours = adjList.get(v);
            for (int nextVertex : neighbours) {
                if (visited.get(nextVertex) == null) {
                    if (!levels.containsKey(i)) {
                        levels.put(i, new LinkedList<>());
                    }
                    levels.get(i).add(nextVertex);
                    visited.put(nextVertex, true);
                    queue.add(nextVertex);
                }
            }
            i++;
        }
        System.out.println("\nLevels: ");
        System.out.println(levels);
    }

    public static void main(String[] args) {
        BFS_Search obj = new BFS_Search(7);
        obj.addEdge(1,2);
        obj.addEdge(1,3);
        obj.addEdge(2,4);
        obj.addEdge(2,5);
        obj.addEdge(3,6);
        obj.addEdge(3,7);

        obj.printGraph();

        obj.bfs(1);
    }
}
