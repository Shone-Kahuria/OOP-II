abstract class account {
    protected int id;
    protected String name;
    private DataSource myData;

    public void performOperation(DataSource _myData) {
        myData = _myData;
        myData.execute();
    }
}

class Admin extends account {
    private String AuthPassword;

    public Admin(int _id, String _name, String _password) {
        id = _id;
        name = _name;
        AuthPassword = _password;
    }
}

class User extends account {
    public User(int _id, String _name) {
        id = _id;
        name = _name;
    }
}

interface DataSource {
    void execute();
}

class Delete implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been deleted.");
    }
}

class Update implements DataSource {
    @Override
    public void execute() {
        System.out.println("Data has been Updated Successfuly!");
    }
}

class View implements DataSource {
    @Override
    public void execute() {
        System.out.println("Some data to be displayed.");
    }
}