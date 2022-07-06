package ifsuldeminas.pas.bcc.teii.Etapa2.model.entity;

import java.util.Set;

public class Usuario {
    private long id;
    private String usuario;
    private String senha;
    private String email;
    private Set<Item> itens;
}