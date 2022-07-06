package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;
import javax.persistence.*;

@Entity
@DiscriminatorValue("1")
public class VendaCorrente extends Leilao{
    @OneToOne
    private Leilao leilao_id;
    private double preco_inicial;
    private double preco_atual;
}