package com.heytap.health.blood.glucose.viewmodel;

import android.annotation.SuppressLint;
import android.text.TextUtils;
import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.ViewModelKt;
import com.heytap.databaseengine.model.UserInfo;
import com.heytap.databaseengine.model.bloodsugar.BloodSugar;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarStat;
import com.heytap.databaseengine.model.bloodsugar.BloodSugarWarning;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.blood.glucose.BloodGlucoseWarningActivity;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.GluDayBean;
import com.oplus.aiunit.vision.acl;
import com.oplus.aiunit.vision.b24;
import com.oplus.aiunit.vision.be1;
import com.oplus.aiunit.vision.cn;
import com.oplus.aiunit.vision.ddd;
import com.oplus.aiunit.vision.g18;
import com.oplus.aiunit.vision.m8b;
import com.oplus.aiunit.vision.pr8;
import com.oplus.aiunit.vision.yj1;
import com.oplus.aiunit.vision.zj1;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes15.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\u0018\u0000 /2\u00020\u0001:\u00010B\u0007¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002J$\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007J\"\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006J\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nJ\u0018\u0010\u0013\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0012\u001a\u00020\u0011J\u0014\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\tH\u0007R\u0014\u0010\u001a\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR#\u0010#\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\t8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R#\u0010&\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u00140\t8\u0006¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010\"R#\u0010)\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\n0\t8\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u001d\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b+\u0010\"¨\u00061"}, d2 = {"Lcom/heytap/health/blood/glucose/viewmodel/BloodGlucoseDayViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", BloodGlucoseWarningActivity.SSOID, "", UserInfo.SEX_FEMALE, "", "startTime", "endTime", "Lcom/heytap/health/base/livedata/OLiveData;", "", "Lcom/oplus/aiunit/vision/v88;", "D", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "x", "w", "model", "", "isWatch4", ExifInterface.LONGITUDE_EAST, "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "C", "Lcom/oplus/aiunit/vision/yj1;", "j", "Lcom/oplus/aiunit/vision/yj1;", "bloodGlucoseDayRepository", "Lcom/oplus/aiunit/vision/zj1;", MapSchema.FIELD_NAME_KEY, "Lcom/oplus/aiunit/vision/zj1;", "bloodGlucoseDayTransform", LogFieldKey.LEVEL_KEY, "Lcom/heytap/health/base/livedata/OLiveData;", "y", "()Lcom/heytap/health/base/livedata/OLiveData;", "mObservableGluData", LogFieldKey.MESSAGE_KEY, acl.KEY_B, "mObservableLastData", "n", "z", "mObservableGluDataStat", "o", "A", "mObservableJumpUrl", "<init>", "()V", "Companion", "a", "blood_glucose_release"}, k = 1, mv = {1, 8, 0})
public final class BloodGlucoseDayViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final yj1 bloodGlucoseDayRepository = new yj1(null, 1, 0 == true ? 1 : 0);

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final zj1 bloodGlucoseDayTransform = new zj1();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<List<GluDayBean>> mObservableGluData = new OLiveData<>();

    /* JADX INFO: renamed from: m, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<List<BloodSugar>> mObservableLastData = new OLiveData<>();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final OLiveData<List<BloodSugarStat>> mObservableGluDataStat = new OLiveData<>();

    /* JADX INFO: renamed from: o, reason: from kotlin metadata */
    @NotNull
    public final OLiveData<String> mObservableJumpUrl = new OLiveData<>();

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarStat;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements b24 {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.b24
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull List<BloodSugarStat> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BloodGlucoseDayViewModel.this.z().postValue(it);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "bloodSugarList", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugarWarning;", "bloodSugarWarningList", "", "Lcom/oplus/aiunit/vision/v88;", "a", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class c<T1, T2, R> implements be1 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f4425j;
        public final /* synthetic */ long k;

        public c(long j2, long j3) {
            this.f4425j = j2;
            this.k = j3;
        }

        @Override // com.oplus.aiunit.vision.be1
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<GluDayBean> apply(@NotNull List<BloodSugar> bloodSugarList, @NotNull List<BloodSugarWarning> bloodSugarWarningList) {
            Intrinsics.checkNotNullParameter(bloodSugarList, "bloodSugarList");
            Intrinsics.checkNotNullParameter(bloodSugarWarningList, "bloodSugarWarningList");
            return BloodGlucoseDayViewModel.this.bloodGlucoseDayTransform.a(this.f4425j, this.k, bloodSugarList, bloodSugarWarningList, BloodGlucoseDayViewModel.this.z().getValue());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/oplus/aiunit/vision/v88;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class d<T, R> implements g18 {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f4426j;
        public final /* synthetic */ long k;

        public d(long j2, long j3) {
            this.f4426j = j2;
            this.k = j3;
        }

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<GluDayBean> apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            m8b.f("BloodGlucoseDayViewModel", "queryBloodGlucoseDay error:" + it.getMessage());
            return BloodGlucoseDayViewModel.this.bloodGlucoseDayTransform.a(this.f4426j, this.k, new ArrayList(), new ArrayList(), new ArrayList());
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/oplus/aiunit/vision/v88;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    public static final class e<T> implements b24 {
        public e() {
        }

        @Override // com.oplus.aiunit.vision.b24
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull List<GluDayBean> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BloodGlucoseDayViewModel.this.y().postValue(it);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "it", "", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "a", "(Ljava/lang/Throwable;)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    public static final class f<T, R> implements g18 {
        public static final f<T, R> INSTANCE = new f<>();

        @Override // com.oplus.aiunit.vision.g18
        @NotNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final List<BloodSugar> apply(@NotNull Throwable it) {
            Intrinsics.checkNotNullParameter(it, "it");
            m8b.f("BloodGlucoseDayViewModel", "queryBloodGlucoseDay error:" + it.getMessage());
            return new ArrayList();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/heytap/databaseengine/model/bloodsugar/BloodSugar;", "it", "", "a", "(Ljava/util/List;)V"}, k = 3, mv = {1, 8, 0})
    public static final class g<T> implements b24 {
        public g() {
        }

        @Override // com.oplus.aiunit.vision.b24
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final void accept(@NotNull List<BloodSugar> it) {
            Intrinsics.checkNotNullParameter(it, "it");
            BloodGlucoseDayViewModel.this.B().postValue(it);
        }
    }

    @NotNull
    public final OLiveData<String> A() {
        return this.mObservableJumpUrl;
    }

    @NotNull
    public final OLiveData<List<BloodSugar>> B() {
        return this.mObservableLastData;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final OLiveData<List<BloodSugar>> C() {
        a aVarA = this.bloodGlucoseDayRepository.d().t0(f.INSTANCE).a(new g());
        Intrinsics.checkNotNullExpressionValue(aVarA, "@SuppressLint(\"CheckResu…mObservableLastData\n    }");
        u(aVarA);
        return this.mObservableLastData;
    }

    @SuppressLint({"CheckResult"})
    @NotNull
    public final OLiveData<List<GluDayBean>> D(long startTime, long endTime) {
        pr8 pr8Var = pr8.INSTANCE;
        m8b.f("BloodGlucoseDayViewModel", "queryBloodGlucoseDay startTime:" + pr8Var.y(startTime, "yyy-MM-dd HH:mm") + ",endTime:" + pr8Var.y(endTime, "yyy-MM-dd HH:mm"));
        ddd.j1(this.bloodGlucoseDayRepository.b(startTime, endTime), this.bloodGlucoseDayRepository.c(startTime, endTime, 0, 1), new c(startTime, endTime)).t0(new d(startTime, endTime)).a(new e());
        return this.mObservableGluData;
    }

    public final void E(@Nullable String model, boolean isWatch4) {
        StringBuilder sb = new StringBuilder();
        sb.append("queryGluDialUrl model:");
        sb.append(model);
        if (!TextUtils.isEmpty(model)) {
            BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), null, null, new BloodGlucoseDayViewModel$queryGluDialUrl$1(model, isWatch4, this, null), 3, null);
        } else {
            m8b.f("BloodGlucoseDayViewModel", "queryGluDialUrl model is null");
            this.mObservableJumpUrl.postValue("");
        }
    }

    public final void F(@Nullable String ssoId) {
        yj1 yj1Var = this.bloodGlucoseDayRepository;
        if (ssoId == null) {
            ssoId = cn.c().getSsoid();
            Intrinsics.checkNotNullExpressionValue(ssoId, "getAccountManager().ssoid");
        }
        yj1Var.e(ssoId);
    }

    @NotNull
    public final List<GluDayBean> w() {
        return this.bloodGlucoseDayTransform.c();
    }

    @NotNull
    public final OLiveData<List<BloodSugarStat>> x(long startTime, long endTime) {
        a aVarA = this.bloodGlucoseDayRepository.a(4, startTime, endTime, 0, 0).a(new b());
        Intrinsics.checkNotNullExpressionValue(aVarA, "fun getDataStatList(star…servableGluDataStat\n    }");
        u(aVarA);
        return this.mObservableGluDataStat;
    }

    @NotNull
    public final OLiveData<List<GluDayBean>> y() {
        return this.mObservableGluData;
    }

    @NotNull
    public final OLiveData<List<BloodSugarStat>> z() {
        return this.mObservableGluDataStat;
    }
}