package example;

/**
 * @author Bryce_dd
 * @date 2021/10/24
 */
public class Reader {
    private static final long serialVersionUID = 1L;
    private String name;
    private String password;

    public Reader(){}
    public Reader(String name,String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //Get/Set方法省略
    public String toString(){
        return "Name:"+name+",Password:"+password;
    }
}
