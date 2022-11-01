package com.ksr.eb.main;

import com.ksr.eb.service.ConnectionService;
import java.util.*;
public class EBMain {

	public static void main(String[] args) {
//		TODO Auto-generated method stub
//		ConnectionService con=new ConnectionService();
//		con.calculateBillAmt();
int previous,current;String type;
Scanner sc=new Scanner(System.in);
current=sc.nextInt();
previous=sc.nextInt();

type=sc.next();
ConnectionService con=new ConnectionService();
System.out.println(con.generateBill(current,previous,type));

	}

}
