package com.heytap.store.base.core.util.deeplink;

import android.text.TextUtils;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes3.dex */
public class PatternUtil {
    public static final String REGEX_H5_CART = "/cart$";
    public static final String REGEX_H5_NEW = "news/list";
    public static final String REGEX_H5_NEW_DETAIL = "news/detail";
    public static final String REGEX_H5_ORDERS = "/orders$";
    public static final String REGEX_H5_ORDERS_CCB_BACK_URL = "https://ibsbjstar.ccb.com.cn/";
    public static final String REGEX_H5_ORDERS_CONFIRMATION = "/orders/[0-9]+/confirmation[\\s\\S]*";
    public static final String REGEX_H5_ORDERS_DETAIL = "/orders/[0-9]+/show[\\s\\S]*";
    public static final String REGEX_H5_ORDERS_PAYMENTS = "/orders/[0-9]+/payments[\\s\\S]*";
    public static final String REGEX_H5_ORDERS_PROCESSING = "/orders/[0-9]+/processing[\\s\\S]*";
    public static final String REGEX_H5_ORDERS_WITH_PAYMENT = "/orders\\?type=[0-9]+[\\s\\S]*";
    public static final String REGEX_H5_PRODUCTS_DETAIL = "/products/[0-9]+.html[\\s\\S]*";
    public static final String REGEX_H5_PRODUCTS_DETAIL1 = "/product/index[\\s\\S]*";
    public static final String REGEX_H5_TRADE = "/trade[\\s\\S]*";
    public static final String REGEX_INDEX_GET_NUMBERS = "^\\d+";

    public static boolean find(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        return Pattern.compile(str2).matcher(str).find();
    }

    public static boolean isColor(String str) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str)) {
            return false;
        }
        return Pattern.compile("^#([0-9a-fA-F]{6}|[0-9a-fA-F]{3})$").matcher(str).matches();
    }
}
