import java.util.ArrayList;

public class Records {
	
	public String name;
	public float totalTime;
	public ArrayList<String> filters;
	public Object records[];

	
	public Records(int number) {
			 this.records = new Object[number];
	}
}
