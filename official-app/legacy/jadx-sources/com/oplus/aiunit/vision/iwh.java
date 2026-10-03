package com.oplus.aiunit.vision;

import com.heytap.health.sleep.snore.bean.SnoreExcerptBean;
import java.util.List;

/* JADX INFO: loaded from: classes18.dex */
public class iwh {
    public static final int DOWN_FAIL_CLOUD_NO_DATA = -1;
    public static final int DOWN_FAIL_ERROR = -3;
    public static final int DOWN_FAIL_FILE_FAULT = -7;
    public static final int DOWN_FAIL_NO_NETWORK = -8;
    public static final int DOWN_FAIL_PARAMETER_ERROR = -6;
    public static final int DOWN_FAIL_PATH_ERROR = -4;
    public static final int DOWN_FAIL_REQUEST_ERROR = -2;
    public static final int DOWN_FAIL_TIME_OUT = -5;
    public static final int DOWN_SUCCEED = 0;
    public static final int FILE_DECRYPT_ERROR = -9;
    public List<SnoreExcerptBean> a;
    public int b;

    public iwh(List<SnoreExcerptBean> list, int i) {
        this.a = list;
        this.b = i;
    }

    public int a() {
        return this.b;
    }

    public List<SnoreExcerptBean> b() {
        return this.a;
    }

    public void c(int i) {
        this.b = i;
    }
}
