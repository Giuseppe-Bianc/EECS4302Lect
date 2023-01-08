package org.dersbian.expression;


public class Variable extends Expression {
    private String id;

    public Variable(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return id;
    }    
}
