package com.heytap.store.homemodule.adapter;

import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.RecyclerView;
import com.heytap.store.homemodule.adapter.viewholder.HomeParallaxBannerHolder;
import com.heytap.store.homemodule.data.ThemeInfo;
import com.heytap.store.product_support.interfaces.INestedScrollListener;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b3\u0018\u00002\u00020\u0001B\u00ad\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0010\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\u0006\u0010\u0014\u001a\u00020\r\u0012\u0006\u0010\u0015\u001a\u00020\u0010\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001b\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u001e\u001a\u00020\r¢\u0006\u0002\u0010\u001fR\u001a\u0010\u0011\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001a\u0010\u001d\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010'\"\u0004\b*\u0010)R\u001a\u0010\u001c\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010'\"\u0004\b+\u0010)R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010'\"\u0004\b,\u0010)R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0002\u0010'\"\u0004\b-\u0010)R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u0011\u0010\u000e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001a\u0010\u0014\u001a\u00020\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b:\u00105\"\u0004\b;\u0010<R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010B\"\u0004\bC\u0010DR\u0011\u0010\u001e\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bE\u00105R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\bF\u00105R\u001a\u0010\u0015\u001a\u00020\u0010X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\bI\u0010!R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0013X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010K\"\u0004\bL\u0010M¨\u0006N"}, d2 = {"Lcom/heytap/store/homemodule/adapter/HomeEnvironment;", "", "isPad", "", "isLandscape", "requestElapsedRealtime", "", "isAdapterPageBegunVisible", "fm", "Landroidx/fragment/app/FragmentManager;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "tabName", "", "omsId", "tabType", "", "bottomTabPadding", "theme", "Lcom/heytap/store/homemodule/data/ThemeInfo;", "recommendAction", "tabPosition", "nestedScrollListener", "Lcom/heytap/store/product_support/interfaces/INestedScrollListener;", "pageChangeListener", "Lcom/heytap/store/homemodule/adapter/viewholder/HomeParallaxBannerHolder$PageChangeCallBack;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "isBlackCardArea", "fromStayStrategy", "sceneReveal", "(ZZJZLandroidx/fragment/app/FragmentManager;Landroidx/lifecycle/Lifecycle;Ljava/lang/String;Ljava/lang/String;IILcom/heytap/store/homemodule/data/ThemeInfo;Ljava/lang/String;ILcom/heytap/store/product_support/interfaces/INestedScrollListener;Lcom/heytap/store/homemodule/adapter/viewholder/HomeParallaxBannerHolder$PageChangeCallBack;Landroidx/recyclerview/widget/RecyclerView;ZZLjava/lang/String;)V", "getBottomTabPadding", "()I", "setBottomTabPadding", "(I)V", "getFm", "()Landroidx/fragment/app/FragmentManager;", "getFromStayStrategy", "()Z", "setFromStayStrategy", "(Z)V", "setAdapterPageBegunVisible", "setBlackCardArea", "setLandscape", "setPad", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "getNestedScrollListener", "()Lcom/heytap/store/product_support/interfaces/INestedScrollListener;", "setNestedScrollListener", "(Lcom/heytap/store/product_support/interfaces/INestedScrollListener;)V", "getOmsId", "()Ljava/lang/String;", "getPageChangeListener", "()Lcom/heytap/store/homemodule/adapter/viewholder/HomeParallaxBannerHolder$PageChangeCallBack;", "setPageChangeListener", "(Lcom/heytap/store/homemodule/adapter/viewholder/HomeParallaxBannerHolder$PageChangeCallBack;)V", "getRecommendAction", "setRecommendAction", "(Ljava/lang/String;)V", "getRecyclerView", "()Landroidx/recyclerview/widget/RecyclerView;", "setRecyclerView", "(Landroidx/recyclerview/widget/RecyclerView;)V", "getRequestElapsedRealtime", "()J", "setRequestElapsedRealtime", "(J)V", "getSceneReveal", "getTabName", "getTabPosition", "setTabPosition", "getTabType", "getTheme", "()Lcom/heytap/store/homemodule/data/ThemeInfo;", "setTheme", "(Lcom/heytap/store/homemodule/data/ThemeInfo;)V", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class HomeEnvironment {
    private int bottomTabPadding;

    @NotNull
    private final FragmentManager fm;
    private boolean fromStayStrategy;
    private boolean isAdapterPageBegunVisible;
    private boolean isBlackCardArea;
    private boolean isLandscape;
    private boolean isPad;

    @NotNull
    private final Lifecycle lifecycle;

    @Nullable
    private INestedScrollListener nestedScrollListener;

    @NotNull
    private final String omsId;

    @Nullable
    private HomeParallaxBannerHolder.PageChangeCallBack pageChangeListener;

    @NotNull
    private String recommendAction;

    @Nullable
    private RecyclerView recyclerView;
    private long requestElapsedRealtime;

    @NotNull
    private final String sceneReveal;

    @NotNull
    private final String tabName;
    private int tabPosition;
    private final int tabType;

    @Nullable
    private ThemeInfo theme;

    public HomeEnvironment(boolean z, boolean z2, long j2, boolean z3, @NotNull FragmentManager fm, @NotNull Lifecycle lifecycle, @NotNull String tabName, @NotNull String omsId, int i, int i2, @Nullable ThemeInfo themeInfo, @NotNull String recommendAction, int i3, @Nullable INestedScrollListener iNestedScrollListener, @Nullable HomeParallaxBannerHolder.PageChangeCallBack pageChangeCallBack, @Nullable RecyclerView recyclerView, boolean z4, boolean z5, @NotNull String sceneReveal) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(tabName, "tabName");
        Intrinsics.checkNotNullParameter(omsId, "omsId");
        Intrinsics.checkNotNullParameter(recommendAction, "recommendAction");
        Intrinsics.checkNotNullParameter(sceneReveal, "sceneReveal");
        this.isPad = z;
        this.isLandscape = z2;
        this.requestElapsedRealtime = j2;
        this.isAdapterPageBegunVisible = z3;
        this.fm = fm;
        this.lifecycle = lifecycle;
        this.tabName = tabName;
        this.omsId = omsId;
        this.tabType = i;
        this.bottomTabPadding = i2;
        this.theme = themeInfo;
        this.recommendAction = recommendAction;
        this.tabPosition = i3;
        this.nestedScrollListener = iNestedScrollListener;
        this.pageChangeListener = pageChangeCallBack;
        this.recyclerView = recyclerView;
        this.isBlackCardArea = z4;
        this.fromStayStrategy = z5;
        this.sceneReveal = sceneReveal;
    }

    public final int getBottomTabPadding() {
        return this.bottomTabPadding;
    }

    @NotNull
    public final FragmentManager getFm() {
        return this.fm;
    }

    public final boolean getFromStayStrategy() {
        return this.fromStayStrategy;
    }

    @NotNull
    public final Lifecycle getLifecycle() {
        return this.lifecycle;
    }

    @Nullable
    public final INestedScrollListener getNestedScrollListener() {
        return this.nestedScrollListener;
    }

    @NotNull
    public final String getOmsId() {
        return this.omsId;
    }

    @Nullable
    public final HomeParallaxBannerHolder.PageChangeCallBack getPageChangeListener() {
        return this.pageChangeListener;
    }

    @NotNull
    public final String getRecommendAction() {
        return this.recommendAction;
    }

    @Nullable
    public final RecyclerView getRecyclerView() {
        return this.recyclerView;
    }

    public final long getRequestElapsedRealtime() {
        return this.requestElapsedRealtime;
    }

    @NotNull
    public final String getSceneReveal() {
        return this.sceneReveal;
    }

    @NotNull
    public final String getTabName() {
        return this.tabName;
    }

    public final int getTabPosition() {
        return this.tabPosition;
    }

    public final int getTabType() {
        return this.tabType;
    }

    @Nullable
    public final ThemeInfo getTheme() {
        return this.theme;
    }

    /* JADX INFO: renamed from: isAdapterPageBegunVisible, reason: from getter */
    public final boolean getIsAdapterPageBegunVisible() {
        return this.isAdapterPageBegunVisible;
    }

    /* JADX INFO: renamed from: isBlackCardArea, reason: from getter */
    public final boolean getIsBlackCardArea() {
        return this.isBlackCardArea;
    }

    /* JADX INFO: renamed from: isLandscape, reason: from getter */
    public final boolean getIsLandscape() {
        return this.isLandscape;
    }

    /* JADX INFO: renamed from: isPad, reason: from getter */
    public final boolean getIsPad() {
        return this.isPad;
    }

    public final void setAdapterPageBegunVisible(boolean z) {
        this.isAdapterPageBegunVisible = z;
    }

    public final void setBlackCardArea(boolean z) {
        this.isBlackCardArea = z;
    }

    public final void setBottomTabPadding(int i) {
        this.bottomTabPadding = i;
    }

    public final void setFromStayStrategy(boolean z) {
        this.fromStayStrategy = z;
    }

    public final void setLandscape(boolean z) {
        this.isLandscape = z;
    }

    public final void setNestedScrollListener(@Nullable INestedScrollListener iNestedScrollListener) {
        this.nestedScrollListener = iNestedScrollListener;
    }

    public final void setPad(boolean z) {
        this.isPad = z;
    }

    public final void setPageChangeListener(@Nullable HomeParallaxBannerHolder.PageChangeCallBack pageChangeCallBack) {
        this.pageChangeListener = pageChangeCallBack;
    }

    public final void setRecommendAction(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.recommendAction = str;
    }

    public final void setRecyclerView(@Nullable RecyclerView recyclerView) {
        this.recyclerView = recyclerView;
    }

    public final void setRequestElapsedRealtime(long j2) {
        this.requestElapsedRealtime = j2;
    }

    public final void setTabPosition(int i) {
        this.tabPosition = i;
    }

    public final void setTheme(@Nullable ThemeInfo themeInfo) {
        this.theme = themeInfo;
    }

    public /* synthetic */ HomeEnvironment(boolean z, boolean z2, long j2, boolean z3, FragmentManager fragmentManager, Lifecycle lifecycle, String str, String str2, int i, int i2, ThemeInfo themeInfo, String str3, int i3, INestedScrollListener iNestedScrollListener, HomeParallaxBannerHolder.PageChangeCallBack pageChangeCallBack, RecyclerView recyclerView, boolean z4, boolean z5, String str4, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(z, z2, j2, z3, fragmentManager, lifecycle, str, str2, i, i2, themeInfo, str3, i3, iNestedScrollListener, pageChangeCallBack, (i4 & 32768) != 0 ? null : recyclerView, (i4 & 65536) != 0 ? false : z4, (i4 & 131072) != 0 ? false : z5, (i4 & 262144) != 0 ? "" : str4);
    }
}
