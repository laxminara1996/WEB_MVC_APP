package in.laxmi.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;

import in.laxmi.entity.BookEntity;

public interface BookRepository extends JpaRepository<BookEntity, Integer> {

}
