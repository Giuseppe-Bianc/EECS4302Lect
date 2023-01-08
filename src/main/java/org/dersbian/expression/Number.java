package org.dersbian.expression;
public class Number extends Expression {
    private int num;

    public Number(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        Integer num = new Integer(this.num);
        return num.toString();
    }
}
