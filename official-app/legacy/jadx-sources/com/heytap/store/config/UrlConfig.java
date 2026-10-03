package com.heytap.store.config;

/* JADX INFO: loaded from: classes4.dex */
public class UrlConfig {
    public static final boolean ALLOW_PROXY = false;
    public static final String API_SERVER_CONTROL_SETTINGS = "/common/v1/settings/index.json";
    public static final String API_UPLOAD_SHARE_DATA = "/thread/v2/share/index.pb";
    public static final boolean DEBUG = false;
    public static final Environment ENV = new Environment(0);
    public static final String H5_ADDRESSES = "/user/addresses?utm_source=opposhop&is_simple=1";
    public static final String H5_All_Order = "/orders?type=1&utm_source=opposhop&is_simple=1";
    public static final String H5_CART = "/cart?is_simple=1";
    public static final String H5_COUPONS = "/coupons/show?utm_source=opposhop&is_simple=1";
    public static final String H5_Order1 = "/orders?type=2&utm_source=opposhop&is_simple=1";
    public static final String H5_Order2 = "/orders?type=3&utm_source=opposhop&is_simple=1";
    public static final String H5_Order3 = "/orders?type=4&utm_source=opposhop&is_simple=1";
    public static final String H5_Order4 = "/orders?type=5&utm_source=opposhop&is_simple=1";
    public static final String H5_PRODUCT_DETAIL_URL = "https://www.heytap.com/cn/m/product/index?skuId=";
    public static final String H5_RECYCLE = "/recycle/show?utm_source=opposhop&is_simple=1";
    public static final String H5_RECYCLE_LIST = "/recycle/list?utm_source=opposhop&is_simple=1";
    public static final String H5_SERVICE_SEARCH = "/search.html";
    public static final String INSERT = "/thread/v2/attachment/insert.pb";
    public static final String POST_PUSH_REG_ID = "/users/v1/message/push/bind/register/id";
    public static final String RESTRICTED_URL = "/orders/v1/spec/url";
    public static final String SERVICE_NEARBY_STORE = "https://xcx3rd.oppo.cn/portal/offlineStore/area/list";
    public static final String SESSIONKEY = "/security/v1/token/getSessionKey";
    public static final boolean STATISTICS_IS_DEBUG = false;
    public static final String URL_PRIVACY_POLICY = "https://www.oppo.com/cn/service/help/650?id=650&name=%E6%9C%8D%E5%8A%A1%E6%94%BF%E7%AD%96&isapp=1&hdscreen=1";
    public static final String URL_USER_PROTOCOL = "https://www.oppo.com/cn/service/help/649?id=649&name=%E6%9C%8D%E5%8A%A1%E6%94%BF%E7%AD%96&isapp=1&hdscreen=1";
    public static final boolean WEB_DEBUG = false;

    public static class Environment {
        public static final int APP_TEST = 4;
        public static final int AUTO_TEST = 5;
        public static final int HOST_SWITCH = 8;
        public static final int INTEGRATION_TEST = 6;
        public static final int MULTI_TEST = 3;
        public static final int OLD_TEST = 7;
        public static final int PRE_RELEASE = 2;
        public static final int PRE_RELEASE_HUITIAN = 11;
        public static final int RELEASE = 0;
        public static final int TEST = 1;
        public static final int TEST_A = 9;
        public static final int TEST_C = 10;
        private int currentEnv = 0;
        public String serverApiHost = "https://msec.opposhop.cn";
        public String h5Host = "https://www.opposhop.cn";
        public String h5HostForOut = "https://www.opposhop.cn";
        public String userServiceHost = "https://iservice.oppo.cn";
        public String userApiServiceHost = "https://i-user.oppo.cn";
        public String liveApiHost = "https://live.opposhop.cn";
        public String imApiHost = "https://i-msg.oppo.cn";
        public String robotHost = "https://iservice.oppo.cn/robot";
        public String udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";

        public Environment(int i) {
            switchEnv(i);
        }

        public int getCurrentEnv() {
            return this.currentEnv;
        }

        public boolean isRelease() {
            return this.currentEnv == 0;
        }

        public boolean isUdeskUrl(String str) {
            return str.startsWith(this.udeskHost);
        }

