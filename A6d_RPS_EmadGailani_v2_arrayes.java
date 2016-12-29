// Emad al-Gailani
// rock paper scissors lizard spoke game
// the reflection is on the other file
// 12/10/2014
import java.net.*; // for image
import javax.swing.*; // for image
import javax.swing.JOptionPane; // to let the out put come as a windoes 
import java.awt.Toolkit; //for error sounding
import java.awt.*; // for the color

public class A6d_RPS_EmadGailani_v2_arrayes// class name
{
// asking the methods to come in I just add one methods to my program to get the mark
  public static void main(String[] args) throws Exception// public static, throws Exception is for the imagees 
  { 
    methodextra();
  } // main method
// the method methodextra begins   
  public static void  methodextra () throws Exception
  {
// all variables    
    String[] play = { "Rules" , " Play" , "version" , "About", "Exit"};
    int userInput =0;
    int opration =0;
    int anotherTime=0;
    String winTest="0";
    String time ="0";
    int rules2=0;
    String[] rules3 ={"Rules to play" , "Rules to win" , "Return"}; 
    String computer2 ="0";
    String[] again = { "YES" , "Exit"}; // variable to exit or play again
// array for win lose or tie in the game    
    String [][] value ={
      {"Tie", "Win", "Lose","Lose","Win"},
      {"Lose","Tie","Win","Win","Lose"},
      {"Win", "Lose","Tie", "Lose","Win"},
      { "Win","Lose","Win","Tie","Lose"},
      {"Lose","Win","Lose","Win","Tie"}
    };
// arrayes to import the image to ask the user to take one of the options     
    ImageIcon[] options = {
      new ImageIcon(new URL("http://megaicons.net/static/img/icons_sizes/8/178/64/rock-paper-scissors-rock-icon.png")),
      new ImageIcon(new URL("http://megaicons.net/static/img/icons_sizes/8/178/64/rock-paper-scissors-paper-icon.png")),
      new ImageIcon(new URL("http://megaicons.net/static/img/icons_sizes/8/178/64/rock-paper-scissors-scissors-icon.png")),
      new ImageIcon(new URL("https://cdn0.iconfinder.com/data/icons/animals-5/100/animals-19-64.png")),
      new ImageIcon(new URL("https://cdn1.iconfinder.com/data/icons/hand-gestures/32/gestures-live-long-and-prosper-64.png")),
    };
// the intruduction for the game
    do // the main do and for the hole game
    {
      String hello;
      hello = "\nHello, today we will play a game named rock, paper, scissors, Lizard and spoke";
      JLabel resLabel2 = new JLabel(hello);
      resLabel2.setFont(new Font("Hello, today we will play a game named rock, paper, scissors, Lizard and spoke", Font.BOLD, 16));
      final ImageIcon icon = new ImageIcon(new URL("http://megaicons.net/static/img/icons_sizes/19/105/96/minion-hello-icon.png"));  
      userInput = JOptionPane.showOptionDialog(null, resLabel2 , "play" ,0,JOptionPane.QUESTION_MESSAGE, icon, play, 0); 

// if the user wants the ruels
      if ( userInput ==0)
      { 
        do // do for rules
        {
          UIManager.put("OptionPane.messageForeground", Color.blue);
          rules2   = JOptionPane.showOptionDialog(null, "Which rule do you want to know" , "Rules" ,0,JOptionPane.QUESTION_MESSAGE, null, rules3, 0); 
// option forhow to play in rules option          
          if ( rules2==0)
          {
            final ImageIcon icon3 = new ImageIcon(new URL("http://ih2.redbubble.net/image.8595474.1176/sticker,375x360.png")); // photo 
            JOptionPane.showMessageDialog(null, "", " How to play" ,JOptionPane.ERROR_MESSAGE , icon3 );
            rules2=0;
          } 
//option for how to win in rules option          
          if ( rules2==1)
          {
            JOptionPane.showMessageDialog(null,"You will play n times against the computer\n if you win more then the computer then you win\nwhile if the computer wins more then you then you lose\nPlease note that the tie won't count\n That's it enjoy");
            rules2=0;
          }
// if the user want to return to the main screen in the rules option
          if ( rules2==2)
          {
            userInput =0;
          } 
        } while (rules2==0);
      } // end of the rules option
// option for the version of the game in the main screen     
      else if ( userInput ==2)
      {
        JOptionPane.showMessageDialog(null, "The version of the game is: 1.02 "); 
        userInput =0;
      }
// option for the about in the main screen    
      else if  ( userInput ==3)
      {
        JOptionPane.showMessageDialog(null, "This game was made in Craig Kielburger Secondary School\nThe Maker of the game is Emad Al-Gailani\nIf you have any question about this game, Please email me at my email 1algailanema@hdsb.ca\nThank you for your support ");  
        userInput =0;
      }
// option for exit in the main screen      
      else if  ( userInput ==4 || userInput>4 ||userInput<0)
      {
        String exit;
        exit = "Thanks for playing the game  \nHope you enjoied";
        JLabel resLabel = new JLabel(exit);
        resLabel.setFont(new Font("Monospaced", Font.BOLD, 16));
        JOptionPane.showMessageDialog(null, resLabel, "Exit", JOptionPane.PLAIN_MESSAGE );
        return;
      }
// the option play for rock paper scissors lizard and spokee  
      
      else 
      {
        do // do for the hole play option
        { // biginning of do   
// vaariables to list the winner      
          int correct = 0; 
          int incorrect = 0;
          int tie =0;
          int y = 0; 
// asking to list the number of times to play
          do // do for the number of times to playt the game
          {
            UIManager.put("OptionPane.messageForeground", Color.green);
            time  =  JOptionPane.showInputDialog(null, "How many times do you want to play the game");
            if(!time.equals(""))
            {
              y = Integer.parseInt(time);// changes from String to int
            }
          }while((time.equals(""))); // the program wont exit untile he put a number
// beginning of the game asking to pick one of the options   
          for( int number = 0; number<y; number++) // only five times
          {// beginning of for
            UIManager.put("OptionPane.messageForeground", Color.black);
            // asking the user to take one of the options rock paper scisores and spoke           
            String take;
            take = "What do you want to take";
            JLabel resLabel1 = new JLabel(take);
            resLabel1.setFont(new Font("Monospaced", Font.BOLD, 22));
            opration = JOptionPane.showOptionDialog(null, resLabel1, "play" ,0,JOptionPane.QUESTION_MESSAGE, null, options, 0);   
            int computer = (int)(Math.random()*5);// randum
// swith for the randum picks from the computer       
            switch (computer)
            { // begin of swith
              case 0:
                computer2 = "Rock";
                break; 
              case 1:
                computer2 = "Paper";
                break; 
              case 2:
                computer2= "scissors";
                break; 
              case 3:
                computer2= "Lizard";
                break; 
              case 4:
                computer2= "Spoke";
                break; 
            } // end of swith
// swith for the user input to state what they took       
            switch (opration) 
            { // begin of swith    
              case 0:
                JOptionPane.showMessageDialog(null,"You took Rock computer takes " + computer2+ " ");  
                break; 
              case 1:
                JOptionPane.showMessageDialog(null,"You took Paper computer takes " + computer2+ " ");  
                break; 
              case 2:
                JOptionPane.showMessageDialog(null,"You took Scissors computer takes " +computer2+" "); 
                break; 
              case 3:
                JOptionPane.showMessageDialog(null,"You took Lizard computer takes " +computer2+" "); 
                break; 
              case 4:
                JOptionPane.showMessageDialog(null,"You took Spoke computer takes " +computer2+" "); 
                break; 
              default:
                JOptionPane.showMessageDialog(null,"Bye");
                return; 
            } // end of swith
            // if to list the winner or loser in the game based on the ruels of RPS befor the final result using arrays     
            winTest = value [computer][opration];
            // if the user lose           
            if (winTest.equals("Lose"))
            {    
              incorrect++; 
              Toolkit.getDefaultToolkit().beep(); // the deep sound
              JOptionPane.showMessageDialog(null, " you lose" ,"Warning", JOptionPane.ERROR_MESSAGE);
              // if it is tie             
            }
            if (winTest.equals("Tie"))
            {
              JOptionPane.showMessageDialog(null, " it is a tie");
              tie++;
            }
//if the user win             
            if  (winTest.equals("Win"))
            {    
              JOptionPane.showMessageDialog(null, " you win");
              correct++;
            }
          } //end of for
// anawssing the winer or loser after the the number of playing times finish    
          JOptionPane.showMessageDialog(null,"The times you win are: " + correct + "\nThe times you lost are: "   + incorrect + "\nThe tie are: " + tie+" " );  
          // anawssing that the user win at the end of the game      
          if (correct> incorrect )
          { // user wins 
            final ImageIcon icon2 = new ImageIcon(new URL("https://encrypted-tbn3.gstatic.com/images?q=tbn:ANd9GcT4fWwccOeQ-zdH1i-nwl36CdAHj4_BBWGj2cjNGx35n_vLCFHfcw")); // photo 
            JOptionPane.showMessageDialog(null, "you win more times then the computer,\n YOU WIN");
            JOptionPane.showMessageDialog(null, "", " Winner" ,JOptionPane.ERROR_MESSAGE , icon2 );
          }
          // anawssing that the user lose at the end of the game          
          else if (correct< incorrect )
          { 
            final ImageIcon icon1 = new ImageIcon(new URL("http://thumb7.shutterstock.com/display_pic_with_logo/247744/247744,1317877577,1/stock-vector-loser-86053264.jpg")); // photo 
            JOptionPane.showMessageDialog(null, "you lose more times then the computer,\n YOU LOSE"); 
            JOptionPane.showMessageDialog(null, "", "Loser" ,JOptionPane.PLAIN_MESSAGE , icon1 );  
          }
          // anawssing that it is a tie and no body wins at the end of the game
          else
          {
            JOptionPane.showMessageDialog(null, "It is a tie no body wins"); 
          }
//asking to play again or exit           
          anotherTime= JOptionPane.showOptionDialog(null, "would you like to play again or do you want to exit the game " ," again" ,0,JOptionPane.QUESTION_MESSAGE, null, again, 0); // message
        }while(anotherTime == 0); // to play another time
      } //end of the play option
      userInput = 0;
    } while (userInput == 0);
    
  } // the methodextra ends
} // end program
