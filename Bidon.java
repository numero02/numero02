package lindenmayer;

import java.awt.geom.Point2D;
import java.util.Stack;

public class Bidon implements Turtle {
	
	Point2D position ;
	
	double angle;
	double x,y;
	Stack<Point2D> pile;
	
	public Bidon(){
	
	this.position = new Point2D.Double(x , y);
	this.angle = 0;
	this.pile= new Stack<Point2D>();
	}

	@Override
	
	public void draw() {
		this.angle = angle;
		this.position = new Point2D.Double(x+(2*Math.cos(angle)), y+(2*Math.sin(angle)));
		System.out.print("F");
	}

	@Override
	public void move() {
		this.angle = angle;
		this.position = new Point2D.Double(x+(2*Math.cos(angle)), y+(2*Math.sin(angle)));
		System.out.print("f");
		
	}

	@Override
	public void turnR() {
		this.angle = this.angle - 20;
	}

	@Override
	public void turnL() {

		this.angle = this.angle + 20;
	}

	@Override
	public void push() {
		this.pile.push(this.position);	 
	}

	@Override
	public void pop() {
		
		
	}

	@Override
	public void stay() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void init(Point2D position, double angle_deg) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Point2D getPosition() {
	
		return this.position ;
	}

	@Override
	public double getAngle() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void setUnits(double step, double delta) {
		// TODO Auto-generated method stub
		
	}

}
