package com.oplus.aiunit.model;

import androidx.compose.runtime.internal.StabilityInferred;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.k79, reason: from toString */
/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0004\u0012\u0006\u0010\u001a\u001a\u00020\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ\b\u0010\u0003\u001a\u00020\u0002H\u0016J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\n\u001a\u0004\b\t\u0010\f\"\u0004\b\u0010\u0010\u000eR\"\u0010\u0017\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006 "}, d2 = {"Lcom/oplus/aiunit/vision/k79;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "Ljava/lang/String;", "b", "()Ljava/lang/String;", "setTitle", "(Ljava/lang/String;)V", "title", "setText", "text", "c", "I", "()I", "setType", "(I)V", "type", "d", "Z", "isCheck", "()Z", "setCheck", "(Z)V", "<init>", "(Ljava/lang/String;Ljava/lang/String;IZ)V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class HeartRateSettingBean {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String title;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @NotNull
    public String text;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata and from toString */
    public int type;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    public boolean isCheck;

    public HeartRateSettingBean(@NotNull String str, @NotNull String str2, int i, boolean z) {
        Intrinsics.checkNotNullParameter(str, "title");
        Intrinsics.checkNotNullParameter(str2, "text");
        this.title = str;
        this.text = str2;
        this.type = i;
        this.isCheck = z;
    }

    @NotNull
    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getType() {
        return this.type;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HeartRateSettingBean)) {
            return false;
        }
        HeartRateSettingBean heartRateSettingBean = (HeartRateSettingBean) other;
        return Intrinsics.areEqual(this.title, heartRateSettingBean.title) && Intrinsics.areEqual(this.text, heartRateSettingBean.text) && this.type == heartRateSettingBean.type && this.isCheck == heartRateSettingBean.isCheck;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v7, types: [int] */
    /* JADX WARN: Type inference failed for: r2v2, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.text.hashCode()) * 31) + Integer.hashCode(this.type)) * 31;
        boolean z = this.isCheck;
        ?? r2 = z;
        if (z) {
            r2 = 1;
        }
        return iHashCode + r2;
    }

    @NotNull
    public String toString() {
        return "HeartRateSettingBean(title='" + this.title + "', text='" + this.text + "', type=" + this.type + ", isCheck=" + this.isCheck + ")";
    }
}