public class EditarDocumento implements Comando
{
    private Texto documento;

    public EditarDocumento(Texto doc)
    {
        this.documento = doc;
    }

    @Override
    public void executar()
    {
        documento.editarDocumento("texto");
    }

}
