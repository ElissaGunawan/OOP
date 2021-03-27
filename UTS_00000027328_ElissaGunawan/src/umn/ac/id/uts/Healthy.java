package umn.ac.id.uts;
import java.util.ArrayList;

public class Healthy extends Human{
	private int muscle;
	private int fat;
	private int stressLevel;
	private double weight;
	public ArrayList<String> activities = new ArrayList<String>();
	
	public Healthy() {}
	public Healthy(String name, int age) {
		super(name, age);
		this.muscle = 50;
		this.fat = 15;
		this.stressLevel = 4;
		this.updateWeight();
	}
	public double getWeight() {
		return weight;
	}
	public int getFat() {
		return fat;
	}
	public int getStressLevel() {
		return stressLevel;
	}
	public int getMuscle() {
		return muscle;
	}
	public void updateWeight() {
		this.weight = this.fat * 0.3 + this.muscle * 0.6;
	}
	public void eat(Food food) {
		if(this.stressLevel > 10) {
			System.out.printf("%s is stressed out\n", this.getName());
			return;
		}
		this.fat += food.fat;
		this.muscle -= food.muscle;
		this.stressLevel += 2;
		this.updateWeight();
		this.addActivity("Eating", food.getNama());
		System.out.printf("%s doesn't really like it\n", this.getName());
	}
	public void workout(Exercise exercise) {
		if(this.fat < exercise.fat) {
			System.out.printf("%s is way too healthy\n", this.getName());
			return;
		}
		this.fat -= exercise.fat;
		this.muscle += exercise.muscle;
		this.updateWeight();
		this.stressLevel -= 2;
		this.addActivity("Working out", exercise.getNama());
		System.out.printf("%s loves it\n",this.getName());
	}
	public void addActivity(String type,String name) {
		activities.add(String.format("%s: %s",type,name));
	}
	public void showActivities() {
		for(int i=0;i<this.activities.size();i++) {
			System.out.println(this.activities.get(i));
		}
	}
}
