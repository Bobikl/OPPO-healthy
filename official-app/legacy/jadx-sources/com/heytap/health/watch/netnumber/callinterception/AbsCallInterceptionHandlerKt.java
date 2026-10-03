package com.heytap.health.watch.netnumber.callinterception;

import android.os.HandlerThread;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0014\u0010\u0001\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0003\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0002\"\u0014\u0010\u0004\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0002\"\u0014\u0010\u0006\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0002\"\u0014\u0010\b\u001a\u00020\u00008\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0002\"\u001b\u0010\r\u001a\u00020\t8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f¨\u0006\u000e"}, d2 = {"", "GSON_KEY_RESPONSE", "Ljava/lang/String;", "AUTH_INTERCEPT_PROVIDER", "ACTION_BLACKLIST_SHARE_PREFERENCE_CHANGE", "OPLUS_COMPONENT_SAFE", "SP_NAME_CALL_INTERCEPTION", "SP_KEY_LAST_SENT_DATA", "SP_KEY_LAST_SENT_DATA_SNAP", "Landroid/os/HandlerThread;", "a", "Lkotlin/Lazy;", "()Landroid/os/HandlerThread;", "handlerThread", "contactnetnumber_impl_OPlusRelease"}, k = 2, mv = {1, 8, 0})
public final class AbsCallInterceptionHandlerKt {

    @NotNull
    public static final String ACTION_BLACKLIST_SHARE_PREFERENCE_CHANGE = "oppo.intent.action.BLACKLIST_SHARED_PREFERENCE_CHANGE";

    @NotNull
    public static final String AUTH_INTERCEPT_PROVIDER = "com.oplus.blacklist.call_intercept_provider";

    @NotNull
    public static final String GSON_KEY_RESPONSE = "response";

    @NotNull
    public static final String OPLUS_COMPONENT_SAFE = "oplus.permission.OPLUS_COMPONENT_SAFE";

    @NotNull
    public static final String SP_KEY_LAST_SENT_DATA = "_last_sent_data_";

    @NotNull
    public static final String SP_KEY_LAST_SENT_DATA_SNAP = "_last_data_snap_";

    @NotNull
    public static final String SP_NAME_CALL_INTERCEPTION = "call_interception_cache";

    @NotNull
    public static final Lazy a = LazyKt__LazyJVMKt.lazy(new Function0<HandlerThread>() { // from class: com.heytap.health.watch.netnumber.callinterception.AbsCallInterceptionHandlerKt$handlerThread$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final HandlerThread invoke() {
            HandlerThread handlerThread = new HandlerThread("call_interception_thread");
            handlerThread.start();
            return handlerThread;
        }
    });

    @NotNull
    public static final HandlerThread a() {
        return (HandlerThread) a.getValue();
    }
}
