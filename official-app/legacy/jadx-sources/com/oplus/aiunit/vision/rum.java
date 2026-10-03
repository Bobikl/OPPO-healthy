package com.oplus.aiunit.vision;

import android.content.DialogInterface;

/* JADX INFO: loaded from: classes2.dex */
public class rum {
    public static icm a;

    public static /* synthetic */ void g(qea qeaVar, int i) {
        if (i == -2) {
            if (qeaVar != null) {
                qeaVar.c();
            }
            a.c();
        } else {
            if (i != -1) {
                return;
            }
            if (qeaVar != null) {
                qeaVar.d();
            }
            a.d();
        }
    }

    public static /* synthetic */ void h(qea qeaVar, DialogInterface dialogInterface) {
        if (qeaVar != null) {
            qeaVar.c();
        }
    }

    public static void i(kfa kfaVar, String str, String str2, String str3, boolean z, boolean z2) {
        if (kfaVar == null) {
            return;
        }
        kfaVar.k(str);
        kfaVar.i(str2);
        kfaVar.j(str3);
        if (z) {
            kfaVar.h(2);
        } else if (z2) {
            kfaVar.h(0);
        } else {
            kfaVar.h(1);
        }
    }

    public static void j(kfa kfaVar, boolean z, final qea qeaVar) {
        kfaVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.rtm
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rum.h(qeaVar, dialogInterface);
            }
        });
        if (z) {
            kfaVar.f(9);
            kfaVar.setOnButtonClickListener(new kfa.a() { // from class: com.oplus.aiunit.vision.ttm
                @Override // com.oplus.aiunit.vision.kfa.a
                public final void onClick(int i) {
                    rum.g(qeaVar, i);
                }
            });
        } else {
            kfaVar.f(8);
            kfaVar.setOnButtonClickListener(new kfa.a() { // from class: com.oplus.aiunit.vision.vtm
                @Override // com.oplus.aiunit.vision.kfa.a
                public final void onClick(int i) {
                    rum.m(qeaVar, i);
                }
            });
        }
    }

    public static void k(kfa kfaVar, boolean z, boolean z2, qea qeaVar) {
        if (kfaVar == null) {
            return;
        }
        if (z2) {
            o(kfaVar, z, qeaVar);
        } else {
            j(kfaVar, z, qeaVar);
        }
    }

    public static void l(icm icmVar) {
        a = icmVar;
    }

    public static /* synthetic */ void m(qea qeaVar, int i) {
        if (i == -2) {
            if (qeaVar != null) {
                qeaVar.c();
            }
            a.a();
        } else {
            if (i != -1) {
                return;
            }
            if (qeaVar != null) {
                qeaVar.d();
            }
            a.d();
        }
    }

    public static /* synthetic */ void n(qea qeaVar, DialogInterface dialogInterface) {
        if (qeaVar != null) {
            qeaVar.e();
        }
    }

    public static void o(kfa kfaVar, boolean z, final qea qeaVar) {
        kfaVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: com.oplus.aiunit.vision.xtm
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                rum.n(qeaVar, dialogInterface);
            }
        });
        if (z) {
            kfaVar.f(7);
            kfaVar.setOnButtonClickListener(new kfa.a() { // from class: com.oplus.aiunit.vision.ztm
                @Override // com.oplus.aiunit.vision.kfa.a
                public final void onClick(int i) {
                    rum.p(qeaVar, i);
                }
            });
        } else {
            kfaVar.f(6);
            kfaVar.setOnButtonClickListener(new kfa.a() { // from class: com.oplus.aiunit.vision.bum
                @Override // com.oplus.aiunit.vision.kfa.a
                public final void onClick(int i) {
                    rum.q(qeaVar, i);
                }
            });
        }
    }

    public static /* synthetic */ void p(qea qeaVar, int i) {
        if (i == -2) {
            if (qeaVar != null) {
                qeaVar.e();
            }
            a.c();
        } else {
            if (i != -1) {
                return;
            }
            if (qeaVar != null) {
                qeaVar.f();
            }
            a.b();
        }
    }

    public static /* synthetic */ void q(qea qeaVar, int i) {
        if (i == -2) {
            if (qeaVar != null) {
                qeaVar.e();
            }
            a.a();
        } else {
            if (i != -1) {
                return;
            }
            if (qeaVar != null) {
                qeaVar.f();
            }
            a.b();
        }
    }
}
