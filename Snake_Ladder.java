public class Snake_Ladder {
    public static void main(String[] args) {
        int start_position = 0;
        System.out.println("Welcome to snake & ladder game");
        System.out.println("You are at position "+start_position);
	int num = (int) Math.floor(Math.random()*10)%6+1;
        System.out.println("You got "+num+" on die");

    }
}