package org.studyeasy;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    public int speed;
    public float test;
    public boolean test2;

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



    public void setSpeed(int speed) {
        this.speed = speed;
    }
    public int getSpeed() {
        return speed;
    }
    public float getTest() {
        return test;
    }

    public void setTest(float test) {
        this.test = test;
    }


    public void setTest2(boolean test2) {
        this.test2 = true;
    }
    public boolean getTest2(){
        return test2;
    }
    //setter 메서드
    public void setDoors(String doors){
        this.doors = doors;
        /*
        * doors = doors; 는 메서드의 매개변수 doors를 그대로 할당하는 코드로,
        * 클래스의 인스턴스 변수 doors가 설정되지 않습니다.
        * 이를 수정하려면 this.doors = doors;로 변경해야 합니다.
        * this 키워드는 클래스의 인스턴스 변수를 참조하는 데 사용됩니다.
        * */
    }
//getter 메서드
    public String getDoors() {
        return doors;
        /*
        * doors 변수에 접근할 수 있는 방법을 제공*/
    }

    public String run(){
        if (doors.equals("closed") && engine.equals("on")
                && driver.equals("seated") && speed > 0
        ) {
            return "running";
        }else{
            return  "not running";
        }
    }
}
