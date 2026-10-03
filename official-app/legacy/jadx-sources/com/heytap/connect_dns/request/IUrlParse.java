package com.heytap.connect_dns.request;

import android.net.Uri;
import com.heytap.connect_dns.UrlInfo;
import java.util.regex.Pattern;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes13.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/heytap/connect_dns/request/IUrlParse;", "", "", "url", "Lcom/heytap/connect_dns/UrlInfo;", "parse", "(Ljava/lang/String;)Lcom/heytap/connect_dns/UrlInfo;", "host", "", "verifyAsIpAddress", "(Ljava/lang/String;)Z", "Companion", "connect_release"}, k = 1, mv = {1, 5, 1})
public interface IUrlParse {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/heytap/connect_dns/request/IUrlParse$Companion;", "", "Lcom/heytap/connect_dns/request/IUrlParse;", "DEFAULT", "Lcom/heytap/connect_dns/request/IUrlParse;", "getDEFAULT", "()Lcom/heytap/connect_dns/request/IUrlParse;", "<init>", "()V", "connect_release"}, k = 1, mv = {1, 5, 1})
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @NotNull
        private static final IUrlParse DEFAULT = new IUrlParse() { // from class: com.heytap.connect_dns.request.IUrlParse$Companion$DEFAULT$1
            private final Pattern VERIFY_AS_IP_ADDRESS = Pattern.compile("([0-9a-fA-F]*:[0-9a-fA-F:.]*)|([\\d.]+)");

            @Override // com.heytap.connect_dns.request.IUrlParse
            @Nullable
            public UrlInfo parse(@NotNull String url) {
                Intrinsics.checkNotNullParameter(url, "url");
                try {
                    Uri uri = Uri.parse(url);
                    return new UrlInfo(uri.getScheme(), uri.getUserInfo(), uri.getAuthority(), uri.getHost(), uri.getPort(), uri.getPathSegments(), uri.getQuery(), uri.getFragment(), uri.toString());
                } catch (Exception unused) {
                    return null;
                }
            }

            @Override // com.heytap.connect_dns.request.IUrlParse
            public boolean verifyAsIpAddress(@NotNull String host) {
                Intrinsics.checkNotNullParameter(host, "host");
                return this.VERIFY_AS_IP_ADDRESS.matcher(host).matches();
            }
        };

        private Companion() {
        }

        @NotNull
        public final IUrlParse getDEFAULT() {
            return DEFAULT;
        }
    }

    @Nullable
    UrlInfo parse(@NotNull String url);

    boolean verifyAsIpAddress(@NotNull String host);
}
