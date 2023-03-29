package med.voll.api.medico;

import med.voll.api.edereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialdade especialidade, DadosEndereco endereco) {
}