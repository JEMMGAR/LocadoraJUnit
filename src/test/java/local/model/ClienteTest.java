package local.model;

import local.exception.ClienteException;
import org.assertj.core.internal.bytebuddy.utility.RandomString;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ClienteTest {

    //TODO: O nome não pode ser nulo.
    // Lança ClienteException -  Nome é um campo obrigatório

    @DisplayName("Nome está nulo.")
    @Test
    public void nomeNaoPodeSerNulo() throws ClienteException {
        //Cenario
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome(null));

    }

    //TODO: nome deve possuir entre 4 e 55 caracteres (inclusive).
    // Lança ClienteException - O nome do cliente deve possuir entre 4 e 55 caracteres

    @DisplayName("Nome não pode ter menos que 4 caracteres.")
    @Test
    public void nomeNaoPodeTerMenosQue4() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("abc"));
    }

    @DisplayName("Nome não pode ter menos que 4 caracteres.")
    @Test
    public void nomePodeTer4() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("abcd"));
    }

    @DisplayName("Nome não pode ter mais que 55 caracteres.")
    @Test
    public void nomeNaoPodeTerMaisQue4() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("acuidbcidsbuicacuidbcidsbuicacuidbcids" +
                "acuidbcidsbuicbuicacuidicbuicacuidbcidsbuicacuidbcidsbuic"));
    }

    @DisplayName("Pode ter 55 caracteres.")
    @Test
    public void nomePodeTer55() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("coftdjstwrcoftdjstwrcoftdjstwrcoftdjstwrcoftdjstwrhfgdt"));
    }

    @DisplayName("Nome tá certo :D")
    @Test
    public void nomeNaoPodeSerNulo() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("Edson Fagundes"));
    }

    //TODO: O nome do cadastro deve possuir pelo menos 2 nomes.
    // Lança ClienteException -  necessário adicionar um sobrenome (ex.: Angelo Luz)

    @DisplayName("Deve possuir nome e sobrenome!")
    @Test
    public void nomeDevePossuirSobrenome() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("TomatePimentão"));
    }

    @DisplayName("Tá ok :D")
    @Test
    public void nomeOk() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("Hommer Simpson"));
    }

    //TODO: Espaços no início e fim de nomes devem ser descartados

    @DisplayName("Deve possuir nome e sobrenome!")
    @Test
    public void nomeNaoPodeSerNulo() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("TomatePimentão"));
    }

    @DisplayName("Nome escrito corretamente!")
    @Test
    public void nomeNaoPodeSerNulo() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("Tomate Pimentão"));
    }

    //TODO: Nomes não devem possuir símbolos ou números.
    // Lança ClienteException - Números e símbolos não são permitidos

    @DisplayName("Nome escrito incorretamente pois possui símbolos ou números!")
    @Test
    public void nomeNaoPodeSerNulo() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("Tomate Pimentão123"));
    }

    @DisplayName("Nome escrito incorretamente pois possui símbolos ou números!")
    @Test
    public void nomeNaoPodeSerNulo() throws ClienteException {
        //Cenário
        Cliente cliente = new Cliente();
        //Ação

        //Validação
        assertThrows(ClienteException.class,() -> cliente.setNome("Strawberry #TudoLadrao"));
    }

}
