
public class Square extends Rect {

	public Square() {
		super();
		changeSize(50,50);
	}
	
	@Override
	public void changeSize(int l, int w) {
		if(l==w) {
			changeSize(l,w);
		}
	}
}
//	public void changeSize(int len, int wid) {
//		if (len == wid) {
//			
//		}
//	}
	
//}
