
public class DrawStuff {
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		t.changeSize(200,200);
		t.makeVisible();
		t.slowMoveHorizontal(90);
		
		Rect r = new Rect();
		r.makeVisible();
		r.changeSize(200,50);
		r.changeColor("magenta");
		
		Trap a = new Trap();
		a.changeSize(100,40);
		a.changeColor("green");
		a.slowMoveDiagonal(40,1,1);
		a.makeVisible();
		
		Square s = new Square();
		s.makeVisible();
		s.changeColor("Purple");
	}
	
}
