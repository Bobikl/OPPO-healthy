package com.oplus.aiunit.vision;

import android.graphics.drawable.Drawable;
import io.protostuff.MapSchema;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.qo6, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\t\b\u0086\b\u0018\u0000 \u001e2\u00020\u0001:\u0001\tB3\u0012\u0006\u0010\r\u001a\u00020\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0007\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\t\u0010\u0006\u001a\u00020\u0005HÖ\u0001J\t\u0010\b\u001a\u00020\u0007HÖ\u0001R\u0017\u0010\r\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0010\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\t\u0010\u000fR\"\u0010\u0015\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\n\u001a\u0004\b\u0012\u0010\f\"\u0004\b\u0013\u0010\u0014R\u0019\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0011\u0010\u0019R\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u000e\u001a\u0004\b\u0017\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/oplus/aiunit/vision/qo6;", "", "other", "", "equals", "", "toString", "", "hashCode", "a", "I", "b", "()I", EnumModeData.TAG_ENUMVALUE, "Ljava/lang/String;", "()Ljava/lang/String;", "enumName", "c", MapSchema.FIELD_NAME_ENTRY, "f", "(I)V", "state", "Landroid/graphics/drawable/Drawable;", "d", "Landroid/graphics/drawable/Drawable;", "()Landroid/graphics/drawable/Drawable;", "icon", "iconUri", "<init>", "(ILjava/lang/String;ILandroid/graphics/drawable/Drawable;Ljava/lang/String;)V", "Companion", "udeviceui_release"}, k = 1, mv = {1, 4, 2})
public final /* data */ class EnumModeData {
    public static final int STATE_SELECTED = 1;
    public static final int STATE_UNSELECTED = 0;

    @NotNull
    public static final String TAG_ENUMNAME = "name";

    @NotNull
    public static final String TAG_ENUMVALUE = "enumValue";

    @NotNull
    public static final String TAG_ICON = "icon";

    @NotNull
    public static final String TAG_STATE = "state";

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    public final int enumValue;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public final String enumName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    public int state;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @Nullable
    public final Drawable icon;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public final String iconUri;

    public EnumModeData(int i, @NotNull String enumName, int i2, @Nullable Drawable drawable, @Nullable String str) {
        Intrinsics.checkNotNullParameter(enumName, "enumName");
        this.enumValue = i;
        this.enumName = enumName;
        this.state = i2;
        this.icon = drawable;
        this.iconUri = str;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getEnumName() {
        return this.enumName;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getEnumValue() {
        return this.enumValue;
    }

    @Nullable
    /* JADX INFO: renamed from: c, reason: from getter */
    public final Drawable getIcon() {
        return this.icon;
    }

    @Nullable
    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getIconUri() {
        return this.iconUri;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getState() {
        return this.state;
    }

    public boolean equals(@Nullable Object other) {
        if (!(other instanceof EnumModeData)) {
            return super.equals(other);
        }
        EnumModeData enumModeData = (EnumModeData) other;
        return this.enumValue == enumModeData.enumValue && Intrinsics.areEqual(this.enumName, enumModeData.enumName);
    }

    public final void f(int i) {
        this.state = i;
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.enumValue) * 31;
        String str = this.enumName;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + Integer.hashCode(this.state)) * 31;
        Drawable drawable = this.icon;
        int iHashCode3 = (iHashCode2 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        String str2 = this.iconUri;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "EnumModeData(enumValue=" + this.enumValue + ", enumName=" + this.enumName + ", state=" + this.state + ", icon=" + this.icon + ", iconUri=" + this.iconUri + ")";
    }
}
