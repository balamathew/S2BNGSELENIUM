package pages;

public class Students {



    int ids;
    String names;
    double depts;

    public Students(int ids) {
        this.ids = ids;
    }

    public Students(String names) {
        this.names = names;
    }

    public Students(double depts) {
        this.depts = depts;
    }

    public Students(int i, String hero, int i1) {

        this.ids=i;
        this.names=hero;
        this.depts=i1;
    }

    //....................

    public int getIds() {
        return ids;
    }

    public String getNames() {
        return names;
    }
}

