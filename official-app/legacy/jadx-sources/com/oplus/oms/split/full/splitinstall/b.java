package com.oplus.oms.split.full.splitinstall;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.text.TextUtils;
import com.oplus.aiunit.vision.a8i;
import com.oplus.aiunit.vision.aim;
import com.oplus.aiunit.vision.b7i;
import com.oplus.aiunit.vision.c8i;
import com.oplus.aiunit.vision.d1n;
import com.oplus.aiunit.vision.h7i;
import com.oplus.aiunit.vision.i7i;
import com.oplus.aiunit.vision.j2n;
import com.oplus.aiunit.vision.j7i;
import com.oplus.aiunit.vision.k3n;
import com.oplus.aiunit.vision.l7i;
import com.oplus.aiunit.vision.pd7;
import com.oplus.aiunit.vision.qpc;
import com.oplus.aiunit.vision.v5n;
import com.oplus.aiunit.vision.vzm;
import com.oplus.aiunit.vision.w6b;
import com.oplus.aiunit.vision.w7i;
import com.oplus.aiunit.vision.y6i;
import com.oplus.oms.split.full.splitdownload.DownloadRequest;
import com.oplus.oms.split.full.splitdownload.Downloader;
import com.oplus.oms.split.full.splitdownload.ISplitUpdateManager;
import com.oplus.oms.split.full.splitdownload.SplitUpdateInfo;
import com.oplus.oms.split.full.splitinstall.b.o;
import com.oplus.oms.split.full.splitrequest.SplitOmsJsonLoadStrategy;
import com.sensorsdata.analytics.android.sdk.aop.push.PushAutoTrackHelper;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes8.dex */
public final class b extends l7i {
    public static final AtomicReference<l7i> k = new AtomicReference<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final /* synthetic */ boolean f20024l = true;
    public final Context a;
    public final Downloader b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ISplitUpdateManager f20025c;
    public final List<String> d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final d1n f20026e;
    public final Set<String> f;
    public final long g;
    public final Class<?> h;
    public final boolean i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final k3n f20027j;

    public b(Context context, d1n d1nVar, Downloader downloader, ISplitUpdateManager iSplitUpdateManager, Class<? extends Activity> cls, boolean z) {
        long downloadSizeThresholdWhenUsingMobileData;
        this.a = context;
        this.f20026e = d1nVar;
        this.b = downloader;
        this.f20027j = new aim(context, d1nVar);
        this.f20025c = iSplitUpdateManager;
        if (downloader != null) {
            downloadSizeThresholdWhenUsingMobileData = downloader.getDownloadSizeThresholdWhenUsingMobileData();
            w7i.a("SplitInstallSupervisorImpl", "downloadSizeThreshold = " + downloadSizeThresholdWhenUsingMobileData, new Object[0]);
        } else {
            downloadSizeThresholdWhenUsingMobileData = 0;
        }
        this.g = downloadSizeThresholdWhenUsingMobileData < 0 ? Long.MAX_VALUE : downloadSizeThresholdWhenUsingMobileData;
        this.f = new y6i(context).c();
        this.h = cls;
        this.i = z;
        String[] dynamicFeatures = SplitOmsJsonLoadStrategy.getInstance().getDynamicFeatures();
        List<String> listAsList = dynamicFeatures == null ? null : Arrays.asList(dynamicFeatures);
        this.d = listAsList;
        if (listAsList == null) {
            w7i.i("SplitInstallSupervisorImpl", "Can't read dynamicFeatures from SplitBaseInfoProvider", new Object[0]);
        }
    }

    public static l7i E() {
        return k.get();
    }

    public static void F(Context context, Downloader downloader, ISplitUpdateManager iSplitUpdateManager, Class<? extends Activity> cls, boolean z) {
        AtomicReference<l7i> atomicReference = k;
        if (atomicReference.get() == null) {
            atomicReference.set(new b(context, new j2n(context), downloader, iSplitUpdateManager, cls, z));
        }
    }

