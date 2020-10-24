class Army {

    public static void createArmy() {
        // Implement this method
        Unit unit1 = new Unit("Nigel Talent");
        Unit unit2 = new Unit("Puppiesica");
        Unit unit3 = new Unit("King Blue");
        Unit unit4 = new Unit("Nigelatron");
        Unit unit5 = new Unit("Purely Blue");

        Knight knight1 = new Knight("Lord Philip Ruiz");
        Knight knight2 = new Knight("Lord Myles Hickman");
        Knight knight3 = new Knight("Lord Daniel Mcintyre (Dan)");

        General general = new General("Ethan Fuentes");

        Doctor doctor = new Doctor("Oskar Haney");
    }


    // Don't change the code below
    static class Unit {
        static String nameUnit;
        static int countUnit;

        public Unit(String name) {
            countUnit++;
            nameUnit = name;

        }
    }

    static class Knight {
        static String nameKnight;
        static int countKnight;

        public Knight(String name) {
            countKnight++;
            nameKnight = name;

        }
    }

    static class General {
        static String nameGeneral;
        static int countGeneral;

        public General(String name) {
            countGeneral++;
            nameGeneral = name;

        }
    }

    static class Doctor {
        static String nameDoctor;
        static int countDoctor;

        public Doctor(String name) {
            countDoctor++;
            nameDoctor = name;

        }
    }

    public static void main(String[] args) {
        createArmy();
        System.out.println(Unit.countUnit);
        System.out.println(Knight.countKnight);
        System.out.println(General.countGeneral);
        System.out.println(Doctor.countDoctor);
    }

}