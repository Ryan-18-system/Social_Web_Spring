package br.edu.ifpb.gugawag.socialback.servico;

import br.edu.ifpb.gugawag.socialback.modelo.Menssagem;
import br.edu.ifpb.gugawag.socialback.repositorio.MensagemRepositorioIF;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class MensagemServico {

    @Autowired
    private MensagemRepositorioIF mensagemRepositorioIF;

    public List<Menssagem> getMenssagem() {
        return this.mensagemRepositorioIF.findAll();
    }

    public Menssagem menssagemEnviada(Menssagem menssagem){
        if(Objects.isNull(menssagem)){
            throw new RuntimeException("Menssagem está vazia");
        }
        Menssagem menssagemInserida = this.mensagemRepositorioIF.save(menssagem);
        return menssagemInserida;

    }


}
