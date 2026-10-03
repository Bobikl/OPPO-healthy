package com.heytap.sports.recommend.ui;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import java.util.ArrayList;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/heytap/sports/recommend/ui/UserAnswer;", "", "questionId", "", "ansList", "", "(ILjava/util/List;)V", "getAnsList", "()Ljava/util/List;", "setAnsList", "(Ljava/util/List;)V", "getQuestionId", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class UserAnswer {
    public static final int $stable = 8;

    @NotNull
    private List<Integer> ansList;
    private final int questionId;

    /* JADX WARN: Multi-variable type inference failed */
    public UserAnswer() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UserAnswer copy$default(UserAnswer userAnswer, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = userAnswer.questionId;
        }
        if ((i2 & 2) != 0) {
            list = userAnswer.ansList;
        }
        return userAnswer.copy(i, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.ansList;
    }

    @NotNull
    public final UserAnswer copy(int questionId, @NotNull List<Integer> ansList) {
        Intrinsics.checkNotNullParameter(ansList, "ansList");
        return new UserAnswer(questionId, ansList);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAnswer)) {
            return false;
        }
        UserAnswer userAnswer = (UserAnswer) other;
        return this.questionId == userAnswer.questionId && Intrinsics.areEqual(this.ansList, userAnswer.ansList);
    }

    @NotNull
    public final List<Integer> getAnsList() {
        return this.ansList;
    }

    public final int getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (Integer.hashCode(this.questionId) * 31) + this.ansList.hashCode();
    }

    public final void setAnsList(@NotNull List<Integer> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.ansList = list;
    }

    @NotNull
    public String toString() {
        return "UserAnswer(questionId=" + this.questionId + ", ansList=" + this.ansList + ")";
    }

    public UserAnswer(int i, @NotNull List<Integer> ansList) {
        Intrinsics.checkNotNullParameter(ansList, "ansList");
        this.questionId = i;
        this.ansList = ansList;
    }

    public /* synthetic */ UserAnswer(int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? new ArrayList() : list);
    }
}
