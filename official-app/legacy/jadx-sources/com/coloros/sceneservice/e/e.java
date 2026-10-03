package com.coloros.sceneservice.e;

import android.net.Uri;
import android.provider.BaseColumns;
import com.coloros.sceneservice.m.i;

/* JADX INFO: loaded from: classes13.dex */
public class e implements BaseColumns {
    public static final String Ab = "arrive_company_min";
    public static final String Bb = "leave_company_hour";
    public static final String Cb = "leave_company_min";
    public static final String Db = "start_sleep_time";
    public static final String Eb = "end_sleep_time";
    public static final String Fb = "resident_longitude";
    public static final String Gb = "resident_latitude";
    public static final String Hb = "user_profile_modify";
    public static final String Ib = "diff_tag";
    public static final String TAG = "tag";
    public static final String _ID = "_id";
    public static final String gb = "final_user_profile";
    public static final String hb = "home_longitude";
    public static final String ib = "home_latitude";
    public static final String jb = "home_latlon_type";
    public static final String kb = "company_longitude";
    public static final String lb = "company_latitude";
    public static final String mb = "company_latlon_type";
    public static final String nb = "home_wifi_name";
    public static final String ob = "home_wifi_bssid";
    public static final String pb = "company_wifi_name";
    public static final String qb = "company_wifi_bssid";
    public static final String rb = "home_address";
    public static final String sb = "company_address";
    public static final String tb = "travel_mode";
    public static final String ub = "default_map";
    public static final String vb = "arrive_home_hour";
    public static final String wb = "arrive_home_min";
    public static final String xb = "leave_home_hour";
    public static final String yb = "leave_home_min";
    public static final String zb = "arrive_company_hour";
    public static final String TABLE_NAME = "user_profile";
    public static final Uri URL = i.a(TABLE_NAME, true);
    public static final Uri La = i.a(TABLE_NAME, false);
    public static final Uri Jb = i.a("final_user_profile", true);
}
