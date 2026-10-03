package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@cdb
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004H\u0016¨\u0006\u0007"}, d2 = {"Lcom/oplus/aiunit/vision/k62;", "Lcom/oplus/aiunit/vision/jf0;", "", "J0", "", "kotlin.jvm.PlatformType", "b5", "heybreeno_impl_release"}, k = 1, mv = {1, 8, 0})
public interface k62 extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nBreenoAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BreenoAbility.kt\ncom/heytap/health/watch/heybreeno/ability/BreenoAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,39:1\n30#2,5:40\n30#2,5:45\n*S KotlinDebug\n*F\n+ 1 BreenoAbility.kt\ncom/heytap/health/watch/heybreeno/ability/BreenoAbility$DefaultImpls\n*L\n28#1:40,5\n32#1:45,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static String a(@NotNull k62 k62Var) {
            if (k62Var instanceof DeviceModel) {
                return ((DeviceModel) k62Var).fa() ? zv8.b.BREENO_SKILL_URL_BAND2 : zv8.b.BREENO_SKILL_URL;
            }
            throw new RuntimeException(k62Var + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull k62 k62Var) {
            if (k62Var instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) k62Var;
                return deviceModel.fa() && deviceModel.ea();
            }
            throw new RuntimeException(k62Var + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean J0();

    String b5();
}
