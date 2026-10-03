package com.oplus.mydevices.sdk.device;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.oplus.mydevices.sdk.PrivacyMaskUtils;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import kotlinx.android.parcel.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Parcelize
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u001f\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003¢\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\t\u0010#\u001a\u00020\u0007HÆ\u0003J\t\u0010$\u001a\u00020\nHÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003JO\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\t\u0010'\u001a\u00020\u0007HÖ\u0001J\u0013\u0010(\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010*HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\b\u0010,\u001a\u00020\u0003H\u0016J\u0019\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u00020\u0007HÖ\u0001R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0012\"\u0004\b\u001e\u0010\u0014¨\u00062"}, d2 = {"Lcom/oplus/mydevices/sdk/device/SwitchMenu;", "Landroid/os/Parcelable;", "id", "", "menuName", "menuNameHighlight", "icon", "", "iconHighLight", "check", "", ActionMenu.ActionType.DEEP_LINKS, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZLjava/lang/String;)V", "getCheck", "()Z", "setCheck", "(Z)V", "getDeepLinks", "()Ljava/lang/String;", "setDeepLinks", "(Ljava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "getIconHighLight", "setIconHighLight", "getId", "getMenuName", "getMenuNameHighlight", "setMenuNameHighlight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class SwitchMenu implements Parcelable {
    public static final Parcelable.Creator CREATOR = new Creator();
    private boolean check;

    @NotNull
    private String deepLinks;
    private int icon;
    private int iconHighLight;

    @NotNull
    private final String id;

    @NotNull
    private final String menuName;

    @NotNull
    private String menuNameHighlight;

    @Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 4, 0})
    public static class Creator implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object createFromParcel(@NotNull Parcel in) {
            Intrinsics.checkNotNullParameter(in, "in");
            return new SwitchMenu(in.readString(), in.readString(), in.readString(), in.readInt(), in.readInt(), in.readInt() != 0, in.readString());
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        public final Object[] newArray(int i) {
            return new SwitchMenu[i];
        }
    }

    @JvmOverloads
    public SwitchMenu(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, 0, 0, false, null, 124, null);
    }

    public static /* synthetic */ SwitchMenu copy$default(SwitchMenu switchMenu, String str, String str2, String str3, int i, int i2, boolean z, String str4, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = switchMenu.id;
        }
        if ((i3 & 2) != 0) {
            str2 = switchMenu.menuName;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = switchMenu.menuNameHighlight;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            i = switchMenu.icon;
        }
        int i4 = i;
        if ((i3 & 16) != 0) {
            i2 = switchMenu.iconHighLight;
        }
        int i5 = i2;
        if ((i3 & 32) != 0) {
            z = switchMenu.check;
        }
        boolean z2 = z;
        if ((i3 & 64) != 0) {
            str4 = switchMenu.deepLinks;
        }
        return switchMenu.copy(str, str5, str6, i4, i5, z2, str4);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMenuName() {
        return this.menuName;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getMenuNameHighlight() {
        return this.menuNameHighlight;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIconHighLight() {
        return this.iconHighLight;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getCheck() {
        return this.check;
    }

    @NotNull
    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getDeepLinks() {
        return this.deepLinks;
    }

    @NotNull
    public final SwitchMenu copy(@NotNull String id, @NotNull String menuName, @NotNull String menuNameHighlight, int icon, int iconHighLight, boolean check, @NotNull String deepLinks) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(menuName, "menuName");
        Intrinsics.checkNotNullParameter(menuNameHighlight, "menuNameHighlight");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        return new SwitchMenu(id, menuName, menuNameHighlight, icon, iconHighLight, check, deepLinks);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SwitchMenu)) {
            return false;
        }
        SwitchMenu switchMenu = (SwitchMenu) other;
        return Intrinsics.areEqual(this.id, switchMenu.id) && Intrinsics.areEqual(this.menuName, switchMenu.menuName) && Intrinsics.areEqual(this.menuNameHighlight, switchMenu.menuNameHighlight) && this.icon == switchMenu.icon && this.iconHighLight == switchMenu.iconHighLight && this.check == switchMenu.check && Intrinsics.areEqual(this.deepLinks, switchMenu.deepLinks);
    }

    public final boolean getCheck() {
        return this.check;
    }

    @NotNull
    public final String getDeepLinks() {
        return this.deepLinks;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconHighLight() {
        return this.iconHighLight;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getMenuName() {
        return this.menuName;
    }

    @NotNull
    public final String getMenuNameHighlight() {
        return this.menuNameHighlight;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v12, types: [int] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v9, types: [int] */
    public int hashCode() {
        String str = this.id;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.menuName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.menuNameHighlight;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.icon) * 31) + this.iconHighLight) * 31;
        boolean z = this.check;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        int i = (iHashCode3 + r2) * 31;
        String str4 = this.deepLinks;
        return i + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setCheck(boolean z) {
        this.check = z;
    }

    public final void setDeepLinks(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.deepLinks = str;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setIconHighLight(int i) {
        this.iconHighLight = i;
    }

    public final void setMenuNameHighlight(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.menuNameHighlight = str;
    }

    @NotNull
    public String toString() {
        return "SwitchMenu(id='" + this.id + "', menuName='" + this.menuName + "', menuNameHighlight='" + this.menuNameHighlight + "', icon=" + this.icon + ", iconHighLight=" + this.iconHighLight + ", check=" + this.check + ", deepLinks='" + PrivacyMaskUtils.INSTANCE.maskMacAddress(this.deepLinks) + "')";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeString(this.menuName);
        parcel.writeString(this.menuNameHighlight);
        parcel.writeInt(this.icon);
        parcel.writeInt(this.iconHighLight);
        parcel.writeInt(this.check ? 1 : 0);
        parcel.writeString(this.deepLinks);
    }

    @JvmOverloads
    public SwitchMenu(@NotNull String str, @NotNull String str2, @NotNull String str3) {
        this(str, str2, str3, 0, 0, false, null, 120, null);
    }

    @JvmOverloads
    public SwitchMenu(@NotNull String str, @NotNull String str2, @NotNull String str3, int i) {
        this(str, str2, str3, i, 0, false, null, 112, null);
    }

    @JvmOverloads
    public SwitchMenu(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2) {
        this(str, str2, str3, i, i2, false, null, 96, null);
    }

    @JvmOverloads
    public SwitchMenu(@NotNull String str, @NotNull String str2, @NotNull String str3, int i, int i2, boolean z) {
        this(str, str2, str3, i, i2, z, null, 64, null);
    }

    @JvmOverloads
    public SwitchMenu(@NotNull String id, @NotNull String menuName, @NotNull String menuNameHighlight, int i, int i2, boolean z, @NotNull String deepLinks) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(menuName, "menuName");
        Intrinsics.checkNotNullParameter(menuNameHighlight, "menuNameHighlight");
        Intrinsics.checkNotNullParameter(deepLinks, "deepLinks");
        this.id = id;
        this.menuName = menuName;
        this.menuNameHighlight = menuNameHighlight;
        this.icon = i;
        this.iconHighLight = i2;
        this.check = z;
        this.deepLinks = deepLinks;
    }

    public /* synthetic */ SwitchMenu(String str, String str2, String str3, int i, int i2, boolean z, String str4, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i3 & 4) != 0 ? str2 : str3, (i3 & 8) != 0 ? -1 : i, (i3 & 16) != 0 ? -1 : i2, (i3 & 32) != 0 ? false : z, (i3 & 64) != 0 ? "" : str4);
    }
}
