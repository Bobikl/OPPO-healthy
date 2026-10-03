package com.heytap.health.vision.client.impl.primart;

import android.content.Context;
import com.heytap.health.core.provider.HealthSwitchProvider;
import com.heytap.health.health_archives.web.HealthArchiveWebViewActivity;
import com.heytap.health.vision.client.impl.arouter.DMIMessageHandler;
import com.heytap.store.platform.videoplayer.base.BuildConfig;
import com.oplus.aiunit.model.h1;
import com.oplus.aiunit.model.hm4;
import com.oplus.aiunit.model.jm4;
import com.oplus.aiunit.model.mb5;
import com.oplus.aiunit.model.wl4;
import com.oplus.aiunit.vision.e88;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\.\analysis\health667-dex\classes16.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\u00020\u00012\u00020\u0002:\u0002+%B\u0007¢\u0006\u0004\b)\u0010*J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0001J!\u0010\f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0001J\u0019\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\rH\u0097\u0001J)\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001J!\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0096\u0001J)\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0096\u0001J\u0019\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J%\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J!\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0096\u0001J-\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0096\u0001J\u0010\u0010\u001e\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u001dH\u0016J \u0010\u001f\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001dH\u0016J \u0010 \u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u001dH\u0016J\u0018\u0010!\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010\"\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J \u0010$\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\bH\u0016J\u0018\u0010%\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0016J\"\u0010'\u001a\u00020\u00152\u0006\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010(\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0016¨\u0006,"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/primart/DMMessageImpl;", "Lcom/oplus/aiunit/vision/hm4;", "Lcom/oplus/aiunit/vision/jm4;", "Lcom/oplus/aiunit/vision/mb5;", "role", BuildConfig.VERSION_NAME, "sid", "cid", BuildConfig.VERSION_NAME, "arouterPath", BuildConfig.VERSION_NAME, "p", "i", "Lcom/oplus/aiunit/vision/jm4$a;", "listener", "r", "l", "m", "s", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", HealthArchiveWebViewActivity.H5_MESSAGE_KEY, BuildConfig.VERSION_NAME, "k", "Lcom/oplus/aiunit/vision/hm4$c;", HealthSwitchProvider.KEY_RESULT, "j", "mac", "o", "g", "Lcom/oplus/aiunit/vision/hm4$b;", "n", "f", "t", "c", "q", "d", "u", "a", "b", "h", "e", "<init>", "()V", "ArouterMessageListenerWrapper", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public final class DMMessageImpl implements hm4, jm4 {
    public final /* synthetic */ jm4 a = wl4.deviceMultiple.messageApi;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\f\b\u0082\u0004\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u001aJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0018\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/primart/DMMessageImpl$ArouterMessageListenerWrapper;", "Lcom/oplus/aiunit/vision/jm4$a;", "Lcom/oplus/aiunit/vision/mb5$c;", "role", BuildConfig.VERSION_NAME, "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", BuildConfig.VERSION_NAME, "onMessageReceived", "toString", BuildConfig.VERSION_NAME, "other", BuildConfig.VERSION_NAME, "equals", BuildConfig.VERSION_NAME, "hashCode", "i", "I", "sid", "j", "cid", "k", "Ljava/lang/String;", "path", "<init>", "(Lcom/heytap/health/devicemanager/client/impl/primart/DMMessageImpl;IILjava/lang/String;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public final class ArouterMessageListenerWrapper implements jm4.a {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final int sid;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public final int cid;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final String path;
        public final /* synthetic */ DMMessageImpl l;

        public ArouterMessageListenerWrapper(DMMessageImpl dMMessageImpl, int i, @NotNull int i2, String str) {
            Intrinsics.checkNotNullParameter(str, "path");
            this.l = dMMessageImpl;
            this.sid = i;
            this.cid = i2;
            this.path = str;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(ArouterMessageListenerWrapper.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.devicemanager.client.impl.primart.DMMessageImpl.ArouterMessageListenerWrapper");
            ArouterMessageListenerWrapper arouterMessageListenerWrapper = (ArouterMessageListenerWrapper) other;
            return this.sid == arouterMessageListenerWrapper.sid && this.cid == arouterMessageListenerWrapper.cid && Intrinsics.areEqual(this.path, arouterMessageListenerWrapper.path);
        }

        public int hashCode() {
            return (((this.sid * 31) + this.cid) * 31) + this.path.hashCode();
        }

        @Override // com.oplus.aiunit.vision.jm4.a
        public void onMessageReceived(@NotNull mb5.c role, @NotNull final String mac, @NotNull final MessageEvent event) {
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            h1 h1Var = h1.INSTANCE;
            Context contextA = e88.a();
            Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
            h1Var.b(contextA, this.path, new Function1<DMIMessageHandler, Unit>() { // from class: com.heytap.health.devicemanager.client.impl.primart.DMMessageImpl$ArouterMessageListenerWrapper$onMessageReceived$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    invoke((DMIMessageHandler) obj);
                    return Unit.INSTANCE;
                }

                public final void invoke(@NotNull DMIMessageHandler dMIMessageHandler) {
                    Intrinsics.checkNotNullParameter(dMIMessageHandler, "it");
                    dMIMessageHandler.onMessageReceived(mac, event);
                }
            });
        }

        @NotNull
        public String toString() {
            return "(" + this.sid + "." + this.cid + "," + this.path + ")";
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B#\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000f\u0012\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\n\u001a\u00020\u0004H\u0016J\u0013\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u000fH\u0016R\u0014\u0010\u0013\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u0014\u0010\u0019\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/heytap/health/devicemanager/client/impl/primart/DMMessageImpl$a;", "Lcom/oplus/aiunit/vision/jm4$a;", "Lcom/oplus/aiunit/vision/mb5$c;", "role", BuildConfig.VERSION_NAME, "mac", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "event", BuildConfig.VERSION_NAME, "onMessageReceived", "toString", BuildConfig.VERSION_NAME, "other", BuildConfig.VERSION_NAME, "equals", BuildConfig.VERSION_NAME, "hashCode", "i", "I", "sid", "j", "cid", "Lcom/oplus/aiunit/vision/hm4$b;", "k", "Lcom/oplus/aiunit/vision/hm4$b;", "listener", "<init>", "(IILcom/oplus/aiunit/vision/hm4$b;)V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements jm4.a {

        /* JADX INFO: renamed from: i, reason: from kotlin metadata */
        public final int sid;

        /* JADX INFO: renamed from: j, reason: from kotlin metadata */
        public final int cid;

        /* JADX INFO: renamed from: k, reason: from kotlin metadata */
        @NotNull
        public final hm4.b listener;

        public a(int i, int i2, @NotNull hm4.b bVar) {
            Intrinsics.checkNotNullParameter(bVar, "listener");
            this.sid = i;
            this.cid = i2;
            this.listener = bVar;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(a.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.devicemanager.client.impl.primart.DMMessageImpl.MessageListenerWrapper");
            a aVar = (a) other;
            return this.sid == aVar.sid && this.cid == aVar.cid && Intrinsics.areEqual(this.listener, aVar.listener);
        }

        public int hashCode() {
            return (((this.sid * 31) + this.cid) * 31) + this.listener.hashCode();
        }

        @Override // com.oplus.aiunit.vision.jm4.a
        public void onMessageReceived(@NotNull mb5.c role, @NotNull String mac, @NotNull MessageEvent event) {
            Intrinsics.checkNotNullParameter(role, "role");
            Intrinsics.checkNotNullParameter(mac, "mac");
            Intrinsics.checkNotNullParameter(event, "event");
            this.listener.onMessageReceived(mac, event);
        }

        @NotNull
        public String toString() {
            return "(" + this.sid + "." + this.cid + "," + this.listener + ")";
        }

        public /* synthetic */ a(int i, int i2, hm4.b bVar, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? -1 : i, (i3 & 2) != 0 ? -1 : i2, bVar);
        }
    }

    @Override // com.oplus.aiunit.model.hm4
    public boolean a(@NotNull String mac, @NotNull MessageEvent message) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return o(mb5.c.b.INSTANCE, mac, message);
    }

    @Override // com.oplus.aiunit.model.hm4
    public boolean b(@NotNull MessageEvent message) {
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return k(mb5.c.b.INSTANCE, message);
    }

    @Override // com.oplus.aiunit.model.hm4
    public void c(int sid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        q(sid, -1, arouterPath);
    }

    @Override // com.oplus.aiunit.model.hm4
    public void d(int sid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        u(sid, -1, arouterPath);
    }

    @Override // com.oplus.aiunit.model.hm4
    public boolean e(@NotNull MessageEvent message, @Nullable hm4.c result) {
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return j(mb5.c.b.INSTANCE, message, result);
    }

    @Override // com.oplus.aiunit.model.hm4
    public void f(int sid, int cid, @NotNull hm4.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        l(mb5.c.b.INSTANCE, sid, cid, new a(sid, cid, listener));
    }

    @Override // com.oplus.aiunit.model.jm4
    public boolean g(@NotNull mb5 role, @NotNull String mac, @NotNull MessageEvent message, @Nullable hm4.c result) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return this.a.g(role, mac, message, result);
    }

    @Override // com.oplus.aiunit.model.hm4
    public boolean h(@NotNull String mac, @NotNull MessageEvent message, @Nullable hm4.c result) {
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return g(mb5.c.b.INSTANCE, mac, message, result);
    }

    @Override // com.oplus.aiunit.model.jm4
    public void i(@NotNull mb5 role, int sid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        this.a.i(role, sid, arouterPath);
    }

    @Override // com.oplus.aiunit.model.jm4
    public boolean j(@NotNull mb5 role, @NotNull MessageEvent message, @Nullable hm4.c result) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return this.a.j(role, message, result);
    }

    @Override // com.oplus.aiunit.model.jm4
    public boolean k(@NotNull mb5 role, @NotNull MessageEvent message) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return this.a.k(role, message);
    }

    @Override // com.oplus.aiunit.model.jm4
    public void l(@NotNull mb5 role, int sid, int cid, @NotNull jm4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.l(role, sid, cid, listener);
    }

    @Override // com.oplus.aiunit.model.jm4
    public void m(@NotNull mb5 role, int sid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        this.a.m(role, sid, arouterPath);
    }

    @Override // com.oplus.aiunit.model.hm4
    public void n(@NotNull hm4.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        r(mb5.c.b.INSTANCE, new a(0, 0, listener, 3, null));
    }

    @Override // com.oplus.aiunit.model.jm4
    public boolean o(@NotNull mb5 role, @NotNull String mac, @NotNull MessageEvent message) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(mac, "mac");
        Intrinsics.checkNotNullParameter(message, HealthArchiveWebViewActivity.H5_MESSAGE_KEY);
        return this.a.o(role, mac, message);
    }

    @Override // com.oplus.aiunit.model.jm4
    public void p(@NotNull mb5 role, int sid, int cid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        this.a.p(role, sid, cid, arouterPath);
    }

    @Override // com.oplus.aiunit.model.hm4
    public void q(int sid, int cid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        l(mb5.c.b.INSTANCE, sid, cid, new ArouterMessageListenerWrapper(this, sid, cid, arouterPath));
    }

    @Override // com.oplus.aiunit.model.jm4
    @Deprecated(message = "please addMessageListener method")
    public void r(@NotNull mb5 role, @NotNull jm4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.r(role, listener);
    }

    @Override // com.oplus.aiunit.model.jm4
    public void s(@NotNull mb5 role, int sid, int cid, @NotNull jm4.a listener) {
        Intrinsics.checkNotNullParameter(role, "role");
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.a.s(role, sid, cid, listener);
    }

    @Override // com.oplus.aiunit.model.hm4
    public void t(int sid, int cid, @NotNull hm4.b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        s(mb5.c.b.INSTANCE, sid, cid, new a(sid, cid, listener));
    }

    public void u(int sid, int cid, @NotNull String arouterPath) {
        Intrinsics.checkNotNullParameter(arouterPath, "arouterPath");
        s(mb5.c.b.INSTANCE, sid, cid, new ArouterMessageListenerWrapper(this, sid, cid, arouterPath));
    }
}
