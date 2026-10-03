package com.oplus.web.container.webview.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.oplus.aiunit.vision.d1a;
import com.oplus.aiunit.vision.dri;
import com.oplus.aiunit.vision.erl;
import com.oplus.aiunit.vision.fsl;
import com.oplus.aiunit.vision.h1a;
import com.oplus.aiunit.vision.l2a;
import com.oplus.aiunit.vision.mka;
import com.oplus.aiunit.vision.n2a;
import com.oplus.aiunit.vision.q4l;
import com.oplus.aiunit.vision.qsl;
import com.oplus.aiunit.vision.re8;
import com.oplus.aiunit.vision.rs9;
import com.oplus.aiunit.vision.ska;
import com.oplus.aiunit.vision.uo3;
import com.oplus.aiunit.vision.us9;
import com.oplus.aiunit.vision.ws9;
import com.oplus.aiunit.vision.wz9;
import com.oplus.aiunit.vision.y8b;
import com.oplus.aiunit.vision.yg1;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import com.oplus.web.container.engine.WebEngineHelper;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.oplus.web.container.webview.utils.SingleLiveData;
import com.oplus.web.container.webview.viewmodel.WebContainerModel;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
public class WebContainerFragment extends Fragment implements us9 {
    private static final String PRELOAD_OBJ_NAME = "preloadObj";
    private static final String TAG = "WebContainerFragment";
    private long mCreateTime;
    private WebContainerLifecycleObserver mLifecycleObserver;
    private long mPageStartTime;
    public ActivityResultLauncher<String[]> mPermissionLauncher;
    private wz9 mStateViewAdapter;
    private l2a mWebView;
    private n2a mWebViewCallback;
    private qsl mWebViewManager;
    private int requestCodeCallback;
    private int requestCodeInterceptor;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final HashMap<Integer, h1a> mWaitForResultObservers = new HashMap<>();
    private boolean mIsWebViewSaveInstanceState = true;
    public SingleLiveData<uo3<JSONObject>> mLiveDataPermissions = new SingleLiveData<>();
    protected final MutableLiveData<JSONObject> mCacheData = new MutableLiveData<>();
    protected final MutableLiveData<Boolean> mIsParallel = new MutableLiveData<>();

