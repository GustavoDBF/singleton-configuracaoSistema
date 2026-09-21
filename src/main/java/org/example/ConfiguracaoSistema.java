package org.example;

public class ConfiguracaoSistema {

    private ConfiguracaoSistema() {};

    private static ConfiguracaoSistema instance = new ConfiguracaoSistema();

    public static ConfiguracaoSistema getInstance() {
        return instance;
    }

    private String nomeEmpresa;
    private String ambienteDeExecucao;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getAmbienteDeExecucao() {
        return ambienteDeExecucao;
    }

    public void setAmbienteDeExecucao(String ambienteDeExecucao) {
        this.ambienteDeExecucao = ambienteDeExecucao;
    }
}