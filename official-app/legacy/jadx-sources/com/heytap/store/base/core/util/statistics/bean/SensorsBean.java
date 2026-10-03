package com.heytap.store.base.core.util.statistics.bean;

import android.text.TextUtils;
import com.heytap.store.base.core.util.KeyMaps;
import java.io.Serializable;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;
import p010kotlin.Metadata;
import p010kotlin.Result;
import p010kotlin.ResultKt;
import p010kotlin.Unit;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0010\u0006\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\b\u0002\b\u0016\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\u0006\u0010\r\u001a\u00020\u0000J\b\u0010\u000e\u001a\u00020\u0004H\u0016J\u000e\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0014J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0015J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\u0018"}, d2 = {"Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean;", "Ljava/io/Serializable;", "()V", "jsonObject", "Lorg/json/JSONObject;", "reportEvent", "", "getReportEvent", "()Ljava/lang/String;", "setReportEvent", "(Ljava/lang/String;)V", "attachCommonValue", "", "clone", "getJsonObject", "getValue", "key", "setValue", "value", "", "", "", "", "Companion", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public class SensorsBean implements Serializable {

    @NotNull
    public static final String ACTIVITY_URL = "activity_url";

    @NotNull
    public static final String AD_DETAIL = "addetail";

    @NotNull
    public static final String AD_ID = "adId";

    @NotNull
    public static final String AD_NAME = "adName";

    @NotNull
    public static final String AD_POSITION = "adPosition";

    @NotNull
    public static final String AD_STATUS = "adStatus";

    @NotNull
    public static final String API_LOAD_STATUS = "apiStatus";

    @NotNull
    public static final String API_LOAD_TIME = "apiLoadTime";

    @NotNull
    public static final String API_NAME = "apiName";

    @NotNull
    public static final String ATTACH = "attach";

    @NotNull
    public static final String ATTACH2 = "attach2";

    @NotNull
    public static final String BANNER_ID = "banner_id";

    @NotNull
    public static final String BANNER_NAME = "banner_name";

    @NotNull
    public static final String BRAND = "brand";

    @NotNull
    public static final String BTY_TYPE = "bty_type";

    @NotNull
    public static final String BUTTON_NAME = "button_name";

    @NotNull
    public static final String BUTTON_STATUS = "button_status";

    @NotNull
    public static final String BUTTON_TYPE = "button_type";

    @NotNull
    public static final String CATEGORY = "category";

    @NotNull
    public static final String CODE = "code";

    @NotNull
    public static final String COLOR = "color";

    @NotNull
    public static final String CONFIG = "config";

    @NotNull
    public static final String COPYWRITING = "copywriting";

    @NotNull
    public static final String COUPON_AMOUNT = "coupon_amount";

    @NotNull
    public static final String COUPON_ID = "coupon_ID";

    @NotNull
    public static final String COUPON_NAME = "coupon_name";

    @NotNull
    public static final String COUPON_SOURCE = "coupon_source";

    @NotNull
    public static final String COUPON_STATUS = "coupon_status";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    public static final String DEEPLINK_URL = "deeplink_url";

    @NotNull
    public static final String DOT_NUMBER = "dot_number";

    @NotNull
    public static final String DOT_TYPE = "dot_type";

    @NotNull
    public static final String ELEMENT_ID = "element_id";

    @NotNull
    public static final String ELEMENT_NAME = "element_name";

    @NotNull
    public static final String END_TYPE = "end_type";

    @NotNull
    public static final String EVENT_DURATION = "event_duration";

    @NotNull
    public static final String EXCEPTION_TYPE = "exception_type";

    @NotNull
    public static final String EXPERIMENT_ID = "experiment_id";

    @NotNull
    public static final String EXPOSURE_TIME = "exposure_time";

    @NotNull
    public static final String EXP_ID = "exp_id";

    @NotNull
    public static final String FAIL_REASON = "fail_reason";

    @NotNull
    public static final String FIRST_CATEGORY = "first_category";

    @NotNull
    public static final String FIRST_CATEGORY_NAVI = "first_category_navi";

    @NotNull
    public static final String FIRST_SEARCH_ID = "first_search_id";

    @NotNull
    public static final String GOODS_NUM = "goods_num";

    @NotNull
    public static final String HEYTAP_DISCOUNT = "heytap_discount";

    @NotNull
    public static final String HEYTAP_DISCOUNT_AMOUNT = "heytap_discount_amount";

    @NotNull
    public static final String IMAGE_WEIGHT = "image_weight";

    @NotNull
    public static final String INSTALLMENT_DETAIL_HUABEI = "installment_detail_huabei";

    @NotNull
    public static final String INSTALLMENT_DETAIL_HUANTAI = "installment_detail_huantai";

    @NotNull
    public static final String INTEGRAL_RATE = "integral_rate";

    @NotNull
    public static final String IS_COUPON = "is_coupon";

    @NotNull
    public static final String IS_HEYTAP_DISCOUNT = "is_heytap_discount";

    @NotNull
    public static final String IS_RECOMMENDATION = "is_recommendation";

    @NotNull
    public static final String IS_REDIRECT = "is_redirect";

    @NotNull
    public static final String IS_SUCCESS = "is_success";

    @NotNull
    public static final String IS_VIDEO = "is_video";

    @NotNull
    public static final String ITEM_ID = "item_id";

    @NotNull
    public static final String ITEM_TYPE = "item_type";

    @NotNull
    public static final String LIVE_ID = "live_ID";

    @NotNull
    public static final String LIVE_STATUS = "live_status";

    @NotNull
    public static final String LIVE_STYLE = "live_style";

    @NotNull
    public static final String LIVE_TITLE = "live_title";

    @NotNull
    public static final String LOGIN_RESULT = "loginResult";

    @NotNull
    public static final String LOG_ID = "log_id";

    @NotNull
    public static final String MARKET_PRICE = "market_price";

    @NotNull
    public static final String MEMBERSHIP_LEVEL = "membership_level";

    @NotNull
    public static final String MODULE = "module";

    @NotNull
    public static final String MODULE_CODE = "module_code";

    @NotNull
    public static final String MODULE_ID = "module_id";

    @NotNull
    public static final String MODULE_SOURCE = "moduleSource";

    @NotNull
    public static final String MODULE_TITLE = "module_title";

    @NotNull
    public static final String ORDER_ID = "order_ID";

    @NotNull
    public static final String PAGE_CACHE_RENDER_TIME = "cacheRenderTime";

    @NotNull
    public static final String PAGE_DATA_RENDER_TIME = "dataRenderTime";

    @NotNull
    public static final String PAGE_DETAIL = "page_detail";

    @NotNull
    public static final String PAGE_FIRST_RENDER_TIME = "firstRenderTime";

    @NotNull
    public static final String PAGE_ID = "page_id";

    @NotNull
    public static final String PAGE_LOAD_TIME = "page_load_time";

    @NotNull
    public static final String PAGE_NAME = "page_name";

    @NotNull
    public static final String PAGE_POSITION = "page_position";

    @NotNull
    public static final String PAGE_STAY_TIME = "page_stay_time";

    @NotNull
    public static final String PAGE_TITLE = "page_title";

    @NotNull
    public static final String PAGE_URL = "page_url";

    @NotNull
    public static final String PAGE_VIEW_TYPE = "page_view_type";

    @NotNull
    public static final String PAY_AMOUNT = "pay_amount";

    @NotNull
    public static final String PAY_DETAIL = "pay_detail";

    @NotNull
    public static final String PAY_METHOD = "pay_method";

    @NotNull
    public static final String PAY_TOOL = "pay_tool";

    @NotNull
    public static final String POPUPS_CONTENT = "popups_content";

    @NotNull
    public static final String POPUPS_ID = "popups_id";

    @NotNull
    public static final String POSITION_ID = "position_id";

    @NotNull
    public static final String PRICE = "price";

    @NotNull
    public static final String PRICE_RANGE = "price_range";

    @NotNull
    public static final String PRODUCT_ID = "product_ID";

    @NotNull
    public static final String PRODUCT_ID_SPU = "product_ID_SPU";

    @NotNull
    public static final String PRODUCT_NAME = "product_name";

    @NotNull
    public static final String PRODUCT_PAGE_CATEGORY = "productpage_category";

    @NotNull
    public static final String PROMOTION_TYPE = "promotion_type";

    @NotNull
    public static final String PULLUP_METHOD = "pullup_method";

    @NotNull
    public static final String RELOAD_RESULT = "reload_result";

    @NotNull
    public static final String RESERVE_PLACE = "reserve_place";

    @NotNull
    public static final String RESERVE_TYPE = "reserve_type";

    @NotNull
    public static final String RESULT_DETAIL = "result_detail";

    @NotNull
    public static final String RETRIEVE_ID = "retrieve_id";

    @NotNull
    public static final String SCENE_ID = "scene_id";

    @NotNull
    public static final String SEARCHID = "search_id";

    @NotNull
    public static final String SEARCH_NAME = "searchName";

    @NotNull
    public static final String SEARCH_PLACE = "searchPlace";

    @NotNull
    public static final String SEARCH_RESULT = "searchResult";

    @NotNull
    public static final String SEARCH_SOURCE = "searchSource";

    @NotNull
    public static final String SECOND_CATEGORY = "second_category";

    @NotNull
    public static final String SECOND_CATEGORY_NAVI = "second_category_navi";

    @NotNull
    public static final String SECTION_ID = "section_id";

    @NotNull
    public static final String SHARE_CHANNEL = "share_channel";

    @NotNull
    public static final String SHARE_POSITION = "share_position";

    @NotNull
    public static final String SHARE_TYPE = "share_type";

    @NotNull
    public static final String SHARE_URL = "share_url";

    @NotNull
    public static final String SHOP_NAME = "shop_name";

    @NotNull
    public static final String SKU_ID = "sku_id";

    @NotNull
    public static final String SKU_NAME = "sku_name";

    @NotNull
    public static final String SPU_ID = "spu_id";

    @NotNull
    public static final String STRATEGY_ID = "strategy_id";

    @NotNull
    public static final String STREAM_ID = "stream_ID";

    @NotNull
    public static final String STYLE_ID = "style_id";

    @NotNull
    public static final String SUB_CATE = "sub_cate";

    @NotNull
    public static final String THIRD_CATEGORY_NAVI = "third_category_navi";

    @NotNull
    public static final String TITLE = "title";

    @NotNull
    public static final String TOOL_ID = "toolid";

    @NotNull
    public static final String TRACK_ID = "track_id";

    @NotNull
    public static final String TRANSPARENT = "transparent";

    @NotNull
    public static final String WEIGHT = "weight";

    @Nullable
    private static String adid;

    @Nullable
    private static String exp_id;

    @Nullable
    private static String log_id;

    @Nullable
    private static String retrieve_id;

    @Nullable
    private static String scene_id;

    @Nullable
    private static String section_id;

    @Nullable
    private static String strategy_id;

    @Nullable
    private static String transparent;

    @NotNull
    private JSONObject jsonObject = new JSONObject();

    @Nullable
    private String reportEvent;

    @Metadata(d1 = {"\u0000\u001d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0003\b\u009d\u0001\n\u0002\u0010\u0002\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010¡\u0001\u001a\u00030¢\u0001J\b\u0010£\u0001\u001a\u00030¢\u0001JJ\u0010¤\u0001\u001a\u00030¢\u00012\t\u0010¥\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¦\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010§\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010¨\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010©\u0001\u001a\u0004\u0018\u00010\u00042\t\u0010ª\u0001\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010.\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00106\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00108\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010;\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010<\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010>\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010@\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010B\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010D\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010F\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010H\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010J\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010L\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010N\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010O\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010R\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010S\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010U\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010W\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010[\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010]\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010^\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010_\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010a\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010d\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010g\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010h\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010j\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010k\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010l\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010m\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010o\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010p\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010q\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010s\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010u\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010v\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010w\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010x\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010y\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010z\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010{\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010|\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010}\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010~\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u007f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0083\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0084\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R!\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R!\u0010\u008c\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u008d\u0001\u0010\u0089\u0001\"\u0006\b\u008e\u0001\u0010\u008b\u0001R!\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0090\u0001\u0010\u0089\u0001\"\u0006\b\u0091\u0001\u0010\u008b\u0001R!\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0093\u0001\u0010\u0089\u0001\"\u0006\b\u0094\u0001\u0010\u008b\u0001R!\u0010\u0095\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0096\u0001\u0010\u0089\u0001\"\u0006\b\u0097\u0001\u0010\u008b\u0001R!\u0010\u0098\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0099\u0001\u0010\u0089\u0001\"\u0006\b\u009a\u0001\u0010\u008b\u0001R!\u0010\u009b\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009c\u0001\u0010\u0089\u0001\"\u0006\b\u009d\u0001\u0010\u008b\u0001R!\u0010\u009e\u0001\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u009f\u0001\u0010\u0089\u0001\"\u0006\b \u0001\u0010\u008b\u0001¨\u0006«\u0001"}, d2 = {"Lcom/heytap/store/base/core/util/statistics/bean/SensorsBean$Companion;", "", "()V", "ACTIVITY_URL", "", "AD_DETAIL", "AD_ID", "AD_NAME", "AD_POSITION", "AD_STATUS", "API_LOAD_STATUS", "API_LOAD_TIME", "API_NAME", "ATTACH", "ATTACH2", "BANNER_ID", "BANNER_NAME", "BRAND", "BTY_TYPE", "BUTTON_NAME", "BUTTON_STATUS", "BUTTON_TYPE", "CATEGORY", "CODE", "COLOR", "CONFIG", "COPYWRITING", "COUPON_AMOUNT", "COUPON_ID", "COUPON_NAME", "COUPON_SOURCE", "COUPON_STATUS", "DEEPLINK_URL", "DOT_NUMBER", "DOT_TYPE", "ELEMENT_ID", "ELEMENT_NAME", "END_TYPE", "EVENT_DURATION", "EXCEPTION_TYPE", "EXPERIMENT_ID", "EXPOSURE_TIME", "EXP_ID", "FAIL_REASON", "FIRST_CATEGORY", "FIRST_CATEGORY_NAVI", "FIRST_SEARCH_ID", "GOODS_NUM", "HEYTAP_DISCOUNT", "HEYTAP_DISCOUNT_AMOUNT", "IMAGE_WEIGHT", "INSTALLMENT_DETAIL_HUABEI", "INSTALLMENT_DETAIL_HUANTAI", "INTEGRAL_RATE", "IS_COUPON", "IS_HEYTAP_DISCOUNT", "IS_RECOMMENDATION", "IS_REDIRECT", "IS_SUCCESS", "IS_VIDEO", "ITEM_ID", "ITEM_TYPE", "LIVE_ID", "LIVE_STATUS", "LIVE_STYLE", "LIVE_TITLE", "LOGIN_RESULT", "LOG_ID", "MARKET_PRICE", "MEMBERSHIP_LEVEL", "MODULE", "MODULE_CODE", "MODULE_ID", "MODULE_SOURCE", "MODULE_TITLE", "ORDER_ID", "PAGE_CACHE_RENDER_TIME", "PAGE_DATA_RENDER_TIME", "PAGE_DETAIL", "PAGE_FIRST_RENDER_TIME", "PAGE_ID", "PAGE_LOAD_TIME", "PAGE_NAME", "PAGE_POSITION", "PAGE_STAY_TIME", "PAGE_TITLE", "PAGE_URL", "PAGE_VIEW_TYPE", "PAY_AMOUNT", "PAY_DETAIL", "PAY_METHOD", "PAY_TOOL", "POPUPS_CONTENT", "POPUPS_ID", "POSITION_ID", "PRICE", "PRICE_RANGE", "PRODUCT_ID", "PRODUCT_ID_SPU", "PRODUCT_NAME", "PRODUCT_PAGE_CATEGORY", "PROMOTION_TYPE", "PULLUP_METHOD", "RELOAD_RESULT", "RESERVE_PLACE", "RESERVE_TYPE", "RESULT_DETAIL", "RETRIEVE_ID", "SCENE_ID", "SEARCHID", "SEARCH_NAME", "SEARCH_PLACE", "SEARCH_RESULT", "SEARCH_SOURCE", "SECOND_CATEGORY", "SECOND_CATEGORY_NAVI", "SECTION_ID", "SHARE_CHANNEL", "SHARE_POSITION", "SHARE_TYPE", "SHARE_URL", "SHOP_NAME", "SKU_ID", "SKU_NAME", "SPU_ID", "STRATEGY_ID", "STREAM_ID", "STYLE_ID", "SUB_CATE", "THIRD_CATEGORY_NAVI", "TITLE", "TOOL_ID", "TRACK_ID", "TRANSPARENT", "WEIGHT", KeyMaps.OCPX_ADID, "getAdid", "()Ljava/lang/String;", "setAdid", "(Ljava/lang/String;)V", SensorsBean.EXP_ID, "getExp_id", "setExp_id", SensorsBean.LOG_ID, "getLog_id", "setLog_id", SensorsBean.RETRIEVE_ID, "getRetrieve_id", "setRetrieve_id", "scene_id", "getScene_id", "setScene_id", SensorsBean.SECTION_ID, "getSection_id", "setSection_id", SensorsBean.STRATEGY_ID, "getStrategy_id", "setStrategy_id", "transparent", "getTransparent", "setTransparent", "dettachCommonValue", "", "resetValue", "updateRecommendCommonValue", "sectionId", "sceneId", "expId", "strategyId", "retrieveId", "logId", "Core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void dettachCommonValue() {
            setSection_id("");
            setScene_id("");
            setExp_id("");
            setStrategy_id("");
            setRetrieve_id("");
            setLog_id("");
        }

        @Nullable
        public final String getAdid() {
            return SensorsBean.adid;
        }

        @Nullable
        public final String getExp_id() {
            return SensorsBean.exp_id;
        }

        @Nullable
        public final String getLog_id() {
            return SensorsBean.log_id;
        }

        @Nullable
        public final String getRetrieve_id() {
            return SensorsBean.retrieve_id;
        }

        @Nullable
        public final String getScene_id() {
            return SensorsBean.scene_id;
        }

        @Nullable
        public final String getSection_id() {
            return SensorsBean.section_id;
        }

        @Nullable
        public final String getStrategy_id() {
            return SensorsBean.strategy_id;
        }

        @Nullable
        public final String getTransparent() {
            return SensorsBean.transparent;
        }

        public final void resetValue() {
            dettachCommonValue();
            setAdid("");
            setTransparent("");
        }

        public final void setAdid(@Nullable String str) {
            SensorsBean.adid = str;
        }

        public final void setExp_id(@Nullable String str) {
            SensorsBean.exp_id = str;
        }

        public final void setLog_id(@Nullable String str) {
            SensorsBean.log_id = str;
        }

        public final void setRetrieve_id(@Nullable String str) {
            SensorsBean.retrieve_id = str;
        }

        public final void setScene_id(@Nullable String str) {
            SensorsBean.scene_id = str;
        }

        public final void setSection_id(@Nullable String str) {
            SensorsBean.section_id = str;
        }

        public final void setStrategy_id(@Nullable String str) {
            SensorsBean.strategy_id = str;
        }

        public final void setTransparent(@Nullable String str) {
            SensorsBean.transparent = str;
        }

        public final void updateRecommendCommonValue(@Nullable String sectionId, @Nullable String sceneId, @Nullable String expId, @Nullable String strategyId, @Nullable String retrieveId, @Nullable String logId) {
            setSection_id(sectionId);
            setScene_id(sceneId);
            setExp_id(expId);
            setStrategy_id(strategyId);
            setRetrieve_id(retrieveId);
            setLog_id(logId);
        }
    }

    public final void attachCommonValue() {
        if (TextUtils.isEmpty(section_id)) {
            return;
        }
        setValue(SECTION_ID, section_id);
        setValue("scene_id", scene_id);
        setValue(EXP_ID, exp_id);
        setValue(STRATEGY_ID, strategy_id);
        setValue(RETRIEVE_ID, retrieve_id);
        setValue(LOG_ID, log_id);
    }

    @NotNull
    public final SensorsBean clone() {
        SensorsBean sensorsBean = new SensorsBean();
        Iterator<String> itKeys = this.jsonObject.keys();
        JSONObject jSONObject = new JSONObject();
        try {
            Result.Companion companion = Result.INSTANCE;
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObject.put(next, this.jsonObject.opt(next));
            }
            Result.m5287constructorimpl(Unit.INSTANCE);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Result.m5287constructorimpl(ResultKt.createFailure(th));
        }
        sensorsBean.jsonObject = jSONObject;
        sensorsBean.reportEvent = this.reportEvent;
        return sensorsBean;
    }

    @NotNull
    public JSONObject getJsonObject() {
        return this.jsonObject;
    }

    @Nullable
    public final String getReportEvent() {
        return this.reportEvent;
    }

    @NotNull
    public final String getValue(@NotNull String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            return this.jsonObject.get(key).toString();
        } catch (Exception unused) {
            return "";
        }
    }

    public final void setReportEvent(@Nullable String str) {
        this.reportEvent = str;
    }

    public final void setValue(@NotNull String key, @Nullable String value) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.jsonObject.put(key, value);
        } catch (Exception unused) {
        }
    }

    public final void setValue(@NotNull String key, boolean value) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.jsonObject.put(key, value);
        } catch (Exception unused) {
        }
    }

    public final void setValue(@NotNull String key, long value) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.jsonObject.put(key, value);
        } catch (Exception unused) {
        }
    }

    public final void setValue(@NotNull String key, int value) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.jsonObject.put(key, value);
        } catch (Exception unused) {
        }
    }

    public final void setValue(@NotNull String key, double value) {
        Intrinsics.checkNotNullParameter(key, "key");
        try {
            this.jsonObject.put(key, value);
        } catch (Exception unused) {
        }
    }
}
