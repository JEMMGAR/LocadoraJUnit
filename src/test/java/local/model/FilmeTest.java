package local.model;

import local.exception.FilmeException;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import javax.validation.Valid;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class FilmeTest {
    //TODO: Nome deve possuir entre 2 e 99 caracteres (inclusive)
    // Lança FilmeException - O nome do filme deve possuir entre 2 e 99 caracteres

            @DisplayName("O nome do filme deve possuir entre 2 e 99 caracteres")
            @Test
            public void nomeNaoPodePossuirMenosDe2Caracteres() throws FilmeException {
                Filme filme = new Filme();

                assertThrows(FilmeException.class,() -> filme.setNome("A"));
            }

            @DisplayName("O nome do filme deve possuir entre 2 e 99 caracteres")
            @Test
            public void nomePodePossuir2Caracteres() throws FilmeException {
                Filme filme = new Filme();

                assertThrows(FilmeException.class,() -> filme.setNome("AB"));
            }

            @DisplayName("O nome do filme deve possuir entre 2 e 99 caracteres")
            @Test
            public void nomePodePossuir99Caracteres() throws FilmeException {
                Filme filme = new Filme();

                assertThrows(FilmeException.class,() -> filme.setNome("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij" +
                        "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghi"));
            }

            @DisplayName("O nome do filme deve possuir entre 2 e 99 caracteres")
            @Test
            public void nomePossuiMaisQue99Caracteres() throws FilmeException {
                Filme filme = new Filme();

                assertThrows(FilmeException.class,() -> filme.setNome("abcdefghijabcdefghijabcdefghijabcdefghijabcdefghij" +
                        "abcdefghijabcdefghijabcdefghijabcdefghijabcdefghiaaaaaaaaaa"));
            }

    //TODO: Estoque não pode ser negativo, e o máximo é 99 (inclusive)
    // Lança FilmeException - Valor de estoque inválido

        @DisplayName("Valor de estoque inválido")
        @Test
        public void valorEstoqueNegativo() throws FilmeException {
                Filme filme = new Filme();

                assertThrows(FilmeException.class,() -> filme.setEstoque(-1));
        }

        @DisplayName("Valor de estoque inválido")
        @Test
        public void valorEstoqueAcima99() throws FilmeException {
            Filme filme = new Filme();

            assertThrows(FilmeException.class,() -> filme.setEstoque(100));
        }

        @DisplayName("Valor de estoque inválido")
        @Test
        public void valorEstoqueMin() throws FilmeException {
            Filme filme = new Filme();

            assertThrows(FilmeException.class,() -> filme.setEstoque(0));
        }

        @DisplayName("Valor de estoque inválido")
        @Test
        public void valorEstoqueMax() throws FilmeException {
            Filme filme = new Filme();

            assertThrows(FilmeException.class,() -> filme.setEstoque(99));
        }

    //TODO: O preço de Locacao deverá ser um número positivo entre R$ 1,00 e R$ 9,99 (inclusive)
    // Lança FilmeException - Valor locação inválido

        @DisplayName("Valor locação inválido")
        @Test
        public void valorLocacaoMenor1() throws FilmeException {
                Filme filme = new Filme();

                assertThrows(FilmeException.class,() -> filme.setPrecoLocacao(0.99));
        }

        @DisplayName("Valor locação inválido")
        @Test
        public void valorLocacaoMaior9_99() throws FilmeException {
            Filme filme = new Filme();

            assertThrows(FilmeException.class,() -> filme.setPrecoLocacao(10.00));
        }

        @DisplayName("Valor locação inválido")
        @Test
        public void valorLocacaoMin() throws FilmeException {
            Filme filme = new Filme();

            assertThrows(FilmeException.class,() -> filme.setPrecoLocacao(1.00));
        }

        @DisplayName("Valor locação inválido")
        @Test
        public void valorLocacaoMax() throws FilmeException {
            Filme filme = new Filme();

            assertThrows(FilmeException.class,() -> filme.setPrecoLocacao(9.99));
        }


}
