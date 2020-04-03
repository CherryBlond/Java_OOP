public class Wall implements Barrier {

    Wall(int height) {
        this.height = height;
    }


    protected int height;

    public boolean shouldRun() {
        return false;
    }
    public boolean shouldJump(){
        return true;
    }
    public int getValue(){
        return height;
    }

}
