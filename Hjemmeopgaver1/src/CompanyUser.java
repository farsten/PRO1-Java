public class CompanyUser {
    // Company.java
    public static class Company {
        public String name;
    }

    // User.java
    public static class User {
        public int id;
        public String name;
        public String email;
        public Company company;
    }
}
