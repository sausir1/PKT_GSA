package expression;

import java.time.temporal.ValueRange;
enum Types { STRING,INT,BOOL,CHAR,DEF}
public class VariableDeclaration extends Expression{
    public String id;
    public Types type;
    private String StrVal;
    private int numVal;
    private boolean boolVal;


    public int getNumVal() {
        return numVal;
    }

    public String getStrVal() {
        return StrVal;
    }

    public boolean isBoolVal() {
        return boolVal;
    }

    public VariableDeclaration(String id, Types type, String val){
        this.id = id;
        this.type  = type;
        switch (type){
            case STRING:
                this.StrVal = val.substring(1,val.length()-1);
                break;
            case INT:
                this.numVal = Integer.parseInt(val);
                break;
            case BOOL:
                this.boolVal = (val.contentEquals("true"))? true : false;
                break;
            case CHAR:
                this.StrVal = (val.length() == 3)? val.replace('"','\'') : "";
                break;
        }
    }

}


