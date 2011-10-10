package goto2011aar;

import org.junit.Test;
import org.junit.runner.RunWith;

import fitnesse.junit.FitNesseSuite;
import fitnesse.junit.FitNesseSuite.FitnesseDir;
import fitnesse.junit.FitNesseSuite.Name;
import fitnesse.junit.FitNesseSuite.OutputDir;

@RunWith(FitNesseSuite.class)
@Name("Goto2011aarDemo")
//@Name("Goto2011aarDemo.ExampleTest4.ExampleTest4")
@FitnesseDir("./fitnesse")
@OutputDir("./fitnesse/results")
public class AllTests {
	@Test
	public void dummy() throws Exception {
	}
}
