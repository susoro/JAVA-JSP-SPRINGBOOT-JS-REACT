package org.studyeasy;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    public int speed;
    public float test;
    public boolean test2;

    public String brand;

    //    생성자를 설정
    public Car(String doors, String engine, String driver, int speed) {
        this.doors = doors;
        this.engine = engine;
        this.driver = driver;
        this.speed = speed;
    }
//    public Car(){
//        doors = "Closed";
//        engine = "off";
//        driver = "away";
//        speed = 0;
//    }
// 게터와 세터

    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
        this.doors = doors;
//        this.doors -> private String doors; 이것을 의미 : 특정 인스턴스를 상징
//        doors -> String doors 우리가 지칭한 값을 이야기한다.
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }
}



