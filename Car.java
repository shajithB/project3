public class Car {
	
		  boolean isOn;
		  void turnOn() {
		    isOn = true;
		    System.out.println("Light on? " + isOn);

		  }
		  void turnOff() {
		    isOn = false;
		    System.out.println("Light on? " + isOn);
		  }
		}
class Main {
		  public static void main(String[] args) {
		    Car led = new Car();
		    Car halogen = new Car();
		    led.turnOn();
		    halogen.turnOff();
		  }
		}