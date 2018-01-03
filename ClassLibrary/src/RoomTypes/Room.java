public class Room {

	private String code;
	private EmergencyMode emergencyMode = EmergencyMode.Normal;

	public String getCode() {
		return this.code;
	}

	/**
	 * 
	 * @param code
	 */
	public void setCode(String code) {
		this.code = code;
	}

	public EmergencyMode getEmergencyMode() {
		return this.emergencyMode;
	}

	/**
	 * 
	 * @param emergencyMode
	 */
	public void setEmergencyMode(EmergencyMode emergencyMode) {
		this.emergencyMode = emergencyMode;
	}

}