package br.ufac.doacao.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Item implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false, updatable = false)
    private Long id;

    // Example of use: {item_name} ({type}): {initial_value} {current_value}
    // {final_value}
    // Pratice example: Carne de Frango (KG): Valor inicial 0, Arrecadado 100 de 200
    // Pratice example: Camas (UN): Valor inicial 1, Arrecadado 1 de 10
    // Pratice example: Dinheiro (R$): Valor inicial 1000, Arrecadado 3000 de 10000

    @Column(nullable = false)
    private String item_name;

    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    private EType type;
 
    @Column(nullable = false)
    private int current_value = 0;

    @Column(nullable = false)
    private int required_value;

    @Column(nullable = false)
    private String item_description;

    public String getItem_name() {
        return item_name;
    }

    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }

    public EType getType() {
        return type;
    }

    public void setType(EType type) {
        this.type = type;
    }

    public int getCurrent_value() {
        return current_value;
    }

    public void setCurrent_value(int current_value) {
        this.current_value = current_value;
    }

    public int getRequired_value() {
        return required_value;
    }

    public void setRequired_value(int required_value) {
        this.required_value = required_value;
    }

    public String getItem_description() {
        return item_description;
    }

    public void setItem_description(String item_description) {
        this.item_description = item_description;
    }

}