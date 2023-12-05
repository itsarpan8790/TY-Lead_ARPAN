package LearnProfiling;

import org.testng.annotations.Test;

public class MavenP1 {

	@Test(groups = "smoke")
	public void smoketest1() {
		System.out.println("---Smoke--");
	}

	@Test(groups = "regression")
	public void regressionTest1() {
		System.out.println("---Regression--");
	}

}
