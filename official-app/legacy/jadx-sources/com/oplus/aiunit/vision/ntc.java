package com.oplus.aiunit.vision;

import com.heytap.health.devicemanager.deviceability.DeviceModel;
import com.oplus.wearable.linkservice.sdk.Node;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@cdb
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bg\u0018\u0000 \u00072\u00020\u0001:\u0001\bJ\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002H\u0016¨\u0006\t"}, d2 = {"Lcom/oplus/aiunit/vision/ntc;", "Lcom/oplus/aiunit/vision/jf0;", "", "mainMac", "subMac", "Lcom/oplus/wearable/linkservice/sdk/Node;", "M3", "Inner", "b", "device_manager_release"}, k = 1, mv = {1, 8, 0})
public interface ntc extends jf0 {

    /* JADX INFO: renamed from: Inner, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.a;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @SourceDebugExtension({"SMAP\nNodeAbility.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/NodeAbility$DefaultImpls\n+ 2 DeviceUtils.kt\ncom/heytap/health/devicemanager/util/DeviceUtilsKt\n*L\n1#1,60:1\n30#2,5:61\n*S KotlinDebug\n*F\n+ 1 NodeAbility.kt\ncom/heytap/health/devicemanager/deviceability/ability/NodeAbility$DefaultImpls\n*L\n37#1:61,5\n*E\n"})
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @Nullable
        public static Node a(@NotNull ntc ntcVar, @Nullable String str, @Nullable String str2) {
            if (!(ntcVar instanceof DeviceModel)) {
                throw new RuntimeException(ntcVar + " not is " + DeviceModel.class.getCanonicalName());
            }
            DeviceModel deviceModel = (DeviceModel) ntcVar;
            if (deviceModel.k0()) {
                return wtc.a(9, str);
            }
            boolean z = true;
            if (deviceModel.M9()) {
                return wtc.b(1, str, 2, str2);
            }
            if (deviceModel.L9()) {
                return wtc.a(4, str);
            }
            if (deviceModel.A9()) {
                return wtc.a(3, str);
            }
            if (deviceModel.J9()) {
                return wtc.a(8, str);
            }
            if (deviceModel.D9()) {
                return wtc.a(6, str);
            }
            if (deviceModel.B9()) {
                return wtc.a(7, str);
            }
            if (!qe0.E()) {
                String strY4 = deviceModel.y4();
                if (strY4 != null && strY4.length() != 0) {
                    z = false;
                }
                if (!z) {
                    y0k.h("curr model:" + deviceModel.y4() + " not support!!!");
                }
            }
            ml4.c("NodeAbility", "getNode is null");
            return null;
        }
    }

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.ntc$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/ntc$b;", "", "<init>", "()V", "device_manager_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public static final /* synthetic */ Companion a = new Companion();
    }

    @Nullable
    Node M3(@Nullable String mainMac, @Nullable String subMac);
}
