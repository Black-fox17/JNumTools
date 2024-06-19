package Lrtool;
import src.JArray;
public class LinearRegression{
    JArray x;
    JArray y;
    double weight;
    double bias;
    public LinearRegression(JArray x, JArray y){
        this.x = x;
        this.y = y;
        this.weight = 0;
        this.bias = 0;
    }
    public void fit(){
        double mean_x = x.mean();
        double mean_y = y.mean();
        double[] x_array = x.index(0);
        double[] y_array = y.index(0);
        double sum_num = 0;
        double sum_den = 0;
        for (int i = 0; i < x_array.length; i++){
            double xi = x_array[i];
            double yi = y_array[i];
            double num = (xi - mean_x) * (yi - mean_y);
            sum_num += num;
            double den = Math.pow((xi - mean_x),2);
            sum_den += den;
            System.out.println(""+sum_num+" "+sum_den);
        }
        this.weight = sum_num / sum_den;
        this.bias = mean_y - (weight * mean_x);
    }
    public JArray predict(JArray x){
        double[] x_array = x.index(0);
        double[] output = new double[x_array.length];
        for (int k = 0; k < x_array.length; k++){
            double prediction = (this.weight * x_array[k]) + this.bias;
            output[k] = prediction;   
        }
        JArray output_array = new JArray(output);
        return output_array;
    }
    public double getWeight(){
        return this.weight;
    }
    public double getBias(){
        return this.bias;
    }
}