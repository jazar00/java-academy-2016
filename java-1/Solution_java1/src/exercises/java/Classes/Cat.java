package exercises.java.Classes;

public class Cat extends Animal{
	//variables
	public int lives;
	
	//constructors
	public Cat(){
		super();
		lives=0;
	}
	
	public Cat(int lives){
		super();
		this.lives=lives;
	}
	
	public Cat(int lives, boolean isSleeping, String Size){
		super(isSleeping,Size);
		this.lives=lives;
	}
	
	//getters && setters
	public double getLives() {
		return lives;
	}
	public void setLives(int lives) {
		this.lives = lives;
	}
	
	//Override
	public String sound(){
		String sound="MEOW";
		return sound;
	}
	
	//Override
	public String toString(){
		String data="Cat Sleeping: "+isSleeping()+" Cat Size: "+getSize()+" Cat sound: "+sound()+" Cat Lives: "+getLives();
		return data;
	}
}
