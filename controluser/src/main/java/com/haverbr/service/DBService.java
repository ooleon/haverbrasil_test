/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haverbr.service;

import com.haverbr.entity.CadastroEntity;

/**
 *
 * @author leo
 */
public class DBService {

    CadastroEntity cadastroEntity;
    private static DBService instance;

    public static DBService getInstance() {
        if (instance == null) {
            instance = new DBService();
        }
        return instance;
    }

    private DBService() {
        // Inicializar el objeto
    }

    public void salvarCadastro(CadastroEntity cadastro) {
        // Implementar lógica para salvar registro em banco de dados
        
        cadastroEntity = cadastro;
        System.out.println(cadastro);
    }

    public CadastroEntity procurarCadastroPorId(String id) {
        // Implementar lógica para procurar registro em banco de dados. InformarPais
        cadastroEntity = CadastroEntity.getInstance();

        return cadastroEntity;
    }

}
