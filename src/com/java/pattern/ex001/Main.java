package com.java.pattern.ex001;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(10);
		bookShelf.appendBook(new Book("JAVA의 정석"));
		bookShelf.appendBook(new Book("그리스인 조르바"));
		bookShelf.appendBook(new Book("코스모스"));
		bookShelf.appendBook(new Book("모든 순간이 너였다"));
		bookShelf.appendBook(new Book("역사의 역사"));
		bookShelf.appendBook(new Book("성경"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
