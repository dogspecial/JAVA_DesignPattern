package com.java.pattern.ex001;

public class Main {

	public static void main(String[] args) {
		BookShelf bookShelf = new BookShelf(10);
		bookShelf.appendBook(new Book("JAVA�� ����"));
		bookShelf.appendBook(new Book("�׸����� ������"));
		bookShelf.appendBook(new Book("�ڽ���"));
		bookShelf.appendBook(new Book("��� ������ �ʿ���"));
		bookShelf.appendBook(new Book("������ ����"));
		bookShelf.appendBook(new Book("����"));
		
		Iterator it = bookShelf.iterator();
		while(it.hasNext()) {
			Book book = (Book)it.next();
			System.out.println(book.getName());
		}

	}

}
