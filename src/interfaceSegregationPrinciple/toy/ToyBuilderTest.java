package interfaceSegregationPrinciple.toy;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ToyBuilderTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void testBuildToyHouse() {
		ToyHouse toyHouse = ToyBuilder.buildToyHouse();
		System.out.println(toyHouse);
	}

	@Test
	void testBuildToyCar() {
		ToyCar toyCar = ToyBuilder.buildToyCar();
		System.out.println(toyCar);
	}

	@Test
	void testBuildToyPlane() {
		ToyPlane toyPlane = ToyBuilder.buildToyPlane();
		System.out.println(toyPlane);
	}

}
