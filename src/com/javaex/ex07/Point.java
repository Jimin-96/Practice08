package com.javaex.ex07;

public class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	// equals() 메소드를 작성하세요.

	public boolean equals(Object obj) {

		Point p = (Point) obj;
		if (this.x == p.x) {
			return true;
		} else {
			return false;
		}
	}

}
