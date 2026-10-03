package com.heytap.webview.extension.fragment;

import android.app.DownloadManager;
import android.content.Context;
import android.content.Intent;
import android.content.MutableContextWrapper;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.DownloadListener;
import android.webkit.SslErrorHandler;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.annotation.CallSuper;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LifecycleObserver;
import com.heytap.webview.extension.R;
import com.heytap.webview.extension.fragment.WebExtFragment;
import com.heytap.webview.extension.jsapi.IJsApiFragmentInterface;
import com.heytap.webview.extension.jsapi.IWaitForPermissionObserver;
import com.heytap.webview.extension.jsapi.IWaitForResultObserver;
import com.heytap.webview.extension.protocol.Const;
import com.heytap.webview.extension.protocol.ThemeConst;
import com.heytap.webview.extension.theme.H5ThemeHelper;
import com.heytap.webview.extension.utils.ThreadUtil;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.iim;
import com.oplus.aiunit.vision.jla;
import com.oplus.aiunit.vision.m6k;
import com.oplus.aiunit.vision.m7k;
import com.oplus.aiunit.vision.vc;
import com.oplus.smartenginehelper.ParserTag;
import com.platform.account.webview.constant.Constants;
import com.sensorsdata.analytics.android.autotrack.aop.FragmentTrackHelper;
import com.sensorsdata.analytics.android.sdk.SensorsDataInstrumented;
import java.util.LinkedHashMap;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\b\t\b\u0016\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002}~B\u0007¢\u0006\u0004\b|\u0010UJ\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0012\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010\f\u001a\u0004\u0018\u00010\u000bJ\u0006\u0010\u000e\u001a\u00020\rJ\u0006\u0010\u000f\u001a\u00020\rJ\u0018\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011J)\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0014*\u00020\u00042\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u001a\u001a\u00020\u0019H\u0014J\u0012\u0010\u001d\u001a\u00020\u00062\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0017J$\u0010#\u001a\u00020\"2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016J$\u0010#\u001a\u00020\u00062\b\u0010!\u001a\u0004\u0018\u00010 2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010%\u001a\u00020$H\u0014J\u0018\u0010)\u001a\u00020\u00042\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0004J\u0010\u0010*\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0015J\b\u0010,\u001a\u00020+H\u0014J\b\u0010.\u001a\u00020-H\u0014J\u0010\u00100\u001a\u00020\u00062\u0006\u0010/\u001a\u00020\u001bH\u0017J\u0010\u00102\u001a\u00020\u00062\u0006\u00101\u001a\u00020\rH\u0016J\b\u00103\u001a\u00020\u0006H\u0017J\b\u00104\u001a\u00020\u0006H\u0017J\b\u00105\u001a\u00020\u0006H\u0017J\b\u00106\u001a\u00020\u0006H\u0017J\u0010\u00109\u001a\u00020\u00062\u0006\u00108\u001a\u000207H\u0017J \u0010?\u001a\u00020\u00062\u0006\u0010;\u001a\u00020:2\u0006\u0010<\u001a\u00020'2\u0006\u0010>\u001a\u00020=H\u0017J-\u0010C\u001a\u00020\u00062\u0006\u0010<\u001a\u00020'2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0@2\u0006\u0010>\u001a\u00020BH\u0016¢\u0006\u0004\bC\u0010DJ-\u0010G\u001a\u00020\u00062\u0006\u0010<\u001a\u00020'2\f\u0010A\u001a\b\u0012\u0004\u0012\u00020\b0@2\u0006\u0010F\u001a\u00020EH\u0016¢\u0006\u0004\bG\u0010HJ\u0010\u0010J\u001a\u00020\u00062\u0006\u0010>\u001a\u00020IH\u0016J\u0010\u0010K\u001a\u00020\u00062\u0006\u0010>\u001a\u00020IH\u0016J\"\u0010N\u001a\u00020\u00062\u0006\u0010<\u001a\u00020'2\u0006\u0010L\u001a\u00020'2\b\u0010M\u001a\u0004\u0018\u00010:H\u0017J\u0012\u0010P\u001a\u00020\u00062\b\u0010O\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010S\u001a\u00020\u00062\b\u0010R\u001a\u0004\u0018\u00010QH\u0016J\u000f\u0010V\u001a\u00020\u0006H\u0000¢\u0006\u0004\bT\u0010UJ\u000f\u0010X\u001a\u00020\u0006H\u0000¢\u0006\u0004\bW\u0010UJ\u0017\u0010\\\u001a\u00020\u00062\u0006\u0010Y\u001a\u00020'H\u0000¢\u0006\u0004\bZ\u0010[J\u001f\u0010b\u001a\u00020\u00062\u0006\u0010]\u001a\u00020'2\u0006\u0010_\u001a\u00020^H\u0000¢\u0006\u0004\b`\u0010aJ\u0018\u0010g\u001a\u00020\u00062\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0016J\b\u0010i\u001a\u00020hH\u0016J\b\u0010j\u001a\u00020\bH\u0016R\u0014\u0010k\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\bk\u0010lR\u0016\u0010n\u001a\u00020m8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bn\u0010oR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010pR\u0016\u0010r\u001a\u00020q8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010t\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010uR\"\u0010w\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020=0v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bw\u0010xR\"\u0010y\u001a\u000e\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020B0v8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\by\u0010xR\u0016\u0010O\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010lR\u0016\u0010z\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{¨\u0006\u007f"}, d2 = {"Lcom/heytap/webview/extension/fragment/WebExtFragment;", "Landroidx/fragment/app/Fragment;", "Lcom/heytap/webview/extension/jsapi/IJsApiFragmentInterface;", "", "Landroid/webkit/WebView;", "webView", "", "onConfigClient", "", "url", a8i.DOWNLOAD, "Landroid/net/Uri;", "getUri", "", Constants.JsbConstants.METHOD_GO_BACK, "goForward", "id", "Lorg/json/JSONObject;", "jsonObj", "callJsFunction", ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "clazz", "getWebView", "(Ljava/lang/Class;)Landroid/webkit/WebView;", "Lcom/heytap/webview/extension/fragment/IStateViewAdapter;", "onCreateStateViewAdapter", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "container", "Landroid/view/View;", "onCreateView", "Lcom/heytap/webview/extension/fragment/ViewReceiver;", "receiver", "root", "", "webViewId", "replaceWithSafeWebView", "onConfigWebView", "Lcom/heytap/webview/extension/fragment/WebViewClient;", "onCreateWebViewClient", "Lcom/heytap/webview/extension/fragment/WebChromeClient;", "onCreateWebChromeClient", "outState", "onSaveInstanceState", "saveState", "setWebViewSaveInstanceState", "onStart", "onStop", "onDestroyView", "onDestroy", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "Landroid/content/Intent;", "intent", vc.KEY_REQUEST_CODE, "Lcom/heytap/webview/extension/jsapi/IWaitForResultObserver;", "observer", "startActivityForResult", "", "permissions", "Lcom/heytap/webview/extension/jsapi/IWaitForPermissionObserver;", "requestPermissions", "(I[Ljava/lang/String;Lcom/heytap/webview/extension/jsapi/IWaitForPermissionObserver;)V", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "Landroidx/lifecycle/LifecycleObserver;", "addLifecycleObserver", "removeLifecycleObserver", "resultCode", "data", "onActivityResult", "title", "onReceivedTitle", "Landroid/graphics/Bitmap;", "icon", "onReceivedIcon", "onPageStarted$lib_webext_release", "()V", "onPageStarted", "onPageFinished$lib_webext_release", "onPageFinished", "progress", "onProgressChanged$lib_webext_release", "(I)V", "onProgressChanged", "errorCode", "", iim.a.f, "onReceivedError$lib_webext_release", "(ILjava/lang/CharSequence;)V", "onReceivedError", "Landroid/webkit/SslErrorHandler;", "handler", "Landroid/net/http/SslError;", "error", "onReceivedSslError", "Lcom/oplus/aiunit/vision/m7k;", "getScreenProperties", "getScreenName", "TAG", "Ljava/lang/String;", "Lcom/heytap/webview/extension/fragment/WebViewManager;", "webViewManager", "Lcom/heytap/webview/extension/fragment/WebViewManager;", "Landroid/webkit/WebView;", "Lcom/heytap/webview/extension/fragment/ThemeManger;", "themeManager", "Lcom/heytap/webview/extension/fragment/ThemeManger;", "stateViewAdapter", "Lcom/heytap/webview/extension/fragment/IStateViewAdapter;", "", "waitForResultObservers", "Ljava/util/Map;", "waitForPermissionObservers", "isWebViewSaveInstanceState", "Z", "<init>", "Builder", "WebExtFragmentTrack", "lib_webext_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nWebExtFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebExtFragment.kt\ncom/heytap/webview/extension/fragment/WebExtFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,435:1\n1#2:436\n*E\n"})
public class WebExtFragment extends Fragment implements IJsApiFragmentInterface {

