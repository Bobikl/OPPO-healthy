package com.heytap.health.cervical_vertebra.datamodel;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes15.dex */
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/cervical_vertebra/datamodel/MobilityRequestBean;", "", "detectType", "", "action", "(II)V", "getAction", "()I", "getDetectType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "cervical_vertebra_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MobilityRequestBean {
    private final int action;
    private final int detectType;

    public MobilityRequestBean(int i, int i2) {
        this.detectType = i;
        this.action = i2;
    }

    public static /* synthetic */ MobilityRequestBean copy$default(MobilityRequestBean mobilityRequestBean, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = mobilityRequestBean.detectType;
        }
        if ((i3 & 2) != 0) {
            i2 = mobilityRequestBean.action;
        }
        return mobilityRequestBean.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getDetectType() {
        return this.detectType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getAction() {
        return this.action;
    }

    @NotNull
    public final MobilityRequestBean copy(int detectType, int action) {
        return new MobilityRequestBean(detectType, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MobilityRequestBean)) {
            return false;
        }
        MobilityRequestBean mobilityRequestBean = (MobilityRequestBean) other;
        return this.detectType == mobilityRequestBean.detectType && this.action == mobilityRequestBean.action;
    }

    public final int getAction() {
        return this.action;
    }

    public final int getDetectType() {
        return this.detectType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.detectType) * 31) + Integer.hashCode(this.action);
    }

    @NotNull
    public String toString() {
        return "MobilityRequestBean(detectType=" + this.detectType + ", action=" + this.action + ")";
    }
}
