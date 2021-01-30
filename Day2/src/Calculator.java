
public class Calculator {


	public int add(int... a) {  
		int ans=0;
		for(int x:a) {
			ans=ans+x;
		}
		return ans;
	}

	

}