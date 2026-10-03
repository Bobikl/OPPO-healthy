package com.heytap.store.platform.jsclasslike.launch;

import android.app.Application;
import android.util.Log;
import com.heytap.store.platform.jsclasslike.template.IJSClassLikeLoader;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0004J\b\u0010\r\u001a\u00020\fH\u0002J+\u0010\u000e\u001a\u00020\f2#\u0010\u000f\u001a\u001f\u0012\u0013\u0012\u00110\n¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\f\u0018\u00010\u0010J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/launch/JSClassLikeManager;", "", "()V", "context", "Landroid/app/Application;", "hasInit", "", "isRegisterByPlugin", "jsClassLikeList", "", "", "init", "", "loadJSClassLikes", "registerJSClass", "callback", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "registerLoader", "className", "Companion", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class JSClassLikeManager {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<JSClassLikeManager> INSTANCE$delegate = LazyKt__LazyJVMKt.lazy(new Function0<JSClassLikeManager>() { // from class: com.heytap.store.platform.jsclasslike.launch.JSClassLikeManager$Companion$INSTANCE$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final JSClassLikeManager invoke() {
            return new JSClassLikeManager(null);
        }
    });

    @NotNull
    public static final String TAG = "JSClassLikeManager";
    private Application context;
    private boolean hasInit;
    private boolean isRegisterByPlugin;

    @NotNull
    private final List<String> jsClassLikeList;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u001b\u0010\u0003\u001a\u00020\u00048FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/heytap/store/platform/jsclasslike/launch/JSClassLikeManager$Companion;", "", "()V", "INSTANCE", "Lcom/heytap/store/platform/jsclasslike/launch/JSClassLikeManager;", "getINSTANCE", "()Lcom/heytap/store/platform/jsclasslike/launch/JSClassLikeManager;", "INSTANCE$delegate", "Lkotlin/Lazy;", "TAG", "", "jsclasslike-api_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final JSClassLikeManager getINSTANCE() {
            return (JSClassLikeManager) JSClassLikeManager.INSTANCE$delegate.getValue();
        }
    }

    public /* synthetic */ JSClassLikeManager(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final void loadJSClassLikes() {
        this.isRegisterByPlugin = false;
    }

    private final void registerLoader(String className) {
        if (className.length() > 0) {
            try {
                Object objNewInstance = Class.forName(className).getConstructor(new Class[0]).newInstance(new Object[0]);
                if (objNewInstance instanceof IJSClassLikeLoader) {
                    ((IJSClassLikeLoader) objNewInstance).loadInto(this.jsClassLikeList);
                }
                this.isRegisterByPlugin = true;
            } catch (Exception unused) {
            }
        }
    }

    public final void init(@NotNull Application context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        if (this.hasInit) {
            return;
        }
        Log.d(TAG, "JSClassLikeManager init");
        loadJSClassLikes();
        if (!this.isRegisterByPlugin) {
            throw new RuntimeException("Not register jsclasslike loader by jsclasslike Plugin...");
        }
        this.hasInit = true;
    }

    public final void registerJSClass(@Nullable Function1<? super String, Unit> callback) {
        if (!this.hasInit) {
            throw new RuntimeException("JSClassLikeManager has not init!");
        }
        for (String str : this.jsClassLikeList) {
            if (callback != null) {
                callback.invoke(str);
            }
        }
    }

    private JSClassLikeManager() {
        this.jsClassLikeList = new ArrayList();
    }
}
