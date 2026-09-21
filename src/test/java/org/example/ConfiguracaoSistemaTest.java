package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConfiguracaoSistemaTest {

    @Test
    public void deveRetornarNomeEmpresa() {
        ConfiguracaoSistema.getInstance().setNomeEmpresa("Tech Solutions SA");
        assertEquals("Tech Solutions SA", ConfiguracaoSistema.getInstance().getNomeEmpresa());
    }

    @Test
    public void deveRetornarAmbienteDeExecucao() {
        ConfiguracaoSistema.getInstance().setAmbienteDeExecucao("Producao");
        assertEquals("Producao", ConfiguracaoSistema.getInstance().getAmbienteDeExecucao());
    }
}