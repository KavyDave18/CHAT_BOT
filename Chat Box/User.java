import java.util.*;
class User{

    private String userName;
    private String userId;

    public void user( String userName){
        this.userName=userName;
        this.userId=UUID.randomUUID().toString();

    }
public String getUserName(){
    return userName;

}
public String getUserId(){
    return userId;

}
@Override
public String toString(){
return userName + "( ID: "+userId+" )";
}

}