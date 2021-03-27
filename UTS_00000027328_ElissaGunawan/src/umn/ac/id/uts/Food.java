package umn.ac.id.uts;

public class Food {
	public int id;
	public String name;
	public int muscle;
	public int fat;
	
	public Food() {}
	public Food(int id, String name, int muscle, int fat) {
		this.id = id;
		this.name = name;
		this.muscle = muscle;
		this.fat = fat;
	}
	public int getID() {
		return id;
	}
	public String getNama() {
		return name;
	}
	public int getMuscle() {
		return muscle;
	}
	public int getFat() {
		return fat;
	}
}
