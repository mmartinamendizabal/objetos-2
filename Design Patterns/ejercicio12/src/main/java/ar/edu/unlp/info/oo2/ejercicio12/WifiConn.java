package ar.edu.unlp.info.oo2.ejercicio12;

public class WifiConn implements Connection{
	private String pict;
	
	public WifiConn() {
		this.pict = "Wifi Symbol";
	}

	@Override
	public String sendData(String data, long crc) {
		return "transmitting data with Wifi connection";
	}

	@Override
	public String pict() {
		return this.pict;
	}

}
