package com.oplus.aiunit.vision;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.oplus.deepthinker.platform.server.IDeepThinkerBridge;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.DeviceEventResult;
import com.oplus.deepthinker.sdk.app.aidl.eventfountain.IEventCallback;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 $2\u00020\u0001:\u0001\u0013B\u0007¢\u0006\u0004\b\"\u0010#J\u000e\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\r\u001a\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ$\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u0010J\b\u0010\u0014\u001a\u00020\u000bH\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0015R\u001e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u001bR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u001dR\u0018\u0010!\u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010 ¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/oea;", "", "Lcom/oplus/deepthinker/platform/server/IDeepThinkerBridge;", "remote", "f", "", "tag", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/IEventCallback$Stub;", "callback", "d", "Lkotlin/Function0;", "Landroid/os/Bundle;", "paramsBuilder", MapSchema.FIELD_NAME_ENTRY, "feature", oea.FUNCTION, "", "oneway", "", "a", "c", "Lcom/oplus/deepthinker/platform/server/IDeepThinkerBridge;", "b", "Lkotlin/jvm/functions/Function0;", "params", "Ljava/lang/String;", "callbackTag", "Lcom/oplus/deepthinker/sdk/app/aidl/eventfountain/IEventCallback$Stub;", "Landroid/content/Context;", "Landroid/content/Context;", "context", "Landroid/app/PendingIntent;", "Landroid/app/PendingIntent;", BaseGmsClient.KEY_PENDING_INTENT, "<init>", "()V", "Companion", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
public final class oea {

    @NotNull
    public static final String API_CODE = "api_code";

    @NotNull
    public static final String CALLBACK = "cb";

    @NotNull
    public static final String CALLBACK_TAG = "cb_tag";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String EVENT_TYPE = "event_type";

    @NotNull
    public static final String FEATURE_API_REQUEST = "api";

    @NotNull
    public static final String FUNCTION = "func";

    @NotNull
    public static final String FUNCTION_DESCR = "func_descr";
    public static final int FUNCTION_REGISTER = 101;
    public static final int FUNCTION_UNREGISTER = 102;

    @NotNull
    public static final String PENDING_INTENT = "pdintent";

    @NotNull
    public static final String PID_CALLBACK_TAG = "cb_ptag";

    @NotNull
    public static final String RESULT_CODE = "rep_code";

    @NotNull
    public static final String RESULT_FUNC = "rep_func";
    public static final int RESULT_FUNC_EVENT = 2;
    public static final int RESULT_FUNC_FAILURE = 0;
    public static final int RESULT_FUNC_SUCCESS = 1;

    @NotNull
    public static final String RESULT_MSG = "rep_msg";

    @NotNull
    public static final String TAG = "InternalApiCall";

