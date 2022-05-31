package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity.leilao;

import java.util.Set;

public class Usuario {
    private long id;
    private String usuario;
    private String senha;
    private String email;
    private Set<Item> itens;
}