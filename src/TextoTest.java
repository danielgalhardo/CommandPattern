import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TextoTest {

    @Test
    public void deveAbrirDocumento() throws Exception
    {
        Texto texto = new Texto();
        assertEquals("Documento aberto", texto.abrirDocumento());

    }

    @Test
    public void deveEditarDocumento() throws Exception
    {
        Texto texto = new Texto();
        texto.abrirDocumento();
        texto.editarDocumento("Lorem ipsum bla bla");
        assertEquals("Lorem ipsum bla bla",  texto.getConteudo());

    }

    @Test
    public void deveSalvarDocumento() throws Exception
    {
        Texto texto = new Texto();
        texto.abrirDocumento();
        texto.editarDocumento("oi");


        assertEquals("Documento salvo",  texto.salvarDocumento());

    }

    @Test
    public void deveDeletarDocumento()
    {
        Texto texto = new Texto();
        texto.abrirDocumento();
        texto.deletarDocumento();

        assertEquals("", texto.getConteudo());
        assertEquals("deletado", texto.getEstado());
    }

    @Test
    public void naoPodeSalvarDocumento() throws Exception
    {
        Texto texto = new Texto();
        texto.abrirDocumento();
        assertEquals("Nao eh possivel salvar um documento que nao esta editado",  texto.salvarDocumento());

    }


}
