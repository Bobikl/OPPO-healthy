package com.platform.usercenter.basic.core.mvvm.calladapter;

import androidx.lifecycle.LiveData;
import com.oplus.aiunit.vision.at2;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.zr2;
import com.oplus.aiunit.vision.ztf;
import com.platform.usercenter.basic.core.mvvm.ApiResponse;
import java.lang.reflect.Type;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes9.dex */
public class LiveDataCallAdapter<R> implements zr2<R, LiveData<ApiResponse<R>>> {
    private final Type responseType;

    public LiveDataCallAdapter(Type type) {
        this.responseType = type;
    }

    @Override // com.oplus.aiunit.vision.zr2
    public Type responseType() {
        return this.responseType;
    }

    @Override // com.oplus.aiunit.vision.zr2
    public LiveData<ApiResponse<R>> adapt(final xr2<R> xr2Var) {
        return new LiveData<ApiResponse<R>>() { // from class: com.platform.usercenter.basic.core.mvvm.calladapter.LiveDataCallAdapter.1
            final AtomicBoolean started = new AtomicBoolean(false);

            @Override // androidx.lifecycle.LiveData
            public void onActive() {
                super.onActive();
                if (this.started.compareAndSet(false, true)) {
                    xr2Var.h(new at2<R>() { // from class: com.platform.usercenter.basic.core.mvvm.calladapter.LiveDataCallAdapter.1.1
                        @Override // com.oplus.aiunit.vision.at2
                        public void onFailure(@NotNull xr2<R> xr2Var2, @NotNull Throwable th) {
                            postValue(new ApiResponse(xr2Var2, th));
                        }

                        @Override // com.oplus.aiunit.vision.at2
                        public void onResponse(@NotNull xr2<R> xr2Var2, @NotNull ztf<R> ztfVar) {
                            postValue(new ApiResponse(xr2Var2, ztfVar));
                        }
                    });
                }
            }
        };
    }
}
