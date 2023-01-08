package org.dersbian.expression;

public class VariableDeclaration extends Expression {
    private String id;
    private String type;
    private int value;

    public VariableDeclaration(String id, String type, int value) {
        this.id = id;
        this.type = type;
        this.value = value;
    }
    
    
    
}
