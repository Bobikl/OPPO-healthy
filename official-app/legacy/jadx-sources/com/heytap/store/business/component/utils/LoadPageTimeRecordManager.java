package com.heytap.store.business.component.utils;

import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import java.util.HashMap;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\f\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0006\u0010\u000f\u001a\u00020\rJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u0014\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0010\u0010\u0015\u001a\u00020\u00162\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005J\u0018\u0010\u0017\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005J\u000e\u0010\u0019\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u001a\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010\u001b\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u001c\u001a\u00020\u0016J\u000e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u001e\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u000e\u0010\u001f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0005J\u0016\u0010 \u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00052\u0006\u0010!\u001a\u00020\u0005R7\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\t¨\u0006\""}, d2 = {"Lcom/heytap/store/business/component/utils/LoadPageTimeRecordManager;", "", "()V", "mPageMap", "Ljava/util/HashMap;", "", "Lcom/heytap/store/business/component/utils/LoadPageStatusData;", "Lkotlin/collections/HashMap;", "getMPageMap", "()Ljava/util/HashMap;", "mPageMap$delegate", "Lkotlin/Lazy;", "addPage", "", "pageKey", "clear", "getNetworkLoadTime", "", "getStartTime", "getValue", "initCache", "isHaveKey", "", "setApiUrl", "apiUrl", "setCacheLoad", "setLoadComplete", "setNetWorkSunccess", "isSuccess", "setNetworkEndTime", "setNetworkStartTime", "setOnLineDate", "setPageName", SensorsBean.PAGE_NAME, "widget_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class LoadPageTimeRecordManager {

    @NotNull
    public static final LoadPageTimeRecordManager INSTANCE = new LoadPageTimeRecordManager();

    /* JADX INFO: renamed from: mPageMap$delegate, reason: from kotlin metadata */
    @NotNull
    private static final Lazy mPageMap = LazyKt__LazyJVMKt.lazy(new Function0<HashMap<String, LoadPageStatusData>>() { // from class: com.heytap.store.business.component.utils.LoadPageTimeRecordManager$mPageMap$2
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final HashMap<String, LoadPageStatusData> invoke() {
            return new HashMap<>();
        }
    });

    private LoadPageTimeRecordManager() {
    }

    private final HashMap<String, LoadPageStatusData> getMPageMap() {
        return (HashMap) mPageMap.getValue();
    }

    public final void addPage(@NotNull String pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey)) {
            return;
        }
        getMPageMap().put(pageKey, new LoadPageStatusData(null, System.currentTimeMillis(), 0L, 0L, false, false, false, false, null, false, 1021, null));
    }

    public final void clear() {
        getMPageMap().clear();
    }

    public final long getNetworkLoadTime(@NotNull String pageKey) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (!getMPageMap().containsKey(pageKey) || (loadPageStatusData = getMPageMap().get(pageKey)) == null || loadPageStatusData.getNetWorkLoadEndTime() == 0 || loadPageStatusData.getNetWorkLoadStartTime() == 0) {
            return 0L;
        }
        return loadPageStatusData.getNetWorkLoadEndTime() - loadPageStatusData.getNetWorkLoadStartTime();
    }

    public final long getStartTime(@NotNull String pageKey) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            return loadPageStatusData.getStartTime();
        }
        return 0L;
    }

    @Nullable
    public final LoadPageStatusData getValue(@NotNull String pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        return getMPageMap().get(pageKey);
    }

    public final void initCache(@NotNull String pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (!getMPageMap().containsKey(pageKey)) {
            addPage(pageKey);
            return;
        }
        LoadPageStatusData loadPageStatusData = getMPageMap().get(pageKey);
        if (loadPageStatusData == null) {
            return;
        }
        loadPageStatusData.setCacheLoad(false);
        loadPageStatusData.setLoadComplete(false);
        loadPageStatusData.setNetWorkSuccess(false);
        loadPageStatusData.setOnLineDate(false);
        loadPageStatusData.setNetWorkLoadEndTime(0L);
        loadPageStatusData.setNetWorkLoadStartTime(0L);
    }

    public final boolean isHaveKey(@Nullable String pageKey) {
        return getMPageMap().containsKey(pageKey);
    }

    public final void setApiUrl(@NotNull String pageKey, @Nullable String apiUrl) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            if (apiUrl == null) {
                apiUrl = "";
            }
            loadPageStatusData.setApiUrl(apiUrl);
        }
    }

    public final void setCacheLoad(@NotNull String pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey)) {
            LoadPageStatusData loadPageStatusData = getMPageMap().get(pageKey);
            if (loadPageStatusData != null) {
                loadPageStatusData.setCacheLoad(true);
            }
            LoadPageStatusData loadPageStatusData2 = getMPageMap().get(pageKey);
            if (loadPageStatusData2 == null) {
                return;
            }
            loadPageStatusData2.setOnLineDate(false);
        }
    }

    public final void setLoadComplete(@NotNull String pageKey) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            loadPageStatusData.setLoadComplete(true);
        }
    }

    public final void setNetWorkSunccess(@NotNull String pageKey, boolean isSuccess) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            loadPageStatusData.setNetWorkSuccess(isSuccess);
        }
    }

    public final void setNetworkEndTime(@NotNull String pageKey) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            loadPageStatusData.setNetWorkLoadEndTime(System.currentTimeMillis());
        }
    }

    public final void setNetworkStartTime(@NotNull String pageKey) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            loadPageStatusData.setNetWorkLoadStartTime(System.currentTimeMillis());
        }
    }

    public final void setOnLineDate(@NotNull String pageKey) {
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        if (getMPageMap().containsKey(pageKey)) {
            LoadPageStatusData loadPageStatusData = getMPageMap().get(pageKey);
            if (loadPageStatusData != null) {
                loadPageStatusData.setCacheLoad(false);
            }
            LoadPageStatusData loadPageStatusData2 = getMPageMap().get(pageKey);
            if (loadPageStatusData2 == null) {
                return;
            }
            loadPageStatusData2.setOnLineDate(true);
        }
    }

    public final void setPageName(@NotNull String pageKey, @NotNull String page_name) {
        LoadPageStatusData loadPageStatusData;
        Intrinsics.checkNotNullParameter(pageKey, "pageKey");
        Intrinsics.checkNotNullParameter(page_name, "page_name");
        if (getMPageMap().containsKey(pageKey) && (loadPageStatusData = getMPageMap().get(pageKey)) != null) {
            loadPageStatusData.setPage_name(page_name);
        }
    }
}
