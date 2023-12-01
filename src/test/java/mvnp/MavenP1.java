package mvnp;

import org.testng.annotations.Test;

public class MavenP1 {

	@Test(groups = "Smoke")
	public void smoketest1() {
		System.out.println("---Smoke--");
	}

	@Test(groups = "regression")
	public void regressionTest1() {
		System.out.println("---Regression--");
	}

}
