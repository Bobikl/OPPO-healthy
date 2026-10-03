package com.oplus.aiunit.vision;

import android.content.Context;
import android.content.DialogInterface;
import com.heytap.health.network.wiget.CustomProgressDialog;

/* JADX INFO: loaded from: classes17.dex */
public abstract class qye<T> extends u61<T> {
    public CustomProgressDialog i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f15988j;
    public String k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public io.reactivex.rxjava3.disposables.a f15989l;

    public qye(Context context, String str) {
        this.f15988j = context;
        this.k = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void g(DialogInterface dialogInterface) {
        h();
        f();
    }

    public final void f() {
        io.reactivex.rxjava3.disposables.a aVar = this.f15989l;
        if (aVar == null || aVar.isDisposed()) {
            return;
        }
        this.f15989l.dispose();
    }

    public void h() {
        a7b.f("ProgressObserver", "progress dialog onCancel()");
    }

    @Override // com.oplus.aiunit.vision.u61, com.oplus.aiunit.vision.aed
    public void onComplete() {
        super.onComplete();
        CustomProgressDialog customProgressDialog = this.i;
        if (customProgressDialog != null) {
            customProgressDialog.setOnDismissListener(null);
            this.i.dismiss();
        }
    }

    @Override // com.oplus.aiunit.vision.u61, com.oplus.aiunit.vision.aed
    public void onError(Throwable th) {
        super.onError(th);
        CustomProgressDialog customProgressDialog = this.i;
        if (customProgressDialog != null) {
            customProgressDialog.setOnDismissListener(null);
            this.i.dismiss();
        }
    }

    @Override // com.oplus.aiunit.vision.u61, com.oplus.aiunit.vision.aed
    public void onSubscribe(io.reactivex.rxjava3.disposables.a aVar) {
        super.onSubscribe(aVar);
        if (aVar.isDisposed()) {
            return;
        }
        this.f15989l = aVar;
        if (this.i == null) {
            CustomProgressDialog customProgressDialog = new CustomProgressDialog(this.f15988j, this.k);
            this.i = customProgressDialog;
            customProgressDialog.setCancelable(true);
            this.i.setCanceledOnTouchOutside(false);
            this.i.setOnDismissListener(new DialogInterface.OnDismissListener() { // from class: com.oplus.aiunit.vision.pye
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    this.i.g(dialogInterface);
                }
            });
        }
        this.i.show();
    }
}
