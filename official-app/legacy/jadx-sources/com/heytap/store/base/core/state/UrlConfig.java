package com.heytap.store.base.core.state;

import com.heytap.store.base.core.BuildConfig;
import com.heytap.store.base.core.http.GlobalParams;
import com.heytap.store.platform.tools.ReflectUtil;

/* JADX INFO: loaded from: classes3.dex */
public class UrlConfig {
    public static boolean ALLOW_PROXY = false;
    public static boolean CRASH_LOG = false;
    public static boolean DEBUG = false;
    public static Environment ENV = null;
    public static final String FILE_UPLOAD = "/image/v1/index/attach.json";
    public static final String H5_All_Order = "https://store.oppo.com/cn/app/order/list?us=wode";
    public static final String H5_COUPONS = "https://store.oppo.com/cn/app/coupon/index?t=1&us=wode";
    public static final String H5_DEFAULT_CART_URL = "https://store.oppo.com/cn/app/cart/index?us=gouwuche";
    public static final String H5_EXCHANGE_AFTER_SALE;
    public static final String H5_HOST_PRE_RELEASE_NEW = "https://prestore.oppo.com";
    public static final String H5_HOST_RELEASE_NEW = "https://store.oppo.com";
    public static final String H5_HOST_TEST_NEW = "https://store-test1-a.wanyol.com";
    public static final String H5_Order2 = "https://store.oppo.com/cn/app/order/list?type=3&us=wode";
    public static final String H5_Order3 = "https://store.oppo.com/cn/app/order/list?type=4&us=wode";
    public static final String H5_Order4 = "https://store.oppo.com/cn/app/order/list?type=5&us=wode";
    public static final String H5_PRODUCT_DETAIL_URL = "https://www.heytap.com/cn/m/product/index?skuId=";
    public static final String H5_PRODUCT_URL;
    public static final String H5_RECYCLE = "https://www.opposhop.cn/recycle/show?us=wode&is_simple=1";
    public static final String H5_RECYCLE_LIST = "https://www.opposhop.cn/recycle/list?us=wode&is_simple=1";
    public static boolean HUANTAI_PAY_IS_DEBUG = false;
    public static final String SERVICE_NEARBY_STORE = "https://xcx3rd.oppo.cn/portal/offlineStore/area/list";
    public static final String SESSIONKEY = "/security/v1/token/getSessionKey";
    public static boolean STATISTICS_IS_DEBUG = false;
    public static boolean STATISTICS_IS_ENABLE_LOG = false;
    public static boolean TEST_ENV = true;
    public static final boolean UNION_PAY_DEBUG = false;
    public static final String URL_COLLECT_PERSONAL_INFO = "https://store.oppo.com/cn/app/news/detail?contentId=261&golist=0";
    public static final String URL_DELIVERY_ADDRESS = "https://store.oppo.com/cn/app/address/index?us=gerenzhongxin&um=gongju&uc=shouhuodizhi";
    public static final String URL_LICENSE = "https://store.oppo.com/cn/app/news/detail?contentId=216&golist=0";
    public static final String URL_PRIVACY_AGAINSTNOTIFICATION = "https://dsfs.oppo.com/store/cn/app/files/againstnotification.html";
    public static final String URL_PRIVACY_NOTICEOFINFRINGEMENT = "https://dsfs.oppo.com/store/cn/app/files/noticeofinfringement.html";
    public static final String URL_PRIVACY_POLICY = "https://dsfs.oppo.com/store/cn/app/files/privacy_android.html";
    public static final String URL_PRIVACY_POLICY_DETAIL = "https://scc.apps.coloros.com/entrance/view?id=1";
    public static final String URL_PRIVACY_PRIVACY = "https://dsfs.oppo.com/store/cn/app/files/privacy.html";
    public static final String URL_RANKING_DETAIL = "oppostore://www.opposhop.cn/app/store/dranking_detail?rankId=";
    public static final String URL_RANKING_SAHRE = "https://dsfs.oppo.com/archives/202104/202104230704146082b00216029.png";
    public static final String URL_THIRD_PARTY_INFO_SHARING = "https://store.oppo.com/cn/app/news/detail?contentId=262&golist=0";
    public static String URL_USER_PROTOCOL = null;
    public static final String USER_HEAD_UPLOAD = "/image/v1/index/avatar.json";
    public static boolean WEB_DEBUG;

