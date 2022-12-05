package disJointSetGraph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DisJointSet {
	List<Integer> rank = new ArrayList<>();
	List<Integer> parent = new ArrayList<>();

	public DisJointSet(int n) {
		for (int i = 0; i <= n; i++) {
			rank.add(0);
			parent.add(i);
		}
	}

	public int findUltimateParent(int node) {
		if (node == parent.get(node)) {
			return node;
		}
		int ulp = findUltimateParent(parent.get(node));
		parent.set(node, ulp);
		return parent.get(node);
	}

	public void unionByRank(int u, int v) {
		int ulp_u = findUltimateParent(u);
		int ulp_v = findUltimateParent(v);
		if (ulp_u == ulp_v)
			return;
		if (rank.get(ulp_u) < rank.get(ulp_v)) {
			parent.set(ulp_u, ulp_v);
		} else if (rank.get(ulp_v) < rank.get(ulp_u)) {
			parent.set(ulp_v, ulp_u);
		} else {
			parent.set(ulp_u, ulp_v);
			int rankU = rank.get(ulp_u);
			rank.set(ulp_u, rankU + 1);
		}
		System.out.println(Arrays.toString(parent.toArray()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DisJointSet ds = new DisJointSet(7);
		ds.unionByRank(1, 2);
		ds.unionByRank(2, 3);
		ds.unionByRank(4, 5);
		ds.unionByRank(6, 7);
		ds.unionByRank(5, 6);

		if (ds.findUltimateParent(3) == ds.findUltimateParent(7)) {
			System.out.println("same parent");
		} else {
			System.out.println("Not same parent");
		}

		ds.unionByRank(3, 7);
		ds.unionByRank(1, 7);
		ds.unionByRank(4, 7);

		if (ds.findUltimateParent(1) == ds.findUltimateParent(7)) {
			System.out.println("Same parent");
		} else {
			System.out.println("Not same parent");
		}

	}

}
