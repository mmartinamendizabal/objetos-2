package ar.edu.unlp.info.oo2.ejercicio12;

public class Adapter4G implements Connection{
	private Connection4G conn4G;
	
	public Adapter4G () {
		this.conn4G = new Connection4G();
	}

	@Override
	public String sendData(String data, long crc) {
		return this.conn4G.transmit(data, crc);
	}

	@Override
	public String pict() {
		return this.conn4G.symb();
	}

}
