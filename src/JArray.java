package src;

import java.util.ArrayList;
import java.util.Arrays;
public class JArray{
    protected ArrayList<double[]> jarray;
    public JArray(){
        this.jarray = new ArrayList<double[]>();
        double[] empty_array = new double[0];
        this.jarray.add(empty_array);
    }
    public JArray(double[] jarr){
        this.jarray = new ArrayList<double[]>();
        this.jarray.add(jarr);
    }
    public JArray(double[][] jarr){
        this.jarray = new ArrayList<double[]>();
        for (double[] x: jarr){
            jarray.add(Arrays.copyOf(x, x.length));
        }
    }
    public JArray(ArrayList<Double>jarr){
        double[] jarray = new double[jarr.size()];
        for(int i = 0; i < jarr.size();i++){
            jarray[i] = jarr.get(i);
        }
        this.jarray = new ArrayList<double[]>();
        this.jarray.add(jarray);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("JArray{\n");

        for (double[] array : jarray) {
            sb.append("  ").append(Arrays.toString(array)).append(",\n");
        }

        sb.append("}");
        return sb.toString();
    }
    public JArray zeros(int row, int column) {
        double[][] result_array = new double[row][column];
        for (int k = 0; k < row; k++) {
            Arrays.fill(result_array[k], 0); // Fill each row with zeros
        }
        return new JArray(result_array);
    }
    public JArray ones(int row, int column) {
        double[][] result_array = new double[row][column];
        for (int k = 0; k < row; k++) {
            Arrays.fill(result_array[k], 1); // Fill each row with ones
        }
        return new JArray(result_array);
    }
    public JArray range(int start,int stop){
        ArrayList<Double> result ;
        if (start < stop){
            result = new ArrayList<>();
            for (int i = start; i < stop; i ++){
                double new_i = (double) i;
                result.add(new_i);
            }
            return new JArray(result);
        }
        result = new ArrayList<>();
        for (int i = start; i > stop; i--){
            double new_i = (double) i;
            result.add(new_i);
        }
        return new JArray(result);
    }
    public JArray range(int start,int stop,int step){
        ArrayList<Double> result ;
        if (start < stop){
            result = new ArrayList<>();
            for (int i = start; i < stop; i += step){
                double new_i = (double) i;
                result.add(new_i);
            }
            return new JArray(result);
        }
        result = new ArrayList<>();
        for (int i = start; i > stop; i -= step){
            double new_i = (double) i;
            result.add(new_i);
        }
        return new JArray(result);
    }

    public JArray linspace(int start,int stop, int nums){
        double step = (double)(stop - start) / (double)nums;
        double[] samples = new double[nums];
        for(int i = 0; i < nums; i ++){
            double result = start + i * step;
            samples[i] = result;
        }
        return new JArray(samples);
    }
    
    public JArray eye(int N){
        JArray identity = new JArray().zeros(N,N);
        double[][] identity_matrix = identity.toDouble(N);
        for (int i = 0; i < N;i++){
            identity_matrix[i][i] = 1;
        }
        return new JArray(identity_matrix);
    }
    public double[][] toDouble(int size){
        double[][] result = new double[size][];
        int k = 0;
        for (double[] x:this.jarray){
            result[k] = x;
            k += 1;
        }
        return result;
    }
    public double[] shape() {
        double rows = jarray.size();
        double columns = jarray.isEmpty() ? 0 : jarray.get(0).length;

        return new double[] { rows, columns };
    }

    // Method to calculate the mean of all elements in the 2D array
    public double mean() {
        double totalSum = 0;
        int totalCount = 0;

        for (double[] row : jarray) {
            for (double element : row) {
                totalSum += element;
                totalCount++;
            }
        }
        return totalCount == 0 ? 0 : totalSum / totalCount;
    }
    public double[] index(int value){
        double[] array = jarray.get(value);
        return array; 
    }

    // public JArray zeros(int x,int y){

    // }
}