    @Nullable
    private IStateViewAdapter stateViewAdapter;
    private ThemeManger themeManager;
    private Map<Integer, IWaitForPermissionObserver> waitForPermissionObservers;
    private Map<Integer, IWaitForResultObserver> waitForResultObservers;

    @Nullable
    private WebView webView;
    private WebViewManager webViewManager;

    @NotNull
    private final String TAG = "WebExtFragment";

    @NotNull
    private String title = "";
    private boolean isWebViewSaveInstanceState = true;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0005\u001a\u00020\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004J+\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\b0\r¢\u0006\u0002\u0010\u000eJ%\u0010\u0007\u001a\u0002H\b\"\b\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0010¢\u0006\u0002\u0010\u0011J\u0006\u0010\u0012\u001a\u00020\u0000J\u000e\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u0015R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/heytap/webview/extension/fragment/WebExtFragment$Builder;", "", "()V", Const.Batch.ARGUMENTS, "Landroid/os/Bundle;", "addBundle", "bundle", jla.DEFAULT_BUILD_METHOD, ExifInterface.GPS_DIRECTION_TRUE, "Lcom/heytap/webview/extension/fragment/WebExtFragment;", "context", "Landroid/content/Context;", "clazz", "Ljava/lang/Class;", "(Landroid/content/Context;Ljava/lang/Class;)Lcom/heytap/webview/extension/fragment/WebExtFragment;", "className", "", "(Landroid/content/Context;Ljava/lang/String;)Lcom/heytap/webview/extension/fragment/WebExtFragment;", "disableDarkModel", "setUri", ParserTag.TAG_URI, "Landroid/net/Uri;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Builder {

