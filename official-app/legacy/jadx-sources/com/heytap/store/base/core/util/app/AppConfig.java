package com.heytap.store.base.core.util.app;

import android.annotation.SuppressLint;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.heytap.store.base.core.api.BaseApiService;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.base.core.http.HttpResultSubscriber;
import com.heytap.store.base.core.protobuf.AppSwitchForm;
import com.heytap.store.base.core.protobuf.IconDetails;
import com.heytap.store.base.core.protobuf.Icons;
import com.heytap.store.base.core.protobuf.Meta;
import com.heytap.store.base.core.protobuf.SwitchDetails;
import com.heytap.store.base.core.protobuf.Switches;
import com.heytap.store.base.core.state.ConstantsKt;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.NullObjectUtil;
import com.heytap.store.base.core.util.SpUtil;
import com.heytap.store.base.core.util.file.FileUtils;
import com.heytap.store.base.core.util.statistics.IRequestAgain;
import com.heytap.store.base.core.util.statistics.StatisticsUtil;
import com.heytap.store.base.core.util.thread.AppThreadExecutor;
import com.heytap.store.base.facade.HTStoreFacade;
import com.heytap.store.platform.htrouter.launcher.business.HTAliasRouter;
import com.heytap.store.platform.tools.ContextGetterUtils;
import com.heytap.store.platform.tools.GsonUtils;
import com.heytap.store.platform.tools.LogUtils;
import com.heytap.store.product.service.IProductService;
import com.oplus.aiunit.vision.cv5;
import com.oplus.aiunit.vision.e30;
import com.oplus.aiunit.vision.ifg;
import com.oplus.aiunit.vision.j08;
import com.oplus.aiunit.vision.kbd;
import com.oplus.aiunit.vision.nd1;
import com.oplus.aiunit.vision.ovf;
import com.oplus.aiunit.vision.p14;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AppConfig {
    static String CONFIG_NAME = "";
    private static cv5 appSwitchSubscribe = null;
    private static cv5 bigZipSubscribe = null;
    public static boolean initialized = false;
    private static AppConfig instance = null;
    public static String keyUseTblKernel = "key_use_tbl_kernel";
    public Boolean articlePreviewSwitch;
    public Boolean darkModeEnable;
    public List<String> h5WhiteList;
    public Boolean isCommunityDetail;
    private Boolean isNeedPermissionTips;
    public Boolean isOpenRecommendSwitch;
    public Boolean isSensorCommonProperty;
    public Boolean isSensorSDKReport;
    public Boolean liveShowListSwitch;
    public Boolean recommendRebateSwitch;
    public IRequestAgain requestAgainListener;
    public Boolean sIsShowH5Comment;
    public Boolean sIsShowH5CommentEditPage;
    public Boolean sdkEnv;
    public Boolean webBrowseMode;
    private final String TAG = AppConfig.class.getSimpleName();
    public boolean recommends_witch = false;
    public boolean goodsDetail_recommend_switch = false;
    public boolean product_detail_switch = true;
    public boolean sensors_on = true;
    public String cartUrl = UrlConfig.H5_DEFAULT_CART_URL;

    @Deprecated
    private String refreshText = "";
    private final List<String> refreshTextList = new ArrayList();

    private AppConfig() {
        Boolean bool = Boolean.FALSE;
        this.sIsShowH5Comment = bool;
        this.sIsShowH5CommentEditPage = bool;
        this.isCommunityDetail = bool;
        this.articlePreviewSwitch = bool;
        this.liveShowListSwitch = bool;
        this.recommendRebateSwitch = bool;
        this.webBrowseMode = bool;
        Boolean bool2 = Boolean.TRUE;
        this.sdkEnv = bool2;
        this.isSensorSDKReport = bool2;
        this.darkModeEnable = bool;
        this.isSensorCommonProperty = bool;
        this.isOpenRecommendSwitch = bool2;
        this.isNeedPermissionTips = bool;
        this.requestAgainListener = new IRequestAgain() { // from class: com.oplus.aiunit.vision.x80
            @Override // com.heytap.store.base.core.util.statistics.IRequestAgain
            public final void requestExperimentId() {
                this.a.getExperimentId();
            }
        };
        CONFIG_NAME = ContextGetterUtils.INSTANCE.getApp().getCacheDir() + "/appconfig.dat";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void getExperimentId() {
        ((BaseApiService) HTStoreFacade.INSTANCE.getInstance().getNetworkProxy().c(BaseApiService.class, "")).getAppSwitch().B(ifg.b()).r(e30.a()).subscribe(new HttpResultSubscriber<AppSwitchForm>() { // from class: com.heytap.store.base.core.util.app.AppConfig.4
            @Override // com.heytap.store.base.core.http.HttpResultSubscriber
            public void onFailure(Throwable th) {
                LogUtils.INSTANCE.e(AppConfig.this.TAG, "获取实验id出错");
                super.onFailure(th);
            }

            @Override // com.heytap.store.base.core.http.HttpResultSubscriber
            public void onSuccess(AppSwitchForm appSwitchForm) {
                Meta meta = appSwitchForm.meta;
                if (meta == null || meta.code.intValue() != 200) {
                    return;
                }
                AppConfig.this.setExperimentId(appSwitchForm.expId);
            }
        });
    }

    public static AppConfig getInstance() {
        if (instance == null) {
            initDefaultConfig();
        }
        return instance;
    }

    public static void initDefaultConfig() {
        AppConfigBean appConfigBean;
        if (instance == null) {
            instance = new AppConfig();
        }
        String json = FileUtils.readJson(CONFIG_NAME);
        if (TextUtils.isEmpty(json)) {
            appConfigBean = null;
        } else {
            try {
                appConfigBean = (AppConfigBean) GsonUtils.INSTANCE.fromJson(json, AppConfigBean.class);
            } catch (Exception unused) {
                appConfigBean = null;
            }
        }
        if (appConfigBean == null) {
            appConfigBean = new AppConfigBean();
        }
        AppConfig appConfig = instance;
        appConfig.recommends_witch = appConfigBean.recommends_witch;
        appConfig.product_detail_switch = appConfigBean.product_detail_switch;
        appConfig.h5WhiteList = appConfigBean.h5WhiteList;
        appConfig.sensors_on = appConfigBean.sensors_on;
        appConfig.cartUrl = appConfigBean.cartUrl;
        appConfig.refreshText = appConfigBean.refreshText;
        appConfig.goodsDetail_recommend_switch = appConfigBean.goodsDetail_recommend_switch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveTask() {
        if (instance != null) {
            initialized = true;
            AppConfigBean appConfigBean = new AppConfigBean();
            AppConfig appConfig = instance;
            appConfigBean.recommends_witch = appConfig.recommends_witch;
            appConfigBean.product_detail_switch = appConfig.product_detail_switch;
            appConfigBean.sensors_on = appConfig.sensors_on;
            appConfigBean.cartUrl = appConfig.cartUrl;
            appConfigBean.goodsDetail_recommend_switch = appConfig.goodsDetail_recommend_switch;
            FileUtils.writeToJsonFile(GsonUtils.INSTANCE.toJson(appConfigBean), CONFIG_NAME);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void saveToLocal() {
        appSwitchSubscribe = null;
        bigZipSubscribe = null;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            AppThreadExecutor.getInstance().executeNormalTask(new Runnable() { // from class: com.heytap.store.base.core.util.app.AppConfig.7
                @Override // java.lang.Runnable
                public void run() {
                    AppConfig.saveTask();
                }
            });
        } else {
            saveTask();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setExperimentId(String str) {
        StatisticsUtil.setExperimentId(str);
        IProductService iProductService = (IProductService) HTAliasRouter.getInstance().getService(IProductService.class);
        if (iProductService == null || str == null) {
            return;
        }
        iProductService.setExperimentId(str);
    }

    @SuppressLint({"CheckResult"})
    public void getAppConfig() {
        if (instance == null) {
            instance = new AppConfig();
        }
        ovf networkProxy = HTStoreFacade.INSTANCE.getInstance().getNetworkProxy();
        kbd<Icons> cartPageLink = ((BaseApiService) networkProxy.c(BaseApiService.class, "")).getCartPageLink();
        kbd<Switches> appConfig = ((BaseApiService) networkProxy.c(BaseApiService.class, "")).getAppConfig();
        cv5 cv5Var = bigZipSubscribe;
        if (cv5Var != null && !cv5Var.isDisposed()) {
            LogUtils.INSTANCE.i(this.TAG, "集合类配置的时候上一个请求没完成又有新请求进来了,请注意");
            bigZipSubscribe.dispose();
        }
        bigZipSubscribe = kbd.G(cartPageLink, appConfig, new nd1<Icons, Switches, Object>() { // from class: com.heytap.store.base.core.util.app.AppConfig.6
            @Override // com.oplus.aiunit.vision.nd1
            public Object apply(Icons icons, Switches switches) throws Exception {
                List<IconDetails> list;
                if (!NullObjectUtil.isNullOrEmpty(switches.details)) {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    for (SwitchDetails switchDetails : switches.details) {
                        if (UrlConfig.DEBUG) {
                            Log.d("appconfig", "item:" + switchDetails);
                        }
                        if ("oppostore_api_sign_h".equals(switchDetails.code)) {
                            String str = switchDetails.remark;
                            if (!TextUtils.isEmpty(str)) {
                                HostDomainCenter.setApiSignHeaderList(Arrays.asList(str.split(",")));
                            }
                        }
                        if ("oppostore_host".equals(switchDetails.code)) {
                            String str2 = switchDetails.remark;
                            if (!TextUtils.isEmpty(str2)) {
                                HostDomainCenter.setDynamicDomainWhiteList(Arrays.asList(str2.split(",")));
                            }
                        }
                        if ("oppostore_api_host".equals(switchDetails.code)) {
                            String str3 = switchDetails.remark;
                            if (!TextUtils.isEmpty(str3)) {
                                HostDomainCenter.setApiHostWhiteList(Arrays.asList(str3.split(",")));
                            }
                        }
                        if ("oppo_package_sign".equals(switchDetails.code)) {
                            String str4 = switchDetails.remark;
                            if (!TextUtils.isEmpty(str4)) {
                                HostDomainCenter.setPackageWhiteList(Arrays.asList(str4.split(",")));
                            }
                        }
                        if ("Product_Comment".equals(switchDetails.code)) {
                            AppConfig.instance.sIsShowH5Comment = Boolean.valueOf(jCurrentTimeMillis <= switchDetails.beginAt.longValue() || jCurrentTimeMillis >= switchDetails.endAt.longValue());
                        }
                        if ("Publish_Comment".equals(switchDetails.code)) {
                            AppConfig.instance.sIsShowH5CommentEditPage = Boolean.valueOf(jCurrentTimeMillis <= switchDetails.beginAt.longValue() || jCurrentTimeMillis >= switchDetails.endAt.longValue());
                        }
                        if ("community_detail_new".equals(switchDetails.code)) {
                            AppConfig.instance.isCommunityDetail = Boolean.valueOf(jCurrentTimeMillis > switchDetails.beginAt.longValue() && jCurrentTimeMillis < switchDetails.endAt.longValue());
                        }
                        if ("article_preview".equals(switchDetails.code)) {
                            AppConfig.instance.articlePreviewSwitch = Boolean.valueOf(jCurrentTimeMillis > switchDetails.beginAt.longValue() && jCurrentTimeMillis < switchDetails.endAt.longValue());
                        }
                        if ("live_more_live_list".equals(switchDetails.code)) {
                            AppConfig.instance.liveShowListSwitch = Boolean.valueOf(jCurrentTimeMillis > switchDetails.beginAt.longValue() && jCurrentTimeMillis < switchDetails.endAt.longValue());
                        }
                        if ("recommend_rebate_sha".equals(switchDetails.code)) {
                            AppConfig.instance.recommendRebateSwitch = Boolean.valueOf(jCurrentTimeMillis > switchDetails.beginAt.longValue() && jCurrentTimeMillis < switchDetails.endAt.longValue());
                        }
                    }
                }
                if (icons != null && (list = icons.details) != null && list.size() > 0) {
                    String str5 = icons.details.get(0).link;
                    if (!TextUtils.isEmpty(str5)) {
                        AppConfig.instance.cartUrl = str5;
                    }
                }
                return Boolean.TRUE;
            }
        }).B(ifg.b()).x(new p14<Object>() { // from class: com.heytap.store.base.core.util.app.AppConfig.5
            @Override // com.oplus.aiunit.vision.p14
            public void accept(Object obj) throws Exception {
                if (AppConfig.appSwitchSubscribe == null || AppConfig.appSwitchSubscribe.isDisposed()) {
                    AppConfig.saveToLocal();
                }
            }
        });
    }

    public void getAppSwitch(final Runnable runnable) {
        cv5 cv5Var = appSwitchSubscribe;
        if (cv5Var != null && !cv5Var.isDisposed()) {
            LogUtils.INSTANCE.i(this.TAG, "获取商详和个性化开关的时候上一个请求没完成又有新请求进来了,请注意");
            appSwitchSubscribe.dispose();
        }
        appSwitchSubscribe = ((BaseApiService) HTStoreFacade.INSTANCE.getInstance().getNetworkProxy().c(BaseApiService.class, "")).getAppSwitch().q(new j08<AppSwitchForm, AppSwitchForm>() { // from class: com.heytap.store.base.core.util.app.AppConfig.3
            @Override // com.oplus.aiunit.vision.j08
            public AppSwitchForm apply(AppSwitchForm appSwitchForm) throws Exception {
                Meta meta = appSwitchForm.meta;
                if (meta != null && meta.code.intValue() == 200) {
                    AppConfig appConfig = AppConfig.instance;
                    Integer num = appSwitchForm.goodsPageConfigs;
                    appConfig.product_detail_switch = num != null && num.intValue() == 1;
                    AppConfig appConfig2 = AppConfig.instance;
                    Integer num2 = appSwitchForm.recommendSwitch;
                    appConfig2.recommends_witch = num2 != null && num2.intValue() == 1;
                    AppConfig appConfig3 = AppConfig.instance;
                    Integer num3 = appSwitchForm.goodsDetailRecommendSwitch;
                    appConfig3.goodsDetail_recommend_switch = num3 != null && num3.intValue() == 1;
                    AppConfig.this.setExperimentId(appSwitchForm.expId);
                    SpUtil.putBooleanOnBackground(AppConfig.keyUseTblKernel, appSwitchForm.webKernelSwitch.intValue() == 1);
                }
                return appSwitchForm;
            }
        }).B(ifg.b()).r(e30.a()).y(new p14<AppSwitchForm>() { // from class: com.heytap.store.base.core.util.app.AppConfig.1
            @Override // com.oplus.aiunit.vision.p14
            public void accept(AppSwitchForm appSwitchForm) throws Exception {
                if (AppConfig.bigZipSubscribe == null || AppConfig.bigZipSubscribe.isDisposed()) {
                    AppConfig.saveToLocal();
                }
                runnable.run();
            }
        }, new p14<Throwable>() { // from class: com.heytap.store.base.core.util.app.AppConfig.2
            @Override // com.oplus.aiunit.vision.p14
            public void accept(Throwable th) throws Exception {
                runnable.run();
                LogUtils.INSTANCE.e(AppConfig.this.TAG, "获取开关配置出错");
                th.printStackTrace();
            }
        });
    }

    public Boolean getDarkModeEnable() {
        return this.darkModeEnable;
    }

    @Deprecated
    public String getRefreshText() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance.refreshText;
    }

    public List<String> getRefreshTextList() {
        if (instance == null) {
            instance = new AppConfig();
        }
        return instance.refreshTextList;
    }

    public Boolean getSdkEnv() {
        return this.sdkEnv;
    }

    public Boolean getSensorSDKReport() {
        return this.isSensorSDKReport;
    }

    public boolean goodsDetailSwitch() {
        if (instance == null) {
            instance = new AppConfig();
        }
        AppConfig appConfig = instance;
        return appConfig.goodsDetail_recommend_switch && appConfig.recommends_witch;
    }

    public Boolean isNeedPermissionTips() {
        return this.isNeedPermissionTips;
    }

    public Boolean isNeedShowPermissionTips(String str) {
        boolean z = false;
        boolean z2 = SpUtil.getBoolean(str + "_" + ConstantsKt.KEY_SDK_PERMISSION_SHOW, false);
        if (getSdkEnv().booleanValue() && this.isNeedPermissionTips.booleanValue() && !z2) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    public Boolean isOpenRecommendSwitch() {
        return this.isOpenRecommendSwitch;
    }

    public void setDarkModeEnable(Boolean bool) {
        this.darkModeEnable = bool;
    }

    public void setIsNeedPermissionTips(Boolean bool) {
        this.isNeedPermissionTips = bool;
    }

    public void setIsOpenRecommendSwitch(Boolean bool) {
        this.isOpenRecommendSwitch = bool;
        if (bool.booleanValue()) {
            GlobalParams.personalized = 1;
        } else {
            GlobalParams.personalized = 0;
        }
    }

    public void setPermissionTipsShow(String str) {
        if (getInstance().getSdkEnv().booleanValue() && getInstance().isNeedPermissionTips().booleanValue()) {
            SpUtil.putBooleanOnBackground(str + "_" + ConstantsKt.KEY_SDK_PERMISSION_SHOW, true);
        }
    }

    public void setSdkEnv(Boolean bool) {
        this.sdkEnv = bool;
    }

    public void setSensorSDKReport(Boolean bool) {
        this.isSensorSDKReport = bool;
    }

    public String toString() {
        return "AppConfig{recommends_witch=" + this.recommends_witch + ", product_detail_switch=" + this.product_detail_switch + ", sensors_on=" + this.sensors_on + ", cartUrl='" + this.cartUrl + "'}";
    }
}
