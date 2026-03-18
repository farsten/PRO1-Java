package OpgaverL13.ex4;

public class Name {
    private String firstName;
    private String middleName;
    private String lastName;


    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.middleName = null;
        this.lastName = lastName;

    }

    public Name(String firstName, String middleName, String lastName) {
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
    }

    public String getFullName() {
        if (getMiddleName() == null) {
            return getFirstName() + " " + getLastName();
        } else return getFirstName() + " " + getMiddleName() + " " + getLastName();
    }

    public String userName() {
        if (getMiddleName() == null) {
            return getFirstName().substring(0, 2).toUpperCase() + "0" + getLastName().substring(getLastName().length() - 2);
        } else
            return getFirstName().substring(0, 2).toUpperCase() + getMiddleName().length() + getLastName().substring(getLastName().length() - 2);
    }

    public String getInitials() {
        if (getMiddleName() == null) {
            return getFirstName().substring(0, 1) + getLastName().substring(0, 1);
        } else return getFirstName().substring(0, 1) + getMiddleName().substring(0, 1) + getLastName().substring(0, 1);
    }

    public String getCryptoInitials(int count) {
        if (getMiddleName() == null) {
            char firstNameInitialChar = getFirstName().charAt(0);
            char lastNameInitialChar = getLastName().charAt(0);

            int firstNameInitialInt = firstNameInitialChar + count;
            int lastNameInitialInt = lastNameInitialChar + count;

            firstNameInitialChar = (char) firstNameInitialInt;
            lastNameInitialChar = (char) lastNameInitialInt;

            return String.valueOf(firstNameInitialChar) + lastNameInitialChar;
        } else {
            char firstNameInitialChar = getFirstName().charAt(0);
            char middleNameInitialChar = getMiddleName().charAt(0);
            char lastNameInitialChar = getLastName().charAt(0);

            int firstNameInitialInt = firstNameInitialChar + count;
            int middleNameInitialInt = middleNameInitialChar + count;
            int lastNameInitialInt = lastNameInitialChar + count;

            firstNameInitialChar = (char) firstNameInitialInt;
            middleNameInitialChar = (char) middleNameInitialInt;
            lastNameInitialChar = (char) lastNameInitialInt;

            return String.valueOf(firstNameInitialChar) + middleNameInitialChar + lastNameInitialChar;
        }

    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getMiddleName() {
        return middleName;
    }
}
