package com.oplus.aiunit.vision;

import android.net.Uri;
import androidx.annotation.NonNull;
import com.heytap.webview.extension.protocol.Const;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes13.dex */
public class xmk<Data> implements n2c<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("http", Const.Scheme.SCHEME_HTTPS)));
    public final n2c<y68, Data> a;

    public static class a implements o2c<Uri, InputStream> {
        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, InputStream> d(p7c p7cVar) {
            return new xmk(p7cVar.d(y68.class, InputStream.class));
        }
    }

    public xmk(n2c<y68, Data> n2cVar) {
        this.a = n2cVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        return this.a.a(new y68(uri.toString()), i, i2, erdVar);
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return b.contains(uri.getScheme());
    }
}
