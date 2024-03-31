package tech.gmo.smaad_webview_android;

import android.util.Log;
import android.webkit.JavascriptInterface;

public class JavaScriptBridgeInterface {
    private static final String LOG_TAG = "JSBridgeInterface";
    private SmaAdWebView.Listener mListener;

    public JavaScriptBridgeInterface(SmaAdWebView.Listener listener) {
        this.mListener = listener;
    }

    @JavascriptInterface
    public void webViewClosed(){
        Log.e("JavaScriptBridge", "webViewClosed called");
        if (mListener != null){
            mListener.onWebViewClosed();
        }
    }

    @JavascriptInterface
    public void launchURL(final String url){
        Log.e("JavaScriptBridge", "launchURL url = " + url);

    }


}
