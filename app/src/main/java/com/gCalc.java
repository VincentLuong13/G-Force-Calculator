package com;
import java.math.*;

/**
 * Created by vince on 9/19/2017.
 */

public class gCalc {

    double xDirect;
    double zDirect;


    public gCalc(double xDirect, double zDirect){
        this.xDirect = xDirect;
        this.zDirect = zDirect;
    }

    public double calcX(double enterX){

        return Math.round( xDirect + enterX/9.81 *1000.00)/1000.00;

    }

    public double calcZ(double enterZ){
        return Math.round(zDirect + enterZ/9.81 *1000.00 )/1000.00;
    }

}
