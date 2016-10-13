package br.com.lucasvinas.javauladouze.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.lucasvinas.javauladouze.Log;

public class ExcecaoElementoInexistente extends Exception{
	
	private static final long serialVersionUID = 4690364595678778316L;

	public ExcecaoElementoInexistente(String mensagem) {
		super(mensagem);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Log.grava(sdf.format(new Date()) + ".log", "Elemento Inexistente: "  + mensagem);
	}
}