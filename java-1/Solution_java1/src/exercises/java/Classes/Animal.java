package exercises.java.Classes;

public class Animal {
	private boolean isSleeping;
	private String size;
	
	public Animal(){
		this.setSleeping(false);
		this.setSize("none");
	}
	
	public Animal(boolean isSleeping,String size){
		this.setSleeping(isSleeping);
		this.setSize(size);
	}

	public boolean isSleeping() {
		return isSleeping;
	}

	public void setSleeping(boolean isSleeping) {
		this.isSleeping = isSleeping;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}
	
	public String sound(){
		String sound="mrghl";
		return sound;
	}
	
	public String toString(){
		String data="Animal Sleeping: "+isSleeping+" Animal Size: "+size+" Animal sound: "+sound();
		return data;
	}
}
