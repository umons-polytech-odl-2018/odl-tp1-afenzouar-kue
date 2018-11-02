package exercise2;

class Person {
	private int age;
	private static int popsize=0;
	private static int sumage=0;
	public Person (int age)
	{
		this.age=age;
		popsize++;
		sumage +=age;
	}
	static int computePopulationSize() {

		return popsize;
	}
	static float computeAveragePopulationAge() {

		return (float)sumage/popsize;
	}
	static void resetPopulation() {
		popsize=0;
		sumage=0;
	}
}
