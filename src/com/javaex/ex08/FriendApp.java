package com.javaex.ex08;
import java.util.*;

public class FriendApp {
	public static void main(String[] args) {
        Friend[] fArray = new Friend[3];
        Scanner sc = new Scanner(System.in);        

        System.out.println("친구를 3명 등록해 주세요");

        for(int i = 0; i < fArray.length; i++) {
        	String fInfo = sc.nextLine();
        	String[] sArray = fInfo.split(" ");
        	
        	fArray[i] = new Friend(sArray[0], sArray[1], sArray[2]);
        }
        
        for (int i = 0; i < fArray.length; i++) {
        	fArray[i].showInfo();
        }
        sc.close();
    }
}