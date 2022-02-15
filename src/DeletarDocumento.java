public class DeletarDocumento implements Comando
{
    private Texto documento;

    public DeletarDocumento(Texto doc)
    {
        this.documento = doc;
    }

    @Override
    public void executar()
    {
        documento.deletarDocumento();
    }

}