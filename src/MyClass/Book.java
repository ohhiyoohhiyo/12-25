package MyClass;

public class Book {
	String Name;
	int[][] score;
	
	Book(String Name, int[][] score){
		this.Name = Name;
		this.score = score;
	}
    
	public int getMax() {
		int max = score[0][0];
		for(int[] row : score)
		    for(int col : row) 
		    	if(max < col)
		    		max = col;
		return max;
	}
	public int getMin() {
		int min = score[0][0];
		for(int[] row : score)
		    for(int col : row) 
		    	if(min > col)
		    		min = col;
		return min;
	}
    public double getAvg() { 
    	double avg = 0;
    	int count = 0;
    		for(int[] row : score) {
    		    for(int col : row) {
    		    	count++;
    		    		avg += col;
    		    }
    		}
    		return avg / count;
    }
}
