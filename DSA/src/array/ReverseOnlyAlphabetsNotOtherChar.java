package array;

public class ReverseOnlyAlphabetsNotOtherChar {

	public static void main(String[] args) {
		String name = "My name is Charles";
		// append 123 after 'is'
		StringBuilder str = new StringBuilder(name);
		str.insert(10, " 123");
		String finalStr = str.toString();
		System.out.println(finalStr);
		char[] nameCh = finalStr.toCharArray();
		reverse(nameCh);

	}

	private static void reverse(char[] nameCh) {
		char[] temp = new char[nameCh.length];
		// store nameCh in temp char array
		int x = 0;
		for (int i = 0; i < nameCh.length; i++) {
			if (nameCh[i] >= 'a' && nameCh[i] <= 'z' || nameCh[i] >= 'A' && nameCh[i] <= 'Z') {
				temp[x] = nameCh[i];
				x++;
			}
		}
		System.out.println(new String(temp));
		// rev the temp array
		rev(temp, 0, x);
		System.out.println(new String(temp));
		System.out.println(temp.length);

		// update nameCh with temp
		int p = 0;
		for (int i = 0; i < nameCh.length; i++) {
			if (nameCh[i] >= 'a' && nameCh[i] <= 'z' || nameCh[i] >= 'A' && nameCh[i] <= 'Z') {
				nameCh[i] = temp[p];
				p++;
			}
		}
		String revName = new String(nameCh);
		System.out.println(revName);

	}

	private static void rev(char[] temp, int l, int x) {
		for (int i = l; i <= x / 2; i++) {
			char t = temp[i];
			temp[i] = temp[x - l - i];
			temp[x - l - i] = t;
		}

	}

}
