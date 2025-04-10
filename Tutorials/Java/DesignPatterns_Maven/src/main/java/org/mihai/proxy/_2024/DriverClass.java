package org.mihai.proxy._2024;

public class DriverClass {

    public static void main(String[] args) {

        // By using the real video downloader, we can see that the same videos will be downloaded again and again
        VideoDownloader videoDownloader = new RealVideoDownload();
        videoDownloader.downloadVideo("videoName1");
        videoDownloader.downloadVideo("videoName2");
        videoDownloader.downloadVideo("videoName1");

        System.out.println("---");

        // By using the proxy, we also cache the videos previously downloaded for performance reasons
        // This is just one additional functionality we can obtain by implementing the Proxy DP

        VideoDownloader proxyVideoGameDownloader = new ProxyVideoGameDownloader(videoDownloader);
        proxyVideoGameDownloader.downloadVideo("videoName1");
        proxyVideoGameDownloader.downloadVideo("videoName2");
        proxyVideoGameDownloader.downloadVideo("videoName1");

    }
}
