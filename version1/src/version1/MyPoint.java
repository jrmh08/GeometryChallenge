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
public class MyPoint {
	private float x;
	private float y;
	
	public MyPoint(float x, float y) {
		this.setX(x);
		this.setY(y);
	}
	
	public void setX(float x) {
		this.x = x;
	}
	public void setY(float y) {
		this.y = y;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
	public float getDistance(float x, float y) {
		float distance = (float) Math.sqrt(Math.pow((x - this.x),2)+Math.pow((y-this.y),2));
		return distance;
	}
	public double getDistance(MyPoint point) {
		double distance = Math.sqrt(Math.pow((point.x - this.x),2)+(Math.pow((point.y-this.y),2)));
		System.out.println(distance);
		return distance;
	}
	public float getDistance() {
		float distance = (float) Math.sqrt(Math.pow((0 - this.x),2)+Math.pow((0-this.y),2));
		return distance;
	}
	
	void displayPoint() {
		System.out.println("("+this.x+","+this.y+")");
	}
	
        @Override
	public String toString() {
		return "("+this.x+","+this.y+")";
	}
	
	public int getQuadrant() {
		if (x > 0 && y > 0) {
			return 1;
		}else if(x < 0 && y > 0) {
			return 2;
		}else if(x < 0 && y < 0) {
			return 3;
		}else if(x > 0 && y < 0) {
			return 4;
		}else if (y == 0 && x != 0) {
			return 5;
		}else if (x == 0 && y != 0){
			return 6;
		}else {
			return 0;
		}
	}
	
	public float getAngle() {
		return 0;
	}
}
