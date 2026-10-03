package com.oplus.seedling.sdk.callback;

import androidx.annotation.Keep;
import com.oplus.seedling.sdk.entity.UpkVersion;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0016\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H&¨\u0006\u0007"}, d2 = {"Lcom/oplus/seedling/sdk/callback/IUpkVersionObserver;", "", "onUpkVersionChanged", "", "newList", "", "Lcom/oplus/seedling/sdk/entity/UpkVersion;", "pantanal-client_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public interface IUpkVersionObserver {
    void onUpkVersionChanged(@NotNull List<UpkVersion> newList);
}
