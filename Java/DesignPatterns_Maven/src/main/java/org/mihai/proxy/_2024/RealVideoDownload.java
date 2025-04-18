package org.mihai.proxy._2024;

public class RealVideoDownload implements VideoDownloader {
    @Override
    public Video downloadVideo(String videoName) {
        System.out.println("Downloading video " + videoName);
        return new Video(videoName);
    }
}
