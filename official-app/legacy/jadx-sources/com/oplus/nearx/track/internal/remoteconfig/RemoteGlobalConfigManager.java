package com.oplus.nearx.track.internal.remoteconfig;

import android.os.Handler;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.tangramconfig.strategy.Fields;
import com.oplus.aiunit.vision.b2n;
import com.oplus.aiunit.vision.h78;
import com.oplus.aiunit.vision.hka;
import com.oplus.aiunit.vision.k6k;
import com.oplus.aiunit.vision.l5k;
import com.oplus.aiunit.vision.ynf;
import com.oplus.nearx.track.internal.common.content.GlobalConfigHelper;
import com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.GlobalConfigEntity;
import com.oplus.nearx.track.internal.remoteconfig.cloudconfig.entity.SDKConfig;
import com.oplus.nearx.track.internal.remoteconfig.control.GlobalConfigControl;
import com.oplus.nearx.track.internal.storage.sp.SharePreferenceHelper;
import com.oplus.nearx.track.internal.utils.Logger;
import io.protostuff.MapSchema;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.ranges.RangesKt___RangesKt;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bH\u0010\nJ!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\r\u0018\u00010\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014J\u000e\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002J\u0010\u0010\u0018\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002J\u0016\u0010\u001c\u001a\u00020\u00062\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002J\f\u0010\u001d\u001a\u00020\u0004*\u00020\u000bH\u0002R\"\u0010$\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\"\u0010(\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001f\u001a\u0004\b&\u0010!\"\u0004\b'\u0010#R\"\u0010,\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001f\u001a\u0004\b*\u0010!\"\u0004\b+\u0010#R\"\u00102\u001a\u00020\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u00104R0\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\f\u00106\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b \u00107\"\u0004\b8\u00109R\u0018\u0010<\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R$\u0010B\u001a\u00020=2\u0006\u0010>\u001a\u00020=8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b*\u0010?\u001a\u0004\b@\u0010AR$\u0010E\u001a\u00020\r2\u0006\u0010>\u001a\u00020\r8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0012\u0010C\u001a\u0004\b:\u0010DR\u0011\u0010G\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\bF\u0010/¨\u0006I"}, d2 = {"Lcom/oplus/nearx/track/internal/remoteconfig/RemoteGlobalConfigManager;", "", "Landroid/os/Handler;", "handler", "", "isTest", "", LogFieldKey.MESSAGE_KEY, "(Landroid/os/Handler;Z)V", MapSchema.FIELD_NAME_ENTRY, "()V", "", Fields.PRODUCT_ID, "", "version", "r", "(Ljava/lang/String;I)V", "Lkotlin/Pair;", "i", "()Lkotlin/Pair;", "Lcom/oplus/aiunit/vision/ynf;", "callback", "u", "t", "d", "", "Lcom/oplus/nearx/track/internal/remoteconfig/cloudconfig/entity/GlobalConfigEntity;", "globalConfigList", "s", LogFieldKey.PROCESS_NAME_KEY, "a", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "setBizBackupDomain$core_statistics_release", "(Ljava/lang/String;)V", "bizBackupDomain", "b", MapSchema.FIELD_NAME_KEY, "setTechBackUpDomain$core_statistics_release", "techBackUpDomain", "c", b2n.g, "setNtpServerAddress$core_statistics_release", "ntpServerAddress", "Z", "j", "()Z", "setSecondCheck$core_statistics_release", "(Z)V", "secondCheck", "Lcom/oplus/nearx/track/internal/remoteconfig/control/GlobalConfigControl;", "Lcom/oplus/nearx/track/internal/remoteconfig/control/GlobalConfigControl;", "globalConfigControl", "value", "Ljava/util/List;", "v", "(Ljava/util/List;)V", b2n.f, "Lcom/oplus/aiunit/vision/ynf;", "remoteConfigCallback", "", "<set-?>", "J", LogFieldKey.LEVEL_KEY, "()J", "uploadIntervalTime", "I", "()I", "checkUpdateCount", "q", "isTestEnv", "<init>", "core-statistics_release"}, k = 1, mv = {1, 7, 1})
public final class RemoteGlobalConfigManager {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static boolean secondCheck;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public static GlobalConfigControl globalConfigControl;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    @Nullable
    public static ynf remoteConfigCallback;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    public static volatile int checkUpdateCount;

