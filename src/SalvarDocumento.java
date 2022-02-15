public class SalvarDocumento implements Comando
{
    private Texto documento;

    public SalvarDocumento(Texto doc)
    {
        this.documento = doc;
    }

    @Override
    public void executar()
    {
        documento.salvarDocumento();
    }

}