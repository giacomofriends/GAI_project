
public class HourSlot {
	private Integer startHour;
	private Integer finishHour;
	private Double preferenceLevel;
	private Boolean available;
	
	
	public HourSlot(Integer startHour, Integer finishHour, Double preferenceLevel, Boolean available) {
		super();
		this.startHour = startHour;
		this.finishHour = finishHour;
		this.preferenceLevel = preferenceLevel;
		this.available = available;
	}


	public Integer getStartHour() {
		return startHour;
	}


	public void setStartHour(Integer startHour) {
		this.startHour = startHour;
	}


	public Integer getFinishHour() {
		return finishHour;
	}


	public void setFinishHour(Integer finishHour) {
		this.finishHour = finishHour;
	}


	public Double getPreferenceLevel() {
		return preferenceLevel;
	}


	public void setPreferenceLevel(Double preferenceLevel) {
		this.preferenceLevel = preferenceLevel;
	}


	public Boolean getAvailable() {
		return available;
	}


	public void setAvailable(Boolean available) {
		this.available = available;
	}
	
	
	
	
}
