package com.oplus.smartsdk.themecard;

import android.content.Context;
import com.oplus.smartsdk.ISmartViewApi;
import kotlin.Metadata;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u001c\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H&¨\u0006\n"}, d2 = {"Lcom/oplus/smartsdk/themecard/ApiLoader;", "", "isForceLoad", "", "context", "Landroid/content/Context;", "loadApi", "Lkotlin/Pair;", "Lcom/oplus/smartsdk/ISmartViewApi;", "hostContext", "com.oplus.smartsdk.smartenginesdk"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface ApiLoader {
    boolean isForceLoad(@NotNull Context context);

    @NotNull
    Pair<ISmartViewApi, Context> loadApi(@NotNull Context hostContext) throws Throwable;
}
