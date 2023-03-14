package nfsetimbo.capivaratech.exception;

public enum NfsErrorCode {
    VALIDACAO_USUARIO(131," Não foi possível validar o usuário logado!"),
    USUARIO_SENHA_INVALIDOS(132, "Usuário ou Senha inválidos!"),
    USUARIO_DESATIVADO(133, "Usuário informado encontra-se desativado."),
    USUARIO_NAO_CADASTRADO(134, "Usuário informado não cadastrado como contribuinte (dc.unico)."),
    USUARIO_NAO_CADASTRADO_COMO_ECONOMICO(135, "Usuário informado não cadastrado como econômico (is.economico)."),
    CODIGO_CIDADE_CONTRIBUINTE_NAO_ENCONTRADO(136, "Código da cidade do contribuinte informado não encontrado no cadastro(dc.unico.codmun)." ),
    LOGIN_DEVE_CONTER_APENAS_NUMEROS(144, "Login informado deve conter apenas números."),
    NAO_FOI_POSSIVEL_ESTABELECER_CONEXAO_COM_LINK(145, "Não foi possível estabelecer uma conexão com o link informado.");

    private int code;

    private String message;

    NfsErrorCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
