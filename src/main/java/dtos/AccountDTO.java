package dtos;

public class AccountDTO {

    private String Address;
    private String Phone;
    private String Email;
    private int Birth_year;
    private String gender;

    public AccountDTO() {
    }

    public AccountDTO(String address, String phone, String email, int birth_year, String gender) {
        Address = address;
        Phone = phone;
        Email = email;
        Birth_year = birth_year;
        this.gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int getBirth_year() {
        return Birth_year;
    }

    public void setBirth_year(int birth_year) {
        Birth_year = birth_year;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "AccountDTO{" +
                "Address='" + Address + '\'' +
                ", Phone='" + Phone + '\'' +
                ", Email='" + Email + '\'' +
                ", Birth_year=" + Birth_year +
                ", gender='" + gender + '\'' +
                '}';
    }
}
