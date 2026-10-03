package com.oplus.aiunit.vision;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.heytap.webview.extension.protocol.Const;
import java.io.InputStream;

/* JADX INFO: loaded from: classes13.dex */
public class fi0<Data> implements n2c<Uri, Data> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11366c = 22;
    public final AssetManager a;
    public final a<Data> b;

    public interface a<Data> {
        ft4<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements o2c<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.oplus.aiunit.vision.fi0.a
        public ft4<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new ab7(assetManager, str);
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, AssetFileDescriptor> d(p7c p7cVar) {
            return new fi0(this.a, this);
        }
    }

    public static class c implements o2c<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // com.oplus.aiunit.vision.fi0.a
        public ft4<InputStream> a(AssetManager assetManager, String str) {
            return new yvi(assetManager, str);
        }

        @Override // com.oplus.aiunit.vision.o2c
        public void c() {
        }

        @Override // com.oplus.aiunit.vision.o2c
        @NonNull
        public n2c<Uri, InputStream> d(p7c p7cVar) {
            return new fi0(this.a, this);
        }
    }

    public fi0(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public n2c.a<Data> a(@NonNull Uri uri, int i, int i2, @NonNull erd erdVar) {
        return new n2c.a<>(new ebd(uri), this.b.a(this.a, uri.toString().substring(f11366c)));
    }

    @Override // com.oplus.aiunit.vision.n2c
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean b(@NonNull Uri uri) {
        return Const.Scheme.SCHEME_FILE.equals(uri.getScheme()) && !uri.getPathSegments().isEmpty() && j.ASSET_FILE_PATH_ROOT.equals(uri.getPathSegments().get(0));
    }
}
