package br.com.alura.mvc.mudi.controller;

import br.com.alura.mvc.mudi.model.Pedido;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {

    @GetMapping("/home")
    public String home(Model model){
        Pedido pedido = new Pedido();
        pedido.setNomeProduto("Celular Xiaomi Note 8 64GB");
        pedido.setUrlImage("https://m.media-amazon.com/images/I/51wgmCYDFML._AC_SL1000_.jpg");
        pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLX");
        pedido.setDescricao("Celular Xiaomi Note 8 64GB Rom 4GB Ram Dual Versión Global Space Black ");
        pedido.setValorNegociado(BigDecimal.valueOf(220));

        List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
