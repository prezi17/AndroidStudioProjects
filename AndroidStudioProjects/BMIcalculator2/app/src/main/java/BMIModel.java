package com.yorku.Rajwinder.bmicalculator;

public class BMIModel {

    private double weight;
    private double height;

    public BMIModel(String w, String h){
        this.weight = Double.parseDouble(w);
        this.height = Double.parseDouble(h);
    }

    public String getBMI(){
        double index = this.weight/(this.height * this.height);
        String results = String.format("%.1f", index);
        return results;
    }
}
