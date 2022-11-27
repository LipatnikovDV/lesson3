import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box<T extends Fruit> {
    private List<T> box;

    public Box(T... obj) {
        box = Arrays.asList(obj);
    }

    public Box(List<T> list) {
        this.box = list;
    }

    public List<T> getList(){
        return box;

    }
    public Box(){
        box =new ArrayList<T>();
    }
    void addFruit(T obj) {
        box.add(obj);
    }
    void infoBox() {
        if (box.isEmpty()) {
            System.out.println("Коробка пустая");
        } else {
            System.out.println("В коробке находятся " + box.get(0).toString() + ", в количестве: " + box.size() + " штук");
        }
    }
    float getWeihgt() {
        float totalWeight = 0.0f;
        for (int i = 0; i <box.size(); i++) {
            totalWeight = totalWeight + box.get(i).getWeight();
        }
        return totalWeight;
//        if (list.isEmpty()) {
//            return 0;
//        }else {
//            return list.size() * list.get(0).getWeight();
//        }
    }

    boolean compare(Box<? extends Fruit> box) {
        return this.getWeihgt() == box.getWeihgt();
    }

    void moveFruitAt(Box<T> anotherBox) {
        anotherBox.box.addAll(this.box);
        this.box.clear();
    }

}
