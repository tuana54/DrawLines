package DrawLines;

public class Line {
	private int startX,startY,endX,endY;
	public Line(int sX,int sY,int eX,int eY) {
		startX=sX;
		startY=sY;
		endX=eX;
		endY=eY;
	}
	
	public int gettStartX() {
		return startX;
	}
	
	public void setStartX(int startX) {
		this.startX=startX;
	}
	
	public int getStartY() {
		return startX;
	}
	
	public void setStartY() {
		this.startY=startY;
	}
	
	public int getEndX() {
		return endX;
	}
	
	public void setEndX(int endX) {
		this.endX=endX;
	}
	public int getEndY() {
		return endY;
	}
	
	public void setEndY(int endY) {
		this.endY=endY;
	}
}
