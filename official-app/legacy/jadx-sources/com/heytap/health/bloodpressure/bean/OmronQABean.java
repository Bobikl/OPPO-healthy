package com.heytap.health.bloodpressure.bean;

import androidx.compose.runtime.internal.StabilityInferred;
import java.io.Serializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/bloodpressure/bean/OmronQABean;", "Ljava/io/Serializable;", "question", "", "answer", "(Ljava/lang/String;Ljava/lang/String;)V", "getAnswer", "()Ljava/lang/String;", "getQuestion", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "blood_pressure_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class OmronQABean implements Serializable {
    public static final int $stable = 0;

    @NotNull
    private final String answer;

    @NotNull
    private final String question;

    public OmronQABean(@NotNull String question, @NotNull String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.question = question;
        this.answer = answer;
    }

    public static /* synthetic */ OmronQABean copy$default(OmronQABean omronQABean, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = omronQABean.question;
        }
        if ((i & 2) != 0) {
            str2 = omronQABean.answer;
        }
        return omronQABean.copy(str, str2);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getQuestion() {
        return this.question;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getAnswer() {
        return this.answer;
    }

    @NotNull
    public final OmronQABean copy(@NotNull String question, @NotNull String answer) {
        Intrinsics.checkNotNullParameter(question, "question");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new OmronQABean(question, answer);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OmronQABean)) {
            return false;
        }
        OmronQABean omronQABean = (OmronQABean) other;
        return Intrinsics.areEqual(this.question, omronQABean.question) && Intrinsics.areEqual(this.answer, omronQABean.answer);
    }

    @NotNull
    public final String getAnswer() {
        return this.answer;
    }

    @NotNull
    public final String getQuestion() {
        return this.question;
    }

    public int hashCode() {
        return (this.question.hashCode() * 31) + this.answer.hashCode();
    }

    @NotNull
    public String toString() {
        return "OmronQABean(question=" + this.question + ", answer=" + this.answer + ")";
    }
}
