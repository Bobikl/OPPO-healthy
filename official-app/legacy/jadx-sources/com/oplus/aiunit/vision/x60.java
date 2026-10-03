package com.oplus.aiunit.vision;

import android.os.Handler;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/* JADX INFO: loaded from: classes18.dex */
public class x60 extends qv8 {
    public BlockingQueue<a> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Handler f18506j;

    public static class a {
        public c70 a;
        public int b;

        public a(c70 c70Var) {
            this.a = c70Var;
        }

        public c70 a() {
            return this.a;
        }

        public int b() {
            return this.b;
        }

        public void c(int i) {
            this.b = i;
        }
    }

    public x60(Handler handler) {
        super("ApduCmdEngin");
        this.i = new LinkedBlockingDeque();
        this.f18506j = handler;
    }

    public void a(a aVar) {
        this.i.add(aVar);
    }

    public int b() {
        return this.i.size();
    }

    /* JADX INFO: Infinite loop detected, blocks: 32, insns: 0 */
    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                a aVarTake = this.i.take();
                int iB = aVarTake.b();
                if (iB == 0) {
                    t6b.b("ApduCommandEngine", "ApduCommandEngine COMMAND");
                    if (aVarTake.a() != null) {
                        aVarTake.a().onStart();
                    }
                } else if (iB == 1) {
                    t6b.b("ApduCommandEngine", "ApduCommandEngine CONNECT");
                } else if (iB == 2) {
                    t6b.b("ApduCommandEngine", "ApduCommandEngine RELEASE_SESSION");
                    ydc.n().H();
                }
            } catch (Exception e2) {
                t6b.d("ApduCommandEngine", Thread.currentThread().getStackTrace()[1].getMethodName() + e2.getMessage());
            }
        }
    }
}
