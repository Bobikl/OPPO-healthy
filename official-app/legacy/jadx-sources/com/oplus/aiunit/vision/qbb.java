package com.oplus.aiunit.vision;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: classes13.dex */
public abstract class qbb implements du5 {
    public final ExecutorService a = Executors.newSingleThreadExecutor();

    public class a implements Callable<Void> {
        public final File i;

        public a(File file) {
            this.i = file;
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            qbb.this.e(this.i);
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.du5
    public void a(File file) throws IOException {
        this.a.submit(new a(file));
    }

    public abstract boolean b(File file, long j2, int i);

    public final long d(List<File> list) {
        Iterator<File> it = list.iterator();
        long length = 0;
        while (it.hasNext()) {
            length += it.next().length();
        }
        return length;
    }

    public final void e(File file) throws IOException {
        xd7.e(file);
        f(xd7.a(file.getParentFile()));
    }

    public final void f(List<File> list) {
        long jD = d(list);
        int size = list.size();
        for (File file : list) {
            if (!b(file, jD, size)) {
                long length = file.length();
                if (file.delete()) {
                    size--;
                    jD -= length;
                    Log.i("video", "Cache file " + file + " is deleted because it exceeds cache limit");
                } else {
                    Log.i("video", "Error deleting file " + file + " for trimming cache");
                }
            }
        }
    }
}
