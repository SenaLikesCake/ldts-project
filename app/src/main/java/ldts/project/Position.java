package ldts.project;

public class Position {
    int x;
    int y;

    public Position(int x_, int y_){
        x = x_;
        y = y_;
        
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x_){
        x = x_;
    }

    public void setY(int y_){
        y = y_;
    }
}
