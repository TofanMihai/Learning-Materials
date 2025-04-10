package org.mihai.proxy._2024;

import java.util.HashMap;

/**
 * This example displays the use of the ProxyDP for caching
 */
public class ProxyVideoGameDownloader implements VideoDownloader {

    private final VideoDownloader videoDownloader;
    private final HashMap<String, Video> videoCache = new HashMap<>();

    public ProxyVideoGameDownloader(VideoDownloader videoDownloader) {
        this.videoDownloader = videoDownloader;
    }

    @Override
    public Video downloadVideo(String videoName) {
        if (!videoCache.containsKey(videoName)) {
            videoCache.put(videoName, videoDownloader.downloadVideo(videoName));
        }
        return videoCache.get(videoName);
    }
}