    public class a implements n2a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.n2a
        public boolean a(@NonNull l2a l2aVar, @Nullable String str) {
            dri.h(yg1.s(str));
            return WebContainerFragment.this.mWebViewCallback != null && WebContainerFragment.this.mWebViewCallback.a(l2aVar, str);
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void b(@NonNull l2a l2aVar, @NonNull int i, @NonNull String str, @NonNull String str2, boolean z) {
            dri.h(yg1.o(Integer.toString(i), str, str2, String.valueOf(z)));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.b(l2aVar, i, str, str2, z);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                y8b.i(WebContainerFragment.TAG, "isForMainFrame:" + z);
                WebContainerFragment.this.mStateViewAdapter.a(i, str, z);
            }
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void c(@NonNull l2a l2aVar, @NonNull Bitmap bitmap) {
            dri.h(yg1.p());
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.c(l2aVar, bitmap);
            }
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void d(@NonNull l2a l2aVar, @NonNull String str) {
            dri.h(yg1.q(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.d(l2aVar, str);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.a(-1, str, false);
            }
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void e(@NonNull l2a l2aVar, @NonNull String str, @NonNull Bitmap bitmap) {
            dri.h(yg1.m(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.f(l2aVar, str);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.onPageStarted();
            }
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void f(@NonNull l2a l2aVar, @NonNull String str) {
            dri.h(yg1.l(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.f(l2aVar, str);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.onPageFinished();
            }
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void g(@NonNull l2a l2aVar, @NonNull String str) {
            dri.h(yg1.r(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.g(l2aVar, str);
            }
            WebContainerFragment.this.onReceivedTitle(str);
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void h(@NonNull l2a l2aVar, int i) {
            dri.h(yg1.n(Integer.toString(i)));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.h(l2aVar, i);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.onProgressChanged(i);
            }
        }

        @Override // com.oplus.aiunit.vision.n2a
        public void i(@NonNull l2a l2aVar, @NonNull String str) {
            dri.h(yg1.k(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.i(l2aVar, str);
            }
        }
    }

    public static class b {
        public final Bundle a = new Bundle();

        public b a(Bundle bundle) {
            if (bundle != null) {
                this.a.putAll(bundle);
            }
            return this;
        }

        public <T extends WebContainerFragment> T b(Context context, Class<T> cls) {
            return (T) Fragment.instantiate(context, cls.getName(), this.a);
        }

        public b c(Uri uri) {
            this.a.putParcelable("$web_container_fragment_uri", uri);
            return this;
        }
    }

    private void initData() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (arguments.getBoolean("$web_container_enable_dark_model", true)) {
                re8.d(this.mWebView, false);
            }
            this.requestCodeCallback = arguments.getInt("$web_container_request_code");
            this.requestCodeInterceptor = arguments.getInt("$web_container_interceptor_request_code");
            this.mWebViewCallback = fsl.b(this.requestCodeCallback);
            List<ws9> listA = fsl.a(this.requestCodeInterceptor);
            if (listA == null || listA.isEmpty()) {
                return;
            }
            Iterator<ws9> it = listA.iterator();
            while (it.hasNext()) {
                this.mWebView.g(it.next());
            }
        }
    }

    private void initWebViewCallback() {
        this.mWebView.f(new a());
    }

    private boolean isIgnoreCheckHost() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getBoolean("$web_container_ignore_check_host", false);
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$0() {
        if (!(getActivity() instanceof WebContainerActivity) || getActivity().isFinishing() || getActivity().isDestroyed()) {
            return;
        }
        getActivity().g7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(Boolean bool) {
        y8b.a(TAG, "userCancel observe: " + bool);
        String queryParameter = null;
        try {
            queryParameter = Uri.parse(this.mWebView.getUrl()).getQueryParameter("backPress");
            y8b.a(TAG, "BackPress parameter: " + queryParameter);
        } catch (Exception e) {
            y8b.f(TAG, "Failed to parse URL or get backPress parameter", e);
        }
        notifyH5AboutBack();
        if ("true".equals(queryParameter)) {
            y8b.a(TAG, "Intercepted back press due to backPress=true");
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.crl
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.lambda$onCreate$0();
                }
            }, 120L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$registerPermissions$2(Map map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null && map.size() > 0) {
            try {
                for (String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (Exception e) {
                y8b.f(TAG, "registerPermissions error!", e);
            }
        }
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null || jSONArrayNames.length() <= 0) {
            this.mLiveDataPermissions.setValue(uo3.a());
        } else {
            this.mLiveDataPermissions.setValue(uo3.b(jSONObject));
        }
    }

    private void registerPermissions() {
        this.mPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.oplus.aiunit.vision.arl
            public final void onActivityResult(Object obj) {
                this.a.lambda$registerPermissions$2((Map) obj);
            }
        });
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
            this.mWebView.e(String.format("if(window.heytapCall){window.heytapCall('%s', %s);}", objArr), null);
        }
    }

    public void evaluateJavascript(@NonNull String str, @Nullable d1a<String> d1aVar) {
        l2a l2aVar = this.mWebView;
        if (l2aVar != null) {
            l2aVar.e(str, d1aVar);
        }
    }

    public LiveData<JSONObject> getCacheData() {
        return this.mCacheData;
    }

    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public long getPageStartTime() {
        return this.mPageStartTime;
    }

    @Override // com.oplus.aiunit.vision.us9
    @Nullable
    public String getProductId() {
        return null;
    }

    public long getStartTime() {
        long pageStartTime = getPageStartTime();
        long j = this.mCreateTime;
        return pageStartTime < j ? j : getPageStartTime() - this.mCreateTime;
    }

    @Nullable
    public Uri getUri() {
        if (getArguments() != null) {
            return (Uri) getArguments().getParcelable("$web_container_fragment_uri");
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
        } catch (JSONException e) {
            y8b.f(TAG, "getVisibleInfo failed!", e);
        }
        return jSONObject;
    }

    @Override // com.oplus.aiunit.vision.us9
    public l2a getWebView() {
        return this.mWebView;
    }

    public boolean goBack() {
        l2a l2aVar = this.mWebView;
        if (l2aVar == null || !l2aVar.canGoBack()) {
            return false;
        }
        this.mWebView.goBack();
        return true;
    }

    public boolean goForward() {
        l2a l2aVar = this.mWebView;
        if (l2aVar == null || !l2aVar.c()) {
            return false;
        }
        this.mWebView.j();
        return true;
    }

    public boolean isTop() {
        return true;
    }

    public void notifyH5AboutBack() {
        l2a l2aVar = this.mWebView;
        if (l2aVar != null) {
            l2aVar.e("javascript:handleBackEvent()", null);
        }
    }

    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        h1a h1aVarRemove = this.mWaitForResultObservers.remove(Integer.valueOf(i));
        if (h1aVarRemove != null) {
            h1aVarRemove.onResult(i2, intent);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onConfigWebView(l2a l2aVar) {
        l2aVar.setBackgroundColor(0);
        IWebViewSettings settings = l2aVar.getSettings();
        settings.v(true);
        settings.i(true);
        settings.a(true);
        settings.j(true);
        settings.o(100);
        settings.h(true);
        settings.x(true);
        settings.b(IWebViewSettings.ZoomDensity.MEDIUM);
        settings.u(false);
        settings.p(true);
        settings.w(false);
        settings.s(false);
        settings.q(true);
        settings.m(true);
        settings.k(this.mWebView.getWebView().getContext().getDir("database", 0).getPath());
        settings.g(false);
        settings.n(false);
        settings.l(false);
        settings.r(true);
        settings.e(IWebViewSettings.LayoutAlgorithm.NORMAL);
        settings.f(2);
        settings.setForceDarkAllowed(false);
        l2aVar.getWebView().setLongClickable(true);
        l2aVar.getWebView().setScrollbarFadingEnabled(true);
        l2aVar.getWebView().setScrollBarStyle(0);
        l2aVar.getWebView().setDrawingCacheEnabled(true);
        l2aVar.getWebView().setHorizontalScrollBarEnabled(false);
        l2aVar.getWebView().setVerticalScrollBarEnabled(false);
        l2aVar.getSettings().c(erl.d(getContext(), l2aVar.getSettings().d()).b().a(erl.IDENTIFY, erl.IDENTIFY_UNIFIED_WEB_CONTAINER_VALUE).c());
    }

    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getActivity() != null) {
            re8.g(getActivity(), configuration);
        }
    }

    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mCreateTime = System.nanoTime();
        this.mWebViewManager = new qsl(this);
        this.mStateViewAdapter = onCreateStateViewAdapter();
        this.mWaitForResultObservers.clear();
        registerPermissions();
        ((WebContainerModel) new ViewModelProvider(requireActivity()).get(WebContainerModel.class)).i.observe(this, new Observer() { // from class: com.oplus.aiunit.vision.brl
            public final void onChanged(Object obj) {
                this.i.lambda$onCreate$1((Boolean) obj);
            }
        });
    }

    public wz9 onCreateStateViewAdapter() {
        return null;
    }

    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        q4l q4lVar = new q4l();
        onCreateView(viewGroup, bundle, q4lVar);
        l2a l2aVarC = q4lVar.c();
        this.mWebView = l2aVarC;
        if (l2aVarC == null) {
            throw new IllegalArgumentException("WebProFragment onCreateView, mWebView is null! fragment is: " + this);
        }
        initData();
        initWebViewCallback();
        onConfigWebView(this.mWebView);
        this.mWebViewManager.p(this.mWebView, getArguments(), bundle);
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onCreate(q4lVar.b(), bundle);
        }
        return q4lVar.a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mStateViewAdapter = null;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            return;
        }
        fsl.e(this.requestCodeCallback);
        fsl.f(this.requestCodeInterceptor);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.mWebViewManager.q();
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onDestroy();
        }
        this.mWaitForResultObservers.clear();
        l2a l2aVar = this.mWebView;
        if (l2aVar != null) {
            onDestroyWebView(l2aVar);
        }
        this.mWebView = null;
        getLifecycle().removeObserver(this.mLifecycleObserver);
    }

    public void onDestroyWebView(@NonNull l2a l2aVar) {
        ViewParent parent = l2aVar.getWebView().getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(l2aVar.getWebView());
        }
        l2aVar.l(PRELOAD_OBJ_NAME);
        l2aVar.i(null);
        l2aVar.h(null);
        l2aVar.k();
        l2aVar.getSettings().v(false);
        l2aVar.getSettings().w(false);
        l2aVar.getSettings().s(false);
        l2aVar.getSettings().t();
        l2aVar.getSettings().removeAllViews();
        l2aVar.destroy();
    }

    public void onDomLoadFinish(ska skaVar, rs9 rs9Var) {
        JsApiResponse.invokeSuccess(rs9Var);
    }

    @mka(method = "onFinish", product = "vip")
    public final void onFinishWebView(ska skaVar, rs9 rs9Var) {
        onJsFinishExecutor(skaVar, rs9Var);
    }

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

    public boolean onJsFinish(ska skaVar, rs9 rs9Var) {
        return false;
    }

    public void onJsFinishExecutor(ska skaVar, rs9 rs9Var) {
        if (!onJsFinish(skaVar, rs9Var) && getActivity() != null && !getActivity().isFinishing()) {
            getActivity().finish();
        }
        JsApiResponse.invokeSuccess(rs9Var);
    }

    @mka(method = "openNewWebView", product = "vip")
    public final void onOpenNewWebView(ska skaVar, rs9 rs9Var) {
        onOpenWebViewExecutor(skaVar, rs9Var);
    }

    public boolean onOpenWebView(ska skaVar, rs9 rs9Var) {
        return false;
    }

    public void onOpenWebViewExecutor(ska skaVar, rs9 rs9Var) {
        if (onOpenWebView(skaVar, rs9Var)) {
            JsApiResponse.invokeSuccess(rs9Var);
        } else {
            JsApiResponse.invokeFailed(rs9Var);
        }
    }

    public void onPageCommitVisible() {
    }

    public void onPageFinished() {
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onPageFinished();
        }
    }

    public void onPageStarted() {
        this.mPageStartTime = System.nanoTime();
        this.mWebViewManager.r();
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onPageStarted();
        }
    }

    @SensorsDataInstrumented
    public void onPause() {
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    public void onProgressChanged(int i) {
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onProgressChanged(i);
        }
    }

    public void onReceivedTitle(@Nullable String str) {
    }

    @SensorsDataInstrumented
    public void onResume() {
        super.onResume();
        FragmentTrackHelper.trackFragmentResume(this);
    }

    public void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.mIsWebViewSaveInstanceState) {
            this.mWebViewManager.u(bundle);
        }
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onSaveInstanceState(bundle);
        }
    }

    @mka(method = "setClientTitle", product = "vip")
    public final void onSetClientTitle(ska skaVar, rs9 rs9Var) {
        setClientTitle(skaVar, rs9Var);
    }

    public void onStart() {
        super.onStart();
        this.mWebViewManager.t();
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onResume();
        }
    }

    public void onStop() {
        super.onStop();
        this.mWebViewManager.s();
        wz9 wz9Var = this.mStateViewAdapter;
        if (wz9Var != null) {
            wz9Var.onPause();
        }
    }

    @SensorsDataInstrumented
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLifecycleObserver = new WebContainerLifecycleObserver(this);
        getLifecycle().addObserver(this.mLifecycleObserver);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @mka(method = "onDomLoadFinish", product = "vip")
    public final void onWebDomLoadFinish(ska skaVar, rs9 rs9Var) {
        onDomLoadFinish(skaVar, rs9Var);
    }

    public void refresh(ska skaVar, rs9 rs9Var) {
        l2a l2aVar = this.mWebView;
        if (l2aVar != null) {
            l2aVar.reload();
        }
        JsApiResponse.invokeSuccess(rs9Var);
    }

    @mka(method = "refresh", product = "vip")
    public final void reloadWebView(ska skaVar, rs9 rs9Var) {
        refresh(skaVar, rs9Var);
    }

    public LiveData<uo3<JSONObject>> requestPermission(String[] strArr) {
        ActivityResultLauncher<String[]> activityResultLauncher = this.mPermissionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(strArr);
        }
        return this.mLiveDataPermissions;
    }

    public void setClientTitle(ska skaVar, rs9 rs9Var) {
        JsApiResponse.invokeSuccess(rs9Var);
    }

    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }

    public void setWebViewSaveInstanceState(boolean z) {
        this.mIsWebViewSaveInstanceState = z;
    }

    public void startActivityForResult(Intent intent, int i, h1a h1aVar) {
        this.mWaitForResultObservers.put(Integer.valueOf(i), h1aVar);
        startActivityForResult(intent, i);
    }

    public void onCreateView(@Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull q4l q4lVar) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            y8b.l(TAG, "activity is null");
            return;
        }
        boolean zIsIgnoreCheckHost = isIgnoreCheckHost();
        y8b.l(TAG, "ignoreCheckHost:" + zIsIgnoreCheckHost);
        l2a l2aVarB = WebEngineHelper.b(activity, WebEngineHelper.EngineType.SYSTEM, getContext(), zIsIgnoreCheckHost);
        if (l2aVarB == null) {
            y8b.l(TAG, "webView is null");
            dri.h(yg1.t());
            return;
        }
        l2aVarB.getSettings().s(false);
        l2aVarB.getSettings().w(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(l2aVarB.getWebView(), -1, -1);
        ViewGroup frameLayout2 = new FrameLayout(getContext());
        frameLayout.addView(frameLayout2, -1, -1);
        q4lVar.d(frameLayout).e(frameLayout2).f(l2aVarB);
    }
}
