package pattern.strategy.duck;

public class MiniDuckSimulator {
 
	public static void main(String[] args) {
 
		MallardDuck	mallard = new MallardDuck();
		FlyBehavior cantFly = () -> System.out.println("I can't fly");
		QuackBehavior squeak = () -> System.out.println("Squeak");
		RubberDuck	rubberDuckie = new RubberDuck(cantFly, squeak);
		DecoyDuck	decoy = new DecoyDuck();
 
		Duck	 model = new ModelDuck();

		System.out.println("Mallard: --------------------");
		mallard.performQuack();
		mallard.performFly();
		
		System.out.println("RubberDuckie: --------------------");
		rubberDuckie.performQuack();
		rubberDuckie.performFly();

		System.out.println("DecoyDuck: --------------------");
		decoy.performQuack();
		decoy.performFly();
   
		System.out.println("ModelDuck: --------------------");
		model.performFly();	
		model.performQuack();	
		
		System.out.println("Modifico comportament fly ModelDuck: --------------------");
		model.setFlyBehavior(new FlyRocketPowered());
		model.performFly();
	}
}
