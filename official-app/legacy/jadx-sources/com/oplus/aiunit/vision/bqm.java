package com.oplus.aiunit.vision;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import okhttp3.MediaType;
import okhttp3.Request;

/* JADX INFO: loaded from: classes10.dex */
public final class bqm<T> implements nmm<T> {
    public static final MediaType d = MediaType.get("application/octet-stream; charset=utf-8");
    public final efd a;
    public final String b = "https://spider-tracker.xiaohongshu.com/";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final wcm f9820c;

    public bqm(wcm wcmVar) {
        this.f9820c = wcmVar;
        efd.a aVar = new efd.a();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        efd.a aVarB0 = aVar.g(5000L, timeUnit).e(10000L, timeUnit).b0(5000L, timeUnit);
        aVarB0.a(new rim());
        this.a = aVarB0.c();
    }

    @Override // com.oplus.aiunit.vision.nmm
    public final avm a(ArrayList arrayList) {
        int i;
        try {
            this.f9820c.getClass();
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                byteArrayOutputStream.write((byte[]) it.next());
            }
            try {
                try {
                    ytf ytfVarExecute = null;
                    try {
                        ytfVarExecute = this.a.a(new Request.Builder().url(this.b + "api/spider").post(gqf.create(d, byteArrayOutputStream.toByteArray())).build()).execute();
                        ytfVarExecute.close();
                        int code = ytfVarExecute.getCode();
                        String message = ytfVarExecute.getMessage();
                        avm avmVar = new avm();
                        if (code < 200 || code >= 300) {
                            avmVar.a = false;
                        } else {
                            avmVar.a = true;
                        }
                        avmVar.b = code;
                        avmVar.f9505c = message;
                        try {
                            ytfVarExecute.close();
                        } catch (Exception unused) {
                        }
                        return avmVar;
                    } catch (Throwable th) {
                        try {
                            th.printStackTrace();
                            return avm.a(-1, th);
                        } finally {
                            if (ytfVarExecute != null) {
                                try {
                                    ytfVarExecute.close();
                                } catch (Exception unused2) {
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th.printStackTrace();
                    i = -4;
                    return avm.a(i, th);
                }
            } catch (Throwable th3) {
                th = th3;
                th.printStackTrace();
                i = -3;
            }
        } catch (Throwable th4) {
            th = th4;
            th.printStackTrace();
            i = -2;
        }
    }
}
