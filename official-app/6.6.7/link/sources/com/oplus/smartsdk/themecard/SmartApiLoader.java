package com.oplus.smartsdk.themecard;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import android.view.LayoutInflater;
import com.oplus.smartsdk.ISmartViewApi;
import com.oplus.smartsdk.InflaterFactory;
import com.oplus.smartsdk.PluginContext;
import com.oplus.smartsdk.SmartClassLoader;
import com.oplus.smartsdk.SmartVersionApi;
import java.lang.reflect.Field;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u001c\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u00112\u0006\u0010\u0012\u001a\u00020\u000fH\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\bH\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/oplus/smartsdk/themecard/SmartApiLoader;", "Lcom/oplus/smartsdk/themecard/ApiLoader;", "()V", "api", "Lcom/oplus/smartsdk/ISmartViewApi;", "inflaterFactory", "Lcom/oplus/smartsdk/InflaterFactory;", "loadSuccess", "", "pluginContext", "Lcom/oplus/smartsdk/PluginContext;", "smartImplClass", "Ljava/lang/Class;", "isForceLoad", "context", "Landroid/content/Context;", "loadApi", "Lkotlin/Pair;", "hostContext", "tryLoadSmartClassInternal", "", "forceLoad", "Companion", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class SmartApiLoader implements ApiLoader {

    @NotNull
    private static final String SMART_IMPL_NAME = "com.oplus.smartengine.SmartViewImpl";

    @NotNull
    protected static final String SMART_PACKAGE = "com.oplus.smartengine";

    @NotNull
    private static final String TAG = "SmartApiLoader";

    @Nullable
    private ISmartViewApi api;

    @Nullable
    private InflaterFactory inflaterFactory;
    private boolean loadSuccess;

    @Nullable
    private PluginContext pluginContext;

    @Nullable
    private Class<?> smartImplClass;

    private final void tryLoadSmartClassInternal(Context hostContext, boolean forceLoad) throws Throwable {
        if (this.loadSuccess && !forceLoad) {
            Log.d(TAG, "tryLoadSmartClassInternal forceLoad is false!");
            return;
        }
        this.loadSuccess = false;
        Context contextCreatePackageContext = hostContext.createPackageContext("com.oplus.smartengine", 0);
        ApplicationInfo applicationInfo = contextCreatePackageContext.getApplicationInfo();
        SmartClassLoader smartClassLoader = new SmartClassLoader(applicationInfo.sourceDir, applicationInfo.dataDir, applicationInfo.nativeLibraryDir, hostContext.getClassLoader());
        this.smartImplClass = smartClassLoader.loadClass(SMART_IMPL_NAME);
        PluginContext pluginContext = new PluginContext(contextCreatePackageContext, contextCreatePackageContext.getTheme(), hostContext);
        this.pluginContext = pluginContext;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(pluginContext);
        Field declaredField = LayoutInflater.class.getDeclaredField("mFactory2");
        declaredField.setAccessible(true);
        if (this.inflaterFactory == null) {
            this.inflaterFactory = new InflaterFactory(layoutInflaterFrom.getFactory2(), smartClassLoader);
        }
        declaredField.set(layoutInflaterFrom, this.inflaterFactory);
        this.loadSuccess = true;
    }

    @Override // com.oplus.smartsdk.themecard.ApiLoader
    public boolean isForceLoad(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return SmartVersionApi.getInstance(context).reloadSmartEngine(context);
    }

    @Override // com.oplus.smartsdk.themecard.ApiLoader
    @NotNull
    public Pair<ISmartViewApi, Context> loadApi(@NotNull Context hostContext) throws Throwable {
        Intrinsics.checkNotNullParameter(hostContext, "hostContext");
        if (this.api == null || isForceLoad(hostContext)) {
            this.inflaterFactory = null;
            tryLoadSmartClassInternal(hostContext, true);
            Class<?> cls = this.smartImplClass;
            Intrinsics.checkNotNull(cls);
            Object objNewInstance = cls.newInstance();
            if (objNewInstance == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.oplus.smartsdk.ISmartViewApi");
            }
            this.api = (ISmartViewApi) objNewInstance;
        }
        ISmartViewApi iSmartViewApi = this.api;
        Intrinsics.checkNotNull(iSmartViewApi);
        PluginContext pluginContext = this.pluginContext;
        if (pluginContext != null) {
            hostContext = pluginContext;
        }
        return new Pair<>(iSmartViewApi, hostContext);
    }
}
