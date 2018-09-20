package fr.ubo.tetris;
import org.junit.*;
import org.junit.BeforeClass;

import fr.ubo.tetris.Shape;
import fr.ubo.tetris.Tetrominoes;


public class TestShape {
	private static Shape shape;

	@BeforeClass
	public static void setup() {
		shape = new Shape();
	}
	
	@Test
	public void setRandomShape() {
		//Assert.assertEquals(Tetrominoes.NoShape, shape.getClass());
		shape.setRandomShape();
		Assert.assertNotEquals(Tetrominoes.NoShape, shape.getShape());
	}
}
