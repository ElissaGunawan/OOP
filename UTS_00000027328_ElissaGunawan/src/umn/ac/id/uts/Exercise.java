package umn.ac.id.uts;

public class Exercise {
	public String name;
	public int muscle;
	public int fat;
	public int id;
	
	public Exercise() {}
	public Exercise(int id, String name, int muscle, int fat) {
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
