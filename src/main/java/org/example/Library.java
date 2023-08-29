package org.example;

import java.util.Arrays;
import java.util.Objects;

@SuppressWarnings("unused")
public class Library
{
    private Book[] books;

    public Library(Book[] books)
    {
        this.books = Objects.requireNonNull( books );
    }
    public Library()
    {
        this.books = new Book[0];
    }

    public String toString()
    {
        String str = "Bibliothek: \r\n";
        for (Book book : books)
        {
            //noinspection StringConcatenationInLoop
            str += "    " +book+ "\r\n";
        }
        return str;
    }

    public void addBook(Book book)
    {
        books = Arrays.copyOf(books, books.length + 1);
        books[ books.length-1 ] = book;
    }

    public Book removeBook(int index)
    {
        Book removedBook = null;

        if (0 <= index && index < books.length)
        {
            Book[] newBooks = new Book[books.length - 1];
            for (int i=0; i<newBooks.length; i++)
            {
                if (i<index)
                    newBooks[i] = books[i];
                else
                {
                    newBooks[i] = books[i+1];
                    if (i==index)
                        removedBook = books[i];
                }
            }
            books = newBooks;
        }
        return removedBook;
    }
}
