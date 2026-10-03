package com.heytap.sports.recommend.bean;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.StabilityInferred;
import com.oplus.utrace.db.UTraceSQLiteHelperKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.parcelize.Parcelize;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Parcelize
@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\bJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\fJ4\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0014J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0019\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\""}, d2 = {"Lcom/heytap/sports/recommend/bean/MotionQuestion;", "Landroid/os/Parcelable;", "questionId", "Lcom/heytap/sports/recommend/bean/QuestionId;", "answer", "", "", "answerValue", "(Lcom/heytap/sports/recommend/bean/QuestionId;Ljava/util/List;Ljava/lang/Integer;)V", "getAnswer", "()Ljava/util/List;", "getAnswerValue", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getQuestionId", "()Lcom/heytap/sports/recommend/bean/QuestionId;", "component1", "component2", "component3", "copy", "(Lcom/heytap/sports/recommend/bean/QuestionId;Ljava/util/List;Ljava/lang/Integer;)Lcom/heytap/sports/recommend/bean/MotionQuestion;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class MotionQuestion implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<MotionQuestion> CREATOR = new a();

    @NotNull
    private final List<Integer> answer;

    @Nullable
    private final Integer answerValue;

    @NotNull
    private final QuestionId questionId;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MotionQuestion> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final MotionQuestion createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            QuestionId questionIdValueOf = QuestionId.valueOf(parcel.readString());
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(Integer.valueOf(parcel.readInt()));
            }
            return new MotionQuestion(questionIdValueOf, arrayList, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final MotionQuestion[] newArray(int i) {
            return new MotionQuestion[i];
        }
    }

    public MotionQuestion() {
        this(null, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MotionQuestion copy$default(MotionQuestion motionQuestion, QuestionId questionId, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            questionId = motionQuestion.questionId;
        }
        if ((i & 2) != 0) {
            list = motionQuestion.answer;
        }
        if ((i & 4) != 0) {
            num = motionQuestion.answerValue;
        }
        return motionQuestion.copy(questionId, list, num);
    }

    @NotNull
    /* JADX INFO: renamed from: component1, reason: from getter */
    public final QuestionId getQuestionId() {
        return this.questionId;
    }

    @NotNull
    public final List<Integer> component2() {
        return this.answer;
    }

    @Nullable
    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getAnswerValue() {
        return this.answerValue;
    }

    @NotNull
    public final MotionQuestion copy(@NotNull QuestionId questionId, @NotNull List<Integer> answer, @Nullable Integer answerValue) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(answer, "answer");
        return new MotionQuestion(questionId, answer, answerValue);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MotionQuestion)) {
            return false;
        }
        MotionQuestion motionQuestion = (MotionQuestion) other;
        return this.questionId == motionQuestion.questionId && Intrinsics.areEqual(this.answer, motionQuestion.answer) && Intrinsics.areEqual(this.answerValue, motionQuestion.answerValue);
    }

    @NotNull
    public final List<Integer> getAnswer() {
        return this.answer;
    }

    @Nullable
    public final Integer getAnswerValue() {
        return this.answerValue;
    }

    @NotNull
    public final QuestionId getQuestionId() {
        return this.questionId;
    }

    public int hashCode() {
        int iHashCode = ((this.questionId.hashCode() * 31) + this.answer.hashCode()) * 31;
        Integer num = this.answerValue;
        return iHashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        return "MotionQuestion(questionId=" + this.questionId + ", answer=" + this.answer + ", answerValue=" + this.answerValue + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        int iIntValue;
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeString(this.questionId.name());
        List<Integer> list = this.answer;
        parcel.writeInt(list.size());
        Iterator<Integer> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeInt(it.next().intValue());
        }
        Integer num = this.answerValue;
        if (num == null) {
            iIntValue = 0;
        } else {
            parcel.writeInt(1);
            iIntValue = num.intValue();
        }
        parcel.writeInt(iIntValue);
    }

    public MotionQuestion(@NotNull QuestionId questionId, @NotNull List<Integer> answer, @Nullable Integer num) {
        Intrinsics.checkNotNullParameter(questionId, "questionId");
        Intrinsics.checkNotNullParameter(answer, "answer");
        this.questionId = questionId;
        this.answer = answer;
        this.answerValue = num;
    }

    public /* synthetic */ MotionQuestion(QuestionId questionId, List list, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? QuestionId.Q_NULL : questionId, (i & 2) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i & 4) != 0 ? null : num);
    }
}
