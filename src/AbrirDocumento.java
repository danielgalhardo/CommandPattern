public class AbrirDocumento implements Comando
{
    private Texto documento;

    public AbrirDocumento(Texto doc)
    {
        this.documento = doc;
    }

    @Override
    public void executar() {
        documento.abrirDocumento();
    }

}
