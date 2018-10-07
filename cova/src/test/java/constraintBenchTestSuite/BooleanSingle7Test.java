package constraintBenchTestSuite;

import de.upb.swt.cova.core.SMTSolverZ3;
import de.upb.swt.cova.data.ConstraintZ3;

import com.microsoft.z3.BoolExpr;

import org.junit.Assert;
import org.junit.Test;

import utils.ConstraintBenchTestFramework;

/**
 * 
 * 
 */
public class BooleanSingle7Test extends ConstraintBenchTestFramework {

  public BooleanSingle7Test() {
    targetTestClassName = "constraintBench.test.primTypes.BooleanSingle7";
  }

  @Test
  public void test() {
    BoolExpr expected = SMTSolverZ3.getInstance().makeBoolTerm("im(" + A + ")", true);// !im(A)
    BoolExpr actual = ((ConstraintZ3) results.get(15)).getExpr();
    boolean equivalent = SMTSolverZ3.getInstance().prove(expected, actual);
    Assert.assertTrue(equivalent);
  }
}