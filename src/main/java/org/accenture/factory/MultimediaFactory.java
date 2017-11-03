package org.accenture.factory;

public class MultimediaFactory implements Factory{
	@Override
	public MultimediaFile createMedia (String name) {
	    MultimediaFile file;
	    if(name.equals("MP3")) {
		file= new MP3();
	    }else if(name.equals("WAV")) {
		file= new WAV();		
	    }else {
		throw new RuntimeException("File type: "+name+"");
	    }
	    return file;
	}
    

}
