package com.omron;

import android.content.Context;
import android.os.Looper;
import android.os.Process;
import android.util.Log;
import android.widget.Toast;
import com.oplus.aiunit.vision.b78;
import java.io.PrintWriter;
import java.io.StringWriter;

/* JADX INFO: loaded from: classes5.dex */
public class e implements Thread.UncaughtExceptionHandler {
    private static final String b = b78.a().getExternalCacheDir().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static e f8975c = new e();
    private Context a;

    public class a implements Runnable {
        final /* synthetic */ Context a;
        final /* synthetic */ String b;

        public a(Context context, String str) {
            this.a = context;
            this.b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            Looper.prepare();
            Toast.makeText(this.a, this.b, 1).show();
            Looper.loop();
        }
    }

    private e() {
    }

    public static e a() {
        return f8975c;
    }

    private String b(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        printWriter.close();
        Log.e("CrmCrashHandler", stringWriter.toString());
        return stringWriter.toString();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        ay.b("BleCrashHandler    uncaughtException    " + a(th), new Object[0]);
        Log.e("CrmCrashHandler", a(th));
        a(this.a, "Sorry, Exception happened!Please see the crash log！");
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e2) {
            e2.printStackTrace();
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }

    private String a(Throwable th) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(b(th));
        return stringBuffer.toString();
    }

    public void a(Context context) {
        this.a = context;
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    private void a(Context context, String str) {
        new Thread(new a(context, str)).start();
    }
}
