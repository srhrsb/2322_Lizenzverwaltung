package model;

public class License {
    private int id;
    private int userId;
    private String name;
    private LicenseType licenseType;

    public License(int id, String name, LicenseType licenseType) {
        this.id = id;
        this.name = name;
        this.licenseType = licenseType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LicenseType getLicenseType() {
        return licenseType;
    }

    public void setLicenseType(LicenseType licenseType) {
        this.licenseType = licenseType;
    }
}
