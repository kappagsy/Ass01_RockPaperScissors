import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String playerA = "";
        String playerB = "";
        String userResponse ="";
        boolean correctMove = false;
        boolean done = false;

        do
        {
                System.out.print("\nPlayer A, enter your move: ");
                if (in.hasNextLine())
                {
                    playerA = in.nextLine();
                    if (playerA.equalsIgnoreCase("R")|| playerA.equalsIgnoreCase("P") || playerA.equalsIgnoreCase("S"))
                    {
                        System.out.print("\nPlayer B, enter your move: ");
                        if (in.hasNextLine())
                        {
                            playerB = in.nextLine();
                            if (playerB.equalsIgnoreCase("R")|| playerB.equalsIgnoreCase("P") || playerB.equalsIgnoreCase("S"))
                            {
                                if (playerA.equalsIgnoreCase("R"))
                                {
                                    if (playerB.equalsIgnoreCase("R"))
                                    {
                                        System.out.println("Rock vs Rock It's a TIE!");
                                    }
                                    else if (playerB.equalsIgnoreCase("P"))
                                    {
                                        System.out.println("Paper covers Rock! Player B wins!");
                                    }
                                    else //playerB must be Scissors
                                    {
                                        System.out.println("Rock breaks Scissors! Player A wins!");
                                    }
                                }
                                else if (playerA.equalsIgnoreCase("P"))
                                {
                                    if (playerB.equalsIgnoreCase("R"))
                                    {
                                        System.out.println("Paper covers Rock. Player A wins!");
                                    }
                                    else if (playerB.equalsIgnoreCase("P"))
                                    {
                                        System.out.println("Paper vs Paper, it's a TIE!");
                                    }
                                    else //playerB must be Scissors
                                    {
                                        System.out.println("Scissors cuts Paper! Player B wins!");
                                    }
                                }
                                else if (playerA.equalsIgnoreCase("S"))//playerA is scissors
                                {
                                    if (playerB.equalsIgnoreCase("R"))
                                    {
                                        System.out.println("Rock breaks Scissors! Player B wins!");
                                    }
                                    else if (playerB.equalsIgnoreCase("P"))
                                    {
                                        System.out.println("Scissors cut Paper! Player A wins!");
                                    }
                                    else //playerB must be Scissors
                                    {
                                        System.out.println("Scissors vs Scissors, it's a TIE!");
                                    }
                                }

                                System.out.print("Would you like to play again? [Y/N] ");
                                if(in.hasNextLine())
                                {
                                    userResponse = in.nextLine();
                                    if (userResponse.equalsIgnoreCase("Y"))
                                    {
                                        done = false;
                                    }
                                    else if (userResponse.equalsIgnoreCase("N"))
                                    {
                                        done = true;
                                    }
                                }
                            }
                        }
                    }
                }
        } while (done == false);
    }
}