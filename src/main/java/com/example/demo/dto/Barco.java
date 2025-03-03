package com.example.demo.dto;

public class Barco {

	public String marca = "bavaria";
	protected int modelo = 278;
	private double altura = 23.4;

	public void prueba1() {

	}

	public String prueba2() {
		return "";
	}

	public void prueba3(String parametro1) {

	}

	public double prueba4(double parametro1, int parametro2) {
		return 1.1;

	}

	public static void main(String[] args) {

		Bicicleta bicicleta = new Bicicleta();

		bicicleta.setTipo("SHARON");

		
		System.out.println(bicicleta.getTipo());
		
	}

}
