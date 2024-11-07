package uni.sw.unit.testing;

public class User {
    private String userName;
    private String password;
    private int id;
    private double academicAverage;
    public String getUserName() {
        return userName;
    }
    public String getPassword() {
        return password;
    }
    public int getId(){
        return id;
    }
    boolean isLoggedIn(){
        throw new UnsupportedOperationException();
    }
    public double getAcademicAverage(int semester) {
        return academicAverage;
    }
    public User update(String newPassword, boolean isLoggedIn){
        
        return this;
    }
    
}