package greddyApproach;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Item {
	int value;
	int weight;

	public Item(int value, int weight) {
		this.value = value;
		this.weight = weight;
	}
}

//comparator interface to compare items
class ItemComparator implements Comparator<Item> {

	@Override
	public int compare(Item a, Item b) {
		double r1 = (double) (a.value) / (double) (a.weight);
		double r2 = (double) (b.value) / (double) (b.weight);
		if (r1 < r2) {
			return 1;
		} else if (r1 > r2) {
			return -1;
		} else {
			return 0;
		}
	}
}

public class FractionalKnapsack {
	public static double fractionalKnapsack(int maxWeight, Item[] items) {
		// Sort item array on the Basis of Value per Weight
		Arrays.sort(items, new ItemComparator());
		int currWeight = 0;
		double finalValue = 0.0D;
		
		// loop to add item and check value is maximum and weight is not filled totally
		for (int i = 0; i < items.length; i++) {
			if (currWeight + items[i].weight <= maxWeight) {   // means we can add this weight into bag 
				currWeight += items[i].weight;
				finalValue += items[i].value;
			} else {
				int remain = maxWeight - currWeight;   //weight size increase,, take fraction of value by weight multiply by remain W
				finalValue += ((double) (items[i].value) / (double) (items[i].weight)) * (double) (remain);
				break;
			}
		}
		return finalValue;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();
		while (tc-- > 0) {
			int n = sc.nextInt();
			Item[] items = new Item[n];
			for (int i = 0; i < n; i++) {
				int value = sc.nextInt();
				int weight = sc.nextInt();
				items[i] = new Item(value, weight);
			}
			int maxWeight = sc.nextInt();
			double ans = fractionalKnapsack(maxWeight, items);
			System.out.println(ans);
		}
	}
}

/*
 * 1 3 60 10 100 20 120 30 50 240.0
 */
