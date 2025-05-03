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
        System.out.println("New tab opened");
    }

    @Override
    public void refreshPage() {
        System.out.println("Page reloaded");
    }

    @Override
    public void goTo(String url) {
        newTab();
        System.out.println("Page " + url + " loaded");
    }

    @Override
    public void answer() {
        System.out.println("Call answered");
    }

    @Override
    public void startVoiceMail() {
        System.out.println("Voicemail started");
    }

    @Override
    public void call(String phoneNumber) {
        
    }
    
}
