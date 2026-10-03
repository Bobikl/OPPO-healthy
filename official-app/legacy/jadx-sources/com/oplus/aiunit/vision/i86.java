package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.health.healthecg.R$string;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0005"}, d2 = {"Lcom/oplus/aiunit/vision/i86;", "Lcom/oplus/aiunit/vision/if0;", "", "Lcom/oplus/aiunit/vision/qne;", "E4", "ecg_release"}, k = 1, mv = {1, 8, 0})
public interface i86 extends if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nECGAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ECGAbility.kt\ncom/heytap/health/healthecg/util/ECGAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,36:1\n37#2,5:37\n*S KotlinDebug\n*F\n+ 1 ECGAbility.kt\ncom/heytap/health/healthecg/util/ECGAbility$DefaultImpls\n*L\n27#1:37,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static List<qne> a(@NotNull i86 i86Var) {
            if (i86Var instanceof DeviceInfo) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(new qne((Drawable) null, qtf.l(R$string.health_ecg_del_record), false, true));
                arrayList.add(new qne((Drawable) null, qtf.l(R$string.health_ecg_description), false, true));
                if (((DeviceInfo) i86Var).Va()) {
                    arrayList.add(new qne((Drawable) null, qtf.l(com.heytap.health.base.R$string.lib_base_ecg_measure_mode), false, true));
                }
                return arrayList;
            }
            throw new RuntimeException(i86Var + " not is " + DeviceInfo.class.getCanonicalName());
        }
    }

    @NotNull
    List<qne> E4();
}
