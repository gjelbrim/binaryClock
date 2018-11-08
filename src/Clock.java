import processing.core.PApplet;

public class Clock extends PApplet{
	private int h, m, s;

	public void settings(){
		setSize(510,880);
	}

	public void setup(){
		background(55,133,142);
		fill(255,255,255,122);
		noStroke();
	}

	public void draw(){
		float cs = 100;

		h = hour();
		StringBuilder h2 = new StringBuilder(Integer.toBinaryString(h));
			while(h2.length() != 5){
				h2.insert(0, '0');
			}

		m = minute();
		StringBuilder m2 = new StringBuilder(Integer.toBinaryString(m));
			while(m2.length() != 6){
				m2.insert(0, '0');
			}


		s = second();
		StringBuilder s2 = new StringBuilder(Integer.toBinaryString(s));
			while(s2.length() != 6){
				s2.insert(0, '0');
			}

		setTitle();

		background(55,133,142);

		//h
		if(h2.charAt(0) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(75, 260, cs, cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(75, 260, cs, cs);
		}

		if(h2.charAt(1) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(75,400,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(75,400,cs,cs);
		}

		if(h2.charAt(2) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(75,540,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(75,540,cs,cs);
		}

		if(h2.charAt(3) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(75,680,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(75,680,cs,cs);
		}

		if(h2.charAt(4) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(75,820,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(75,820,cs,cs);
		}

		//m
		if(m2.charAt(0) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(250,120,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(250,120,cs,cs);
		}

		if(m2.charAt(1) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(250,260,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(250,260,cs,cs);
		}

		if(m2.charAt(2) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(250,400,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(250,400,cs,cs);
		}

		if(m2.charAt(3) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(250,540,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(250,540,cs,cs);
		}

		if(m2.charAt(4) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(250,680,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(250,680,cs,cs);
		}

		if(m2.charAt(5) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(250,820,cs,cs);

			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(250,820,cs,cs);
		}


		//seconds
		if(s2.charAt(0) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(425,120,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(425,120,cs,cs);
		}

		if(s2.charAt(1) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(425,260,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(425,260,cs,cs);
		}

		if(s2.charAt(2) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(425,400,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(425,400,cs,cs);
		}

		if(s2.charAt(3) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(425,540,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(425,540,cs,cs);
		}

		if(s2.charAt(4) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(425,680,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(425,680,cs,cs);
		}

		if(s2.charAt(5) == '1'){
			pushMatrix();
			fill(255,255,255);
			ellipse(425,820,cs,cs);
			popMatrix();
			fill(255,255,255,122);
		}else{
			ellipse(425,820,cs,cs);
		}
	}

	private void setTitle(){
		String tH = Integer.toString(h).length() != 2 ? '0'+Integer.toString(h)  : Integer.toString(h);
		String mH = Integer.toString(m).length() != 2 ? '0'+Integer.toString(m)  : Integer.toString(m);
		String sH = Integer.toString(s).length() != 2 ? '0'+Integer.toString(s)  : Integer.toString(s);
		surface.setTitle(tH+":"+mH+":"+sH+" - BinaryClock by @Leuchtmarker");
	}

	public static void main(String[] args){
		PApplet.main(new String[]{Clock.class.getName()});
	}

}