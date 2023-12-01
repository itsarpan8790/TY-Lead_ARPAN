package mvnp;

import org.testng.annotations.Test;

public class MavenP2 {

	@Test(groups = "smoke")
	public void smoketest2() {
		System.out.println("---Smoke--");
	}

	@Test(groups = "regression")
	public void regressionTest2() {
		System.out.println("---Regression--");
	}
}
