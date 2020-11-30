package club.y2d.designpatterns.observer.push;

public interface Observer {
    public void update(float temp, float humidity, float pressure);
}