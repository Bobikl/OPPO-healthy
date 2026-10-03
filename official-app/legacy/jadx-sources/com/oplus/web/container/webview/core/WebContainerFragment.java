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
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.viewmodel.CreationExtras;
import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import com.oplus.aiunit.vision.a0a;
import com.oplus.aiunit.vision.e1a;
import com.oplus.aiunit.vision.eja;
import com.oplus.aiunit.vision.g1a;
import com.oplus.aiunit.vision.gnl;
import com.oplus.aiunit.vision.go3;
import com.oplus.aiunit.vision.hol;
import com.oplus.aiunit.vision.jg1;
import com.oplus.aiunit.vision.kja;
import com.oplus.aiunit.vision.lni;
import com.oplus.aiunit.vision.lr9;
import com.oplus.aiunit.vision.m7b;
import com.oplus.aiunit.vision.od8;
import com.oplus.aiunit.vision.or9;
import com.oplus.aiunit.vision.py9;
import com.oplus.aiunit.vision.qr9;
import com.oplus.aiunit.vision.s0l;
import com.oplus.aiunit.vision.sol;
import com.oplus.aiunit.vision.wz9;
import com.oplus.web.container.comunication.jsapi.JsApiResponse;
import com.oplus.web.container.engine.WebEngineHelper;
import com.oplus.web.container.engine.config.IWebViewSettings;
import com.oplus.web.container.webview.utils.SingleLiveData;
import com.oplus.web.container.webview.viewmodel.WebContainerModel;
import com.platform.account.webview.constant.Constants;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
@Keep
public class WebContainerFragment extends Fragment implements or9 {
    private static final String PRELOAD_OBJ_NAME = "preloadObj";
    private static final String TAG = "WebContainerFragment";
    private long mCreateTime;
    private WebContainerLifecycleObserver mLifecycleObserver;
    private long mPageStartTime;
    public ActivityResultLauncher<String[]> mPermissionLauncher;
    private py9 mStateViewAdapter;
    private e1a mWebView;
    private g1a mWebViewCallback;
    private sol mWebViewManager;
    private int requestCodeCallback;
    private int requestCodeInterceptor;
    private final Handler mHandler = new Handler(Looper.getMainLooper());
    private final HashMap<Integer, a0a> mWaitForResultObservers = new HashMap<>();
    private boolean mIsWebViewSaveInstanceState = true;
    public SingleLiveData<go3<JSONObject>> mLiveDataPermissions = new SingleLiveData<>();
    protected final MutableLiveData<JSONObject> mCacheData = new MutableLiveData<>();
    protected final MutableLiveData<Boolean> mIsParallel = new MutableLiveData<>();

