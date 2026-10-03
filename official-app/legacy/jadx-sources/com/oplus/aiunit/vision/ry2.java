package com.oplus.aiunit.vision;

import com.oplus.carlink.controlsdk.data.CarInfo;
import com.oplus.carlink.controlsdk.data.CarStatus;
import com.oplus.carlink.controlsdk.data.ControlInstruction;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000\u001a\n\u0010\u0004\u001a\u00020\u0001*\u00020\u0003¨\u0006\u0005"}, d2 = {"Lcom/oplus/carlink/controlsdk/data/CarStatus;", "", "b", "Lcom/oplus/carlink/controlsdk/data/CarInfo;", "a", "voiceassistant_impl_release"}, k = 2, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nCarBeanWrap.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CarBeanWrap.kt\ncom/heytap/health/voiceassistant/car/CarBeanWrapKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,79:1\n1855#2,2:80\n*S KotlinDebug\n*F\n+ 1 CarBeanWrap.kt\ncom/heytap/health/voiceassistant/car/CarBeanWrapKt\n*L\n18#1:80,2\n*E\n"})
public final class ry2 {
    public static final void a(@NotNull CarInfo carInfo) {
        Intrinsics.checkNotNullParameter(carInfo, "<this>");
        String str = carInfo.carId;
        String str2 = carInfo.companyId;
        Boolean bool = carInfo.isCurrentCar;
        String str3 = carInfo.name;
        StringBuilder sb = new StringBuilder();
        sb.append("CarInfo: ");
        sb.append(str);
        sb.append(" ");
        sb.append(str2);
        sb.append(" ");
        sb.append(bool);
        sb.append(" ");
        sb.append(str3);
        sb.append("}");
    }

    public static final void b(@NotNull CarStatus carStatus) {
        Intrinsics.checkNotNullParameter(carStatus, "<this>");
        StringBuilder sb = new StringBuilder();
        List<ControlInstruction> list = carStatus.availableInstructions;
        Intrinsics.checkNotNullExpressionValue(list, "this.availableInstructions");
        for (ControlInstruction controlInstruction : list) {
            sb.append(controlInstruction.name + " " + controlInstruction.instruction + " ");
        }
        String str = carStatus.carId;
        String str2 = carStatus.companyId;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("CarStatus: ");
        sb2.append(str);
        sb2.append(" ");
        sb2.append(str2);
        sb2.append(" ");
        sb2.append((Object) sb);
        sb2.append("}");
    }
}
