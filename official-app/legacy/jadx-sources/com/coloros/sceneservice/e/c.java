package com.coloros.sceneservice.e;

import android.net.Uri;
import android.provider.BaseColumns;
import com.coloros.sceneservice.m.i;

/* JADX INFO: loaded from: classes13.dex */
public class c implements BaseColumns {
    public static final String TABLE_NAME = "scene_status";
    public static final String Wa = "scene_id";
    public static final String Xa = "scene_name";
    public static final String Ya = "scene_status";
    public static final String Za = "scene_start_time";
    public static final String _a = "scene_end_time";
    public static final String ab = "business_id";
    public static final String db = "extra_data";
    public static final Uri URI = i.a("scene_status", true);
    public static final Uri eb = i.a("scene_status", false);
}
