package org.accenture.factory;

public class Main {

    public static void main(String[] args) {
	Factory factory= new MultimediaFactory();
	
	MultimediaFile mp3= factory.createMedia("MP3");
	mp3.play();
	

	MultimediaFile wav= factory.createMedia("WAV");
	wav.play();
	

	MultimediaFile mp5= factory.createMedia("MP5");
	mp5.play();
	

    }

}
