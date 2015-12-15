package problem_018;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MaximumPath {

	public static void main(String[] args) {
		new MaximumPath();
	}

	public MaximumPath() {
		Node n = null;
		try {
			n = loadTree("data.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
//		n.print(0);
		System.out.println("starting to calculate size");
		System.out.println(n.size());
		System.out.println("done");
	}
	
	private Node loadTree(String file) throws FileNotFoundException{
		
		String str = new Scanner(new File("src/problem_018/" + file)).useDelimiter("\\Z").next();

//		System.out.println(str);
		String[] rows = str.split("\r\n");
		String[][] tree = new String[rows.length][];
		Node[][] nodes = new Node[tree.length][];
		for (int i=0; i<rows.length; i++){
			tree[i] = rows[i].split(" ");
			nodes[i] = new Node[tree[i].length];
		}
		
		for (int i = 0; i < tree.length; i++) {
			for (int j = 0; j < tree[i].length; j++) {
				nodes[i][j] = new Node(tree[i][j]);
			}
			System.out.println("");
		}
		
		Node n = nodes[0][0];
		System.out.println("starting to build tree");
		n.add(nodes, 0, 0, 0);
		System.out.println("tree has been built");
		return n;
	}

	static class Node{
		private Node left;
		private Node right;
		private int number;
		private Integer cachedSize = null;
		
		public Node(int number){
			this.number = number;
		}
		public Node(String number){
			this.number = Integer.parseInt(number);
		}
		
		public void add(Node[][] nodes, int x, int y, int depth){
//			System.out.println(depth);
			left = nodes[x+1][y];
			right = nodes[x+1][y+1];
			if(x < nodes.length-2){
				if(left.empty()){					
					left.add(nodes, x+1, y, depth+1);
				}
				if(right.empty()){					
					right.add(nodes, x+1, y+1, depth+1);
				}
			}
		}		
		
		private boolean empty() {
			return right == null;
		}
		public int size(){
			if(cachedSize != null){
				return cachedSize;
			}
			if(left == null){
				return number;
			}
			int l = left.size();
			int r = right.size();
			if(l>r){
				cachedSize = l+number;
				return l+number;
			}
			cachedSize = r+number;
			return r+number;
		}
		
		public void print(int depth){
			for (int i = 0; i < depth; i++) {				
//				System.out.print("|");
				System.out.print("--");
			}
			System.out.println(number);
			if(left != null){
				left.print(depth+1);
				right.print(depth+1);
			}
		}
	}
	
}
