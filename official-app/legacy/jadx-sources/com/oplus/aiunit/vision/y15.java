package com.oplus.aiunit.vision;

import android.net.Uri;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;

/* JADX INFO: loaded from: classes8.dex */
public class y15 {
    public static final String PARAMS_APP_ID = "appId";
    public static final String PARAMS_DATA_TYPE = "dataType";
    public static final String PARAMS_INSERT_SIZE = "insertSize";
    public static final String PARAMS_RECORD_COUNT = "recordCount";
    public static final String PARAMS_UPLOAD_TYPE = "uploadType";
    public static final String REMOVE_SP_KEY = "remove_key";
    public static final String TABLE_ACTIVITY_START_COUNT = "activity_started_count";
    public static final String TABLE_RECORD_COUNT = "record_count";
    public static final String TABLE_RESET_RECORD_COUNT_WITH_TYPE = "reset_record_count_with_type";
    public static y15 d;
    public final Uri a;
    public final Uri b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f18831c;

    public y15(String str) {
        this.a = Uri.parse(NotificationApiService.CONTENT + str + ".EventContentProvider/activity_started_count");
        this.b = Uri.parse(NotificationApiService.CONTENT + str + ".EventContentProvider/" + TABLE_RECORD_COUNT);
        this.f18831c = Uri.parse(NotificationApiService.CONTENT + str + ".EventContentProvider/" + TABLE_RESET_RECORD_COUNT_WITH_TYPE);
    }

    public static y15 b(String str) {
        if (d == null) {
            d = new y15(str);
        }
        return d;
    }

    public Uri a() {
        return this.a;
    }

    public Uri c() {
        return this.b;
    }

    public Uri d() {
        return this.f18831c;
    }
}
