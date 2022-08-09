package com.Entity;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;
    String Title;
    String Subject;
    String Author;
    String PublishingCompany;
    Integer NumberPublishing;
    Integer Volume;

    public Book() {
    }

    public Book(Long id, String title, String subject, String author, String publishingCompany, Integer numberPublishing, Integer volume) {
        this.id = id;
        Title = title;
        Subject = subject;
        Author = author;
        PublishingCompany = publishingCompany;
        NumberPublishing = numberPublishing;
        Volume = volume;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public String getSubject() {
        return Subject;
    }

    public void setSubject(String subject) {
        Subject = subject;
    }

    public String getAuthor() {
        return Author;
    }

    public void setAuthor(String author) {
        Author = author;
    }

    public String getPublishingCompany() {
        return PublishingCompany;
    }

    public void setPublishingCompany(String publishingCompany) {
        PublishingCompany = publishingCompany;
    }

    public Integer getNumberPublishing() {
        return NumberPublishing;
    }

    public void setNumberPublishing(Integer numberPublishing) {
        NumberPublishing = numberPublishing;
    }

    public Integer getVolume() {
        return Volume;
    }

    public void setVolume(Integer volume) {
        Volume = volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(Title, book.Title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, Title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", Title='" + Title + '\'' +
                ", Subject='" + Subject + '\'' +
                ", Author='" + Author + '\'' +
                ", PublishingCompany='" + PublishingCompany + '\'' +
                ", NumberPublishing=" + NumberPublishing +
                ", Volume=" + Volume +
                '}';
    }
}
