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
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\u0019\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0003HÖ\u0001R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006!"}, d2 = {"Lcom/heytap/sports/recommend/bean/Questionnaire;", "Landroid/os/Parcelable;", "answerTimestamp", "", "source", "Lcom/heytap/sports/recommend/bean/ModifySource;", "ans", "", "Lcom/heytap/sports/recommend/bean/MotionQuestion;", "(ILcom/heytap/sports/recommend/bean/ModifySource;Ljava/util/List;)V", "getAns", "()Ljava/util/List;", "getAnswerTimestamp", "()I", "getSource", "()Lcom/heytap/sports/recommend/bean/ModifySource;", "component1", "component2", "component3", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", UTraceSQLiteHelperKt.COL_FLAGS, "recommend_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class Questionnaire implements Parcelable {
    public static final int $stable = 8;

    @NotNull
    public static final Parcelable.Creator<Questionnaire> CREATOR = new a();

    @NotNull
    private final List<MotionQuestion> ans;
    private final int answerTimestamp;

    @NotNull
    private final ModifySource source;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Questionnaire> {
        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Questionnaire createFromParcel(@NotNull Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            int i = parcel.readInt();
            ModifySource modifySourceValueOf = ModifySource.valueOf(parcel.readString());
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(MotionQuestion.CREATOR.createFromParcel(parcel));
            }
            return new Questionnaire(i, modifySourceValueOf, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Questionnaire[] newArray(int i) {
            return new Questionnaire[i];
        }
    }

    public Questionnaire() {
        this(0, null, null, 7, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Questionnaire copy$default(Questionnaire questionnaire, int i, ModifySource modifySource, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = questionnaire.answerTimestamp;
        }
        if ((i2 & 2) != 0) {
            modifySource = questionnaire.source;
        }
        if ((i2 & 4) != 0) {
            list = questionnaire.ans;
        }
        return questionnaire.copy(i, modifySource, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getAnswerTimestamp() {
        return this.answerTimestamp;
    }

    @NotNull
    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ModifySource getSource() {
        return this.source;
    }

    @NotNull
    public final List<MotionQuestion> component3() {
        return this.ans;
    }

    @NotNull
    public final Questionnaire copy(int answerTimestamp, @NotNull ModifySource source, @NotNull List<MotionQuestion> ans) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(ans, "ans");
        return new Questionnaire(answerTimestamp, source, ans);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Questionnaire)) {
            return false;
        }
        Questionnaire questionnaire = (Questionnaire) other;
        return this.answerTimestamp == questionnaire.answerTimestamp && this.source == questionnaire.source && Intrinsics.areEqual(this.ans, questionnaire.ans);
    }

    @NotNull
    public final List<MotionQuestion> getAns() {
        return this.ans;
    }

    public final int getAnswerTimestamp() {
        return this.answerTimestamp;
    }

    @NotNull
    public final ModifySource getSource() {
        return this.source;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.answerTimestamp) * 31) + this.source.hashCode()) * 31) + this.ans.hashCode();
    }

    @NotNull
    public String toString() {
        return "Questionnaire(answerTimestamp=" + this.answerTimestamp + ", source=" + this.source + ", ans=" + this.ans + ")";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NotNull Parcel parcel, int flags) {
        Intrinsics.checkNotNullParameter(parcel, "out");
        parcel.writeInt(this.answerTimestamp);
        parcel.writeString(this.source.name());
        List<MotionQuestion> list = this.ans;
        parcel.writeInt(list.size());
        Iterator<MotionQuestion> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, flags);
        }
    }

    public Questionnaire(int i, @NotNull ModifySource source, @NotNull List<MotionQuestion> ans) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(ans, "ans");
        this.answerTimestamp = i;
        this.source = source;
        this.ans = ans;
    }

    public /* synthetic */ Questionnaire(int i, ModifySource modifySource, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? ModifySource.NOT_MODIFY : modifySource, (i2 & 4) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list);
    }
}
