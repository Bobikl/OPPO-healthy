package com.heytap.wallet.business.common.util;

import com.oplus.aiunit.vision.qv8;
import com.oplus.aiunit.vision.sr0;
import com.oplus.aiunit.vision.t6b;
import com.oplus.aiunit.vision.ydc;
import java.util.HashMap;

/* JADX INFO: loaded from: classes19.dex */
public class CmdExecUtils {
    public static HashMap<String, String> a = new HashMap<String, String>() { // from class: com.heytap.wallet.business.common.util.CmdExecUtils.3
        {
            put("issuecard", String.valueOf(1));
            put("topup", String.valueOf(2));
            put("issueTopup", String.valueOf(1));
            put("shiftout", String.valueOf(4));
            put("shiftin", String.valueOf(5));
            put("deleteapp", String.valueOf(6));
            put("THIRD_ISSUER", String.valueOf(1));
            put("THIRD_TOPUP", String.valueOf(2));
            put("THIRD_SHIFT_OUT", String.valueOf(4));
            put("THIRD_SHIFT_IN", String.valueOf(5));
            put("THIRD_DELETE", String.valueOf(6));
            put("TAIINSTALL", String.valueOf(9));
            put("OPENAPIENABLE", String.valueOf(10));
            put("OPENAPIDISABLE", String.valueOf(11));
            put("multiActive", String.valueOf(12));
        }
    };

    public class a implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8429j;

        public a(int i, String str) {
            this.i = i;
            this.f8429j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ydc.n().v(this.i, this.f8429j);
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ int i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ String f8430j;

        public b(int i, String str) {
            this.i = i;
            this.f8430j = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            ydc.n().v(this.i, this.f8430j);
        }
    }

    public class c implements Runnable {
        public final /* synthetic */ int i;

        public c(int i) {
            this.i = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            t6b.b("CmdExecUtils", "sendEvent type: " + this.i);
            ydc.n().v(this.i, null);
        }
    }

    public static int a(String str) {
        return Integer.parseInt(a.get(str));
    }

    public static void b(int i) {
        sr0.i(new c(i));
    }

    public static void c(int i, String str) {
        int i2;
        t6b.b("CmdExecUtils", "sendFailEvent type mOpType" + i);
        if (i == 1) {
            i2 = 3;
        } else if (i == 4) {
            i2 = 15;
        } else if (i == 5) {
            i2 = 18;
        } else if (i == 2) {
            i2 = 6;
        } else if (i == 6) {
            i2 = 12;
        } else if (i == 7) {
            i2 = 9;
        } else if (i == 9) {
            i2 = 39;
        } else if (i == 10) {
            i2 = 42;
        } else if (i == 11) {
            i2 = 45;
        } else {
            i2 = i == 12 ? 59 : 0;
        }
        t6b.b("CmdExecUtils", "sendFailEvent type eventType" + i2 + " " + str);
        new qv8(new a(i2, str)).start();
    }

    public static void d(int i, String str) {
        t6b.b("CmdExecUtils", "sendSartEvent type mOpType" + i);
        int i2 = 1;
        if (i != 1) {
            i2 = 4;
            if (i == 4) {
                i2 = 13;
            } else if (i == 5) {
                i2 = 16;
            } else if (i != 2) {
                if (i == 6) {
                    i2 = 10;
                } else {
                    i2 = 7;
                    if (i != 7) {
                        if (i == 9) {
                            i2 = 37;
                        } else if (i == 10) {
                            i2 = 40;
                        } else if (i == 11) {
                            i2 = 43;
                        } else {
                            i2 = i == 12 ? 57 : 0;
                        }
                    }
                }
            }
        }
        t6b.b("CmdExecUtils", "sendSartEvent type eventType" + i2 + "   " + str);
        ydc.n().v(i2, str);
    }

    public static void e(int i, String str) {
        t6b.b("CmdExecUtils", "sendSuccessEvent type mOpType" + i);
        int i2 = 2;
        if (i != 1) {
            if (i == 4) {
                i2 = 14;
            } else if (i == 5) {
                i2 = 17;
            } else if (i == 2) {
                i2 = 5;
            } else {
                i2 = 11;
                if (i != 6) {
                    if (i == 7) {
                        i2 = 8;
                    } else if (i == 9) {
                        i2 = 38;
                    } else if (i == 10) {
                        i2 = 41;
                    } else if (i == 11) {
                        i2 = 44;
                    } else {
                        i2 = i == 12 ? 58 : 0;
                    }
                }
            }
        }
        t6b.b("CmdExecUtils", "sendSuccessEvent type eventType" + i2 + " " + str);
        new qv8(new b(i2, str)).start();
    }
}
