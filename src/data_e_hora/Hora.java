package data_e_hora;

public class Hora {
	
	public Hora() {
	}
	
	 public String hourToString(int hourOfDay, int minute) {
         // Do something with the time chosen by the user
         int hour_x = hourOfDay;
         int minute_x = minute;
         String parse;
         if (hour_x < 9 && minute_x < 9){
             parse = "0"+hour_x +"0"+minute_x;
         }else if (hour_x > 9 && minute_x < 9){
             parse = hour_x +"0"+minute_x;
         }else if (hour_x < 9 && minute_x > 9){
             parse = "0"+hour_x +minute_x;
         }else {
             parse = hour_x +""+minute_x;
         }
         return parse;

     }
}
