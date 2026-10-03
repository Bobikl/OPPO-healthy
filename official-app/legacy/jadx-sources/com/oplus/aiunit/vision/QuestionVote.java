package com.oplus.aiunit.vision;

import com.google.gson.annotations.SerializedName;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.x6f, reason: from toString */
/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\f\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u001a\u0010\f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\t\u0010\u000bR\u001a\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\u000b¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/x6f;", "", "", "toString", "", "hashCode", "other", "", "equals", "a", "I", "()I", "optionA", "b", "getOptionB", "optionB", "<init>", "(II)V", "operations_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class QuestionVote {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @SerializedName("optionA")
    private final int optionA;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    @SerializedName("optionB")
    private final int optionB;

    /* JADX WARN: Illegal instructions before constructor call */
    public QuestionVote() {
        int i = 0;
        this(i, i, 3, null);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getOptionA() {
        return this.optionA;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionVote)) {
            return false;
        }
        QuestionVote questionVote = (QuestionVote) other;
        return this.optionA == questionVote.optionA && this.optionB == questionVote.optionB;
    }

    public int hashCode() {
        return (Integer.hashCode(this.optionA) * 31) + Integer.hashCode(this.optionB);
    }

    @NotNull
    public String toString() {
        return "QuestionVote(optionA=" + this.optionA + ", optionB=" + this.optionB + ")";
    }

    public QuestionVote(int i, int i2) {
        this.optionA = i;
        this.optionB = i2;
    }

    public /* synthetic */ QuestionVote(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 98 : i, (i3 & 2) != 0 ? 2 : i2);
    }
}
