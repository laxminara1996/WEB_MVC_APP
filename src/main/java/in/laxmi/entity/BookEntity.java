package in.laxmi.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="book")
@Data
public class BookEntity {
	@Id
private Integer bookId;
private String bookName;
private Double bookPrice;
}
