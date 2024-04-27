package ar.edu.unlp.info.oo2.ejercicio12;

public class Connection4G{
	
	private String symb;
	
	public Connection4G() {
		this.symb = "4G Symbol";
	}
	
	public String transmit(String data, long crc) {
		return "transmitting data with 4G connection";
	}
	public String symb() {
		return this.symb;
	}

}
