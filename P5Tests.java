import static org.junit.Assert.*;
import org.junit.Test;

public class P5Tests {
	
	// *************************** MainPanel.convertToInt() tests
	
	// test convertToInt() functionality with a positive number
	// Here we will use the edge case of 1
	@Test
	public void testConvertToIntPos(){
		MainPanel mp = new MainPanel(15);
		int input = 1;
		int output = mp.convertToInt(input);
		assertTrue(output == input);
	}
	
	// test convertToInt() functionality with zero
	// Zero is kind of in its own class, being not positive nor negative
	@Test
	public void testConvertToIntZero(){
		MainPanel mp = new MainPanel(15);
		int input = 0;
		int output = mp.convertToInt(input);
		assertTrue(output == input);
	}
	
	// test convertToInt() functionality with a negative number
	// Here we will use the edge case of -1
	@Test
	public void testConvertToIntNeg(){
		MainPanel mp = new MainPanel(15);
		int input = -1;
		int output = mp.convertToInt(input);
		assertTrue(output == input);
	}
	
	// test convertToInt() functionality with a positive number
	// Here we will use the edge case of 2^32-1 (a.k.a. as high as ints can go)
	@Test
	public void testConvertToIntMax(){
		MainPanel mp = new MainPanel(15);
		int input = Integer.MAX_VALUE;
		int output = mp.convertToInt(input);
		assertTrue(output == input);
	}
	
	// test convertToInt() functionality with a negative number
	// Here we will use the edge case of -(2^32) (a.k.a. as low as ints can go)
	@Test
	public void testConvertToIntMin(){
		MainPanel mp = new MainPanel(15);
		int input = Integer.MIN_VALUE;
		int output = mp.convertToInt(input);
		assertTrue(output == input);
	}
	
	// *************************** Cell.toString() tests
	
	// Make sure toString() acts appropriately when the cell is alive/red.
	// That is, it should output "X" since it is alive
	@Test
	public void testToStringRed(){
		Cell cell = new Cell();
		cell.setAlive(true);
		// The cell should now be alive
		assertTrue(cell.toString().equals("X"));
	}
	
	// Make sure toString() acts appropriately when the cell is grey/dead.
	// That is, it should output "." since it is dead
	@Test
	public void testToStringGrey(){
		Cell cell = new Cell();
		// The cell should now be dead
		assertTrue(cell.toString().equals("."));
	}
	
	// Make sure toString() acts appropriately when the cell is green/dead
	// That is, it should output "." since it is dead
	@Test
	public void testToStringGreen(){
		Cell cell = new Cell();
		cell.setAlive(true);
		cell.setAlive(false);
		// The cell should now be dead, but formerly alive
		assertTrue(cell.toString().equals("."));
	}
}
