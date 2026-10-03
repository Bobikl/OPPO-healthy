package com.oplus.aiunit.vision;

import android.content.Context;
import android.os.Bundle;
import com.heytap.health.base.download.resource.ResourceBean;
import com.heytap.health.network.core.BaseResponse;
import com.heytap.health.network.core.a;
import com.oplus.phonenoareainquire.PhoneNoInquireProvider;
import com.oplus.phonenoareainquire.b;
import com.oplus.phonenoareainquire.c;
import com.oplus.phonenoareainquire.service.OplusLocaleChangeJobIntentService;
import java.io.DataInputStream;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.CountDownLatch;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00112\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u0006\u0010\u0003\u001a\u00020\u0002J\b\u0010\u0004\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002J \u0010\r\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0005H\u0002J\u0018\u0010\u000e\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u0005H\u0002¨\u0006\u0012"}, d2 = {"Lcom/oplus/aiunit/vision/yje;", "", "", "b", "a", "Ljava/io/File;", "targetFile", "c", "Lcom/oplus/aiunit/vision/pnk;", "updateDbFileUtils", "", "rootFilePath", "file", "e", "d", "<init>", "()V", "Companion", "contactnetnumber_impl_thirdRelease"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nPhoneNoInquireUpdater.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PhoneNoInquireUpdater.kt\ncom/oplus/phonenoareainquire/update/PhoneNoInquireUpdater\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,192:1\n36#1,13:193\n36#1,13:206\n13309#2,2:219\n*S KotlinDebug\n*F\n+ 1 PhoneNoInquireUpdater.kt\ncom/oplus/phonenoareainquire/update/PhoneNoInquireUpdater\n*L\n61#1:193,13\n84#1:206,13\n110#1:219,2\n*E\n"})
public final class yje {
    public final void a() {
        ResourceBean resourceBean;
        if (!jrc.c()) {
            g3e.b("PNIUpdater", "download error no network");
            return;
        }
        Context contextA = e88.a();
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i = 0;
        while (true) {
            try {
                Object objJ = a.j(wje.class);
                Intrinsics.checkNotNullExpressionValue(objJ, "getCommApi(PhoneNoInquireApi::class.java)");
                resourceBean = null;
                BaseResponse baseResponse = (BaseResponse) wje.a.a((wje) objJ, null, 1, null).execute().a();
                if (baseResponse == null) {
                    break;
                }
                resourceBean = (ResourceBean) baseResponse.getBody();
                break;
            } catch (Throwable th) {
                i++;
                if (i > 3) {
                    throw th;
                }
                Thread.sleep(10000L);
            }
        }
        g3e.c("PNIUpdater", "download request cost: " + (System.currentTimeMillis() - jCurrentTimeMillis));
        g3e.a("PNIUpdater", "download downloadInfo " + resourceBean);
        if (resourceBean == null) {
            g3e.b("PNIUpdater", "download error: downloadInfo is null");
            return;
        }
        long updateTime = resourceBean.getUpdateTime();
        if (updateTime == wcg.a()) {
            g3e.c("PNIUpdater", "download is up to date");
            return;
        }
        String md5String = resourceBean.getMd5String();
        String fileUrl = resourceBean.getFileUrl();
        if (md5String == null || fileUrl == null) {
            g3e.b("PNIUpdater", "download error: file url or md5 is null");
            return;
        }
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        int i2 = 0;
        while (true) {
            try {
                p26.f().d(fileUrl, contextA.getCacheDir().getPath(), "pni_update.zip", false).c();
                g3e.c("PNIUpdater", "download cost: " + (System.currentTimeMillis() - jCurrentTimeMillis2));
                File file = new File(contextA.getCacheDir(), "pni_update.zip");
                if (!Intrinsics.areEqual(md5String, kdb.c(file))) {
                    g3e.b("PNIUpdater", "download error: md5 not match");
                    return;
                }
                long jCurrentTimeMillis3 = System.currentTimeMillis();
                File file2 = new File(contextA.getCacheDir(), "pni_update_unzip");
                sbm.h(file, file2);
                f3e.b(file);
                g3e.c("PNIUpdater", "download unZip cost : " + (System.currentTimeMillis() - jCurrentTimeMillis3));
                long jCurrentTimeMillis4 = System.currentTimeMillis();
                c(file2);
                f3e.b(file2);
                g3e.c("PNIUpdater", "download update cost: " + (System.currentTimeMillis() - jCurrentTimeMillis4));
                wcg.d(updateTime);
                return;
            } catch (Throwable th2) {
                i2++;
                if (i2 > 3) {
                    throw th2;
                }
                Thread.sleep(10000L);
            }
        }
    }

