
package Domain;

import java.util.Date;
import java.util.UUID;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class CheckInOut {
    @Id
    private String checkInOutId= UUID.randomUUID().toString();
    //Status is either borrowed or available
    private String status;
    @Temporal(TemporalType.DATE)
    private Date borrowDate;
    @Temporal(TemporalType.DATE)
    private Date returnedDate;
    @Enumerated(EnumType.STRING)
    private OperationCategory operationCategory;
    
    @ManyToOne
    private Client client;
    
    @ManyToOne
    private Book book;
    
    public String getCheckInOutId() {
        return checkInOutId;
    }

    public void setCheckInOutId(String checkInOutId) {
        this.checkInOutId = checkInOutId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getBorrowDate() {
        return borrowDate;
    }

    public void setBorrowDate(Date borrowDate) {
        this.borrowDate = borrowDate;
    }

    public Date getReturnedDate() {
        return returnedDate;
    }

    public void setReturnedDate(Date returnedDate) {
        this.returnedDate = returnedDate;
    }


    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public OperationCategory getOperationCategory() {
        return operationCategory;
    }

    public void setOperationCategory(OperationCategory operationCategory) {
        this.operationCategory = operationCategory;
    }
    
    
}
