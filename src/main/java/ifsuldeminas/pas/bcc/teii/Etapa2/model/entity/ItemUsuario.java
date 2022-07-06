package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;

import javax.persistence.Entity;

@Entity
public class ItemUsuario extends Usuario{
    private Usuario usario_id;
    private int qtdd;
    private Item item;
}
