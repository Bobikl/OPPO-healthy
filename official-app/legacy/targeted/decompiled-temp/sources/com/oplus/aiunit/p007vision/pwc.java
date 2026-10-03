package com.oplus.aiunit.p007vision;

import com.heytap.health.watch.notification.HealthNotificationBean;
import com.heytap.health.watch.notification.impl.module.NotificationModule;
import com.oplus.aiunit.vision.a7b;
import com.oplus.wearable.linkservice.sdk.Node;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\dex\classes19.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0010B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\n\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bJ\u000e\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bJ\u0006\u0010\u000e\u001a\u00020\u000bR\u0016\u0010\u0012\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0016"}, d2 = {"Lcom/oplus/aiunit/vision/pwc;", "", "Lcom/oplus/wearable/linkservice/sdk/Node;", "node", "", "g", "Lcom/heytap/health/watch/notification/HealthNotificationBean;", "sbn", "", "ignore", "f", "", "status", "h", "e", "Lcom/oplus/aiunit/vision/k51;", "a", "Lcom/oplus/aiunit/vision/k51;", "mWorker", "<init>", "()V", "Companion", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
public final class pwc {
    public static final int BIG_WECHAT_LOGIN = 2;
    public static final int BIG_WECHAT_LOGIN_WITH_SWITCH_OPEN = 3;
    public static final int STUB_WECHAT_LOGIN = 1;

    @NotNull
    public static final String TAG = "NTF_Intercept";
    public static final int WECHAT_NO_LOGIN = 0;
    public static int b;
    public static volatile boolean c;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public k51 mWorker = new k51();

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static Set<String> d = new LinkedHashSet();

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.pwc$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\"\u0010\n\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001b\u001a\u00020\u00118\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u0004¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/pwc$a;", "", "", "isWeChatLogin", "I", "c", "()I", "setWeChatLogin", "(I)V", "", "hasSendIntercept", "Z", "a", "()Z", "d", "(Z)V", "", "", "updateSbn", "Ljava/util/Set;", "b", "()Ljava/util/Set;", "setUpdateSbn", "(Ljava/util/Set;)V", "BIG_WECHAT_LOGIN", "BIG_WECHAT_LOGIN_WITH_SWITCH_OPEN", "STUB_WECHAT_LOGIN", "TAG", "Ljava/lang/String;", "WECHAT_NO_LOGIN", "<init>", "()V", "device_notification_impl2_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a() {
            return pwc.c;
        }

        @NotNull
        public final Set<String> b() {
            return pwc.d;
        }

        public final int c() {
            return pwc.b;
        }

        public final void d(boolean z) {
            pwc.c = z;
        }
    }

    public final int e() {
        return b;
    }

    public final boolean f(@NotNull HealthNotificationBean sbn, boolean ignore) {
        Intrinsics.checkNotNullParameter(sbn, "sbn");
        return this.mWorker.c(sbn, ignore);
    }

    public final void g(@NotNull Node node) {
        Intrinsics.checkNotNullParameter(node, "node");
        this.mWorker.h(node);
    }

    public final void h(int status) {
        a7b.f("NTF_Intercept", "[updateWeChatLogin] --> weChatLoginStatus=" + status);
        b = status;
        NotificationModule.INSTANCE.H();
    }
}
