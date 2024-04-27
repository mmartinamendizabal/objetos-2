package ar.edu.unlp.info.oo2.ejercicio12;
import java.util.zip.CRC32;

public class CRC32_Calculator implements CRC_Calculator{
	private CRC32 crc;
	
	public CRC32_Calculator(){
		this.crc= new CRC32();
	}

	@Override
	public long crcFor(String data) {
		this.crc.update(data.getBytes());
		return crc.getValue();
	}
}

