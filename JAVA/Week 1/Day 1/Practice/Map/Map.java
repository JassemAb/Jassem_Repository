import java.util.HashMap;

public class Map {
 public static void main(String[] args){
  HashMap<String, String> map = new HashMap<String, String>();
  map.put("Samara" , "3ala ha9i rani nmout ena");
  map.put("Balti" , "Salemli ala lhbiba 3ayech bin ness ghriba");
  map.put("ALA" , "3andekch chkoun fi tounes");
  map.put("El Castro" , "Benjamin Franklin");
  System.out.println(map.get("ALA"));
  
  for(String key : map.keySet()){
   System.out.println(String.format("Track: %s - Lyrics: %s" , key, map.get(key)));
  }
 }
}