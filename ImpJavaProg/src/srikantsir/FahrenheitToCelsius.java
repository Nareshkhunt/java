package srikantsir;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        FahrenheitToCelsius ob=new FahrenheitToCelsius();
        ob.tempConvert(32);
        ob.tempConvert(212);
        ob.tempConvert(98.6);
        ob.tempConvert(-459.76);

    }
    public void tempConvert(double fahrenheit){
        double celsius;
        celsius=(fahrenheit-32)*0.5556;
        System.out.println("temperature in celsius:"+celsius);

    }

}
