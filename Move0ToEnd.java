import java.util.ArrayList;
public class Solution {
	public static void pushZerosAtEnd(ArrayList<Integer> arr) {
		int ne = 0, i = 0, n = arr.size();
    // ne pointer show the next non 0 element
		while (i < n) {
      // move ne pointer jab tak 0 find na ho kyoki woh hi place hoga jha non zero element aayega
			while (ne < n && arr.get(ne) != 0)
				ne++;
      // agar i ne kea agea hoga tabhi we swap other wise we move it
			if (i > ne && arr.get(i) != 0 && arr.get(ne) == 0) {
				int t = arr.get(i);
				arr.set(i, arr.get(ne));
				arr.set(ne, t);
			}
			i++;
		}
	}
}
