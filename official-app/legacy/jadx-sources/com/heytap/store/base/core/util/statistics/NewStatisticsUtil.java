package com.heytap.store.base.core.util.statistics;

import com.heytap.store.base.core.util.statistics.bean.SensorsBean;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Lazy;
import p010kotlin.LazyKt__LazyJVMKt;
import p010kotlin.Metadata;
import p010kotlin.jvm.JvmStatic;
import p010kotlin.jvm.functions.Function0;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0005¢\u0006\u0002\u0010\u0002JT\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\b\u0010\f\u001a\u0004\u0018\u00010\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u0006JB\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\r\u001a\u0004\u0018\u00010\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J6\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006¨\u0006\u0016"}, d2 = {"Lcom/heytap/store/base/core/util/statistics/NewStatisticsUtil;", "", "()V", "appClick", "", "pageId", "", "pageName", "moduleId", "positionId", "elementId", "elementName", "shopName", "skuId", "spuId", "appViewScreen", "pageViewType", "pageLoadTime", "", "pageStayTime", "elementClick", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class NewStatisticsUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Lazy<NewStatisticsUtil> instance$delegate = LazyKt__LazyJVMKt.lazy(new Function0<NewStatisticsUtil>() { // from class: com.heytap.store.base.core.util.statistics.NewStatisticsUtil$Companion$instance$2
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // p010kotlin.jvm.functions.Function0
        @NotNull
        public final NewStatisticsUtil invoke() {
            return new NewStatisticsUtil();
        }
    });

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R!\u0010\u0003\u001a\u00020\u00048FX\u0087\u0084\u0002¢\u0006\u0012\n\u0004\b\b\u0010\t\u0012\u0004\b\u0005\u0010\u0002\u001a\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/heytap/store/base/core/util/statistics/NewStatisticsUtil$Companion;", "", "()V", "instance", "Lcom/heytap/store/base/core/util/statistics/NewStatisticsUtil;", "getInstance$annotations", "getInstance", "()Lcom/heytap/store/base/core/util/statistics/NewStatisticsUtil;", "instance$delegate", "Lkotlin/Lazy;", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        public static /* synthetic */ void getInstance$annotations() {
        }

        @NotNull
        public final NewStatisticsUtil getInstance() {
            return (NewStatisticsUtil) NewStatisticsUtil.instance$delegate.getValue();
        }
    }

    @NotNull
    public static final NewStatisticsUtil getInstance() {
        return INSTANCE.getInstance();
    }

    public final void appClick(@NotNull String pageId, @NotNull String pageName, @NotNull String moduleId, @NotNull String positionId, @NotNull String elementId, @NotNull String elementName, @Nullable String shopName, @Nullable String skuId, @Nullable String spuId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("page_id", pageId);
        sensorsBean.setValue(SensorsBean.PAGE_NAME, pageName);
        sensorsBean.setValue("module_id", moduleId);
        sensorsBean.setValue(SensorsBean.POSITION_ID, positionId);
        sensorsBean.setValue(SensorsBean.ELEMENT_ID, elementId);
        sensorsBean.setValue(SensorsBean.ELEMENT_NAME, elementName);
        if (skuId != null) {
            sensorsBean.setValue(SensorsBean.SKU_ID, skuId);
        }
        if (spuId != null) {
            sensorsBean.setValue(SensorsBean.SPU_ID, spuId);
        }
        if (shopName == null) {
            shopName = "";
        }
        sensorsBean.setValue(SensorsBean.SHOP_NAME, shopName);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.AppClick, sensorsBean);
    }

    public final void appViewScreen(@NotNull String pageId, @NotNull String pageName, @Nullable String skuId, @Nullable String spuId, @NotNull String pageViewType, long pageLoadTime, long pageStayTime) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(pageViewType, "pageViewType");
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("page_id", pageId);
        sensorsBean.setValue(SensorsBean.PAGE_NAME, pageName);
        if (skuId != null) {
            sensorsBean.setValue(SensorsBean.SKU_ID, skuId);
        }
        if (spuId != null) {
            sensorsBean.setValue(SensorsBean.SPU_ID, spuId);
        }
        sensorsBean.setValue(SensorsBean.PAGE_VIEW_TYPE, pageViewType);
        sensorsBean.setValue(SensorsBean.PAGE_LOAD_TIME, pageLoadTime);
        sensorsBean.setValue(SensorsBean.PAGE_STAY_TIME, pageStayTime);
        StatisticsUtil.sensorsStatistics(StatisticsUtil.AppViewScreen, sensorsBean);
    }

    public final void elementClick(@NotNull String pageId, @NotNull String pageName, @NotNull String moduleId, @NotNull String positionId, @NotNull String elementId, @NotNull String elementName) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(pageName, "pageName");
        Intrinsics.checkNotNullParameter(moduleId, "moduleId");
        Intrinsics.checkNotNullParameter(positionId, "positionId");
        Intrinsics.checkNotNullParameter(elementId, "elementId");
        Intrinsics.checkNotNullParameter(elementName, "elementName");
        SensorsBean sensorsBean = new SensorsBean();
        sensorsBean.setValue("page_id", pageId);
        sensorsBean.setValue(SensorsBean.PAGE_NAME, pageName);
        sensorsBean.setValue("module_id", moduleId);
        sensorsBean.setValue(SensorsBean.POSITION_ID, positionId);
        sensorsBean.setValue(SensorsBean.ELEMENT_ID, elementId);
        sensorsBean.setValue(SensorsBean.ELEMENT_NAME, elementName);
        StatisticsUtil.sensorsStatistics("ElementClick", sensorsBean);
    }
}
