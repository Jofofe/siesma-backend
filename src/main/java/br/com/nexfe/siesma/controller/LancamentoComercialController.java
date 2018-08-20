package br.com.nexfe.siesma.controller;

import br.com.nexfe.siesma.entidades.LancamentoComercial;
import br.com.nexfe.siesma.service.LancamentoComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/aluno")
public class LancamentoComercialController {

    @Autowired
    private LancamentoComercialService service;

    @GetMapping
    public List<LancamentoComercial> listar(){
        return service.listaTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<LancamentoComercial> buscarPeloCodigo(@PathVariable Long id) {
        LancamentoComercial obj = service.buscarPeloCodigo(id);
        if(obj != null) {
            return ResponseEntity.status(HttpStatus.OK).body(obj);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<LancamentoComercial> criar(@Valid @RequestBody LancamentoComercial obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(obj));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        service.excluir(id);
    }

}
