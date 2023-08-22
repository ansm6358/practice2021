package »ó¼Ó2;

public class BioKey extends Key {

	int fingerprint;

	public BioKey(int no, String passwd, int fingerprint) {
		super(no, passwd);
		this.fingerprint = fingerprint;
	}

	public String toString() {
		return "BioKey [fingerprint=" + fingerprint + ", no=" + no + ", passwd=" + passwd + "]";
	}

}
