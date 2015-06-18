/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largeandspacious.view;

import java.util.Scanner;
import static largeandspacious.LargeAndSpacious.getPlayer;
import largeandspacious.control.GameControl;
//import largeandspacious.control.ProgramControl;

/**
 *
 * @author julzlee
 */
public class MainMenuView extends View
{
    public MainMenuView()
    {
        super("\n"
            + "\n|------------------------------------------|"
            + "\n|  Main Menu                               |"
            + "\n|------------------------------------------|"
            + "\n| G - Start game                           |"
            + "\n| H - Go to the help menu                  |"
            + "\n| P - Show players and high scores         |"
            + "\n| S - Save game                            |"
            + "\n| L - Load game                            |"
            + "\n| E - Exit game                            |"
            + "\n|------------------------------------------|");
    }
    
    @Override
    public boolean doAction(Object obj)
    {
        String value = (String) obj;
        value = value.toUpperCase();
        char choice = value.charAt(0);
        boolean done = false;
        
        switch (choice) {
            case 'G': 
                //Start a new game
                this.startNewGame();                
                break;
            case 'H': 
                //Display the help menu
                this.displayHelpMenu();
                break;
            case 'P': 
                //Display players and high scores
                this.displayPlayersScores();
                break;
            case 'S': 
                //Save the current game
                this.saveGame();
                break;
            case 'L': 
                //Load a saved game
                this.loadExistingGame();
                break;
            case 'E':
                //Exit the game
                done = true;
                break;
            default: 
                System.out.println("Invalid selection");
                break;
        }
        return done;
    }
    
    private void startNewGame()
    {   
        //Create a new Game
        GameControl.createNewGame(getPlayer());
        //Create a new Game Menu View
        
        GameMenuView gameMenu = new GameMenuView();
        //Display the Game Menu
        gameMenu.display();
        System.out.println("*** loadExistingGame function called ***");
    }

    private void loadExistingGame() {
        System.out.println("*** loadExistingGame function called ***");
    }

    private void saveGame() {
        System.out.println("*** saveGame function called ***");
    }

    private void displayHelpMenu() {
        //Create a new help Menu View
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.display();
        System.out.println("*** displayHelpMenu function called ***");
    }

    private void displayPlayersScores() {
        
        System.out.println("*** displayPlayersScores function called ***");
    }
}
