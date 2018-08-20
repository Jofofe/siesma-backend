package br.com.nexfe.siesma.controller;

import br.com.nexfe.siesma.entidades.Presenca;
import br.com.nexfe.siesma.service.PresencaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/presenca")
public class PresencaController {

    @Autowired
    private PresencaService service;

    @GetMapping
    public List<Presenca> listar(){
        return service.listaTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Presenca> buscarPeloCodigo(@PathVariable Long id) {
        Presenca obj = service.buscarPeloCodigo(id);
        if(obj != null) {
            return ResponseEntity.status(HttpStatus.OK).body(obj);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<Presenca> criar(@Valid @RequestBody Presenca obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(obj));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        service.excluir(id);
    }

}
