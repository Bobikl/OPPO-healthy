package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@cdb
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/pxj;", "Lcom/oplus/aiunit/vision/jf0;", "", "e2", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface pxj extends jf0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTimeAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeAbility.kt\ncom/heytap/health/watch/commonsync/ability/TimeAbility$Mode$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,64:1\n30#2,5:65\n*S KotlinDebug\n*F\n+ 1 TimeAbility.kt\ncom/heytap/health/watch/commonsync/ability/TimeAbility$Mode$DefaultImpls\n*L\n34#1:65,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull pxj pxjVar) {
            if (pxjVar instanceof DeviceModel) {
                DeviceModel deviceModel = (DeviceModel) pxjVar;
                return deviceModel.A9() || deviceModel.fa();
            }
            throw new RuntimeException(pxjVar + " not is " + DeviceModel.class.getCanonicalName());
        }
    }

    boolean e2();
}
