package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;

import java.util.Date;
import java.util.Set;
import javax.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="tipo_venda", discriminatorType = DiscriminatorType.INTEGER)
public class Leilao {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @OneToMany
    @JoinColumn(name="usuario_id")
    private Set<Item> item_id_qtdd;
    private long destinatario_id;
    private long remetente_id;
    @Temporal(TemporalType.TIMESTAMP)
    private Date tempo_item_leilao;

    public Leilao(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Set<Item> getItem_id_qtdd() {
        return item_id_qtdd;
    }

    public void setItem_id_qtdd(Set<Item> item_id_qtdd) {
        this.item_id_qtdd = item_id_qtdd;
    }

    public long getDestinatario_id() {
        return destinatario_id;
    }

    public void setDestinatario_id(long destinatario_id) {
        this.destinatario_id = destinatario_id;
    }

    public long getRemetente_id() {
        return remetente_id;
    }

    public void setRemetente_id(long remetente_id) {
        this.remetente_id = remetente_id;
    }

    public Date getTempo_item_leilao() {
        return tempo_item_leilao;
    }

    public void setTempo_item_leilao(Date tempo_item_leilao) {
        this.tempo_item_leilao = tempo_item_leilao;
    }
}