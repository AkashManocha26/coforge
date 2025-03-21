package coforge.com.repository;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import coforge.com.model.Person;
@Repository
public interface PersonRepository extends JpaRepository<Person, Long>{
    public List<Person> findBypersonName(String personName);
    //public List<Person> findBypersonNameAndpersonId(int id, String name);
}