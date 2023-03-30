package med.voll.api.medico;

import jakarta.validation.constraints.NotNull;
import med.voll.api.edereco.Endereco;

public record DadosEdicaoMedico(
        @NotNull
        long id,
        String nome,
        String telefone,
        Endereco endereco) {
}
