package com.oplus.statistics;

import android.content.Context;
import android.text.TextUtils;
import com.oplus.aiunit.vision.lqd;
import com.oplus.statistics.StatisticsExceptionHandler;
import com.oplus.statistics.agent.ExceptionAgent;
import com.oplus.statistics.data.ExceptionBean;
import com.oplus.statistics.util.LogUtil;
import com.oplus.statistics.util.Supplier;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes8.dex */
public class StatisticsExceptionHandler implements Thread.UncaughtExceptionHandler {
    public Context i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Thread.UncaughtExceptionHandler f20107j = Thread.getDefaultUncaughtExceptionHandler();

    public StatisticsExceptionHandler(Context context) {
        this.i = context.getApplicationContext();
    }

    public static /* synthetic */ String c() {
        return "StatisticsExceptionHandler: get the uncaughtException.";
    }

    public final String b(Throwable th) {
        String string;
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        try {
            try {
                th.printStackTrace(printWriter);
                string = stringWriter.toString();
                printWriter.close();
            } catch (Exception e2) {
                LogUtil.e("StatisticsExceptionHand", new lqd(e2));
                printWriter.close();
                string = null;
            }
            return string;
        } catch (Throwable th2) {
            printWriter.close();
            throw th2;
        }
    }

    public void setStatisticsExceptionHandler() {
        if (this == this.f20107j) {
            return;
        }
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        LogUtil.d("StatisticsExceptionHand", new Supplier() { // from class: com.oplus.aiunit.vision.tni
            @Override // com.oplus.statistics.util.Supplier
            public final Object get() {
                return StatisticsExceptionHandler.c();
            }
        });
        String strB = b(th);
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!TextUtils.isEmpty(strB)) {
            ExceptionBean exceptionBean = new ExceptionBean(this.i);
            exceptionBean.setCount(1);
            exceptionBean.setEventTime(jCurrentTimeMillis);
            exceptionBean.setException(strB);
            ExceptionAgent.recordException(this.i, exceptionBean);
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f20107j;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
        }
    }
}
