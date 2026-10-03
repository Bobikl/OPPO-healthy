package com.oplus.aiunit.vision;

import android.net.Uri;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes19.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0012\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0006\u001a\u00020\u0002H\u0016R\u001c\u0010\r\u001a\n \n*\u0004\u0018\u00010\t0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lcom/oplus/aiunit/vision/yk9;", "Lcom/oplus/aiunit/vision/sz9;", "", "host", "", "verifyAsIpAddress", "url", "Lcom/oplus/aiunit/vision/mmk;", "parse", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "a", "Ljava/util/regex/Pattern;", "VERIFY_AS_IP_ADDRESS", "<init>", "()V", "com.heytap.nearx.httpdns"}, k = 1, mv = {1, 4, 0})
public final class yk9 implements sz9 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    public final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

    @Override // com.oplus.aiunit.vision.sz9
    @Nullable
    public UrlInfo parse(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Uri uri = Uri.parse(url);
            Intrinsics.checkNotNullExpressionValue(uri, "uri");
            return new UrlInfo(uri.getScheme(), uri.getUserInfo(), uri.getAuthority(), uri.getHost(), uri.getPort(), uri.getPathSegments(), uri.getQuery(), uri.getFragment(), uri.toString());
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.oplus.aiunit.vision.sz9
    public boolean verifyAsIpAddress(@NotNull String host) {
        Intrinsics.checkNotNullParameter(host, "host");
        return this.VERIFY_AS_IP_ADDRESS.matcher(host).matches();
    }
}
