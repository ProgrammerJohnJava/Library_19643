
package Domain;

import java.util.Date;
import java.util.List;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Book {
    @Id
    private String bookId = UUID.randomUUID().toString();
    private String title;
    private String publishingHouse;
    @Temporal(TemporalType.DATE)
    private Date dateOfPublication;
    private String author;
    private Integer pages;
    
    @ManyToOne
    private BookCategory bookCategory;
    
    @OneToMany(mappedBy = "book")
    private List<CheckInOut> checkInOut;
    
    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    public void setDateOfPublication(Date dateOfPublication) {
        this.dateOfPublication = dateOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public BookCategory getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(BookCategory bookCategory) {
        this.bookCategory = bookCategory;
    }

    public List<CheckInOut> getCheckInOut() {
        return checkInOut;
    }

    public void setCheckInOut(List<CheckInOut> checkInOut) {
        this.checkInOut = checkInOut;
    }
    
}
