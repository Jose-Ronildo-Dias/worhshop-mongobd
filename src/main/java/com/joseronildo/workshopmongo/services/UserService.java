package com.joseronildo.workshopmongo.services;

import com.joseronildo.workshopmongo.domain.User;
import com.joseronildo.workshopmongo.dto.UserDTO;
import com.joseronildo.workshopmongo.repository.UserRepository;
import com.joseronildo.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;
import java.util.List;

@Service
public class UserService {

    @Autowired
    private UserRepository repo;

    public List<User> findAll(){
        return repo.findAll();
    }
    public User findById(String id) {
        Optional<User> obj = repo.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado"));
    }
    // Metodo para inserir user

    public User insert(User obj) {
        return repo.insert(obj);
    }
    // Metodo para deletar user

    public void delete(String id) {
        findById(id);
        repo.deleteById(id);
    }

    public User fromDTO(UserDTO objDto) {
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
    }

}
