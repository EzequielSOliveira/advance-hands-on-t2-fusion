package br.ufac.doacao.controller;

import org.springframework.http.ResponseEntity;

public interface ICrudController<T> {

    public ResponseEntity<T> insert(T objeto);

}
