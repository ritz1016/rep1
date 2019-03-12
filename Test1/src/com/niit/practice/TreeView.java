package com.niit.practice;

public class TreeView {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0, temp = 0, man_height = 6;
		int []tree= {2,18,12,25,22,15,35,30,22,25,44,45,34,18,29,8,22,23};
		System.out.println("The tree he can see are of height : ");
		for(int i = 0; i<tree.length; i++){
			if(tree[i]>temp){
				System.out.println(tree[i]);
				temp=tree[i];
				c++;
			}
		}
		System.out.println("The Total number of trees he can see : "+c);
	}

}
