package operations;

import expression.Expression;

import java.util.List;

public class IntArray extends Expression {
    final List<String> value;

    public IntArray(List<String> value) {
        this.value = value;
    }
    public String getValue(int id){
        return this.value.get(id);
    }

    @Override
    public String toString() {
        return String.valueOf(this.value);
    }
}
