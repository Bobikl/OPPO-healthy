package com.heytap.health.sport.services;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.heytap.health.base.base.BaseActivity;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes18.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010\b\u001a\u00020\u0007H&J\b\u0010\t\u001a\u00020\u0004H&¨\u0006\n"}, d2 = {"Lcom/heytap/health/sport/services/SportRecommendService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "Lcom/heytap/health/base/base/BaseActivity;", "activity", "", "T0", "(Lcom/heytap/health/base/base/BaseActivity;Landroidx/compose/runtime/Composer;I)V", "", "Va", "t5", "sport_release"}, k = 1, mv = {1, 8, 0})
public interface SportRecommendService extends IProvider {
    @Composable
    void T0(@NotNull BaseActivity baseActivity, @Nullable Composer composer, int i);

    boolean Va();

    void t5();
}
