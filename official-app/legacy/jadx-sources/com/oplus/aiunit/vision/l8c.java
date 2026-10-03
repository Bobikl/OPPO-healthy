package com.oplus.aiunit.vision;

import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
import okhttp3.MediaType;
import okio.BufferedSink;

/* JADX INFO: loaded from: classes17.dex */
public class l8c extends t81 {
    public final Set<b> a;
    public final o8c b;

    public static final class a {
        public final Set<b> a = new TreeSet();
        public final o8c.a b = new o8c.a();

        public a a(String str, String str2) {
            this.a.add(new b(str, str2));
            this.b.d(o8c.c.b(str, str2));
            return this;
        }

        public a b(String str, @Nullable String str2, gqf gqfVar) {
            this.b.d(o8c.c.c(str, str2, gqfVar));
            return this;
        }

        public l8c c() {
            return new l8c(this.b.e(), this.a);
        }

        public a d(MediaType mediaType) {
            this.b.f(mediaType);
            return this;
        }
    }

    public static final class b implements Comparable {
        public String i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public String f13579j;

        public b(String str, String str2) {
            this.i = str;
            this.f13579j = str2;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            if (obj instanceof b) {
                return this.i.compareTo(((b) obj).i);
            }
            return 0;
        }

        public String d() {
            return this.f13579j;
        }
    }

    public l8c(o8c o8cVar, Set<b> set) {
        this.b = o8cVar;
        this.a = set;
    }

    @Override // com.oplus.aiunit.vision.t81
    public void a(BufferedSink bufferedSink) throws IOException {
        Iterator<b> it = b().iterator();
        while (it.hasNext()) {
            bufferedSink.writeUtf8(it.next().d());
        }
    }

    public Set<b> b() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.gqf
    /* JADX INFO: renamed from: contentType */
    public MediaType getContentType() {
        return this.b.getContentType();
    }

    @Override // com.oplus.aiunit.vision.gqf
    public void writeTo(BufferedSink bufferedSink) throws IOException {
        this.b.writeTo(bufferedSink);
    }
}
