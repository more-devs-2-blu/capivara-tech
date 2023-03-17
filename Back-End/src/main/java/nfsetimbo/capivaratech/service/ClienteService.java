package nfsetimbo.capivaratech.service;

import nfsetimbo.capivaratech.exception.UserNotFoundException;
import nfsetimbo.capivaratech.model.Cliente;
import nfsetimbo.capivaratech.repository.ClienteRepository;
import org.hibernate.validator.constraints.UUID;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static jakarta.persistence.GenerationType.UUID;

@Service
public class ClienteService {

    private final ClienteRepository clienteRepository;

    @Autowired
    public ClienteService(ClienteRepository clienteRepository){this.clienteRepository = clienteRepository; }

    public List<Cliente> findAllClientes() {
        return clienteRepository.findAll();
    }

    public Cliente findClienteById(Long id) {
        return clienteRepository.findClienteById(id).orElseThrow(()-> new UserNotFoundException("Cliente by id: "+id+" was not found"));
    }

    public Cliente addCliente(Cliente cliente) {
        cliente.setClienteCode(java.util.UUID.randomUUID());
        return clienteRepository.save(cliente);
    }

    public Cliente updateCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void deleteCliente(Long id) {
        clienteRepository.deleteById(id);
    }



}
