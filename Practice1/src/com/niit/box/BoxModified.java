package com.niit.box;

public class BoxModified extends Box{
	int col;
	public BoxModified() {	}
	public BoxModified(int l, int b, int h, int c){
		super(l, b, h);
		col = c;
	}
	public BoxModified(int l, int b, int h){
		this(l, b, h, 0);
//		super(l, b, h);
//		col = 0;
	}
	public BoxModified(int l, int c){
		super(l);
		col = c;
	}
	public BoxModified(int l){
		this(l, 0);
//		super(l);
//		col = 0;
	}

}
