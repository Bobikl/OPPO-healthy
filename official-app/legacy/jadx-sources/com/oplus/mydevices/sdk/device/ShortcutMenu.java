package com.oplus.mydevices.sdk.device;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.yo3;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmOverloads;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b.\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u0000 :2\u00020\u0001:\u0001:By\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003\u0012\b\b\u0002\u0010\n\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000fJ\t\u0010)\u001a\u00020\u0003HÆ\u0003J\t\u0010*\u001a\u00020\u0007HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010,\u001a\u00020\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u0007HÆ\u0003J\t\u0010/\u001a\u00020\u0007HÆ\u0003J\t\u00100\u001a\u00020\u0003HÆ\u0003J\t\u00101\u001a\u00020\u0007HÆ\u0003J\t\u00102\u001a\u00020\u0003HÆ\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0003HÆ\u0003J}\u00104\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00072\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u00105\u001a\u0002062\b\u00107\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00108\u001a\u00020\u0007HÖ\u0001J\b\u00109\u001a\u00020\u0003H\u0016R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\n\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0017\"\u0004\b\u001d\u0010\u0019R\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0017\"\u0004\b\u001f\u0010\u0019R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0011\"\u0004\b!\u0010\u0013R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0011\"\u0004\b#\u0010\u0013R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0011R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0011\"\u0004\b&\u0010\u0013R\u001a\u0010\r\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0017\"\u0004\b(\u0010\u0019¨\u0006;"}, d2 = {"Lcom/oplus/mydevices/sdk/device/ShortcutMenu;", "", "shortcutId", "", "shortcutName", "iconUri", "icon", "", "iconHighlight", "action", "componentType", "links", "extra", "state", "componentExtra", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;ILjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getAction", "()Ljava/lang/String;", "setAction", "(Ljava/lang/String;)V", "getComponentExtra", "setComponentExtra", "getComponentType", "()I", "setComponentType", "(I)V", "getExtra", "setExtra", "getIcon", "setIcon", "getIconHighlight", "setIconHighlight", "getIconUri", "setIconUri", "getLinks", "setLinks", "getShortcutId", "getShortcutName", "setShortcutName", "getState", "setState", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "toString", "Companion", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final /* data */ class ShortcutMenu {
    public static final int COMPONENT_TYPE_ACTIVITY = 0;
    public static final int COMPONENT_TYPE_PROVIDER = 2;
    public static final int COMPONENT_TYPE_RECEIVER = 1;
    public static final int STATE_DISABLE = 256;
    public static final int STATE_LOADING = 2;
    public static final int STATE_OFF = 0;
    public static final int STATE_ON = 1;

    @NotNull
    private String action;

    @Nullable
    private String componentExtra;
    private int componentType;

    @Nullable
    private String extra;
    private int icon;
    private int iconHighlight;

    @Nullable
    private String iconUri;

    @NotNull
    private String links;

    @NotNull
    private final String shortcutId;

    @NotNull
    private String shortcutName;
    private int state;

    @JvmOverloads
    public ShortcutMenu(@NotNull String str) {
        this(str, null, null, 0, 0, null, 0, null, null, 0, null, 2046, null);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getShortcutId() {
        return this.shortcutId;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final int getState() {
        return this.state;
    }

    @Nullable
    /* JADX INFO: renamed from: component11, reason: from getter */
    public final String getComponentExtra() {
        return this.componentExtra;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShortcutName() {
        return this.shortcutName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getIconUri() {
        return this.iconUri;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getIcon() {
        return this.icon;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getIconHighlight() {
        return this.iconHighlight;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getComponentType() {
        return this.componentType;
    }

    @NotNull
    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getLinks() {
        return this.links;
    }

    @Nullable
    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getExtra() {
        return this.extra;
    }

    @NotNull
    public final ShortcutMenu copy(@NotNull String shortcutId, @NotNull String shortcutName, @Nullable String iconUri, int icon, int iconHighlight, @NotNull String action, int componentType, @NotNull String links, @Nullable String extra, int state, @Nullable String componentExtra) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        Intrinsics.checkNotNullParameter(shortcutName, "shortcutName");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(links, "links");
        return new ShortcutMenu(shortcutId, shortcutName, iconUri, icon, iconHighlight, action, componentType, links, extra, state, componentExtra);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShortcutMenu)) {
            return false;
        }
        ShortcutMenu shortcutMenu = (ShortcutMenu) other;
        return Intrinsics.areEqual(this.shortcutId, shortcutMenu.shortcutId) && Intrinsics.areEqual(this.shortcutName, shortcutMenu.shortcutName) && Intrinsics.areEqual(this.iconUri, shortcutMenu.iconUri) && this.icon == shortcutMenu.icon && this.iconHighlight == shortcutMenu.iconHighlight && Intrinsics.areEqual(this.action, shortcutMenu.action) && this.componentType == shortcutMenu.componentType && Intrinsics.areEqual(this.links, shortcutMenu.links) && Intrinsics.areEqual(this.extra, shortcutMenu.extra) && this.state == shortcutMenu.state && Intrinsics.areEqual(this.componentExtra, shortcutMenu.componentExtra);
    }

    @NotNull
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getComponentExtra() {
        return this.componentExtra;
    }

    public final int getComponentType() {
        return this.componentType;
    }

    @Nullable
    public final String getExtra() {
        return this.extra;
    }

    public final int getIcon() {
        return this.icon;
    }

    public final int getIconHighlight() {
        return this.iconHighlight;
    }

    @Nullable
    public final String getIconUri() {
        return this.iconUri;
    }

    @NotNull
    public final String getLinks() {
        return this.links;
    }

    @NotNull
    public final String getShortcutId() {
        return this.shortcutId;
    }

    @NotNull
    public final String getShortcutName() {
        return this.shortcutName;
    }

    public final int getState() {
        return this.state;
    }

    public int hashCode() {
        String str = this.shortcutId;
        int iHashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.shortcutName;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.iconUri;
        int iHashCode3 = (((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.icon) * 31) + this.iconHighlight) * 31;
        String str4 = this.action;
        int iHashCode4 = (((iHashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31) + this.componentType) * 31;
        String str5 = this.links;
        int iHashCode5 = (iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.extra;
        int iHashCode6 = (((iHashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.state) * 31;
        String str7 = this.componentExtra;
        return iHashCode6 + (str7 != null ? str7.hashCode() : 0);
    }

    public final void setAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.action = str;
    }

    public final void setComponentExtra(@Nullable String str) {
        this.componentExtra = str;
    }

    public final void setComponentType(int i) {
        this.componentType = i;
    }

    public final void setExtra(@Nullable String str) {
        this.extra = str;
    }

    public final void setIcon(int i) {
        this.icon = i;
    }

    public final void setIconHighlight(int i) {
        this.iconHighlight = i;
    }

    public final void setIconUri(@Nullable String str) {
        this.iconUri = str;
    }

    public final void setLinks(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.links = str;
    }

    public final void setShortcutName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.shortcutName = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    @NotNull
    public String toString() {
        return "ShortcutMenu(shortcutId='" + this.shortcutId + "', shortcutName='" + this.shortcutName + "', iconUri=" + this.iconUri + ", state=" + this.state + ')';
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2) {
        this(str, str2, null, 0, 0, null, 0, null, null, 0, null, 2044, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3) {
        this(str, str2, str3, 0, 0, null, 0, null, null, 0, null, 2040, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i) {
        this(str, str2, str3, i, 0, null, 0, null, null, 0, null, yo3.WEAR_OS_VERSION_TOO_LOW, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, int i2) {
        this(str, str2, str3, i, i2, null, 0, null, null, 0, null, 2016, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, int i2, @NotNull String str4) {
        this(str, str2, str3, i, i2, str4, 0, null, null, 0, null, 1984, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, int i2, @NotNull String str4, int i3) {
        this(str, str2, str3, i, i2, str4, i3, null, null, 0, null, 1920, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, int i2, @NotNull String str4, int i3, @NotNull String str5) {
        this(str, str2, str3, i, i2, str4, i3, str5, null, 0, null, 1792, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, int i2, @NotNull String str4, int i3, @NotNull String str5, @Nullable String str6) {
        this(str, str2, str3, i, i2, str4, i3, str5, str6, 0, null, 1536, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String str, @NotNull String str2, @Nullable String str3, int i, int i2, @NotNull String str4, int i3, @NotNull String str5, @Nullable String str6, int i4) {
        this(str, str2, str3, i, i2, str4, i3, str5, str6, i4, null, 1024, null);
    }

    @JvmOverloads
    public ShortcutMenu(@NotNull String shortcutId, @NotNull String shortcutName, @Nullable String str, int i, int i2, @NotNull String action, int i3, @NotNull String links, @Nullable String str2, int i4, @Nullable String str3) {
        Intrinsics.checkNotNullParameter(shortcutId, "shortcutId");
        Intrinsics.checkNotNullParameter(shortcutName, "shortcutName");
        Intrinsics.checkNotNullParameter(action, "action");
        Intrinsics.checkNotNullParameter(links, "links");
        this.shortcutId = shortcutId;
        this.shortcutName = shortcutName;
        this.iconUri = str;
        this.icon = i;
        this.iconHighlight = i2;
        this.action = action;
        this.componentType = i3;
        this.links = links;
        this.extra = str2;
        this.state = i4;
        this.componentExtra = str3;
    }

    public /* synthetic */ ShortcutMenu(String str, String str2, String str3, int i, int i2, String str4, int i3, String str5, String str6, int i4, String str7, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i5 & 2) != 0 ? "" : str2, (i5 & 4) != 0 ? "" : str3, (i5 & 8) != 0 ? -1 : i, (i5 & 16) == 0 ? i2 : -1, (i5 & 32) != 0 ? "" : str4, (i5 & 64) != 0 ? 0 : i3, (i5 & 128) == 0 ? str5 : "", (i5 & 256) != 0 ? null : str6, (i5 & 512) == 0 ? i4 : 0, (i5 & 1024) == 0 ? str7 : null);
    }
}
