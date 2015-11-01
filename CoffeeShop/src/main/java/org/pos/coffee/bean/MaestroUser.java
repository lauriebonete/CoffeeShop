package org.pos.coffee.bean;

public class MaestroUser extends User {

	private ReferenceLookUp branch;

	public ReferenceLookUp getBranch() {
		return branch;
	}

	public void setBranch(ReferenceLookUp branch) {
		this.branch = branch;
	}
	
}
