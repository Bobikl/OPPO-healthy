package com.heytap.nearx.tangramconfig.util;

import com.heytap.nearx.tangramconfig.BuildConfig;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;
import p010kotlin.jvm.internal.DefaultConstructorMarker;
import p010kotlin.text.Regex;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0004"}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/PrintUtils;", "", "()V", "Companion", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PrintUtils {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final Regex OS_VERSION = new Regex("os_version=([^,]+)");

    @NotNull
    private static final Regex OS_VERSION_JSON = new Regex("\"([^\"]*os_version)\"\\s*:\\s*\"([^\"]+)\"");

    @NotNull
    private static final Regex OTA_VERSION = new Regex("ota_version=([^,]+)");

    @NotNull
    private static final Regex OTA_VERSION_JSON = new Regex("\"([^\"]*ota_version)\"\\s*:\\s*\"([^\"]+)\"");

    @NotNull
    private static final Regex URL_DOMAIN = new Regex("https?:\\\\?\\/\\\\?\\/+(?:[^\\/\\?:]+)(?=[\\/\\?:]|$)");

    @NotNull
    private static final Regex HOST_HTTP = new Regex("https?:\\\\?\\/\\\\?\\/");

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0011\u0010\u0007\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0011\u0010\t\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\u000b\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\r\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u000f\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0006¨\u0006\u0011"}, d2 = {"Lcom/heytap/nearx/tangramconfig/util/PrintUtils$Companion;", "", "()V", "HOST_HTTP", "Lkotlin/text/Regex;", "getHOST_HTTP", "()Lkotlin/text/Regex;", "OS_VERSION", "getOS_VERSION", "OS_VERSION_JSON", "getOS_VERSION_JSON", "OTA_VERSION", "getOTA_VERSION", "OTA_VERSION_JSON", "getOTA_VERSION_JSON", "URL_DOMAIN", "getURL_DOMAIN", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Regex getHOST_HTTP() {
            return PrintUtils.HOST_HTTP;
        }

        @NotNull
        public final Regex getOS_VERSION() {
            return PrintUtils.OS_VERSION;
        }

        @NotNull
        public final Regex getOS_VERSION_JSON() {
            return PrintUtils.OS_VERSION_JSON;
        }

        @NotNull
        public final Regex getOTA_VERSION() {
            return PrintUtils.OTA_VERSION;
        }

        @NotNull
        public final Regex getOTA_VERSION_JSON() {
            return PrintUtils.OTA_VERSION_JSON;
        }

        @NotNull
        public final Regex getURL_DOMAIN() {
            return PrintUtils.URL_DOMAIN;
        }
    }
}
