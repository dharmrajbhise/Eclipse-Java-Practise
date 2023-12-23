package com.Encapsulation;

class Player {
	private String pname;
	private int pAge;
	private String pGame;
	
	public Player(String pname,int pAge,String pGame) {
		super();
		this.pname = pname;
		this.pAge = pAge;
		this.pGame = pGame;
	}
	
	public String getpname() {
		return pname;
	}
	public void setpname(String pname) {
		this.pname = pname;
	}
	
	public int getpAge() {
		return pAge;
	}
	
	public void setpAge(int pAge) {
		this.pAge = pAge;
	}
	
	public String getpGame() {
		return pGame;
	}
	public void setpGame(String pGame) {
		this.pGame = pGame;
	}
}
public class playerTest {

	public static void main(String[] args) {
		
		Player p1 = new Player("Virat Kohli",38,"Cricket");
		
		System.out.println("Player name : "+p1.getpname());
		System.out.println("Player Age : "+p1.getpAge());
		System.out.println("Player Game : "+p1.getpGame());
	}

}
