package screenshot.Cmdb;

public class Doubleequal {

	public static void main(String[] args) {
		String s1 =new String("Ravinder");
		String s2= new String ("Ravinder");
		String s3= "Ravinder";
		String s4 ="Ravinder";
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s3.equals(s4));
		System.out.println(s1==s2);
		System.out.println(s1==s3);
		System.out.println(s3==s4);		
	}

}
