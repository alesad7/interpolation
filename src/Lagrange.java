import java.text.DecimalFormat;

public class Lagrange {
    double[] x = {0.0,1.0,2.0,4.0, 5.0};
    double[] y = {7.0,3.0,-1.0,3.0, -3.0};

    public Lagrange(){
        double y2 = lagrangeInterpolation(x,y,3.0);
        DecimalFormat newFormat = new DecimalFormat("#.##");
        double twoDecimal =  Double.valueOf(newFormat.format(y2));
        System.out.println("INTERPOLACJA LAGRANGE'A \n dla x = 3 wartość wielomianu o współczynnikiach x = [0.0, 1.0, 2.0, 4.0, 5.0] oraz y = [7.0, 3.0, -1.0, 3.0, -3.0] " + "\n wynosi y = " + y2 + ",\n czyli po zaokrągleniu y = " + twoDecimal);
    }

    public static double lagrangeInterpolation(double[] xArray, double[] yArray, double x ) {
        double temp;
        double y = 0.0;

        for(int k = 0; k < xArray.length; k++){
            temp = 1.0;
            for(int j = 0; j < xArray.length ; j++)
                if(j != k ) temp=temp*((x-xArray[j])/(xArray[k]-xArray[j]));
            y += temp*yArray[k];
        }
        return y;
    }
}
