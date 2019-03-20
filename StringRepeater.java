public class StringRepeater {
    public String repeatString(String s, int n){
    	//Sets up a StringBuffer for the empty string ""
    	StringBuffer stringBuffer = new StringBuffer("");
    	for(int i=0; i<n; i++) {
    	//the append function is used to add the string 's' to the empty string in the StringBuffer
    	stringBuffer.append(s);
    	}
    	return s;
    }
}