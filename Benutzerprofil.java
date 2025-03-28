    import utils.*;
    /**
     * Beschreiben Sie hier die Klasse Benutzerprofil.
     *
     * @author (Ihr Name)
     * @version (eine Versionsnummer oder ein Datum)
     */
    public class Benutzerprofil implements ComparableContent<Benutzerprofil> {

        private String benutzername;

        private String pw;


        // Konstruktor für Objekte der Klasse Benutzerprofil

        public Benutzerprofil(String login, String ppw) {
            benutzername = login;
            pw = ppw;

        }

        public String getBenutzername() {
            return benutzername;
        }

        public boolean isGreater(Benutzerprofil pContent) {
            if (benutzername.compareTo(pContent.getBenutzername()) < 0) {
                return true;
            }
            return false;
        }



        public boolean isLess(Benutzerprofil pContent) {
            if (benutzername.compareTo(pContent.getBenutzername()) < 1) {
                return true;
            }
            return false;
        }




        public boolean isEqual(Benutzerprofil pContent) {
            if (benutzername.compareTo(pContent.getBenutzername()) == 0) {
                return true;
            }
            return false;
        }
    }
}
