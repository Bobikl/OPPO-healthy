package com.heytap.health.blood.glucose.bean;

import android.annotation.SuppressLint;
import androidx.annotation.Keep;
import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.oplus.aiunit.vision.mq8;
import com.oplus.smartenginehelper.ParserTag;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0001¢\u0006\u0002\u0010\u0004J\b\u0010\u000b\u001a\u00020\fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/heytap/health/blood/glucose/bean/GluManualDataBean;", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "()V", "bloodSugar", "(Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;)V", ParserTag.VIEW_TYPE, "Lcom/heytap/health/blood/glucose/bean/ViewType;", "getViewType", "()Lcom/heytap/health/blood/glucose/bean/ViewType;", "setViewType", "(Lcom/heytap/health/blood/glucose/bean/ViewType;)V", "toString", "", "blood_glucose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ParcelCreator"})
public final class GluManualDataBean extends BloodSugar {

    @NotNull
    private ViewType viewType;

    public GluManualDataBean() {
        this.viewType = ViewType.CONTENT;
    }

    @NotNull
    public final ViewType getViewType() {
        return this.viewType;
    }

    public final void setViewType(@NotNull ViewType viewType) {
        Intrinsics.checkNotNullParameter(viewType, "<set-?>");
        this.viewType = viewType;
    }

    @Override // com.heytap.databaseengine.model.bloodsugar.BloodSugar, com.heytap.databaseengine.model.SportHealthData
    @NotNull
    public String toString() {
        return "GluManualDataBean(viewType=" + this.viewType + ", value=" + getValue() + ", dataCreatedTimestamp=" + mq8.INSTANCE.y(getDataCreatedTimestamp(), "yyy/MM/dd HH:mm:ss") + ")";
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GluManualDataBean(@NotNull BloodSugar bloodSugar) {
        super(bloodSugar.getSsoid(), bloodSugar.getDataClient(), bloodSugar.getClientModel(), bloodSugar.getType(), bloodSugar.getValue(), bloodSugar.getTrend(), bloodSugar.getDataCreatedTimestamp(), bloodSugar.getDisplay(), bloodSugar.getSyncStatus());
        Intrinsics.checkNotNullParameter(bloodSugar, "bloodSugar");
        this.viewType = ViewType.CONTENT;
    }
}
