package com.heytap.store.util;

import android.text.TextUtils;
import com.heytap.store.entity.bean.IconsDetailsBean;
import com.heytap.store.entity.bean.IconsLabelsBean;
import com.heytap.store.protobuf.IconDetails;
import com.heytap.store.protobuf.Icons;
import com.heytap.store.protobuf.LabelDetails;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public class HomeTransformUtils {
    private static final String IS_QUICK = "is_quick=";
    private static final String QUICK_APP = "hap://app";
    private static final String QUICK_GAME = "hap://game";
    private static final String QUICK_LINK = "&quick_link=";
    private static final String QUICK_VERSION = "&quick_version=";

    public static List<IconsDetailsBean> iconsPbToBean(Icons icons) {
        return iconsPbToBean(icons, null);
    }

    private static boolean isNoSupportQuickLink(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (!str.contains(IS_QUICK) || !str.contains(QUICK_VERSION) || !str.contains(QUICK_LINK) || !"1".equals(str.substring(str.indexOf(IS_QUICK) + 9, str.indexOf(QUICK_VERSION)))) {
                return false;
            }
            str.indexOf(QUICK_LINK);
            return false;
        } catch (Exception unused) {
            return true;
        }
    }

    public static boolean isNoSupportQuickProgram(String str) {
        return isNoSupportQuickLink(str);
    }

    public static boolean isWXMiniProgram(String str) {
        return !TextUtils.isEmpty(str) && str.contains("WXMiniProgramID");
    }

    private static boolean startsWithQuickLink(String str) {
        return TextUtils.isEmpty(str) || str.startsWith(QUICK_APP) || str.startsWith(QUICK_GAME);
    }

    public static String subLink(String str) {
        try {
            if (!TextUtils.isEmpty(str) && str.contains(QUICK_LINK)) {
                String strSubstring = str.substring(str.indexOf(QUICK_LINK) + 12, str.length());
                if (startsWithQuickLink(strSubstring)) {
                    return strSubstring;
                }
            }
            return (!TextUtils.isEmpty(str) && isWXMiniProgram(str) && str.contains("www.opposhop.cn/app/store")) ? str.substring(str.indexOf("www.opposhop.cn/app/store")) : str;
        } catch (Exception unused) {
            return str;
        }
    }

    public static List<IconsDetailsBean> iconsPbToBean(Icons icons, String str) {
        return iconsPbToBean(icons.details, str, null);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00ab  */
    public static List<IconsDetailsBean> iconsPbToBean(List<IconDetails> list, String str, String str2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        if (list != null && list.size() > 0) {
            for (int i = 0; i < list.size(); i++) {
                IconDetails iconDetails = list.get(i);
                if (iconDetails != null && !isNoSupportQuickProgram(iconDetails.link)) {
                    List<LabelDetails> list2 = iconDetails.labelDetailss;
                    ArrayList arrayList2 = new ArrayList();
                    if (list2 != null && list2.size() > 0) {
                        for (int i2 = 0; i2 < list2.size(); i2++) {
                            LabelDetails labelDetails = list2.get(i2);
                            if (labelDetails != null) {
                                IconsLabelsBean iconsLabelsBean = new IconsLabelsBean(labelDetails.name, labelDetails.color);
                                iconsLabelsBean.setBeginTime(labelDetails.beginAt);
                                iconsLabelsBean.setEndTime(labelDetails.endAt);
                                arrayList2.add(iconsLabelsBean);
                            }
                        }
                    }
                    IconsDetailsBean iconsDetailsBean = new IconsDetailsBean();
                    iconsDetailsBean.setUrl(iconDetails.url);
                    iconsDetailsBean.setTitle(iconDetails.title);
                    iconsDetailsBean.setSeq(iconDetails.seq);
                    iconsDetailsBean.setLink(subLink(iconDetails.link));
                    iconsDetailsBean.setId(iconDetails.id);
                    iconsDetailsBean.setClickUrl(iconDetails.clickUrl);
                    iconsDetailsBean.setLabelDetailss(arrayList2);
                    iconsDetailsBean.setShowName(iconDetails.showName);
                    iconsDetailsBean.setRemark(iconDetails.remark);
                    iconsDetailsBean.setBeginAt(iconDetails.beginAt);
                    iconsDetailsBean.setEndAt(iconDetails.endAt);
                    Integer num = iconDetails.isLogin;
                    if (num != null) {
                        z = num.intValue() == 1;
                    }
                    iconsDetailsBean.setIsLogin(z);
                    iconsDetailsBean.setTextColor(str);
                    iconsDetailsBean.setBgUrlOrColor(str2);
                    iconsDetailsBean.setJsonUrl(iconDetails.jsonUrl);
                    iconsDetailsBean.setJsonClickUrl(iconDetails.jsonClickUrl);
                    arrayList.add(iconsDetailsBean);
                }
            }
        }
        return arrayList;
    }
}
