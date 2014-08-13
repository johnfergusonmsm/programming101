/**
 * Created with IntelliJ IDEA.
 * User: John.Ferguson
 * Date: 09/06/14
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */
public class EmployeePay {

    private static final double overtimeMultiplier = 1.5;

    private static void CalculatePayFor(String name, double hours, double payRate) {
        double totalPay;
        double standardRatePay;
        double overtimeRatePay = 0;

        if (hours <= 40) {
            standardRatePay = payRate * hours;
        }
        else {
            standardRatePay = payRate * 40;
            overtimeRatePay = (hours - 40) * (payRate * overtimeMultiplier);
        }

        totalPay = standardRatePay + overtimeRatePay;

        Printout(name, hours, totalPay, overtimeRatePay, payRate);
    }

    private static void Printout(String name, double hours, double totalPay, double overtimeRatePay, double payRate) {
        
        if (hours > 60){
            System.out.println("WARNING: '"+ name + "' has worked more than 60 hours");
        }

        if (payRate < 7.00){
            System.out.println("WARNING: '"+ name + "' earns less than £7.00 minimum wage");
        }

        System.out.println( name + " has worked " + hours + " this week and earned £" + totalPay + " including £" + overtimeRatePay + " overtime pay");
    }

    public static void main(String[] arguments) {
        CalculatePayFor("John", 42, 7.25);
        CalculatePayFor("Lucy", 48, 7.50);
        CalculatePayFor("Sully", 20, 8.40);
        CalculatePayFor("Chris", 40, 4.50);
        CalculatePayFor("Will", 65, 8.50);
    }
}


