package com.heytap.health.health.storemodel.viewmodel;

import androidx.lifecycle.MutableLiveData;
import com.heytap.health.base.base.BaseViewModel;
import com.heytap.health.health.storemodel.DataModel;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.msg;
import com.oplus.aiunit.vision.o14;
import com.oplus.aiunit.vision.uy9;
import com.oplus.aiunit.vision.z55;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import io.protostuff.MapSchema;
import io.reactivex.rxjava3.disposables.a;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\f\b&\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0019\u0010\u001aJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\u0018\u001a\u00020\u00118\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017¨\u0006\u001d"}, d2 = {"Lcom/heytap/health/health/storemodel/viewmodel/LastTimeViewModel;", "Lcom/heytap/health/base/base/BaseViewModel;", "Lcom/heytap/health/health/storemodel/DataModel;", "dataModel", "", "x", "v", "Landroidx/lifecycle/MutableLiveData;", "", "j", "Landroidx/lifecycle/MutableLiveData;", "w", "()Landroidx/lifecycle/MutableLiveData;", "lastDataTime", MapSchema.FIELD_NAME_KEY, "Lcom/heytap/health/health/storemodel/DataModel;", "dataMode", "Lcom/oplus/aiunit/vision/uy9;", LogFieldKey.LEVEL_KEY, "Lcom/oplus/aiunit/vision/uy9;", "getStoreModel", "()Lcom/oplus/aiunit/vision/uy9;", "y", "(Lcom/oplus/aiunit/vision/uy9;)V", "storeModel", "<init>", "()V", "Companion", "a", "health_release"}, k = 1, mv = {1, 8, 0})
public abstract class LastTimeViewModel extends BaseViewModel {
    public static final long CHART_NO_LAST_DATA_TIME = Long.MIN_VALUE;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public final MutableLiveData<Long> lastDataTime = new MutableLiveData<>();

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @NotNull
    public DataModel dataMode = DataModel.LAST;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    @NotNull
    public uy9 storeModel = new z55();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", ClickApiEntity.TIME, "", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    public static final class b<T> implements o14 {
        public b() {
        }

        public final void a(long j2) {
            a7b.f("StoreViewModelV2", "last time is " + j2);
            LastTimeViewModel.this.w().postValue(Long.valueOf(j2));
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Number) obj).longValue());
        }
    }

    public final void v() {
        if (this.dataMode == DataModel.NOW) {
            this.lastDataTime.postValue(Long.valueOf(System.currentTimeMillis()));
            return;
        }
        a aVarC = this.storeModel.a().J(new b()).c();
        Intrinsics.checkNotNullExpressionValue(aVarC, "fun fetchLastDataTime() …posable(disposable)\n    }");
        u(aVarC);
    }

    @NotNull
    public final MutableLiveData<Long> w() {
        return this.lastDataTime;
    }

    public final void x(@NotNull DataModel dataModel) {
        Intrinsics.checkNotNullParameter(dataModel, "dataModel");
        if (msg.a().c()) {
            dataModel = DataModel.LAST;
        }
        this.dataMode = dataModel;
    }

    public final void y(@NotNull uy9 uy9Var) {
        Intrinsics.checkNotNullParameter(uy9Var, "<set-?>");
        this.storeModel = uy9Var;
    }
}
