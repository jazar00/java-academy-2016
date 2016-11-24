package exercises.java.Classes;

public class Lion extends Animal{
	private String food;

	//constructors
		public Lion(){
			super();
			food="";
		}
		
		public Lion(String food){
			super();
			this.food=food;
		}
		
		public Lion(String food, boolean isSleeping, String Size){
			super(isSleeping,Size);
			this.food=food;
		}
	
	//getters && setters
	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	} 
	
	//Override
	public String sound(){
		String sound="MEOW";
		return sound;
	}
		
	//Override
	public String toString(){
		String data="Lion Sleeping: "+isSleeping()+" Lion Size: "+getSize()+" Lion sound: "+sound()+" Lion food: "+getFood();
		return data;
	}	


}