        @NotNull
        private final Bundle arguments = new Bundle();

        @NotNull
        public final Builder addBundle(@Nullable Bundle bundle) {
            if (bundle != null) {
                this.arguments.putAll(bundle);
            }
            return this;
        }

        @NotNull
        public final <T extends WebExtFragment> T build(@NotNull Context context, @NotNull Class<T> clazz) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            Fragment fragmentInstantiate = Fragment.instantiate(context, clazz.getName(), this.arguments);
            Intrinsics.checkNotNull(fragmentInstantiate, "null cannot be cast to non-null type T of com.heytap.webview.extension.fragment.WebExtFragment.Builder.build");
            return (T) fragmentInstantiate;
        }

        @NotNull
        public final Builder disableDarkModel() {
            this.arguments.putBoolean(ArgumentKey.ENABLE_DARK_MODEL, false);
            return this;
        }

        @NotNull
        public final Builder setUri(@NotNull Uri uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            this.arguments.putParcelable(ArgumentKey.URI, uri);
            return this;
        }

        @NotNull
        public final <T extends WebExtFragment> T build(@NotNull Context context, @NotNull String className) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(className, "className");
            Fragment fragmentInstantiate = Fragment.instantiate(context, className, this.arguments);
            Intrinsics.checkNotNull(fragmentInstantiate, "null cannot be cast to non-null type T of com.heytap.webview.extension.fragment.WebExtFragment.Builder.build");
            return (T) fragmentInstantiate;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/heytap/webview/extension/fragment/WebExtFragment$WebExtFragmentTrack;", "Lcom/oplus/aiunit/vision/m7k;", "", "webFragmentUri", "Ljava/lang/String;", "getWebFragmentUri", "()Ljava/lang/String;", "fragmentTitle", "getFragmentTitle", "<init>", "(Lcom/heytap/webview/extension/fragment/WebExtFragment;)V", "lib_webext_release"}, k = 1, mv = {1, 8, 0})
    public final class WebExtFragmentTrack implements m7k {

        @m6k("title")
        @NotNull
        private final String fragmentTitle;

        @m6k(ParserTag.TAG_URI)
        @Nullable
        private final String webFragmentUri;

        public WebExtFragmentTrack() {
            Uri uri = WebExtFragment.this.getUri();
            this.webFragmentUri = uri != null ? uri.toString() : null;
            this.fragmentTitle = WebExtFragment.this.title;
        }

        @NotNull
        public final String getFragmentTitle() {
            return this.fragmentTitle;
        }

        @Nullable
        public final String getWebFragmentUri() {
            return this.webFragmentUri;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void download(final String url) {
        ThreadUtil.execute$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebExtFragment.download.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                Object objM5287constructorimpl;
                try {
                    Log.d(WebExtFragment.this.TAG, a8i.DOWNLOAD);
                    String str = url;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        objM5287constructorimpl = Result.m5287constructorimpl(Uri.parse(str).getLastPathSegment());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m5293isFailureimpl(objM5287constructorimpl)) {
                        objM5287constructorimpl = "unKnow";
                    }
                    DownloadManager.Request request = new DownloadManager.Request(Uri.parse(url));
                    request.setNotificationVisibility(1);
                    request.setDestinationInExternalPublicDir(Environment.DIRECTORY_DOWNLOADS, (String) objM5287constructorimpl);
                    Context context = WebExtFragment.this.getContext();
                    DownloadManager downloadManager = (DownloadManager) (context != null ? context.getSystemService(a8i.DOWNLOAD) : null);
                    Intrinsics.checkNotNull(downloadManager);
                    downloadManager.enqueue(request);
                    ThreadUtil threadUtil = ThreadUtil.INSTANCE;
                    final WebExtFragment webExtFragment = WebExtFragment.this;
                    ThreadUtil.post$lib_webext_release$default(threadUtil, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebExtFragment.download.1.1
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Toast.makeText(webExtFragment.getContext(), R.string.webext_downloading, 0).show();
                        }
                    }, 1, null);
                } catch (Exception e2) {
                    Log.e(WebExtFragment.this.TAG, String.valueOf(e2.getMessage()));
                    ThreadUtil threadUtil2 = ThreadUtil.INSTANCE;
                    final WebExtFragment webExtFragment2 = WebExtFragment.this;
                    ThreadUtil.post$lib_webext_release$default(threadUtil2, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.WebExtFragment.download.1.2
                        {
                            super(0);
                        }

                        @Override // p010kotlin.jvm.functions.Function0
                        public /* bridge */ /* synthetic */ Unit invoke() {
                            invoke2();
                            return Unit.INSTANCE;
                        }

                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            Toast.makeText(webExtFragment2.getContext(), R.string.webext_download_failed, 0).show();
                        }
                    }, 1, null);
                }
            }
        }, 1, null);
    }

    private final void onConfigClient(WebView webView) {
        webView.setWebViewClient(onCreateWebViewClient());
        webView.setWebChromeClient(onCreateWebChromeClient());
        webView.setDownloadListener(new DownloadListener() { // from class: com.oplus.aiunit.vision.inl
            @Override // android.webkit.DownloadListener
            public final void onDownloadStart(String str, String str2, String str3, String str4, long j2) {
                WebExtFragment.onConfigClient$lambda$1(this.a, str, str2, str3, str4, j2);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onConfigClient$lambda$1(final WebExtFragment this$0, final String str, String str2, String str3, String str4, long j2) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (ContextCompat.checkSelfPermission(this$0.requireContext(), "android.permission.WRITE_EXTERNAL_STORAGE") != 0) {
            this$0.requestPermissions(1, new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new IWaitForPermissionObserver() { // from class: com.heytap.webview.extension.fragment.WebExtFragment$onConfigClient$1$1
                @Override // com.heytap.webview.extension.jsapi.IWaitForPermissionObserver
                public void onResult(@NotNull String[] permissions, @NotNull int[] grantResults) {
                    Intrinsics.checkNotNullParameter(permissions, "permissions");
                    Intrinsics.checkNotNullParameter(grantResults, "grantResults");
                    Integer orNull = ArraysKt___ArraysKt.getOrNull(grantResults, ArraysKt___ArraysKt.indexOf(permissions, "android.permission.WRITE_EXTERNAL_STORAGE"));
                    if (orNull == null || orNull.intValue() != 0) {
                        Log.d(this.this$0.TAG, "下载路径无权访问");
                    } else {
                        Log.d(this.this$0.TAG, "开始点击下载");
                        this.this$0.download(str);
                    }
                }
            });
        } else {
            this$0.download(str);
        }
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiFragmentInterface
    public void addLifecycleObserver(@NotNull LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.getLifecycle().addObserver(observer);
    }

    public final void callJsFunction(@NotNull String id, @Nullable JSONObject jsonObj) {
        Intrinsics.checkNotNullParameter(id, "id");
        StringBuilder sb = new StringBuilder();
        sb.append("if(window.heytapCall){window.heytapCall('");
        sb.append(id);
        sb.append("', ");
        Object obj = jsonObj;
        if (jsonObj == null) {
            obj = "{}";
        }
        sb.append(obj);
        sb.append(");}");
        String string = sb.toString();
        WebView webView = this.webView;
        if (webView != null) {
            webView.evaluateJavascript(string, null);
        }
    }

    @NotNull
    public String getScreenName() {
        return "WebExtView";
    }

    @NotNull
    public m7k getScreenProperties() {
        return new WebExtFragmentTrack();
    }

    @Nullable
    public final Uri getUri() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return (Uri) arguments.getParcelable(ArgumentKey.URI);
        }
        return null;
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiFragmentInterface
    @Nullable
    public <T extends WebView> T getWebView(@NotNull Class<T> clazz) {
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        return (T) this.webView;
    }

    public final boolean goBack() {
        WebView webView = this.webView;
        if (!(webView != null && webView.canGoBack())) {
            return false;
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.goBack();
        }
        return true;
    }

    public final boolean goForward() {
        WebView webView = this.webView;
        if (!(webView != null && webView.canGoForward())) {
            return false;
        }
        WebView webView2 = this.webView;
        if (webView2 != null) {
            webView2.goForward();
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Map<Integer, IWaitForResultObserver> map = this.waitForResultObservers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitForResultObservers");
            map = null;
        }
        IWaitForResultObserver iWaitForResultObserverRemove = map.remove(Integer.valueOf(requestCode));
        if (iWaitForResultObserverRemove != null) {
            iWaitForResultObserverRemove.onResult(resultCode, data);
        }
    }

    @CallSuper
    public void onConfigWebView(@NotNull WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        webView.setBackgroundColor(0);
        WebSettings settings = webView.getSettings();
        Intrinsics.checkNotNullExpressionValue(settings, "webView.settings");
        settings.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NORMAL);
        settings.setJavaScriptEnabled(true);
        settings.setCacheMode(-1);
        settings.setDomStorageEnabled(true);
        settings.setDatabaseEnabled(true);
        settings.setUseWideViewPort(true);
        settings.setLoadWithOverviewMode(true);
        settings.setBuiltInZoomControls(true);
        settings.setSupportZoom(false);
        settings.setLoadsImagesAutomatically(true);
        settings.setBlockNetworkLoads(false);
        settings.setAllowFileAccess(false);
        settings.setAllowFileAccessFromFileURLs(false);
        settings.setAllowUniversalAccessFromFileURLs(false);
        settings.setAllowContentAccess(false);
        settings.setMixedContentMode(2);
        webView.setForceDarkAllowed(false);
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    @CallSuper
    public void onConfigurationChanged(@NotNull Configuration newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            H5ThemeHelper.notifyThemeChanged(activity, newConfig);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(this.TAG, "WebExtFragment onCreate");
        this.webViewManager = new WebViewManager(this);
        this.themeManager = new ThemeManger();
        this.stateViewAdapter = onCreateStateViewAdapter();
        this.waitForResultObservers = new LinkedHashMap();
        this.waitForPermissionObservers = new LinkedHashMap();
    }

    @NotNull
    public IStateViewAdapter onCreateStateViewAdapter() {
        return new DefaultStateViewAdapter(this);
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Log.d(this.TAG, "WebExtFragment onCreateView");
        ViewReceiver viewReceiver = new ViewReceiver();
        onCreateView(container, savedInstanceState, viewReceiver);
        this.webView = viewReceiver.getWebView();
        onConfigWebView(viewReceiver.getWebView());
        onConfigClient(viewReceiver.getWebView());
        ThemeManger themeManger = this.themeManager;
        WebViewManager webViewManager = null;
        if (themeManger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("themeManager");
            themeManger = null;
        }
        themeManger.onCreate$lib_webext_release(viewReceiver.getWebView(), getArguments());
        WebViewManager webViewManager2 = this.webViewManager;
        if (webViewManager2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewManager");
        } else {
            webViewManager = webViewManager2;
        }
        webViewManager.onCreate(viewReceiver.getWebView(), getArguments(), savedInstanceState);
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onCreate(viewReceiver.getStatusLayer(), savedInstanceState);
        }
        return viewReceiver.getRoot();
    }

    @NotNull
    public WebChromeClient onCreateWebChromeClient() {
        return new WebChromeClient(this);
    }

    @NotNull
    public WebViewClient onCreateWebViewClient() {
        return new WebViewClient(this);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onDestroy() {
        super.onDestroy();
        this.stateViewAdapter = null;
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onDestroyView() {
        super.onDestroyView();
        WebView webView = this.webView;
        if (webView != null) {
            webView.setWebViewClient(new android.webkit.WebViewClient());
            webView.setWebChromeClient(null);
            webView.setDownloadListener(null);
            webView.removeJavascriptInterface(ThemeConst.ObjectName.JS_INTERFACE_THEME);
        }
        WebViewManager webViewManager = this.webViewManager;
        if (webViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewManager");
            webViewManager = null;
        }
        webViewManager.onDestroy();
        WebView webView2 = this.webView;
        if (webView2 != null) {
            Context context = webView2.getContext();
            MutableContextWrapper mutableContextWrapper = context instanceof MutableContextWrapper ? (MutableContextWrapper) context : null;
            if (mutableContextWrapper != null) {
                mutableContextWrapper.setBaseContext(webView2.getContext().getApplicationContext());
            }
        }
        ThemeManger themeManger = this.themeManager;
        if (themeManger == null) {
            Intrinsics.throwUninitializedPropertyAccessException("themeManager");
            themeManger = null;
        }
        themeManger.onDestroy$lib_webext_release();
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onDestroy();
        }
        Map<Integer, IWaitForResultObserver> map = this.waitForResultObservers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitForResultObservers");
            map = null;
        }
        map.clear();
        Map<Integer, IWaitForPermissionObserver> map2 = this.waitForPermissionObservers;
        if (map2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitForPermissionObservers");
            map2 = null;
        }
        map2.clear();
        this.webView = null;
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentTrackHelper.trackOnHiddenChanged(this, z);
    }

    public final void onPageFinished$lib_webext_release() {
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onPageFinished();
        }
    }

    public final void onPageStarted$lib_webext_release() {
        WebViewManager webViewManager = this.webViewManager;
        if (webViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewManager");
            webViewManager = null;
        }
        webViewManager.onPageStarted();
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onPageStarted();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onPause() {
        super.onPause();
        FragmentTrackHelper.trackFragmentPause(this);
    }

    public final void onProgressChanged$lib_webext_release(int progress) {
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onProgressChanged(progress);
        }
    }

    public final void onReceivedError$lib_webext_release(int errorCode, @NotNull CharSequence description) {
        Intrinsics.checkNotNullParameter(description, "description");
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onReceivedError(errorCode, description);
        }
    }

    public void onReceivedIcon(@Nullable Bitmap icon) {
    }

    public void onReceivedSslError(@NotNull SslErrorHandler handler, @NotNull SslError error) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Intrinsics.checkNotNullParameter(error, "error");
        handler.cancel();
    }

    public void onReceivedTitle(@Nullable String title) {
        if (title != null) {
            this.title = title;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int requestCode, @NotNull String[] permissions, @NotNull int[] grantResults) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        Map<Integer, IWaitForPermissionObserver> map = this.waitForPermissionObservers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitForPermissionObservers");
            map = null;
        }
        IWaitForPermissionObserver iWaitForPermissionObserverRemove = map.remove(Integer.valueOf(requestCode));
        if (iWaitForPermissionObserverRemove != null) {
            iWaitForPermissionObserverRemove.onResult(permissions, grantResults);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onResume() {
        super.onResume();
        FragmentTrackHelper.trackFragmentResume(this);
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onSaveInstanceState(@NotNull Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.isWebViewSaveInstanceState) {
            WebViewManager webViewManager = this.webViewManager;
            if (webViewManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("webViewManager");
                webViewManager = null;
            }
            webViewManager.onSaveInstanceState(outState);
        }
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onSaveInstanceState(outState);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onStart() {
        super.onStart();
        WebViewManager webViewManager = this.webViewManager;
        if (webViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewManager");
            webViewManager = null;
        }
        webViewManager.onResume();
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @CallSuper
    public void onStop() {
        super.onStop();
        WebViewManager webViewManager = this.webViewManager;
        if (webViewManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("webViewManager");
            webViewManager = null;
        }
        webViewManager.onPause();
        IStateViewAdapter iStateViewAdapter = this.stateViewAdapter;
        if (iStateViewAdapter != null) {
            iStateViewAdapter.onPause();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        FragmentTrackHelper.onFragmentViewCreated(this, view, bundle);
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiFragmentInterface
    public void removeLifecycleObserver(@NotNull LifecycleObserver observer) {
        Intrinsics.checkNotNullParameter(observer, "observer");
        super.getLifecycle().removeObserver(observer);
    }

    @NotNull
    public final WebView replaceWithSafeWebView(@NotNull View root, int webViewId) {
        Context applicationContext;
        Intrinsics.checkNotNullParameter(root, "root");
        View viewFindViewById = root.findViewById(webViewId);
        if (viewFindViewById == null) {
            throw new IllegalStateException("View with id " + webViewId + " not found in layout");
        }
        ViewParent parent = viewFindViewById.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            throw new IllegalStateException("WebView must have a ViewGroup parent");
        }
        int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById);
        ViewGroup.LayoutParams layoutParams = viewFindViewById.getLayoutParams();
        viewGroup.removeView(viewFindViewById);
        Context context = getContext();
        if (context == null || (applicationContext = context.getApplicationContext()) == null) {
            applicationContext = requireActivity().getApplicationContext();
        }
        WebView webView = new WebView(new MutableContextWrapper(applicationContext));
        webView.setId(webViewId);
        if (layoutParams != null) {
            viewGroup.addView(webView, iIndexOfChild, layoutParams);
        } else {
            viewGroup.addView(webView, iIndexOfChild);
        }
        return webView;
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiFragmentInterface
    public void requestPermissions(int requestCode, @NotNull String[] permissions, @NotNull IWaitForPermissionObserver observer) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Map<Integer, IWaitForPermissionObserver> map = this.waitForPermissionObservers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitForPermissionObservers");
            map = null;
        }
        map.put(Integer.valueOf(requestCode), observer);
        super.requestPermissions(permissions, requestCode);
    }

    @Override // androidx.fragment.app.Fragment
    @SensorsDataInstrumented
    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentTrackHelper.trackFragmentSetUserVisibleHint(this, z);
    }

    public void setWebViewSaveInstanceState(boolean saveState) {
        this.isWebViewSaveInstanceState = saveState;
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiFragmentInterface
    @CallSuper
    public void startActivityForResult(@NotNull Intent intent, int requestCode, @NotNull IWaitForResultObserver observer) {
        Intrinsics.checkNotNullParameter(intent, "intent");
        Intrinsics.checkNotNullParameter(observer, "observer");
        Map<Integer, IWaitForResultObserver> map = this.waitForResultObservers;
        if (map == null) {
            Intrinsics.throwUninitializedPropertyAccessException("waitForResultObservers");
            map = null;
        }
        map.put(Integer.valueOf(requestCode), observer);
        startActivityForResult(intent, requestCode);
    }

    public void onCreateView(@Nullable ViewGroup container, @Nullable Bundle savedInstanceState, @NotNull ViewReceiver receiver) {
        Intrinsics.checkNotNullParameter(receiver, "receiver");
        Context context = getContext();
        if (context != null) {
            WebView webView = new WebView(new MutableContextWrapper(context.getApplicationContext()));
            FrameLayout frameLayout = new FrameLayout(context);
            frameLayout.addView(webView, -1, -1);
            ViewGroup frameLayout2 = new FrameLayout(context);
            frameLayout.addView(frameLayout2, -1, -1);
            receiver.receiveRoot(frameLayout).receiveStatusLayer(frameLayout2).receiveWebView(webView);
        }
    }
}
