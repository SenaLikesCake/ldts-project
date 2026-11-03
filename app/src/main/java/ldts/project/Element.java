package ldts.project;

import com.googlecode.lanterna.graphics.TextGraphics;

public abstract class Element {
    Position position;
    
    public Element(int x_, int y_){
        position = new Position(x_, y_);
    }

    public abstract void draw(TextGraphics graphics);
    
    public Position getPosition(){
        return position;
    }
}
