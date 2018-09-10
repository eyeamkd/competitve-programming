import java.util.*;
class Guessgame {  
	public int random_number ; 
	Guessgame(){  
		Random rand= new Random();    
		random_number=rand.nextInt(9); 
	}
}
 class Player{    
 	Scanner ob = new Scanner(System.in);
 	public int guessnumber(){   
 		System.out.println("Guess a random number"); 
 		int num=ob.nextInt(); 
 		return num;

 	}

 }
class GameLauncher { 
	public static void main(String[] args) { 
		Guessgame game = new Guessgame();	 
		Player p1 = new Player(); 
		Player p2 = new Player(); 
		Player p3 = new Player();	 
		 
		System.out.println("****Game Begins****"); 
		int p1_num,p2_num,p3_num;
		p1_num=p1.guessnumber(); 
		p2_num=p2.guessnumber(); 
		p3_num=p3.guessnumber();  
		System.out.println("Player one guessed "+p1_num);
		System.out.println("Player two guessed "+p2_num);
		System.out.println("Player three guessed "+p3_num);
		if(p1_num==game.random_number){  
			System.out.println("Player 1 wins");
		} 
		else if(p2_num==game.random_number){  
			System.out.println("Player 2 wins");
		} 
		else if(p3_num==game.random_number){  
			System.out.println("Player 3 wins");
		} 
		else{  
			System.out.println("No winners"); 
			System.out.println("The actual number was "+game.random_number);
		}
	}
	
}