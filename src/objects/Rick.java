package objects;

public class Rick {

	public boolean isDrinking() {
		return isDrinking;
	}

	protected boolean isDrinking;
	protected boolean isNeggingJery;
	protected boolean isOnAdventure;

	public Rick() {
		this.isDrinking = true;
		this.isNeggingJery = true;
		this.isOnAdventure = false;
	}

	public Rick(boolean isDrinking, boolean isNegingJery, boolean isOnAdventure) {
		this.isDrinking = isDrinking;
		this.isNeggingJery = isNegingJery;
		this.isOnAdventure = isOnAdventure;
	}
	
	public void setDrinking(boolean isDrinking) {
		this.isDrinking = isDrinking;
	}

	public boolean isNeggingJery() {
		return isNeggingJery;
	}

	public void setNeggingJery(boolean isNeggingJery) {
		this.isNeggingJery = isNeggingJery;
	}

	public boolean isOnAdventure() {
		return isOnAdventure;
	}

	public void setOnAdventure(boolean isOnAdventure) {
		this.isOnAdventure = isOnAdventure;
	}

	@Override
	public String toString() {
		return "Rick [isDrinking=" + isDrinking + ", isNeggingJery=" + isNeggingJery + ", isOnAdventure="
				+ isOnAdventure + "]";
	}
	
	
}