    public static int n(List<h7i> list, List<v5n> list2) {
        return (list2 == null || list2.isEmpty()) ? l7i.b(list) : l7i.b(list2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void s(List list, List list2, l7i.a aVar, int i, List list3) {
        w7i.e("SplitInstallSupervisorImpl", "select split version status: %d, splits: %s", Integer.valueOf(i), w6b.b(list3));
        if (i == 0) {
            t(list, list2, list3, aVar);
        } else {
            c8i.a(list, "tInstall", -2);
            aVar.onError(l7i.c(-2));
        }
    }

    public final boolean A(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        Collection<h7i> collectionE = j7i.s().e(this.a);
        if (collectionE.isEmpty()) {
            return false;
        }
        for (String str : list) {
            for (h7i h7iVar : collectionE) {
                if (h7iVar.q().equals(str)) {
                    return v(h7iVar);
                }
            }
        }
        return true;
    }

    public final long[] B(Collection<v5n> collection) throws IllegalStateException, IOException {
        long size = 0;
        long j2 = 0;
        for (v5n v5nVar : collection) {
            a aVar = new a(a8i.o().g(v5nVar.j().q(), true));
            try {
                List<a.C0974a> listI = aVar.i(this.a, v5nVar, this.i);
                pd7.a(aVar);
                SplitUpdateInfo splitUpdateInfoI = v5nVar.i();
                size += splitUpdateInfoI != null ? splitUpdateInfoI.getSize() : v5nVar.j().f();
                for (a.C0974a c0974a : listI) {
                    if (!c0974a.exists()) {
                        j2 += c0974a.a;
                    }
                }
            } catch (Throwable th) {
                pd7.a(aVar);
                throw th;
            }
        }
        return new long[]{size, j2};
    }

    public final boolean C(List<String> list) {
        return list == null || list.isEmpty() || this.d == null || !new HashSet(this.d).containsAll(list);
    }

    public final int D(List<String> list) {
        if (!this.f.isEmpty()) {
            return !this.f.containsAll(list) ? -3 : 0;
        }
        int iL = l();
        return iL == 0 ? m(list) : iL;
    }

    @Override // com.oplus.aiunit.vision.l7i
    public void d(int i, l7i.a aVar) {
        if (aVar == null) {
            return;
        }
        w7i.e("SplitInstallSupervisorImpl", "start to cancel session id %d installation", Integer.valueOf(i));
        vzm vzmVarB = this.f20026e.b(i);
        boolean z = false;
        if (vzmVarB == null) {
            w7i.e("SplitInstallSupervisorImpl", "Session id is not found!", new Object[0]);
            aVar.onError(l7i.c(-4));
            return;
        }
        int i2 = vzmVarB.h;
        if (i2 != 1 && i2 != 2) {
            aVar.onError(l7i.c(-3));
            return;
        }
        Downloader downloader = this.b;
        if (downloader != null && downloader.cancelDownloadSync(i)) {
            z = true;
        }
        w7i.a("SplitInstallSupervisorImpl", "task[%d] is cancel: %b", Integer.valueOf(i), Boolean.valueOf(z));
        if (z) {
            aVar.c(i, null);
        } else {
            aVar.onError(l7i.c(-3));
        }
    }

    @Override // com.oplus.aiunit.vision.l7i
    public boolean e(int i) {
        vzm vzmVarB = this.f20026e.b(i);
        if (vzmVarB == null) {
            return false;
        }
        this.f20026e.a(vzmVarB.i, 7);
        this.f20026e.b(vzmVarB);
        return true;
    }

    @Override // com.oplus.aiunit.vision.l7i
    public boolean f(int i) {
        vzm vzmVarB = this.f20026e.b(i);
        if (this.b == null || vzmVarB == null) {
            return false;
        }
        o oVar = new o(this.f20027j, i, this.f20026e, vzmVarB.f18064c);
        this.f20026e.a(i, 1);
        this.f20026e.b(vzmVarB);
        this.b.startDownload(vzmVarB.i, vzmVarB.d, oVar);
        return true;
    }

    @Override // com.oplus.aiunit.vision.l7i
    public void g(int i, l7i.a aVar) {
        if (aVar == null) {
            return;
        }
        vzm vzmVarB = this.f20026e.b(i);
        if (vzmVarB == null) {
            aVar.onError(l7i.c(-4));
        } else {
            aVar.d(i, vzm.a(vzmVarB));
        }
    }

    @Override // com.oplus.aiunit.vision.l7i
    public void h(l7i.a aVar) {
        if (aVar == null) {
            return;
        }
        List<vzm> listA = this.f20026e.a();
        if (listA.isEmpty()) {
            aVar.b(Collections.emptyList());
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator<vzm> it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(vzm.a(it.next()));
        }
        aVar.b(arrayList);
    }

    @Override // com.oplus.aiunit.vision.l7i
    public void i(com.oplus.oms.split.full.core.splitinstall.a aVar) {
        if (k.get() != null) {
            w7i.e("SplitInstallSupervisorImpl", "setInstallListenerRegister", new Object[0]);
            this.f20026e.c(aVar);
        }
    }

    @Override // com.oplus.aiunit.vision.l7i
    public void j(final List<String> list, final l7i.a aVar) {
        if (aVar == null || list == null || list.isEmpty()) {
            return;
        }
        int iD = D(list);
        if (iD != 0) {
            c8i.a(list, "tInstall", iD);
            aVar.onError(l7i.c(iD));
            return;
        }
        final List<h7i> listX = x(list);
        w7i.e("SplitInstallSupervisorImpl", "startInstall moduleNames: %s, needInstallSplits: %s", list, w6b.b(listX));
        if (!listX.isEmpty()) {
            c.a(this.a, listX, this.f20025c, new c.b() { // from class: com.oplus.aiunit.vision.m7i
                @Override // com.oplus.oms.split.full.splitinstall.c.b
                public final void b(int i, List list2) {
                    this.a.s(list, listX, aVar, i, list2);
                }
            });
            return;
        }
        w7i.i("SplitInstallSupervisorImpl", "startInstall split names not exists: %s", list);
        c8i.a(list, "tInstall", -3);
        aVar.onError(l7i.c(-3));
    }

    public final int l() {
        i7i i7iVarS = j7i.s();
        if (i7iVarS == null) {
            w7i.i("SplitInstallSupervisorImpl", "Failed to fetch SplitInfoManager instance!", new Object[0]);
            return -100;
        }
        Collection<h7i> collectionE = i7iVarS.e(this.a);
        if (collectionE == null || collectionE.isEmpty()) {
            w7i.i("SplitInstallSupervisorImpl", "Failed to parse json file of split info!", new Object[0]);
            return -100;
        }
        String strF = i7iVarS.f(this.a);
        String strG = b7i.g();
        if (TextUtils.isEmpty(strF) || !strF.equals(strG)) {
            w7i.i("SplitInstallSupervisorImpl", "Failed to match base app version-name excepted base app version " + strG + " but" + strF + "!", new Object[0]);
            return -100;
        }
        String strD = i7iVarS.d(this.a);
        String strD2 = b7i.d();
        if (!TextUtils.isEmpty(strD) && strD.equals(strD2)) {
            return 0;
        }
        w7i.i("SplitInstallSupervisorImpl", "Failed to match base app oms-version excepted " + strD2 + " but " + strD + "!", new Object[0]);
        return -100;
    }

    public final int m(List<String> list) {
        if (C(list)) {
            w7i.i("SplitInstallSupervisorImpl", "isRequestInvalid error", new Object[0]);
            return -3;
        }
        if (A(list)) {
            return 0;
        }
        w7i.i("SplitInstallSupervisorImpl", "isModuleAvailable error", new Object[0]);
        return -2;
    }

    public final void o(vzm vzmVar, long j2, List<DownloadRequest> list) {
        Intent intent = new Intent();
        intent.putExtra("sessionId", vzmVar.i);
        intent.putParcelableArrayListExtra("downloadRequests", (ArrayList) list);
        intent.putExtra("realTotalBytesNeedToDownload", j2);
        intent.putStringArrayListExtra("moduleNames", (ArrayList) vzmVar.a);
        intent.setClass(this.a, this.h);
        Context context = this.a;
        PushAutoTrackHelper.hookIntentGetActivity(context, 0, intent, 201326592);
        PendingIntent activity = PendingIntent.getActivity(context, 0, intent, 201326592);
        PushAutoTrackHelper.hookPendingIntentGetActivity(activity, context, 0, intent, 201326592);
        vzmVar.f18066j = activity;
        this.f20026e.a(vzmVar.i, 8);
        this.f20026e.b(vzmVar);
    }

    public final void p(List<v5n> list, int i, vzm vzmVar, List<DownloadRequest> list2, long[] jArr) {
        long j2 = jArr[0];
        Downloader downloader = this.b;
        long jCalculateDownloadSize = downloader == null ? jArr[1] : downloader.calculateDownloadSize(list2, jArr[1]);
        w7i.e("SplitInstallSupervisorImpl", "startDownloadSplits sessionId: %d, totalBytesToDownload: %d, realTotalBytesNeedToDownload: %d ", Integer.valueOf(i), Long.valueOf(j2), Long.valueOf(jCalculateDownloadSize));
        vzmVar.f = j2;
        o oVar = new o(this.f20027j, i, this.f20026e, list);
        if (this.b == null) {
            w7i.e("SplitInstallSupervisorImpl", "User Downloader is null, skip download, sessionId: %d", Integer.valueOf(i));
            oVar.onCompleted();
            return;
        }
        if (jCalculateDownloadSize <= 0) {
            w7i.e("SplitInstallSupervisorImpl", "Splits have been downloaded, install them directly! sessionId: %d", Integer.valueOf(i));
            oVar.onCompleted();
            return;
        }
        if (!qpc.c(this.a)) {
            this.f20026e.a(i, 1);
            this.f20026e.b(vzmVar);
            oVar.onError(-7);
        } else if (u(i, vzmVar, list2, jCalculateDownloadSize, oVar)) {
            w7i.e("SplitInstallSupervisorImpl", "call Downloader.startDownload, session: %d", Integer.valueOf(i));
            this.f20026e.a(i, 1);
            this.f20026e.b(vzmVar);
            this.b.startDownload(i, list2, oVar);
        }
    }

    public final void q(List<String> list, vzm vzmVar, String str, int i) {
        c8i.a(list, str, i);
        vzmVar.c(6);
        vzmVar.g = i;
        this.f20026e.b(vzmVar);
    }

    public final void r(List<String> list, String str, int i, l7i.a aVar) {
        w7i.i("SplitInstallSupervisorImpl", "startDownloadSplits error code: %d, splits: %s", Integer.valueOf(i), list);
        c8i.a(list, str, i);
        aVar.onError(l7i.c(i));
    }

    public final void t(List<String> list, List<h7i> list2, List<v5n> list3, l7i.a aVar) {
        if (this.f20026e.b()) {
            r(list, "tInstall", -1, aVar);
            return;
        }
        int iN = n(list2, list3);
        w7i.e("SplitInstallSupervisorImpl", "startDownloadSplits sessionId: %d", Integer.valueOf(iN));
        vzm vzmVarB = this.f20026e.b(iN);
        if ((vzmVarB == null || vzmVarB.h != 8) && this.f20026e.a(list)) {
            r(list, "tInstall", -8, aVar);
            return;
        }
        w7i.e("SplitInstallSupervisorImpl", "startDownloadSplits sessionId: %d, uninstalled: %s", Integer.valueOf(iN), w6b.b(list3));
        List<DownloadRequest> listW = w(list3);
        vzm vzmVar = vzmVarB == null ? new vzm(iN, list, list2, list3, listW) : vzmVarB;
        if (list3.isEmpty()) {
            w7i.e("SplitInstallSupervisorImpl", "Splits[%s] already installed. sessionId: %d", w6b.b(list3), Integer.valueOf(iN));
            aVar.a(iN, null);
            this.f20027j.a(iN, vzmVar);
            return;
        }
        try {
            long[] jArrB = B(list3);
            aVar.a(iN, null);
            this.f20026e.a(iN, vzmVar);
            p(list3, iN, vzmVar, listW, jArrB);
        } catch (IOException | IllegalStateException e2) {
            w7i.e("SplitInstallSupervisorImpl", "onPreDownloadSplits fail sessionId: %d, error: %s", Integer.valueOf(iN), e2.getMessage());
            aVar.a(iN, null);
            q(list, vzmVar, "tInstall", -100);
        }
    }

    public final boolean u(int i, vzm vzmVar, List<DownloadRequest> list, long j2, o oVar) {
        if (!this.b.forceUserConfirm() && (!qpc.d(this.a) || j2 <= this.g)) {
            return true;
        }
        w7i.e("SplitInstallSupervisorImpl", "startUserConfirmationActivity, session: %d, confirm class: %s", Integer.valueOf(i), this.h);
        if (this.h != null) {
            o(vzmVar, j2, list);
            return false;
        }
        this.f20026e.a(i, 1);
        this.f20026e.b(vzmVar);
        oVar.onError(-7);
        return false;
    }

    public final boolean v(h7i h7iVar) {
        return y(h7iVar) && z(h7iVar);
    }

    public final List<DownloadRequest> w(Collection<v5n> collection) {
        if (collection == null || collection.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(collection.size());
        for (v5n v5nVar : collection) {
            if (v5nVar.e() == 2) {
                String strQ = v5nVar.j().q();
                SplitUpdateInfo splitUpdateInfoI = v5nVar.i();
                String url = splitUpdateInfoI != null ? splitUpdateInfoI.getUrl() : v5nVar.j().i();
                String md5 = splitUpdateInfoI != null ? splitUpdateInfoI.getMd5() : v5nVar.j().e();
                long size = splitUpdateInfoI != null ? splitUpdateInfoI.getSize() : v5nVar.j().f();
                a8i a8iVarO = a8i.o();
                arrayList.add(DownloadRequest.newBuilder().q(url).l(md5).p(size).e(v5nVar.f()).m(v5nVar.j().q()).h(v5nVar.j().c()).o(a8iVarO.h(strQ, "" + v5nVar.g(), true).getAbsolutePath()).n(a8iVarO.e(strQ)).c());
            }
        }
        return arrayList;
    }

    public final List<h7i> x(List<String> list) {
        i7i i7iVarS = j7i.s();
        if (!f20024l && i7iVarS == null) {
            throw new AssertionError();
        }
        List<h7i> listB = i7iVarS.b(this.a, list);
        final HashSet hashSet = new HashSet(0);
        for (h7i h7iVar : listB) {
            if (h7iVar.b() != null) {
                hashSet.addAll(h7iVar.b());
            }
        }
        if (hashSet.isEmpty()) {
            return listB;
        }
        list.forEach(new Consumer() { // from class: com.oplus.aiunit.vision.n7i
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                hashSet.remove((String) obj);
            }
        });
        w7i.e("SplitInstallSupervisorImpl", "Add dependencies %s automatically for install splits %s ", hashSet, list);
        List<h7i> listB2 = i7iVarS.b(this.a, hashSet);
        listB2.addAll(listB);
        return listB2;
    }

    public final boolean y(h7i h7iVar) {
        try {
            h7iVar.m(this.a);
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public final boolean z(h7i h7iVar) {
        return h7iVar.j() <= Build.VERSION.SDK_INT;
    }
}
