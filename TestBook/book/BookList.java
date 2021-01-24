package javaSE.TestBook.book;

import java.util.Arrays;

/**
 * @program: class
 * @description:
 * @author: hdc
 * @Date: 2021-01-16
 * @Time: 19:00
 **/


public class BookList {
    private Book[] books = new Book[100];
    private int usedSized = 0;

    public BookList() {
        books[0] = new Book("西游记","吴承恩",100,"小说");
        books[1] = new Book("三国演义","罗贯中",100,"小说");
        books[2] = new Book("水浒传","施耐庵",100,"小说");
        this.usedSized = 3;
    }

    //可以吧所有的草案做都写到这个类中，因为每一个操作都是操作Books


    public int getUsedSized() {
        return usedSized;
    }

    public void setUsedSized(int usedSized) {
        this.usedSized = usedSized;
    }

    public void setBooks(int pos, Book book){
        this.books[pos] = book;
    }

    public Book getBook(int pos){
        return  this.books[pos];
    }

    @Override
    public String toString() {
        return "BookList{" +
                "books=" + Arrays.toString(books) +
                ", usedSized=" + usedSized +
                '}';
    }
}
