HtmlLoadFromAssets
==================

I am sharing this because I wanted to read an html file from the assets directory and display is in a webview.  However, my attempts at 
using the protocol pattern "file:///android_asset/myfile.html" were unsuccessful.  Therefore, I turned to the AssetManager class to load
my file for me.  I have seen other examples of using the loadData method of the WebView class.  However, using my Samsung Ring phone as the test device, this never worked.  I am reading an input stream from the asset manager and then outputting the stream as a String variable.  I then call the loadData method and pass the string of html to the WebView.loadData method specifyig the type and encoding of the resource.
