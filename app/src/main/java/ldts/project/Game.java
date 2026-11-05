package ldts.project;

import java.io.IOException;

import com.googlecode.lanterna.input.KeyStroke;
import com.googlecode.lanterna.input.KeyType;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Game {
    
    private Screen screen;
    private Player player = new Player(5, 5);

    public Game(){
        try {
            Terminal terminal = new DefaultTerminalFactory().createTerminal();
            screen = new TerminalScreen(terminal);
            
            screen.setCursorPosition(null);   
            screen.startScreen();             
            screen.doResizeIfNecessary();     
        } catch (IOException e) {   
            e.printStackTrace();
        }
    }

    public void processKeyStroke(KeyStroke key){
        switch (key.getKeyType()) {
            case KeyType.Character:
                if (key.getCharacter() == 'q'){
                    try{
                        screen.close();
                    }
                    catch(IOException e){
                        e.printStackTrace();
                    }
                }
                break;
        }
    }

    public void draw() throws IOException{
        screen.clear();
        player.draw(screen.newTextGraphics());
        screen.refresh();
    }

    public void run() throws IOException{
        draw();
        while (true){
            KeyStroke key = screen.readInput();
            if (key.getKeyType() == KeyType.EOF) break;
            processKeyStroke(key);
            draw();
        }
    }
}
