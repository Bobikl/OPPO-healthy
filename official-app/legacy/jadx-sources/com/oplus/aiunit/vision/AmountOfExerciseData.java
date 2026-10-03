package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.health.sport.coach.bean.SportMotive;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.sports.coach.bean.ExceedingHealthIndex;
import com.oplus.seedling.sdk.plugin.SeedlingConstants;
import io.protostuff.MapSchema;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Pair;
import p010kotlin.TuplesKt;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.oplus.aiunit.vision.i10, reason: from toString */
/* JADX INFO: loaded from: classes2.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001B¡\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0004\u0012\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0013\u0012\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0013¢\u0006\u0004\bJ\u0010KJ£\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u00042\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\u00042\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00132\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u0013HÆ\u0001J\t\u0010\u0017\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010 R(\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,\"\u0004\b-\u0010.R\"\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b#\u0010/\u001a\u0004\b'\u00100\"\u0004\b1\u00102R\"\u0010\r\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R$\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b9\u0010:\u001a\u0004\b3\u0010;\"\u0004\b<\u0010=R\"\u0010\u0010\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010\"\u001a\u0004\b>\u0010$\"\u0004\b?\u0010&R\"\u0010\u0011\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00104\u001a\u0004\b@\u00106\"\u0004\bA\u00108R\"\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bB\u0010\"\u001a\u0004\b9\u0010$\"\u0004\bC\u0010&R.\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b5\u0010D\u001a\u0004\bB\u0010E\"\u0004\bF\u0010GR.\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n0\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010D\u001a\u0004\bH\u0010E\"\u0004\bI\u0010G¨\u0006L"}, d2 = {"Lcom/oplus/aiunit/vision/i10;", "", "", "userName", "", "exerciseCount", "sportName", "", "Lcom/heytap/sports/coach/bean/ExceedingHealthIndex;", "exceedingList", "", "amountOfExercise", "", "updateDate", "Lcom/heytap/health/sport/coach/bean/SportMotive;", "motive", "sleepRecovery", "sleepRecoveryDate", "sleepRecommend", "Lkotlin/Pair;", SeedlingConstants.PluginFilePath.FOLDER_SDK_STANDARD, "limit", "a", "toString", "hashCode", "other", "", "equals", "Ljava/lang/String;", LogFieldKey.LEVEL_KEY, "()Ljava/lang/String;", "setUserName", "(Ljava/lang/String;)V", "b", "I", MapSchema.FIELD_NAME_ENTRY, "()I", "setExerciseCount", "(I)V", "c", "i", "setSportName", "d", "Ljava/util/List;", "()Ljava/util/List;", "setExceedingList", "(Ljava/util/List;)V", UserInfo.SEX_FEMALE, "()F", "setAmountOfExercise", "(F)V", "f", "J", MapSchema.FIELD_NAME_KEY, "()J", "setUpdateDate", "(J)V", b2n.f, "Lcom/heytap/health/sport/coach/bean/SportMotive;", "()Lcom/heytap/health/sport/coach/bean/SportMotive;", "setMotive", "(Lcom/heytap/health/sport/coach/bean/SportMotive;)V", b2n.g, "setSleepRecovery", "getSleepRecoveryDate", "setSleepRecoveryDate", "j", "setSleepRecommend", "Lkotlin/Pair;", "()Lkotlin/Pair;", "setStandard", "(Lkotlin/Pair;)V", "getLimit", "setLimit", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;FJLcom/heytap/health/sport/coach/bean/SportMotive;IJILkotlin/Pair;Lkotlin/Pair;)V", "sport_impl_release"}, k = 1, mv = {1, 8, 0})
public final /* data */ class AmountOfExerciseData {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata and from toString */
    @NotNull
    public String userName;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata and from toString */
    public int exerciseCount;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    @Nullable
    public String sportName;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata and from toString */
    @NotNull
    public List<? extends ExceedingHealthIndex> exceedingList;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    public float amountOfExercise;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata and from toString */
    public long updateDate;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata and from toString */
    @Nullable
    public SportMotive motive;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata and from toString */
    public int sleepRecovery;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata and from toString */
    public long sleepRecoveryDate;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    public int sleepRecommend;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata and from toString */
    @NotNull
    public Pair<Float, Float> standard;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    @NotNull
    public Pair<Float, Float> limit;

    public AmountOfExerciseData() {
        this(null, 0, null, null, 0.0f, 0L, null, 0, 0L, 0, null, null, 4095, null);
    }

    @NotNull
    public final AmountOfExerciseData a(@NotNull String userName, int exerciseCount, @Nullable String sportName, @NotNull List<? extends ExceedingHealthIndex> exceedingList, float amountOfExercise, long updateDate, @Nullable SportMotive motive, int sleepRecovery, long sleepRecoveryDate, int sleepRecommend, @NotNull Pair<Float, Float> standard, @NotNull Pair<Float, Float> limit) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(exceedingList, "exceedingList");
        Intrinsics.checkNotNullParameter(standard, "standard");
        Intrinsics.checkNotNullParameter(limit, "limit");
        return new AmountOfExerciseData(userName, exerciseCount, sportName, exceedingList, amountOfExercise, updateDate, motive, sleepRecovery, sleepRecoveryDate, sleepRecommend, standard, limit);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final float getAmountOfExercise() {
        return this.amountOfExercise;
    }

    @NotNull
    public final List<ExceedingHealthIndex> d() {
        return this.exceedingList;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getExerciseCount() {
        return this.exerciseCount;
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AmountOfExerciseData)) {
            return false;
        }
        AmountOfExerciseData amountOfExerciseData = (AmountOfExerciseData) other;
        return Intrinsics.areEqual(this.userName, amountOfExerciseData.userName) && this.exerciseCount == amountOfExerciseData.exerciseCount && Intrinsics.areEqual(this.sportName, amountOfExerciseData.sportName) && Intrinsics.areEqual(this.exceedingList, amountOfExerciseData.exceedingList) && Float.compare(this.amountOfExercise, amountOfExerciseData.amountOfExercise) == 0 && this.updateDate == amountOfExerciseData.updateDate && this.motive == amountOfExerciseData.motive && this.sleepRecovery == amountOfExerciseData.sleepRecovery && this.sleepRecoveryDate == amountOfExerciseData.sleepRecoveryDate && this.sleepRecommend == amountOfExerciseData.sleepRecommend && Intrinsics.areEqual(this.standard, amountOfExerciseData.standard) && Intrinsics.areEqual(this.limit, amountOfExerciseData.limit);
    }

    @Nullable
    /* JADX INFO: renamed from: f, reason: from getter */
    public final SportMotive getMotive() {
        return this.motive;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final int getSleepRecommend() {
        return this.sleepRecommend;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final int getSleepRecovery() {
        return this.sleepRecovery;
    }

    public int hashCode() {
        int iHashCode = ((this.userName.hashCode() * 31) + Integer.hashCode(this.exerciseCount)) * 31;
        String str = this.sportName;
        int iHashCode2 = (((((((iHashCode + (str == null ? 0 : str.hashCode())) * 31) + this.exceedingList.hashCode()) * 31) + Float.hashCode(this.amountOfExercise)) * 31) + Long.hashCode(this.updateDate)) * 31;
        SportMotive sportMotive = this.motive;
        return ((((((((((iHashCode2 + (sportMotive != null ? sportMotive.hashCode() : 0)) * 31) + Integer.hashCode(this.sleepRecovery)) * 31) + Long.hashCode(this.sleepRecoveryDate)) * 31) + Integer.hashCode(this.sleepRecommend)) * 31) + this.standard.hashCode()) * 31) + this.limit.hashCode();
    }

    @Nullable
    /* JADX INFO: renamed from: i, reason: from getter */
    public final String getSportName() {
        return this.sportName;
    }

    @NotNull
    public final Pair<Float, Float> j() {
        return this.standard;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getUpdateDate() {
        return this.updateDate;
    }

    @NotNull
    /* JADX INFO: renamed from: l, reason: from getter */
    public final String getUserName() {
        return this.userName;
    }

    @NotNull
    public String toString() {
        return "AmountOfExerciseData(userName=" + this.userName + ", exerciseCount=" + this.exerciseCount + ", sportName=" + this.sportName + ", exceedingList=" + this.exceedingList + ", amountOfExercise=" + this.amountOfExercise + ", updateDate=" + this.updateDate + ", motive=" + this.motive + ", sleepRecovery=" + this.sleepRecovery + ", sleepRecoveryDate=" + this.sleepRecoveryDate + ", sleepRecommend=" + this.sleepRecommend + ", standard=" + this.standard + ", limit=" + this.limit + ")";
    }

    public AmountOfExerciseData(@NotNull String userName, int i, @Nullable String str, @NotNull List<? extends ExceedingHealthIndex> exceedingList, float f, long j2, @Nullable SportMotive sportMotive, int i2, long j3, int i3, @NotNull Pair<Float, Float> standard, @NotNull Pair<Float, Float> limit) {
        Intrinsics.checkNotNullParameter(userName, "userName");
        Intrinsics.checkNotNullParameter(exceedingList, "exceedingList");
        Intrinsics.checkNotNullParameter(standard, "standard");
        Intrinsics.checkNotNullParameter(limit, "limit");
        this.userName = userName;
        this.exerciseCount = i;
        this.sportName = str;
        this.exceedingList = exceedingList;
        this.amountOfExercise = f;
        this.updateDate = j2;
        this.motive = sportMotive;
        this.sleepRecovery = i2;
        this.sleepRecoveryDate = j3;
        this.sleepRecommend = i3;
        this.standard = standard;
        this.limit = limit;
    }

    public /* synthetic */ AmountOfExerciseData(String str, int i, String str2, List list, float f, long j2, SportMotive sportMotive, int i2, long j3, int i3, Pair pair, Pair pair2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? "" : str, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? null : str2, (i4 & 8) != 0 ? CollectionsKt__CollectionsKt.emptyList() : list, (i4 & 16) != 0 ? 0.0f : f, (i4 & 32) != 0 ? 0L : j2, (i4 & 64) == 0 ? sportMotive : null, (i4 & 128) == 0 ? i2 : 0, (i4 & 256) == 0 ? j3 : 0L, (i4 & 512) != 0 ? -1 : i3, (i4 & 1024) != 0 ? TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(0.0f)) : pair, (i4 & 2048) != 0 ? TuplesKt.to(Float.valueOf(0.0f), Float.valueOf(0.0f)) : pair2);
    }
}
