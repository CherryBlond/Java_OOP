package ru.geekbrains.javaone.lessons;

public abstract class Participants implements Actions {
    protected String name;
    protected int maxRunLength;
    protected int maxJumpHeight;


    public boolean run(int lenght){
        return lenght <= maxRunLength;
    }
   public boolean jump(int height) {
        return height <= maxJumpHeight;
   }
   public boolean passThrough(Barrier[] barriers) {
       for (Barrier barrier : barriers) {
           if (barrier.shouldJump()) {
               boolean result = jump(barrier.getValue());
               if (result == false) {
                   return false;
               }
           }
           if (barrier.shouldRun()) {
               boolean result = run(barrier.getValue());
               if (result == false) {
                   return false;
               }
           }
       }
        return true;
   }


        public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
