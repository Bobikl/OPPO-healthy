package com.heytap.health.watch.wifi;

import android.content.Context;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.ArraySet;
import com.heytap.health.protocol.dm.DMProto$WiFiConfig;
import com.heytap.health.protocol.dm.DMProto$WiFiEncryptInfo;
import com.heytap.health.protocol.dm.DMProto$WiFiInfo;
import com.heytap.health.watch.wifi.WifiSyncOnceApi;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.WifiRecord;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.cm9;
import com.oplus.aiunit.vision.fp6;
import com.oplus.aiunit.vision.fwl;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.i37;
import com.oplus.aiunit.vision.l9d;
import com.oplus.aiunit.vision.lq;
import com.oplus.aiunit.vision.q97;
import com.oplus.aiunit.vision.r0g;
import com.oplus.aiunit.vision.rp;
import com.oplus.aiunit.vision.zvl;
import com.oplus.health.apiprovider.ClientManager;
import com.oplus.pantaconnect.sdk.PlatformInitialization;
import com.oplus.pantaconnect.sdk.logger.Logger;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import com.oplus.wearable.linkservice.sdk.Node;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u00192\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\t\u001a\u00020\u0006H\u0002J\u0012\u0010\f\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002R\u001d\u0010\u0011\u001a\u0004\u0018\u00010\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0016\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u000e\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/watch/wifi/WifiSyncOnceApi;", "Lcom/oplus/aiunit/vision/cm9;", "Lcom/heytap/health/watch/wifi/IWifiSyncOnce;", "i", "Landroid/content/Context;", "context", "", "c", "b", MapSchema.FIELD_NAME_KEY, "", "encryptKey", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/q97;", "Lkotlin/Lazy;", b2n.g, "()Lcom/oplus/aiunit/vision/q97;", "mFetcher", "Lcom/heytap/health/watch/wifi/IWifiSyncOnce$Stub;", "j", b2n.f, "()Lcom/heytap/health/watch/wifi/IWifiSyncOnce$Stub;", "binder", "<init>", "()V", "Companion", "a", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
public final class WifiSyncOnceApi implements cm9<IWifiSyncOnce> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final Lazy mFetcher = LazyKt__LazyJVMKt.lazy(new Function0<q97>() { // from class: com.heytap.health.watch.wifi.WifiSyncOnceApi$mFetcher$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @Nullable
        public final q97 invoke() {
            return q97.INSTANCE.a();
        }
    });

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy binder = LazyKt__LazyJVMKt.lazy(new Function0<WifiSyncOnceApi$binder$2.AnonymousClass1>() { // from class: com.heytap.health.watch.wifi.WifiSyncOnceApi$binder$2
        {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.heytap.health.watch.wifi.WifiSyncOnceApi$binder$2$1] */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final AnonymousClass1 invoke() {
            final WifiSyncOnceApi wifiSyncOnceApi = this.this$0;
            return new IWifiSyncOnce.Stub() { // from class: com.heytap.health.watch.wifi.WifiSyncOnceApi$binder$2.1
                @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
                public void onMessageReceived(@NotNull MessageEvent messageEvent) {
                    Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
                    int commandId = messageEvent.getCommandId();
                    if (commandId == 105) {
                        a7b.f("WifiSyncOnceApi", "start check wifi from device");
                        wifiSyncOnceApi.k();
                        return;
                    }
                    if (commandId != 116) {
                        return;
                    }
                    try {
                        wifiSyncOnceApi.l(DMProto$WiFiEncryptInfo.parseFrom(messageEvent.getData()).getKey());
                    } catch (Exception e2) {
                        a7b.b("WifiSyncOnceApi", "onMessageReceived error: " + e2.getMessage());
                    }
                }

                @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
                public void processBondConnect(@NotNull Node node) {
                    Intrinsics.checkNotNullParameter(node, "node");
                    if (!zvl.a(node.getNodeId()).Z()) {
                        a7b.f("WifiSyncOnceApi", "[processBondConnect]--> not support sync wifi, return");
                    } else if (i37.c(node.getNodeId())) {
                        a7b.f("WifiSyncOnceApi", "[processBondConnect]--> family device, return");
                    } else {
                        a7b.f("WifiSyncOnceApi", "start check wifi from phone");
                        wifiSyncOnceApi.k();
                    }
                }

                @Override // com.heytap.health.watch.wifi.IWifiSyncOnce
                public void processCheck() {
                    String currentConnectId = gl4.managerApi.getCurrentConnectId();
                    if (currentConnectId == null || currentConnectId.length() == 0) {
                        a7b.f("WifiSyncOnceApi", "[processCheck]--> current mac is empty, return");
                        return;
                    }
                    if (!zvl.a(currentConnectId).Z()) {
                        a7b.f("WifiSyncOnceApi", "[processCheck]--> not support sync wifi, return");
                    } else if (i37.c(currentConnectId)) {
                        a7b.f("WifiSyncOnceApi", "[processCheck]--> family device, return");
                    } else {
                        wifiSyncOnceApi.k();
                    }
                }
            };
        }
    });

    /* JADX INFO: renamed from: com.heytap.health.watch.wifi.WifiSyncOnceApi$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u0004\u0018\u00010\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000b\u0010\fJ\n\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/heytap/health/watch/wifi/WifiSyncOnceApi$a;", "", "Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;", "messageEvent", "", "d", "(Lcom/oplus/wearable/linkservice/sdk/common/MessageEvent;)Lkotlin/Unit;", "Lcom/oplus/wearable/linkservice/sdk/Node;", l9d.BUNDLE_KEY_NODE, MapSchema.FIELD_NAME_ENTRY, "(Lcom/oplus/wearable/linkservice/sdk/Node;)Lkotlin/Unit;", "f", "()Lkotlin/Unit;", "Lcom/heytap/health/watch/wifi/IWifiSyncOnce;", "b", "", "TAG", "Ljava/lang/String;", "<init>", "()V", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static final IWifiSyncOnce c(IBinder iBinder) {
            return IWifiSyncOnce.Stub.asInterface(iBinder);
        }

        public final IWifiSyncOnce b() {
            return (IWifiSyncOnce) ClientManager.getInstance().getBuildService("api_provider_wifi_sync_once", new ClientManager.a() { // from class: com.oplus.aiunit.vision.lwl
                @Override // com.oplus.health.apiprovider.ClientManager.a
                public final Object a(IBinder iBinder) {
                    return WifiSyncOnceApi.Companion.c(iBinder);
                }
            });
        }

        @JvmStatic
        @Nullable
        public final Unit d(@NotNull MessageEvent messageEvent) {
            Intrinsics.checkNotNullParameter(messageEvent, "messageEvent");
            try {
                IWifiSyncOnce iWifiSyncOnceB = b();
                if (iWifiSyncOnceB == null) {
                    return null;
                }
                iWifiSyncOnceB.onMessageReceived(messageEvent);
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                a7b.b("WifiSyncOnceApi", "onMessageReceived exception: " + e2.getMessage());
                return Unit.INSTANCE;
            }
        }

        @Nullable
        public final Unit e(@NotNull Node node) {
            Intrinsics.checkNotNullParameter(node, "node");
            try {
                IWifiSyncOnce iWifiSyncOnceB = b();
                if (iWifiSyncOnceB == null) {
                    return null;
                }
                iWifiSyncOnceB.processBondConnect(node);
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                a7b.b("WifiSyncOnceApi", "processBondConnect exception: " + e2.getMessage());
                return Unit.INSTANCE;
            }
        }

        @Nullable
        public final Unit f() {
            try {
                IWifiSyncOnce iWifiSyncOnceB = b();
                if (iWifiSyncOnceB == null) {
                    return null;
                }
                iWifiSyncOnceB.processCheck();
                return Unit.INSTANCE;
            } catch (RemoteException e2) {
                a7b.b("WifiSyncOnceApi", "processFetch exception: " + e2.getMessage());
                return Unit.INSTANCE;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¨\u0006\t"}, d2 = {"com/heytap/health/watch/wifi/WifiSyncOnceApi$b", "Lcom/oplus/pantaconnect/sdk/logger/Logger;", "Lcom/oplus/pantaconnect/sdk/logger/Logger$Level;", "level", "", "tag", UTraceSQLiteHelperKt.COL_INFO, "", "log", "wifi_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class b implements Logger {

        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        public /* synthetic */ class a {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[Logger.Level.values().length];
                try {
                    iArr[Logger.Level.DEBUG.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[Logger.Level.INFO.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[Logger.Level.WARNING.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[Logger.Level.ERROR.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        @Override // com.oplus.pantaconnect.sdk.logger.Logger
        public void log(@NotNull Logger.Level level, @NotNull String tag, @NotNull String info) {
            Intrinsics.checkNotNullParameter(level, "level");
            Intrinsics.checkNotNullParameter(tag, "tag");
            Intrinsics.checkNotNullParameter(info, "info");
            int i = a.$EnumSwitchMapping$0[level.ordinal()];
            if (i == 2) {
                a7b.f(tag, info);
            } else if (i == 3) {
                a7b.m(tag, info);
            } else {
                if (i != 4) {
                    return;
                }
                a7b.b(tag, info);
            }
        }
    }

    @JvmStatic
    @Nullable
    public static final Unit j(@NotNull MessageEvent messageEvent) {
        return INSTANCE.d(messageEvent);
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void b(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // com.oplus.aiunit.vision.cm9
    public void c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        rp.a(context);
        PlatformInitialization.init(b78.a(), new b());
        fp6.i(context);
    }

    public final IWifiSyncOnce.Stub g() {
        return (IWifiSyncOnce.Stub) this.binder.getValue();
    }

    public final q97 h() {
        return (q97) this.mFetcher.getValue();
    }

    @Override // com.oplus.aiunit.vision.cm9
    @NotNull
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public IWifiSyncOnce d() {
        return g();
    }

    public final void k() {
        q97 q97VarH = h();
        if (q97VarH != null) {
            q97VarH.e();
        }
    }

    public final void l(String encryptKey) {
        ArraySet<WifiRecord> arraySet;
        String strC;
        q97 q97VarH = h();
        if (q97VarH == null || (arraySet = q97VarH.d()) == null) {
            arraySet = new ArraySet<>();
        }
        if (arraySet.isEmpty()) {
            a7b.f("WifiSyncOnceApi", "[startSync]--> wifi configurations is empty");
            return;
        }
        r0g.d();
        String strB = lq.b();
        if (encryptKey != null) {
            strC = r0g.c(strB, encryptKey);
            if (strC == null) {
                strC = "";
            } else {
                Intrinsics.checkNotNullExpressionValue(strC, "RsaEncryptUtils.encryptB…blicKey(aesKey, it) ?: \"\"");
            }
        } else {
            strC = null;
        }
        if (strC == null || strC.length() == 0) {
            a7b.f("WifiSyncOnceApi", "[startSync]--> key is empty");
            return;
        }
        DMProto$WiFiInfo.Builder builderNewBuilder = DMProto$WiFiInfo.newBuilder();
        builderNewBuilder.setKey(strC);
        for (WifiRecord wifiRecord : arraySet) {
            DMProto$WiFiConfig.Builder builderNewBuilder2 = DMProto$WiFiConfig.newBuilder();
            if (!TextUtils.isEmpty(wifiRecord.getSsid())) {
                builderNewBuilder2.setSsid(wifiRecord.getSsid());
            }
            if (!TextUtils.isEmpty(wifiRecord.getPreSharedKey())) {
                builderNewBuilder2.setPwd(lq.a(wifiRecord.getPreSharedKey(), strB));
            }
            builderNewBuilder2.setSecurityType(wifiRecord.getSecurityType());
            builderNewBuilder.addConfigs(builderNewBuilder2.build());
        }
        fwl.b(builderNewBuilder);
    }
}
