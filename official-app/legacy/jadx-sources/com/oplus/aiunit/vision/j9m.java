package com.oplus.aiunit.vision;

import android.os.SystemClock;
import android.text.TextUtils;
import com.oplus.ocs.oms.downloader.OmsDownloader;
import com.oplus.oms.split.full.splitdownload.DownloadCallback;
import com.oplus.oms.split.full.splitdownload.DownloadRequest;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import okhttp3.Request;

/* JADX INFO: loaded from: classes8.dex */
public class j9m {
    public static final String d = "GroupDownloadContext";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f12809e = 0;
    public static final int f = 0;
    public static final int g = 1;
    public static final String h = "oms-download-thread";
    public static final int i = 100;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12810j = 8192;
    public static final int k = 3;
    public ThreadPoolExecutor a;
    public long b = 1048576;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map<Integer, pbm> f12811c = new HashMap();

    public class a implements Runnable {
        public final /* synthetic */ pbm i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final /* synthetic */ long f12812j;

        public a(pbm pbmVar, long j2) {
            this.i = pbmVar;
            this.f12812j = j2;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                j9m.this.d(this.i, this.f12812j, 0);
            } catch (Exception e2) {
                if (!this.i.d()) {
                    this.i.a().onError(3);
                }
                hpm.c(j9m.d, " mDownloadExecutor exception" + e2.getMessage(), new Object[0]);
            }
        }
    }

    public final long a(pbm pbmVar, cuf cufVar, File file, long j2, long j3, long j4) throws IOException {
        long j5;
        int i2;
        try {
            try {
                try {
                    InputStream inputStreamA = cufVar.a();
                    try {
                        try {
                            FileOutputStream fileOutputStream = new FileOutputStream(file, true);
                            try {
                                byte[] bArr = new byte[8192];
                                long j6 = j3 + j2;
                                if (pbmVar == null) {
                                    hpm.e(d, "downloadTaskInfo is null", new Object[0]);
                                    fileOutputStream.close();
                                    if (inputStreamA != null) {
                                        inputStreamA.close();
                                    }
                                    cufVar.close();
                                    return j6;
                                }
                                loop0: while (true) {
                                    j5 = j6;
                                    while (true) {
                                        if (pbmVar.f() || (i2 = inputStreamA.read(bArr)) == -1) {
                                            break loop0;
                                        }
                                        fileOutputStream.write(bArr, 0, i2);
                                        j5 += (long) i2;
                                        if (j5 - j6 >= this.b) {
                                            break;
                                        }
                                        if (j5 >= j4) {
                                            pbmVar.a().onProgress(j5);
                                        }
                                    }
                                    pbmVar.a().onProgress(j5);
                                    j6 = j5;
                                }
                                if (pbmVar.f()) {
                                    g(pbmVar.e());
                                    pbmVar.a().onCanceled();
                                    this.f12811c.remove(Integer.valueOf(pbmVar.g()));
                                }
                                fileOutputStream.close();
                                if (inputStreamA != null) {
                                    inputStreamA.close();
                                }
                                cufVar.close();
                                return j5;
                            } catch (Throwable th) {
                                try {
                                    fileOutputStream.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    th.addSuppressed(th2);
                                    throw th;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            Throwable th4 = th;
                            if (inputStreamA == null) {
                                throw th4;
                            }
                            try {
                                inputStreamA.close();
                                throw th4;
                            } catch (Throwable th5) {
                                th4.addSuppressed(th5);
                                throw th4;
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                } catch (IOException e2) {
                    e = e2;
                    throw new IOException(file.getName() + " write IOException " + e.getMessage());
                }
            } catch (IOException e3) {
                e = e3;
                throw new IOException(file.getName() + " write IOException " + e.getMessage());
            }
        } catch (Throwable th7) {
            cufVar.close();
            throw th7;
        }
    }

    public final wr2 b(DownloadRequest downloadRequest, long j2, DownloadCallback downloadCallback) {
        String url = downloadRequest.getUrl();
        String moduleName = downloadRequest.getModuleName();
        long size = downloadRequest.getSize();
        String savePath = downloadRequest.getSavePath();
        if (TextUtils.isEmpty(url) || TextUtils.isEmpty(moduleName) || TextUtils.isEmpty(savePath)) {
            hpm.e(d, "Some properties of this downloadRequest are incomplete", new Object[0]);
            return null;
        }
        hpm.d(d, "current " + moduleName + " size is " + j2, new Object[0]);
        if (j2 >= size) {
            hpm.d(d, moduleName + " exists, and the file size is " + j2 + " it don't need download again", new Object[0]);
            return null;
        }
        return uhm.d().a(new Request.Builder().addHeader("RANGE", "bytes=" + j2 + "-" + size).url(url).build());
    }

    public final void c(pbm pbmVar, long j2) {
        long jUptimeMillis = SystemClock.uptimeMillis();
        hpm.d(d, "need to download requests is: " + pbmVar.e(), new Object[0]);
        if (this.a == null) {
            this.a = new ThreadPoolExecutor(0, 1, 0L, TimeUnit.SECONDS, new SynchronousQueue(), new n9m());
        }
        this.a.execute(new a(pbmVar, j2));
        hpm.d(d, "start finish " + (SystemClock.uptimeMillis() - jUptimeMillis) + " ms", new Object[0]);
    }

    /* JADX WARN: Code duplicated, block: B:82:0x016f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:? A[Catch: IOException -> 0x0179, SocketException | SocketTimeoutException -> 0x017b, SocketException | SocketTimeoutException -> 0x017b, SYNTHETIC, TRY_LEAVE, TryCatch #0 {IOException -> 0x0179, blocks: (B:61:0x0178, B:60:0x0175, B:42:0x014d, B:44:0x0151), top: B:78:0x0151 }] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v13 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r1v19, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1, types: [int] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v7 */
    public final void d(pbm pbmVar, long j2, int i2) {
        ?? r13;
        String str;
        int i3;
        Throwable th;
        j9m j9mVar = this;
        pbm pbmVar2 = pbmVar;
        j9mVar.f12811c.put(Integer.valueOf(pbmVar.g()), pbmVar2);
        List<DownloadRequest> listE = pbmVar.e();
        List<Long> listH = j9mVar.h(listE);
        long jA = vrm.a();
        long jCalculateNeedDownloadSize = j2;
        if (i2 != 0) {
            jCalculateNeedDownloadSize = OmsDownloader.calculateNeedDownloadSize(listE, jCalculateNeedDownloadSize);
        }
        long j3 = jCalculateNeedDownloadSize;
        String str2 = d;
        int i4 = 0;
        boolean z = true;
        if (j3 > jA) {
            hpm.e(d, "Not enough storage space. Now need + " + j3 + " bytes storage space, but in fact there is only + " + jA + " bytes storage space", new Object[0]);
            pbmVar2.b(true);
            pbmVar.a().onError(2);
            return;
        }
        j9mVar.b = j3 / 100;
        hpm.d(d, "download totalSize is " + j3 + " everyCallBackSize is " + j9mVar.b, new Object[0]);
        long jLongValue = 0L;
        ?? r8 = 0;
        while (r8 < listE.size()) {
            DownloadRequest downloadRequest = listE.get(r8);
            String url = downloadRequest.getUrl();
            wr2 wr2VarB = j9mVar.b(downloadRequest, listH.get(r8).longValue(), pbmVar.a());
            if (wr2VarB == null) {
                jLongValue = listH.get(r8).longValue() + jLongValue;
                str = str2;
                i3 = i4;
            } else {
                try {
                    ytf ytfVarExecute = wr2VarB.execute();
                    try {
                        try {
                            try {
                                try {
                                    if (!ytfVarExecute.b()) {
                                        e(pbmVar, j3, i2 + 1, 1);
                                        ytfVarExecute.close();
                                        return;
                                    }
                                    cuf body = ytfVarExecute.getBody();
                                    String moduleName = downloadRequest.getModuleName();
                                    if (body == null) {
                                        try {
                                            hpm.e(str2, moduleName + " responseBody is null", new Object[i4]);
                                            e(pbmVar, j3, i2 + 1, 1);
                                            ytfVarExecute.close();
                                            return;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r8 = url;
                                            th = th;
                                            if (ytfVarExecute != null) {
                                                throw th;
                                            }
                                            try {
                                                ytfVarExecute.close();
                                                throw th;
                                            } catch (Throwable th3) {
                                                th.addSuppressed(th3);
                                                throw th;
                                            }
                                        }
                                    }
                                    try {
                                        File file = new File(downloadRequest.getSavePath(), downloadRequest.getSaveFileName());
                                        long jLongValue2 = listH.get(r8).longValue();
                                        r13 = url;
                                        str = str2;
                                        i3 = i4;
                                        try {
                                            long jA2 = a(pbmVar, body, file, jLongValue2, jLongValue, j3);
                                            if (pbmVar.f()) {
                                                ytfVarExecute.close();
                                                return;
                                            }
                                            try {
                                                try {
                                                    ytfVarExecute.close();
                                                    jLongValue = jA2;
                                                } catch (IOException e2) {
                                                    e = e2;
                                                    hpm.c(str, "An unknown IOException occurred on the network during the download, and the url is " + r13 + e.getMessage(), new Object[i3]);
                                                    e(pbmVar, j3, i2 + 1, 3);
                                                    return;
                                                }
                                            } catch (SocketException | SocketTimeoutException e3) {
                                                e = e3;
                                                hpm.c(str, "An SocketTimeoutException occurred on the network during the download, and the url is " + r13 + e.getMessage(), new Object[i3]);
                                                e(pbmVar, j3, i2 + 1, 1);
                                                return;
                                            }
                                        } catch (Throwable th4) {
                                            th = th4;
                                        }
                                    } catch (Throwable th5) {
                                        th = th5;
                                    }
                                } catch (IOException e4) {
                                    e = e4;
                                    r13 = r8;
                                    str = str2;
                                    i3 = i4;
                                    hpm.c(str, "An unknown IOException occurred on the network during the download, and the url is " + r13 + e.getMessage(), new Object[i3]);
                                    e(pbmVar, j3, i2 + 1, 3);
                                    return;
                                }
                            } catch (SocketException | SocketTimeoutException e5) {
                                e = e5;
                                r13 = r8;
                                str = str2;
                                i3 = i4;
                                hpm.c(str, "An SocketTimeoutException occurred on the network during the download, and the url is " + r13 + e.getMessage(), new Object[i3]);
                                e(pbmVar, j3, i2 + 1, 1);
                                return;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                    }
                    th = th;
                    if (ytfVarExecute != null) {
                        throw th;
                    }
                    ytfVarExecute.close();
                    throw th;
                } catch (SocketException | SocketTimeoutException e6) {
                    e = e6;
                    r13 = url;
                } catch (IOException e7) {
                    e = e7;
                    r13 = url;
                }
            }
            str2 = str;
            i4 = i3;
            listH = listH;
            z = true;
            j9mVar = this;
            pbmVar2 = pbmVar;
            r8++;
        }
        pbmVar2.b(z);
        this.f12811c.remove(Integer.valueOf(pbmVar.g()));
        pbmVar.a().onCompleted();
    }

    public final void e(pbm pbmVar, long j2, int i2, int i3) {
        if (i2 < 3) {
            d(pbmVar, j2, i2 + 1);
            return;
        }
        this.f12811c.remove(Integer.valueOf(pbmVar.g()));
        pbmVar.b(true);
        pbmVar.a().onError(i3);
    }

    public void f(Integer num) {
        pbm pbmVar;
        if (this.f12811c.containsKey(num) && (pbmVar = this.f12811c.get(num)) != null) {
            pbmVar.c(true);
        }
    }

    public final void g(List<DownloadRequest> list) {
        for (DownloadRequest downloadRequest : list) {
            if (!plm.d(new File(downloadRequest.getSavePath(), downloadRequest.getSaveFileName()))) {
                hpm.e(d, "Failed to delete files during the process of canceling the installation of the plug-in", new Object[0]);
            }
        }
    }

    public final List<Long> h(List<DownloadRequest> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (DownloadRequest downloadRequest : list) {
            String md5 = downloadRequest.getMd5();
            long size = downloadRequest.getSize();
            File file = new File(downloadRequest.getSavePath(), downloadRequest.getSaveFileName());
            if (!file.exists() || file.length() <= 0) {
                arrayList.add(0L);
            } else if (plm.g(file) != null) {
                if (md5.equals(plm.g(file))) {
                    arrayList.add(Long.valueOf(size));
                } else {
                    arrayList.add(Long.valueOf(file.length()));
                }
            }
        }
        return arrayList;
    }

    public void i(pbm pbmVar, long j2) {
        if (pbmVar == null || pbmVar.a() == null) {
            return;
        }
        if (pbmVar.e() == null) {
            hpm.e(d, " startDownload requests is null.", new Object[0]);
            pbmVar.b(true);
            pbmVar.a().onError(3);
        }
        c(pbmVar, j2);
    }
}
