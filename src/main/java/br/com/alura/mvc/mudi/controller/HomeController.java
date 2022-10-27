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
        pedido.setUrlProduto("https://www.amazon.com.br/Celular-Xiaomi-Vers%C3%A3o-Global-Space/dp/B07Y9ZHLXW/ref=sr_1_2?__mk_pt_BR=%C3%85M%C3%85%C5%BD%C3%95%C3%91&keywords=note+8&qid=1666894942&qu=eyJxc2MiOiIzLjQyIiwicXNhIjoiMy40MiIsInFzcCI6IjIuODIifQ%3D%3D&sr=8-2&ufe=app_do%3Aamzn1.fos.25548f35-0de7-44b3-b28e-0f56f3f96147");
        pedido.setDescricao("Celular Xiaomi Note 8 64GB Rom 4GB Ram Dual Versión Global Space Black ");
        pedido.setValorNegociado(BigDecimal.valueOf(220));

        List<Pedido> pedidos = Arrays.asList(pedido, pedido, pedido);
        model.addAttribute("pedidos", pedidos);
        return "home";
    }
}
