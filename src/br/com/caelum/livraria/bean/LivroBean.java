package br.com.caelum.livraria.bean;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;

@ManagedBean
public class LivroBean {

	private Livro livro = new Livro();
	
	@PostConstruct
	public void posCriacao() {
		System.out.println("[ INFO ] Criado o Bean Livro");
	}

	public Livro getLivro() {
		return livro;
	}

	public void gravar() {
		System.out.println("[ INFO ] Granvando Livro: " + this.livro.getTitulo());
	}

}
