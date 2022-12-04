public class BeverageTestDrive {
    public static void main(String[] args) {
        Tea myTea = new Tea();
        Coffee myCoffee = new Coffee();

        System.out.println("\n차 주문");
        myTea.prepareRecipe();  

        System.out.println("\n커피 주문");
        myCoffee.prepareRecipe();
    }
}