    public static class Environment {
        public static final int PRE_RELEASE = 3;
        public static final int RELEASE = 0;
        public static final int TEST = 1;
        public static final int TEST_B = 5;
        public static final int TEST_INTEGE = 2;
        public static final int TEST_OUT = 4;
        private int currentEnv = 1;
        public String serverApiHost = "https://msec.opposhop.cn";
        public String h5Host = "https://www.opposhop.cn";
        public String h5HostForOut = "https://www.opposhop.cn";
        public String userServiceHost = "https://iservice.oppo.cn";
        public String userApiServiceHost = "https://i-user.oppo.cn";
        public String liveApiHost = "https://live.opposhop.cn";
        public String imApiHost = "https://im-api-cn.oppo.cn";
        public String robotHost = "https://iservice.oppo.cn/robot";
        public String uploadFileHost = "http://ossapihd.comm.oppo.cn";
        public String udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
        public String H5_Order = BuildConfig.H5_Order_RELEASE;
        public String H5_Order1 = BuildConfig.H5_Order1_RELEASE;
        public String H5_TASK_CENTER = BuildConfig.H5_TASK_CENTER_RELEASE;

        public Environment(int i) {
            switchEnv(i);
        }

        public int getCurrentEnv() {
            return this.currentEnv;
        }

        public boolean isPreRelease() {
            return this.currentEnv == 3;
        }

        public boolean isRelease() {
            return this.currentEnv == 0;
        }

        public boolean isUdeskUrl(String str) {
            return str.startsWith(this.udeskHost);
        }

        public void switchEnv(int i) {
            this.currentEnv = i;
            if (i == 1) {
                this.serverApiHost = "https://store-test2-cn.wanyol.com";
                this.h5Host = "https://test-opposhop1-a.wanyol.com/";
                this.h5HostForOut = "https://test-opposhop1-a.wanyol.com/";
                this.userServiceHost = "https://iservice.wanyol.com";
                this.userApiServiceHost = "https://i-user.oppo.cn";
                this.liveApiHost = "https://store-test2-cn.wanyol.com";
                this.imApiHost = "https://bbs.wanyol.com";
                this.robotHost = "https://iservice.oppo.cn/robot";
                this.uploadFileHost = "http://test.ossapi.wanyol.com";
                this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
                this.H5_Order = BuildConfig.H5_Order_TEST;
                this.H5_Order1 = BuildConfig.H5_Order1_TEST;
                this.H5_TASK_CENTER = BuildConfig.H5_TASK_CENTER_TEST;
                return;
            }
            if (i == 2) {
                this.serverApiHost = "https://store-test5-cn.wanyol.com";
                this.h5Host = "https://test-opposhop5.wanyol.com/";
                this.h5HostForOut = "https://test-opposhop5.wanyol.com/";
                this.userServiceHost = "https://iservice.wanyol.com";
                this.userApiServiceHost = "https://i-user.oppo.cn";
                this.liveApiHost = "https://store-test5-cn.wanyol.com";
                this.imApiHost = BuildConfig.imApiHost_TEST5;
                this.robotHost = "https://iservice.oppo.cn/robot";
                this.uploadFileHost = "http://test.ossapi.wanyol.com";
                this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
                this.H5_Order = BuildConfig.H5_Order_TEST5;
                this.H5_Order1 = BuildConfig.H5_Order1_TEST5;
                this.H5_TASK_CENTER = BuildConfig.H5_TASK_CENTER_TEST5;
                return;
            }
            if (i == 3) {
                this.serverApiHost = "https://premsec.opposhop.cn";
                this.h5Host = "https://prestore.oppo.com";
                this.h5HostForOut = "https://www.opposhop.cn";
                this.userServiceHost = "https://iservice.oppo.cn";
                this.userApiServiceHost = "https://i-user.oppo.cn";
                this.liveApiHost = "https://prelive.opposhop.cn";
                this.imApiHost = "https://im-api-cn.oppo.cn";
                this.robotHost = "https://iservice.oppo.cn/robot";
                this.uploadFileHost = "http://ossapihd.comm.oppo.cn";
                this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
                this.H5_Order = "https://test3-oppo.wanyol.com/cn/app/order/detail?serial=";
                this.H5_Order1 = "https://test3-oppo.wanyol.com/cn/app/order/list?type=2";
                this.H5_TASK_CENTER = "https://test-oppo.wanyol.com/cn/app/taskCenter/index";
                return;
            }
            if (i != 4) {
                this.serverApiHost = "https://msec.opposhop.cn";
                this.h5Host = "https://www.opposhop.cn";
                this.h5HostForOut = "https://www.opposhop.cn";
                this.userServiceHost = "https://iservice.oppo.cn";
                this.userApiServiceHost = "https://i-user.oppo.cn";
                this.liveApiHost = "https://live.opposhop.cn";
                this.imApiHost = "https://im-api-cn.oppo.cn";
                this.robotHost = "https://iservice.oppo.cn/robot";
                this.uploadFileHost = "http://ossapihd.comm.oppo.cn";
                this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                this.H5_Order = BuildConfig.H5_Order_RELEASE;
                this.H5_Order1 = BuildConfig.H5_Order1_RELEASE;
                this.H5_TASK_CENTER = BuildConfig.H5_TASK_CENTER_RELEASE;
                return;
            }
            this.serverApiHost = "https://java-test-oppo-out.wanyol.com";
            this.h5Host = "https://test2-opposhop.wanyol.com";
            this.h5HostForOut = "https://test-opposhop-out.wanyol.com";
            this.userServiceHost = "https://iservice.wanyol.com";
            this.userApiServiceHost = "http://test.i.api.wanyol.com";
            this.liveApiHost = "https://java-test-oppo-out.wanyol.com";
            this.imApiHost = "https://bbs.wanyol.com";
            this.robotHost = "https://iservice.oppo.cn/robot";
            this.uploadFileHost = "http://test.ossapi.wanyol.com";
            this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
            this.H5_Order = "https://test3-oppo.wanyol.com/cn/app/order/detail?serial=";
            this.H5_Order1 = "https://test3-oppo.wanyol.com/cn/app/order/list?type=2";
            this.H5_TASK_CENTER = "https://test-oppo.wanyol.com/cn/app/taskCenter/index";
        }
    }

