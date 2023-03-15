package nfsetimbo.capivaratech.resource;

import nfsetimbo.capivaratech.model.Cliente;
import nfsetimbo.capivaratech.model.Nfse;
import nfsetimbo.capivaratech.service.ClienteService;
import nfsetimbo.capivaratech.service.NfseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cliente")
public class ClienteResource {

    private ClienteService clienteService;


    @Autowired
    public ClienteResource(ClienteService clienteService) {this.clienteService = clienteService;}


    @GetMapping("/all")
    public ResponseEntity<List<Cliente>> getAllCliente(){
        List<Cliente> nfses = clienteService.findAllClientes();
        return new ResponseEntity<>(nfses, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Cliente> getAllClienteById(@PathVariable("id") Long id){
        Cliente cliente = clienteService.findClienteById(id);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Cliente> addCliente(@RequestBody Cliente cliente){
        Cliente newCliente = clienteService.addCliente(cliente);
        return new ResponseEntity<>(newCliente, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Cliente> updateCliente(@RequestBody Cliente cliente) {
        Cliente updateCliente = clienteService.updateCliente(cliente);
        return new ResponseEntity<>(updateCliente, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNfse(@PathVariable("id") Long id){
        clienteService.deleteCliente(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
