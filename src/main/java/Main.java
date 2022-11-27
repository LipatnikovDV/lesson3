import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] arr = {"1", "Один", "Dva", "☹"};
        System.out.println(Arrays.toString(arr));
        swapElements(arr, 2, 3);
        System.out.println(Arrays.toString(arr));
        System.out.println();


        Box<Orange> boxOrange = new Box();
        Box<Apple> box1Apple = new Box();
        Box<Apple> box2Apple = new Box();

        for (int i = 0; i < 5; i++) {
            boxOrange.addFruit(new Orange());
        }
        for (int i = 0; i < 3; i++) {
            box1Apple.addFruit(new Apple());
        }
        boxOrange.infoBox();
        box1Apple.infoBox();
        box2Apple.infoBox();
        System.out.println();

        Float orangeWeihgt = boxOrange.getWeihgt();
        Float appleWeihgt1 = box1Apple.getWeihgt();
        Float appleWeihgt2 = box2Apple.getWeihgt();
        System.out.println("Коробка с апельсинами весит: " + orangeWeihgt + " кг.");
        System.out.println("Коробка 1 с яблоками весит: " + appleWeihgt1 + " кг.");
        System.out.println("Коробка 2 с яблоками весит: " + appleWeihgt2 + " кг.");

        System.out.println();

        box1Apple.moveFruitAt(box2Apple);
        box1Apple.infoBox();
        box2Apple.infoBox();

        Float appleNewWeihgt1 = box1Apple.getWeihgt();
        Float appleNEewWeihgt2 = box2Apple.getWeihgt();

        System.out.println("Коробка 1 с яблоками весит: " + appleNewWeihgt1 + " кг.");
        System.out.println("Коробка 2 с яблоками весит: " + appleNEewWeihgt2 + " кг.");

    }

    private static <S> void swapElements(S[] array, int index1, int index2) {
        S temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


}




