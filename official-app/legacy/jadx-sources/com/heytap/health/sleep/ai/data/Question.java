package com.heytap.health.sleep.ai.data;

import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/heytap/health/sleep/ai/data/Question;", "", "questionId", "", "question", "(Ljava/lang/String;Ljava/lang/String;)V", "getQuestion", "()Ljava/lang/String;", "getQuestionId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "sleep_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Question {
    public static final int $stable = 0;

    @NotNull
    private final String question;

    @NotNull
    private final String questionId;

    /* JADX WARN: Multi-variable type inference failed */
    public Question() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Question copy$default(Question question, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = question.questionId;
        }
        if ((i & 2) != 0) {
            str2 = question.question;
        }
        return question.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestionId() {
        return this.questionId;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    @NotNull
    public final Question copy(@NotNull String questionId, @NotNull String question) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(question, "question");
        return new Question(questionId, question);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Question)) {
            return false;
        }
        Question question = (Question) other;
        return Intrinsics.areEqual(this.questionId, question.questionId) && Intrinsics.areEqual(this.question, question.question);
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    @NotNull
    public final String getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        return (this.questionId.hashCode() * 31) + this.question.hashCode();
    }

    @NotNull
    public String toString() {
        return "Question(questionId=" + this.questionId + ", question=" + this.question + ")";
    }

    public Question(@NotNull String questionId, @NotNull String question) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(question, "question");
        this.questionId = questionId;
        this.question = question;
    }

    public /* synthetic */ Question(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2);
    }
}
