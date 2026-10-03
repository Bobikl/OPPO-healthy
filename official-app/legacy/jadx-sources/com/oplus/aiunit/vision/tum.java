package com.oplus.aiunit.vision;

import java.io.IOException;
import java.io.Writer;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class tum implements Iterable<String> {
    public ConcurrentLinkedQueue<String> i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public AtomicInteger f17157j;

    public tum() {
        this.i = null;
        this.f17157j = null;
        this.i = new ConcurrentLinkedQueue<>();
        this.f17157j = new AtomicInteger(0);
    }

    public int a() {
        return this.f17157j.get();
    }

    public int b(String str) {
        int length = str.length();
        this.i.add(str);
        return this.f17157j.addAndGet(length);
    }

    public void c(Writer[] writerArr, char[] cArr) throws IOException {
        if (writerArr == null || cArr == null || cArr.length == 0 || writerArr.length < 2) {
            return;
        }
        Writer writer = writerArr[0];
        Writer writer2 = writerArr[1];
        int length = cArr.length;
        int i = 0;
        int i2 = length;
        for (String str : this) {
            int length2 = str.length();
            int i3 = 0;
            while (length2 > 0) {
                int i4 = i2 > length2 ? length2 : i2;
                int i5 = i3 + i4;
                str.getChars(i3, i5, cArr, i);
                i2 -= i4;
                i += i4;
                length2 -= i4;
                if (i2 == 0) {
                    if (writer != null) {
                        try {
                            writer.write(cArr, 0, length);
                        } catch (Exception unused) {
                        }
                    }
                    if (writer2 != null) {
                        try {
                            writer2.write(cArr, 0, length);
                        } catch (Exception unused2) {
                        }
                    }
                    i = 0;
                    i2 = length;
                }
                i3 = i5;
            }
        }
        if (i > 0) {
            if (writer != null) {
                try {
                    writer.write(cArr, 0, i);
                } catch (Exception unused3) {
                }
            }
            if (writer2 != null) {
                try {
                    writer2.write(cArr, 0, i);
                } catch (Exception unused4) {
                }
            }
        }
        if (writer != null) {
            try {
                writer.flush();
            } catch (Exception unused5) {
            }
        }
        if (writer2 != null) {
            try {
                writer2.flush();
            } catch (Exception unused6) {
            }
        }
    }

    public void d() {
        this.i.clear();
        this.f17157j.set(0);
    }

    @Override // java.lang.Iterable
    public Iterator<String> iterator() {
        return this.i.iterator();
    }
}
