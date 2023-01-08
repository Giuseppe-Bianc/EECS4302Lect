package org.dersbian.expression;

import java.util.ArrayList;
import java.util.List;

public class Program {
    private List<Expression> expresions;

    public Program() {
        this.expresions = new ArrayList<>();
    }

    public void addExpression(Expression e){
        this.expresions.add(e);
    }
}
