package sem451;

public class LabRoom extends Room {

	private int numberOfPc;
	private boolean vdi;
	private boolean store;
	private boolean dataShow;
	private String note;


	public LabRoom(String n) {
		this(n,0,false);
	}
	
	public LabRoom(String n, int pcs, boolean vdi) {
		super(n);
		this.setNumberOfPc(pcs);
		this.setVdi(vdi);
	}

	
	
	public String getNote() {
		return note;
	}

	public void addNote(String note) {
		this.note += note;
	}
	
	public void clearNote() {
		note="";
	}
	
	
	public int getNumberOfPc() {
		return numberOfPc;
	}

	public void setNumberOfPc(int numberOfPc) {
		this.numberOfPc = numberOfPc;
	}

	public boolean isVdi() {
		return vdi;
	}

	public void setVdi(boolean vdi) {
		this.vdi = vdi;
	}

	public boolean isStore() {
		return store;
	}

	public void setStore(boolean store) {
		this.store = store;
	}

	public boolean isDataShow() {
		return dataShow;
	}

	public void setDataShow(boolean dataShow) {
		this.dataShow = dataShow;
	}
	

}
