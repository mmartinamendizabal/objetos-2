package ar.edu.unlp.info.oo2.ejercicio12;

public class Dispositivo {
	private Display display;
	private Ringer ring;
	private CRC_Calculator crcCalculator;
	private Connection connection;
	
	public Dispositivo() {
		this.display = new Display();
		this.ring = new Ringer();
		this.crcCalculator = new CRC16_Calculator();
		this.connection = new WifiConn();
		
	}
	
	public String send (String data) {
		long crc = this.crcCalculator.crcFor(data);
		return this.connection.sendData(data, crc);
	}
	
	public void conectarCon(Connection otherConn) {
		this.connection=otherConn;
		System.out.println(this.display.showBanner(this.connection.pict()));
		this.ring.ring();
	}
	
	public void configurarCRC(CRC_Calculator otherCRC) {
		this.crcCalculator = otherCRC;
	}

}
