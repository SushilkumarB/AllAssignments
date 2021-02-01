package com.thinkitive;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.thinkitive.util.PrintUtil;
import com.thinkitive.util.SortUtil;
import com.thinkitive.util.StoreUtil;

public class Demo {

	public static void main(String[] args) {

		Set<String> authors1 = new HashSet<String>();
		Set<String> authors2 = new HashSet<String>();
		Set<String> authors3 = new HashSet<String>();
		Set<String> authors4 = new HashSet<String>();

		authors1.add("a11");
		authors1.add("a12");

		authors2.add("a21");
		authors2.add("a22");

		authors3.add("a31");
		authors3.add("a32");
		
		authors4.add("a41");
		authors4.add("a42");

		Book b1 = new Book(1, "ABC", authors1, 500);
		Book b2 = new Book(12, "MNO", authors2, 400);
		Book b3 = new Book(41, "AAA", authors3, 580);
		Book b4 = new Book(71, "DEF", authors4, 300);

		StoreUtil<Book> store = new StoreUtil<Book>();
		store.addRecord(b1);
		store.addRecord(b2);
		store.addRecord(b3);
		store.addRecord(b4);
		List<Book> books = store.getRecords();

		PrintUtil.printRecords(books);
		SortUtil.sortByName(books);
		PrintUtil.printRecords(books);
		
		

	}
}