public class Snake_Ladder {
    public static void main(String[] args) {
        int position=0;
        int Ladder=1;
        int Snake=2;
        int dice_count=0;
        while(position<=100){
            dice_count+=1;
            int option=(int) Math.floor(Math.random()*10)%3;
            int num = (int) Math.floor(Math.random()*10)%6+1;
            if(option==Ladder){
                if(num+position<=100){
                position += num;
                }
                System.out.println("Selected option is Ladder");
                System.out.println("You are at position "+position);
                System.out.println();
            }
            else if(option==Snake){
                if(position>=num){
                    position -= num;
                }
                System.out.println("Selected option is Snake");
                System.out.println("You are at position "+position);
                System.out.println();
            }
            else{
                System.out.println("Selected option is No Play");
                System.out.println("You are at position "+position);
                System.out.println();
            }
            if(position==100){
                break;
            }
        }
        System.out.println("You win");
        System.out.println("Total dice count is "+dice_count);
    }
}