package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceInfo;
import com.heytap.wearable.devicemanager.bean.SyncCommonProto;
import java.util.Calendar;
import java.util.TimeZone;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u00012\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¨\u0006\b"}, d2 = {"Lcom/oplus/aiunit/vision/oxj;", "Lcom/oplus/aiunit/vision/pxj;", "Lcom/oplus/aiunit/vision/if0;", "", "Y4", "Lcom/heytap/wearable/devicemanager/bean/SyncCommonProto$TimeInfo$Builder;", "builder", "z5", "commonsync_impl_release"}, k = 1, mv = {1, 8, 0})
public interface oxj extends pxj, if0 {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nTimeAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeAbility.kt\ncom/heytap/health/watch/commonsync/ability/TimeAbility$DeviceInfo$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,64:1\n37#2,5:65\n37#2,5:70\n*S KotlinDebug\n*F\n+ 1 TimeAbility.kt\ncom/heytap/health/watch/commonsync/ability/TimeAbility$DeviceInfo$DefaultImpls\n*L\n42#1:65,5\n47#1:70,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static boolean a(@NotNull oxj oxjVar) {
            if (oxjVar instanceof DeviceInfo) {
                DeviceInfo deviceInfo = (DeviceInfo) oxjVar;
                return (deviceInfo.M9() && deviceInfo.Pa()) || deviceInfo.A9();
            }
            throw new RuntimeException(oxjVar + " not is " + DeviceInfo.class.getCanonicalName());
        }

        /* JADX WARN: Multi-variable type inference failed */
        @NotNull
        public static SyncCommonProto.TimeInfo.Builder b(@NotNull oxj oxjVar, @NotNull SyncCommonProto.TimeInfo.Builder builder) {
            Intrinsics.checkNotNullParameter(builder, "builder");
            if (!(oxjVar instanceof DeviceInfo)) {
                throw new RuntimeException(oxjVar + " not is " + DeviceInfo.class.getCanonicalName());
            }
            if (((DeviceInfo) oxjVar).A9()) {
                int offset = (Calendar.getInstance().getTimeZone().getOffset(System.currentTimeMillis()) / 1000) / 60;
                int i = offset / 60;
                String strValueOf = String.valueOf(Math.max(0, offset - (i * 60)));
                String strValueOf2 = String.valueOf(i);
                builder.setTimeZoneMin(strValueOf).setTimeZone(strValueOf2);
                StringBuilder sb = new StringBuilder();
                sb.append("requestTimeToWear: TimeZoneMin == ");
                sb.append(strValueOf);
                sb.append(";TimeZone == ");
                sb.append(strValueOf2);
            } else {
                builder.setTimeZone(TimeZone.getDefault().getID() == null ? "" : TimeZone.getDefault().getID());
            }
            return builder;
        }

        public static boolean c(@NotNull oxj oxjVar) {
            return pxj.a.a(oxjVar);
        }
    }

    boolean Y4();

    @NotNull
    SyncCommonProto.TimeInfo.Builder z5(@NotNull SyncCommonProto.TimeInfo.Builder builder);
}
