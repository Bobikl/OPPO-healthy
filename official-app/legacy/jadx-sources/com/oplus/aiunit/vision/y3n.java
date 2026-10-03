package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Random;

/* JADX INFO: loaded from: classes12.dex */
public class y3n {
    public static boolean a = false;
    public static int b = 20;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static int f18860c = 20;
    public static WeakReference<s3n> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static int f18861e;

    public static void b(Context context) {
        com.amap.api.col.p0003sl.q0.h().b(new a(context, a.o));
    }

    public static /* synthetic */ void c(Context context, byte[] bArr) throws IOException {
        s3n s3nVarA = z3n.a(d);
        z3n.f(context, s3nVarA, b2n.h, 1000, 307200, "2");
        if (s3nVarA.f16462e == null) {
            s3nVarA.f16462e = new y2n();
        }
        try {
            t3n.c(Integer.toString(new Random().nextInt(100)) + Long.toString(System.nanoTime()), bArr, s3nVarA);
        } catch (Throwable th) {
            c2n.r(th, "stm", "wts");
        }
    }

    public static synchronized void d(x3n x3nVar, Context context) {
        com.amap.api.col.p0003sl.q0.h().b(new a(context, a.m, x3nVar));
    }

    public static synchronized void e(List<x3n> list, Context context) {
        if (list != null) {
            try {
                if (list.size() != 0) {
                    com.amap.api.col.p0003sl.q0.h().b(new a(context, a.f18862n, list));
                }
            } catch (Throwable unused) {
            }
        }
    }

    public static synchronized void f(boolean z, int i) {
        a = z;
        f18861e = Math.max(0, i);
    }

    public static synchronized void h(List<x3n> list, Context context) {
        try {
            List<x3n> listQ = i3n.q();
            if (listQ != null && listQ.size() > 0) {
                list.addAll(listQ);
            }
        } catch (Throwable unused) {
        }
        e(list, context);
    }

    public static class a extends u4n {
        public static int m = 1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public static int f18862n = 2;
        public static int o = 3;
        public Context i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public x3n f18863j;
        public int k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public List<x3n> f18864l;

        public a(Context context, int i) {
            this.i = context;
            this.k = i;
        }

        @Override // com.oplus.aiunit.vision.u4n
        public final void runTask() {
            x3n x3nVar;
            ByteArrayOutputStream byteArrayOutputStream;
            Throwable th;
            int i = this.k;
            if (i == 1) {
                try {
                    if (this.i != null && this.f18863j != null) {
                        synchronized (y3n.class) {
                            Context context = this.i;
                            if (context != null && (x3nVar = this.f18863j) != null) {
                                y3n.c(context, x3nVar.b());
                                return;
                            }
                            return;
                        }
                    }
                    return;
                } catch (Throwable th2) {
                    c2n.r(th2, "stm", "as");
                    return;
                }
            }
            if (i != 2) {
                if (i == 3) {
                    try {
                        if (this.i == null) {
                            return;
                        }
                        s3n s3nVarA = z3n.a(y3n.d);
                        z3n.f(this.i, s3nVarA, b2n.h, 1000, 307200, "2");
                        if (s3nVarA.g == null) {
                            s3nVarA.g = new a4n(new e4n(this.i, new b4n(new f4n(new h4n()))));
                        }
                        s3nVarA.h = 3600000;
                        if (TextUtils.isEmpty(s3nVarA.i)) {
                            s3nVarA.i = "cKey";
                        }
                        if (s3nVarA.f == null) {
                            Context context2 = this.i;
                            s3nVarA.f = new l4n(context2, s3nVarA.h, s3nVarA.i, new i4n(s3nVarA.a, new j4n(context2, y3n.a, y3n.f18860c * 1024, y3n.b * 1024, "staticUpdate", y3n.f18861e * 1024)));
                        }
                        t3n.a(s3nVarA);
                        return;
                    } catch (Throwable th3) {
                        c2n.r(th3, "stm", "usd");
                        return;
                    }
                }
                return;
            }
            try {
                synchronized (y3n.class) {
                    if (this.f18864l != null && this.i != null) {
                        byte[] byteArray = new byte[0];
                        try {
                            byteArrayOutputStream = new ByteArrayOutputStream();
                            try {
                                for (x3n x3nVar2 : this.f18864l) {
                                    if (x3nVar2 != null) {
                                        byteArrayOutputStream.write(x3nVar2.b());
                                    }
                                }
                                byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    byteArrayOutputStream.close();
                                } catch (Throwable th4) {
                                    th = th4;
                                    th.printStackTrace();
                                }
                            } catch (Throwable th5) {
                                th = th5;
                                try {
                                    c2n.r(th, "stm", "aStB");
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th6) {
                                            th = th6;
                                            th.printStackTrace();
                                        }
                                    }
                                } catch (Throwable th7) {
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                        } catch (Throwable th8) {
                                            th8.printStackTrace();
                                        }
                                    }
                                    throw th7;
                                }
                            }
                        } catch (Throwable th9) {
                            byteArrayOutputStream = null;
                            th = th9;
                        }
                        y3n.c(this.i, byteArray);
                    }
                }
            } catch (Throwable th10) {
                c2n.r(th10, "stm", "apb");
            }
        }

        public a(Context context, int i, List<x3n> list) {
            this(context, i);
            this.f18864l = list;
        }

        public a(Context context, int i, x3n x3nVar) {
            this(context, i);
            this.f18863j = x3nVar;
        }
    }
}
