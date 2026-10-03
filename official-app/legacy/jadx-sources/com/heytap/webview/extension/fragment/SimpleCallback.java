package com.heytap.webview.extension.fragment;

import android.util.Log;
import com.heytap.webview.extension.WebExtEnvironment;
import com.heytap.webview.extension.jsapi.IJsApiCallback;
import com.heytap.webview.extension.protocol.Const;
import com.heytap.webview.extension.utils.ThreadUtil;
import com.oplus.accountsdk.base.account.trace.AcBaseTraceHelper;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.Ref;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\tJ\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005H\u0016J\u0011\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\rH\u0096\u0002J\u0010\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u0012H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lcom/heytap/webview/extension/fragment/SimpleCallback;", "Lcom/heytap/webview/extension/jsapi/IJsApiCallback;", "instanceId", "", "callbackId", "", "webViewManager", "Lcom/heytap/webview/extension/fragment/WebViewManager;", "methodName", "(JLjava/lang/String;Lcom/heytap/webview/extension/fragment/WebViewManager;Ljava/lang/String;)V", AcBaseTraceHelper.VAL_FAIL, "", "code", "", "message", "invoke", "obj", "success", "Lorg/json/JSONObject;", "lib_webext_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class SimpleCallback implements IJsApiCallback {

    @NotNull
    private final String callbackId;
    private final long instanceId;

    @Nullable
    private final String methodName;

    @NotNull
    private final WebViewManager webViewManager;

    public SimpleCallback(long j2, @NotNull String callbackId, @NotNull WebViewManager webViewManager, @Nullable String str) {
        Intrinsics.checkNotNullParameter(callbackId, "callbackId");
        Intrinsics.checkNotNullParameter(webViewManager, "webViewManager");
        this.instanceId = j2;
        this.callbackId = callbackId;
        this.webViewManager = webViewManager;
        this.methodName = str;
    }

    @Override // com.heytap.webview.extension.jsapi.IJsApiCallback
    public void fail(@NotNull final Object code, @NotNull final String message) {
        Intrinsics.checkNotNullParameter(code, "code");
        Intrinsics.checkNotNullParameter(message, "message");
        ThreadUtil.execute$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.SimpleCallback.fail.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    Log.d(Const.Tag.EXECUTOR, "method: " + SimpleCallback.this.methodName + " \n code: fail \n result: " + message);
                }
                WebViewManager webViewManager = SimpleCallback.this.webViewManager;
                long j2 = SimpleCallback.this.instanceId;
                String str = SimpleCallback.this.callbackId;
                JSONObject jSONObjectPut = new JSONObject().put("code", code).put("msg", message);
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …PI_CALLBACK_MSG, message)");
                webViewManager.callback$lib_webext_release(j2, str, jSONObjectPut);
            }
        }, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [T, org.json.JSONObject] */
    @Override // com.heytap.webview.extension.jsapi.IJsApiCallback
    public void invoke(@NotNull Object obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = obj;
        if (obj instanceof JSONObject) {
            objectRef.element = new JSONObject(obj.toString());
        }
        ThreadUtil.execute$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.SimpleCallback.invoke.1
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
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    Log.d(Const.Tag.EXECUTOR, "method: " + SimpleCallback.this.methodName + " \n code: invoke \n result: " + objectRef.element);
                }
                SimpleCallback.this.webViewManager.callback$lib_webext_release(SimpleCallback.this.instanceId, SimpleCallback.this.callbackId, objectRef.element);
            }
        }, 1, null);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [T, org.json.JSONObject] */
    @Override // com.heytap.webview.extension.jsapi.IJsApiCallback
    public void success(@NotNull JSONObject obj) {
        Intrinsics.checkNotNullParameter(obj, "obj");
        final Ref.ObjectRef objectRef = new Ref.ObjectRef();
        objectRef.element = new JSONObject(obj.toString());
        ThreadUtil.execute$lib_webext_release$default(ThreadUtil.INSTANCE, false, new Function0<Unit>() { // from class: com.heytap.webview.extension.fragment.SimpleCallback.success.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            @Override // p010kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() throws JSONException {
                invoke2();
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() throws JSONException {
                if (WebExtEnvironment.INSTANCE.getDebug()) {
                    Log.d(Const.Tag.EXECUTOR, "method: " + SimpleCallback.this.methodName + " \n code: success \n result: " + objectRef.element);
                }
                WebViewManager webViewManager = SimpleCallback.this.webViewManager;
                long j2 = SimpleCallback.this.instanceId;
                String str = SimpleCallback.this.callbackId;
                JSONObject jSONObjectPut = new JSONObject().put("code", 0).put("msg", "success!").put("data", objectRef.element);
                Intrinsics.checkNotNullExpressionValue(jSONObjectPut, "JSONObject()\n           …_CALLBACK_DATA, jsonData)");
                webViewManager.callback$lib_webext_release(j2, str, jSONObjectPut);
            }
        }, 1, null);
    }
}
