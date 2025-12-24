package bank;
public  class Account{
    public String name;
    protected String email;
    private String password;

    public String getPassword(){
      return this.password;
    }

    public void setPassword(String pass){
        this.password = pass;
    }
}f