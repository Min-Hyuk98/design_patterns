public abstract class CaffeineBeverage {
    final void prepareRecipe(){ //template method (전체 뼈대)
        boilWater();
        brew();
        pourInCup();
        if (customerWantsCondiments()) {
            addCondiments();
        }
    }

    abstract void brew();
    abstract void addCondiments();

    void boilWater() {
        System.out.println("물 끓이는 중");
    }
    void pourInCup() {
        System.out.println("컵에 따르는 중");
    }
    boolean customerWantsCondiments() { // 후크 : 서브클래스에서 필요할 때만 오버라이드.
        return true;
    }
}