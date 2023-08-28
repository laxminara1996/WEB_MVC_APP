package in.laxmi.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import in.laxmi.entity.BookEntity;
import in.laxmi.repositroy.BookRepository;
@Controller
public class BookController {
	@Autowired
  private BookRepository repo;
	@GetMapping("/book")
	public ModelAndView getBookById(@RequestParam("id")  Integer id) {
		System.out.println(id);
		ModelAndView mv = new ModelAndView();
		Optional<BookEntity> findById = repo.findById(id);
		if(findById.isPresent()) {
			BookEntity be = findById.get();
			//sending data to view
			mv.addObject("book",be);
		}
		//setting view name
		System.out.println(mv);
		mv.setViewName("index");
		return mv;
	}
	
}
