package com.oplus.aiunit.vision;

import com.heytap.health.device_manager_base.DeviceConstants;
import com.heytap.health.devicemanager.deviceability.DeviceModel;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J\b\u0010\u0004\u001a\u00020\u0002H\u0016J\u0018\u0010\b\u001a\u0012\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00020\u0006`\u0007H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/pkd;", "Lcom/oplus/aiunit/vision/jf0;", "", "e7", "m5", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "e3", "device_pair_release"}, k = 1, mv = {1, 8, 0})
public interface pkd extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nOobeBaseAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OobeBaseAbility.kt\ncom/heytap/health/device_pair/ability/OobeBaseModelAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,85:1\n30#2,5:86\n30#2,5:91\n30#2,5:96\n*S KotlinDebug\n*F\n+ 1 OobeBaseAbility.kt\ncom/heytap/health/device_pair/ability/OobeBaseModelAbility$DefaultImpls\n*L\n20#1:86,5\n24#1:91,5\n30#1:96,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static ArrayList<String> a(@NotNull pkd pkdVar) {
            if (pkdVar instanceof DeviceModel) {
                ArrayList<String> arrayList = new ArrayList<>();
                arrayList.add("android.permission.READ_CALENDAR");
                if (pkdVar.m5()) {
                    arrayList.add("android.permission.WRITE_CALENDAR");
                }
                return arrayList;
            }
            throw new RuntimeException(pkdVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean b(@NotNull pkd pkdVar) {
            if (pkdVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) pkdVar;
                return (deviceModel.Q9() || deviceModel.I9() || deviceModel.k0() || deviceModel.da()) ? false : true;
            }
            throw new RuntimeException(pkdVar + " not is " + DeviceModel.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static boolean c(@NotNull pkd pkdVar) {
            if (pkdVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) pkdVar;
                return !(!deviceModel.K9() || deviceModel.M9() || deviceModel.O9() || deviceModel.T9()) || (deviceModel.I9() && deviceModel.oa(DeviceConstants.BaseDevice.a.C0340b.INSTANCE));
            }
            throw new RuntimeException(pkdVar + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    @NotNull
    ArrayList<String> e3();

    boolean e7();

    boolean m5();
}
