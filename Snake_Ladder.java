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
                if(num+position<=100){
                position += num;
                }
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
            if(position==100){
                break;
            }
        }
        System.out.println("You win");
    }
}