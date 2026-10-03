package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.assistantscreen.ControlCenter;
import com.oplus.cardwidget.domain.pack.BaseDataPack;
import com.oplus.smartenginehelper.dsl.DSLCoder;
import org.jetbrains.annotations.NotNull;
import org.json.JSONException;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"Lcom/oplus/aiunit/vision/wv8;", "Lcom/oplus/cardwidget/domain/pack/BaseDataPack;", "Lcom/oplus/smartenginehelper/dsl/DSLCoder;", "coder", "", "onPack", "Lcom/oplus/aiunit/vision/xv8;", "a", "Lcom/oplus/aiunit/vision/xv8;", "data", "<init>", "(Lcom/oplus/aiunit/vision/xv8;)V", "health_impl_release"}, k = 1, mv = {1, 8, 0})
public final class wv8 extends BaseDataPack {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @NotNull
    public final HealthUnauthorizedData data;

    public wv8(@NotNull HealthUnauthorizedData data) {
        Intrinsics.checkNotNullParameter(data, "data");
        this.data = data;
    }

    @Override // com.oplus.cardwidget.domain.pack.BaseDataPack
    public boolean onPack(@NotNull DSLCoder coder) throws JSONException {
        Intrinsics.checkNotNullParameter(coder, "coder");
        a7b.f(ControlCenter.TAG, "onPack");
        HealthUnauthorizedData healthUnauthorizedData = this.data;
        StringBuilder sb = new StringBuilder();
        sb.append("onPack, current unauthorized: ");
        sb.append(healthUnauthorizedData);
        coder.setCustomData("health_unauthorized_view", "title", this.data.getTitle());
        coder.setCustomData("health_unauthorized_view", "noCurDataTip", this.data.getNoCurDataTip());
        coder.setCustomData("health_unauthorized_view", "authorizedTip", this.data.getAuthorizedTip());
        return true;
    }
}
