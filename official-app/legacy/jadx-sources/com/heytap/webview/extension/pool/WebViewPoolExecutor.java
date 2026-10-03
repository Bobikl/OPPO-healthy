package com.heytap.webview.extension.pool;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.WebView;
import com.oppo.store.web.widget.CrashCatchWebView;
import com.sensorsdata.analytics.android.sdk.jsbridge.JSHookAop;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u0002H\u0016J\b\u0010\u000e\u001a\u00020\nH\u0016J\b\u0010\u000f\u001a\u00020\nH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016J\b\u0010\u0011\u001a\u00020\fH\u0016J\b\u0010\u0012\u001a\u00020\fH\u0016J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002J\u000e\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0005J\u0016\u0010\u0019\u001a\u00020\n2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002J\b\u0010\u001b\u001a\u00020\nH\u0016J\u0010\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0002H\u0016J\u0016\u0010\u001d\u001a\u00020\u001e2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0016H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"Lcom/heytap/webview/extension/pool/WebViewPoolExecutor;", "Lcom/heytap/webview/extension/pool/ObjectPool;", "Landroid/webkit/WebView;", "()V", "mContext", "Landroid/content/Context;", "mWebViewList", "", "Lcom/heytap/webview/extension/pool/PooledWebView;", "ApplyObject", "", "number", "", "borrowObject", "clear", "close", "getNumActive", "getNumAll", "getNumIdle", "invalidateObject", "obj", "makeObject", "Lcom/heytap/webview/extension/pool/PooledObject;", "poolInit", "context", "removeFromParent", "pool", "returnAllObject", "returnObject", "validateObject", "", "lib_webcache_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nWebViewPoolExecutor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WebViewPoolExecutor.kt\ncom/heytap/webview/extension/pool/WebViewPoolExecutor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,175:1\n1855#2,2:176\n1855#2,2:178\n1855#2,2:180\n1855#2,2:182\n1855#2,2:184\n1855#2,2:186\n1855#2,2:188\n1855#2,2:190\n*S KotlinDebug\n*F\n+ 1 WebViewPoolExecutor.kt\ncom/heytap/webview/extension/pool/WebViewPoolExecutor\n*L\n23#1:176,2\n57#1:178,2\n71#1:180,2\n83#1:182,2\n99#1:184,2\n112#1:186,2\n131#1:188,2\n146#1:190,2\n*E\n"})
public final class WebViewPoolExecutor implements ObjectPool<WebView> {
    private static Context mContext;

    @NotNull
    public static final WebViewPoolExecutor INSTANCE = new WebViewPoolExecutor();

    @NotNull
    private static final List<PooledWebView> mWebViewList = new ArrayList();

    private WebViewPoolExecutor() {
    }

    private final PooledObject<WebView> makeObject() {
        Context context = mContext;
        if (context == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mContext");
            context = null;
        }
        return new PooledWebView(context);
    }

    private final void removeFromParent(PooledObject<WebView> pool) {
        WebView mWebView = pool.getMWebView();
        mWebView.loadUrl(CrashCatchWebView.URL_BLANK);
        JSHookAop.loadUrl(mWebView, CrashCatchWebView.URL_BLANK);
        mWebView.clearCache(false);
        if (mWebView.getParent() != null) {
            ViewParent parent = mWebView.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ((ViewGroup) parent).removeView(mWebView);
        }
    }

    private final boolean validateObject(PooledObject<WebView> pool) {
        return Intrinsics.areEqual(pool.getMWebViewState(), "object-idle");
    }

    public final void ApplyObject(int number) {
        int i = 1;
        if (1 > number) {
            return;
        }
        while (true) {
            PooledObject<WebView> pooledObjectMakeObject = makeObject();
            List<PooledWebView> list = mWebViewList;
            Intrinsics.checkNotNull(pooledObjectMakeObject, "null cannot be cast to non-null type com.heytap.webview.extension.pool.PooledWebView");
            list.add((PooledWebView) pooledObjectMakeObject);
            pooledObjectMakeObject.getMWebView();
            if (i == number) {
                return;
            } else {
                i++;
            }
        }
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public void clear() {
        for (PooledWebView pooledWebView : mWebViewList) {
            if (Intrinsics.areEqual(pooledWebView.getMWebViewState(), "object-idle")) {
                INSTANCE.removeFromParent(pooledWebView);
                pooledWebView.reback();
                mWebViewList.remove(pooledWebView);
            }
        }
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public void close() {
        Iterator<T> it = mWebViewList.iterator();
        while (it.hasNext()) {
            INSTANCE.removeFromParent((PooledWebView) it.next());
        }
        mWebViewList.clear();
        System.gc();
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public int getNumActive() {
        Iterator<T> it = mWebViewList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((PooledWebView) it.next()).getMWebViewState(), "object-using")) {
                i++;
            }
        }
        return i;
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public int getNumAll() {
        return mWebViewList.size();
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public int getNumIdle() {
        Iterator<T> it = mWebViewList.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((PooledWebView) it.next()).getMWebViewState(), "object-idle")) {
                i++;
            }
        }
        return i;
    }

    public final void poolInit(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        mContext = context;
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public void returnAllObject() {
        for (PooledWebView pooledWebView : mWebViewList) {
            INSTANCE.removeFromParent(pooledWebView);
            pooledWebView.reback();
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.heytap.webview.extension.pool.ObjectPool
    @NotNull
    public WebView borrowObject() {
        List<PooledWebView> list = mWebViewList;
        synchronized (list) {
            for (PooledWebView pooledWebView : list) {
                if (INSTANCE.validateObject(pooledWebView)) {
                    pooledWebView.use();
                    return pooledWebView.getMWebView();
                }
            }
            PooledObject<WebView> pooledObjectMakeObject = INSTANCE.makeObject();
            List<PooledWebView> list2 = mWebViewList;
            Intrinsics.checkNotNull(pooledObjectMakeObject, "null cannot be cast to non-null type com.heytap.webview.extension.pool.PooledWebView");
            list2.add((PooledWebView) pooledObjectMakeObject);
            pooledObjectMakeObject.use();
            return pooledObjectMakeObject.getMWebView();
        }
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public void invalidateObject(@NotNull WebView obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        for (PooledWebView pooledWebView : mWebViewList) {
            if (pooledWebView.getMWebView() == obj) {
                INSTANCE.removeFromParent(pooledWebView);
                pooledWebView.reback();
                mWebViewList.remove(pooledWebView);
            }
        }
    }

    @Override // com.heytap.webview.extension.pool.ObjectPool
    public void returnObject(@NotNull WebView obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        for (PooledWebView pooledWebView : mWebViewList) {
            if (pooledWebView.getMWebView() == obj) {
                INSTANCE.removeFromParent(pooledWebView);
                pooledWebView.reback();
            }
        }
    }
}
