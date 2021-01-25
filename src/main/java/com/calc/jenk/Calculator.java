package com.calc.jenk;

public class Calculator {

    // We are going to do with 2 or 3 numbers
    private double _firstnumber;
    private double _secondnumber;
    private double _thirdnumber = 1;
    private double _resultado;

    public Calculator(double first, double second) {
        this._firstnumber = first;
        this._secondnumber = second;
    }

    public Calculator(double first, double second, double third) {
        this._firstnumber = first;
        this._secondnumber = second;
        this._thirdnumber = third;
    }

    public void sum() {
        this._resultado = this._firstnumber + this._secondnumber + this._thirdnumber;
        System.out.println("The answer of multiply is: " + this._resultado);
    }

    public void subtract() {
        this._resultado = this._firstnumber - this._secondnumber - this._thirdnumber;
        System.out.println("The answer of multiply is: " + this._resultado);
    }


    public void multiply() {
        this._resultado = this._firstnumber * this._secondnumber * this._thirdnumber;
        System.out.println("The answer of multiply is: " + this._resultado);
    }

    public void divide() {
        this._resultado = this._firstnumber / this._secondnumber;
        System.out.println("The answer of divide is: " + this._resultado);
    }
}

