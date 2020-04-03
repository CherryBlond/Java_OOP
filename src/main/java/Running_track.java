public class Running_track implements Barrier {

    Running_track(int lenght) {
        this.lenght = lenght;
    }

    protected int lenght;

   public boolean shouldRun() {
       return true;
   }
   public boolean shouldJump(){
       return false;
   }
   public int getValue(){
       return lenght;
   }

}
