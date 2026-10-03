package com.heytap.webpro.core;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.webkit.URLUtil;
import android.webkit.WebBackForwardList;
import android.webkit.WebHistoryItem;
import android.webkit.WebView;
import androidx.lifecycle.MutableLiveData;
import com.heytap.webpro.score.WebProScoreManager;
import com.oplus.aiunit.vision.q7b;
import com.oplus.aiunit.vision.tse;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public class CheckWebView extends WebView {
    private static final String TAG = "CheckWebView";
    private MutableLiveData<JSONObject> mCacheData;
    private String mCurShowUrl;
    private MutableLiveData<Boolean> mIsParallelData;
    private a onScrollListener;

    public interface a {
        void a(int i, int i2, int i3, int i4);
    }

    public CheckWebView(Context context) {
        super(context);
        this.mCurShowUrl = "";
    }

    private String getBackUrl() {
        WebHistoryItem itemAtIndex;
        WebBackForwardList webBackForwardListCopyBackForwardList = copyBackForwardList();
        if (webBackForwardListCopyBackForwardList == null || webBackForwardListCopyBackForwardList.getSize() == 0 || (itemAtIndex = webBackForwardListCopyBackForwardList.getItemAtIndex(webBackForwardListCopyBackForwardList.getCurrentIndex() - 1)) == null) {
            return null;
        }
        return itemAtIndex.getUrl();
    }

    private void overrideUrlLoading(String str) {
        if (this.mCacheData == null) {
            return;
        }
        boolean zC = tse.c(str);
        q7b.c(TAG, "overrideUrlLoading url=%s, isParallelRequest=%s", str, Boolean.valueOf(zC));
        if (zC) {
            tse.e(this.mCacheData, str);
        }
        MutableLiveData<Boolean> mutableLiveData = this.mIsParallelData;
        if (mutableLiveData != null) {
            mutableLiveData.postValue(Boolean.valueOf(zC));
        }
    }

    @Override // android.webkit.WebView
    public void destroy() {
        this.onScrollListener = null;
        this.mCurShowUrl = "";
        this.mCacheData = null;
        this.mIsParallelData = null;
        super.destroy();
    }

    public String getCurShowUrl() {
        return this.mCurShowUrl;
    }

    public boolean isAvailableDomain() {
        return WebProScoreManager.d().i(this.mCurShowUrl);
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str) {
        q7b.c(TAG, "loadUrl url=%s", str);
        if (URLUtil.isNetworkUrl(str)) {
            this.mCurShowUrl = str;
            overrideUrlLoading(str);
        }
        super.loadUrl(str);
        q7b.a(TAG, "loadUrl, end");
    }

    @Override // android.webkit.WebView, android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (i == 4 && canGoBack()) {
            String backUrl = getBackUrl();
            if (!TextUtils.isEmpty(backUrl)) {
                overrideUrlLoading(backUrl);
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.webkit.WebView, android.view.View
    public void onScrollChanged(int i, int i2, int i3, int i4) {
        super.onScrollChanged(i, i2, i3, i4);
        a aVar = this.onScrollListener;
        if (aVar != null) {
            aVar.a(i, i2, i3, i4);
        }
    }

    public void setCacheData(MutableLiveData<JSONObject> mutableLiveData) {
        this.mCacheData = mutableLiveData;
    }

    public void setCurShowUrl(String str) {
        this.mCurShowUrl = str;
    }

    public void setOnScrollListener(a aVar) {
        this.onScrollListener = aVar;
    }

    @Override // android.webkit.WebView, android.view.View
    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Exception e2) {
            q7b.p(TAG, "setOverScrollMode failed!", e2);
        }
    }

    public void setParallel(MutableLiveData<Boolean> mutableLiveData) {
        this.mIsParallelData = mutableLiveData;
    }

    public CheckWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mCurShowUrl = "";
    }

    public CheckWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.mCurShowUrl = "";
    }

    @Override // android.webkit.WebView
    public void loadUrl(String str, Map<String, String> map) {
        q7b.c(TAG, "loadUrl url=%s, additionalHttpHeaders=%s", str, map);
        if (URLUtil.isNetworkUrl(str)) {
            this.mCurShowUrl = str;
            overrideUrlLoading(str);
        }
        super.loadUrl(str, map);
        q7b.a(TAG, "loadUrl,additionalHttpHeaders end");
    }
}
