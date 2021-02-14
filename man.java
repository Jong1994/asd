package 연습장;

public class man {
	
	public static void main(String[] args) {
		
		person james = new person();
		james.name = "James";
		james.age = 40;
		james.isMarried = true;
		james.decendant = 3;
		
		System.out.println(james.name);
		System.out.println(james.age);
		System.out.println(james.isMarried);
		System.out.println(james.decendant);
		
	}

}
