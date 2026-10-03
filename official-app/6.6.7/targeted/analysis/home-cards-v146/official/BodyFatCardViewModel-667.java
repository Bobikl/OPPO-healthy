package com.heytap.health.bodyfat.viewmodel;

import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.ViewModelKt;
import com.github.mikephil.charting.data.Entry;
import com.heytap.databaseengine.model.weight.WeightBodyFat;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.base.livedata.OLiveData;
import com.heytap.health.core.widget.charts.data.SmartScaleCircleFlagEntry;
import com.oplus.aiunit.vision.bz1;
import com.oplus.aiunit.vision.gw1;
import io.protostuff.MapSchema;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Dispatchers;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes15.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0001\u001aB\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0006\u0010\u0003\u001a\u00020\u0002J$\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002R\u001b\u0010\u0010\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\r\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u001b"}, d2 = {"Lcom/heytap/health/bodyfat/viewmodel/BodyFatCardViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "", "x", "", "startTime", "", "Lcom/heytap/databaseengine/model/weight/WeightBodyFat;", "dataList", "Lcom/github/mikephil/charting/data/Entry;", "y", "Lcom/oplus/aiunit/vision/bz1;", "j", "Lkotlin/Lazy;", "A", "()Lcom/oplus/aiunit/vision/bz1;", "repository", "Lcom/heytap/health/base/livedata/OLiveData;", "Lcom/oplus/aiunit/vision/gw1;", MapSchema.FIELD_NAME_KEY, "z", "()Lcom/heytap/health/base/livedata/OLiveData;", "dataListLiveData", "<init>", "()V", "Companion", "a", "bodyfat_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nBodyFatCardViewModel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BodyFatCardViewModel.kt\ncom/heytap/health/bodyfat/viewmodel/BodyFatCardViewModel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,131:1\n1855#2,2:132\n*S KotlinDebug\n*F\n+ 1 BodyFatCardViewModel.kt\ncom/heytap/health/bodyfat/viewmodel/BodyFatCardViewModel\n*L\n110#1:132,2\n*E\n"})
public final class BodyFatCardViewModel extends BaseViewModel {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final Lazy repository = LazyKt__LazyJVMKt.lazy(new Function0<bz1>() { // from class: com.heytap.health.bodyfat.viewmodel.BodyFatCardViewModel$repository$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final bz1 invoke() {
            return new bz1();
        }
    });

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public final Lazy dataListLiveData = LazyKt__LazyJVMKt.lazy(new Function0<OLiveData<gw1>>() { // from class: com.heytap.health.bodyfat.viewmodel.BodyFatCardViewModel$dataListLiveData$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final OLiveData<gw1> invoke() {
            return new OLiveData<>();
        }
    });
    public static final int $stable = 8;

    public final bz1 A() {
        return (bz1) this.repository.getValue();
    }

    public final void x() {
        BuildersKt__Builders_commonKt.launch$default(ViewModelKt.getViewModelScope(this), Dispatchers.getIO(), null, new BodyFatCardViewModel$fetchCardDataList$1(this, null), 2, null);
    }

    public final List<Entry> y(long startTime, List<? extends WeightBodyFat> dataList) {
        ZoneId zoneIdSystemDefault = ZoneId.systemDefault();
        LocalDateTime localDateTimeOfInstant = LocalDateTime.ofInstant(Instant.ofEpochMilli(startTime), zoneIdSystemDefault);
        ArrayList arrayList = new ArrayList();
        for (long j2 = 0; j2 < 7; j2++) {
            arrayList.add(new Entry(j2, 0.0f));
        }
        for (WeightBodyFat weightBodyFat : dataList) {
            StringBuilder sb = new StringBuilder();
            sb.append("db item:");
            sb.append(weightBodyFat);
            int epochDay = (int) (LocalDateTime.ofInstant(Instant.ofEpochMilli(weightBodyFat.getMeasurementTime()), zoneIdSystemDefault).toLocalDate().toEpochDay() - localDateTimeOfInstant.toLocalDate().toEpochDay());
            if (epochDay < arrayList.size() && epochDay >= 0) {
                String weight = weightBodyFat.getWeight();
                Intrinsics.checkNotNullExpressionValue(weight, "item.weight");
                arrayList.set(epochDay, new SmartScaleCircleFlagEntry(epochDay, Float.parseFloat(weight) / 1000, weightBodyFat.getMeasurementTime(), false, weightBodyFat));
            }
        }
        return arrayList;
    }

    @NotNull
    public final OLiveData<gw1> z() {
        return (OLiveData) this.dataListLiveData.getValue();
    }
}