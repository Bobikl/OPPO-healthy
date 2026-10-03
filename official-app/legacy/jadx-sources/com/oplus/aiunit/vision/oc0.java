package com.oplus.aiunit.vision;

import com.heytap.health.base.view.exceptionview.DevicePageType;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.heytap.log.formatter.LogFieldKey;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\bf\u0018\u0000 \t2\u00020\u0001:\u0001\nJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\b\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"Lcom/oplus/aiunit/vision/oc0;", "Lcom/oplus/aiunit/vision/if0;", "", "v7", "Lcom/heytap/health/base/view/exceptionview/DevicePageType;", "O", "", LogFieldKey.LEVEL_KEY, "D2", "Inner", "b", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
public interface oc0 extends if0 {
    public static final int FLAG_DISCONNECT = 1;
    public static final int FLAG_NORMAL = 0;
    public static final int FLAG_NOTMAINMODULE = 2;

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nAppStoreAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppStoreAbility.kt\ncom/heytap/health/device_app_store/impl/appstore/ability/AppStoreAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,50:1\n30#2,5:51\n30#2,5:56\n37#2,5:61\n37#2,5:66\n*S KotlinDebug\n*F\n+ 1 AppStoreAbility.kt\ncom/heytap/health/device_app_store/impl/appstore/ability/AppStoreAbility$DefaultImpls\n*L\n29#1:51,5\n33#1:56,5\n37#1:61,5\n47#1:66,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static int a(@NotNull oc0 oc0Var) {
            if (oc0Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) oc0Var;
                if (deviceInfo.Na()) {
                    return !deviceInfo.Pa() ? 2 : 0;
                }
                return 1;
            }
            throw new RuntimeException(oc0Var + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static DevicePageType b(@NotNull oc0 oc0Var) {
            if (oc0Var instanceof DeviceModel) {
                return ((DeviceModel) oc0Var).n9();
            }
            throw new RuntimeException(oc0Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull oc0 oc0Var) {
            if (oc0Var instanceof DeviceModel) {
                return ((DeviceModel) oc0Var).M9();
            }
            throw new RuntimeException(oc0Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean d(@NotNull oc0 oc0Var) {
            if (oc0Var instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) oc0Var;
                return deviceInfo.T9() || deviceInfo.ha();
            }
            throw new RuntimeException(oc0Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.oc0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0005\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0014\u0010\u0006\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/oc0$b;", "", "", "FLAG_NORMAL", "I", "FLAG_DISCONNECT", "FLAG_NOTMAINMODULE", "<init>", "()V", "device_app_store_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final int FLAG_DISCONNECT = 1;
        public static final int FLAG_NORMAL = 0;
        public static final int FLAG_NOTMAINMODULE = 2;
        public static final /* synthetic */ Companion a = new Companion();
    }

    boolean D2();

    @NotNull
    DevicePageType O();

    int l();

    boolean v7();
}
