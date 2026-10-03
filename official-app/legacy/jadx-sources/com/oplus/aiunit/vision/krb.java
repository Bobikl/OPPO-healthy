package com.oplus.aiunit.vision;

import android.text.TextUtils;
import com.heytap.connect.TapConst;
import com.heytap.health.operation.medal.bean.MedalUploadBean;
import com.heytap.health.operations.bean.MedalListBean;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes17.dex */
public class krb {
    public static final String ACCOUNTNUMBER = "account_number";
    public static final int ACKSTATUS_ACK = 1;
    public static final int ACKSTATUS_NONE = 0;
    public static final String ALLMEDALSTATE = "AllMedalState";
    public static final String ANNUALCHALLENGE = "cme_annual_challenge_2021";
    public static final String CACHE_UPLOAD_MEDALS = "CACHE_UPLOAD_MEDALS";
    public static final String CALORIE = "calorie";
    public static final String CMEALLACT = "cme_all_act";
    public static final String CMEALLACTBONUS = "cme_all_actbonus";
    public static final String CMEALLACT_3 = "cme_all_act_3";
    public static final String CMEALLACT_7 = "cme_all_act_7";
    public static final String CMEALLCALORIE = "cme_all_calorie";
    public static final String CMEALLOPEN = "cme_all_open";
    public static final String CMEALLOPEN10 = "cme_all_open_10";
    public static final String CMEALLOPEN50 = "cme_all_open_50";
    public static final String CMEALLRUNMILE = "cme_all_runmile";
    public static final String CMEALLSHARE = "cme_all_share";
    public static final String CMEALLSHARE1 = "cme_all_share_1";
    public static final String CMEALLSHARE20 = "cme_all_share_20";
    public static final String CMEALLSHARE5 = "cme_all_share_5";
    public static final String CMEALLSHARE50 = "cme_all_share_50";
    public static final String CMEALLSKIMILE = "cme_all_skimile";
    public static final String CMEALLSPORTS = "cme_all_sports";
    public static final String CMEALLSPORTS1 = "cme_all_sports_1";
    public static final String CMEALLSPORTS10 = "cme_all_sports_10";
    public static final String CMEALLSPORTS100 = "cme_all_sports_100";
    public static final String CMEALLSPORTS50 = "cme_all_sports_50";
    public static final String CMEALLSPORTS500 = "cme_all_sports_500";
    public static final String CMEALLSPORTUP = "cme_all_sportup";
    public static final String CMEALLSTEPS = "cme_all_steps";
    public static final String CMEALLWORKMILE = "cme_all_workmile";
    public static final String CMEATTENDACT = "cme_attend_act";
    public static final String CMEATTENDACT1 = "cme_attend_act_1";
    public static final String CMEATTENDACT20 = "cme_attend_act_20";
    public static final String CMEATTENDACT50 = "cme_attend_act_50";
    public static final String CMEDAYACT = "cme_day_act";
    public static final String CMEDAYACT_100 = "cme_day_act_100";
    public static final String CMEDAYACT_20 = "cme_day_act_20";
    public static final String CMEDAYACT_200 = "cme_day_act_200";
    public static final String CMEDAYACT_50 = "cme_day_act_50";
    public static final String CMEDAYSTEP = "cme_day_step";
    public static final String CMEHABITDAYS = "cme_habit_days";
    public static final String CMELONGTIME = "cme_long_time";
    public static final String CMELONGTIME30 = "cme_long_time_30";
    public static final String CMERUNSPEED = "cme_run_speed";
    public static final String CMESINGLERIDING = "cme_single_riding";
    public static final String CMESINGLERUNMILE = "cme_single_runmile";
    public static final String CMESINGLERUNMILE_ALL = "cme_single_runmile_42.195";
    public static final String CMESINGLERUNMILE_HALF = "cme_single_runmile_21.0975";
    public static final String CMESINGLESWIMMING = "cme_single_swimming";
    public static final String CMESINGLEWORKMILE = "cme_single_workmile";
    public static final String CMESTEPCHECKIN = "cme_step_checkin";
    public static final String CMESTEPRANKING = "cme_step_ranking";
    public static final String CME_ALL_CLOUD_OBTAIN = "cme_all_cloud_obtain";
    public static final String DAILYACT = "dailyact";
    public static final int DISPLAY = 1;
    public static final String DOTDEFAULT = "0,0";
    public static final String DOTS = ",";
    public static final int FLAGAPP = 0;
    public static final int FLAGCLOUD = 1;
    public static final int GETMEDAL = 1;
    public static final String LININGMEDAL = "cme_lining_limiting_badge";
    public static final String MEDALDETAIL = "MedalDetail";
    public static final String MEDALDETAILLIST = "MedalDetailList";
    public static final String MEDALWALLSHARELIST = "medalWallShareList";
    public static final String MEDAL_EVENT_TYPES = "medal_event_types";
    public static final long MEDAL_GET_MIN_TIME = 1514736000000L;
    public static final String MONTH_PRE = "cme_month";
    public static final int NOGETMEDAL = 0;
    public static final String SMEBINDQQ = "sme_bind_qq";
    public static final String SMEBINDWECHAT = "sme_bind_wechat";
    public static final String SMEFARTHESTRUN = "sme_farthest_run";
    public static final String SMELONGNOSPORT = "sme_long_nosport";
    public static final String SMEPERFECTFILES = "sme_perfect_files";
    public static final String SPORTKM = "sportkm";
    public static final String SPORTMAN = "cme_sport_duration";
    public static final String SPORTTIME = "sporttime";
    public static final String TIME_TYPE = "cme_month";
    public static final String ALL_BONES = "ALL_BONES" + oa2.c();
    public static final String ALL_REDENVELOPE_JOINTIMES = "ALL_REDENVELOPE_JOINTIMES" + oa2.c();
    public static final String ALL_BG_MEDALS = "ALL_BG_MEDALS" + oa2.c();

