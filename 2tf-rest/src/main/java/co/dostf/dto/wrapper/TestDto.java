package co.dostf.dto.wrapper;

public class TestDto {

	private String ip;
	private String applicacion;

	public static TestDto of(String ip, String app) {
		TestDto test = new TestDto();
		test.setIp(ip);
		test.setApplicacion(app);
		return test;
	}

	public String getIp() {
		return ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getApplicacion() {
		return applicacion;
	}

	public void setApplicacion(String applicacion) {
		this.applicacion = applicacion;
	}

}
