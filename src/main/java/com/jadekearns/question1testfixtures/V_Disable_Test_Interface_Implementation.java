package com.jadekearns.question1testfixtures;

import java.text.DecimalFormat;

public class V_Disable_Test_Interface_Implementation implements V_Disable_Test_Interface{

    @Override
    public double metricValue(double weight, double height) {
        DecimalFormat df = new DecimalFormat("#.##");
        return Double.parseDouble(df.format(weight/(height*height)));
    }
}
