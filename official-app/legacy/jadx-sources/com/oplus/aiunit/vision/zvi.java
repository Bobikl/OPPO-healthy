package com.oplus.aiunit.vision;

import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DataSource;
import com.heytap.log.formatter.LogFieldKey;
import com.oplus.pantaconnect.sdk.discovery.fusion.ServiceNodeBundleKeys;
import io.protostuff.MapSchema;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.NoWhenBranchMatchedException;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000 $2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\fB\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b\"\u0010#J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0005H\u0016J\b\u0010\t\u001a\u00020\u0007H\u0016J\b\u0010\n\u001a\u00020\u0007H\u0016J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00020\u000bH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016J\u0010\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0002J \u0010\u0013\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0005H\u0002J\u0018\u0010\u0014\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\b\u0000\u0012\u00020\u00020\u0005H\u0002R\u0014\u0010\u0017\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006%"}, d2 = {"Lcom/oplus/aiunit/vision/zvi;", "Lcom/oplus/aiunit/vision/ft4;", "Ljava/io/InputStream;", "Lcom/bumptech/glide/Priority;", "priority", "Lcom/oplus/aiunit/vision/ft4$a;", "callback", "", "f", "b", "cancel", "Ljava/lang/Class;", "a", "Lcom/bumptech/glide/load/DataSource;", "c", "", "url", "", "d", b2n.f, MapSchema.FIELD_NAME_ENTRY, "i", "Ljava/lang/String;", "model", "Ljava/net/HttpURLConnection;", "j", "Ljava/net/HttpURLConnection;", "connection", MapSchema.FIELD_NAME_KEY, "Ljava/io/InputStream;", "stream", LogFieldKey.LEVEL_KEY, "Z", "isLocalFile", "<init>", "(Ljava/lang/String;)V", "Companion", "health_archives_release"}, k = 1, mv = {1, 8, 0})
public final class zvi implements ft4<InputStream> {

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    @NotNull
    public final String model;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    @Nullable
    public HttpURLConnection connection;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    @Nullable
    public InputStream stream;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    public boolean isLocalFile;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Priority.values().length];
            try {
                iArr[Priority.IMMEDIATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Priority.HIGH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Priority.NORMAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Priority.LOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public zvi(@NotNull String model) {
        Intrinsics.checkNotNullParameter(model, "model");
        this.model = model;
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NotNull
    public Class<InputStream> a() {
        return InputStream.class;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.oplus.aiunit.vision.ft4
    public void b() {
        try {
            InputStream inputStream = this.stream;
            if (inputStream != null) {
                inputStream.close();
            }
        } catch (IOException unused) {
        } finally {
            this.stream = null;
        }
        if (this.isLocalFile) {
            return;
        }
        try {
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception unused2) {
        } finally {
            this.connection = null;
        }
    }

    @Override // com.oplus.aiunit.vision.ft4
    @NotNull
    public DataSource c() {
        return this.isLocalFile ? DataSource.LOCAL : DataSource.REMOTE;
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void cancel() {
        if (this.isLocalFile) {
            return;
        }
        try {
            HttpURLConnection httpURLConnection = this.connection;
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
        } catch (Exception unused) {
        }
    }

    public final boolean d(String url) {
        return StringsKt__StringsJVMKt.startsWith(url, "http://", true) || StringsKt__StringsJVMKt.startsWith(url, "https://", true);
    }

    public final void e(ft4.a<? super InputStream> callback) {
        String strSubstring;
        this.isLocalFile = true;
        if (StringsKt__StringsJVMKt.startsWith(this.model, "file://", true)) {
            strSubstring = this.model.substring(7);
            Intrinsics.checkNotNullExpressionValue(strSubstring, "substring(...)");
        } else {
            strSubstring = this.model;
        }
        File file = new File(strSubstring);
        if (!file.exists()) {
            callback.e(new IOException("File not found: " + strSubstring));
            return;
        }
        if (file.canRead()) {
            FileInputStream fileInputStream = new FileInputStream(file);
            this.stream = fileInputStream;
            callback.d(fileInputStream);
        } else {
            callback.e(new IOException("File not readable: " + strSubstring));
        }
    }

    @Override // com.oplus.aiunit.vision.ft4
    public void f(@NotNull Priority priority, @NotNull ft4.a<? super InputStream> callback) {
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(callback, "callback");
        try {
            if (d(this.model)) {
                g(priority, callback);
            } else {
                e(callback);
            }
        } catch (Exception e2) {
            a7b.c("StreamDataFetcher", "Failed to load data from: " + this.model, e2);
            callback.e(e2);
        }
    }

    public final void g(Priority priority, ft4.a<? super InputStream> callback) throws IOException {
        int i;
        boolean z = false;
        this.isLocalFile = false;
        URLConnection uRLConnectionOpenConnection = new URL(this.model).openConnection();
        Intrinsics.checkNotNull(uRLConnectionOpenConnection, "null cannot be cast to non-null type java.net.HttpURLConnection");
        HttpURLConnection httpURLConnection = (HttpURLConnection) uRLConnectionOpenConnection;
        int i2 = b.$EnumSwitchMapping$0[priority.ordinal()];
        if (i2 == 1) {
            i = 10000;
        } else if (i2 == 2) {
            i = 15000;
        } else if (i2 == 3) {
            i = 20000;
        } else {
            if (i2 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i = 25000;
        }
        httpURLConnection.setConnectTimeout(i);
        httpURLConnection.setReadTimeout(30000);
        httpURLConnection.setInstanceFollowRedirects(true);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setRequestProperty("Accept-Encoding", ServiceNodeBundleKeys.IDENTITY);
        httpURLConnection.setRequestProperty("User-Agent", "Health-Archives/1.0");
        this.connection = httpURLConnection;
        httpURLConnection.connect();
        HttpURLConnection httpURLConnection2 = this.connection;
        int responseCode = httpURLConnection2 != null ? httpURLConnection2.getResponseCode() : -1;
        if (200 <= responseCode && responseCode < 300) {
            z = true;
        }
        if (z) {
            HttpURLConnection httpURLConnection3 = this.connection;
            InputStream inputStream = httpURLConnection3 != null ? httpURLConnection3.getInputStream() : null;
            this.stream = inputStream;
            callback.d(inputStream);
            return;
        }
        HttpURLConnection httpURLConnection4 = this.connection;
        callback.e(new IOException("HTTP " + responseCode + ": " + (httpURLConnection4 != null ? httpURLConnection4.getResponseMessage() : null)));
    }
}
