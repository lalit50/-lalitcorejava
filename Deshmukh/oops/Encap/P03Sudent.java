package oops.Encap;

public class P03Sudent {
    protected int sudId;
    protected String sudName;
    protected int sudAge;

    public int getSudId() {
        return sudId;
    }

    public void setSudId(int sudId) {
        this.sudId = sudId;
    }

    public String getSudName() {
        return sudName;
    }

    public void setSudName(String sudName) {
        this.sudName = sudName;
    }

    public int getSudAge() {
        return sudAge;
    }

    public void setSudAge(int sudAge) {
        if (sudAge < 0) {
            sudAge = sudAge * -1;
        }
        this.sudAge = sudAge;
    }
}
