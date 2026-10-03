package com.oplus.cardwidget.domain.command.data;

import com.oplus.cardwidget.domain.pack.BaseDataPack;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/oplus/cardwidget/domain/command/data/UpdateLayoutCommand;", "Lcom/oplus/cardwidget/domain/command/data/BaseCardCommand;", "widgetCode", "", BaseDataPack.KEY_LAYOUT_NAME, "layoutData", "", "(Ljava/lang/String;Ljava/lang/String;[B)V", "getLayoutData", "()[B", "getLayoutName", "()Ljava/lang/String;", "getWidgetCode", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "com.oplus.card.widget.cardwidget"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UpdateLayoutCommand extends BaseCardCommand {

    @Nullable
    private final byte[] layoutData;

    @NotNull
    private final String layoutName;

    @NotNull
    private final String widgetCode;

    public UpdateLayoutCommand(@NotNull String widgetCode, @NotNull String layoutName, @Nullable byte[] bArr) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        this.widgetCode = widgetCode;
        this.layoutName = layoutName;
        this.layoutData = bArr;
        setGenTime(System.currentTimeMillis());
    }

    public static /* synthetic */ UpdateLayoutCommand copy$default(UpdateLayoutCommand updateLayoutCommand, String str, String str2, byte[] bArr, int i, Object obj) {
        if ((i & 1) != 0) {
            str = updateLayoutCommand.widgetCode;
        }
        if ((i & 2) != 0) {
            str2 = updateLayoutCommand.layoutName;
        }
        if ((i & 4) != 0) {
            bArr = updateLayoutCommand.layoutData;
        }
        return updateLayoutCommand.copy(str, str2, bArr);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLayoutName() {
        return this.layoutName;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final byte[] getLayoutData() {
        return this.layoutData;
    }

    @NotNull
    public final UpdateLayoutCommand copy(@NotNull String widgetCode, @NotNull String layoutName, @Nullable byte[] layoutData) {
        Intrinsics.checkNotNullParameter(widgetCode, "widgetCode");
        Intrinsics.checkNotNullParameter(layoutName, "layoutName");
        return new UpdateLayoutCommand(widgetCode, layoutName, layoutData);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateLayoutCommand)) {
            return false;
        }
        UpdateLayoutCommand updateLayoutCommand = (UpdateLayoutCommand) other;
        return Intrinsics.areEqual(this.widgetCode, updateLayoutCommand.widgetCode) && Intrinsics.areEqual(this.layoutName, updateLayoutCommand.layoutName) && Intrinsics.areEqual(this.layoutData, updateLayoutCommand.layoutData);
    }

    @Nullable
    public final byte[] getLayoutData() {
        return this.layoutData;
    }

    @NotNull
    public final String getLayoutName() {
        return this.layoutName;
    }

    @NotNull
    public final String getWidgetCode() {
        return this.widgetCode;
    }

    public int hashCode() {
        int iHashCode = ((this.widgetCode.hashCode() * 31) + this.layoutName.hashCode()) * 31;
        byte[] bArr = this.layoutData;
        return iHashCode + (bArr == null ? 0 : Arrays.hashCode(bArr));
    }

    @NotNull
    public String toString() {
        return "UpdateLayoutCommand(widgetCode=" + this.widgetCode + ", layoutName=" + this.layoutName + ", layoutData=" + Arrays.toString(this.layoutData) + ")";
    }

    public /* synthetic */ UpdateLayoutCommand(String str, String str2, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : bArr);
    }
}
