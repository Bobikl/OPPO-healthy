package com.omron;

import android.os.HandlerThread;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import com.oplus.smartenginehelper.entity.ClickApiEntity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import xcrash.TombstoneParser;

/* JADX INFO: loaded from: classes5.dex */
public final class ei {

    @NonNull
    private final el b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Nullable
    private Process f8983c;

    @Nullable
    private BufferedReader d;

    @Nullable
    private d g;

    @Nullable
    private Thread h;

    @NonNull
    private final List<String> a = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    private String f8984e = "";

    @NonNull
    private String f = "";

    @NonNull
    private final Runnable i = new a();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NonNull
    private final Runnable f8985j = new b();

    public class a implements Runnable {

        /* JADX INFO: renamed from: com.omron.ei$a$a, reason: collision with other inner class name */
        public class RunnableC0847a implements Runnable {
            public RunnableC0847a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ei.this.b();
            }
        }

        public class b implements Runnable {
            public b() {
            }

            @Override // java.lang.Runnable
            public void run() {
                ei.this.c();
            }
        }

        public a() {
        }

        /* JADX WARN: Code duplicated, block: B:27:0x0066 A[EDGE_INSN: B:27:0x0066->B:19:0x0066 BREAK  A[LOOP:0: B:23:0x0017->B:28:0x0017], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:29:0x0017 A[SYNTHETIC] */
        @Override // java.lang.Runnable
        public void run() {
            List list;
            if (ei.this.d == null) {
                throw new AndroidRuntimeException("null == mReader");
            }
            ei.this.b.post(new RunnableC0847a());
            boolean z = false;
            while (true) {
                try {
                    String line = ei.this.d.readLine();
                    if (TextUtils.isEmpty(line)) {
                        Thread.sleep(200L);
                    } else {
                        if (z) {
                            list = ei.this.a;
                        } else {
                            if (line.contains(ei.this.f8984e)) {
                                ei.this.a.clear();
                                list = ei.this.a;
                                z = true;
                            }
                            if (line.contains(ei.this.f)) {
                                break;
                            }
                        }
                        list.add(line);
                        if (line.contains(ei.this.f)) {
                            break;
                            break;
                        }
                    }
                } catch (IOException | InterruptedException | NullPointerException e2) {
                    e2.printStackTrace();
                }
            }
            ei.this.b.post(new b());
        }
    }

    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ei.this.a();
        }
    }

    public class c implements Runnable {
        final /* synthetic */ e a;
        final /* synthetic */ d b;

        public c(e eVar, d dVar) {
            this.a = eVar;
            this.b = dVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            ei.this.a(this.a, this.b);
        }
    }

    public interface d {
        void a();

        void onSuccess();
    }

    public enum e {
        Verbose("*:V"),
        Debug("*:D"),
        Info("*:I"),
        Warning("*:W"),
        Error("*:E");

        private String a;

        e(String str) {
            this.a = str;
        }

        public String a() {
            return this.a;
        }
    }

    public ei() {
        HandlerThread handlerThread = new HandlerThread("LoggingManager");
        handlerThread.start();
        this.b = new el(handlerThread.getLooper());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        an.a();
        d dVar = this.g;
        if (dVar == null) {
            throw new AndroidRuntimeException("null == mActionListener");
        }
        this.g = null;
        dVar.onSuccess();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        an.a();
        if (this.d == null) {
            throw new AndroidRuntimeException("null == mReader");
        }
        Process process = this.f8983c;
        if (process != null) {
            process.destroy();
            this.f8983c = null;
        }
        try {
            this.d.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
        this.d = null;
        Thread thread = this.h;
        if (thread != null) {
            thread.interrupt();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        an.a();
        this.b.removeCallbacks(this.f8985j);
        Process process = this.f8983c;
        if (process != null) {
            process.destroy();
            this.f8983c = null;
        }
        BufferedReader bufferedReader = this.d;
        if (bufferedReader != null) {
            try {
                bufferedReader.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            this.d = null;
        }
        this.h = null;
        d dVar = this.g;
        if (dVar == null) {
            throw new AndroidRuntimeException("null == mActionListener");
        }
        this.g = null;
        dVar.onSuccess();
    }

    public void b(@NonNull e eVar, @NonNull d dVar) {
        this.b.post(new c(eVar, dVar));
    }

    public void a(@NonNull d dVar) {
        b(e.Verbose, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(@NonNull e eVar, @NonNull d dVar) {
        an.c(eVar.name());
        if (this.g != null) {
            an.a("busy.");
            dVar.a();
            return;
        }
        if (this.d != null) {
            an.a("null != mReader");
            dVar.a();
            return;
        }
        try {
            this.f8983c = Runtime.getRuntime().exec(new String[]{TombstoneParser.keyLogcat, "-v", ClickApiEntity.TIME, eVar.a()});
            try {
                this.d = new BufferedReader(new InputStreamReader(this.f8983c.getInputStream(), "UTF-8"), 1024);
                this.g = dVar;
                this.h = new Thread(this.i);
                this.f8984e = "+++===+++===+++===+++===+++=== LOGGING START +++===+++===+++===+++===+++=== " + this.h.hashCode();
                this.f = "===+++===+++===+++===+++===+++ LOGGING STOP ===+++===+++===+++===+++===+++ " + this.h.hashCode();
                an.b(this.f8984e);
                this.h.start();
            } catch (UnsupportedEncodingException e2) {
                e2.printStackTrace();
                this.f8983c.destroy();
                dVar.a();
            }
        } catch (IOException e3) {
            e3.printStackTrace();
            dVar.a();
        }
    }
}