    public static boolean a(String str) {
        if (str == null) {
            return false;
        }
        try {
            return new File(str).exists();
        } catch (Exception unused) {
            return false;
        }
    }

    public static List<MedalUploadBean> b(List<MedalUploadBean> list) {
        HashSet hashSet = new HashSet(list);
        list.clear();
        list.addAll(hashSet);
        ArrayList arrayList = new ArrayList();
        for (MedalUploadBean medalUploadBean : list) {
            if (medalUploadBean.getGetResult() == 0) {
                oqb.a("uploadGetMedal >> filtter 过滤未获得的勋章 ", medalUploadBean);
            } else if (medalUploadBean.getGetResult() != 1 || medalUploadBean.getAcquisitionDate() > MEDAL_GET_MIN_TIME) {
                arrayList.add(medalUploadBean);
            } else {
                oqb.a("uploadGetMedal >> filtter 过滤获得勋章时间小于2018年的数据 不合理", medalUploadBean);
            }
        }
        return arrayList;
    }

    public static String c(MedalListBean medalListBean) throws RuntimeException {
        String content;
        oqb.a("getDetailContent, medal content:", medalListBean.getContent());
        if (medalListBean.getGetResult() == 0 && !TextUtils.isEmpty(medalListBean.getUnattainedContent())) {
            return medalListBean.getUnattainedContent();
        }
        if (medalListBean.getCode().equals(SMEFARTHESTRUN) && medalListBean.getGetResult() == 1) {
            float fFloatValue = Float.valueOf(medalListBean.getRemark()).floatValue() / 1000.0f;
            if (medalListBean.getContent().contains("%s")) {
                content = medalListBean.getContent();
            } else {
                content = medalListBean.getContent() + ":%s公里";
            }
            return String.format(content, String.valueOf(fFloatValue));
        }
        if (TextUtils.isEmpty(medalListBean.getBreakRecordContent())) {
            return medalListBean.getContent();
        }
        if (f(medalListBean)) {
            oqb.a("medal detail getDetailContent break times ", Integer.valueOf(medalListBean.getBreakRecordTimes()));
            return medalListBean.getBreakRecordTimes() == 0 ? String.format(medalListBean.getContent(), k(medalListBean.getRecordDuration())) : String.format(medalListBean.getBreakRecordContent(), Integer.valueOf(medalListBean.getBreakRecordTimes()), k(medalListBean.getRecordDuration()));
        }
        if (medalListBean.getCode().equals(CMEALLACT_3) || medalListBean.getCode().equals(CMEALLACT_7)) {
            String remark = medalListBean.getRemark();
            if (remark == null || !remark.contains("_")) {
                return medalListBean.getContent();
            }
            String str = remark.split("_")[1];
            if (str != null && Integer.parseInt(str) > 1) {
                return String.format(medalListBean.getBreakRecordContent(), str);
            }
        }
        return medalListBean.getContent();
    }

    public static long d(MedalListBean medalListBean) {
        return medalListBean.getRecordDuration();
    }

    public static String e() {
        return "health_share_preference_medal" + oa2.c();
    }

    public static boolean f(MedalListBean medalListBean) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(CMESINGLERUNMILE);
        arrayList.add(CMESINGLERIDING);
        arrayList.add(CMESINGLESWIMMING);
        arrayList.add(CMESINGLERUNMILE_HALF);
        arrayList.add(CMESINGLERUNMILE_ALL);
        arrayList.add(SMEFARTHESTRUN);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (medalListBean.getCode().contains((String) it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean g() {
        return true;
    }

    public static boolean h(String str) {
        return Pattern.compile("^[-\\+]?[\\d]*$").matcher(str).matches();
    }

    public static float i(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0.0f;
        }
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException unused) {
            return 0.0f;
        }
    }

    public static long j(String str) {
        if (str == null || !h(str)) {
            return 0L;
        }
        return Long.parseLong(str);
    }

    public static String k(long j2) {
        long j3 = j2 / TapConst.IP_TTL_DEFAULT;
        long j4 = (j2 / 60) % 60;
        long j5 = j2 % 60;
        StringBuilder sb = new StringBuilder();
        if (j3 < 10) {
            sb.append("0");
        }
        sb.append(j3 + ":");
        if (j4 < 10) {
            sb.append("0");
        }
        sb.append(j4 + ":");
        if (j5 < 10) {
            sb.append("0");
        }
        sb.append(j5 + "");
        return sb.toString();
    }
}