    static {
        ENV = new Environment(1);
        try {
            TEST_ENV = ((Boolean) ReflectUtil.getStaticField("com.oppo.store.config.UrlConfig", "TEST_ENV")).booleanValue();
        } catch (Exception unused) {
            TEST_ENV = false;
        }
        try {
            Environment environment = (Environment) ReflectUtil.getStaticField("com.oppo.store.config.UrlConfig", "ENV");
            ENV = environment;
            if (environment == null) {
                ENV = new Environment(0);
            }
        } catch (Exception unused2) {
            ENV = new Environment(0);
        }
        boolean z = TEST_ENV;
        DEBUG = z;
        ALLOW_PROXY = z;
        CRASH_LOG = z;
        WEB_DEBUG = z;
        STATISTICS_IS_DEBUG = z;
        STATISTICS_IS_ENABLE_LOG = z;
        HUANTAI_PAY_IS_DEBUG = z;
        URL_USER_PROTOCOL = "https://dsfs.oppo.com/store/cn/app/files/useragreement.html";
        H5_EXCHANGE_AFTER_SALE = ENV.isRelease() ? "https://afs.opposhop.cn/m/list" : "https://afs-pre.opposhop.cn/m/list";
        H5_PRODUCT_URL = ENV.isRelease() ? "https://store.oppo.com/cn/app/product/index?skuId=" : "https://store-test2-c.wanyol.com/cn/app/product/index?skuId=";
    }

    public static String getH5ProductDetailUrl(String str) {
        return "https://www.heytap.com/cn/m/product/index?skuId=" + str;
    }

    public static String getH5Url(String str) {
        return ENV.h5Host + str;
    }

    public static String getPrivacyPolicyUrl() {
        if (GlobalParams.isCommunityAPP()) {
            if (ENV.isRelease()) {
                return "https://hd.opposhop.cn/act/privacyPolicy.html?source_type=506";
            }
            return ENV.isPreRelease() ? "https://prehd.opposhop.cn/act/privacyPolicy.html?source_type=506" : "https://hd-test2-a.wanyol.com/act/privacyPolicy.html?source_type=506";
        }
        if (ENV.isRelease()) {
            return "https://hd.opposhop.cn/act/privacyPolicy.html?source_type=501";
        }
        return ENV.isPreRelease() ? "https://prehd.opposhop.cn/act/privacyPolicy.html?source_type=501" : "https://hd-test2-a.wanyol.com/act/privacyPolicy.html?source_type=501";
    }

    public static String getH5Url(String str, String str2) {
        if (ENV.isRelease()) {
            str = H5_HOST_RELEASE_NEW;
        } else if (ENV.isPreRelease()) {
            str = "https://prestore.oppo.com";
        } else if (str.isEmpty()) {
            str = H5_HOST_TEST_NEW;
        }
        return str + str2;
    }
}
