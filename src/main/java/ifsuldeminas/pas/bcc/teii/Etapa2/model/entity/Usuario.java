package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;

import java.util.Set;
import javax.persistence.*;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    @OneToMany
    @JoinColumn(name="usario_id")
    private Set<Item> itens;
    private String usuario;
    private String senha;
    private String email;
}