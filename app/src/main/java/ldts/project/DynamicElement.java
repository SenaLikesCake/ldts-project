package ldts.project;

public abstract class DynamicElement extends Element {
    public DynamicElement(int x_, int y_){
        super(x_, y_);
    }

    public void move(int direction){
        switch (direction) {
            case 0:
                position.y -= 1;
                break;
            case 1:
                position.x += 1;
                break;
            case 2:
                position.y += 1;
                break;
            case 3:
                position.x -= 1;
                break;
        }
    }

}
