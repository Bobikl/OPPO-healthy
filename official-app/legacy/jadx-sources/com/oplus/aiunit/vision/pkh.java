package com.oplus.aiunit.vision;

import androidx.compose.runtime.internal.StabilityInferred;
import com.heytap.health.base.livedata.OLiveData;
import java.util.concurrent.TimeUnit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\r\u0010\u000eJ\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002J\u0006\u0010\u0006\u001a\u00020\u0005R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/oplus/aiunit/vision/pkh;", "", "Lcom/heytap/health/base/livedata/OLiveData;", "", "b", "", "c", "Lio/reactivex/rxjava3/disposables/a;", "a", "Lio/reactivex/rxjava3/disposables/a;", "realTimeDisposable", "Lcom/heytap/health/base/livedata/OLiveData;", "realTimeLiveData", "<init>", "()V", "sleep_release"}, k = 1, mv = {1, 8, 0})
public final class pkh {
    public static final int $stable = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    @Nullable
    public io.reactivex.rxjava3.disposables.a realTimeDisposable;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    @NotNull
    public OLiveData<Long> realTimeLiveData = new OLiveData<>();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "", "a", "(J)V"}, k = 3, mv = {1, 8, 0})
    public static final class a<T> implements o14 {
        public a() {
        }

        public final void a(long j2) {
            pkh.this.realTimeLiveData.postValue(Long.valueOf(j2));
        }

        @Override // com.oplus.aiunit.vision.o14
        public /* bridge */ /* synthetic */ void accept(Object obj) {
            a(((Number) obj).longValue());
        }
    }

    @NotNull
    public final OLiveData<Long> b() {
        c();
        this.realTimeDisposable = lbd.e0(2L, TimeUnit.SECONDS).L0(su8.c()).n0(f30.c()).a(new a());
        return this.realTimeLiveData;
    }

    public final void c() {
        io.reactivex.rxjava3.disposables.a aVar = this.realTimeDisposable;
        if (aVar != null) {
            if (aVar != null) {
                aVar.dispose();
            }
            this.realTimeDisposable = null;
        }
    }
}
