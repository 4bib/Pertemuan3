public class DemoKonversiSuhu {

  public static void main(String[] args) {
    KonversiSuhu k = new KonversiSuhu();
    KonversiSuhu2 k2 = new KonversiSuhu2();

    System.out.println("Celcius ke Fahrenheit: " + k.celciusToFahrenheit(30));
    System.out.println("Celcius ke Reamur: " + k.celciusToReamur(30));
    System.out.println("Fahrenheit ke Reamur: " + k2.fahrenheitToReamur(30));
  }
}