package br.com.generation.token.ClienteController;

import java.util.ArrayList;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.generation.token.model.Produto;
import br.com.generation.token.security.Autenticator;

@RestController
@CrossOrigin("*")
public class ProdutoController {
	@GetMapping("/Produto/todos")
	public ResponseEntity<ArrayList<Produto>> getAllProduto(@RequestParam String token){
		if (Autenticator.isValid(token)) {
			/* este trecho é simulando uma consulta ao banco de dados */
			ArrayList<Produto> lista = new ArrayList<Produto>();
			for (int i=0;i<20;i++) {
				Produto a = new Produto();
				a.setCodigo((i+1)*100);
				a.setTitulo("Titulo do Produto = "+(i+1));
				a.setDetalhes("Detalhes ="+(i+1));
				a.setPreco(1300.00f);
				
				lista.add(a);
			}
			return ResponseEntity.ok(lista);
		}
		else {
			return ResponseEntity.status(403).build();
		}
	}
}
		
		
		
		
		
		
		