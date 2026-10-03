package com.oplus.aiunit.vision;

import com.oppo.wear.wallet.proto.IccoaDkfConstant$IccoaDkDatabean;
import java.time.ZoneId;
import java.util.Date;
import org.iccoa.android.digitalkey.DigitalKeyData;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\n\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¨\u0006\u0003"}, d2 = {"Lcom/oppo/wear/wallet/proto/IccoaDkfConstant$IccoaDkDatabean;", "Lorg/iccoa/android/digitalkey/DigitalKeyData;", "a", "entrance_release"}, k = 2, mv = {1, 8, 0})
public final class my6 {
    /* JADX WARN: Type inference failed for: r6v0, types: [java.time.LocalDateTime] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.time.LocalDateTime] */
    @NotNull
    public static final DigitalKeyData a(@NotNull IccoaDkfConstant$IccoaDkDatabean iccoaDkfConstant$IccoaDkDatabean) {
        Intrinsics.checkNotNullParameter(iccoaDkfConstant$IccoaDkDatabean, "<this>");
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        return new DigitalKeyData(iccoaDkfConstant$IccoaDkDatabean.getVehicleId().toByteArray(), iccoaDkfConstant$IccoaDkDatabean.getKeyId().toByteArray(), iccoaDkfConstant$IccoaDkDatabean.getFriendlyName(), new Date(iccoaDkfConstant$IccoaDkDatabean.getStartDate()).toInstant().atZone(zoneIdSystemDefault).toLocalDateTime(), new Date(iccoaDkfConstant$IccoaDkDatabean.getEndDate()).toInstant().atZone(zoneIdSystemDefault).toLocalDateTime(), iccoaDkfConstant$IccoaDkDatabean.getKeyPrivilege(), iccoaDkfConstant$IccoaDkDatabean.getKeyTypeValue(), iccoaDkfConstant$IccoaDkDatabean.getStatusValue(), iccoaDkfConstant$IccoaDkDatabean.getVehicleOemId().toByteArray(), iccoaDkfConstant$IccoaDkDatabean.getVehicleModel(), iccoaDkfConstant$IccoaDkDatabean.getBrandId(), iccoaDkfConstant$IccoaDkDatabean.getImageUrl());
    }
}
