package expression;

import operations.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import types.Bool;
import types.Char;
import types.Number;
import types.String;

import java.util.ArrayList;
import java.util.HashMap;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ExpressionProcessorTest {

    ExpressionProcessor ep;

    @BeforeEach
    void setUp() {
        ep = new ExpressionProcessor(new ArrayList<>());
    }

    @Test
    void getInteger() {
        assertEquals(0, this.ep.getInteger("a"));
    }

    @Test
    void argumentsToMap() {
    }

    @Test
    void getResultsOfMethod() {
    }

    @Test
    void getResults() {
    }

    @Test
    void testGetResults() {
        ExpressionProcessor ep2 = new ExpressionProcessor(new ArrayList<>());
        VariableDeclaration var = Mockito.mock(VariableDeclaration.class);
        HashMap<java.lang.String, Expression> map = Mockito.mock(HashMap.class);
        var.id = "a";
        var.val = new Number(5);
       var.type = Types.INT;
        assertThat(ep2.getResults(var, map)).hasSize(0);

        var.id= "ab";
        var.val = new String("15");
        var.type = Types.STRING;
        assertThat(ep2.getResults(var, map)).hasSize(0);

        var.id = "ac";
        var.val = new Char('1');
        var.type = Types.CHAR;
        assertThat(ep2.getResults(var, map)).hasSize(0);

        var.id ="avcas";
        var.val = new Bool(true);
        var.type = Types.BOOL;
        assertThat(ep2.getResults(var, map)).hasSize(0);
    }

    @Test
    void getResultOf() {
        HashMap<java.lang.String, Expression> map = new HashMap<>();

        Expression num = new Number(5);
        int result = this.ep.getResultOf(num, map);
        assertEquals(5, result);

        Expression add = new Addition(new Number(4), new Number(7));
        int result2 = this.ep.getResultOf(add, map );
        assertEquals(11, result2);

        Expression sub = new Subtraction(new Number (74), new Number(14));
        int result3 = ep.getResultOf(sub, map);
        assertEquals(60, result3);

        Expression mult = new Multiplication(new Number(4), new Number(4));
        int result4 = ep.getResultOf(mult, map);
        assertEquals(16, result4);

        Expression div = new Division(new Number(4), new  Number(2));
        int result5 = this.ep.getResultOf(div, map);
        assertEquals(2, result5);

        map.put("abc", new Number(14));

        Expression var = new Variable("abc");
        int result6 = this.ep.getResultOf(var, map);
        assertEquals(14, result6);

        Expression assg = new Assignment("bce", new Number(177));
        int result7 = this.ep.getResultOf(assg, map);
        assertEquals(177, result7);

        ArrayList<java.lang.String> stiring = new ArrayList<>();
        stiring.add("5");
        Expression intarr = new IntArray(stiring);
        int result8 = this.ep.getResultOf(intarr, map);
        assertEquals(5, result8);

    }

    @Test
    void getResultOfBool() {

        Number num1 = new Number(16);
        Number num2 = new Number(6);
        Number num3 = new Number(26);
        HashMap<java.lang.String, Expression> map = new HashMap<>();

        Expression eq1 = new Equals(num1, num1);
        boolean eq1r = ep.getResultOfBool(eq1, map);
        assertTrue(eq1r);

        Expression eq2 = new Equals(num2, num1);
        boolean eq2r = ep.getResultOfBool(eq2, map);
        assertFalse(eq2r);


        Expression egt1 = new EqualsOrGreaterThan(num1, num2);
        boolean egt1r = ep.getResultOfBool(egt1, map);
        assertTrue(egt1r);

        Expression egt2 = new EqualsOrGreaterThan(num2, num3);
        boolean egt2r = ep.getResultOfBool(egt2, map);
        assertFalse(egt2r);

        Expression eld1 = new EqualsOrLessThan(num1, num2);
        boolean eld1r = ep.getResultOfBool(eld1, map);
        assertFalse(eld1r);

        Expression eld2 = new EqualsOrLessThan(num2, num2);
        boolean eld2r = ep.getResultOfBool(eld2, map);
        assertTrue(eld2r);

        Expression gt1 = new GreaterThan(num1, num2);
        boolean gt1r = ep.getResultOfBool(gt1, map);
        assertTrue(gt1r);


        Expression gt2 = new GreaterThan(num1, num3);
        boolean gt2r = ep.getResultOfBool(gt2, map);
        assertFalse(gt2r);


        Expression ld1 = new LessThan(num1, num2);
        boolean ld1r = ep.getResultOfBool(ld1, map);
        assertFalse(ld1r);

        Expression ld2 = new LessThan(num2, num1);
        boolean ld2r = ep.getResultOfBool(ld2, map);
        assertTrue(ld2r);


    }


    @Test
    void getResultOfArray() {
        HashMap<java.lang.String, Expression> map = Mockito.mock(HashMap.class);
        IntArray intArr = Mockito.mock(IntArray.class, Mockito.RETURNS_DEEP_STUBS);
        Mockito.when(intArr.getValue(0)).thenReturn("5");
        int result = ep.getResultOfArray(intArr,map, "0");
        assertEquals(5, result);
        assertNotEquals(16, result);
        Number num = Mockito.mock(Number.class);
        int result2 = ep.getResultOfArray(num, map , "0");
        assertEquals(0, result2);
    }

    @Test
    void forTo() {
    }
}