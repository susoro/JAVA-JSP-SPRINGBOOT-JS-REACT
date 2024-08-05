package org.studyeasy;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.speed = 120;
        System.out.println(car.speed);

    }
}


/*
* 	1.	package org.studyeasy;
	•	이것은 프로그램이 속한 폴더나 그룹을 나타내요. 여기서는 org.studyeasy라는 폴더에 속한 프로그램이라는 뜻이에요.
	2.	public class Main {
	•	Main이라는 이름의 새로운 프로그램을 만들고 있어요. 이 프로그램은 class라고 불러요.
	3.	public static void main(String[] args) {
	•	이 줄은 프로그램이 시작하는 부분이에요. 여기서부터 프로그램이 실행돼요.
	4.	car car = new car();
	•	car라는 이름의 새로운 자동차를 만들고 있어요. 첫 번째 car는 이 자동차의 이름이고, 두 번째 car는 자동차의 설계도를 가리켜요.
	5.	car.speed = 120;
	•	자동차의 속도를 120으로 설정하고 있어요. 즉, 이 자동차는 시속 120km로 달리고 있어요.
	6.	System.out.println(car.speed);
	•	자동차의 속도를 화면에 출력하고 있어요. 여기서는 자동차의 속도인 120이 화면에 나타나요.
	* */