package com.gevichiatto.sisgu.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Component;

import com.gevichiatto.sisgu.entity.Users;
import com.gevichiatto.sisgu.repository.UsersRepository;

@Component
public class UsersService {

    /* Este arquivo é um protótipo.
    ** Aqui a implementação do serviço dos usuários seguiria a mesma
    ** lógica das demais implementações de serviços. Porem, os métodos
    ** para inserção de dados no banco levariam em conta mais atributos,
    ** já que a classe User possui mais atributos do que as classes Cargos 
    ** e Perfis.
    */
	
	private UsersRepository usersRepository;

    public UsersService(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    public List<Users> getUsers() {
        return usersRepository.findAll();
    }
    
    public Users savePerfil(Users users) {
        System.out.println("valor gerando" + users);
    	return usersRepository.save(users);
    }

    public Users updatePerfil(Users users) {
        Optional<Users> atualizavel = usersRepository.findById(users.getId());
        System.out.println("Atualizavel: " + atualizavel);
        return usersRepository.save(users);
    }
}