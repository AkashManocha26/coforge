package coforge.com.web;

import coforge.com.model.Person;
import coforge.com.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PersonController {
    @Autowired
    PersonRepository repository;

    @PostMapping("/allperson")
    public Person addPerson(@RequestBody Person p){
        return repository.save(p);
    }
    @GetMapping("/allperson")
    public List<Person> addPerson(){
        return repository.findAll();
    }
}
