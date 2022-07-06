package ifsuldeminas.pas.bcc.teii.Etapa2.controller;

import ifsuldeminas.pas.bcc.teii.Etapa2.model.entity.Leilao;
import ifsuldeminas.pas.bcc.teii.Etapa2.model.repositories.LeilaoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leilao")
public class LeilaoController {
    private LeilaoRepository leilaoRepository;

    public LeilaoController(LeilaoRepository leilaoRepository){
        this.leilaoRepository = leilaoRepository;
    }

    // Read
    //obtem uma lista dos leilões cadastrados
    @GetMapping
    public List<Leilao> list(){
        return leilaoRepository.findAll();
    }

    //obtem dados de um leilão
    @GetMapping("/{id}")
    public Leilao show(@PathVariable Long id){
        return leilaoRepository.getById(id);
    }

    // Create
    @PostMapping
    public Leilao save(@RequestBody Leilao plano){
        return leilaoRepository.save(plano);
    }

    // Update
    @PutMapping("/{id}")
    public Leilao update(@PathVariable Long id, @RequestBody Leilao plano){
        Leilao leilaoAux = leilaoRepository.getById(id);
        //atualizar os dados do leilão
        leilaoAux.setDestinatario_id(plano.getDestinatario_id());
        leilaoAux.setItem_id_qtdd(plano.getItem_id_qtdd());
        leilaoAux.setTempo_item_leilao(plano.getTempo_item_leilao());
        leilaoAux.setRemetente_id(plano.getRemetente_id());
        //atualizar os dados do leilão no BD
        return leilaoRepository.save(leilaoAux);
    }
}
