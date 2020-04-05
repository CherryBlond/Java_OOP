package ru.geekbrains.javaone.lessons;

public interface Actions {
    boolean run(int lenght);
    boolean jump(int height);
    boolean passThrough(Barrier[] barriers);

}
