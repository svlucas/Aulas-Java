package br.com.lucasvinas.javauladouze.exception;

import java.text.SimpleDateFormat;
import java.util.Date;

import br.com.lucasvinas.javauladouze.Log;

public class ExcecaoRepositorio extends ArrayIndexOutOfBoundsException{

	private static final long serialVersionUID = -70154248283163213L;

	public ExcecaoRepositorio(String mensagem) {
		super(mensagem);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Log.grava(sdf.format(new Date()) + ".log", "Entrada de elemento alem do limite: "  + mensagem);
	}
}