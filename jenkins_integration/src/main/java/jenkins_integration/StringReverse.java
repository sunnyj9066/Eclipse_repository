package jenkins_integration;

import org.testng.annotations.Test;

public class StringReverse {

	@Test
	public void Reverse() {

		  String s = "Sunny"; 
		  for(int i=s.length()-1;i>=0;i--) {
		  System.out.print(s.charAt(i)); 
		}
		System.out.println();
		StringBuilder sb = new StringBuilder("sunny");
		sb.reverse();
		System.out.println(sb);
		
		System.out.println();
		StringBuffer sbf = new StringBuffer("sunny");
		sbf.reverse();
		System.out.println(sbf);
	}
}
