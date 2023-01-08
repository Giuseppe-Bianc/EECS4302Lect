package org.dersbian.expression;

public class Addition extends Expression {
    private Expression left;
    private Expression rigth;

    public Addition(Expression left, Expression rigth) {
        this.left = left;
        this.rigth = rigth;
    }

    @Override
    public String toString() {
        return left.toString() + " + " + rigth.toString();
    }
}
