package com.iphone.model;

public class IPhone implements Phone, WebBrowser, MusicPlayer {

    @Override
    public void play() {
        System.out.println("Selected music playing");
    }

    @Override
    public void pause() {
        System.out.println("Selected music paused");
    }

    @Override
    public void selectMusic(String music) {
        System.out.println(music + " was selected");
    }

    @Override
    public void newTab() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'newTab'");
    }

    @Override
    public void refreshPage() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'refreshPage'");
    }

    @Override
    public void goTo(String url) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'goTo'");
    }

    @Override
    public void answer() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'answer'");
    }

    @Override
    public void startVoiceMail() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'startVoiceMail'");
    }

    @Override
    public void call(String phoneNumber) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'call'");
    }
    
}
