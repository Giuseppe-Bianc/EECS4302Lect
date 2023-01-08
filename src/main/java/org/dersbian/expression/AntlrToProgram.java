package org.dersbian.expression;

import org.dersbian.antlrgen.ExprBaseVisitor;
import org.dersbian.antlrgen.ExprParser;

import java.util.ArrayList;
import java.util.List;

public class AntlrToProgram extends ExprBaseVisitor<Program> {

    public List<String> semanticErrors;

    /**
     * {@inheritDoc}
     *
     * <p>The default implementation returns the result of calling
     * {@link #visitChildren} on {@code ctx}.</p>
     *
     * @param ctx
     */
    @Override
    public Program visitProgram(ExprParser.ProgramContext ctx) {
        Program prog = new Program();

        semanticErrors = new ArrayList<>();
        AntlrToExpression expressionVisitor = new AntlrToExpression(semanticErrors);
        for (int i = 0; i < ctx.getChildCount(); i++) {
            if (i == ctx.getChildCount() - 1){

            } else {
                prog.addExpression(expressionVisitor.visit(ctx.getChild(i)));
            }
        }


        return super.visitProgram(ctx);
    }
}
