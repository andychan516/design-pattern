package com.company.model;

public class Operation {
  private double numberA;
  private double numberB;

  public double getNumberA() {
    return numberA;
  }

  public void setNumberA(double numberA) {
    this.numberA = numberA;
  }

  public double getNumberB() {
    return numberB;
  }

  public void setNumberB(double numberB) {
    this.numberB = numberB;
  }

  @Override
  public String toString() {
    return "Operation{" +
      "numberA=" + numberA +
      ", numberB=" + numberB +
      '}';
  }


}


