/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.haverbr.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Enum com todas as Unidades da Federação do Brasil. Contém o nome da Unidade,
 * a sigla e a capital da Unidade da Federação. As unidades estão listadas por
 * ordem alfabética no enum.
 *
 * @author leo
 * @version 1.1.1
 * @since 1.0.0
 */
public enum UnidadeFederacao {
    DISTRITO_FEDERAL("Distrito Federal", "DF", "Brasília"),
    AMAZONAS("Amazonas", "AM", "Manaus"),
    ALAGOAS("Alagoas", "AL", "Maceió"),
    ACRE("Acre", "AC", "Rio Branco"),
    AMAPA("Amapá", "AP", "Macapá"),
    BAHIA("Bahia", "BA", "Salvador"),
    PARA("Pará", "PA", "Belém"),
    MATO_GROSSO("Mato Grosso", "MT", "Cuiabá"),
    MINAS_GERAIS("Minas Gerais", "MG", "Belo Horizonte"),
    MATO_GROSSO_DO_SUL("Mato Grosso do Sul", "MS", "Campo Grande"),
    GOIAS("Goiás", "GO", "Goiânia"),
    MARANHAO("Maranhão", "MA", "São Luís"),
    RIO_GRANDE_DO_SUL("Rio Grande do Sul", "RS", "Porto Alegre"),
    TOCANTINS("Tocantins", "TO", "Palmas"),
    PIAUI("Piauí", "PI", "Teresina"),
    SAO_PAULO("São Paulo", "SP", "São Paulo"),
    RONDONIA("Rondônia", "RO", "Porto Velho"),
    RORAIMA("Roraima", "RR", "Boa Vista"),
    PARANA("Paraná", "PR", "Curitiba"),
    CEARA("Ceará", "CE", "Fortaleza"),
    PERNAMBUCO("Pernambuco", "PE", "Recife"),
    SANTA_CATARINA("Santa Catarina", "SC", "Florianópolis"),
    PARAIBA("Paraíba", "PB", "João Pessoa"),
    RIO_GRANDE_DO_NORTE("Rio Grande do Norte", "RN", "Natal"),
    ESPIRITO_SANTO("Espírito Santo", "ES", "Vitória"),
    RIO_DE_JANEIRO("Rio de Janeiro", "RJ", "Rio de Janeiro"),
    SERGIPE("Sergipe", "SE", "Aracaju");

    private final String nome;
    private final String sigla;
    private final String capital;

    /**
     * Construtor do enum
     *
     * @param nome nome da unidade da federação completo
     * @param sigla sigla da unidade da federação
     * @param capital nome da capital da unidade da federação
     */
    UnidadeFederacao(final String nome, final String sigla, final String capital) {
        this.nome = nome;
        this.sigla = sigla;
        this.capital = capital;
    }

    /**
     * Converte a partir do nome da Unidade da Federacao, para o respectivo
     * enum.
     *
     * @param nomeUf o nome da Unidade da Federação. Exemplo: "São Paulo"
     * @return o enum da Unidade da Federação
     * @throws IllegalArgumentException caso não ache o enum pelo nome da UF
     */
    public static UnidadeFederacao fromUF(final String nomeUf) {
        for (final UnidadeFederacao uf : UnidadeFederacao.values()) {
            if (uf.nome.equalsIgnoreCase(nomeUf)) {
                return uf;
            }
        }

        throw new IllegalArgumentException(nomeUf);
    }

    /**
     * Converte a partir da Sigla da UF no parâmetro, para o enum da Unidade da
     * Federação.
     *
     * @param sigla da Unidade da Federação. Exemplo: "MG"
     * @return a Unidade da Federação
     * @throws IllegalArgumentException caso a sigla da UF não exista
     */
    public static UnidadeFederacao fromSigla(final String sigla) {
        for (final UnidadeFederacao uf : UnidadeFederacao.values()) {
            if (uf.sigla.equalsIgnoreCase(sigla)) {
                return uf;
            }
        }

        throw new IllegalArgumentException(sigla);
    }

    /**
     * Converte, a partir do nome da capital da UF, para o Enum.
     *
     * @param capital da Unidade da Federação. Exemplo: "Porto Alegre"
     * @return a Unidade da Federacao com a capital passada no parâmetro
     * @throws IllegalArgumentException caso o nome da capital não exista
     */
    public static UnidadeFederacao fromCapital(final String capital) {
        for (final UnidadeFederacao uf : UnidadeFederacao.values()) {
            if (uf.capital.equalsIgnoreCase(capital)) {
                return uf;
            }
        }

        throw new IllegalArgumentException(capital);
    }

    /**
     * Obtém a sigla da UF
     *
     * @return a sigla da UF
     */
    public String sigla() {
        return this.sigla;
    }

    /**
     * Nome completo da UF
     *
     * @return nome completo da UF
     */
    public String nome() {
        return this.nome;
    }

    /**
     * Nome da capital da UF
     *
     * @return nome da capital da UF
     */
    public String capital() {
        return this.capital;
    }

    public static List<String> getListSigla() {
        List l = new ArrayList<UnidadeFederacao>();
        for (final UnidadeFederacao uf : UnidadeFederacao.values()) {
            l.add(uf.sigla);
        }
        return l;
    }

    public static Map<UnidadeFederacao, UnidadeFederacao> getMapSigla() {
        Map hm = new HashMap<UnidadeFederacao,UnidadeFederacao>();
        for (final UnidadeFederacao uf : UnidadeFederacao.values()) {
            hm.put(uf.sigla, uf.nome);        
        }
        return hm;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("UnidadeFederacao{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", sigla='").append(sigla).append('\'');
        sb.append(", capital='").append(capital).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
