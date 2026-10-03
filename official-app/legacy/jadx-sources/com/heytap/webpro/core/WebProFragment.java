package com.heytap.webpro.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import com.heytap.webpro.jsapi.JsApiResponse;
import com.heytap.webpro.theme.H5ThemeHelper;
import com.heytap.webpro.utils.SingleLiveData;
import com.heytap.webview.extension.fragment.ArgumentKey;
import com.oplus.aiunit.vision.b0a;
import com.oplus.aiunit.vision.dja;
import com.oplus.aiunit.vision.ho3;
import com.oplus.aiunit.vision.jja;
import com.oplus.aiunit.vision.kr9;
import com.oplus.aiunit.vision.lnl;
import com.oplus.aiunit.vision.pr9;
import com.oplus.aiunit.vision.q7b;
import com.oplus.aiunit.vision.qy9;
import com.oplus.aiunit.vision.rol;
import com.oplus.aiunit.vision.t0l;
import com.oplus.aiunit.vision.tnl;
import com.oplus.aiunit.vision.wre;
import com.platform.account.webview.constant.Constants;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Keep
public abstract class WebProFragment extends Fragment implements pr9 {
    private static final String PRELOAD_OBJ_NAME = "preloadObj";
    private static final String TAG = "WebProFragment";
    private long mCreateTime;
    protected WebProLifecycleObserver mLifecycleObserver;
    private long mPageStartTime;
    public ActivityResultLauncher<String[]> mPermissionLauncher;
    private qy9 mStateViewAdapter;
    protected lnl mWebChromeClient;
    private WebView mWebView;
    protected tnl mWebViewClient;
    private rol mWebViewManager;
    private final HashMap<Integer, b0a> mWaitForResultObservers = new HashMap<>();
    private boolean mIsWebViewSaveInstanceState = true;
    public SingleLiveData<ho3<JSONObject>> mLiveDataPermissions = new SingleLiveData<>();
    protected final MutableLiveData<JSONObject> mCacheData = new MutableLiveData<>();
    protected final MutableLiveData<Boolean> mIsParallel = new MutableLiveData<>();
    protected final wre mPreloadInterface = new wre();

    public static class a {
        public final Bundle a = new Bundle();

        public a a(Bundle bundle) {
            if (bundle != null) {
                this.a.putAll(bundle);
            }
            return this;
        }

        public <T extends WebProFragment> T b(Context context, Class<T> cls) {
            return (T) Fragment.instantiate(context, cls.getName(), this.a);
        }

