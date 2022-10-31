package br.com.alura.mvc.mudi.dto;

import br.com.alura.mvc.mudi.model.Pedido;

import javax.validation.constraints.NotBlank;

public class RequisicaoNovoPedido {


    @NotBlank(message = "O campo obrigatório")
    private String nomeProduto;
    @NotBlank(message = "O campo obrigatório")
    private String urlProduto;
    @NotBlank(message = "O campo obrigatório")
    private String urlImagem;
    private String descricao;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Pedido toPedido() {
            Pedido pedido = new Pedido();

            pedido.setDescricao(descricao);
            pedido.setNomeProduto(nomeProduto);
            pedido.setUrlImage(urlImagem);
            pedido.setUrlProduto(urlProduto);
            return pedido;

    }
}
