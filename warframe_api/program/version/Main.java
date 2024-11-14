package program.version;

public class Main {
    public static void main(String[] args) {
        // setversion s = new setversion();
        // s.setjson();
        getversion g = new getversion();
        g.getJson("program/version/version.json");
        for (int i = 0; i < g.payload.version.size(); i++) {
            System.out.println(g.getversion_time()[i]);
            System.out.println(g.getversion_num()[i]);
            for (int j = 0; j < g.payload.version.get(i).detail.size(); j++) {
                System.out.println(g.getversion_detail(i)[j]);
            }
        }

    }
}
