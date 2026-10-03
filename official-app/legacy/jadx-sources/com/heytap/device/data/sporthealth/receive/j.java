package com.heytap.device.data.sporthealth.receive;

import com.oplus.aiunit.vision.rl4;
import java.util.List;

/* JADX INFO: loaded from: classes15.dex */
public interface j extends rl4.b {
    public static final String TAG = "MsgProcessor";

    public static class a {
        public final int a;
        public final int b;

        public a(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public static a a(int i, int i2) {
            return new a(i, i2);
        }
    }

    List<a> t();
}
