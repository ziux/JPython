// Autogenerated AST node
package pers.xia.jpython.ast;
import pers.xia.jpython.object.PyObject;
import java.io.DataOutputStream;
import java.io.IOException;

public class withitemType{
    public exprType context_expr;
    public exprType optional_vars;

    public withitemType(exprType context_expr, exprType optional_vars) {
        this.context_expr = context_expr;
        this.optional_vars = optional_vars;
    }

    public String toString() {
        return "withitemType";
    }

    public void pickle(DataOutputStream ostream) throws IOException {
    }

    public Object accept(VisitorIF visitor) throws Exception {
        traverse(visitor);
        return null;
    }

    public void traverse(VisitorIF visitor) throws Exception {
    }

}