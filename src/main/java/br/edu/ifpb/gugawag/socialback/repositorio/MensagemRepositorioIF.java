package br.edu.ifpb.gugawag.socialback.repositorio;

import br.edu.ifpb.gugawag.socialback.modelo.Menssagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MensagemRepositorioIF extends JpaRepository<Menssagem, Long> {


    @Query("SELECT m FROM Menssagem m where (m.destinatario=:nome)")
    public List<Menssagem> getMenssagemByNome(String nome);

}
