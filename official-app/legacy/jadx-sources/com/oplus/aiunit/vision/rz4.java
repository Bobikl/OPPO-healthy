package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.text.GsonUtil;
import com.heytap.sports.partner.bean.PartnerDetail;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¨\u0006\u0006"}, d2 = {"Lcom/oplus/aiunit/vision/rz4;", "", "Lcom/heytap/sports/partner/bean/PartnerDetail;", "a", "<init>", "()V", "partner_release"}, k = 1, mv = {1, 8, 0})
public final class rz4 {
    public static final int $stable = 0;

    @NotNull
    public static final rz4 INSTANCE = new rz4();

    @Nullable
    public final PartnerDetail a() {
        return (PartnerDetail) GsonUtil.a(v9g.x("PARTNER").D("MAIN_DETAIL_DATA"), PartnerDetail.class);
    }
}