        public void switchEnv(int i) {
            String str;
            String str2;
            this.currentEnv = i;
            switch (i) {
                case 0:
                    this.serverApiHost = "https://msec.opposhop.cn";
                    this.h5Host = "https://www.opposhop.cn";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://live.opposhop.cn";
                    this.imApiHost = "https://i-msg.oppo.cn";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                    return;
                case 1:
                    this.serverApiHost = "https://store-test2-a.wanyol.com";
                    this.h5Host = "https://test2-opposhop.wanyol.com";
                    this.h5HostForOut = "https://test-opposhop-out.wanyol.com";
                    this.userServiceHost = "https://iservice.wanyol.com";
                    this.userApiServiceHost = "http://test.i.api.wanyol.com";
                    this.liveApiHost = "https://java-test-oppo.wanyol.com";
                    this.imApiHost = "http://bbs.wanyol.com";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
                    return;
                case 2:
                    this.serverApiHost = "https://premsec.opposhop.cn";
                    this.h5Host = "https://prestore.oppo.com";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://prelive.opposhop.cn";
                    this.imApiHost = "https://i-msg.oppo.cn";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                    return;
                case 3:
                    this.serverApiHost = "https://msec.opposhop.cn";
                    this.h5Host = "https://www.opposhop.cn";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://live.opposhop.cn";
                    this.imApiHost = "https://i-msg.oppo.cn";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                    return;
                case 4:
                    this.serverApiHost = "https://msec.opposhop.cn";
                    this.h5Host = "https://www.opposhop.cn";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://live.opposhop.cn";
                    this.imApiHost = "https://i-msg.oppo.cn";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                    return;
                case 5:
                    this.serverApiHost = "https://msec.opposhop.cn";
                    this.h5Host = "https://www.opposhop.cn";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://live.opposhop.cn";
                    this.imApiHost = "https://i-msg.oppo.cn";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                    return;
                case 6:
                    this.serverApiHost = "https://msec.opposhop.cn";
                    this.h5Host = "https://www.opposhop.cn";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://live.opposhop.cn";
                    this.imApiHost = "https://i-msg.oppo.cn";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://olss-online.oppo.com/opposrv/account/entry";
                    return;
                case 7:
                    this.serverApiHost = "https://java-test-oppo.wanyol.com";
                    this.h5Host = "https://test2-opposhop.wanyol.com";
                    this.h5HostForOut = "https://test-opposhop-out.wanyol.com";
                    this.userServiceHost = "https://iservice.wanyol.com";
                    this.userApiServiceHost = "http://test.i.api.wanyol.com";
                    this.liveApiHost = "https://java-test-oppo.wanyol.com";
                    this.imApiHost = "http://bbs.wanyol.com";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
                    return;
                case 8:
                    this.serverApiHost = "https://msec.opposhop.cn";
                    this.h5Host = "https://www.opposhop.cn";
                    this.h5HostForOut = "https://www.opposhop.cn";
                    this.userServiceHost = "https://iservice.oppo.cn";
                    this.userApiServiceHost = "https://i-user.oppo.cn";
                    this.liveApiHost = "https://live.opposhop.cn";
                    str = "https://i-msg.oppo.cn";
                    this.imApiHost = str;
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    str2 = "https://olss-online.oppo.com/opposrv/account/entry";
                    this.udeskHost = str2;
                    break;
                case 9:
                    this.serverApiHost = "https://store-test2-a.wanyol.com";
                    this.h5Host = "https://test2-opposhop.wanyol.com";
                    this.h5HostForOut = "https://test-opposhop-out.wanyol.com";
                    this.userServiceHost = "https://iservice.wanyol.com";
                    this.userApiServiceHost = "http://test.i.api.wanyol.com";
                    this.liveApiHost = "https://java-test-oppo.wanyol.com";
                    this.imApiHost = "http://bbs.wanyol.com";
                    this.robotHost = "https://iservice.oppo.cn/robot";
                    this.udeskHost = "https://test-linapp.olss.myoas.com/opposrv/account/entry";
                    return;
                case 10:
                default:
                    return;
                case 11:
                    str2 = "https://olss-online.oppo.com/opposrv/account/entry";
                    str = "https://i-msg.oppo.cn";
                    break;
            }
            this.serverApiHost = "https://premsec.heytap.com";
            this.h5Host = "https://prewww.heytap.com";
            this.h5HostForOut = "https://prewww.heytap.com";
            this.userServiceHost = "https://iservice.oppo.cn";
            this.userApiServiceHost = "https://i-user.oppo.cn";
            this.liveApiHost = "https://premsec.heytap.com";
            this.imApiHost = str;
            this.robotHost = "https://iservice.oppo.cn/robot";
            this.udeskHost = str2;
        }
    }

    public static String getH5ProductDetailUrl(String str) {
        return "https://www.heytap.com/cn/m/product/index?skuId=" + str;
    }

    public static String getH5Url(String str) {
        return ENV.h5Host + str;
    }

    public static final String getServerApiUrl(String str) {
        return ENV.serverApiHost + str;
    }
}
