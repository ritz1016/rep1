package com.niit.box;

public class Box {
	int len;
	int bre;
	int hei;
	public Box(){}
	public Box (int l, int b, int h){
		this.len = l;
		this.bre = b;
		this.hei = h;
	}
	public Box (int l){
		this.len= this.bre = this.hei = l;
	}

}
