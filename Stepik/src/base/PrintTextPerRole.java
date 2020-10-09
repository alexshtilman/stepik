package base;

import java.util.Arrays;
import java.util.stream.Collectors;

public class PrintTextPerRole {


	public static String printTextPerRole(String[] roles, String[] textLines) {
		   int ind, k;
	        String bufrole = new String();
	        String buftext = new String();
	        String result = new String();
	        int l,j,i = 0;
	        StringBuffer sbuf = new StringBuffer();
	        StringBuffer text = new StringBuffer();
	        for (l = 0; l < roles.length ; l++) {
	            for (k = 0; k<textLines.length; k++) {
	                ind = textLines[k].indexOf(":");
	                bufrole = textLines[k].substring(0, ind);
	                buftext = textLines[k].substring(ind + 1);
	                    if (bufrole.equals(roles[l])) {
	                        text.append((k+1)+")"+buftext+'\n');
	                    }
	            }
	            sbuf.append('\n'+roles[l]+":"+'\n'+text);
	            text.delete(0,text.length());
	    }    
	    return sbuf.toString();
	}

}
