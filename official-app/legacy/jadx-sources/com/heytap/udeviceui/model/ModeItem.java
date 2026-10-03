package com.heytap.udeviceui.model;

import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0013\u0010!\u001a\u00020\u00042\b\u0010\"\u001a\u0004\u0018\u00010#H\u0096\u0002J\b\u0010$\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u000f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0010\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\b¨\u0006%"}, d2 = {"Lcom/heytap/udeviceui/model/ModeItem;", "Ljava/io/Serializable;", "()V", ViewEntity.ENABLED, "", "getEnabled", "()Z", ClickApiEntity.SET_ENABLED, "(Z)V", "icon", "", "getIcon", "()Ljava/lang/Integer;", "setIcon", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "isLoading", "setLoading", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "needLoading", "getNeedLoading", "setNeedLoading", "selected", "getSelected", "setSelected", "singlePress", "getSinglePress", "setSinglePress", "equals", "other", "", "toString", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public class ModeItem implements Serializable {
    private boolean enabled = true;

    @Nullable
    private Integer icon;
    private boolean isLoading;

    @Nullable
    private String name;
    private boolean needLoading;
    private boolean selected;
    private boolean singlePress;

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ModeItem)) {
            return false;
        }
        ModeItem modeItem = (ModeItem) other;
        return Intrinsics.areEqual(this.icon, modeItem.icon) && StringsKt__StringsJVMKt.equals$default(this.name, modeItem.name, false, 2, null) && this.selected == modeItem.selected && this.needLoading == modeItem.needLoading && this.singlePress == modeItem.singlePress && this.isLoading == modeItem.isLoading && this.enabled == modeItem.enabled;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Integer getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final boolean getNeedLoading() {
        return this.needLoading;
    }

    public final boolean getSelected() {
        return this.selected;
    }

    public final boolean getSinglePress() {
        return this.singlePress;
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setIcon(@Nullable Integer num) {
        this.icon = num;
    }

    public final void setLoading(boolean z) {
        this.isLoading = z;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNeedLoading(boolean z) {
        this.needLoading = z;
    }

    public final void setSelected(boolean z) {
        this.selected = z;
    }

    public final void setSinglePress(boolean z) {
        this.singlePress = z;
    }

    @NotNull
    public String toString() {
        return "ModeItem(icon=" + this.icon + ", name=" + this.name + ", selected=" + this.selected + ", needLoading=" + this.needLoading + ", singlePress=" + this.singlePress + ", isLoading=" + this.isLoading + ", enabled=" + this.enabled + ')';
    }
}
