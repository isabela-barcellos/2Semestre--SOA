package br.com.fiap3espb.auto_escola_3espb.instrutor;

import br.com.fiap3espb.auto_escola_3espb.endereco.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoInstrutor(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco) {
}
