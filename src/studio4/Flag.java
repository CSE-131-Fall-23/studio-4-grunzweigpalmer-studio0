package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		
		StdDraw.setPenColor(0, 0, 0);
		StdDraw.setPenRadius(0.03);
		StdDraw.circle(0.5, 0.5, 0.18);
		
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(.5, 0.6, .5, 0.15);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(0.37, 0.6, 0.02);
		StdDraw.filledCircle(1-0.37, 0.6, 0.02);
		
		StdDraw.setPenRadius(0.03);
		StdDraw.rectangle(.5, 0.5, 0.5, 0.3);
		
		
		
	}
}