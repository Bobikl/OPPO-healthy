package com.oplus.deviceui.model;

import android.graphics.drawable.Drawable;
import com.heytap.webview.extension.protocol.Const;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import com.oplus.smartenginehelper.entity.ViewEntity;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b.\b\u0016\u0018\u0000 <2\u00020\u0001:\u0001=B\u0007¢\u0006\u0004\b:\u0010;J\u0013\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\bH\u0016R$\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR$\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R$\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u000b\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u000fR$\u0010\u001a\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010 \u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u000b\u001a\u0004\b!\u0010\r\"\u0004\b\"\u0010\u000fR\"\u0010#\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\"\u0010)\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&\"\u0004\b+\u0010(R\"\u0010,\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010$\u001a\u0004\b-\u0010&\"\u0004\b.\u0010(R\"\u0010/\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b/\u0010$\u001a\u0004\b/\u0010&\"\u0004\b0\u0010(R\"\u00101\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u0010$\u001a\u0004\b2\u0010&\"\u0004\b3\u0010(R$\u00104\u001a\u0004\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001d\"\u0004\b6\u0010\u001fR$\u00107\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u0010\u000b\u001a\u0004\b8\u0010\r\"\u0004\b9\u0010\u000f¨\u0006>"}, d2 = {"Lcom/oplus/deviceui/model/ModeItem;", "Ljava/io/Serializable;", "", "other", "", "equals", "", "toString", "", "hashCode", "id", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "icon", "Landroid/graphics/drawable/Drawable;", "getIcon", "()Landroid/graphics/drawable/Drawable;", "setIcon", "(Landroid/graphics/drawable/Drawable;)V", "iconUri", "getIconUri", "setIconUri", "color", "Ljava/lang/Integer;", "getColor", "()Ljava/lang/Integer;", "setColor", "(Ljava/lang/Integer;)V", "name", "getName", "setName", "selected", "Z", "getSelected", "()Z", "setSelected", "(Z)V", "needLoading", "getNeedLoading", "setNeedLoading", "singlePress", "getSinglePress", "setSinglePress", "isLoading", "setLoading", ViewEntity.ENABLED, "getEnabled", ClickApiEntity.SET_ENABLED, Const.Arguments.Open.STYLE, "getStyle", "setStyle", "stateData", "getStateData", "setStateData", "<init>", "()V", "Companion", "a", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public class ModeItem implements Serializable {
    public static final int STYLE_COMMON_BUTTON = 0;
    public static final int STYLE_COMMON_BUTTON_NORMAL = 1;
    public static final int STYLE_ENUM_BUTTON = 4;
    public static final int STYLE_STEP = 2;

    @Nullable
    private Integer color;
    private boolean enabled = true;

    @Nullable
    private Drawable icon;

    @Nullable
    private String iconUri;

    @Nullable
    private String id;
    private boolean isLoading;

    @Nullable
    private String name;
    private boolean needLoading;
    private boolean selected;
    private boolean singlePress;

    @Nullable
    private String stateData;

    @Nullable
    private Integer style;

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof ModeItem)) {
            return false;
        }
        ModeItem modeItem = (ModeItem) other;
        return StringsKt__StringsJVMKt.equals$default(this.name, modeItem.name, false, 2, null) && this.selected == modeItem.selected && this.needLoading == modeItem.needLoading && this.singlePress == modeItem.singlePress && this.isLoading == modeItem.isLoading && this.enabled == modeItem.enabled && Intrinsics.areEqual(this.color, modeItem.color);
    }

    @Nullable
    public final Integer getColor() {
        return this.color;
    }

    public final boolean getEnabled() {
        return this.enabled;
    }

    @Nullable
    public final Drawable getIcon() {
        return this.icon;
    }

    @Nullable
    public final String getIconUri() {
        return this.iconUri;
    }

    @Nullable
    public final String getId() {
        return this.id;
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

    @Nullable
    public final String getStateData() {
        return this.stateData;
    }

    @Nullable
    public final Integer getStyle() {
        return this.style;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        Drawable drawable = this.icon;
        int iHashCode2 = (iHashCode + (drawable != null ? drawable.hashCode() : 0)) * 31;
        String str2 = this.iconUri;
        int iHashCode3 = (iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num = this.color;
        int iIntValue = (iHashCode3 + (num != null ? num.intValue() : 0)) * 31;
        String str3 = this.name;
        int iHashCode4 = (((((((((((iIntValue + (str3 != null ? str3.hashCode() : 0)) * 31) + Boolean.hashCode(this.selected)) * 31) + Boolean.hashCode(this.needLoading)) * 31) + Boolean.hashCode(this.singlePress)) * 31) + Boolean.hashCode(this.isLoading)) * 31) + Boolean.hashCode(this.enabled)) * 31;
        Integer num2 = this.style;
        int iIntValue2 = (iHashCode4 + (num2 != null ? num2.intValue() : 0)) * 31;
        String str4 = this.stateData;
        return iIntValue2 + (str4 != null ? str4.hashCode() : 0);
    }

    /* JADX INFO: renamed from: isLoading, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    public final void setColor(@Nullable Integer num) {
        this.color = num;
    }

    public final void setEnabled(boolean z) {
        this.enabled = z;
    }

    public final void setIcon(@Nullable Drawable drawable) {
        this.icon = drawable;
    }

    public final void setIconUri(@Nullable String str) {
        this.iconUri = str;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
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

    public final void setStateData(@Nullable String str) {
        this.stateData = str;
    }

    public final void setStyle(@Nullable Integer num) {
        this.style = num;
    }

    @NotNull
    public String toString() {
        return "ModeItem(icon=" + this.icon + ", name=" + this.name + ", selected=" + this.selected + ", needLoading=" + this.needLoading + ", singlePress=" + this.singlePress + ", enabled=" + this.enabled + ", isLoading=" + this.isLoading + ')';
    }
}
