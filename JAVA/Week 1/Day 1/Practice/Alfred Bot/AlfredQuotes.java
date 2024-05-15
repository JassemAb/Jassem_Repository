import java.util.Date;
public class AlfredQuotes {

 public String basicGreeting(){
  return "Hello , lovely to see you. How are you?";
 }
 public String guestGreeting(String name) {
  return "Hey " + name + " How are you";
 }
 public String dateAnnouncement(){
  Date date = new Date();
  return "Today is: " + date;
 }
 public String respondBeforeAlexis(String conversation) {
  if(conversation.indexOf("Alexis")!=-1){
   return "Hey Alexis";
  }else if(conversation.indexOf("Jassem")!=-1){
   return "What the floor";
  }else if (conversation == ""){
   return "khgfgjk";
  }
  return "";
 }
}