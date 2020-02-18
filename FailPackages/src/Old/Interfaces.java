
public class Interfaces implements Measurable {
private  double mywidth;
private  double myheight;

public Interfaces (double a, double b) {
	mywidth = a;
	myheight = b;
}

public double getMywidth() {
	return mywidth;
}

public void setMywidth(double mywidth) {
	this.mywidth = mywidth;
}

public double getMyheight() {
	return myheight;
}

public void setMyheight(double myheight) {
	this.myheight = myheight;
}
public double getperimeter (double c) {
	mywidth = c;
	double d = c * 2;
	return d;
}
public double getarea (double g) {
	myheight = g;
	double f = g * 2;
	return f;
}
public String toString() {
	return "hghjghj";
}
}
