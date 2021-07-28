package guru.qa.data;

public enum Country {
    RU("Россия"), CN("Китай"), US("USA");

    String countryName;

    Country(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryName() {
        return countryName;
    }
}
