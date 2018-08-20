package br.com.nexfe.siesma.controller;

import br.com.nexfe.siesma.entidades.FormaPagamento;
import br.com.nexfe.siesma.service.FormaPagamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
@RequestMapping("/forma-pagamento")
public class FormaPagamentoController {

    @Autowired
    private FormaPagamentoService service;

    @GetMapping
    public List<FormaPagamento> listar(){
        return service.listaTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<FormaPagamento> buscarPeloCodigo(@PathVariable Long id) {
        FormaPagamento obj = service.buscarPeloCodigo(id);
        if(obj != null) {
            return ResponseEntity.status(HttpStatus.OK).body(obj);
        } else {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(null);
        }
    }

    @PostMapping
    public ResponseEntity<FormaPagamento> criar(@Valid @RequestBody FormaPagamento obj){
        return ResponseEntity.status(HttpStatus.CREATED).body(service.salvar(obj));
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable Long id){
        service.excluir(id);
    }

}
