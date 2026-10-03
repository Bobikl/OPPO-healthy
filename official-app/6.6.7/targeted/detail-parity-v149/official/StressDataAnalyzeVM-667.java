package com.heytap.health.hrv.viewmodel;

import android.content.Context;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModelKt;
import com.google.security.cryptauth.lib.securegcm.SecureGcmConstants;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalAchievement;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStat;
import com.heytap.databaseengine.model.physicalMental.PhysicalMentalStatus;
import com.heytap.databaseengine.model.sleepdaystat.SleepDayStat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.hrv.R$string;
import com.heytap.health.hrv.constant.HrvStatusType;
import com.heytap.health.hrv.model.StressDetailRepository;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.e88;
import com.oplus.aiunit.vision.gf8;
import com.oplus.aiunit.vision.h15;
import com.oplus.aiunit.vision.m8b;
import com.oplus.smartenginehelper.ParserTag;
import io.protostuff.MapSchema;
import java.time.LocalDateTime;
import java.util.Iterator;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0007\u0018\u0000 C2\u00020\u0001:\u0001DB\u0007¢\u0006\u0004\bA\u0010BJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0016\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\u0018\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0016\u0010\u000e\u001a\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0002J\u0018\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0018\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0002J\u0010\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0002J\"\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002R\u0014\u0010\u001d\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010!\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R \u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010 R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010 R\u001a\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00110\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010 R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00150\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010 R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010 R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u001d\u00104\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b018F¢\u0006\u0006\u001a\u0004\b2\u00103R\u001d\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u000b018F¢\u0006\u0006\u001a\u0004\b5\u00103R\u0017\u00108\u001a\b\u0012\u0004\u0012\u00020\u0002018F¢\u0006\u0006\u001a\u0004\b7\u00103R\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0011018F¢\u0006\u0006\u001a\u0004\b9\u00103R\u0017\u0010<\u001a\b\u0012\u0004\u0012\u00020\u0011018F¢\u0006\u0006\u001a\u0004\b;\u00103R\u0017\u0010>\u001a\b\u0012\u0004\u0012\u00020\u0015018F¢\u0006\u0006\u001a\u0004\b=\u00103R\u0017\u0010@\u001a\b\u0012\u0004\u0012\u00020,018F¢\u0006\u0006\u001a\u0004\b?\u00103¨\u0006E"}, d2 = {"Lcom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "ssoid", "", "S", "", "startTime", "endTime", "I", "H", "", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStatus;", "statusDetail", ExifInterface.LONGITUDE_EAST, "J", "G", "", "avgStatus", "R", "currentTime", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalStat;", "stressStat", "Lcom/heytap/databaseengine/model/sleepdaystat/SleepDayStat;", "sleepDayStat", UserInfo.SEX_FEMALE, "Lcom/heytap/health/hrv/model/StressDetailRepository;", "j", "Lcom/heytap/health/hrv/model/StressDetailRepository;", "mRepository", "Landroidx/lifecycle/MutableLiveData;", MapSchema.FIELD_NAME_KEY, "Landroidx/lifecycle/MutableLiveData;", "_percent", LogFieldKey.LEVEL_KEY, "_counts", LogFieldKey.MESSAGE_KEY, "_statusAnalyzeContent", "n", "_statusPercent", "o", "_increasePercent", LogFieldKey.PROCESS_NAME_KEY, "_todayStat", "Lcom/heytap/databaseengine/model/physicalMental/PhysicalMentalAchievement;", "q", "_todayAchievement", "r", "Ljava/lang/String;", "Landroidx/lifecycle/LiveData;", "M", "()Landroidx/lifecycle/LiveData;", ParserTag.TAG_PERCENT, "K", "counts", "N", "statusAnalyzeContent", "O", "statusPercent", "L", "increasePercent", "Q", "todayStat", SecureGcmConstants.MESSAGE_KEY, "todayAchievement", "<init>", "()V", "Companion", "a", "hrv_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nStressDataAnalyzeVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StressDataAnalyzeVM.kt\ncom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,409:1\n1855#2,2:410\n1855#2,2:412\n*S KotlinDebug\n*F\n+ 1 StressDataAnalyzeVM.kt\ncom/heytap/health/hrv/viewmodel/StressDataAnalyzeVM\n*L\n140#1:410,2\n156#1:412,2\n*E\n"})
public final class StressDataAnalyzeVM extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final StressDetailRepository mRepository = new StressDetailRepository();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Integer>> _percent = new MutableLiveData<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<List<Integer>> _counts = new MutableLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<String> _statusAnalyzeContent = new MutableLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> _statusPercent = new MutableLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<Integer> _increasePercent = new MutableLiveData<>();

    /* JADX INFO: renamed from: p, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<PhysicalMentalStat> _todayStat = new MutableLiveData<>();

    /* JADX INFO: renamed from: q, reason: from kotlin metadata */
    @NotNull
    public final MutableLiveData<PhysicalMentalAchievement> _todayAchievement = new MutableLiveData<>();

    /* JADX INFO: renamed from: r, reason: from kotlin metadata */
    @NotNull
    public String ssoid;
    public static final int $stable = 8;

    public StressDataAnalyzeVM() {
        String ssoid = cn.c().getSsoid();
        Intrinsics.checkNotNullExpressionValue(ssoid, "getAccountManager().ssoid");
        this.ssoid = ssoid;
    }

    public final void E(List<PhysicalMentalStatus> statusDetail) {
        Iterator<T> it = statusDetail.iterator();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (it.hasNext()) {
            int stressState = ((PhysicalMentalStatus) it.next()).getStressState();
            if (stressState == 1) {
                i4++;
            } else if (stressState == 2) {
                i3++;
            } else if (stressState == 3) {
                i2++;
            } else if (stressState == 4) {
                i++;
            }
        }
        int i5 = i + i2 + i3 + i4;
        int i6 = i5 != 0 ? (i * 100) / i5 : 0;
        int i7 = i5 != 0 ? (i2 * 100) / i5 : 0;
        int i8 = i5 != 0 ? (i3 * 100) / i5 : 0;
        int i9 = i5 != 0 ? (i4 * 100) / i5 : 0;
        this._counts.postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}));
        this._percent.postValue(CollectionsKt__CollectionsKt.listOf((Object[]) new Integer[]{Integer.valueOf(i6), Integer.valueOf(i7), Integer.valueOf(i8), Integer.valueOf(i9)}));
    }

    /* JADX WARN: Code duplicated, block: B:100:0x020d  */
    /* JADX WARN: Code duplicated, block: B:102:0x021b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0227  */
    /* JADX WARN: Code duplicated, block: B:105:0x0233  */
    /* JADX WARN: Code duplicated, block: B:107:0x023b  */
    /* JADX WARN: Code duplicated, block: B:108:0x0247  */
    /* JADX WARN: Code duplicated, block: B:110:0x0251  */
    /* JADX WARN: Code duplicated, block: B:111:0x025b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0263  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x01f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01fb A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:95:0x0203  */
    /* JADX WARN: Code duplicated, block: B:96:0x0205 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:98:0x0209  */
    public final void F(long currentTime, PhysicalMentalStat stressStat, SleepDayStat sleepDayStat) {
        boolean z;
        int stressState;
        String string;
        boolean z2;
        boolean z3;
        String string2;
        String string3;
        String string4;
        long jCurrentTimeMillis = System.currentTimeMillis();
        gf8.Companion companion = gf8.INSTANCE;
        LocalDateTime localDateTimeG = companion.g(jCurrentTimeMillis);
        int hour = localDateTimeG.getHour();
        Context contextA = e88.a();
        if (!Intrinsics.areEqual(localDateTimeG.toLocalDate(), companion.g(currentTime).toLocalDate())) {
            int stressState2 = stressStat.getStressState();
            if (stressState2 == HrvStatusType.GOOD.getType()) {
                string4 = contextA.getString(R$string.health_hrv_analyze_description_4);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…rv_analyze_description_4)");
            } else if (stressState2 == HrvStatusType.RELAX.getType()) {
                string4 = contextA.getString(R$string.health_hrv_analyze_description_5);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…rv_analyze_description_5)");
            } else if (stressState2 == HrvStatusType.NORMAL.getType()) {
                string4 = contextA.getString(R$string.health_hrv_analyze_description_6);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…rv_analyze_description_6)");
            } else if (stressState2 == HrvStatusType.REST.getType()) {
                string4 = contextA.getString(R$string.health_hrv_analyze_description_7);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…rv_analyze_description_7)");
            } else {
                string4 = contextA.getString(R$string.health_hrv_today_status_analyze_no_date);
                Intrinsics.checkNotNullExpressionValue(string4, "context.getString(R.stri…y_status_analyze_no_date)");
            }
            this._statusAnalyzeContent.postValue(string4);
            return;
        }
        if (stressStat.getStressState() == HrvStatusType.DEFAULT.getType()) {
            String string5 = contextA.getString(R$string.health_hrv_today_status_analyze_no_date);
            Intrinsics.checkNotNullExpressionValue(string5, "context.getString(R.stri…y_status_analyze_no_date)");
            this._statusAnalyzeContent.postValue(string5);
            return;
        }
        m8b.f("StressDataAnalyzeVM", "hour:" + hour);
        String str = "";
        if (9 <= hour && hour < 22) {
            int stressState3 = stressStat.getStressState();
            if (stressState3 == HrvStatusType.GOOD.getType()) {
                string2 = contextA.getString(R$string.health_hrv_analyze_description_4);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rv_analyze_description_4)");
            } else if (stressState3 == HrvStatusType.RELAX.getType()) {
                string2 = contextA.getString(R$string.health_hrv_analyze_description_5);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rv_analyze_description_5)");
            } else if (stressState3 == HrvStatusType.NORMAL.getType()) {
                string2 = contextA.getString(R$string.health_hrv_analyze_description_6);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rv_analyze_description_6)");
            } else if (stressState3 == HrvStatusType.REST.getType()) {
                string2 = contextA.getString(R$string.health_hrv_analyze_description_7);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rv_analyze_description_7)");
            }
            str = string2;
        } else {
            if (22 <= hour && hour < 24) {
                string2 = contextA.getString(R$string.health_hrv_analyze_description_8);
                Intrinsics.checkNotNullExpressionValue(string2, "context.getString(R.stri…rv_analyze_description_8)");
                str = string2;
            } else {
                LocalDateTime localDateTimePlusHours = h15.E(h15.x(companion.f(currentTime))).plusHours(10L);
                LocalDateTime localDateTimePlusHours2 = h15.E(h15.x(companion.f(currentTime))).plusHours(10L);
                if (sleepDayStat != null) {
                    localDateTimePlusHours = companion.g(sleepDayStat.getSleepInTime());
                    localDateTimePlusHours2 = companion.g(sleepDayStat.getSleepOutTime());
                }
                int hour2 = localDateTimePlusHours.getHour();
                int hour3 = localDateTimePlusHours2.getHour();
                if (localDateTimePlusHours.getDayOfYear() != localDateTimePlusHours2.getDayOfYear()) {
                    hour2 -= 24;
                }
                if (4 <= hour && hour < 9) {
                    if (4 <= hour2 && hour2 < 9) {
                        if (hour >= 0) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (z) {
                            if (hour2 >= 0) {
                                z2 = false;
                            } else {
                                z2 = false;
                            }
                            if (z2) {
                                stressState = stressStat.getStressState();
                                if (stressState == HrvStatusType.GOOD.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                                } else if (stressState == HrvStatusType.RELAX.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                                } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                } else if (stressState == HrvStatusType.REST.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                }
                                str = string;
                            } else {
                                if (hour3 >= 0) {
                                    z3 = false;
                                } else {
                                    z3 = false;
                                }
                                if (z3) {
                                    stressState = stressStat.getStressState();
                                    if (stressState == HrvStatusType.GOOD.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                                    } else if (stressState == HrvStatusType.RELAX.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                                    } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                    } else if (stressState == HrvStatusType.REST.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                    }
                                } else {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_8);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_8)");
                                }
                                str = string;
                            }
                        } else {
                            stressState = stressStat.getStressState();
                            if (stressState == HrvStatusType.GOOD.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                            } else if (stressState == HrvStatusType.RELAX.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                            } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                            } else if (stressState == HrvStatusType.REST.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                            }
                            str = string;
                        }
                    } else {
                        if (4 <= hour3 && hour3 < 9) {
                            if (hour >= 0) {
                                z = false;
                            } else {
                                z = false;
                            }
                            if (z) {
                                stressState = stressStat.getStressState();
                                if (stressState == HrvStatusType.GOOD.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                                } else if (stressState == HrvStatusType.RELAX.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                                } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                } else if (stressState == HrvStatusType.REST.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                }
                                str = string;
                            } else {
                                if (hour2 >= 0) {
                                    z2 = false;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    stressState = stressStat.getStressState();
                                    if (stressState == HrvStatusType.GOOD.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                                    } else if (stressState == HrvStatusType.RELAX.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                                    } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                    } else if (stressState == HrvStatusType.REST.getType()) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                    }
                                    str = string;
                                } else {
                                    if (hour3 >= 0) {
                                        z3 = false;
                                    } else {
                                        z3 = false;
                                    }
                                    if (z3) {
                                        string = contextA.getString(R$string.health_hrv_analyze_description_8);
                                        Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_8)");
                                    } else {
                                        stressState = stressStat.getStressState();
                                        if (stressState == HrvStatusType.GOOD.getType()) {
                                            string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                                        } else if (stressState == HrvStatusType.RELAX.getType()) {
                                            string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                                        } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                            string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                        } else if (stressState == HrvStatusType.REST.getType()) {
                                            string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                        }
                                    }
                                    str = string;
                                }
                            }
                        } else {
                            int stressState4 = stressStat.getStressState();
                            if (stressState4 == HrvStatusType.GOOD.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_4);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_4)");
                            } else if (stressState4 == HrvStatusType.RELAX.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_5);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_5)");
                            } else if (stressState4 == HrvStatusType.NORMAL.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_6);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_6)");
                            } else if (stressState4 == HrvStatusType.REST.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_7);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_7)");
                            }
                            str = string;
                        }
                    }
                } else {
                    if (hour >= 0 || hour >= 4) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        stressState = stressStat.getStressState();
                        if (stressState == HrvStatusType.GOOD.getType()) {
                            string = contextA.getString(R$string.health_hrv_analyze_description_1);
                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                        } else if (stressState == HrvStatusType.RELAX.getType()) {
                            string = contextA.getString(R$string.health_hrv_analyze_description_2);
                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                        } else if (stressState == HrvStatusType.NORMAL.getType()) {
                            string = contextA.getString(R$string.health_hrv_analyze_description_3);
                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                        } else if (stressState == HrvStatusType.REST.getType()) {
                            string = contextA.getString(R$string.health_hrv_analyze_description_3);
                            Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                        }
                        str = string;
                    } else {
                        if (hour2 >= 0 || hour2 >= 4) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            stressState = stressStat.getStressState();
                            if (stressState == HrvStatusType.GOOD.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                            } else if (stressState == HrvStatusType.RELAX.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                            } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                            } else if (stressState == HrvStatusType.REST.getType()) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                            }
                            str = string;
                        } else {
                            if (hour3 >= 0 || hour3 >= 4) {
                                z3 = false;
                            } else {
                                z3 = true;
                            }
                            if (z3) {
                                string = contextA.getString(R$string.health_hrv_analyze_description_8);
                                Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_8)");
                            } else {
                                stressState = stressStat.getStressState();
                                if (stressState == HrvStatusType.GOOD.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_1);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_1)");
                                } else if (stressState == HrvStatusType.RELAX.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_2);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_2)");
                                } else if (stressState == HrvStatusType.NORMAL.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                } else if (stressState == HrvStatusType.REST.getType()) {
                                    string = contextA.getString(R$string.health_hrv_analyze_description_3);
                                    Intrinsics.checkNotNullExpressionValue(string, "context.getString(R.stri…rv_analyze_description_3)");
                                }
                            }
                            str = string;
                        }
                    }
                }
                m8b.f("StressDataAnalyzeVM", "hour:" + hour + " ,startSleepHour:" + hour2 + ", endSleepHour:" + hour3);
            }
        }
        if (str.length() == 0) {
            string3 = contextA.getString(R$string.health_hrv_today_status_analyze_no_date);
            Intrinsics.checkNotNullExpressionValue(string3, "context.getString(R.stri…y_status_analyze_no_date)");
        } else {
            string3 = str;
        }
        this._statusAnalyzeContent.postValue(string3);
    }

    public final void G(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataAnalyzeVM$fetchAchievementData$1(this, startTime, endTime, null), 2, null);
    }

    public final void H(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataAnalyzeVM$fetchDayDetailData$1(this, startTime, endTime, null), 2, null);
    }

    public final void I(long startTime, long endTime) {
        H(startTime, endTime);
        J(startTime, endTime);
        G(startTime, endTime);
    }

    public final void J(long startTime, long endTime) {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataAnalyzeVM$fetchStatData$1(endTime, this, startTime - 86400000, null), 2, null);
    }

    @NotNull
    public final LiveData<List<Integer>> K() {
        return this._counts;
    }

    @NotNull
    public final LiveData<Integer> L() {
        return this._increasePercent;
    }

    @NotNull
    public final LiveData<List<Integer>> M() {
        return this._percent;
    }

    @NotNull
    public final LiveData<String> N() {
        return this._statusAnalyzeContent;
    }

    @NotNull
    public final LiveData<Integer> O() {
        return this._statusPercent;
    }

    @NotNull
    public final LiveData<PhysicalMentalAchievement> P() {
        return this._todayAchievement;
    }

    @NotNull
    public final LiveData<PhysicalMentalStat> Q() {
        return this._todayStat;
    }

    public final void R(int avgStatus) {
        if (avgStatus == 0) {
            this._statusPercent.postValue(-1);
        } else {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new StressDataAnalyzeVM$queryAndUpdateRank$1(this, avgStatus, null), 2, null);
        }
    }

    public final void S(@NotNull String ssoid) {
        Intrinsics.checkNotNullParameter(ssoid, "ssoid");
        this.ssoid = ssoid;
    }
}