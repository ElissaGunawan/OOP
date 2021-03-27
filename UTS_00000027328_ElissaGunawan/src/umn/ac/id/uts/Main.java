package umn.ac.id.uts;
import java.util.*;

public class Main {
	static ArrayList<Food> foods = new ArrayList<Food>();
	static ArrayList<Exercise> exercises = new ArrayList<Exercise>();
	
	public static void seedDataFoods(){
		foods.add(new Food(1, "Pizza", 3, 10));
		foods.add(new Food(2, "Risotto", 2, 4));
		foods.add(new Food(3, "Burger", 4, 9));
		foods.add(new Food(4, "Noodle", 3, 5));
		foods.add(new Food(5, "Salad", 1, 1));
	}
	public static void seedDataExercises(){
		exercises.add(new Exercise(1, "Plank", 1, 2));
		exercises.add(new Exercise(2, "Crunch", 2, 3));
		exercises.add(new Exercise(3, "Squat", 3, 3));
		exercises.add(new Exercise(4, "Pull up", 2, 2));
		exercises.add(new Exercise(5, "Comandos", 5, 2));
	}
	public static void showDataFoods(){
		System.out.println("---------------------------------");
		System.out.println("           Foods        ");
		System.out.println("---------------------------------");
		for(Food foods : foods){
			System.out.println("ID    :"+foods.getID());
			System.out.println("Nama  :"+foods.getNama());
			System.out.println("Muscle :"+foods.getMuscle());
			System.out.println("Fat :"+foods.getFat());
			System.out.println("----------------------------");
		}
	}
	public static void showDataExercises(){
		System.out.println("---------------------------------");
		System.out.println("           Exercises        ");
		System.out.println("---------------------------------");
		for(Exercise exercises : exercises){
			System.out.println("ID    :"+exercises.getID());
			System.out.println("Nama  :"+exercises.getNama());
			System.out.println("Muscle :"+exercises.getMuscle());
			System.out.println("Fat :"+exercises.getFat());
			System.out.println("----------------------------");
		}
	}
	public static void mainMenu(){
		System.out.println("---------------------------------");
		System.out.println("           Living Life        ");
		System.out.println("---------------------------------");
		System.out.println("1. Your Detail");
		System.out.println("2. Eat");
		System.out.println("3. Workout");
		System.out.println("4. List of activities");
		System.out.println("5. Credits");
		System.out.println("0. Exit");
	}
	public static void menu1() {
		System.out.println("---------------------------------");
		System.out.println("           Living Life        ");
		System.out.println("---------------------------------");
		System.out.println("1. Healthy");
		System.out.println("2. Unhealthy");
	}
	public static void anyKey() {
		Scanner in = new Scanner(System.in);
		System.out.println("Press enter to continue");
		String x = in.nextLine();
	}
	
	public static void main(String[] args) {
		seedDataFoods();
		seedDataExercises();
		boolean inp=false;
		Scanner in = new Scanner(System.in);
		System.out.println("---------------------------------");
		System.out.println("           Living Life        ");
		System.out.println("---------------------------------");
		System.out.println("Healthy");
		System.out.print("Name : ");
		String nama = in.nextLine();
		System.out.print("Age : ");
		int umur = in.nextInt();
		Healthy healthyCharacter = new Healthy(nama, umur);
		System.out.println("Healthy character is added");
		System.out.println("Unhealthy");
		System.out.print("Name : ");
		String nama2 = in.next();
		System.out.print("Age : ");
		int umur2 = in.nextInt();
		Unhealthy unhealthyCharacter = new Unhealthy(nama, umur);
		System.out.println("Unhealthy character is added");
		while(true) {
			mainMenu();
			System.out.println("Input :");
			int input = in.nextInt();
			switch (input) {
			case 1:
				menu1();
				inp=false;
				while(!inp) {
					System.out.println("Choose your character : ");
					int choose = in.nextInt();
					if(choose == 1) {
							 System.out.println("Name: "+healthyCharacter.getName());
						     System.out.println("Age: "+healthyCharacter.getAge());
						     System.out.println("Weight : "+healthyCharacter.getWeight());
						     System.out.println("Muscle : "+healthyCharacter.getMuscle());
						     System.out.println("Fat: "+healthyCharacter.getFat());
						     System.out.println("Stress Level: "+healthyCharacter.getStressLevel());
						     System.out.println("-------------------------------");
						     inp = true;
					} else if(choose == 2) {
							 System.out.println("Name: "+unhealthyCharacter.getName());
						     System.out.println("Age: "+unhealthyCharacter.getAge());
						     System.out.println("Weight : "+unhealthyCharacter.getWeight());
						     System.out.println("Muscle : "+unhealthyCharacter.getMuscle());
						     System.out.println("Fat: "+unhealthyCharacter.getFat());
						     System.out.println("Stress Level: "+unhealthyCharacter.getStressLevel());
						     System.out.println("-------------------------------");
						     inp = true;
					} else {
						System.out.println("Invalid input");
					}
				}
				anyKey();
				break;
			case 2:
				showDataFoods();
				int choose1 = 0;
				inp=false;
				while(!inp) {
					System.out.println("Choose your food : ");
					choose1 = in.nextInt();
					if ((choose1 > 0) && (choose1 <= (foods.size()+1))) {
						inp = true;
					}
				}
				inp=false;
				while(!inp) {
					System.out.println("1. Healthy");
					System.out.println("2. Unhealthy");
					System.out.println("Choose your character : ");
					int choose2 = in.nextInt();
					if(choose2 == 1) {
						healthyCharacter.eat(foods.get(choose1-1));
						inp = true;
					} else if(choose2 == 2) {
						unhealthyCharacter.eat(foods.get(choose1-1));
						inp = true;
					} else {
						System.out.println("Invalid input");
					}
				}
				anyKey();
				break;
			case 3:
				showDataExercises();
				int choose4 = 0;
				inp=false;
				while(!inp) {
					System.out.println("Choose your workout : ");
					choose4 = in.nextInt();
					if(choose4 > 0 && choose4 <= (exercises.size()+1)){
						inp = true;
					}
				}
				inp=false;
				while(!inp) {
					System.out.println("1. Healthy");
					System.out.println("2. Unhealthy");
					System.out.println("Choose your character : ");
					int choose5 = in.nextInt();
					if(choose5 == 1) {
						healthyCharacter.workout(exercises.get(choose4-1));
						inp = true;
					} else if(choose5 == 2) {
						unhealthyCharacter.workout(exercises.get(choose4-1));
						inp = true;
					} else {
						System.out.println("Invalid input");
					}
				}
				anyKey();
				break;
			case 4:
				System.out.println("---------------------------------");
				System.out.println("           Living Life        ");
				System.out.println("---------------------------------");
				System.out.println("Activities");
				System.out.println("------------");
				System.out.println("1. Healthy");
				System.out.println("2. Unhealthy");
				inp=false;
				while(!inp) {
					System.out.println("Choose your character : ");
					int choose3 = in.nextInt();
					if(choose3 == 1) {
						System.out.println("Healthy");
						healthyCharacter.showActivities();
						inp = true;
					}else if(choose3 == 2) {
						System.out.println("Unhealthy");
						unhealthyCharacter.showActivities();
						inp = true;
					}else {
						System.out.println("Invalid input");
					}
				}
				anyKey();
				break;
			case 5:
				System.out.println("---------------------------------");
				System.out.println("           Living Life        ");
				System.out.println("---------------------------------");
				System.out.println("Name : Elissa Gunawan");
				System.out.println("NIM : 00000027328");
				anyKey();
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("Invalid input");
				anyKey();
				break;
			}
		}
	}

}
