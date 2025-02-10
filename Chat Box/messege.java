import java.time.LocalDateTime;
import java.util.*;
public class messege {

       private String sender;
       private String reciver;
       private String content;
       private LocalDateTime timestamp;

       public void Messege(String sender ,String reciver,String content){
        this.sender=sender;
        this.reciver=reciver;
        this.content=content;
        this.timestamp=LocalDateTime.now();
    
    }
    public String getSender(){
    return sender;
    }

    public String getReciver(){
    return reciver;
    }

    public String getContent(){
        return content;
        }

    public LocalDateTime getTimeStamp(){
    return timestamp;
    }

    @Override
    public String toString(){
    return "[" + timestamp + "]" + sender +"->" + reciver + " : "+ content;
    }



    
}
