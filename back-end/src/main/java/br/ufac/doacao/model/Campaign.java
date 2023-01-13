package br.ufac.doacao.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Campaign implements Serializable {

    // TODO: Precisa ter relacionamento com a entidade instituição.

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    @Column(nullable = false)
    private String cover_image = "/donation-default.png";

    @Column(nullable = false)
    private String title;

    @Column(nullable = false, unique = false)
    private String description;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EStatus status = EStatus.PROGRESS;
    
    // TODO: dúvida, precisa do `cascade = CascadeType.PERSIST` para não gerar erro?
    // TODO: dúvida, como fica a relação do no front-end?
    // TODO: dúvida, qual motivo gera erro quando o front-end manda o atributo item como items (referencia a tabela?)?
    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinColumn
    private List<Item> item;

    @Column(nullable = false)
    private boolean active = true;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCover_image() {
        return cover_image;
    }

    public void setCover_image(String cover_image) {
        this.cover_image = cover_image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public EStatus getStatus() {
        return status;
    }

    public void setStatus(EStatus status) {
        this.status = status;
    }

    public List<Item> getItem() {
        return item;
    }

    public void setItem(List<Item> item) {
        this.item = item;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

}
