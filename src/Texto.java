public class Texto {

    private String conteudo;
    private String estado;

    public Texto()
    {
        conteudo = "";
        estado = "criado";
    }

    public String abrirDocumento()
    {
        estado = "aberto";
        return "Documento aberto";

    }

    public String editarDocumento(String texto) {
        if (estado.equals("aberto"))
        {
            conteudo = texto;
            estado = "editado";
            return "Documento editado";

        }
        return "Nao eh possivel abrir um documento que nao esta aberto";
    }


    public String salvarDocumento()
    {
        if(estado.equals("editado")) {
            estado = "salvo";
            return "Documento salvo";
        }

        return "Nao eh possivel salvar um documento que nao esta editado";
    }

    public String deletarDocumento()
    {
        conteudo = "";
        estado = "deletado";
        return "Documento deletado";
    }

    public String getConteudo() {
        return conteudo;
    }

    public String getEstado() {
        return estado;
    }

}
