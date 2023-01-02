package core.logger;

public class DatabaseLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("Veritabanına eklendi ---------  " + data);
		
	}

}
