import javax.swing.plaf.PanelUI;
import java.util.ArrayList;

public class Box<T extends Fruit>
{
    private ArrayList<T> fruits;

    public Box(T...arr) {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit){
        fruits.add(fruit);
    }

    public float getWeight(){
        if (fruits.size() == 0) return 0.0f;
        else return (fruits.size() * fruits.get(0).getWeight());
    }

    public boolean compare(Box box){
        return (Math.abs(this.getWeight() - box.getWeight()) < 0.0001);
    }

    public void transfer(Box<? super T> anotherBox){
        anotherBox.fruits.addAll(this.fruits);
        this.fruits.clear();
    }
}
