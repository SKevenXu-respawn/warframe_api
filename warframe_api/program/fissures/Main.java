package program.fissures;

public class Main {
    public static void main(String[] args) {
        fissures fi = new fissures();
        fissures_translate fi_t = new fissures_translate();
        /* fi.fissuress(); */
        /*
         * for(int j=1;j<=4;j++){
         * for(int i=0;i<fi.fissure_Hardmission(1).length;i++){
         * System.out.println(fi.fissure_Hardtier(j)[i]+"\t"+fi_t.fissure_translate(fi.
         * fissure_Hardmission(j)[i])+"\t"+fi.fissure_Hardnode(j)[i]+"\t"+fi.
         * fissure_Hardeta(j)[i]+"\t"+fi.fissure_Hardenemy(j)[i]);
         * }
         * }
         */
        for (int j = 1; j <= 5; j++) {
            for (int i = 0; i < fi.fissure_Hardmission(j).length; i++) {
                System.out.println(fi.fissure_Hardtier(j)[i] + "\t"
                        + fi_t.fissure_translate(fi.fissure_Hardmission(j)[i]) + "\t" + fi.fissure_Hardnode(j)[i] + "\t"
                        + fi.fissure_Hardeta(j)[i] + "\t" + fi.fissure_Hardenemy(j)[i]);
            }
        }
        for (int j = 1; j <= 5; j++) {
            for (int i = 0; i < fi.fissure_Stormmission(j).length; i++) {
                System.out.println(fi.fissure_Stormtier(j)[i] + "\t"
                        + fi_t.fissure_translate(fi.fissure_Stormmission(j)[i]) + "\t" + fi.fissure_Stormnode(j)[i]
                        + "\t" + fi.fissure_Stormeta(j)[i] + "\t" + fi.fissure_Stormenemy(j)[i]);
            }
        }
        for (int j = 1; j <= 5; j++) {
            for (int i = 0; i < fi.fissure_Commonmission(j).length; i++) {
                System.out.println(fi.fissure_Commontier(j)[i] + "\t"
                        + fi_t.fissure_translate(fi.fissure_Commonmission(j)[i]) + "\t" + fi.fissure_Commonnode(j)[i]
                        + "\t" + fi.fissure_Commoneta(j)[i] + "\t" + fi.fissure_Commonenemy(j)[i]);
            }
        }
        for(int i=0;i<fi.fissure_alltype().length;i++){
            System.out.println(fi_t.fissure_translate(fi.fissure_alltype()[i]));
            System.out.println(fi.fissure_alleta()[i]);
            System.out.println(fi.fissure_alltierNum()[i]);

        }

    }
}
