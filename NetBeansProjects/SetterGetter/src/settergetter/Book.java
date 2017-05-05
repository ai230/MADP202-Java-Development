/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package settergetter;

/**
 *
 * @author yamamotoai
 */
public class Book {

    private String title;
    private String author;
    private String publisher;
    private int crdate;

    /**
     * Constructor
     */
    public Book(String title, String author, String publisher, int crdate) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.crdate = crdate;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setCrdate(int crdate) {
        this.crdate = crdate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public int getCrdate() {
        return crdate;
    }

    @Override
    public String toString() {
        String description = "";
        description += "Title: \t" + title + "\n";
        description += "Author: \t" + author + "\n";
        description += "Publisher: \t" + publisher + "\n";
        description += "Copyright Date: \t" + crdate + "\n";
        return description;
    }

}
