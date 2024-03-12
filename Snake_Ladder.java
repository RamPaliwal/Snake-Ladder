public class Snake_Ladder {
    public static void main(String[] args) {
        int position=0;
        int No_play=0;
        int Ladder=1;
        int Snake=2;
        int currentplayer=1;
        int player1=1;
        int player2=2;
        while(position<=100){
            int option=(int) Math.floor(Math.random()*10)%3;
            int num = (int) Math.floor(Math.random()*10)%6+1;
            if(option==Ladder){
                if(currentplayer==1){
                    if(num+player1<=100){
                        player1 += num;
                        System.out.println("Selected option is Ladder");
                        System.out.println("Player 1 is at position "+player1);
                        System.out.println("Player 2 is at position "+player2);
                        if(player1==100){
                            System.out.println("Player 1 win");
                            break;
                        }
                        System.out.println("Player 1 play again");
                        System.err.println();
                        continue;
                    }
                    
                }
                else{    
                    if(num+player2<=100){
                        player2 += num;
                        System.out.println("Selected option is Ladder");
                        System.out.println("Player 1 is at position "+player1);
                        System.out.println("Player 2 is at position "+player2);
                        if(player2==100){
                            System.out.println("Player 2 win");
                            break;
                        }
                        System.out.println("Player 2 play again");
                        System.err.println();
                        continue;
                    }
                    
                } 
            }
            if(option==Snake){
                if(currentplayer==1){
                if(player1>=num){
                    player1 -= num;
                }
                }
                else{
                    if(player2>=num){
                        player2 -= num;
                    }
                }
                System.out.println("Selected option is Snake");
                System.out.println("Player 1 is at position "+player1);
                System.out.println("Player 2 is at position "+player2);
                System.out.println();
            }
            if(option==No_play){
                System.out.println("Selected option is No Play");
                System.out.println("Player 1 is at position "+player1);
                System.out.println("Player 2 is at position "+player2);
                System.out.println();
            }
            currentplayer = (currentplayer==1)?2:1;
        }
    }
}