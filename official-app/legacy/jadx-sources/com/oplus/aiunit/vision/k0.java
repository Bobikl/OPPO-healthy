package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.core.data.ServiceType;
import com.opos.process.bridge.base.BridgeConstant;
import io.protostuff.MapSchema;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Deprecated;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.ReplaceWith;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;
import p010kotlin.text.StringsKt__StringNumberConversionsKt;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b,\u0010-J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u001a\u0010\f\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0002H\u0007J\u0018\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0007J$\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007J$\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007J\b\u0010\u0015\u001a\u00020\nH\u0007J\u0018\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u000eH\u0007J\u0010\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0010\u0010\u001a\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0010\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0010\u0010\u001c\u001a\u00020\u00052\u0006\u0010\u0018\u001a\u00020\nH\u0007J\u0010\u0010\u001d\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0007R\u0014\u0010\u001e\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010!\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010\"\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\"\u0010\u001fR\u0014\u0010#\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b#\u0010\u001fR\u0014\u0010$\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b$\u0010\u001fR\u0014\u0010%\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b%\u0010\u001fR\u0014\u0010&\u001a\u00020\n8\u0006X\u0086T¢\u0006\u0006\n\u0004\b&\u0010\u001fR \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0018\u0010+\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010*¨\u0006."}, d2 = {"Lcom/oplus/aiunit/vision/k0;", "", "Landroid/content/Context;", "context", "Lkotlin/Pair;", "", "Lcom/oplus/aiunit/core/data/ServiceType;", b2n.g, "a", LogFieldKey.MESSAGE_KEY, "", "minVersionCode", "j", "i", "", "detectName", LogFieldKey.PROCESS_NAME_KEY, "Landroid/os/Bundle;", BridgeConstant.KEY_EXTRAS, LogFieldKey.LEVEL_KEY, MapSchema.FIELD_NAME_ENTRY, "b", "compatPkg", "d", "protocol", "f", b2n.f, "n", "o", "c", "PROTOCOL_VERSION_AIGC_CLOUD", "I", "PROTOCOL_VERSION_AIGC_LOCAL", "PROTOCOL_VERSION_AIGC_SUMMARY_LOCAL", "PROTOCOL_VERSION_AIGC_EXP", "PROTOCOL_VERSION_GLOBAL_DEP", "PROTOCOL_VERSION_RECORD_SUMMARY", "PROTOCOL_TEL_AI", "PROTOCOL_AI_SUB_SYS", "Ljava/util/concurrent/ConcurrentHashMap;", "Ljava/util/concurrent/ConcurrentHashMap;", "observerMap", "Lcom/oplus/aiunit/core/data/ServiceType;", "serviceType", "<init>", "()V", "aiunit.sdk.toolkits_release"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension({"SMAP\nAIProtocol.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AIProtocol.kt\ncom/oplus/aiunit/core/protocol/AIProtocol\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,416:1\n1#2:417\n*E\n"})
public final class k0 {
    public static final int PROTOCOL_AI_SUB_SYS = 200;
    public static final int PROTOCOL_TEL_AI = 143;
    public static final int PROTOCOL_VERSION_AIGC_CLOUD = 130;
    public static final int PROTOCOL_VERSION_AIGC_EXP = 133;
    public static final int PROTOCOL_VERSION_AIGC_LOCAL = 131;
    public static final int PROTOCOL_VERSION_AIGC_SUMMARY_LOCAL = 132;
    public static final int PROTOCOL_VERSION_GLOBAL_DEP = 140;
    public static final int PROTOCOL_VERSION_RECORD_SUMMARY = 141;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @Nullable
    public static volatile ServiceType serviceType;

    @NotNull
    public static final k0 INSTANCE = new k0();

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public static final ConcurrentHashMap<String, Object> observerMap = new ConcurrentHashMap<>();

    /* JADX WARN: Code duplicated, block: B:19:0x0083  */
    @JvmStatic
    @NotNull
    public static final ServiceType a(@NotNull Context context) {
        ServiceType serviceType2;
        Intrinsics.checkNotNullParameter(context, "context");
        ServiceType serviceType3 = serviceType;
        if (serviceType3 != null) {
            return serviceType3;
        }
        Pair<Boolean, ServiceType> pairH = h(context);
        if (pairH.getFirst().booleanValue()) {
            return pairH.getSecond();
        }
        boolean zK = k(context, 0, 2, null);
        boolean zI = i(context);
        i0.a("AIProtocol", "acquireServiceType: isAIUnitSupport = " + zK + ", isOcrSupport = " + zI);
        if (zK) {
            if (!v70.c() && zI) {
                int iG = p0.g(context, "com.oplus.aiunit");
                int iG2 = p0.g(context, "com.coloros.ocrservice");
                i0.a("AIProtocol", "acquireServiceType [ai = " + iG + ", ocr = " + iG2 + ']');
                if (iG < iG2) {
                    serviceType2 = ServiceType.OCRSERVICE;
                }
            }
            serviceType2 = ServiceType.AIUNIT;
        } else if (zI) {
            serviceType2 = ServiceType.OCRSERVICE;
        } else {
            serviceType2 = ServiceType.NONE;
        }
        serviceType = serviceType2;
        ServiceType serviceType4 = serviceType;
        return serviceType4 == null ? ServiceType.NONE : serviceType4;
    }

    @JvmStatic
    public static final int b() {
        return 207;
    }

    @JvmStatic
    @NotNull
    public static final Bundle c(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Bundle bundle = new Bundle();
        bundle.putInt("package::sdk_version", b());
        bundle.putInt("ai::key::client_protocol", b());
        bundle.putInt("package::unit_api_level", 207);
        bundle.putString("package::sdk_version_name", "2.0.7-betad58795f");
        bundle.putString("package::auth_style", sm0.b(context));
        bundle.putString("package::package_name", context.getPackageName());
        bundle.putInt("package::client_pid", Process.myPid());
        bundle.putInt("package::client_uid", Process.myUid());
        bundle.putBoolean("ai::key::download_enable", p0.b(context));
        bundle.putString("ai::key::download_group", p0.c(context));
        bundle.putLong("package::package_version", p0.f(context));
        bundle.putInt("package::core_sdk_version", p0.a(context));
        return bundle;
    }

    @JvmStatic
    public static final int d(@NotNull Context context, @NotNull String compatPkg) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(compatPkg, "compatPkg");
        try {
            Integer intOrNull = StringsKt__StringNumberConversionsKt.toIntOrNull(p0.e(context, compatPkg, "protocol_version_codes"));
            iIntValue = intOrNull != null ? intOrNull.intValue() : -1;
        } catch (Exception unused) {
        }
        i0.f("AIProtocol", "getServiceVersion = " + iIntValue + " for " + compatPkg);
        return iIntValue;
    }

    @JvmStatic
    public static final int e(@NotNull Context context, @NotNull String detectName, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        return l0.e(context, detectName, extras);
    }

    @JvmStatic
    public static final boolean f(int protocol) {
        return protocol >= 130;
    }

    @JvmStatic
    public static final boolean g(int protocol) {
        return protocol >= 131;
    }

    @JvmStatic
    @NotNull
    public static final Pair<Boolean, ServiceType> h(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        String packageName = context.getPackageName();
        if (Intrinsics.areEqual(packageName, "com.oplus.aiunit")) {
            return new Pair<>(Boolean.TRUE, ServiceType.AIUNIT);
        }
        return Intrinsics.areEqual(packageName, "com.coloros.ocrservice") ? new Pair<>(Boolean.TRUE, ServiceType.OCRSERVICE) : new Pair<>(Boolean.FALSE, ServiceType.NONE);
    }

    @JvmStatic
    public static final boolean i(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (v70.a()) {
            return p0.i(context, "com.coloros.ocrservice");
        }
        i0.c("AIProtocol", "sdk version is below P!");
        return false;
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean j(@NotNull Context context, int minVersionCode) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (v70.a()) {
            return p0.g(context, "com.oplus.aiunit") >= minVersionCode;
        }
        i0.c("AIProtocol", "sdk version is below P!");
        return false;
    }

    public static /* synthetic */ boolean k(Context context, int i, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            i = 400001;
        }
        return j(context, i);
    }

    @JvmStatic
    @JvmOverloads
    public static final boolean l(@NotNull Context context, @NotNull String detectName, @Nullable Bundle extras) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        return l0.f(context, detectName, extras);
    }

    @JvmStatic
    public static final boolean m(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return j(context, 400001) || i(context);
    }

    @JvmStatic
    public static final boolean n(int protocol) {
        return protocol >= 140;
    }

    @JvmStatic
    public static final boolean o(int protocol) {
        return protocol >= 143;
    }

    @Deprecated(message = "no use", replaceWith = @ReplaceWith(expression = "isDetectSupported", imports = {}))
    @JvmStatic
    public static final boolean p(@NotNull Context context, @NotNull String detectName) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(detectName, "detectName");
        ServiceType serviceTypeA = a(context);
        if (serviceTypeA != ServiceType.NONE) {
            return f2f.INSTANCE.c(context, detectName, serviceTypeA);
        }
        return false;
    }
}
