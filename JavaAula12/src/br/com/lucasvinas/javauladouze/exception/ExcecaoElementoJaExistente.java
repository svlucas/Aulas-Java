package br.com.lucasvinas.javauladouze.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.lucasvinas.javauladouze.Log;

public class ExcecaoElementoJaExistente extends IllegalArgumentException{

	private static final long serialVersionUID = 8317218799968564256L;

	public ExcecaoElementoJaExistente(String mensagem) {
		super(mensagem);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Log.grava(sdf.format(new Date()) + ".log", "Entrada de elemento já existente: "  + mensagem);
	}
}