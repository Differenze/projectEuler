package problem_011;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class Grid {
	
	int[][] grid;
	
	public static void main(String[] args){
		new Grid();
	}
	
	public Grid(){
		try {
			grid = loadGrid("data.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(1);
		}
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		for(int x=0; x<20; x++){
			for(int y=0; y<20; y++){
				numbers.add(findHighestNeigbors(x, y));
			}
		}
		
//		numbers.add(findHighestNeigbors(0, 0));
//		numbers.add(right(0, 0));
		
		System.out.println(Collections.max(numbers));
		
	}
	
	private int findHighestNeigbors(int x, int y) {
		ArrayList<Integer> fours = new ArrayList<Integer>();
		fours.add(down(x, y));
		fours.add(right(x, y));
		fours.add(diagUp(x, y));
		fours.add(diagDown(x, y));
		Integer i = Collections.max(fours);
		return i;
	}

	private int diagDown(int x, int y) {
		try{
			return grid[x][y]*grid[x+1][y+1]*grid[x+2][y+2]*grid[x+3][y+3];
		}
		catch(ArrayIndexOutOfBoundsException e){
			return 0;
		}
	}

	private int diagUp(int x, int y) {
		try{
			return grid[x][y]*grid[x+1][y-1]*grid[x+2][y-2]*grid[x+3][y-3];
		}
		catch(ArrayIndexOutOfBoundsException e){
			return 0;
		}
	}

	private int right(int x, int y) {
		try{
			return grid[x][y]*grid[x+1][y]*grid[x+2][y]*grid[x+3][y];
		}
		catch(ArrayIndexOutOfBoundsException e){
			return 0;
		}
	}

	private int down(int x, int y) {
		try{
			return grid[x][y]*grid[x][y+1]*grid[x][y+2]*grid[x][y+3];
		}
		catch(ArrayIndexOutOfBoundsException e){
			return 0;
		}
	}

	public static int[][] loadGrid(String file) throws FileNotFoundException{
		Scanner scan = new Scanner(new BufferedReader(new FileReader("src/Problem11/" + file)));
		scan.useDelimiter("\n");
		int[][] grid = new int[20][20];
		int rowNum = 0;
		
		
		while(scan.hasNext()){
			String line[] = scan.next().split(" ");
			for(int colNum=0; colNum<20; colNum++){
				grid[colNum][rowNum] = Integer.parseInt(line[colNum]);
			}
			rowNum++;
		}
		return grid;
	}
}
