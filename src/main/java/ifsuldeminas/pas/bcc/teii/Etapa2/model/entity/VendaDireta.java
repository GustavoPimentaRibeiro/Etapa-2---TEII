package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
@DiscriminatorValue("2")
public class VendaDireta extends Leilao{
    @OneToOne
    private Leilao leilao_id;
    private double preco_fixo;
}