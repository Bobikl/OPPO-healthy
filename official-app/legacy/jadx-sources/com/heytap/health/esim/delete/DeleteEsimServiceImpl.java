package com.heytap.health.esim.delete;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.core.graphics.ColorKt;
import androidx.core.text.SpannableStringBuilderKt;
import com.alibaba.android.arouter.facade.annotation.Route;
import com.coui.appcompat.dialog.COUIAlertDialogBuilder;
import com.heytap.health.esim.R$layout;
import com.heytap.health.esim.R$string;
import com.heytap.health.esim.delete.DeleteEsimServiceImpl;
import com.heytap.health.esim.mgr.EsimSubManager;
import com.heytap.health.esim.nsc.repo.RedteaRepo;
import com.heytap.health.interconnection.esim.DeleteEsimService;
import com.heytap.wearable.lpa.proto.LPASyncProto;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.c93;
import com.oplus.aiunit.vision.fra;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.m9l;
import com.oplus.aiunit.vision.ol4;
import com.oplus.aiunit.vision.p85;
import com.oplus.aiunit.vision.pr6;
import java.lang.ref.WeakReference;
import java.util.Observable;
import java.util.Observer;
import p010kotlin.Unit;
import p010kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes16.dex */
@Route(path = "/esim/delete/DeleteEsimServiceImpl")
public class DeleteEsimServiceImpl implements DeleteEsimService {
    public b i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public c93 f4138j;
    public p85 k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final a f4139l = new a(this);
    public final RedteaRepo m = new RedteaRepo();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Boolean f4140n = Boolean.FALSE;

    public class a extends Handler {
        public final WeakReference<DeleteEsimServiceImpl> a;

        public a(DeleteEsimServiceImpl deleteEsimServiceImpl) {
            this.a = new WeakReference<>(deleteEsimServiceImpl);
        }

        @Override // android.os.Handler
        public void handleMessage(@NonNull Message message) {
            super.handleMessage(message);
            a7b.f("EsimHealth.DeleteEsimServiceImpl", "MyHandler msg() = " + message.what);
            if (this.a.get() == null) {
                return;
            }
            int i = message.what;
            if (i == 1) {
                DeleteEsimServiceImpl.this.f4139l.removeMessages(1);
                if (DeleteEsimServiceImpl.this.f4138j != null) {
                    DeleteEsimServiceImpl.this.f4138j.a(false);
                    return;
                }
                return;
            }
            if (i == 2) {
                DeleteEsimServiceImpl.this.f4139l.removeMessages(2);
                if (DeleteEsimServiceImpl.this.k != null) {
                    DeleteEsimServiceImpl.this.k.a();
                }
            }
        }
    }

    public class b implements Observer {
        public final WeakReference<DeleteEsimServiceImpl> i;

        public b(DeleteEsimServiceImpl deleteEsimServiceImpl) {
            this.i = new WeakReference<>(deleteEsimServiceImpl);
        }

