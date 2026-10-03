package com.omron;

import com.oplus.aiunit.vision.qx5;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class aw implements qx5 {
    private long a;
    private TimeUnit b;

    public class a implements Callable<List<InetAddress>> {
        final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<InetAddress> call() throws Exception {
            return Arrays.asList(InetAddress.getAllByName(this.a));
        }
    }

    public aw(long j2, TimeUnit timeUnit) {
        this.a = j2;
        this.b = timeUnit;
    }

    @Override // com.oplus.aiunit.vision.qx5
    public List<InetAddress> lookup(String str) throws UnknownHostException {
        if (str == null) {
            throw new UnknownHostException("host name is null");
        }
        try {
            FutureTask futureTask = new FutureTask(new a(str));
            new Thread(futureTask).start();
            return (List) futureTask.get(this.a, this.b);
        } catch (Exception e2) {
            UnknownHostException unknownHostException = new UnknownHostException("Unable to resolve host " + str);
            unknownHostException.initCause(e2);
            throw unknownHostException;
        }
    }
}
