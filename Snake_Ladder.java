public class Snake_Ladder {
    public static void main(String[] args) {
        System.out.println("Welcome to snake & ladder game");
	int position=0;
        int Ladder=1;
        int Snake=2;
        while(position<=100){
            int option=(int) Math.floor(Math.random()*10)%3;
            int num = (int) Math.floor(Math.random()*10)%6+1;
            if(option==Ladder){
                position += num;
                System.out.println("Selected option is Ladder");
                System.out.println("You are at position "+position);
            }
            else if(option==Snake){
                if(position>=num){
                    position -= num;
                }
                System.out.println("Selected option is Snake");
                System.out.println("You are at position "+position);
            }
            else{
                System.out.println("Selected option is No Play");
                System.out.println("You are at position "+position);
            }
        }
        System.out.println("You win");
    }
}