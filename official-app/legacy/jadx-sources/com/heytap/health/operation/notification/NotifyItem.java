package com.heytap.health.operation.notification;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;
import pantanal.internal.datachannel.CardAction;

/* JADX INFO: loaded from: classes17.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0002\u0010\fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0006HÆ\u0003J\t\u0010#\u001a\u00020\u0006HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0003HÆ\u0003J\t\u0010&\u001a\u00020\u000bHÆ\u0003JO\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010(\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010*\u001a\u00020\u000bHÖ\u0001J\t\u0010+\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u000e\"\u0004\b\u0015\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013R\u001a\u0010\b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u000e\"\u0004\b\u001b\u0010\u0010R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006,"}, d2 = {"Lcom/heytap/health/operation/notification/NotifyItem;", "", "id", "", "params", "isCheck", "", CardAction.LIFE_CIRCLE_VALUE_SHOW, "subText", "title", "type", "", "(Ljava/lang/String;Ljava/lang/String;ZZLjava/lang/String;Ljava/lang/String;I)V", "getId", "()Ljava/lang/String;", "setId", "(Ljava/lang/String;)V", "()Z", "setCheck", "(Z)V", "getParams", "setParams", "getShow", "setShow", "getSubText", "setSubText", "getTitle", "setTitle", "getType", "()I", "setType", "(I)V", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "operation_impl_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class NotifyItem {
    public static final int $stable = 8;

    @NotNull
    private String id;
    private boolean isCheck;

    @NotNull
    private String params;
    private boolean show;

    @NotNull
    private String subText;

    @NotNull
    private String title;
    private int type;

    public NotifyItem(@NotNull String id, @NotNull String params, boolean z, boolean z2, @NotNull String subText, @NotNull String title, int i) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(subText, "subText");
        Intrinsics.checkNotNullParameter(title, "title");
        this.id = id;
        this.params = params;
        this.isCheck = z;
        this.show = z2;
        this.subText = subText;
        this.title = title;
        this.type = i;
    }

    public static /* synthetic */ NotifyItem copy$default(NotifyItem notifyItem, String str, String str2, boolean z, boolean z2, String str3, String str4, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = notifyItem.id;
        }
        if ((i2 & 2) != 0) {
            str2 = notifyItem.params;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            z = notifyItem.isCheck;
        }
        boolean z3 = z;
        if ((i2 & 8) != 0) {
            z2 = notifyItem.show;
        }
        boolean z4 = z2;
        if ((i2 & 16) != 0) {
            str3 = notifyItem.subText;
        }
        String str6 = str3;
        if ((i2 & 32) != 0) {
            str4 = notifyItem.title;
        }
        String str7 = str4;
        if ((i2 & 64) != 0) {
            i = notifyItem.type;
        }
        return notifyItem.copy(str, str5, z3, z4, str6, str7, i);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getParams() {
        return this.params;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getIsCheck() {
        return this.isCheck;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getType() {
        return this.type;
    }

    @NotNull
    public final NotifyItem copy(@NotNull String id, @NotNull String params, boolean isCheck, boolean show, @NotNull String subText, @NotNull String title, int type) {
        Intrinsics.checkNotNullParameter(id, "id");
        Intrinsics.checkNotNullParameter(params, "params");
        Intrinsics.checkNotNullParameter(subText, "subText");
        Intrinsics.checkNotNullParameter(title, "title");
        return new NotifyItem(id, params, isCheck, show, subText, title, type);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotifyItem)) {
            return false;
        }
        NotifyItem notifyItem = (NotifyItem) other;
        return Intrinsics.areEqual(this.id, notifyItem.id) && Intrinsics.areEqual(this.params, notifyItem.params) && this.isCheck == notifyItem.isCheck && this.show == notifyItem.show && Intrinsics.areEqual(this.subText, notifyItem.subText) && Intrinsics.areEqual(this.title, notifyItem.title) && this.type == notifyItem.type;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    @NotNull
    public final String getParams() {
        return this.params;
    }

    public final boolean getShow() {
        return this.show;
    }

    @NotNull
    public final String getSubText() {
        return this.subText;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v3, types: [int] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public int hashCode() {
        int iHashCode = ((this.id.hashCode() * 31) + this.params.hashCode()) * 31;
        boolean z = this.isCheck;
        ?? r1 = z;
        if (z) {
            r1 = 1;
        }
        int i = (iHashCode + r1) * 31;
        boolean z2 = this.show;
        return ((((((i + (z2 ? 1 : z2)) * 31) + this.subText.hashCode()) * 31) + this.title.hashCode()) * 31) + Integer.hashCode(this.type);
    }

    public final boolean isCheck() {
        return this.isCheck;
    }

    public final void setCheck(boolean z) {
        this.isCheck = z;
    }

    public final void setId(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.id = str;
    }

    public final void setParams(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.params = str;
    }

    public final void setShow(boolean z) {
        this.show = z;
    }

    public final void setSubText(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.subText = str;
    }

    public final void setTitle(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    @NotNull
    public String toString() {
        return "NotifyItem(id=" + this.id + ", params=" + this.params + ", isCheck=" + this.isCheck + ", show=" + this.show + ", subText=" + this.subText + ", title=" + this.title + ", type=" + this.type + ")";
    }
}
