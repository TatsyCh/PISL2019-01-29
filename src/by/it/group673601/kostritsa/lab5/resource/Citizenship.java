package by.it.group673601.kostritsa.lab5.resource;

public enum Citizenship {
    BELARUS("BELARUS"),
    RUSSIA("RUSSIAN"),
    UKRAIN("UKRAIN"),
    GERMANY("GERMANY"),
    USA("USA");

    Citizenship(String citizenship) {
    }

    public String getName() {
        return name();
    }
}
