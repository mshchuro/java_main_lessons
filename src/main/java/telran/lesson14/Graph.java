package telran.lesson14;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * index : 0, 1
 * index : 1, 2
 * index : 2, 0, 1
 * index : 3, 2
 * index : 4, 5
 * index : 5, 4
 */
public class Graph {

    private List<List<Integer>> adjacencyList = new ArrayList<>();

    private final List<Edge> edges;

    public Graph(List<Edge> edges) {
        this.edges = edges;
        generateAdjacencyList();
    }

    private void generateAdjacencyList() {
        int vertex = 0;
        for (Edge edge : edges) {
            vertex = Math.max(vertex, Math.max(edge.getSource(), edge.getSource()));
        }
        System.out.println("Max vertex " + vertex);
        for (int i = 0; i < vertex; i++) {
            adjacencyList.add(i, new LinkedList<>());
        }

        for (Edge edge : edges) {
            int index = edge.getSource();
            int value = edge.getDestination();
            List<Integer> integers = adjacencyList.get(index);
            integers.add(value);
        }
    }

    public void print() {
        for (int source = 0; source < adjacencyList.size(); source++) {
            for (int destination : adjacencyList.get(source)) {
                System.out.println(source + destination);
            }
            System.out.println();
        }
    }
}
