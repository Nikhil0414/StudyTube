package com.example.myapplication

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebView
import androidx.fragment.app.Fragment

class WishlistFragment : Fragment() {

    private val stringJavaScript1 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">tg</div>
            <div class="video-description">Learn Dart & 9t97owIgDak From Scratch in this 20 Hour Course Designed For Absolute Beginners  Completely For Free! Flutter is an open-source UI software development kit created by Google, used to create cross-platform apps for iOS, Android, Windows, Mac, and more from a single codebase. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""


    private val stringJavaScript2 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""


    private val stringJavaScript3 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""


    private val stringJavaScript4 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""


    private val stringJavaScript5 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""

    private val stringJavaScript6 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""

    private val stringJavaScript7 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""

    private val stringJavaScript8 = """<!DOCTYPE html>
<html>
<head>
    <style>
        /* CSS for the tab-like layout */
        .tab-container {
            display: flex;
        }

        .video {
            flex: 1;
            width: 70%; /* Adjust the width as needed */
            margin-right: 20px;
        }

        .video-info {
            flex: 1;
            width: 30%; /* Adjust the width as needed */
        }

        /* Style for video title and description */
        .video-title {
            font-size: 18px;
            font-weight: bold;
            margin-bottom: 10px;
        }

        .video-description {
            font-size: 14px;
        }
    </style>
</head>
<body>
    <div class="tab-container">
        <!-- Left Column for Video -->
        <div class="video">
            <div id="player"></div>
        </div>

        <!-- Right Column for Video Title and Description -->
        <div class="video-info">
            <div class="video-title">Video Title Goes Here</div>
            <div class="video-description">Video description goes here. You can add a longer description if needed.</div>
        </div>
    </div>

    <script>
        // Load the YouTube API and create the player
        var tag = document.createElement('script');
        tag.src = "https://www.youtube.com/iframe_api";
        var firstScriptTag = document.getElementsByTagName('script')[0];
        firstScriptTag.parentNode.insertBefore(tag, firstScriptTag);

        var player;
        function onYouTubeIframeAPIReady() {
            player = new YT.Player('player', {
                height: '110',
                width: '200',
                videoId: 'grEKMHGYyns',
                playerVars: {
                    'playsinline': 1
                },
                events: {
                    'onReady': onPlayerReady,
                    'onStateChange': onPlayerStateChange
                }
            });
        }

        function onPlayerReady(event) {
            event.target.playVideo();
        }

        var done = false;
        function onPlayerStateChange(event) {
            if (event.data == YT.PlayerState.PLAYING && !done) {
                setTimeout(stopVideo, 10000);
                done = true;
            }
        }

        function stopVideo() {
            player.stopVideo();
        }
    </script>
</body>
</html>"""


    private var webView1: WebView? = null
    private var webView2: WebView? = null
    private var webView3: WebView? = null
    private var webView4: WebView? = null
    private var webView5: WebView? = null
    private var webView6: WebView? = null
    private var webView7: WebView? = null
    private var webView8: WebView? = null


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_wishlist, container, false)

        webView1 = view.findViewById(R.id.webView1)
        webView2 = view.findViewById(R.id.webView2)
        webView3 = view.findViewById(R.id.webView3)
        webView4 = view.findViewById(R.id.webView4)
        webView5 = view.findViewById(R.id.webView5)
        webView6 = view.findViewById(R.id.webView6)
        webView7 = view.findViewById(R.id.webView7)
        webView8 = view.findViewById(R.id.webView8)

        webView1?.settings?.javaScriptEnabled = true
        webView2?.settings?.javaScriptEnabled = true
        webView3?.settings?.javaScriptEnabled = true
        webView4?.settings?.javaScriptEnabled = true
        webView5?.settings?.javaScriptEnabled = true
        webView6?.settings?.javaScriptEnabled = true
        webView7?.settings?.javaScriptEnabled = true
        webView8?.settings?.javaScriptEnabled = true


        webView1?.loadData(stringJavaScript1, "text/html", "utf-8")
        webView2?.loadData(stringJavaScript2, "text/html", "utf-8")
        webView3?.loadData(stringJavaScript3, "text/html", "utf-8")
        webView4?.loadData(stringJavaScript4, "text/html", "utf-8")
        webView5?.loadData(stringJavaScript5, "text/html", "utf-8")
        webView6?.loadData(stringJavaScript5, "text/html", "utf-8")
        webView7?.loadData(stringJavaScript5, "text/html", "utf-8")
        webView8?.loadData(stringJavaScript5, "text/html", "utf-8")

        return view
    }
}
