package gouzao;

public class ExerciseSheet_3_3_2 {
	public static void main(String[] args) {
		Exercise_3_2_2 exercise = new Exercise_3_2_2();
		exercise.generateAdditionExercise(50);
		System.out.println("---- generate and display add exercises ----");
		exercise.formattedDisplay(5);
		exercise.clear();
		System.out.println("---- generate and display exercises ----");
		exercise.generateSubstractExercise(50);
		exercise.formattedDisplay(5);
		
		System.out.println("----methods that should not permitted ----");
		System.out.println("---- exercise.remove(1) ----");
		exercise.remove(1);
		exercise.formattedDisplay (5);
		System.out.println("---- exercise.remove(1) ----");
		exercise.set(2,new AdditionOperation());
		exercise.formattedDisplay(5);
	}
}
