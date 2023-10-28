package com.exemplodto.exemplodto.service;

import com.exemplodto.exemplodto.dto.UserDTO;
import com.exemplodto.exemplodto.entity.User;
import com.exemplodto.exemplodto.repository.UserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    // o findById() retorna um objeto Optional

    /* A transação é uma unidade de trabalho isolada que leva o banco de dados de um estado consistente a outro estado
       consistente. Pense em termos de transações de negócio mesmo. */
    @Transactional
    public UserDTO buscarId(Long id){
        User user = userRepository.findById(id).get();
        UserDTO dto = new  UserDTO(user);
        return dto;
    }
}
