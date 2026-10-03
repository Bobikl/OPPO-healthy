package com.heytap.store.product.service;

import androidx.fragment.app.Fragment;
import com.heytap.health.bandface.watchface.worldclock.cities.CityBean;
import com.heytap.store.platform.htrouter.facade.template.IProvider;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0014\u001a\u00020\u0015H&J\f\u0010\u0016\u001a\u0006\u0012\u0002\b\u00030\u0017H&J\b\u0010\u0018\u001a\u00020\u000fH&J\b\u0010\u0019\u001a\u00020\u000fH&J\b\u0010\u001a\u001a\u00020\u000fH&J\b\u0010\u001b\u001a\u00020\u000fH&J\b\u0010\u001c\u001a\u00020\u000fH&J\b\u0010\u001d\u001a\u00020\u0015H&J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020\u000fH&J\u0018\u0010 \u001a\u00020\u00152\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003H&R\u0018\u0010\u0002\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\u0004\u0010\u0005\"\u0004\b\u0006\u0010\u0007R\u0018\u0010\b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\u0005\"\u0004\b\n\u0010\u0007R\u0018\u0010\u000b\u001a\u00020\u0003X¦\u000e¢\u0006\f\u001a\u0004\b\f\u0010\u0005\"\u0004\b\r\u0010\u0007R\u0018\u0010\u000e\u001a\u00020\u000fX¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006$"}, d2 = {"Lcom/heytap/store/product/service/IProductService;", "Lcom/heytap/store/platform/htrouter/facade/template/IProvider;", "actionBarHeight", "", "getActionBarHeight", "()I", "setActionBarHeight", "(I)V", "bottomTabHeight", "getBottomTabHeight", "setBottomTabHeight", "categoryTabIndex", "getCategoryTabIndex", "setCategoryTabIndex", "experimentId", "", "getExperimentId", "()Ljava/lang/String;", "setExperimentId", "(Ljava/lang/String;)V", "clearSearchId", "", "getCategoryFragment", "Ljava/lang/Class;", "getFirstCategory", "getProductId", "getProductIdSpu", "getSearchId", "getSecondCategory", "preloadCategoryData", "saveProductBrowseHistory", "skuId", "scrollCategoryFragmentToPosition", "fragment", "Landroidx/fragment/app/Fragment;", CityBean.POS, "product-service_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface IProductService extends IProvider {
    void clearSearchId();

    int getActionBarHeight();

    int getBottomTabHeight();

    @NotNull
    Class<?> getCategoryFragment();

    int getCategoryTabIndex();

    @NotNull
    String getExperimentId();

    @NotNull
    String getFirstCategory();

    @NotNull
    String getProductId();

    @NotNull
    String getProductIdSpu();

    @NotNull
    String getSearchId();

    @NotNull
    String getSecondCategory();

    void preloadCategoryData();

    void saveProductBrowseHistory(@NotNull String skuId);

    void scrollCategoryFragmentToPosition(@NotNull Fragment fragment, int pos);

    void setActionBarHeight(int i);

    void setBottomTabHeight(int i);

    void setCategoryTabIndex(int i);

    void setExperimentId(@NotNull String str);
}
