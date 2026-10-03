package com.heytap.store.base.core.util.app;

import android.text.TextUtils;
import com.heytap.store.base.core.connectivity.ConnectivityManagerProxy;
import com.heytap.store.base.core.http.HttpConst;
import com.heytap.store.base.core.state.UrlConfig;
import com.heytap.store.base.core.util.NullObjectUtil;
import com.heytap.store.platform.tools.LogUtils;
import com.oplus.aiunit.vision.ham;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class HostDomainCenter {
    public static final String CLOUDI_BROWSER_HEYTAPMOBI_COM = "cloudi.browser.heytapmobi.com";
    public static final String COMMENT_UP_VIDEO = "ocs-cn-south1.heytapcs.com";
    public static final String CPC_COMMENT_CN_HEYTAPMOBI_COM = "cpc-comment-cn.heytapmobi.com";
    public static final String DPS_WANYOL_COM = "dps.wanyol.com";
    public static final String DSFS_OPPO_COM = "dsfs.oppo.com";
    public static final String H5_PRE_INTERFACE = "store.oppo.com";
    public static final String HEYTAP_COM = "heytap.com";
    public static final String IBROWSER_FEEDS_HEYTAPMOBI_COM = "ibrowser.feeds.heytapmobi.com";
    public static final String IM_OPPO_CN = "im-api-cn.oppo.cn";
    public static final String ISERVICE_OPPO_CN = "iservice.oppo.cn";
    public static final String LIKE_CPC_HEYTAPMOBI_COM = "like.cpc.heytapmobi.com";
    public static final String LIVE_OPPO_CN = "live.opposhop.cn";
    public static final String MSEC_OPPOSHOP_CN = "msec.opposhop.cn";
    public static final String MYOAS_NET = "myoas.net";
    public static final String OPPOSHOP_CN = "opposhop.cn";
    public static final String OPPO_COM = "oppo.com";
    private static final String OPPO_PAY_SCHEME = "wallet://";
    public static final String REALME_COM = "realme.com";
    public static final String S_HEYTAPIMAGE_COM = "s.heytapimage.com";
    private static final String TAG = "HostDomainCenter";
    public static final String WANYOL_COM = "wanyol.com";
    public static List<String> domainWhiteList = new CopyOnWriteArrayList();
    public static List<String> localWhiteList = new ArrayList<String>() { // from class: com.heytap.store.base.core.util.app.HostDomainCenter.1
        {
            add(HostDomainCenter.OPPO_COM);
            add(HostDomainCenter.HEYTAP_COM);
            add(HostDomainCenter.REALME_COM);
            add("nearme.com");
            add(HostDomainCenter.OPPOSHOP_CN);
            add("sensorsdata.cn");
            add("oppomobile.com");
            add("myoppo.com");
            add("ds-aksb-a.akamaihd.net");
            add("huishoubao.com");
            add("sentry.io");
            add("growingio.com");
            add(ham.B);
            add("oppofind.com");
            add(HostDomainCenter.WANYOL_COM);
            add("ibsbjstar.ccb.com.cn");
            add("support.qq.com");
            add("mp.weixin.qq.com");
            add("wx.tenpay.com");
            add("keke.cn");
            add("oneplus.com");
            add("coloros.wjx.cn");
            add("ccp.oppo.com");
            add("ccp.opposhop.cn");
            add("ccp-user-test.oasqa.com");
            add("ccp-test.oasqa.com");
            add("lianlianpay.com");
        }
    };
    public static List<String> packageWhiteList = new ArrayList<String>() { // from class: com.heytap.store.base.core.util.app.HostDomainCenter.2
        {
            add("com.oppo.usercenter");
        }
    };
    public static List<String> nightWhiteList = new ArrayList<String>() { // from class: com.heytap.store.base.core.util.app.HostDomainCenter.3
        {
            add("app/vipCenter/index");
        }
    };
    public static final CopyOnWriteArrayList<String> apiHostWhiteList = new CopyOnWriteArrayList<String>() { // from class: com.heytap.store.base.core.util.app.HostDomainCenter.4
        {
            add(HostDomainCenter.MSEC_OPPOSHOP_CN);
            add(HostDomainCenter.DSFS_OPPO_COM);
            add(HostDomainCenter.DPS_WANYOL_COM);
            add(HostDomainCenter.ISERVICE_OPPO_CN);
            add(HostDomainCenter.LIVE_OPPO_CN);
            add(HostDomainCenter.IM_OPPO_CN);
            add("openapi.danghuan.com");
            add(HostDomainCenter.COMMENT_UP_VIDEO);
            add(HostDomainCenter.IBROWSER_FEEDS_HEYTAPMOBI_COM);
            add(HostDomainCenter.LIKE_CPC_HEYTAPMOBI_COM);
            add(HostDomainCenter.CLOUDI_BROWSER_HEYTAPMOBI_COM);
            add(HostDomainCenter.CPC_COMMENT_CN_HEYTAPMOBI_COM);
            add(HostDomainCenter.H5_PRE_INTERFACE);
            add(HostDomainCenter.S_HEYTAPIMAGE_COM);
        }
    };
    public static List<String> serviceOutletsWhiteList = new ArrayList<String>() { // from class: com.heytap.store.base.core.util.app.HostDomainCenter.5
        {
            add("sa.opposhop.cn");
            add("api.map.baidu.com");
            add("loc.map.baidu.com");
        }
    };
    public static final CopyOnWriteArraySet<String> apiSignHeaderSet = new CopyOnWriteArraySet<String>() { // from class: com.heytap.store.base.core.util.app.HostDomainCenter.6
        {
            add("/web/cashingCoupons/v2/cashingCredits");
            add("/web/cashingCoupons/cashingCredits");
            add("/web/cashingCoupons/v2/drawCoupons");
            add("/web/cashingCoupons/drawCouponsByActivityName");
            add("/web/cashingCoupons/platformDrawCoupons");
            add("/web/cashingCoupons/v2/heyTapDrawCoupons");
            add("/web/cashingCoupons/drawPurposeCoupons");
            add("/v1/coupons/drawCoupons");
            add("/v1/coupons/v2/drawCoupons");
            add("/web/couponsCenter/drawSecKillCoupons");
            add("/web/couponsCenter/drawPurposeCoupons");
            add("/raffle/clickRaffle");
            add("/orders/web/trade/create");
            add("/orders/web/orders/risk/getCaptchaType");
            add("/web/store/risk/getRiskLevel");
            add("/web/cashingCoupons/getCaptchaType");
        }
    };
    private static final String[] OTHER_WEB_BROWSER_URL_DOMAIN_WHITE_LIST = {"kuai.xunlei.com", "weiyun.com", "115.com", "pan.baidu.com", "vdisk.weibo.com", "kuaipan.cn", "dbank.com", "hwid1.vmall.com", "cloud.le.com", "pan.suning.com", "ctfile.com", "wp.163.com", "kanbox.com", "yun.uc.cn", "yunpan.taobao.com", "gokuai.com", "caiyun.feixin.10086.cn", "qiannao.com", "paifs.nearme.com.cn", "_blank"};
    private static final String[] OTHER_WEB_BROWSER_URL_SUFFIX_WHITE_LIST = {".apk", ".rar", ".zip", ".pdf", ".doc", ".mp3", ".wma", ".mp4", ".theme", ".med", ".attach"};
    private static final String[] OTHER_WEB_BROWSER_URL_SCHEME_WHITE_LIST = {"weixin://", "intent://", "TencentWeibo://", "taobao://", "alipay://", "sinaweibo://", "mqqbrowser://", "ucbrowser://", "SogouMSE://", "baidumap://", "googlechrome://", "youku://", "openapp.jdmoble://", "imeituan://", "dianping://", "doubanradio://", "wcc://", " zhihu://", "bilibili://", "iot://ohome/bridgepage"};

    public static void addLocalList(List<String> list) {
        localWhiteList.addAll(list);
    }

    public static boolean allowEnterStore(String str) {
        return allowWebViewActivity(str);
    }

    public static boolean allowForceDark(String str) {
        Iterator<String> it = nightWhiteList.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static boolean allowWebViewActivity(String str) {
        return allowWebViewActivity(str, null);
    }

    public static String getHostByRegex(String str) {
        try {
            Matcher matcher = Pattern.compile("^(([^:/?#]+):)?(//([^/?#]*))?([^?#]*)(\\?([^#]*))?(#(.*))?").matcher(str);
            if (matcher.find()) {
                return matcher.group(4);
            }
            return null;
        } catch (Exception e2) {
            LogUtils.INSTANCE.e(TAG, "getHostByRegex error = " + e2);
            return null;
        }
    }

    public static void main(String[] strArr) {
        String[] strArr2 = {"https://www.2opposfs.oppo.com.erer.com", "sfds", "http://www.a34oppo.cn", "https://www.2opposfs.com.oppo.com/erwr", "http://www.keke12.cn", "http://www.opposhop.com.cn/34sf", "http://www.wanyol.com"};
        for (int i = 0; i < 7; i++) {
            allowEnterStore(strArr2[i]);
        }
    }

    public static void setApiHostWhiteList(List<String> list) {
        apiHostWhiteList.addAll(list);
    }

    public static void setApiSignHeaderList(List<String> list) {
        apiSignHeaderSet.addAll(list);
    }

    public static void setDynamicDomainWhiteList(List<String> list) {
        try {
            if (NullObjectUtil.isNullOrEmpty(list) || !domainWhiteList.isEmpty()) {
                return;
            }
            domainWhiteList.addAll(list);
        } catch (ConcurrentModificationException e2) {
            LogUtils.INSTANCE.e(TAG, "设置h5域名白名单报错");
            e2.printStackTrace();
        }
    }

    public static void setPackageWhiteList(List<String> list) {
        packageWhiteList.addAll(list);
    }

    public static boolean verifyApiSignHeaderList(String str) {
        for (String str2 : apiSignHeaderSet) {
            if (str != null && str.contains(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyFenzidaiUrl(String str) {
        return !TextUtils.isEmpty(str) && str.contains(OPPO_PAY_SCHEME);
    }

    private static boolean verifyH5HostDomainWhiteList(String str) {
        return verifyH5HostDomainWhiteList(str, null);
    }

    public static boolean verifyH5Url(String str) {
        if (!UrlConfig.ENV.isRelease()) {
            return true;
        }
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String strReplace = str.replace("\\", "/");
        try {
            String host = new URI(strReplace).getHost();
            if (TextUtils.isEmpty(host)) {
                return false;
            }
            if (strReplace.startsWith("weixin://") && host.equals(ConnectivityManagerProxy.NETWORK_TYPE_NAME_MOBILE_WAP)) {
                return true;
            }
            return verifyH5HostDomainWhiteList(host);
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean verifyHostWhiteList(String str) {
        return verifyHostWhiteList(str, null);
    }

    public static boolean verifyOtherWebBrowserDomainWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            String host = new URI(str.replace("\\", "/")).getHost();
            if (!TextUtils.isEmpty(host)) {
                for (String str2 : OTHER_WEB_BROWSER_URL_DOMAIN_WHITE_LIST) {
                    if (host.contains(str2)) {
                        return true;
                    }
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return false;
    }

    public static boolean verifyOtherWebBrowserHttpWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return str.startsWith("http:") || str.startsWith("https:");
    }

    public static boolean verifyOtherWebBrowserSchemeWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : OTHER_WEB_BROWSER_URL_SCHEME_WHITE_LIST) {
            if (str.startsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyOtherWebBrowserSuffixWhiteList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        for (String str2 : OTHER_WEB_BROWSER_URL_SUFFIX_WHITE_LIST) {
            if (str.endsWith(str2)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyPackageNameWitheList(String str) {
        if (packageWhiteList.size() <= 0) {
            return false;
        }
        Iterator<String> it = packageWhiteList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean verifyServerApiHostWhiteList(String str) {
        try {
            Iterator<String> it = apiHostWhiteList.iterator();
            while (it.hasNext()) {
                if (it.next().equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        } catch (ConcurrentModificationException unused) {
            return true;
        }
    }

    public static boolean verifyServiceOutletsNameWitheList(String str) {
        if (serviceOutletsWhiteList.size() <= 0) {
            return false;
        }
        Iterator<String> it = serviceOutletsWhiteList.iterator();
        while (it.hasNext()) {
            if (it.next().equals(str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean allowWebViewActivity(String str, List<String> list) {
        if (UrlConfig.WEB_DEBUG) {
            return true;
        }
        if (str == null) {
            return false;
        }
        String strReplace = str.replace("\\", "/");
        String hostByRegex = null;
        try {
            hostByRegex = new URI(strReplace).getHost();
            if (strReplace.toLowerCase().contains("javascript") || str.contains(HttpConst.COOKIE)) {
                return false;
            }
        } catch (Exception e2) {
            if (e2 instanceof URISyntaxException) {
                hostByRegex = getHostByRegex(strReplace);
            }
            LogUtils.INSTANCE.e(TAG, "allowWebViewActivity error = " + e2);
        }
        if (hostByRegex != null) {
            return verifyHostWhiteList(hostByRegex, list);
        }
        return false;
    }

    private static boolean verifyH5HostDomainWhiteList(String str, List<String> list) {
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            if (list == null) {
                list = domainWhiteList;
            }
            for (String str2 : list) {
                if (str.endsWith("." + str2) || str.equals(str2)) {
                    return true;
                }
            }
            for (String str3 : localWhiteList) {
                if (str.endsWith("." + str3) || str.equals(str3)) {
                    return true;
                }
            }
            return false;
        } catch (ConcurrentModificationException unused) {
            return true;
        }
    }

    public static boolean verifyHostWhiteList(String str, List<String> list) {
        if (str != null) {
            return verifyH5HostDomainWhiteList(str, list);
        }
        return false;
    }
}
