package br.edu.ifpb.gugawag.socialback.controlador;

import br.edu.ifpb.gugawag.socialback.modelo.Menssagem;
import br.edu.ifpb.gugawag.socialback.servico.MensagemServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/mensagem")
public class MensagemControlador {

    @Autowired
    private MensagemServico mensagemServico;

    @GetMapping
    public List<Menssagem> getUsuarios(){
        return this.mensagemServico.getMenssagem();
    }

    @PostMapping
    public Menssagem inserir(@RequestBody Menssagem menssagemEnviada) {
        return this.mensagemServico.menssagemEnviada(menssagemEnviada);
    }
}
