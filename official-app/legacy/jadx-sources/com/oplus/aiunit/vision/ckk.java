package com.oplus.aiunit.vision;

import android.os.AsyncTask;
import com.heytap.upgrade.UpgradeSDK;
import com.heytap.upgrade.exception.UpgradeException;
import com.heytap.upgrade.model.UpgradeInfo;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes19.dex */
public class ckk extends AsyncTask<Void, Long, UpgradeException> {
    public String b;
    public boolean d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f10136e;
    public int g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f10137j;
    public File k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f10138l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public t26 f10139n;
    public UpgradeInfo o;
    public File p;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f10135c = 0;
    public long f = 0;
    public int h = 0;
    public boolean i = false;
    public String m = "";
    public List<r26> a = new ArrayList();

    public class a implements zs9 {
        public a() {
        }

        @Override // com.oplus.aiunit.vision.zs9
        public void f0(int i, long j2) {
            ckk.this.g = 0;
            ckk.this.h = i;
            ckk.this.f = j2;
            ckk.this.publishProgress(new Long[0]);
        }

        @Override // com.oplus.aiunit.vision.zs9
        public void g(File file) {
            u6b.b("UpgradeDownloadTask", "onDownloadSuccess, packageName=" + ckk.this.b);
            ckk.this.g = 2;
        }

        @Override // com.oplus.aiunit.vision.zs9
        public void g0(int i) throws Throwable {
            u6b.b("UpgradeDownloadTask", "onDownloadFailed, reason=" + i + ", try times:" + ckk.this.f10135c + ", packageName=" + ckk.this.b);
            ckk.g(ckk.this);
            if (ckk.this.f10135c >= 5) {
                u6b.b("UpgradeDownloadTask", "retry limit reached, packageName=" + ckk.this.b);
                ckk.this.f10138l = 20006;
                ckk.this.m = "retry limit reached" + i;
                ckk ckkVar = ckk.this;
                ckkVar.m(ckkVar.f10138l);
                return;
            }
            if ((i == 20013 || i == 20012) ? false : true) {
                u6b.b("UpgradeDownloadTask", "retry download, packageName=" + ckk.this.b);
                ckk.this.o();
                return;
            }
            u6b.b("UpgradeDownloadTask", "do not retry, confirm download failed, packageName=" + ckk.this.b);
            ckk.this.m(i);
        }

        @Override // com.oplus.aiunit.vision.zs9
        public void h0() {
            u6b.b("UpgradeDownloadTask", " onPaused, packageName=" + ckk.this.b);
        }

        @Override // com.oplus.aiunit.vision.zs9
        public void onCanceled() {
            u6b.b("UpgradeDownloadTask", " onPaused, packageName=" + ckk.this.b);
        }
    }

    public ckk(t26 t26Var, List<nz9> list) {
        this.f10136e = 0L;
        this.f10139n = t26Var;
        Iterator<nz9> it = list.iterator();
        while (it.hasNext()) {
            this.a.add(new r26(this.f10139n, it.next()));
        }
        this.o = t26Var.e();
        this.p = UpgradeSDK.instance.getInitParam().b();
        this.d = false;
        this.f10136e = this.o.getApkFileSize();
        this.b = this.f10139n.c();
        this.k = new File(v9e.a(this.p.getAbsolutePath(), this.b, this.o.getMd5()));
        this.f10137j = this.o.getApkUrl(this.f10135c);
        u6b.a("UpgradeDownloadTask path:" + this.k.getPath());
    }

    public static /* synthetic */ int g(ckk ckkVar) {
        int i = ckkVar.f10135c;
        ckkVar.f10135c = i + 1;
        return i;
    }

    public final void m(int i) {
        if (this.f < this.f10136e) {
            this.g = 1;
            this.i = false;
        }
        if (i == 20013) {
            rqk.a(this.k);
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public UpgradeException doInBackground(Void... voidArr) throws Throwable {
        if (!v()) {
            return new UpgradeException(20001, "UpgradeInfo of " + this.b + "is null!");
        }
        this.i = true;
        try {
            if (w()) {
                u6b.b("UpgradeDownloadTask", "check download status before real download, result: download complete");
                return null;
            }
            u6b.b("UpgradeDownloadTask", "check download status before real download, result: download not complete");
            o();
            return null;
        } catch (UpgradeException e2) {
            return e2;
        }
    }

    public final void o() throws Throwable {
        this.f10137j = this.o.getApkUrl(this.f10135c);
        u6b.b("UpgradeDownloadTask", "start download, url=" + this.f10137j);
        new ymc().a(this.b, this.f10137j, this.k, this.o.getMd5(), this.o.getApkFileSize(), p());
    }

    @Override // android.os.AsyncTask
    public void onCancelled() {
        super.onCancelled();
        u6b.a("download task has been canceled, cache the download size :" + this.f);
        List<r26> list = this.a;
        if (list != null) {
            for (r26 r26Var : list) {
                UpgradeInfo upgradeInfo = this.o;
                if (upgradeInfo == null) {
                    upgradeInfo = new UpgradeInfo();
                }
                r26Var.g(upgradeInfo);
            }
        }
    }

    @Override // android.os.AsyncTask
    public void onPreExecute() {
        super.onPreExecute();
        List<r26> list = this.a;
        if (list != null) {
            Iterator<r26> it = list.iterator();
            while (it.hasNext()) {
                it.next().e();
            }
        }
    }

    public final zs9 p() {
        return new a();
    }

    public boolean q() {
        return this.i;
    }

    public boolean r() {
        return getStatus() == AsyncTask.Status.FINISHED;
    }

    public boolean s() {
        return getStatus() == AsyncTask.Status.PENDING;
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void onPostExecute(UpgradeException upgradeException) {
        super.onPostExecute(upgradeException);
        this.i = false;
        if (upgradeException != null) {
            if (upgradeException.getErrorCode() == 20013 && this.k.exists()) {
                this.k.delete();
                u6b.b("UpgradeDownloadTask", "onPostExecute CheckMd5Exception, delete download file");
            }
            List<r26> list = this.a;
            if (list == null || this.d) {
                return;
            }
            Iterator<r26> it = list.iterator();
            while (it.hasNext()) {
                it.next().c(upgradeException);
            }
            return;
        }
        if (this.g == 2) {
            List<r26> list2 = this.a;
            if (list2 == null || this.d) {
                return;
            }
            Iterator<r26> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().d(this.k);
            }
            return;
        }
        if (this.a == null || this.d) {
            return;
        }
        u6b.b("UpgradeDownloadTask", "download failed for package " + this.b + ", downSize=" + this.f + ", progress=" + this.h);
        Iterator<r26> it3 = this.a.iterator();
        while (it3.hasNext()) {
            it3.next().c(new UpgradeException(this.f10138l, this.m));
        }
    }

    @Override // android.os.AsyncTask
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public void onProgressUpdate(Long... lArr) {
        List<r26> list = this.a;
        if (list != null && !this.d) {
            Iterator<r26> it = list.iterator();
            while (it.hasNext()) {
                it.next().f(this.h, this.f);
            }
        }
        super.onProgressUpdate(lArr);
    }

    public final boolean v() {
        return this.o != null;
    }

    public final boolean w() throws UpgradeException {
        File file = new File(v9e.b(this.p.getAbsolutePath(), this.b));
        if (!file.exists() && !file.mkdirs()) {
            throw new UpgradeException(20002, "mkdir failed");
        }
        boolean zB = k26.b(this.p, this.b, this.o);
        if (zB) {
            this.g = 2;
        }
        return zB;
    }

    public void x() {
        this.d = true;
        this.g = 1;
    }
}
