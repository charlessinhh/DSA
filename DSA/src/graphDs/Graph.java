package graphDs;

import java.util.ArrayList;

public class Graph {
	// graph representation using arraylist of arraylist of Undirected Grapgh
	public static void main(String[] args) {
		int n = 5, m = 6;

		ArrayList<ArrayList<Integer>> adjList = new ArrayList<ArrayList<Integer>>();

		// add n+1 empty arraylist inside adjgraph
		for (int i = 0; i <= n; i++) {
			adjList.add(new ArrayList<Integer>());
		}

		// edge 1 -- 2
		adjList.get(1).add(2);
		adjList.get(2).add(1);

		// edge 1 -- 3
		adjList.get(1).add(3);
		adjList.get(3).add(1);

		// edge 2 - 4
		adjList.get(2).add(4);
		adjList.get(4).add(2);

		// edge 3--4
		adjList.get(3).add(4);
		adjList.get(4).add(3);

		// edge 2--5
		adjList.get(2).add(5);
		adjList.get(5).add(2);

		// edge 4--5
		adjList.get(4).add(5);
		adjList.get(5).add(4);

		for (int i = 1; i <= n; i++) {
			for (Integer it : adjList.get(i)) {
				System.out.print(it + " ");
			}
			System.out.println();
		}

//		for (int i = 1; i <= n; i++) {
//			for (int j = 0; j < adjList.get(i).size(); j++) {
//				System.out.print(adjList.get(i).get(j) + ",");
//				System.out.println("....");
//				System.out.print(adjList.get(i) + ",");
//			}
//			System.out.println();
//		}

//		
	}

}