        public a c(Uri uri) {
            this.a.putParcelable(ArgumentKey.URI, uri);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerPermissions$0(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && map.size() > 0) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (Exception e2) {
                q7b.f(TAG, "registerPermissions error!", e2);
            }
        }
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null || jSONArrayNames.length() <= 0) {
            this.mLiveDataPermissions.setValue(ho3.a());
        } else {
            this.mLiveDataPermissions.setValue(ho3.c(jSONObject));
        }
    }

    private void registerPermissions() {
        this.mPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.oplus.aiunit.vision.mnl
            @Override // androidx.activity.result.ActivityResultCallback
            public final void onActivityResult(Object obj) {
                this.a.lambda$registerPermissions$0((Map) obj);
            }
        });
    }

    @Override // com.oplus.aiunit.vision.pr9
    public void addLifecycleObserver(LifecycleObserver lifecycleObserver) {
        getLifecycle().addObserver(lifecycleObserver);
    }

    public void callJsFunction(String str, @Nullable JSONObject jSONObject) {
        Object obj;
        if (this.mWebView != null) {
            Object[] objArr = new Object[2];
            objArr[0] = str;
            if (jSONObject == null) {
                obj = jSONObject;
                obj = "{}";
            }
            obj = jSONObject;
            objArr[1] = obj;
            this.mWebView.evaluateJavascript(String.format("if(window.heytapCall){window.heytapCall('%s', %s);}", objArr), null);
        }
    }

    public void evaluateJavascript(@NonNull String str, @Nullable ValueCallback<String> valueCallback) {
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.evaluateJavascript(str, valueCallback);
        }
    }

    public LiveData<JSONObject> getCacheData() {
        return this.mCacheData;
    }

    public long getPageStartTime() {
        return this.mPageStartTime;
    }

    @Override // com.oplus.aiunit.vision.pr9
    @Nullable
    public abstract /* synthetic */ String getProductId();

    public long getStartTime() {
        long pageStartTime = getPageStartTime();
        long j2 = this.mCreateTime;
        return pageStartTime < j2 ? j2 : getPageStartTime() - this.mCreateTime;
    }

    @Nullable
    public Uri getUri() {
        if (getArguments() != null) {
            return (Uri) getArguments().getParcelable(ArgumentKey.URI);
        }
        return null;
    }

    public JSONObject getVisibleInfo() {
        boolean z = getView() != null && isTop();
        boolean z2 = getView() != null && getView().getVisibility() == 0;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("visible", z);
            jSONObject.put("isTop", isTop());
            jSONObject.put("isResumed", isResumed());
            jSONObject.put("rootVisible", z2);
            jSONObject.put("fragmentVisible", isVisible());
        } catch (JSONException e2) {
            q7b.f(TAG, "getVisibleInfo failed!", e2);
        }
        return jSONObject;
    }

    @Override // com.oplus.aiunit.vision.pr9
    public <T extends WebView> T getWebView(Class<T> cls) {
        return (T) this.mWebView;
    }

    public boolean goBack() {
        WebView webView = this.mWebView;
        if (webView == null || !webView.canGoBack()) {
            return false;
        }
        this.mWebView.goBack();
        return true;
    }

    public boolean goForward() {
        WebView webView = this.mWebView;
        if (webView == null || !webView.canGoForward()) {
            return false;
        }
        this.mWebView.goForward();
        return true;
    }

    public boolean isTop() {
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        b0a b0aVarRemove = this.mWaitForResultObservers.remove(Integer.valueOf(i));
        if (b0aVarRemove != null) {
            b0aVarRemove.onResult(i2, intent);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onConfigWebView(WebView webView) {
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadsImagesAutomatically(true);
        settings.setUseWideViewPort(true);
        settings.setSaveFormData(true);
        settings.setSupportMultipleWindows(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDefaultZoom(WebSettings.ZoomDensity.MEDIUM);
        settings.setSupportZoom(false);
        settings.setBuiltInZoomControls(true);
        settings.setAllowFileAccess(false);
        settings.setAllowContentAccess(false);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setDatabasePath(this.mWebView.getContext().getDir("database", 0).getPath());
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setBlockNetworkLoads(false);
        settings.setAppCacheEnabled(true);
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setMixedContentMode(2);
        webView.setForceDarkAllowed(false);
        this.mWebView.setLongClickable(true);
        this.mWebView.setScrollbarFadingEnabled(true);
        this.mWebView.setScrollBarStyle(0);
        this.mWebView.setDrawingCacheEnabled(true);
        this.mWebView.setHorizontalScrollBarEnabled(false);
        this.mWebView.setVerticalScrollBarEnabled(false);
        if (webView instanceof CheckWebView) {
            CheckWebView checkWebView = (CheckWebView) webView;
            MutableLiveData<Boolean> mutableLiveData = this.mIsParallel;
            LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
            final wre wreVar = this.mPreloadInterface;
            Objects.requireNonNull(wreVar);
            mutableLiveData.observe(viewLifecycleOwner, new Observer() { // from class: com.oplus.aiunit.vision.nnl
                @Override // androidx.lifecycle.Observer
                public final void onChanged(Object obj) {
                    wreVar.b(((Boolean) obj).booleanValue());
                }
            });
            checkWebView.addJavascriptInterface(this.mPreloadInterface, PRELOAD_OBJ_NAME);
            checkWebView.setParallel(this.mIsParallel);
            checkWebView.setCacheData(this.mCacheData);
        }
        tnl tnlVar = this.mWebViewClient;
        if (tnlVar != null) {
            tnlVar.setPreloadInterface(this.mPreloadInterface);
            this.mWebViewClient.setParallel(this.mIsParallel);
            this.mWebViewClient.setCacheData(this.mCacheData);
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getActivity() != null) {
            H5ThemeHelper.h(getActivity(), configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mCreateTime = System.nanoTime();
        this.mWebViewManager = new rol(this);
        this.mStateViewAdapter = onCreateStateViewAdapter();
        this.mWaitForResultObservers.clear();
        registerPermissions();
    }

    public qy9 onCreateStateViewAdapter() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        t0l t0lVar = new t0l();
        onCreateView(viewGroup, bundle, t0lVar);
        WebView webViewC = t0lVar.c();
        this.mWebView = webViewC;
        if (webViewC == null) {
            throw new IllegalArgumentException("WebProFragment onCreateView, mWebView is null! fragment is: " + this);
        }
        tnl tnlVarOnCreateWebViewClient = onCreateWebViewClient();
        this.mWebViewClient = tnlVarOnCreateWebViewClient;
        this.mWebView.setWebViewClient(tnlVarOnCreateWebViewClient);
        lnl lnlVarOnCreateWebChromeClient = onCreateWebChromeClient();
        this.mWebChromeClient = lnlVarOnCreateWebChromeClient;
        this.mWebView.setWebChromeClient(lnlVarOnCreateWebChromeClient);
        onConfigWebView(this.mWebView);
        if (getArguments() != null && getArguments().getBoolean(ArgumentKey.ENABLE_DARK_MODEL, true)) {
            H5ThemeHelper.f(this.mWebView, false);
        }
        this.mWebViewManager.k(this.mWebView, getArguments(), bundle);
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onCreate(t0lVar.b(), bundle);
        }
        return t0lVar.a();
    }

    public lnl onCreateWebChromeClient() {
        return new lnl(this);
    }

    public tnl onCreateWebViewClient() {
        return new tnl(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mStateViewAdapter = null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mWebViewManager.l();
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onDestroy();
        }
        this.mWaitForResultObservers.clear();
        WebView webView = this.mWebView;
        if (webView != null) {
            onDestroyWebView(webView);
        }
        this.mWebViewClient = null;
        this.mWebChromeClient = null;
        this.mWebView = null;
    }

    public void onDestroyWebView(@NonNull WebView webView) {
        ViewParent parent = webView.getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(webView);
        }
        webView.removeJavascriptInterface(PRELOAD_OBJ_NAME);
        webView.setWebViewClient(null);
        webView.setWebChromeClient(null);
        webView.stopLoading();
        webView.getSettings().setJavaScriptEnabled(false);
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowContentAccess(false);
        webView.clearHistory();
        webView.removeAllViews();
        webView.destroy();
    }

    public void onDomLoadFinish(jja jjaVar, kr9 kr9Var) {
        JsApiResponse.invokeSuccess(kr9Var);
    }

    public void onFindCrossDomainIssue(String str, String str2, String str3, String str4) {
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onFindCrossDomainIssue(str, str2, str3, str4);
        }
    }

    @dja(method = Constants.JsbConstants.METHOD_FINISH, product = "vip")
    public final void onFinishWebView(jja jjaVar, kr9 kr9Var) {
        onJsFinishExecutor(jjaVar, kr9Var);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (z || !isResumed()) {
            this.mLifecycleObserver.onPause(this);
        } else {
            this.mLifecycleObserver.onResume(this);
        }
        FragmentTrackHelper.trackOnHiddenChanged(this, z);
    }

    public boolean onJsFinish(jja jjaVar, kr9 kr9Var) {
        return false;
    }

    public void onJsFinishExecutor(jja jjaVar, kr9 kr9Var) {
        if (!onJsFinish(jjaVar, kr9Var) && getActivity() != null && !getActivity().isFinishing()) {
            getActivity().finish();
        }
        JsApiResponse.invokeSuccess(kr9Var);
    }

    @dja(method = Constants.JsbConstants.METHOD_OPEN_NEW_WEBVIEW, product = "vip")
    public final void onOpenNewWebView(jja jjaVar, kr9 kr9Var) {
        onOpenWebViewExecutor(jjaVar, kr9Var);
    }

    public boolean onOpenWebView(jja jjaVar, kr9 kr9Var) {
        return false;
    }

    public void onOpenWebViewExecutor(jja jjaVar, kr9 kr9Var) {
        if (onOpenWebView(jjaVar, kr9Var)) {
            JsApiResponse.invokeSuccess(kr9Var);
        } else {
            JsApiResponse.invokeFailed(kr9Var);
        }
    }

    public void onPageCommitVisible() {
    }

    public void onPageFinished() {
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onPageFinished();
        }
    }

    public void onPageStarted() {
        this.mPageStartTime = System.nanoTime();
        this.mWebViewManager.m();
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onPageStarted();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onPause() {
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    public void onProgressChanged(int i) {
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onProgressChanged(i);
        }
    }

    public void onReceivedError(int i, String str) {
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onReceivedError(i, str);
        }
    }

    public void onReceivedIcon(@Nullable Bitmap bitmap) {
    }

    public void onReceivedSslError(SslErrorHandler sslErrorHandler, SslError sslError) {
        sslErrorHandler.cancel();
    }

    public void onReceivedTitle(@Nullable String str) {
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onResume() {
        super.onResume();
        FragmentTrackHelper.trackFragmentResume(this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mIsWebViewSaveInstanceState) {
            this.mWebViewManager.p(bundle);
        }
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onSaveInstanceState(bundle);
        }
    }

    @dja(method = Constants.JsbConstants.METHOD_SET_CLIENT_TITLE, product = "vip")
    public final void onSetClientTitle(jja jjaVar, kr9 kr9Var) {
        setClientTitle(jjaVar, kr9Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mWebViewManager.o();
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mWebViewManager.n();
        qy9 qy9Var = this.mStateViewAdapter;
        if (qy9Var != null) {
            qy9Var.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLifecycleObserver = new WebProLifecycleObserver(this);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @dja(method = Constants.JsbConstants.METHOD_ON_DOMLOAD_FINISH, product = "vip")
    public final void onWebDomLoadFinish(jja jjaVar, kr9 kr9Var) {
        onDomLoadFinish(jjaVar, kr9Var);
    }

    public void refresh(jja jjaVar, kr9 kr9Var) {
        WebView webView = this.mWebView;
        if (webView != null) {
            webView.reload();
        }
        JsApiResponse.invokeSuccess(kr9Var);
    }

    @dja(method = "refresh", product = "vip")
    public final void reloadWebView(jja jjaVar, kr9 kr9Var) {
        refresh(jjaVar, kr9Var);
    }

    public void removeLifecycleObserver(LifecycleObserver lifecycleObserver) {
        getLifecycle().removeObserver(lifecycleObserver);
    }

    @Override // com.oplus.aiunit.vision.pr9
    public LiveData<ho3<JSONObject>> requestPermission(String[] strArr) {
        ActivityResultLauncher<String[]> activityResultLauncher = this.mPermissionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(strArr);
        }
        return this.mLiveDataPermissions;
    }

    public void setClientTitle(jja jjaVar, kr9 kr9Var) {
        JsApiResponse.invokeSuccess(kr9Var);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }

    public void setWebViewSaveInstanceState(boolean z) {
        this.mIsWebViewSaveInstanceState = z;
    }

    public void startActivityForResult(Intent intent, int i, b0a b0aVar) {
        this.mWaitForResultObservers.put(Integer.valueOf(i), b0aVar);
        startActivityForResult(intent, i);
    }

    public void onCreateView(@Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull t0l t0lVar) {
        WebView webView = new WebView(getContext());
        webView.getSettings().setAllowContentAccess(false);
        webView.getSettings().setAllowFileAccess(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(webView, -1, -1);
        ViewGroup frameLayout2 = new FrameLayout(getContext());
        frameLayout.addView(frameLayout2, -1, -1);
        t0lVar.d(frameLayout).e(frameLayout2).f(webView);
    }
}
