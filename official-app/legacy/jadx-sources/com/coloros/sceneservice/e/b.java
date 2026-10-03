package com.coloros.sceneservice.e;

import android.net.Uri;
import android.provider.BaseColumns;
import com.coloros.sceneservice.m.i;

/* JADX INFO: loaded from: classes13.dex */
public class b implements BaseColumns {
    public static final String CONTENT = "content";
    public static final String DATA1 = "data1";
    public static final String DATA2 = "data2";
    public static final String DATA3 = "data3";
    public static final String DELETED = "deleted";
    public static final String Ma = "match_key";
    public static final String Na = "occur_time";
    public static final String Oa = "expire_time";
    public static final String Pa = "last_online_time";
    public static final String Qa = "processed";
    public static final String Ra = "process_step";
    public static final String SOURCE = "source";
    public static final String Sa = "target_tel";
    public static final String TYPE = "type";
    public static final String Ta = "occur_timezone";
    public static final String Ua = "expire_timezone";
    public static final String Va = "data_changed_state";
    public static final String TABLE_NAME = "scenes";
    public static final Uri URL = i.a(TABLE_NAME, true);
}
