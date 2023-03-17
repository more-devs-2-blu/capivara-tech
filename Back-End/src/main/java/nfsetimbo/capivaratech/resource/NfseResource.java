package nfsetimbo.capivaratech.resource;

import nfsetimbo.capivaratech.authenticator.NfsAuthentication;
import nfsetimbo.capivaratech.model.Nfse;
import nfsetimbo.capivaratech.service.NfseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/nfse")
public class NfseResource {

    @Autowired private NfseService nfseService;

    private NfsAuthentication nfsAuthentication;

    public ResponseEntity<String> NfsAuthentication(NfsAuthentication nfsAuthentication){
        this.nfsAuthentication = nfsAuthentication;
        return null;
    }
    public NfseResource(NfseService nfseService) {this.nfseService = nfseService;}


    @GetMapping("/all")
    public ResponseEntity<List<Nfse>> getAllNfse(){
        List<Nfse> nfses = nfseService.findAllNfses();
        return new ResponseEntity<>(nfses, HttpStatus.OK);
    }

    @GetMapping("/find/{id}")
    public ResponseEntity<Nfse> getAllNfseById(@PathVariable("id") Long id){
        Nfse nfse = nfseService.findNfseById(id);
        return new ResponseEntity<>(nfse, HttpStatus.OK);
    }

    @PostMapping("/add")
    public ResponseEntity<Nfse> addNfse(@RequestBody Nfse nfse){
        nfsAuthentication.executeAuthentication();
        Nfse newNfse = nfseService.addNfse(nfse);
        return new ResponseEntity<>(newNfse, HttpStatus.CREATED);
    }

    @PutMapping("/update")
    public ResponseEntity<Nfse> updateNfse(@RequestBody Nfse nfse) {
        Nfse updateNfse = nfseService.updateNfse(nfse);
        return new ResponseEntity<>(updateNfse, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity<?> deleteNfse(@PathVariable("id") Long id){
        nfseService.deleteNfse(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
