public class Family {
	private String name; 
	private String team; 
	private int birthday; 
	
	public Family(String x, String y, int z){
		name = x; 
		team = y; 
		birthday = z; 
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getBirthday() {
		return birthday;
	}

	public void setBirthday(int birthday) {
		this.birthday = birthday;
	}
	
	public String toString(){
		String x = (birthday+": "+name+" family supports "+team+" team.");
		return x; 
	}
}
