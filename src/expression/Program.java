package expression;

import java.util.ArrayList;
import java.util.List;

public class Program {
    public List<Expression> expresions;

    public Program(){
        this.expresions = new ArrayList<>();
    }

    public void addExpressions(Expression e){
        expresions.add(e);
    }
}
