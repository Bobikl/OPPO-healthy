package com.oplus.aiunit.vision;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bf\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0002H\u0016J\b\u0010\u0006\u001a\u00020\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/p64;", "Lcom/oplus/aiunit/vision/if0;", "", "a1", "W4", "E0", "G1", "Companion", "a", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0})
public interface p64 extends if0 {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.p64$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/p64$a;", "", "<init>", "()V", "contactnetnumber_impl_OPlusRelease"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nContactnectAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContactnectAbility.kt\ncom/heytap/health/watch/netnumber/ability/ContactnectAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,63:1\n37#2,5:64\n37#2,5:69\n37#2,5:74\n*S KotlinDebug\n*F\n+ 1 ContactnectAbility.kt\ncom/heytap/health/watch/netnumber/ability/ContactnectAbility$DefaultImpls\n*L\n41#1:64,5\n45#1:69,5\n49#1:74,5\n*E\n"})
    public static final class b {
        public static boolean a(@NotNull p64 p64Var) {
            Object objM5287constructorimpl;
            Boolean boolValueOf;
            PackageInfo packageInfo;
            ApplicationInfo applicationInfo;
            Bundle bundle;
            try {
                Result.Companion companion = Result.INSTANCE;
                PackageManager packageManager = b78.a().getPackageManager();
                if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.oplus.blacklistapp", 128)) == null || (applicationInfo = packageInfo.applicationInfo) == null || (bundle = applicationInfo.metaData) == null) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(bundle.getBoolean("wearable_health_support"));
                    a7b.f("BlockHealth.Ability", "isBlackListAppSupport " + boolValueOf.booleanValue());
                }
                objM5287constructorimpl = Result.m5287constructorimpl(boolValueOf);
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM5287constructorimpl = Result.m5287constructorimpl(ResultKt.createFailure(th));
            }
            Boolean bool = (Boolean) (Result.m5293isFailureimpl(objM5287constructorimpl) ? null : objM5287constructorimpl);
            if (bool != null) {
                return bool.booleanValue();
            }
            return false;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull p64 p64Var) {
            if (!p64Var.G1()) {
                return false;
            }
            if (p64Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) p64Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.X9() || deviceInfo.T9() || deviceInfo.ia() || deviceInfo.ja();
            }
            throw new RuntimeException(p64Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull p64 p64Var) {
            if (p64Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) p64Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.O9() || deviceInfo.T9() || deviceInfo.X9() || deviceInfo.ia() || deviceInfo.ja();
            }
            throw new RuntimeException(p64Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull p64 p64Var) {
            if (p64Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) p64Var;
                return deviceInfo.ka() || deviceInfo.ca() || deviceInfo.X9() || deviceInfo.T9() || deviceInfo.ia() || deviceInfo.ja();
            }
            throw new RuntimeException(p64Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    boolean E0();

    boolean G1();

    boolean W4();

    boolean a1();
}
