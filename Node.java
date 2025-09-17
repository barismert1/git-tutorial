package cis112_2025_1_e7final_List_Q2_g2;

/**
 * A node having data as String.
 * new version
 * @author bingol
 */
public class Node {

	public int data;
	public Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}

	@Override
	public String toString() {
		return "[Node: data=" + data + "]";
	}

	public int canonical() {
		return data;
	}
}
