/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package version1;

/**
 *
 * @author jerem
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		MyPoint p1 = new MyPoint(0,-9);
		MyPoint p2 = new MyPoint(-10, 6);
		
		p1.getDistance(p2);
		System.out.println(p1.getDistance(-10, 6));
		System.out.println(p1.getDistance());
		p2.displayPoint();
		System.out.println(p1.getQuadrant());
	}
    
}
