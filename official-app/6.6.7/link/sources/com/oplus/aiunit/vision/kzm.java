package com.oplus.aiunit.vision;

import android.content.DialogInterface;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class kzm {
    public static qgm a;

    public static /* synthetic */ void g(yfa yfaVar, int i) {
        if (i == -2) {
            if (yfaVar != null) {
                yfaVar.c();
            }
            a.c();
        } else {
            if (i != -1) {
                return;
            }
            if (yfaVar != null) {
                yfaVar.d();
            }
            a.d();
        }
    }

    public static /* synthetic */ void h(yfa yfaVar, DialogInterface dialogInterface) {
        if (yfaVar != null) {
            yfaVar.c();
        }
    }

    public static void i(sga sgaVar, String str, String str2, String str3, boolean z, boolean z2) {
        if (sgaVar == null) {
            return;
        }
        sgaVar.k(str);
        sgaVar.i(str2);
        sgaVar.j(str3);
        if (z) {
            sgaVar.h(2);
        } else if (z2) {
            sgaVar.h(0);
        } else {
            sgaVar.h(1);
        }
    }

    public static void j(sga sgaVar, boolean z, final yfa yfaVar) {
        sgaVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.hym
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                kzm.h(yfaVar, dialogInterface);
            }
        });
        if (z) {
            sgaVar.f(9);
            sgaVar.setOnButtonClickListener(new sga.a() { // from class: com.oplus.aiunit.vision.jym
                @Override // com.oplus.aiunit.vision.sga.a
                public final void onClick(int i) {
                    kzm.g(yfaVar, i);
                }
            });
        } else {
            sgaVar.f(8);
            sgaVar.setOnButtonClickListener(new sga.a() { // from class: com.oplus.aiunit.vision.lym
                @Override // com.oplus.aiunit.vision.sga.a
                public final void onClick(int i) {
                    kzm.m(yfaVar, i);
                }
            });
        }
    }

    public static void k(sga sgaVar, boolean z, boolean z2, yfa yfaVar) {
        if (sgaVar == null) {
            return;
        }
        if (z2) {
            o(sgaVar, z, yfaVar);
        } else {
            j(sgaVar, z, yfaVar);
        }
    }

    public static void l(qgm qgmVar) {
        a = qgmVar;
    }

    public static /* synthetic */ void m(yfa yfaVar, int i) {
        if (i == -2) {
            if (yfaVar != null) {
                yfaVar.c();
            }
            a.a();
        } else {
            if (i != -1) {
                return;
            }
            if (yfaVar != null) {
                yfaVar.d();
            }
            a.d();
        }
    }

    public static /* synthetic */ void n(yfa yfaVar, DialogInterface dialogInterface) {
        if (yfaVar != null) {
            yfaVar.e();
        }
    }

    public static void o(sga sgaVar, boolean z, final yfa yfaVar) {
        sgaVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.nym
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                kzm.n(yfaVar, dialogInterface);
            }
        });
        if (z) {
            sgaVar.f(7);
            sgaVar.setOnButtonClickListener(new sga.a() { // from class: com.oplus.aiunit.vision.pym
                @Override // com.oplus.aiunit.vision.sga.a
                public final void onClick(int i) {
                    kzm.p(yfaVar, i);
                }
            });
        } else {
            sgaVar.f(6);
            sgaVar.setOnButtonClickListener(new sga.a() { // from class: com.oplus.aiunit.vision.rym
                @Override // com.oplus.aiunit.vision.sga.a
                public final void onClick(int i) {
                    kzm.q(yfaVar, i);
                }
            });
        }
    }

    public static /* synthetic */ void p(yfa yfaVar, int i) {
        if (i == -2) {
            if (yfaVar != null) {
                yfaVar.e();
            }
            a.c();
        } else {
            if (i != -1) {
                return;
            }
            if (yfaVar != null) {
                yfaVar.f();
            }
            a.b();
        }
    }

    public static /* synthetic */ void q(yfa yfaVar, int i) {
        if (i == -2) {
            if (yfaVar != null) {
                yfaVar.e();
            }
            a.a();
        } else {
            if (i != -1) {
                return;
            }
            if (yfaVar != null) {
                yfaVar.f();
            }
            a.b();
        }
    }
}
