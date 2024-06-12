public class Main {

    public static void main(String[] args) {

        // int[] numbers = new int[3];
        // char[] characters = new char[4];
        // String[] string = new String[5];

        Food food1 = new Food("Pizza");
        Food food2 = new Food("Pasta");
        Food food3 = new Food("torta");

        // *insted of doing this method to add food*/
        // Food[] refrigerator = new Food[3];
        // refrigerator[0] = food1;
        // refrigerator[1] = food2;
        // refrigerator[2] = food3;

        // *we can use this method*/
        Food[] refrigerator = { food1, food2, food3 };

        System.out.println(refrigerator[0].name);
    }

}