    public final void b() {
        g3e.c("PNIUpdater", "startUpdate start");
        try {
            a();
        } catch (Throwable th) {
            g3e.b("PNIUpdater", "startUpdate error " + th.getMessage());
        }
        g3e.c("PNIUpdater", "startUpdate end");
    }

    public final void c(File targetFile) {
        PhoneNoInquireProvider phoneNoInquireProvider = PhoneNoInquireProvider.sInstace;
        if (phoneNoInquireProvider == null) {
            return;
        }
        String str = targetFile.getAbsolutePath() + "/";
        pnk pnkVar = new pnk(e88.a());
        File[] fileArrListFiles = targetFile.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                String name = file.getName();
                Intrinsics.checkNotNullExpressionValue(name, "file.name");
                if (StringsKt.startsWith$default(name, "PhoneNumberData_3_1_0", false, 2, (Object) null)) {
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    d(pnkVar, file);
                } else {
                    Intrinsics.checkNotNullExpressionValue(file, "file");
                    e(pnkVar, str, file);
                }
                b.a();
                phoneNoInquireProvider.readPhoneNumberDataToCache(new DataInputStream(c.b("PhoneNumberData_3_1_0.dat", PhoneNoInquireProvider.sResourceFile)));
                CountDownLatch countDownLatch = new CountDownLatch(1);
                phoneNoInquireProvider.setInitializationLatch(countDownLatch);
                Context contextA = e88.a();
                Intrinsics.checkNotNullExpressionValue(contextA, "getAppContext()");
                mb4.i(contextA, phoneNoInquireProvider.VERSION_CN, countDownLatch);
                gqe.b();
                try {
                    gqe.h();
                } catch (Throwable th) {
                    g3e.b("PNIUpdater", "Exception when init loadLocationInfoCache in sExecutor's task " + th.getMessage());
                }
            }
        }
    }

    public final void d(pnk updateDbFileUtils, File file) {
        if (updateDbFileUtils.l(updateDbFileUtils.f(), file.getAbsolutePath()) == 27) {
            g3e.b("PNIUpdater", "revertDbFile result = " + updateDbFileUtils.j());
        }
    }

    public final void e(pnk updateDbFileUtils, String rootFilePath, File file) {
        String name = file.getName();
        if (Intrinsics.areEqual(name, "carrier_data")) {
            updateDbFileUtils.k(rootFilePath, PhoneNoInquireProvider.getDataFilePath(), name);
        } else {
            updateDbFileUtils.m(rootFilePath, PhoneNoInquireProvider.getDataFilePath(), name);
        }
        if (Intrinsics.areEqual(name, "city_name_table.txt")) {
            e88.a().getContentResolver().call(PhoneNoInquireProvider.CONTENT_URI, xje.METHOD_REFRESH_PROVINCE_AND_CITY_TABLE, (String) null, (Bundle) null);
            return;
        }
        if (Intrinsics.areEqual(name, "Multi_Language_Table.txt")) {
            try {
                InputStream inputStreamB = c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile);
                if (inputStreamB != null) {
                    try {
                        OplusLocaleChangeJobIntentService.INSTANCE.c(inputStreamB, e88.a(), null);
                        Unit unit = Unit.INSTANCE;
                        CloseableKt.closeFinally(inputStreamB, (Throwable) null);
                    } catch (Throwable th) {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            CloseableKt.closeFinally(inputStreamB, th);
                            throw th2;
                        }
                    }
                }
            } catch (Exception e) {
                g3e.b("PNIUpdater", "updateMultiLanguageTab1 error: " + e.getMessage());
                try {
                    OplusLocaleChangeJobIntentService.INSTANCE.c(null, e88.a(), null);
                } catch (Exception e2) {
                    g3e.b("PNIUpdater", "updateMultiLanguageTab2 error: " + e2.getMessage());
                }
            }
        }
    }
}
