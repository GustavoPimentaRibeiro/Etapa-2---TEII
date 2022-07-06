package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Item {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;
    private String nome;
    private String descricao;
    private int refino;
    private String classe;
    private int nivel;
    private float peso;
    private float dano;
    private float defesa;
}