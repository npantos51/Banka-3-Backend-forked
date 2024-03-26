package rs.edu.raf.userservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.edu.raf.userservice.domains.model.Contact;
import rs.edu.raf.userservice.domains.model.Currency;

import java.util.List;
import java.util.Optional;

public interface ContactRepository extends JpaRepository<Contact, Long> {

    Optional<List<Contact>> findByUser_UserId(Long id);

}