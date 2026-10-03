package com.heytap.health.wallet.network.bus.rsp;

import androidx.annotation.Keep;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003¢\u0006\u0002\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\n\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\n\"\u0004\b\u0011\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/heytap/health/wallet/network/bus/rsp/JumpGuideInfo;", "", "itemName", "", "dialogTitle", "dialogDesc", "buttonName", "url", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getButtonName", "()Ljava/lang/String;", "getDialogDesc", "getDialogTitle", "getItemName", "setItemName", "(Ljava/lang/String;)V", "getUrl", "setUrl", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "commonlib_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class JumpGuideInfo {

    @NotNull
    private final String buttonName;

    @NotNull
    private final String dialogDesc;

    @NotNull
    private final String dialogTitle;

    @NotNull
    private String itemName;

    @NotNull
    private String url;

    public JumpGuideInfo(@NotNull String itemName, @NotNull String dialogTitle, @NotNull String dialogDesc, @NotNull String buttonName, @NotNull String url) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogDesc, "dialogDesc");
        Intrinsics.checkNotNullParameter(buttonName, "buttonName");
        Intrinsics.checkNotNullParameter(url, "url");
        this.itemName = itemName;
        this.dialogTitle = dialogTitle;
        this.dialogDesc = dialogDesc;
        this.buttonName = buttonName;
        this.url = url;
    }

    public static /* synthetic */ JumpGuideInfo copy$default(JumpGuideInfo jumpGuideInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = jumpGuideInfo.itemName;
        }
        if ((i & 2) != 0) {
            str2 = jumpGuideInfo.dialogTitle;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = jumpGuideInfo.dialogDesc;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = jumpGuideInfo.buttonName;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = jumpGuideInfo.url;
        }
        return jumpGuideInfo.copy(str, str6, str7, str8, str5);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @NotNull
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDialogDesc() {
        return this.dialogDesc;
    }

    @NotNull
    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getButtonName() {
        return this.buttonName;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    @NotNull
    public final JumpGuideInfo copy(@NotNull String itemName, @NotNull String dialogTitle, @NotNull String dialogDesc, @NotNull String buttonName, @NotNull String url) {
        Intrinsics.checkNotNullParameter(itemName, "itemName");
        Intrinsics.checkNotNullParameter(dialogTitle, "dialogTitle");
        Intrinsics.checkNotNullParameter(dialogDesc, "dialogDesc");
        Intrinsics.checkNotNullParameter(buttonName, "buttonName");
        Intrinsics.checkNotNullParameter(url, "url");
        return new JumpGuideInfo(itemName, dialogTitle, dialogDesc, buttonName, url);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof JumpGuideInfo)) {
            return false;
        }
        JumpGuideInfo jumpGuideInfo = (JumpGuideInfo) other;
        return Intrinsics.areEqual(this.itemName, jumpGuideInfo.itemName) && Intrinsics.areEqual(this.dialogTitle, jumpGuideInfo.dialogTitle) && Intrinsics.areEqual(this.dialogDesc, jumpGuideInfo.dialogDesc) && Intrinsics.areEqual(this.buttonName, jumpGuideInfo.buttonName) && Intrinsics.areEqual(this.url, jumpGuideInfo.url);
    }

    @NotNull
    public final String getButtonName() {
        return this.buttonName;
    }

    @NotNull
    public final String getDialogDesc() {
        return this.dialogDesc;
    }

    @NotNull
    public final String getDialogTitle() {
        return this.dialogTitle;
    }

    @NotNull
    public final String getItemName() {
        return this.itemName;
    }

    @NotNull
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return (((((((this.itemName.hashCode() * 31) + this.dialogTitle.hashCode()) * 31) + this.dialogDesc.hashCode()) * 31) + this.buttonName.hashCode()) * 31) + this.url.hashCode();
    }

    public final void setItemName(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.itemName = str;
    }

    public final void setUrl(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    @NotNull
    public String toString() {
        return "JumpGuideInfo(itemName=" + this.itemName + ", dialogTitle=" + this.dialogTitle + ", dialogDesc=" + this.dialogDesc + ", buttonName=" + this.buttonName + ", url=" + this.url + ")";
    }
}
