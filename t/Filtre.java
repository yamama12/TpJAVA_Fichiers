package t;

import java.io.File;
import java.io.FilenameFilter;

public class Filtre implements FilenameFilter {
	private char lettre ;
	
	public Filtre(char lettreDébut) {
		lettre = lettreDébut;
		}
	
	@Override
	public boolean accept(File dir, String name) {
		// TODO Auto-generated method stub
		if (name.charAt(0)== 'b') {
			return true ;
		}
		return false;
	}

}
