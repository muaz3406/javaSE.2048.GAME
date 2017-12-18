package com.muaz.SE;



import java.util.Random;
import java.util.Scanner;
public class Ikibinkirksekiz {
    int[][] board = new int[5][5];
    int[][] board_new = new int[5][5];
    int k=5;
    int f=5;
    int g=5;
    int h=5;
    int j=5;
public Ikibinkirksekiz()
{
    
    		
    for(int t=0;t<1000000;t++)
    {
        //random numbers to number places
        Random rnd = new Random();
        int a = rnd.nextInt(5);
        int b = rnd.nextInt(5);
        int c = rnd.nextInt(5);
        int d = rnd.nextInt(5);
        int x = (1+rnd.nextInt(2))*(1+rnd.nextInt(2));
        int y = (1+rnd.nextInt(2))*(1+rnd.nextInt(2));
        if(board[a][b]==0 && board[c][d]==0&&x!=1&&y!=1)
        {//control if it's full
        board[a][b]=x;
       	board[c][d]=y;
        break;
        }
        t++;
    }
        Print();
        for(int i=0;i<1000000;i++)
        {
            Scanner scan = new Scanner(System.in);
            System.out.println ("Do your move(please use w,a,s,d)");
            String move = scan.nextLine();
            while(move.equals("w")||move.equals("W")|move.equals("a")||move.equals("A")||move.equals("s")||move.equals("S")||move.equals("d")||move.equals("D"))
            {
                if(move.equals("w")||move.equals("W"))
                {
                    for(int m=0;m<5;m++){
        for(int n=0;n<5;n++){
            board_new[m][n]=board[m][n];
        }
    }
                    move_up();
                    add_up();
                    control();
                    Random();
                    Print();	
                    finish();
                    break;			
		}
                if(move.equals("s")||move.equals("S"))
                {
                    for(int m=0;m<5;m++){
        for(int n=0;n<5;n++){
            board_new[m][n]=board[m][n];
        }
    }
                    move_down();
                    add_down();
                    control();
                    Random();
                    Print();
                    finish();
                    break;			
		}
                if(move.equals("a")||move.equals("A"))
                {
                    for(int m=0;m<5;m++){
        for(int n=0;n<5;n++){
            board_new[m][n]=board[m][n];
        }
    }
                    move_left();
                    add_left();
                    control();
                    Random();
                    Print();	
                    finish();
                    break;			
		}
                 if(move.equals("d")||move.equals("D"))
                {
                    for(int m=0;m<5;m++){
        for(int n=0;n<5;n++){
            board_new[m][n]=board[m][n];
        }
    }
                    move_right();
                    add_right();
                    control();
                    Random();
                    Print();	
                    finish();
                    break;			
		}
	    }
            
            i++;
        }   
}
public void move_up()
{
    for(int x=0;x<5;x++)
    {        
     for(int c=1;c<=4;c++)
        {
            for(int v=0;v<=4;v++)
            {
                if(board[c][v]!=0&&board[c-1][v]==0)
                {
                    board[c-1][v]=board[c][v];
                    board[c][v]=0;                    				
		}                
            }
                
	}   
    }   
}
public void move_right()
{
    for(int x=0;x<5;x++)
    {        
     for(int v=3;v>=0;v--)
        {
            for(int c=0;c<=4;c++)
            {
                if(board[c][v]!=0&&board[c][v+1]==0)
                {
                    board[c][v+1]=board[c][v];
                    board[c][v]=0;                    				
		}                
            }
                
	}   
    }   
}
public void move_left()
{
    for(int x=4;x>=0;x--)
    {        
     for(int v=1;v<=4;v++)
        {
            for(int c=0;c<=4;c++)
            {
                if(board[c][v]!=0&&board[c][v-1]==0)
                {
                    board[c][v-1]=board[c][v];
                    board[c][v]=0;                    				
		}                
            }
                
	}   
    }   
}
public void move_down()
{
    for(int x=4;x>=0;x--)
    {        
     for(int c=3;c>=0;c--)
        {
            for(int v=0;v<=4;v++)
            {
                if(board[c][v]!=0&&board[c+1][v]==0)
                {
                    board[c+1][v]=board[c][v];
                    board[c][v]=0;                    				
		}                
            }
                
	}   
    }   
}
public void add_up()
{
    for(int i=0;i<5;i++)
    {
        for(int j=0;j<4;j++)
        {
            if(board[j][i]==board[j+1][i]&&board[j][i]!=0)
            {
                board[j][i]=board[j][i]+board[j][i];
                board[j+1][i]=0;
                move_up();
            }               
        }
    }    
}
public void add_right()
{
    for(int i=4;i>0;i--)
    {
        for(int j=0;j<=4;j++)
        {
            if(board[j][i]==board[j][i-1]&&board[j][i]!=0)
            {
                board[j][i]=board[j][i]+board[j][i];
                board[j][i-1]=0;
                move_right();
            }               
        }
    }    
}
public void add_left()
{
    for(int i=0;i<4;i++)
    {
        for(int j=0;j<5;j++)
        {
            if(board[j][i]==board[j][i+1]&&board[j][i]!=0)
            {
                board[j][i]=board[j][i]+board[j][i];
                board[j][i+1]=0;
                move_left();
            }               
        }
    }    
}
public void add_down()
{
    for(int i=4;i>=0;i--)
    {
        for(int j=4;j>0;j--)
        {
            if(board[j][i]==board[j-1][i]&&board[j][i]!=0)
            {
                board[j][i]=board[j][i]+board[j][i];
                board[j-1][i]=0;
                move_down();
                
            }               
        }
    }    
}
public void finish()//method for control if the game is over
{
for(int c=0;c<5;c++)
{
    for(int v=0;v<5;v++)
    {
        if(board[c][v]==0)
        {
            break;
        }
        else if(v==4&&c==4)
        {
            possmove();
            if(k==1){
                break;
            }
              else if(k==0)
            {
            first_row_cont();
            if(f==1){
            break;
            }
            else if(f==0){
                last_row_cont();
                if(g==1){
                    break;
                }
                else if(g==0){
                    first_column_cont();
                    if(h==1){
                        break;
                    }
                    else if(h==0){
                        last_column_cont();
                                if(j==1){
                                    break;
                                }
                                else if(j==0){
                                    System.out.println("game over!!");
                                    System.exit(0);
                                }
                    }
                }
            }
            
            
            
            }
       }
            
        
        
    }
}
}
public void control(){
       for(int m=0;m<5;m++){
        for(int n=0;n<5;n++){
            if(board[m][n]!=board_new[m][n]){
                break;
            }
        }
    }
    
}
public int possmove()//works together with finish method
{
    k=0;
    for(int c=1;c<4;c++)
    {
        for(int v=1;v<4;v++)
        {
            if((board[c][v]==board[c-1][v]||board[c][v]==board[c][v-1])||(board[c][v]==board[c+1][v]||board[c][v]==board[c][v+1]))
            {
                k=1;
            } 
        }
    }
    return k;
}
public int first_row_cont()//works together with finish method
{
     f=0;
    for(int k=0;k<4;k++){
        if(board[0][k]==board[0][k+1]){
            f=1;
        }
    }
    return f;
}
public int last_row_cont()//works together with finish method
{
    g=0;
    for(int k=0;k<4;k++){
        if(board[4][k]==board[4][k+1]){
            g=1;
        }
    }
    return g;
}
public int first_column_cont()//works together with finish method
{
    h=0;
    for(int k=0;k<4;k++){
        if(board[k][0]==board[k+1][0]){
            h=1;
        }
    }
    return h;
}
public int last_column_cont()//works together with finish method
{
    j=0;
    for(int k=0;k<4;k++){
        if(board[k][4]==board[k+1][4]){
            j=1;
        }
    }
    return j;
}
public void Random()//method for give random number to random place
{
    for(int t=0;t<1000000;t++)
    { 
        Random rnd = new Random();
        int a = rnd.nextInt(5);
        int b = rnd.nextInt(5);
        int x = (1+rnd.nextInt(2))*(1+rnd.nextInt(2));
        if(board[a][b]==0&&x!=1)
        {//control if it's full
            board[a][b]=x;
            break;            
        }
        t++;   
    }    
}
public void Print()//method for printing board 
{
    System.out.print ("|");
	for(int l=0;l<5;l++){
		if(board[0][l]==0)
		System.out.print ("    |");
else if(board[0][l]==2||board[0][l]==4||board[0][l]==8){

System.out.print ("  "+board[0][l]+" |");

}
else if(board[0][l]==16||board[0][l]==32||board[0][l]==64){

System.out.print (" "+board[0][l]+" |");

}
else if(board[0][l]==128||board[0][l]==256||board[0][l]==512){

System.out.print (board[0][l]+" |");

}
else 

System.out.print (board[0][l]+"|");

	}
	System.out.println ("");
	System.out.print ("--------------------------");
	System.out.println ("");
		
	System.out.print ("|");
	for(int l=0;l<5;l++){
		if(board[1][l]==0)
		System.out.print ("    |");
else if(board[1][l]==2||board[1][l]==4||board[1][l]==8){

System.out.print ("  "+board[1][l]+" |");

}
else if(board[1][l]==16||board[1][l]==32||board[1][l]==64){

System.out.print (" "+board[1][l]+" |");

}
else if(board[1][l]==128||board[1][l]==256||board[1][l]==512){

System.out.print (board[1][l]+" |");

}
else 

System.out.print (board[1][l]+"|");

	}
	System.out.println ("");
	System.out.print ("--------------------------");
	System.out.println ("");
		
	System.out.print ("|");
	for(int l=0;l<5;l++){
		if(board[2][l]==0)
		System.out.print ("    |");
else if(board[2][l]==2||board[2][l]==4||board[2][l]==8){

System.out.print ("  "+board[2][l]+" |");

}
else if(board[2][l]==16||board[2][l]==32||board[2][l]==64){

System.out.print (" "+board[2][l]+" |");

}
else if(board[2][l]==128||board[2][l]==256||board[2][l]==512){

System.out.print (board[2][l]+" |");

}
else 

System.out.print (board[2][l]+"|");

	}
	System.out.println ("");
	System.out.print ("--------------------------");
	System.out.println ("");
		
	System.out.print ("|");
	for(int l=0;l<5;l++){
		if(board[3][l]==0)
		System.out.print ("    |");
else if(board[3][l]==2||board[3][l]==4||board[3][l]==8){

System.out.print ("  "+board[3][l]+" |");

}
else if(board[3][l]==16||board[3][l]==32||board[3][l]==64){

System.out.print (" "+board[3][l]+" |");

}
else if(board[3][l]==128||board[3][l]==256||board[3][l]==512){

System.out.print (board[3][l]+" |");

}
else 

System.out.print (board[3][l]+"|");

	}
	System.out.println ("");
	System.out.print ("--------------------------");
	System.out.println ("");
		
	System.out.print ("|");
	for(int l=0;l<5;l++){
		if(board[4][l]==0)
		System.out.print ("    |");
else if(board[4][l]==2||board[4][l]==4||board[4][l]==8){

System.out.print ("  "+board[4][l]+" |");

}
else if(board[4][l]==16||board[4][l]==32||board[4][l]==64){

System.out.print (" "+board[4][l]+" |");

}
else if(board[4][l]==128||board[4][l]==256||board[4][l]==512){

System.out.print (board[4][l]+" |");

}
else 

System.out.print (board[4][l]+"|");

	}
	System.out.println ("");
	System.out.print ("--------------------------");
	System.out.println ("");

}
    public static void main (String[] args) {
        new Ikibinkirksekiz();		
		
    }


}
    