        @Override // java.util.Observer
        public void update(Observable observable, Object obj) {
            if (this.i.get() == null) {
                a7b.f("EsimHealth.DeleteEsimServiceImpl", "deleteEsimService is null ");
                return;
            }
            if (obj instanceof LPASyncProto.GetEsimInfo) {
                DeleteEsimServiceImpl.this.f4139l.removeMessages(1);
                DeleteEsimServiceImpl.this.lb(fra.a((LPASyncProto.GetEsimInfo) obj));
            } else if (obj instanceof LPASyncProto.RepalyResetEuicc) {
                DeleteEsimServiceImpl.this.gb((LPASyncProto.RepalyResetEuicc) obj);
                DeleteEsimServiceImpl.this.f4139l.removeMessages(2);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void hb(String str) {
        EsimSubManager.INSTANCE.e(6, fra.h(str));
        this.f4139l.sendEmptyMessageDelayed(2, 10000L);
    }

    public static /* synthetic */ Unit ib(SpannableStringBuilder spannableStringBuilder) {
        spannableStringBuilder.append((CharSequence) b78.b().getString(R$string.esim_redtea_delete_dialog_confirm));
        return null;
    }

    public static /* synthetic */ Unit jb(SpannableStringBuilder spannableStringBuilder) {
        SpannableStringBuilderKt.color(spannableStringBuilder, ColorKt.toColorInt("#DB382C"), new Function1() { // from class: com.oplus.aiunit.vision.s85
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteEsimServiceImpl.ib((SpannableStringBuilder) obj);
            }
        });
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Unit kb(m9l m9lVar, Boolean bool) {
        c93 c93Var;
        this.f4140n = bool;
        a7b.f("EsimHealth.DeleteEsimServiceImpl", "getmSimInfoList check has network profile:" + bool);
        for (int i = 0; i < m9lVar.i().size(); i++) {
            if (!TextUtils.isEmpty(m9lVar.i().get(i).getIccid()) && (c93Var = this.f4138j) != null) {
                c93Var.a(true);
                return null;
            }
        }
        c93 c93Var2 = this.f4138j;
        if (c93Var2 != null) {
            c93Var2.a(false);
        }
        return null;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void Da() {
        if (this.i == null) {
            this.i = new b(this);
        }
        EsimSubManager.INSTANCE.a(this.i);
        a7b.f("EsimHealth.DeleteEsimServiceImpl", " addObserver");
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void H5(p85 p85Var) {
        this.f4139l.removeCallbacksAndMessages(null);
        this.k = null;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public int O8(int i) {
        return !this.f4140n.booleanValue() ? i : R$layout.esim_redtea_fragment_unbind;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void Oa(final String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("deleteEsim mac ");
        sb.append(str);
        ol4 ol4Var = gl4.managerApi;
        if (!ol4Var.isConnected(str) || ol4Var.isStubModule()) {
            a7b.f("EsimHealth.DeleteEsimServiceImpl", "is disConnected");
            p85 p85Var = this.k;
            if (p85Var != null) {
                p85Var.a();
                return;
            }
            return;
        }
        if (this.f4140n.booleanValue()) {
            this.m.d(str, new Runnable() { // from class: com.oplus.aiunit.vision.t85
                @Override // java.lang.Runnable
                public final void run() {
                    this.i.hb(str);
                }
            });
        } else {
            EsimSubManager.INSTANCE.e(6, fra.h(str));
            this.f4139l.sendEmptyMessageDelayed(2, 10000L);
        }
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public COUIAlertDialogBuilder P8(COUIAlertDialogBuilder cOUIAlertDialogBuilder, DialogInterface.OnClickListener onClickListener) {
        if (!this.f4140n.booleanValue()) {
            return cOUIAlertDialogBuilder;
        }
        return cOUIAlertDialogBuilder.setTitle(R$string.esim_redtea_delete_dialog_title).setMessage(R$string.esim_redtea_delete_dialog_desc).setPositiveButton(SpannableStringBuilderKt.buildSpannedString(new Function1() { // from class: com.oplus.aiunit.vision.r85
            @Override // p010kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DeleteEsimServiceImpl.jb((SpannableStringBuilder) obj);
            }
        }), onClickListener);
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void R2(p85 p85Var) {
        this.k = p85Var;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void X9(c93 c93Var) {
        this.f4138j = null;
    }

    public final void gb(LPASyncProto.RepalyResetEuicc repalyResetEuicc) {
        StringBuilder sb = new StringBuilder();
        sb.append("handlerResetEuicc repalyResetEuicc = ");
        sb.append(repalyResetEuicc);
        if (repalyResetEuicc == null) {
            p85 p85Var = this.k;
            if (p85Var != null) {
                p85Var.a();
                return;
            }
            return;
        }
        if (1 != repalyResetEuicc.getResultCode()) {
            p85 p85Var2 = this.k;
            if (p85Var2 != null) {
                p85Var2.a();
                return;
            }
            return;
        }
        p85 p85Var3 = this.k;
        if (p85Var3 != null) {
            p85Var3.d();
            pr6.a(gl4.managerApi.getCurrActiveMac());
        }
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void ha() {
        EsimSubManager.INSTANCE.b(this.i);
        a7b.f("EsimHealth.DeleteEsimServiceImpl", " deleteObserver");
    }

    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    public final void lb(final m9l m9lVar) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateEuiccInfo watchEuiccInfo = ");
        sb.append(m9lVar);
        if (m9lVar == null) {
            a7b.f("EsimHealth.DeleteEsimServiceImpl", "watchEuiccInfo is null");
            c93 c93Var = this.f4138j;
            if (c93Var != null) {
                c93Var.a(false);
                return;
            }
            return;
        }
        if (m9lVar.i() != null) {
            a7b.f("EsimHealth.DeleteEsimServiceImpl", "getmSimInfoList size:" + m9lVar.i().size());
            this.m.a(m9lVar.i(), new Function1() { // from class: com.oplus.aiunit.vision.q85
                @Override // p010kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return this.i.kb(m9lVar, (Boolean) obj);
                }
            });
            return;
        }
        a7b.f("EsimHealth.DeleteEsimServiceImpl", "getmSimInfoList is null");
        c93 c93Var2 = this.f4138j;
        if (c93Var2 != null) {
            c93Var2.a(false);
        }
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void v3(c93 c93Var) {
        this.f4138j = c93Var;
    }

    @Override // com.heytap.health.interconnection.esim.DeleteEsimService
    public void v9(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append("checkEsimInfo mac = ");
        sb.append(str);
        ol4 ol4Var = gl4.managerApi;
        if (ol4Var.isConnected(str) && !ol4Var.isStubModule()) {
            EsimSubManager.INSTANCE.e(1, null);
            this.f4139l.sendEmptyMessageDelayed(1, 10000L);
        } else {
            c93 c93Var = this.f4138j;
            if (c93Var != null) {
                c93Var.a(false);
            }
        }
    }
}