    @NotNull
    public static final RemoteGlobalConfigManager INSTANCE = new RemoteGlobalConfigManager();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static String bizBackupDomain = "";

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public static String techBackUpDomain = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public static String ntpServerAddress = "";

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    @NotNull
    public static List<GlobalConfigEntity> globalConfigList = CollectionsKt__CollectionsKt.emptyList();

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    public static volatile long uploadIntervalTime = 300000;

    public static /* synthetic */ void n(RemoteGlobalConfigManager remoteGlobalConfigManager, Handler handler, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = SharePreferenceHelper.h().getBoolean("enableScanTestDeviceMode", false) || GlobalConfigHelper.INSTANCE.d();
        }
        remoteGlobalConfigManager.m(handler, z);
    }

    public static final void o(boolean z) {
        secondCheck = true;
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "init globalConfig starting... delay 3S", null, null, 12, null);
        INSTANCE.d(z);
    }

    public final void d(final boolean isTest) {
        GlobalConfigControl globalConfigControl2 = globalConfigControl;
        if (globalConfigControl2 != null) {
            globalConfigControl2.l(new Function1<List<? extends GlobalConfigEntity>, Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager$checkGlobalControlUpdate$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // p010kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(List<? extends GlobalConfigEntity> list) {
                    invoke2((List<GlobalConfigEntity>) list);
                    return Unit.INSTANCE;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull final List<GlobalConfigEntity> result) {
                    Intrinsics.checkNotNullParameter(result, "result");
                    RemoteGlobalConfigManager.INSTANCE.v(result);
                    final boolean z = isTest;
                    h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager$checkGlobalControlUpdate$1.1
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
                            Logger.b(k6k.e(), "RemoteGlobalConfigManager", "isTestDevice=[" + z + "] query globalConfig success... globalConfig result: " + result, null, null, 12, null);
                        }
                    });
                    ynf ynfVar = RemoteGlobalConfigManager.remoteConfigCallback;
                    if (ynfVar != null) {
                        ynfVar.a();
                    }
                }
            });
        }
    }

    public final void e() {
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "checkUpdate globalConfig...", null, null, 12, null);
        GlobalConfigControl globalConfigControl2 = globalConfigControl;
        if (globalConfigControl2 != null && globalConfigControl2.a()) {
            checkUpdateCount = 0;
        } else {
            checkUpdateCount++;
        }
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "checkUpdateCount = " + checkUpdateCount, null, null, 12, null);
    }

    @NotNull
    public final String f() {
        return bizBackupDomain;
    }

    public final int g() {
        return checkUpdateCount;
    }

    @NotNull
    public final String h() {
        return ntpServerAddress;
    }

    @Nullable
    public final Pair<String, Integer> i() {
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "get globalConfig productInfo...", null, null, 12, null);
        GlobalConfigControl globalConfigControl2 = globalConfigControl;
        if (globalConfigControl2 != null) {
            return globalConfigControl2.e();
        }
        return null;
    }

    public final boolean j() {
        return secondCheck;
    }

    @NotNull
    public final String k() {
        return techBackUpDomain;
    }

    public final long l() {
        return uploadIntervalTime;
    }

    public final void m(@NotNull Handler handler, final boolean isTest) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "init globalConfig starting... isTestDevice=[" + isTest + ']', null, null, 12, null);
        globalConfigControl = new GlobalConfigControl(-1L, isTest);
        d(isTest);
        handler.postDelayed(new Runnable() { // from class: com.oplus.aiunit.vision.nof
            @Override // java.lang.Runnable
            public final void run() {
                RemoteGlobalConfigManager.o(isTest);
            }
        }, 3000L);
    }

    public final boolean p(String str) {
        return (str.length() == 0) || Intrinsics.areEqual(str, "\"\"") || Intrinsics.areEqual(str, "null");
    }

    public final boolean q() {
        GlobalConfigControl globalConfigControl2 = globalConfigControl;
        if (globalConfigControl2 != null) {
            return globalConfigControl2.getIsTest();
        }
        return SharePreferenceHelper.h().getBoolean("enableScanTestDeviceMode", false) || GlobalConfigHelper.INSTANCE.d();
    }

    public final void r(@NotNull String productId, int version) {
        Intrinsics.checkNotNullParameter(productId, "productId");
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "notifyUpdate globalConfig...", null, null, 12, null);
        GlobalConfigControl globalConfigControl2 = globalConfigControl;
        if (globalConfigControl2 != null) {
            globalConfigControl2.h(productId, version);
        }
    }

    public final void s(List<GlobalConfigEntity> globalConfigList2) {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        for (GlobalConfigEntity globalConfigEntity : globalConfigList2) {
            concurrentHashMap.put(globalConfigEntity.getKey(), globalConfigEntity.getValue());
        }
        SDKConfig sDKConfigA = SDKConfig.INSTANCE.a(concurrentHashMap);
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", sDKConfigA.toString(), null, null, 12, null);
        String str = "";
        if (!INSTANCE.p(sDKConfigA.getUploadHost())) {
            try {
                String strB = hka.INSTANCE.a(sDKConfigA.getUploadHost()).b(l5k.f(null, 1, null).getValue());
                if (strB == null) {
                    strB = "";
                }
                bizBackupDomain = strB;
                h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager$parseConfig$2$1
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "globalConfig parse bizBackupDomain success = [" + RemoteGlobalConfigManager.INSTANCE.f() + ']', null, null, 12, null);
                    }
                });
            } catch (JSONException e2) {
                Logger.d(k6k.e(), "RemoteGlobalConfigManager", "globalConfig parse bizBackupDomain error: " + e2, null, null, 12, null);
            }
        }
        if (!INSTANCE.p(sDKConfigA.getUploadHostForTech())) {
            try {
                String strB2 = hka.INSTANCE.a(sDKConfigA.getUploadHostForTech()).b(l5k.f(null, 1, null).getValue());
                if (strB2 == null) {
                    strB2 = "";
                }
                techBackUpDomain = strB2;
                h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager$parseConfig$2$2
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "globalConfig parse techBackUpDomain success = [" + RemoteGlobalConfigManager.INSTANCE.k() + ']', null, null, 12, null);
                    }
                });
            } catch (JSONException e3) {
                Logger.d(k6k.e(), "RemoteGlobalConfigManager", "globalConfig parse techBackUpDomain error: " + e3, null, null, 12, null);
            }
        }
        if (!INSTANCE.p(sDKConfigA.getNtpHost())) {
            try {
                String strB3 = hka.INSTANCE.a(sDKConfigA.getNtpHost()).b(l5k.f(null, 1, null).getValue());
                if (strB3 != null) {
                    str = strB3;
                }
                ntpServerAddress = str;
                h78.a(new Function0<Unit>() { // from class: com.oplus.nearx.track.internal.remoteconfig.RemoteGlobalConfigManager$parseConfig$2$3
                    @Override // p010kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        Logger.b(k6k.e(), "RemoteGlobalConfigManager", "globalConfig parse ntpHost success = [" + RemoteGlobalConfigManager.INSTANCE.h() + ']', null, null, 12, null);
                    }
                });
            } catch (JSONException e4) {
                Logger.d(k6k.e(), "RemoteGlobalConfigManager", "globalConfig parse ntpHost error: " + e4, null, null, 12, null);
            }
        }
        uploadIntervalTime = RangesKt___RangesKt.coerceAtLeast(sDKConfigA.getUploadIntervalTime(), 1000L);
    }

    public final void t(@NotNull Handler handler) {
        Intrinsics.checkNotNullParameter(handler, "handler");
        Logger.b(k6k.e(), "RemoteGlobalConfigManager", " reInitRemoteGlobalConfig", null, null, 12, null);
        bizBackupDomain = "";
        techBackUpDomain = "";
        ntpServerAddress = "";
        if (!globalConfigList.isEmpty()) {
            s(globalConfigList);
            return;
        }
        GlobalConfigControl globalConfigControl2 = globalConfigControl;
        if (globalConfigControl2 != null) {
            globalConfigControl2.i();
        }
        n(this, handler, false, 2, null);
    }

    public final void u(@Nullable ynf callback) {
        remoteConfigCallback = callback;
    }

    public final void v(List<GlobalConfigEntity> list) {
        s(list);
    }
}
