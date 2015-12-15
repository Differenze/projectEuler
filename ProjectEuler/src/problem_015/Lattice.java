package problem_015;

public class Lattice {

	public static void main(String[] args) {
		new Lattice();
	}
	
	Long[][] nodes;
	
	public Lattice(){
		nodes = new Long[21][21];
		nodes[0][0] = 1l;
		System.out.println(waysToGetTo(20, 20));
		
		for (int i = 0; i < nodes.length; i++) {
			for (int j = 0; j < nodes[0].length; j++) {
				String str = String.format("%012d", nodes[i][j]);
				System.out.print(str + ", ");
			}
			System.out.println("");
		}
	}
	
	private Long waysToGetTo(int x, int y){
		System.out.println("probing:(" + x + "," + y + ")--->" );
		if(x<0 || y<0){
//			System.out.println("0");
			return 0l;
		}
		if(nodes[x][y]==null){
			Long waysToGetHere = 0l;
			waysToGetHere += waysToGetTo(x, y-1);
			waysToGetHere += waysToGetTo(x-1, y);
			nodes[x][y] = waysToGetHere;
		}
//		System.out.println(nodes[x][y]);
		return nodes[x][y];
		
	}
	
}
