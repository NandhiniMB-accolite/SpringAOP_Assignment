package accolite.spring.javaapproach;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


public class Triangle {
	
@Autowired
@Qualifier("pointA")
private Point pointA;
@Autowired
@Qualifier("pointB")
private Point pointB;
@Autowired
@Qualifier("pointC")
private Point pointC;
@Autowired
@Qualifier("pointD")
private Point pointD;

public Triangle(double height, double width) {
	
	this.height = height;
	this.width = width;
}
private double height;
private double width;
public Point getPointA() {
	return pointA;
}
public void setPointA(Point pointA) {
	this.pointA = pointA;
}
public Point getPointB() {
	return pointB;
}
public void setPointB(Point pointB) {
	this.pointB = pointB;
}
public Point getPointC() {
	return pointC;
}
public void setPointC(Point pointC) {
	this.pointC = pointC;
}
public Point getPointD() {
	return pointD;
}
public void setPointD(Point pointD) {
	this.pointD = pointD;
}
//public float getHeight() {
//	return height;
//}
//
//@Value("15.8")
//public void setHeight(float height) {
//	this.height = height;
//}
//public float getWidth() {
//	return width;
//}
//
//@Value("12.7")
//public void setWidth(float width) {
//	this.width = width;
//}

public void draw() {
	  System.out.println(" Triangle Drawn with points \nPointA "+getPointA().getX()+""+getPointA().getY()+"\nPointB "
			  + getPointB().getX()+""+getPointB().getY() +"\nPointC" + getPointC().getX() + getPointC().getY() +"\nPointD"+
			  getPointD().getX()+getPointD().getY() +"\nAnd with height and width" + this.height + this.width);
	  }

}
