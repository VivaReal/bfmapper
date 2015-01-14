package br.com.bfmapper.model;

public class RodaCanonico {

	private String marca;
	private int aro;

	@SuppressWarnings("unused")
	//TODO: hack to use BFMapper, we should allow complex constructors latter
	private RodaCanonico() {}
	
	public RodaCanonico(String marca, int aro) {
		this.marca = marca;
		this.aro = aro;
	}

	public String getMarca() {
		return marca;
	}
	public int getAro() {
		return aro;
	}
	
}