    public class a implements g1a {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.g1a
        public boolean a(@NonNull e1a e1aVar, @Nullable String str) {
            lni.h(jg1.s(str));
            return WebContainerFragment.this.mWebViewCallback != null && WebContainerFragment.this.mWebViewCallback.a(e1aVar, str);
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void b(@NonNull e1a e1aVar, @NonNull int i, @NonNull String str, @NonNull String str2, boolean z) {
            lni.h(jg1.o(Integer.toString(i), str, str2, String.valueOf(z)));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.b(e1aVar, i, str, str2, z);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                m7b.i(WebContainerFragment.TAG, "isForMainFrame:" + z);
                WebContainerFragment.this.mStateViewAdapter.a(i, str, z);
            }
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void c(@NonNull e1a e1aVar, @NonNull Bitmap bitmap) {
            lni.h(jg1.p());
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.c(e1aVar, bitmap);
            }
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void d(@NonNull e1a e1aVar, @NonNull String str) {
            lni.h(jg1.q(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.d(e1aVar, str);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.a(-1, str, false);
            }
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void e(@NonNull e1a e1aVar, @NonNull String str, @NonNull Bitmap bitmap) {
            lni.h(jg1.m(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.f(e1aVar, str);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.onPageStarted();
            }
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void f(@NonNull e1a e1aVar, @NonNull String str) {
            lni.h(jg1.l(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.f(e1aVar, str);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.onPageFinished();
            }
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void g(@NonNull e1a e1aVar, @NonNull String str) {
            lni.h(jg1.r(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.g(e1aVar, str);
            }
            WebContainerFragment.this.onReceivedTitle(str);
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void h(@NonNull e1a e1aVar, int i) {
            lni.h(jg1.n(Integer.toString(i)));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.h(e1aVar, i);
            }
            if (WebContainerFragment.this.mStateViewAdapter != null) {
                WebContainerFragment.this.mStateViewAdapter.onProgressChanged(i);
            }
        }

        @Override // com.oplus.aiunit.vision.g1a
        public void i(@NonNull e1a e1aVar, @NonNull String str) {
            lni.h(jg1.k(str));
            if (WebContainerFragment.this.mWebViewCallback != null) {
                WebContainerFragment.this.mWebViewCallback.i(e1aVar, str);
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
                od8.d(this.mWebView, false);
            }
            this.requestCodeCallback = arguments.getInt("$web_container_request_code");
            this.requestCodeInterceptor = arguments.getInt("$web_container_interceptor_request_code");
            this.mWebViewCallback = hol.b(this.requestCodeCallback);
            List<qr9> listA = hol.a(this.requestCodeInterceptor);
            if (listA == null || listA.isEmpty()) {
                return;
            }
            Iterator<qr9> it = listA.iterator();
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
        ((WebContainerActivity) getActivity()).d7();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$onCreate$1(Boolean bool) {
        m7b.a(TAG, "userCancel observe: " + bool);
        String queryParameter = null;
        try {
            queryParameter = Uri.parse(this.mWebView.getUrl()).getQueryParameter("backPress");
            m7b.a(TAG, "BackPress parameter: " + queryParameter);
        } catch (Exception e2) {
            m7b.f(TAG, "Failed to parse URL or get backPress parameter", e2);
        }
        notifyH5AboutBack();
        if (SpeechConstant.TRUE_STR.equals(queryParameter)) {
            m7b.a(TAG, "Intercepted back press due to backPress=true");
        } else {
            this.mHandler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.enl
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
            } catch (Exception e2) {
                m7b.f(TAG, "registerPermissions error!", e2);
            }
        }
        JSONArray jSONArrayNames = jSONObject.names();
        if (jSONArrayNames == null || jSONArrayNames.length() <= 0) {
            this.mLiveDataPermissions.setValue(go3.a());
        } else {
            this.mLiveDataPermissions.setValue(go3.b(jSONObject));
        }
    }

    private void registerPermissions() {
        this.mPermissionLauncher = registerForActivityResult(new ActivityResultContracts.RequestMultiplePermissions(), new ActivityResultCallback() { // from class: com.oplus.aiunit.vision.cnl
            @Override // androidx.activity.result.ActivityResultCallback
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

    public void evaluateJavascript(@NonNull String str, @Nullable wz9<String> wz9Var) {
        e1a e1aVar = this.mWebView;
        if (e1aVar != null) {
            e1aVar.e(str, wz9Var);
        }
    }

    public LiveData<JSONObject> getCacheData() {
        return this.mCacheData;
    }

    @Override // androidx.fragment.app.Fragment, androidx.lifecycle.HasDefaultViewModelProviderFactory
    @NonNull
    public CreationExtras getDefaultViewModelCreationExtras() {
        return super.getDefaultViewModelCreationExtras();
    }

    public long getPageStartTime() {
        return this.mPageStartTime;
    }

    @Override // com.oplus.aiunit.vision.or9
    @Nullable
    public String getProductId() {
        return null;
    }

    public long getStartTime() {
        long pageStartTime = getPageStartTime();
        long j2 = this.mCreateTime;
        return pageStartTime < j2 ? j2 : getPageStartTime() - this.mCreateTime;
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
        } catch (JSONException e2) {
            m7b.f(TAG, "getVisibleInfo failed!", e2);
        }
        return jSONObject;
    }

    @Override // com.oplus.aiunit.vision.or9
    public e1a getWebView() {
        return this.mWebView;
    }

    public boolean goBack() {
        e1a e1aVar = this.mWebView;
        if (e1aVar == null || !e1aVar.canGoBack()) {
            return false;
        }
        this.mWebView.goBack();
        return true;
    }

    public boolean goForward() {
        e1a e1aVar = this.mWebView;
        if (e1aVar == null || !e1aVar.c()) {
            return false;
        }
        this.mWebView.j();
        return true;
    }

    public boolean isTop() {
        return true;
    }

    public void notifyH5AboutBack() {
        e1a e1aVar = this.mWebView;
        if (e1aVar != null) {
            e1aVar.e("javascript:handleBackEvent()", null);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
        super.onActivityResult(i, i2, intent);
        a0a a0aVarRemove = this.mWaitForResultObservers.remove(Integer.valueOf(i));
        if (a0aVarRemove != null) {
            a0aVarRemove.onResult(i2, intent);
        }
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    public void onConfigWebView(e1a e1aVar) {
        e1aVar.setBackgroundColor(0);
        IWebViewSettings settings = e1aVar.getSettings();
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
        e1aVar.getWebView().setLongClickable(true);
        e1aVar.getWebView().setScrollbarFadingEnabled(true);
        e1aVar.getWebView().setScrollBarStyle(0);
        e1aVar.getWebView().setDrawingCacheEnabled(true);
        e1aVar.getWebView().setHorizontalScrollBarEnabled(false);
        e1aVar.getWebView().setVerticalScrollBarEnabled(false);
        e1aVar.getSettings().c(gnl.d(getContext(), e1aVar.getSettings().d()).b().a(gnl.IDENTIFY, "1").c());
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@NonNull Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (getActivity() != null) {
            od8.g(getActivity(), configuration);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@Nullable Bundle bundle) {
        super.onCreate(bundle);
        this.mCreateTime = System.nanoTime();
        this.mWebViewManager = new sol(this);
        this.mStateViewAdapter = onCreateStateViewAdapter();
        this.mWaitForResultObservers.clear();
        registerPermissions();
        ((WebContainerModel) new ViewModelProvider(requireActivity()).get(WebContainerModel.class)).i.observe(this, new Observer() { // from class: com.oplus.aiunit.vision.dnl
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                this.i.lambda$onCreate$1((Boolean) obj);
            }
        });
    }

    public py9 onCreateStateViewAdapter() {
        return null;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public View onCreateView(@NonNull LayoutInflater layoutInflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        s0l s0lVar = new s0l();
        onCreateView(viewGroup, bundle, s0lVar);
        e1a e1aVarC = s0lVar.c();
        this.mWebView = e1aVarC;
        if (e1aVarC == null) {
            throw new IllegalArgumentException("WebProFragment onCreateView, mWebView is null! fragment is: " + this);
        }
        initData();
        initWebViewCallback();
        onConfigWebView(this.mWebView);
        this.mWebViewManager.p(this.mWebView, getArguments(), bundle);
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onCreate(s0lVar.b(), bundle);
        }
        return s0lVar.a();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.mHandler.removeCallbacksAndMessages(null);
        this.mStateViewAdapter = null;
        FragmentActivity activity = getActivity();
        if (activity == null || !activity.isFinishing()) {
            return;
        }
        hol.e(this.requestCodeCallback);
        hol.f(this.requestCodeInterceptor);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.mWebViewManager.q();
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onDestroy();
        }
        this.mWaitForResultObservers.clear();
        e1a e1aVar = this.mWebView;
        if (e1aVar != null) {
            onDestroyWebView(e1aVar);
        }
        this.mWebView = null;
        getLifecycle().removeObserver(this.mLifecycleObserver);
    }

    public void onDestroyWebView(@NonNull e1a e1aVar) {
        ViewParent parent = e1aVar.getWebView().getParent();
        if (parent != null) {
            ((ViewGroup) parent).removeView(e1aVar.getWebView());
        }
        e1aVar.l(PRELOAD_OBJ_NAME);
        e1aVar.i(null);
        e1aVar.h(null);
        e1aVar.k();
        e1aVar.getSettings().v(false);
        e1aVar.getSettings().w(false);
        e1aVar.getSettings().s(false);
        e1aVar.getSettings().t();
        e1aVar.getSettings().removeAllViews();
        e1aVar.destroy();
    }

    public void onDomLoadFinish(kja kjaVar, lr9 lr9Var) {
        JsApiResponse.invokeSuccess(lr9Var);
    }

    @eja(method = Constants.JsbConstants.METHOD_FINISH, product = "vip")
    public final void onFinishWebView(kja kjaVar, lr9 lr9Var) {
        onJsFinishExecutor(kjaVar, lr9Var);
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

    public boolean onJsFinish(kja kjaVar, lr9 lr9Var) {
        return false;
    }

    public void onJsFinishExecutor(kja kjaVar, lr9 lr9Var) {
        if (!onJsFinish(kjaVar, lr9Var) && getActivity() != null && !getActivity().isFinishing()) {
            getActivity().finish();
        }
        JsApiResponse.invokeSuccess(lr9Var);
    }

    @eja(method = Constants.JsbConstants.METHOD_OPEN_NEW_WEBVIEW, product = "vip")
    public final void onOpenNewWebView(kja kjaVar, lr9 lr9Var) {
        onOpenWebViewExecutor(kjaVar, lr9Var);
    }

    public boolean onOpenWebView(kja kjaVar, lr9 lr9Var) {
        return false;
    }

    public void onOpenWebViewExecutor(kja kjaVar, lr9 lr9Var) {
        if (onOpenWebView(kjaVar, lr9Var)) {
            JsApiResponse.invokeSuccess(lr9Var);
        } else {
            JsApiResponse.invokeFailed(lr9Var);
        }
    }

    public void onPageCommitVisible() {
    }

    public void onPageFinished() {
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onPageFinished();
        }
    }

    public void onPageStarted() {
        this.mPageStartTime = System.nanoTime();
        this.mWebViewManager.r();
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onPageStarted();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onPause() {
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    public void onProgressChanged(int i) {
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onProgressChanged(i);
        }
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
            this.mWebViewManager.u(bundle);
        }
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onSaveInstanceState(bundle);
        }
    }

    @eja(method = Constants.JsbConstants.METHOD_SET_CLIENT_TITLE, product = "vip")
    public final void onSetClientTitle(kja kjaVar, lr9 lr9Var) {
        setClientTitle(kjaVar, lr9Var);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        this.mWebViewManager.t();
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        this.mWebViewManager.s();
        py9 py9Var = this.mStateViewAdapter;
        if (py9Var != null) {
            py9Var.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onViewCreated(@NonNull View view, @Nullable Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.mLifecycleObserver = new WebContainerLifecycleObserver(this);
        getLifecycle().addObserver(this.mLifecycleObserver);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @eja(method = Constants.JsbConstants.METHOD_ON_DOMLOAD_FINISH, product = "vip")
    public final void onWebDomLoadFinish(kja kjaVar, lr9 lr9Var) {
        onDomLoadFinish(kjaVar, lr9Var);
    }

    public void refresh(kja kjaVar, lr9 lr9Var) {
        e1a e1aVar = this.mWebView;
        if (e1aVar != null) {
            e1aVar.reload();
        }
        JsApiResponse.invokeSuccess(lr9Var);
    }

    @eja(method = "refresh", product = "vip")
    public final void reloadWebView(kja kjaVar, lr9 lr9Var) {
        refresh(kjaVar, lr9Var);
    }

    public LiveData<go3<JSONObject>> requestPermission(String[] strArr) {
        ActivityResultLauncher<String[]> activityResultLauncher = this.mPermissionLauncher;
        if (activityResultLauncher != null) {
            activityResultLauncher.launch(strArr);
        }
        return this.mLiveDataPermissions;
    }

    public void setClientTitle(kja kjaVar, lr9 lr9Var) {
        JsApiResponse.invokeSuccess(lr9Var);
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

    public void startActivityForResult(Intent intent, int i, a0a a0aVar) {
        this.mWaitForResultObservers.put(Integer.valueOf(i), a0aVar);
        startActivityForResult(intent, i);
    }

    public void onCreateView(@Nullable ViewGroup viewGroup, @Nullable Bundle bundle, @NonNull s0l s0lVar) {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            m7b.l(TAG, "activity is null");
            return;
        }
        boolean zIsIgnoreCheckHost = isIgnoreCheckHost();
        m7b.l(TAG, "ignoreCheckHost:" + zIsIgnoreCheckHost);
        e1a e1aVarB = WebEngineHelper.b(activity, WebEngineHelper.EngineType.SYSTEM, (LifecycleOwner) getContext(), zIsIgnoreCheckHost);
        if (e1aVarB == null) {
            m7b.l(TAG, "webView is null");
            lni.h(jg1.t());
            return;
        }
        e1aVarB.getSettings().s(false);
        e1aVarB.getSettings().w(false);
        FrameLayout frameLayout = new FrameLayout(getContext());
        frameLayout.addView(e1aVarB.getWebView(), -1, -1);
        ViewGroup frameLayout2 = new FrameLayout(getContext());
        frameLayout.addView(frameLayout2, -1, -1);
        s0lVar.d(frameLayout).e(frameLayout2).f(e1aVarB);
    }
}
