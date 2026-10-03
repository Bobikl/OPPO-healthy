package com.oplus.aiunit.vision;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u00009\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001\u0015\bÆ\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\tB\t\b\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0018\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0004J\u0006\u0010\n\u001a\u00020\u0006J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0004H\u0002R0\u0010\u0014\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00040\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0004`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0016¨\u0006\u001a"}, d2 = {"Lcom/oplus/aiunit/vision/rxb;", "", "", "macAddress", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", "f", "event", "b", "d", MapSchema.FIELD_NAME_ENTRY, "requestEvent", "Lcom/oplus/aiunit/vision/rxb$a;", "c", "Ljava/util/HashMap;", "Lcom/oplus/aiunit/vision/cyb;", "Lkotlin/collections/HashMap;", "a", "Ljava/util/HashMap;", "mReceiveCache", "com/oplus/aiunit/vision/rxb$c", "Lcom/oplus/aiunit/vision/rxb$c;", "mTimeOutHandler", "<init>", "()V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
public final class rxb {

    @NotNull
    public static final rxb INSTANCE = new rxb();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final HashMap<cyb, MessageEvent> mReceiveCache = new HashMap<>();

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static final c mTimeOutHandler = new c(duc.INSTANCE.a());

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.rxb$a, reason: from toString */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u000f\u001a\u00020\u000b\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0006\u0010\u0003\u001a\u00020\u0002J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0007\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\f\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0014"}, d2 = {"Lcom/oplus/aiunit/vision/rxb$a;", "", "", "b", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/oplus/aiunit/vision/iuf;", "a", "Lcom/oplus/aiunit/vision/iuf;", "()Lcom/oplus/aiunit/vision/iuf;", "responseType", "J", "timeout", "<init>", "(Lcom/oplus/aiunit/vision/iuf;J)V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class MesCacheOption {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final iuf responseType;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        public final long timeout;

        public MesCacheOption(@NotNull iuf responseType, long j2) {
            Intrinsics.checkNotNullParameter(responseType, "responseType");
            this.responseType = responseType;
            this.timeout = j2;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final iuf getResponseType() {
            return this.responseType;
        }

        public final long b() {
            long j2 = this.timeout;
            return j2 != 0 ? j2 : TimeUnit.DAYS.toMillis(1L);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MesCacheOption)) {
                return false;
            }
            MesCacheOption mesCacheOption = (MesCacheOption) other;
            return Intrinsics.areEqual(this.responseType, mesCacheOption.responseType) && this.timeout == mesCacheOption.timeout;
        }

        public int hashCode() {
            return (this.responseType.hashCode() * 31) + Long.hashCode(this.timeout);
        }

        @NotNull
        public String toString() {
            return "MesCacheOption(responseType=" + this.responseType + ", timeout=" + this.timeout + ")";
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.rxb$b, reason: from toString */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0006\u001a\u00020\u0005H\u0016J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\fR\u0017\u0010\u0012\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/oplus/aiunit/vision/rxb$b;", "", "other", "", "equals", "", "hashCode", "", "toString", "Lcom/oplus/aiunit/vision/cyb;", "a", "Lcom/oplus/aiunit/vision/cyb;", "()Lcom/oplus/aiunit/vision/cyb;", "identify", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "b", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "()Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "<init>", "(Lcom/oplus/aiunit/vision/cyb;Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;)V", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final /* data */ class MsgCache {

        /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
        @NotNull
        public final cyb identify;

        /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
        @NotNull
        public final MessageEvent messageEvent;

        public MsgCache(@NotNull cyb identify, @NotNull MessageEvent messageEvent) {
            Intrinsics.checkNotNullParameter(identify, "identify");
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
            this.identify = identify;
            this.messageEvent = messageEvent;
        }

        @NotNull
        /* JADX INFO: renamed from: a, reason: from getter */
        public final cyb getIdentify() {
            return this.identify;
        }

        @NotNull
        /* JADX INFO: renamed from: b, reason: from getter */
        public final MessageEvent getMessageEvent() {
            return this.messageEvent;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!Intrinsics.areEqual(MsgCache.class, other != null ? other.getClass() : null)) {
                return false;
            }
            Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.heytap.health.connect.rawapi.host.MessageCache.MsgCache");
            return Intrinsics.areEqual(this.identify, ((MsgCache) other).identify);
        }

        public int hashCode() {
            return this.identify.hashCode();
        }

        @NotNull
        public String toString() {
            return "MsgCache(identify=" + this.identify + ", messageEvent=" + this.messageEvent + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0006"}, d2 = {"com/oplus/aiunit/vision/rxb$c", "Landroid/os/Handler;", "Landroid/os/Message;", "msg", "", "handleMessage", "lib_heytapconnect_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(@NotNull Message msg) {
            Intrinsics.checkNotNullParameter(msg, "msg");
            Object obj = msg.obj;
            if (msg.what == 1 && (obj instanceof MsgCache)) {
                synchronized (rxb.mReceiveCache) {
                    rxb.mReceiveCache.remove(((MsgCache) obj).getIdentify());
                    a7b.f("MessageCache", "tryCache: removed " + ((MsgCache) obj).getMessageEvent());
                    Unit unit = Unit.INSTANCE;
                }
            }
        }
    }

    @Nullable
    public final MessageEvent b(@NotNull String macAddress, @NotNull MessageEvent event) {
        MessageEvent messageEvent;
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(event, "event");
        MesCacheOption mesCacheOptionC = c(event);
        if (mesCacheOptionC == null) {
            return null;
        }
        cyb cybVarA = dyb.a(event, macAddress, mesCacheOptionC.getResponseType());
        HashMap<cyb, MessageEvent> map = mReceiveCache;
        synchronized (map) {
            messageEvent = map.get(cybVarA);
        }
        if (messageEvent == null) {
            return null;
        }
        wil.d("MessageCache", "getResponseCache: rtn " + messageEvent);
        return messageEvent;
    }

    public final MesCacheOption c(MessageEvent requestEvent) {
        if (requestEvent.getServiceId() == 1 && requestEvent.getCommandId() == 7) {
            return new MesCacheOption(iuf.c.INSTANCE, 60000L);
        }
        return null;
    }

    public final void d() {
        HashMap<cyb, MessageEvent> map = mReceiveCache;
        synchronized (map) {
            map.clear();
            mTimeOutHandler.removeCallbacksAndMessages(null);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void e(@NotNull String macAddress, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        if (c(messageEvent) == null) {
            return;
        }
        cyb cybVarB = dyb.b(messageEvent, macAddress);
        MsgCache msgCache = new MsgCache(cybVarB, messageEvent);
        HashMap<cyb, MessageEvent> map = mReceiveCache;
        synchronized (map) {
            mTimeOutHandler.removeMessages(1, msgCache);
            map.remove(cybVarB);
            a7b.f("MessageCache", "removeEvent: cached " + messageEvent);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void f(@NotNull String macAddress, @NotNull MessageEvent messageEvent) {
        Intrinsics.checkNotNullParameter(macAddress, "macAddress");
        Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
        MesCacheOption mesCacheOptionC = c(messageEvent);
        if (mesCacheOptionC == null) {
            return;
        }
        cyb cybVarB = dyb.b(messageEvent, macAddress);
        MsgCache msgCache = new MsgCache(cybVarB, messageEvent);
        HashMap<cyb, MessageEvent> map = mReceiveCache;
        synchronized (map) {
            c cVar = mTimeOutHandler;
            cVar.removeMessages(1, msgCache);
            Message messageObtainMessage = cVar.obtainMessage(1, msgCache);
            Intrinsics.checkNotNullExpressionValue(messageObtainMessage, "mTimeOutHandler.obtainMessage(MSG_TIME_OUT, cache)");
            cVar.sendMessageDelayed(messageObtainMessage, mesCacheOptionC.b());
            map.put(cybVarB, messageEvent);
            a7b.f("MessageCache", "tryCache: cached " + messageEvent);
            Unit unit = Unit.INSTANCE;
        }
    }
}
