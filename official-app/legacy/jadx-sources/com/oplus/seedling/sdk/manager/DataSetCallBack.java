package com.oplus.seedling.sdk.manager;

import androidx.annotation.Keep;
import com.oplus.seedling.sdk.seedling.ISeedling;
import com.oplus.seedling.sdk.seedling.SeedlingUIData;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H&J\u0016\u0010\b\u001a\u00020\u00032\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\nH&¨\u0006\u000b"}, d2 = {"Lcom/oplus/seedling/sdk/manager/DataSetCallBack;", "", "onReceiveData", "", "seedling", "Lcom/oplus/seedling/sdk/seedling/ISeedling;", "seedlingUIData", "Lcom/oplus/seedling/sdk/seedling/SeedlingUIData;", "onSeedlingSetChanged", "seedlings", "", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface DataSetCallBack {
    void onReceiveData(@NotNull ISeedling seedling, @Nullable SeedlingUIData seedlingUIData);

    void onSeedlingSetChanged(@NotNull List<? extends ISeedling> seedlings);
}
