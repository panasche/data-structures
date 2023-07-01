package graph;

import java.util.*;

public class DFS_Search {
    int vertices;
    Map<Integer, LinkedList<Integer>> adjList;
    DFS_Search(int x) {
        vertices = x;
        adjList = new HashMap<>();
        for (int i = 1; i <= x; i++) {
            adjList.put(i,new LinkedList<>());
        }
    }
    void addEdge(int src, int dst) {
        adjList.get(src).add(dst);
        adjList.get(dst).add(src);
    }
    void printGraph() {
        for (int index : adjList.keySet()) {
            System.out.print(index + ": ");
            for (int vertex : adjList.get(index)) {
                System.out.print(vertex + " ");
                if (! (adjList.get(index).indexOf(vertex) == adjList.get(index).size()-1)) {
                    System.out.print("--> ");
                }
            }
            System.out.println();
        }
    }
    void dfs(int vertex) {
        Map<Integer, Boolean> visited = new HashMap<>();
        visited.put(vertex, true);
        Stack<Integer> stack = new Stack<>();
        stack.push(vertex);

        while (!stack.isEmpty()) {
            int v = stack.pop();
            System.out.print(v + " ");
            List<Integer> neighbours = adjList.get(v);
            for (int i : neighbours) {
                if (visited.get(i) == null) {
                    visited.put(i,true);
                    stack.push(i);
                }
            }
        }
    }
    public static void main(String[] args) {
        DFS_Search obj = new DFS_Search(7);
        obj.addEdge(1,2);
        obj.addEdge(1,3);
        obj.addEdge(2,4);
        obj.addEdge(2,5);
        obj.addEdge(3,6);
        obj.addEdge(3,7);

        obj.printGraph();

        obj.dfs(1);
    }
}
