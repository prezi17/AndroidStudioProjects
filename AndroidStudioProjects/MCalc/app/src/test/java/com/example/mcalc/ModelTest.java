package com.example.mcalc;

import android.support.v4.widget.TextViewCompat;

import org.junit.Assert;
import org.junit.Test;



public class ModelTest {
    @Test
            public void testpayment() {
        Mortgagemodel myModel;
        myModel = new Mortgagemodel("700000", "25", "2.75");
        Assert.assertEquals("c1", "$3,229.18", myModel.computePayment());


        myModel = new Mortgagemodel("300000", "20", "4.5");
        Assert.assertEquals("c2", "$1,897.95", myModel.computePayment());
    }
}
