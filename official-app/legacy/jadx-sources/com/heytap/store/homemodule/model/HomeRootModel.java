package com.heytap.store.homemodule.model;

import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import androidx.annotation.MainThread;
import androidx.lifecycle.MutableLiveData;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import com.heytap.store.apm.util.DataReportUtilKt;
import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.heytap.store.base.core.util.RequestUtilsKt;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.homemodule.api.HomeApiService;
import com.heytap.store.homemodule.data.HomeResponseData;
import com.heytap.store.homemodule.data.HomeTabData;
import com.heytap.store.homemodule.data.HomeTabItemBean;
import com.heytap.store.homemodule.data.HomeTabItemDetail;
import com.heytap.store.homemodule.data.HomeTabResponseData;
import com.heytap.store.homemodule.model.HomeRootModel;
import com.heytap.store.homemodule.utils.OnResultCallback;
import com.heytap.store.homeservice.bean.ColorConfig;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.FileIOUtils;
import com.heytap.store.platform.tools.GsonUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.ovf;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.Unit;
import p010kotlin.collections.CollectionsKt__CollectionsKt;
import p010kotlin.collections.CollectionsKt___CollectionsKt;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000k\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\b\u0006*\u00014\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b7\u00108J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002J(\u0010\f\u001a\u00020\u00052\u0014\u0010\t\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\u00072\b\b\u0002\u0010\u000b\u001a\u00020\nH\u0007J\u001c\u0010\u0010\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030\u000ej\b\u0012\u0004\u0012\u00020\u0003`\u000f0\rJ\u0018\u0010\u0013\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0007J\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00140\rJ\u0006\u0010\u0017\u001a\u00020\u0005R\"\u0010\u0018\u001a\u00020\n8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\"\u0010\u001e\u001a\u00020\u001d8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001d\u0010&\u001a\b\u0012\u0004\u0012\u00020%0$8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001e\u0010*\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u001e\u0010,\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010+R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\n0$8\u0006¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010)R$\u0010/\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\b\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u00102\u001a\u0002018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106¨\u00069"}, d2 = {"Lcom/heytap/store/homemodule/model/HomeRootModel;", "", "", "Lcom/heytap/store/homemodule/data/HomeTabItemBean;", "list", "", "saveCacheAsync", "Lcom/heytap/store/homemodule/utils/OnResultCallback;", "", "callback", "", "preload", "getTabs", "Lcom/oplus/aiunit/vision/kbd;", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "getHomeTabAction", "Ljava/lang/Runnable;", "isNetWorkError", "getCacheAsync", "Lcom/heytap/store/homemodule/data/HomeResponseData;", "getToolBarAdIcon", "getGrayConfig", "clearCache", "isLoading", "Z", "()Z", "setLoading", "(Z)V", "", "tabString", "Ljava/lang/String;", "getTabString", "()Ljava/lang/String;", "setTabString", "(Ljava/lang/String;)V", "Landroidx/lifecycle/MutableLiveData;", "Lcom/heytap/store/homeservice/bean/ColorConfig;", "colorConfigLiveData", "Landroidx/lifecycle/MutableLiveData;", "getColorConfigLiveData", "()Landroidx/lifecycle/MutableLiveData;", "tabList", "Ljava/util/List;", "cachetTabList", "hasRecommendLiveData", "getHasRecommendLiveData", "pendingResultCallback", "Lcom/heytap/store/homemodule/utils/OnResultCallback;", "Landroid/os/Handler;", "mainHandler", "Landroid/os/Handler;", "com/heytap/store/homemodule/model/HomeRootModel$showCacheTask$1", "showCacheTask", "Lcom/heytap/store/homemodule/model/HomeRootModel$showCacheTask$1;", "<init>", "()V", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0})
public final class HomeRootModel {

    @Nullable
    private static List<HomeTabItemBean> cachetTabList;
    private static boolean isLoading;

    @Nullable
    private static OnResultCallback<List<HomeTabItemBean>> pendingResultCallback;

    @Nullable
    private static List<HomeTabItemBean> tabList;

    @NotNull
    public static final HomeRootModel INSTANCE = new HomeRootModel();

    @NotNull
    private static String tabString = "";

    @NotNull
    private static final MutableLiveData<ColorConfig> colorConfigLiveData = new MutableLiveData<>();

    @NotNull
    private static final MutableLiveData<Boolean> hasRecommendLiveData = new MutableLiveData<>();

    @NotNull
    private static Handler mainHandler = new Handler(Looper.getMainLooper());

    @NotNull
    private static final HomeRootModel$showCacheTask$1 showCacheTask = new HomeRootModel$showCacheTask$1();

    private HomeRootModel() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getCacheAsync$lambda-4, reason: not valid java name */
    public static final void m4975getCacheAsync$lambda4(HomeRootModel this$0, boolean z, Runnable callback) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(callback, "$callback");
        synchronized (this$0) {
            cachetTabList = null;
            showCacheTask.setNetWorkError(z);
            String file2String = FileIOUtils.INSTANCE.readFile2String(HomeRootModelKt.CACHE_FILE_PATH);
            if (TextUtils.isEmpty(file2String)) {
                mainHandler.post(callback);
                return;
            }
            JsonArray asJsonArray = new JsonParser().parse(file2String).getAsJsonArray();
            if (asJsonArray != null && asJsonArray.size() > 0) {
                cachetTabList = new ArrayList();
                Iterator<JsonElement> it = asJsonArray.iterator();
                while (it.hasNext()) {
                    HomeTabItemBean homeTabItemBean = (HomeTabItemBean) GsonUtils.INSTANCE.fromJson(it.next().toString(), HomeTabItemBean.class);
                    List<HomeTabItemBean> list = cachetTabList;
                    if (list != null) {
                        list.add(homeTabItemBean);
                    }
                }
                mainHandler.post(callback);
                Unit unit = Unit.INSTANCE;
                return;
            }
            mainHandler.post(callback);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: getHomeTabAction$lambda-2, reason: not valid java name */
    public static final ArrayList m4976getHomeTabAction$lambda2(HomeTabResponseData responseData) {
        HomeTabData homeTabData;
        HomeTabData homeTabData2;
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        LogUtils.INSTANCE.d("HomeRootModel", Intrinsics.stringPlus("getTabs icons = ", responseData));
        ArrayList arrayList = new ArrayList();
        Integer code = responseData.getCode();
        if ((code == null ? -1 : code.intValue()) == 200) {
            List<HomeTabData> data = responseData.getData();
            List<HomeTabItemDetail> listEmptyList = null;
            List<HomeTabItemDetail> details = (data == null || (homeTabData = (HomeTabData) CollectionsKt___CollectionsKt.getOrNull(data, 0)) == null) ? null : homeTabData.getDetails();
            if (!(details == null || details.isEmpty())) {
                HomeTabItemBean.Companion companion = HomeTabItemBean.INSTANCE;
                List<HomeTabData> data2 = responseData.getData();
                if (data2 != null && (homeTabData2 = data2.get(0)) != null) {
                    listEmptyList = homeTabData2.getDetails();
                }
                if (listEmptyList == null) {
                    listEmptyList = CollectionsKt__CollectionsKt.emptyList();
                }
                arrayList.addAll(companion.homeTabItemDetail2TabItemBean(listEmptyList));
                return arrayList;
            }
        }
        arrayList.add(HomeTabItemBean.INSTANCE.createMainItemTab());
        return arrayList;
    }

    public static /* synthetic */ void getTabs$default(HomeRootModel homeRootModel, OnResultCallback onResultCallback, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        homeRootModel.getTabs(onResultCallback, z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveCacheAsync(List<HomeTabItemBean> list) {
        cachetTabList = list;
        AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.oplus.aiunit.vision.yd9
            @Override // java.lang.Runnable
            public final void run() {
                HomeRootModel.m4977saveCacheAsync$lambda6(this.i);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: saveCacheAsync$lambda-6, reason: not valid java name */
    public static final void m4977saveCacheAsync$lambda6(HomeRootModel this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        synchronized (this$0) {
            List<HomeTabItemBean> list = cachetTabList;
            if (list == null || list.isEmpty()) {
                return;
            }
            JsonParser jsonParser = new JsonParser();
            Gson gson = new Gson();
            JsonArray jsonArray = new JsonArray();
            List<HomeTabItemBean> list2 = cachetTabList;
            Intrinsics.checkNotNull(list2);
            Iterator<HomeTabItemBean> it = list2.iterator();
            while (it.hasNext()) {
                jsonArray.add(jsonParser.parse(gson.toJson(it.next())));
            }
            try {
                FileIOUtils.INSTANCE.writeFileFromString(HomeRootModelKt.CACHE_FILE_PATH, gson.toJson((JsonElement) jsonArray));
            } catch (Exception e2) {
                DataReportUtilKt.reportExceptionEvent(e2);
                LogUtils.INSTANCE.e("HomeRootModel", Intrinsics.stringPlus("saveCacheAsync e = ", e2));
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void clearCache() {
        tabList = null;
        cachetTabList = null;
    }

    @MainThread
    public final void getCacheAsync(@NotNull final Runnable callback, final boolean isNetWorkError) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.oplus.aiunit.vision.wd9
            @Override // java.lang.Runnable
            public final void run() {
                HomeRootModel.m4975getCacheAsync$lambda4(this.i, isNetWorkError, callback);
            }
        });
    }

    @NotNull
    public final MutableLiveData<ColorConfig> getColorConfigLiveData() {
        return colorConfigLiveData;
    }

    @NotNull
    public final kbd<HomeResponseData> getGrayConfig() {
        return ((HomeApiService) ovf.e(ovf.INSTANCE, HomeApiService.class, null, 2, null)).getGrayConfig();
    }

    @NotNull
    public final MutableLiveData<Boolean> getHasRecommendLiveData() {
        return hasRecommendLiveData;
    }

    @NotNull
    public final kbd<ArrayList<HomeTabItemBean>> getHomeTabAction() {
        kbd kbdVarQ = ((HomeApiService) ovf.e(ovf.INSTANCE, HomeApiService.class, null, 2, null)).getHomeTabs().q(new j08() { // from class: com.oplus.aiunit.vision.xd9
            @Override // com.oplus.aiunit.vision.j08
            public final Object apply(Object obj) {
                return HomeRootModel.m4976getHomeTabAction$lambda2((HomeTabResponseData) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(kbdVarQ, "RetrofitManager\n        …abItemBeans\n            }");
        return kbdVarQ;
    }

    @NotNull
    public final String getTabString() {
        return tabString;
    }

    @MainThread
    public final void getTabs(@Nullable OnResultCallback<List<HomeTabItemBean>> callback, boolean preload) {
        if (preload && pendingResultCallback != null) {
            LogUtils.INSTANCE.d("HomeRootModel", "preload cannot start after normal loading started");
            return;
        }
        pendingResultCallback = callback;
        if (isLoading) {
            LogUtils.INSTANCE.d("HomeRootModel", "getTabs isLoading = true");
            return;
        }
        if (!ConnectivityManagerProxy.hasAvailableNet(ContextGetterUtils.INSTANCE.getApp())) {
            LogUtils.INSTANCE.d("HomeRootModel", "getRecommendData network is not available");
            getCacheAsync(showCacheTask, true);
            return;
        }
        List<HomeTabItemBean> list = tabList;
        if (list != null) {
            LogUtils.INSTANCE.d("HomeRootModel", "getRecommendData use loaded response data");
            OnResultCallback<List<HomeTabItemBean>> onResultCallback = pendingResultCallback;
            if (onResultCallback != null) {
                onResultCallback.onSuccess(list, false);
            }
            pendingResultCallback = null;
            return;
        }
        List<HomeTabItemBean> list2 = cachetTabList;
        if (list2 != null) {
            LogUtils.INSTANCE.d("HomeRootModel", "getRecommendData use loaded cache data");
            OnResultCallback<List<HomeTabItemBean>> onResultCallback2 = pendingResultCallback;
            if (onResultCallback2 != null) {
                onResultCallback2.onSuccess(list2, true);
            }
            pendingResultCallback = null;
        }
        isLoading = true;
        RequestUtilsKt.request$default(getHomeTabAction(), null, new Function1<Throwable, Unit>() { // from class: com.heytap.store.homemodule.model.HomeRootModel.getTabs.3
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Throwable it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LogUtils.INSTANCE.d("HomeRootModel", Intrinsics.stringPlus("getTabs onFail = ", it));
                HomeRootModel homeRootModel = HomeRootModel.INSTANCE;
                homeRootModel.setLoading(false);
                homeRootModel.getCacheAsync(HomeRootModel.showCacheTask, (it.getCause() instanceof UnknownHostException) || (it.getCause() instanceof SocketTimeoutException) || (it.getCause() instanceof IOException));
            }
        }, new Function1<ArrayList<HomeTabItemBean>, Unit>() { // from class: com.heytap.store.homemodule.model.HomeRootModel.getTabs.4
            @Override // p010kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(ArrayList<HomeTabItemBean> arrayList) {
                invoke2(arrayList);
                return Unit.INSTANCE;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull ArrayList<HomeTabItemBean> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                LogUtils.INSTANCE.d("HomeRootModel", Intrinsics.stringPlus("getTabs onSuccess = ", it));
                HomeRootModel homeRootModel = HomeRootModel.INSTANCE;
                homeRootModel.setLoading(false);
                HomeRootModel.mainHandler.removeCallbacks(HomeRootModel.showCacheTask);
                HomeRootModel.tabList = it;
                OnResultCallback onResultCallback3 = HomeRootModel.pendingResultCallback;
                if (onResultCallback3 != null) {
                    onResultCallback3.onSuccess(it, false);
                }
                HomeRootModel.pendingResultCallback = null;
                homeRootModel.saveCacheAsync(it);
            }
        }, 1, null);
    }

    @NotNull
    public final kbd<HomeResponseData> getToolBarAdIcon() {
        return ((HomeApiService) ovf.e(ovf.INSTANCE, HomeApiService.class, null, 2, null)).getToolBarAdIcon();
    }

    public final boolean isLoading() {
        return isLoading;
    }

    public final void setLoading(boolean z) {
        isLoading = z;
    }

    public final void setTabString(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        tabString = str;
    }
}
