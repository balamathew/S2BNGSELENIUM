package javatopics;

import static javatopics.browsertype.chromebrowser;

public enum browsertype {

    chromebrowser,
    firefox;
}

class v {

    public static void hi(browsertype b) {

        switch (b) {
            case chromebrowser:
                System.out.println("hi");
                break;
            case firefox:
                System.out.println("hi");
                break;


        }
    }




    }
