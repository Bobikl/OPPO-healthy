package com.heytap.nearx.uikit.widget.statement;

import android.content.Context;
import com.oplus.aiunit.vision.mnc;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007B\u0015\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0002\u0010\u000bJ\t\u0010\u000f\u001a\u00020\tHÆ\u0003J\t\u0010\u0010\u001a\u00020\tHÆ\u0003J\u001d\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0016\u001a\u00020\tHÖ\u0001R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0017"}, d2 = {"Lcom/heytap/nearx/uikit/widget/statement/PrivacyItem;", "", "context", "Landroid/content/Context;", mnc.DOCTOR_LEVEL, "", "summaryId", "(Landroid/content/Context;II)V", "titleText", "", "summaryText", "(Ljava/lang/String;Ljava/lang/String;)V", "getSummaryText", "()Ljava/lang/String;", "getTitleText", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "nearx_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final /* data */ class PrivacyItem {

    @NotNull
    private final String summaryText;

    @NotNull
    private final String titleText;

    public PrivacyItem(@NotNull String titleText, @NotNull String summaryText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        this.titleText = titleText;
        this.summaryText = summaryText;
    }

    public static /* synthetic */ PrivacyItem copy$default(PrivacyItem privacyItem, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = privacyItem.titleText;
        }
        if ((i & 2) != 0) {
            str2 = privacyItem.summaryText;
        }
        return privacyItem.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitleText() {
        return this.titleText;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSummaryText() {
        return this.summaryText;
    }

    @NotNull
    public final PrivacyItem copy(@NotNull String titleText, @NotNull String summaryText) {
        Intrinsics.checkNotNullParameter(titleText, "titleText");
        Intrinsics.checkNotNullParameter(summaryText, "summaryText");
        return new PrivacyItem(titleText, summaryText);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrivacyItem)) {
            return false;
        }
        PrivacyItem privacyItem = (PrivacyItem) other;
        return Intrinsics.areEqual(this.titleText, privacyItem.titleText) && Intrinsics.areEqual(this.summaryText, privacyItem.summaryText);
    }

    @NotNull
    public final String getSummaryText() {
        return this.summaryText;
    }

    @NotNull
    public final String getTitleText() {
        return this.titleText;
    }

    public int hashCode() {
        return (this.titleText.hashCode() * 31) + this.summaryText.hashCode();
    }

    @NotNull
    public String toString() {
        return "PrivacyItem(titleText=" + this.titleText + ", summaryText=" + this.summaryText + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public PrivacyItem(@NotNull Context context, int i, int i2) {
        Intrinsics.checkNotNullParameter(context, "context");
        String string = context.getString(i);
        Intrinsics.checkNotNullExpressionValue(string, "context.getString(titleId)");
        String string2 = context.getString(i2);
        Intrinsics.checkNotNullExpressionValue(string2, "context.getString(summaryId)");
        this(string, string2);
    }
}
