package com.qian.aidl;

import com.qian.aidl.Book;

interface IBookManager {
     List<Book> getBookList();
     void addBook(in Book book);
}