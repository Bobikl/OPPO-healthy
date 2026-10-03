package com.heytap.health.settings.me.upgrade;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.aiunit.vision.fkj;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/settings/me/upgrade/SauSettingBean;", "", "switchType", "", fkj.PARAM_SWITCH_STATUS, "(II)V", "getSwitchStatus", "()I", "getSwitchType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "settings_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class SauSettingBean {
    public static final int $stable = 0;
    private final int switchStatus;
    private final int switchType;

    public SauSettingBean(int i, int i2) {
        this.switchType = i;
        this.switchStatus = i2;
    }

    public static /* synthetic */ SauSettingBean copy$default(SauSettingBean sauSettingBean, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = sauSettingBean.switchType;
        }
        if ((i3 & 2) != 0) {
            i2 = sauSettingBean.switchStatus;
        }
        return sauSettingBean.copy(i, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getSwitchType() {
        return this.switchType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    @NotNull
    public final SauSettingBean copy(int switchType, int switchStatus) {
        return new SauSettingBean(switchType, switchStatus);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SauSettingBean)) {
            return false;
        }
        SauSettingBean sauSettingBean = (SauSettingBean) other;
        return this.switchType == sauSettingBean.switchType && this.switchStatus == sauSettingBean.switchStatus;
    }

    public final int getSwitchStatus() {
        return this.switchStatus;
    }

    public final int getSwitchType() {
        return this.switchType;
    }

    public int hashCode() {
        return (Integer.hashCode(this.switchType) * 31) + Integer.hashCode(this.switchStatus);
    }

    @NotNull
    public String toString() {
        return "SauSettingBean(switchType=" + this.switchType + ", switchStatus=" + this.switchStatus + ")";
    }
}