    @NotNull
    public static final String VERSION = "v1";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public IDeepThinkerBridge remote;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public Function0<Bundle> params;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public String callbackTag;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    @Nullable
    public IEventCallback.Stub callback;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public Context context;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @Nullable
    public PendingIntent pendingIntent;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.oea$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u001f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b(\u0010)J\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0007J\u0014\u0010\b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0003H\u0007J\u0014\u0010\n\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0003H\u0007J\u0014\u0010\r\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0007J\f\u0010\u000e\u001a\u00020\u0005*\u00020\u0002H\u0007J\f\u0010\u000f\u001a\u00020\u0003*\u00020\u0002H\u0007J\f\u0010\u0010\u001a\u00020\u0003*\u00020\u0002H\u0007J\u000e\u0010\u0011\u001a\u0004\u0018\u00010\u000b*\u00020\u0002H\u0007J\f\u0010\u0012\u001a\u00020\u0003*\u00020\u0002H\u0007R\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0014R\u0014\u0010\u0018\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014R\u0014\u0010\u001a\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014R\u0014\u0010\u001b\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0014R\u0014\u0010\u001f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014R\u0014\u0010 \u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u0014R\u0014\u0010!\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u0014R\u0014\u0010\"\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001cR\u0014\u0010#\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001cR\u0014\u0010$\u001a\u00020\u00038\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001cR\u0014\u0010%\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u0014R\u0014\u0010&\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u0014R\u0014\u0010'\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b'\u0010\u0014¨\u0006*"}, d2 = {"Lcom/oplus/aiunit/vision/oea$a;", "", "Landroid/os/Bundle;", "", "code", "", "f", "function", "i", "eventType", b2n.g, "", "pidCallbackTag", b2n.f, "a", "b", "c", MapSchema.FIELD_NAME_ENTRY, "d", "API_CODE", "Ljava/lang/String;", "CALLBACK", "CALLBACK_TAG", "EVENT_TYPE", "FEATURE_API_REQUEST", "FUNCTION", "FUNCTION_DESCR", "FUNCTION_REGISTER", "I", "FUNCTION_UNREGISTER", "PENDING_INTENT", "PID_CALLBACK_TAG", "RESULT_CODE", "RESULT_FUNC", "RESULT_FUNC_EVENT", "RESULT_FUNC_FAILURE", "RESULT_FUNC_SUCCESS", "RESULT_MSG", "TAG", "VERSION", "<init>", "()V", "com.oplus.deepthinker.sdk_release"}, k = 1, mv = {1, 6, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public final void a(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            int iMyPid = Process.myPid();
            StringBuilder sb = new StringBuilder();
            sb.append((Object) bundle.getString(oea.CALLBACK_TAG));
            sb.append('_');
            sb.append(iMyPid);
            g(bundle, sb.toString());
        }

        @JvmStatic
        public final int b(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            return bundle.getInt(oea.API_CODE);
        }

        @JvmStatic
        public final int c(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            return bundle.getInt(oea.RESULT_CODE);
        }

        @JvmStatic
        public final int d(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            return bundle.getInt(oea.RESULT_FUNC);
        }

        @JvmStatic
        @Nullable
        public final String e(@NotNull Bundle bundle) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            return bundle.getString(oea.RESULT_MSG);
        }

        @JvmStatic
        public final void f(@NotNull Bundle bundle, int i) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            bundle.putInt(oea.API_CODE, i);
        }

        @JvmStatic
        public final void g(@NotNull Bundle bundle, @NotNull String pidCallbackTag) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            Intrinsics.checkNotNullParameter(pidCallbackTag, "pidCallbackTag");
            bundle.putString(oea.PID_CALLBACK_TAG, pidCallbackTag);
        }

        @JvmStatic
        public final void h(@NotNull Bundle bundle, int i) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            bundle.putInt("event_type", i);
        }

        @JvmStatic
        public final void i(@NotNull Bundle bundle, int i) {
            Intrinsics.checkNotNullParameter(bundle, "<this>");
            bundle.putInt(oea.FUNCTION, i);
        }
    }

    public static /* synthetic */ void b(oea oeaVar, String str, String str2, boolean z, int i, Object obj) throws PendingIntent.CanceledException, RemoteException {
        if ((i & 1) != 0) {
            str = FEATURE_API_REQUEST;
        }
        if ((i & 2) != 0) {
            str2 = "v1";
        }
        if ((i & 4) != 0) {
            z = false;
        }
        oeaVar.a(str, str2, z);
    }

    public final void a(@NotNull String feature, @NotNull String func, boolean oneway) throws PendingIntent.CanceledException, RemoteException {
        Intrinsics.checkNotNullParameter(feature, "feature");
        Intrinsics.checkNotNullParameter(func, "func");
        Bundle bundleC = c();
        if (oneway) {
            IDeepThinkerBridge iDeepThinkerBridge = this.remote;
            if (iDeepThinkerBridge == null) {
                return;
            }
            iDeepThinkerBridge.onewayCall(feature, func, bundleC);
            return;
        }
        IDeepThinkerBridge iDeepThinkerBridge2 = this.remote;
        Bundle bundleCall = iDeepThinkerBridge2 == null ? null : iDeepThinkerBridge2.call(feature, func, bundleC);
        Companion companion = INSTANCE;
        int iB = companion.b(bundleC);
        if (bundleCall == null) {
            bundleCall = new Bundle();
            bundleCall.putInt(RESULT_FUNC, 0);
        }
        bundleCall.setClassLoader(oea.class.getClassLoader());
        DeviceEventResult deviceEventResult = new DeviceEventResult(iB, companion.d(bundleCall), 0, null, bundleCall);
        IEventCallback.Stub stub = this.callback;
        if (stub != null) {
            stub.onEventStateChanged(deviceEventResult);
        }
        PendingIntent pendingIntent = this.pendingIntent;
        if (pendingIntent == null) {
            return;
        }
        Context context = this.context;
        Intent intent = new Intent();
        intent.putExtras(bundleCall);
        Unit unit = Unit.INSTANCE;
        pendingIntent.send(context, 0, intent);
    }

    public final Bundle c() {
        Function0<Bundle> function0 = this.params;
        Bundle bundleInvoke = function0 == null ? null : function0.invoke();
        if (bundleInvoke == null) {
            throw new IllegalArgumentException("Build Api Request failed!");
        }
        String str = this.callbackTag;
        if (str != null) {
            bundleInvoke.putString(CALLBACK_TAG, str);
        }
        IEventCallback.Stub stub = this.callback;
        if (stub != null) {
            bundleInvoke.putBinder(CALLBACK, stub);
        }
        PendingIntent pendingIntent = this.pendingIntent;
        if (pendingIntent != null) {
            bundleInvoke.putParcelable(PENDING_INTENT, pendingIntent);
        }
        INSTANCE.a(bundleInvoke);
        return bundleInvoke;
    }

    @NotNull
    public final oea d(@NotNull String tag, @NotNull IEventCallback.Stub callback) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.callbackTag = tag;
        this.callback = callback;
        return this;
    }

    @NotNull
    public final oea e(@NotNull Function0<Bundle> paramsBuilder) {
        Intrinsics.checkNotNullParameter(paramsBuilder, "paramsBuilder");
        this.params = paramsBuilder;
        return this;
    }

    @NotNull
    public final oea f(@NotNull IDeepThinkerBridge remote) {
        Intrinsics.checkNotNullParameter(remote, "remote");
        this.remote = remote;
        return this;
    }
}
