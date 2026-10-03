package com.heytap.health.rpc.host;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.ilj;
import com.oplus.aiunit.vision.qe0;
import com.oplus.aiunit.vision.t5i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.ArraysKt___ArraysKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/heytap/health/rpc/host/c;", "", "Companion", "a", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
public interface c {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;
    public static final int HEADSET_APP_ID = 1;
    public static final int PTC2_APP_ID = 3;
    public static final int PTC_APP_ID = 2;
    public static final int TEST_APP_ID = 9527;
    public static final int UNKNOWN_APP_ID = 0;

    /* JADX INFO: renamed from: com.heytap.health.rpc.host.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u001b\u0010\t\u001a\u00020\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0007R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0011¨\u0006\u0018"}, d2 = {"Lcom/heytap/health/rpc/host/c$a;", "", "", "appId", "Landroid/content/Intent;", "b", "", "", "arrays", "c", "([Ljava/lang/String;)I", "Landroid/content/Context;", "context", "packageName", "", "a", "UNKNOWN_APP_ID", "I", "HEADSET_APP_ID", "PTC_APP_ID", "PTC2_APP_ID", "TEST_APP_ID", "<init>", "()V", "lib_rpc_host_release"}, k = 1, mv = {1, 8, 0})
    @SourceDebugExtension({"SMAP\nRpcConstants.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RpcConstants.kt\ncom/heytap/health/rpc/host/RpcConstants$Companion\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,165:1\n1#2:166\n*E\n"})
    public static final class Companion {
        public static final int HEADSET_APP_ID = 1;
        public static final int PTC2_APP_ID = 3;
        public static final int PTC_APP_ID = 2;
        public static final int TEST_APP_ID = 9527;
        public static final int UNKNOWN_APP_ID = 0;
        public static final /* synthetic */ Companion a = new Companion();

        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        public final boolean a(@NotNull Context context, @NotNull String packageName) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(packageName, "packageName");
            switch (packageName.hashCode()) {
                case -1531668541:
                    if (packageName.equals("com.oneplus.twspods")) {
                        return com.heytap.health.rpc.b.INSTANCE.b(context, packageName, "23:52:7E:F3:0C:2E:B1:07:DC:50:D2:80:07:94:B5:D5:8E:60:67:FC");
                    }
                    break;
                case 694226114:
                    if (packageName.equals("com.coloros.oppopods")) {
                        return com.heytap.health.rpc.b.INSTANCE.b(context, packageName, "16:EC:BD:5B:FA:0C:96:01:D5:D4:69:DC:2A:E4:99:39:C5:40:6C:FC");
                    }
                    break;
                case 991426105:
                    if (packageName.equals("com.example.rcpclient")) {
                        if (!qe0.z()) {
                            a7b.f(com.heytap.health.rpc.c.TAG, "Calling app for test.");
                            return true;
                        }
                    }
                    return false;
                case 1386168760:
                    if (packageName.equals("com.heytap.accessory")) {
                        com.heytap.health.rpc.b.Companion companion = com.heytap.health.rpc.b.INSTANCE;
                        if (companion.b(context, packageName, "57:15:2B:DF:BA:78:F4:35:FA:88:45:85:FD:F2:85:96:84:BA:03:16") || companion.b(context, packageName, "F2:DF:69:3B:EB:D9:05:1E:0A:EA:6F:2C:43:0D:E4:EE:09:86:76:46")) {
                            return true;
                        }
                    }
                    return false;
                case 1856615545:
                    if (packageName.equals("com.oplus.linker")) {
                        return com.heytap.health.rpc.b.INSTANCE.b(context, packageName, "F2:DF:69:3B:EB:D9:05:1E:0A:EA:6F:2C:43:0D:E4:EE:09:86:76:46");
                    }
                    break;
                case 1881494850:
                    if (packageName.equals(t5i.PKG_MELODY)) {
                        return com.heytap.health.rpc.b.INSTANCE.b(context, packageName, "F2:C2:2D:4C:31:23:73:EB:29:0E:C4:42:C5:3E:99:BA:3A:F5:A8:49");
                    }
                    break;
            }
            a7b.m(com.heytap.health.rpc.c.TAG, "Calling app error for " + packageName);
            return false;
        }

        @Nullable
        public final Intent b(int appId) {
            if (appId == 1) {
                Intent intent = new Intent("com.oplus.melody.rpc.action.RPC_SERVICE");
                int iL = ilj.l();
                if (iL >= 23) {
                    intent.setPackage(t5i.PKG_MELODY);
                } else if (iL > 0) {
                    intent.setPackage("com.coloros.oppopods");
                } else if (Build.VERSION.SDK_INT < 30 || !ilj.t()) {
                    a7b.b(com.heytap.health.rpc.c.TAG, "Unknown headset package name");
                } else {
                    intent.setPackage("com.oneplus.twspods");
                }
                return intent;
            }
            if (appId == 2) {
                Intent intent2 = new Intent("com.heytap.accessory.rpc.action.RPC_SERVICE");
                intent2.setPackage("com.heytap.accessory");
                return intent2;
            }
            if (appId == 3) {
                Intent intent3 = new Intent("com.heytap.accessory.rpc.action.RPC_SERVICE");
                intent3.setPackage("com.oplus.linker");
                return intent3;
            }
            if (qe0.z() || appId != 9527) {
                return null;
            }
            Intent intent4 = new Intent("com.example.rcpclient.action.RPC_SERVICE");
            intent4.setPackage("com.example.rcpclient");
            return intent4;
        }

        public final int c(@NotNull String[] arrays) {
            Intrinsics.checkNotNullParameter(arrays, "arrays");
            if (ArraysKt___ArraysKt.contains(arrays, t5i.PKG_MELODY) || ArraysKt___ArraysKt.contains(arrays, "com.coloros.oppopods") || ArraysKt___ArraysKt.contains(arrays, "com.oneplus.twspods")) {
                return 1;
            }
            if (ArraysKt___ArraysKt.contains(arrays, "com.heytap.accessory")) {
                return 2;
            }
            if (ArraysKt___ArraysKt.contains(arrays, "com.oplus.linker")) {
                return 3;
            }
            return (qe0.z() || !ArraysKt___ArraysKt.contains(arrays, "com.example.rcpclient")) ? 0 : 9527;
        }
    }
}
