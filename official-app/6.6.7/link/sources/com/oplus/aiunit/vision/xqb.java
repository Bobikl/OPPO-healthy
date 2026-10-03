package com.oplus.aiunit.vision;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00022\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/oplus/aiunit/vision/xqb;", "", "Companion", "a", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
public final class xqb {
    public static final int HTTP_ERROR_BUSY = 6;
    public static final int HTTP_ERROR_IO = 5;
    public static final int HTTP_ERROR_NO_NETWORK = 1;
    public static final int HTTP_ERROR_NO_PERMISSION = 2;
    public static final int HTTP_REQUEST_DATA_ERROR = 3;
    public static final int HTTP_REQUEST_TIMEOUT = 4;
    public static final int HTTP_RESULT_OK = 200;
    public static final int HTTP_TYPE_CONNECT = 6;
    public static final int HTTP_TYPE_DELETE = 5;
    public static final int HTTP_TYPE_GET = 1;
    public static final int HTTP_TYPE_HEAD = 3;
    public static final int HTTP_TYPE_OPTIONS = 7;
    public static final int HTTP_TYPE_PATCH = 9;
    public static final int HTTP_TYPE_POST = 2;
    public static final int HTTP_TYPE_PUT = 4;
    public static final int HTTP_TYPE_TRACE = 8;

    @NotNull
    public static final String MCU_FILE_UPLOAD_URI_PREFIX = "btnet://httpproxy/file?reqid=";
    public static final int TYPE_HTTP_RESPONSE = 2;
    public static final int TYPE_PRE_REQUEST = 1;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int a = 101;
    public static final int b = 20;
    public static final int c = 22;

    /* JADX INFO: renamed from: com.oplus.aiunit.vision.xqb$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0018\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b \u0010!R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\u0007\u0010\u0004\u001a\u0004\b\b\u0010\u0006R\u001a\u0010\t\u001a\u00020\u00028\u0006X\u0086D¢\u0006\f\n\u0004\b\t\u0010\u0004\u001a\u0004\b\n\u0010\u0006R\u0014\u0010\u000b\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0014\u0010\f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0014\u0010\r\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0014\u0010\u000e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0014\u0010\u0010\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004R\u0014\u0010\u0011\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0004R\u0014\u0010\u0012\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0004R\u0014\u0010\u0013\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0004R\u0014\u0010\u0014\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0004R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u0004R\u0014\u0010\u0016\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0004R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0004R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0004R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0004R\u0014\u0010\u001a\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0004R\u0014\u0010\u001c\u001a\u00020\u001b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u0004R\u0014\u0010\u001f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001f\u0010\u0004¨\u0006\""}, d2 = {"Lcom/oplus/aiunit/vision/xqb$a;", "", "", "SERVICE_ID_MCU_NETWORK", "I", "c", "()I", "CMD_MCU_HTTP_PROXY", "b", "CMD_MCU_FILE_UPLOAD", "a", "HTTP_ERROR_BUSY", "HTTP_ERROR_IO", "HTTP_ERROR_NO_NETWORK", "HTTP_ERROR_NO_PERMISSION", "HTTP_REQUEST_DATA_ERROR", "HTTP_REQUEST_TIMEOUT", "HTTP_RESULT_OK", "HTTP_TYPE_CONNECT", "HTTP_TYPE_DELETE", "HTTP_TYPE_GET", "HTTP_TYPE_HEAD", "HTTP_TYPE_OPTIONS", "HTTP_TYPE_PATCH", "HTTP_TYPE_POST", "HTTP_TYPE_PUT", "HTTP_TYPE_TRACE", "", "MCU_FILE_UPLOAD_URI_PREFIX", "Ljava/lang/String;", "TYPE_HTTP_RESPONSE", "TYPE_PRE_REQUEST", "<init>", "()V", "device_btnet_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class Companion {
        public Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final int a() {
            return xqb.c;
        }

        public final int b() {
            return xqb.b;
        }

        public final int c() {
            return xqb.a;
        }
    }
}
