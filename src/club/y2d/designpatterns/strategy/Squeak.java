package club.y2d.designpatterns.strategy;

public class Squeak implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("club.y2d.designpatterns.strategy.Squeak");
    }
}
