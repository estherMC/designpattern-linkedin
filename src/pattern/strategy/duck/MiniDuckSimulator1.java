package pattern.strategy.duck;

public class MiniDuckSimulator1 {
 
	public static void main(String[] args) {
 
		System.out.println("MallardDuck : ------------------");
		Duck mallard = new MallardDuck();
		mallard.performQuack();
		mallard.performFly();
   
		System.out.println("ModelDuck : ------------------");
		Duck model = new ModelDuck();
		model.performFly();
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();

	}
}
