
public class Test {
	public static void main(String[] args){
		Person taro = new Person();
		taro.name="山田太郎";
		taro.age=20;
		System.out.println(taro.name);
		System.out.println(taro.age);
		taro.tark();
		taro.walk();
		taro.run();
		
		Person jiro = new Person();
		jiro.name="木村次郎";
		jiro.age=18;
		System.out.println(jiro.name);
		System.out.println(jiro.age);
		jiro.tark();
		jiro.walk();
		jiro.run();
}
}
