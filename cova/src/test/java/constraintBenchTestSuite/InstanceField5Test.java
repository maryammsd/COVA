package constraintBenchTestSuite;

import de.upb.swt.cova.core.SMTSolverZ3;
import de.upb.swt.cova.data.ConstraintZ3;

import com.microsoft.z3.BoolExpr;

import org.junit.Assert;
import org.junit.Test;

import utils.ConstraintBenchTestFramework;

/**
 * 
 */
public class InstanceField5Test extends ConstraintBenchTestFramework {

  public InstanceField5Test() {
    targetTestClassName = "constraintBench.test.instanceField.InstanceField5";
  }

  @Test
  public void test() {
    BoolExpr termA = SMTSolverZ3.getInstance().makeBoolTerm(A, false);
    BoolExpr actual = ((ConstraintZ3) results.get(38)).getExpr();
    boolean equivalent = SMTSolverZ3.getInstance().prove(termA, actual);
    Assert.assertTrue(equivalent);
  }
}