package com.oplus.smartsdk.themecard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.Keep;
import androidx.annotation.UiThread;
import com.oplus.pantanal.seedling.constants.TraceConstants;
import com.oplus.smartsdk.R;
import com.oplus.smartsdk.SmartEngineManager;
import com.oplus.smartsdk.themecard.OplusKeyguardCtrl;
import java.lang.reflect.Constructor;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u000e\u0018\u0000 '2\u00020\u0001:\u0002'(B\u0019\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J(\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bJ\u0010\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\u000e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u0013J\b\u0010\u0018\u001a\u00020\rH\u0002J\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aJ\u0006\u0010\u001c\u001a\u00020\rJ\u0010\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u0005H\u0002J\u0018\u0010\u001f\u001a\u00020\r2\u0006\u0010 \u001a\u00020\b2\b\u0010!\u001a\u0004\u0018\u00010\u0011J\u0010\u0010\"\u001a\u00020\r2\u0006\u0010 \u001a\u00020\bH\u0002J\u000e\u0010#\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\bJ\u000e\u0010$\u001a\u00020\r2\u0006\u0010\u0012\u001a\u00020\u0013J\u0018\u0010%\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u0006\u0010&\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006)"}, d2 = {"Lcom/oplus/smartsdk/themecard/OplusKeyguardCtrl;", "", "keyguardCtrlConstructor", "Ljava/lang/reflect/Constructor;", "cardName", "", "(Ljava/lang/reflect/Constructor;Ljava/lang/String;)V", "cardView", "Landroid/view/View;", "engineKeyguardCtrl", "loadCallback", "Lcom/oplus/smartsdk/themecard/OplusKeyguardCtrl$IKeyguardCallback;", "beInflate", "", "context", "Landroid/content/Context;", "bundle", "Landroid/os/Bundle;", "debug", "", "callback", "createEngineKeyguardCtrl", "destroy", "cleanup", "destroyView", "getSupportedMorphSize", "", "", "hide", "onError", "errorMsg", "onSizeChange", "view", "data", "onViewLoaded", "release", "setDebug", "setDebugSafely", "show", "Companion", "IKeyguardCallback", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OplusKeyguardCtrl {
    private static final int FLAG_THEME_CARD = 64;

    @NotNull
    private static final String TAG = "OplusKeyguardCtrl";

    @NotNull
    private final String cardName;

    @Nullable
    private View cardView;

    @Nullable
    private Object engineKeyguardCtrl;

    @NotNull
    private final Constructor<?> keyguardCtrlConstructor;

    @Nullable
    private IKeyguardCallback loadCallback;

    @Keep
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH'J\u001a\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\fH'¨\u0006\r"}, d2 = {"Lcom/oplus/smartsdk/themecard/OplusKeyguardCtrl$IKeyguardCallback;", "", "onLoadFailed", "", "errorMsg", "", "onLoadView", "view", "Landroid/view/View;", "startActivity", "", TraceConstants.KEY_ACTION, "Landroid/content/Intent;", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface IKeyguardCallback {
        @UiThread
        void onLoadFailed(@NotNull String errorMsg);

        @UiThread
        void onLoadView(@NotNull View view);

        @UiThread
        boolean startActivity(@Nullable View view, @NotNull Intent intent);
    }

    public OplusKeyguardCtrl(@NotNull Constructor<?> constructor, @NotNull String str) {
        Intrinsics.checkNotNullParameter(constructor, "keyguardCtrlConstructor");
        Intrinsics.checkNotNullParameter(str, "cardName");
        this.keyguardCtrlConstructor = constructor;
        this.cardName = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void beInflate$lambda-1$lambda-0(OplusKeyguardCtrl oplusKeyguardCtrl, Object obj, boolean z, Context context, Bundle bundle) {
        Intrinsics.checkNotNullParameter(oplusKeyguardCtrl, "this$0");
        Intrinsics.checkNotNullParameter(obj, "$it");
        Intrinsics.checkNotNullParameter(context, "$context");
        try {
            oplusKeyguardCtrl.setDebugSafely(obj, z);
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            ReflectionUtils.methodInvoke(obj, "beInflated", new Class[]{Context.class, ViewGroup.class, Integer.TYPE, Bundle.class}, context, null, 64, bundle);
        } catch (Exception e) {
            e.printStackTrace();
            oplusKeyguardCtrl.onError("invoke beInflated failed! cardName=" + oplusKeyguardCtrl.cardName + " e=" + ((Object) e.getMessage()));
        }
    }

    private final Object createEngineKeyguardCtrl(Context context) throws Exception {
        this.keyguardCtrlConstructor.setAccessible(true);
        Object objNewInstance = this.keyguardCtrlConstructor.newInstance(context, new IKeyguardCallback() { // from class: com.oplus.smartsdk.themecard.OplusKeyguardCtrl.createEngineKeyguardCtrl.1
            @Override // com.oplus.smartsdk.themecard.OplusKeyguardCtrl.IKeyguardCallback
            @UiThread
            public void onLoadFailed(@NotNull String errorMsg) {
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                OplusKeyguardCtrl.this.onError(errorMsg);
            }

            @Override // com.oplus.smartsdk.themecard.OplusKeyguardCtrl.IKeyguardCallback
            @UiThread
            public void onLoadView(@NotNull View view) {
                Unit unit;
                Intrinsics.checkNotNullParameter(view, "view");
                IKeyguardCallback iKeyguardCallback = OplusKeyguardCtrl.this.loadCallback;
                if (iKeyguardCallback == null) {
                    unit = null;
                } else {
                    OplusKeyguardCtrl.this.onViewLoaded(view);
                    iKeyguardCallback.onLoadView(view);
                    unit = Unit.INSTANCE;
                }
                if (unit == null) {
                    Log.w(OplusKeyguardCtrl.TAG, "onLoadView mCallback is null!");
                }
            }

            @Override // com.oplus.smartsdk.themecard.OplusKeyguardCtrl.IKeyguardCallback
            @UiThread
            public boolean startActivity(@Nullable View view, @NotNull Intent intent) {
                Intrinsics.checkNotNullParameter(intent, TraceConstants.KEY_ACTION);
                IKeyguardCallback iKeyguardCallback = OplusKeyguardCtrl.this.loadCallback;
                if (iKeyguardCallback == null) {
                    return false;
                }
                if (view == null) {
                    view = OplusKeyguardCtrl.this.cardView;
                }
                return iKeyguardCallback.startActivity(view, intent);
            }
        });
        Intrinsics.checkNotNullExpressionValue(objNewInstance, "@Throws(Exception::class)\n    private fun createEngineKeyguardCtrl(context: Context): Any {\n        keyguardCtrlConstructor.isAccessible = true\n        return keyguardCtrlConstructor.newInstance(context, object : IKeyguardCallback {\n            @UiThread\n            override fun onLoadView(view: View) {\n                loadCallback?.let {\n                    onViewLoaded(view)\n                    it.onLoadView(view)\n                } ?: Log.w(TAG, \"onLoadView mCallback is null!\")\n            }\n\n            @UiThread\n            override fun onLoadFailed(errorMsg: String) {\n                onError(errorMsg)\n            }\n\n            @UiThread\n            override fun startActivity(view: View?, intent: Intent): Boolean {\n                return loadCallback?.startActivity(view ?: cardView, intent) ?: false\n            }\n        })\n    }");
        return objNewInstance;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroy$lambda-9$lambda-8(Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(obj, "$it");
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        ReflectionUtils.methodInvokeSafely(obj, "cleanUp", new Class[]{Boolean.TYPE}, Boolean.valueOf(z));
    }

    private final synchronized void destroyView() {
        this.loadCallback = null;
        this.cardView = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void hide$lambda-7$lambda-6(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$it");
        ReflectionUtils.methodInvokeSafely$default(obj, "hide", null, new Object[0], 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onError(final String errorMsg) {
        final IKeyguardCallback iKeyguardCallback = this.loadCallback;
        destroy(true);
        if ((iKeyguardCallback == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.crd
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.onError$lambda-11$lambda-10(iKeyguardCallback, errorMsg);
            }
        }))) == null) {
            Log.w(TAG, Intrinsics.stringPlus("onError, callback is null! errorMsg=", errorMsg));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onError$lambda-11$lambda-10(IKeyguardCallback iKeyguardCallback, String str) {
        Intrinsics.checkNotNullParameter(iKeyguardCallback, "$it");
        Intrinsics.checkNotNullParameter(str, "$errorMsg");
        iKeyguardCallback.onLoadFailed(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onSizeChange$lambda-13$lambda-12(Object obj, View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(obj, "$it");
        Intrinsics.checkNotNullParameter(view, "$view");
        ReflectionUtils.methodInvokeSafely(obj, "onSizeChange", new Class[]{View.class, Bundle.class}, view, bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final synchronized void onViewLoaded(View view) {
        this.cardView = view;
        if (view != null) {
            view.setTag(R.id.tag_theme_card_name, this.cardName);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setDebug$lambda-3$lambda-2(OplusKeyguardCtrl oplusKeyguardCtrl, Object obj, boolean z) {
        Intrinsics.checkNotNullParameter(oplusKeyguardCtrl, "this$0");
        Intrinsics.checkNotNullParameter(obj, "$it");
        oplusKeyguardCtrl.setDebugSafely(obj, z);
    }

    private final void setDebugSafely(Object engineKeyguardCtrl, boolean debug) {
        ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
        ReflectionUtils.methodInvokeSafely(engineKeyguardCtrl, "setDebug", new Class[]{Boolean.TYPE}, Boolean.valueOf(debug));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void show$lambda-5$lambda-4(Object obj) {
        Intrinsics.checkNotNullParameter(obj, "$it");
        ReflectionUtils.methodInvokeSafely$default(obj, "show", null, new Object[0], 4, null);
    }

    public final synchronized void beInflate(@NotNull final Context context, @Nullable final Bundle bundle, final boolean debug, @NotNull IKeyguardCallback callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Log.d(TAG, Intrinsics.stringPlus("beInflate cardName=", this.cardName));
        destroyView();
        this.loadCallback = callback;
        if (this.engineKeyguardCtrl == null) {
            try {
                this.engineKeyguardCtrl = createEngineKeyguardCtrl(context);
            } catch (Exception e) {
                e.printStackTrace();
                onError("create keyguard ctrl failed! cardName=" + this.cardName + " e=" + ((Object) e.getMessage()));
                return;
            }
        }
        final Object obj = this.engineKeyguardCtrl;
        if ((obj == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.yqd
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.beInflate$lambda-1$lambda-0(this.i, obj, debug, context, bundle);
            }
        }))) == null) {
            onError(Intrinsics.stringPlus("keyguard ctrl is null! cardName=", this.cardName));
        }
    }

    public final synchronized void destroy(final boolean cleanup) {
        Log.d(TAG, "destroy cardName=" + this.cardName + " cleanup=" + cleanup);
        destroyView();
        final Object obj = this.engineKeyguardCtrl;
        if ((obj == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.drd
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.destroy$lambda-9$lambda-8(obj, cleanup);
            }
        }))) == null) {
            Log.w(TAG, "destroy, mEngineKeyguardCtrl is null!");
        }
        this.engineKeyguardCtrl = null;
    }

    @NotNull
    public final List<Integer> getSupportedMorphSize() {
        List<Integer> listEmptyList;
        if (this.cardName.length() == 0) {
            return CollectionsKt.emptyList();
        }
        Object obj = this.engineKeyguardCtrl;
        if (obj == null) {
            listEmptyList = null;
        } else {
            ReflectionUtils reflectionUtils = ReflectionUtils.INSTANCE;
            listEmptyList = (List) ReflectionUtils.methodInvokeSafely(obj, "getSupportedMorphSize", new Class[]{String.class}, this.cardName);
        }
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        Log.d(TAG, Intrinsics.stringPlus("getSupportedMorphSize list is ", listEmptyList));
        return listEmptyList;
    }

    public final void hide() {
        Log.d(TAG, Intrinsics.stringPlus("hide cardName=", this.cardName));
        final Object obj = this.engineKeyguardCtrl;
        if ((obj == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.brd
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.hide$lambda-7$lambda-6(obj);
            }
        }))) == null) {
            Log.w(TAG, "hide, mEngineKeyguardCtrl is null!");
        }
    }

    public final synchronized void onSizeChange(@NotNull final View view, @Nullable final Bundle data) {
        Intrinsics.checkNotNullParameter(view, "view");
        final Object obj = this.engineKeyguardCtrl;
        if ((obj == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.ard
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.onSizeChange$lambda-13$lambda-12(obj, view, data);
            }
        }))) == null) {
            Log.w(TAG, "onSizeChange, engineKeyguardCtrl is null!");
        }
    }

    public final synchronized boolean release(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Log.d(TAG, "release cardName=" + this.cardName + " view=" + view + " cardView=" + this.cardView);
        if (!Intrinsics.areEqual(this.cardView, view)) {
            return false;
        }
        destroy(false);
        return true;
    }

    public final void setDebug(final boolean debug) {
        Log.d(TAG, "setDebug cardName=" + this.cardName + " debug=" + debug);
        final Object obj = this.engineKeyguardCtrl;
        if ((obj == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.xqd
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.setDebug$lambda-3$lambda-2(this.i, obj, debug);
            }
        }))) == null) {
            Log.w(TAG, "setDebug, mEngineKeyguardCtrl is null!");
        }
    }

    public final void show() {
        Log.d(TAG, Intrinsics.stringPlus("show cardName=", this.cardName));
        final Object obj = this.engineKeyguardCtrl;
        if ((obj == null ? null : Boolean.valueOf(SmartEngineManager.MAIN_HANDLER.post(new Runnable() { // from class: com.oplus.aiunit.vision.zqd
            @Override // java.lang.Runnable
            public final void run() {
                OplusKeyguardCtrl.show$lambda-5$lambda-4(obj);
            }
        }))) == null) {
            Log.w(TAG, "show, mEngineKeyguardCtrl is null!");
        }
    }
}
