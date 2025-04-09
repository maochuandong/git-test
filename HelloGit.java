public class HelloGit{
	public static void main(String[] args){
		System.out.println("Hello Git!");
		int num = game_1();
		num++;
	}
	public static int game_1(){
		Random r = new Random();
		int randNum = r.nextInt(100)+1;
		return randNum;
	}
}
