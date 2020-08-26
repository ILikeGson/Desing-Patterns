package main.java.com.ZhenyaShvyrkov.javacore.chapter06.creational.builder;

public class House {
    private Company companyName;
    private int floorsNumber;
    private int sectionsNumber;
    private int flatsNumber;
    private Color color;
    private String houseMaterial;

    public void setCompany(Company company) {
        this.companyName = company;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public void setSectionsNumber(int sectionsNumber) {
        this.sectionsNumber = sectionsNumber;
    }

    public void setFlatsNumber(int flatsNumber) {
        this.flatsNumber = flatsNumber;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public void setHouseMaterial(String houseMaterial) {
        this.houseMaterial = houseMaterial;
    }

    @Override
    public String toString() {
        return "House{" +
                "company=" + companyName +
                ", floorsNumber=" + floorsNumber +
                ", sectionsNumber=" + sectionsNumber +
                ", flatsNumber=" + flatsNumber +
                ", color=" + color +
                ", houseMaterial='" + houseMaterial + '\'' +
                '}';
    }
}
