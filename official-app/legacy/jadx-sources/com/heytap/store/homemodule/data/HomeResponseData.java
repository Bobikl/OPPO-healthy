package com.heytap.store.homemodule.data;

import androidx.annotation.Keep;
import com.heytap.databaseengineservice.db.table.sportrecord.DBSportMetadata;
import java.util.List;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Keep
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\b\u0017\u0018\u0000 !2\u00020\u0001:\u0001!BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\"\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 ¨\u0006\""}, d2 = {"Lcom/heytap/store/homemodule/data/HomeResponseData;", "Lcom/heytap/store/homemodule/data/StoreBaseResponseData;", "data", "", "Lcom/heytap/store/homemodule/data/HomeDataBean;", "pagination", "Lcom/heytap/store/homemodule/data/Pagination;", DBSportMetadata.EXTENSION, "", "isCacheData", "", "current_screen_size", "", "(Ljava/util/List;Lcom/heytap/store/homemodule/data/Pagination;Ljava/lang/Object;ZLjava/lang/String;)V", "getCurrent_screen_size", "()Ljava/lang/String;", "setCurrent_screen_size", "(Ljava/lang/String;)V", "getData", "()Ljava/util/List;", "setData", "(Ljava/util/List;)V", "getExtension", "()Ljava/lang/Object;", "setExtension", "(Ljava/lang/Object;)V", "()Z", "setCacheData", "(Z)V", "getPagination", "()Lcom/heytap/store/homemodule/data/Pagination;", "setPagination", "(Lcom/heytap/store/homemodule/data/Pagination;)V", "Companion", "com.heytap.store.business.home-impl"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class HomeResponseData extends StoreBaseResponseData {
    public static final int COMPONENT_CODE_BRAND = 803;
    public static final int COMPONENT_CODE_MARKETING = 804;
    public static final int COMPONENT_CODE_MEDIA = 802;
    public static final int COMPONENT_CODE_PRODUCT = 801;
    public static final int COMPONENT_CODE_SETTING = 805;
    public static final int INVALID_NUM = -1;
    public static final int MODEL_CODE_ANNOUNCEMENT = 833;
    public static final int MODEL_CODE_ASSIST_CARD = 8311;
    public static final int MODEL_CODE_BANNER = 821;
    public static final int MODEL_CODE_BLACK_CARD_AREA = 83811;
    public static final int MODEL_CODE_BRAND = 832;
    public static final int MODEL_CODE_CONFIG = 852;
    public static final int MODEL_CODE_COUPON = 842;
    public static final int MODEL_CODE_CUBE_PIC = 824;
    public static final int MODEL_CODE_HORIZONTAL_PIC = 823;
    public static final int MODEL_CODE_HOT_ZONE = 828;
    public static final int MODEL_CODE_IMMERSIVE_CAROUSEL = 826;
    public static final int MODEL_CODE_LANTERN = 831;
    public static final int MODEL_CODE_LIFE_CYCLE_RECOMMEND = 8110;
    public static final int MODEL_CODE_LIVE_CARD = 843;
    public static final int MODEL_CODE_LIVE_RESERVATION_CARD = 8444;
    public static final int MODEL_CODE_MULTI_TWO_IN_A_ROW = 836;
    public static final int MODEL_CODE_NEAR_SHOP = 838;
    public static final int MODEL_CODE_NEW_APPOINT = 841;
    public static final int MODEL_CODE_ONE_HALF_CARD = 835;
    public static final int MODEL_CODE_ONE_IN_A_ROW = 813;
    public static final int MODEL_CODE_PORTRAIT_PIC = 822;
    public static final int MODEL_CODE_PRODUCT_GRID = 818;
    public static final int MODEL_CODE_PRODUCT_GRID_NEW = 8111;
    public static final int MODEL_CODE_RECOMMEND_FLOW = 816;
    public static final int MODEL_CODE_RECOMMEND_FLOW_TABS = 817;
    public static final int MODEL_CODE_SCROLLABLE_LINE = 815;
    public static final int MODEL_CODE_SEA_VIEW_ROOM = 814;
    public static final int MODEL_CODE_SERVICE = 834;
    public static final int MODEL_CODE_SWITCH = 851;
    public static final int MODEL_CODE_THREE_IN_A_ROW = 812;
    public static final int MODEL_CODE_TWO_IN_A_ROW = 811;
    public static final int MODEL_CODE_VIDEO = 825;
    public static final int MODE_CODE_INTEGRAL_EXP = 845;
    public static final int VALUE_CARD_TYPE_CUSTOMER = 1;
    public static final int VALUE_CARD_TYPE_LARGE_CARD = 3;
    public static final int VALUE_CARD_TYPE_LIVE = 2;
    public static final int VALUE_CARD_TYPE_MIDDLE_CARD = 4;
    public static final int VALUE_CARD_TYPE_NORMAL = 0;
    public static final int VALUE_CARD_TYPE_ONE_AND_THREE = 1;
    public static final int VALUE_CARD_TYPE_ONE_AND_TWO = 2;
    public static final int VALUE_CARD_TYPE_RANKING = 4;
    public static final int VALUE_CARD_TYPE_SECKILL = 3;
    public static final int VALUE_CARD_TYPE_SMALL_CARD = 5;
    public static final int VALUE_LIVE_STATUS_END = 2;
    public static final int VALUE_LIVE_STATUS_LIVING = 1;
    public static final int VALUE_LIVE_STATUS_NOT_START = 0;
    public static final int VALUE_MEDIA_TYPE_ALPHA_VIDEO = 6;
    public static final int VALUE_MEDIA_TYPE_A_AND_AND_APPOINT = 3;
    public static final int VALUE_MEDIA_TYPE_A_AND_B = 2;
    public static final int VALUE_MEDIA_TYPE_PIC = 1;
    public static final int VALUE_MEDIA_TYPE_SINGLE = 1;
    public static final int VALUE_MEDIA_TYPE_VIDEO = 2;
    public static final int VALUE_SHOW_TYPE_PIC = 2;
    public static final int VALUE_SHOW_TYPE_PRODUCT = 1;

    @NotNull
    private String current_screen_size;

    @Nullable
    private List<? extends HomeDataBean> data;

    @Nullable
    private Object extension;
    private boolean isCacheData;

    @Nullable
    private Pagination pagination;

    public HomeResponseData() {
        this(null, null, null, false, null, 31, null);
    }

    @NotNull
    public final String getCurrent_screen_size() {
        return this.current_screen_size;
    }

    @Nullable
    public final List<HomeDataBean> getData() {
        return this.data;
    }

    @Nullable
    public final Object getExtension() {
        return this.extension;
    }

    @Nullable
    public final Pagination getPagination() {
        return this.pagination;
    }

    /* JADX INFO: renamed from: isCacheData, reason: from getter */
    public final boolean getIsCacheData() {
        return this.isCacheData;
    }

    public final void setCacheData(boolean z) {
        this.isCacheData = z;
    }

    public final void setCurrent_screen_size(@NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.current_screen_size = str;
    }

    public final void setData(@Nullable List<? extends HomeDataBean> list) {
        this.data = list;
    }

    public final void setExtension(@Nullable Object obj) {
        this.extension = obj;
    }

    public final void setPagination(@Nullable Pagination pagination) {
        this.pagination = pagination;
    }

    public /* synthetic */ HomeResponseData(List list, Pagination pagination, Object obj, boolean z, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : pagination, (i & 4) != 0 ? null : obj, (i & 8) != 0 ? false : z, (i & 16) != 0 ? "" : str);
    }

    public HomeResponseData(@Nullable List<? extends HomeDataBean> list, @Nullable Pagination pagination, @Nullable Object obj, boolean z, @NotNull String current_screen_size) {
        Intrinsics.checkNotNullParameter(current_screen_size, "current_screen_size");
        this.data = list;
        this.pagination = pagination;
        this.extension = obj;
        this.isCacheData = z;
        this.current_screen_size = current_screen_size;
    }
}
