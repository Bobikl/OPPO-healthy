package com.amap.api.col.p0003sl;

import com.amap.api.maps.AMapException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public final class ik extends Exception {
    private String a;
    private String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f740c;
    private String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f741e;
    private int f;
    private int g;
    private volatile boolean h;
    private String i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<String, List<String>> f742j;

    public ik(String str) {
        super(str);
        this.a = AMapException.ERROR_UNKNOWN;
        this.b = "";
        this.f740c = "";
        this.d = "1900";
        this.f741e = "UnknownError";
        this.f = -1;
        this.g = -1;
        this.h = false;
        this.a = str;
        if ("IO 操作异常 - IOException".equals(str)) {
            this.f = 21;
            this.d = "1902";
            this.f741e = "IOException";
        } else if (AMapException.ERROR_SOCKET.equals(str)) {
            this.f = 22;
        } else if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.f = 23;
            this.d = "1802";
            this.f741e = "SocketTimeoutException";
        } else if ("无效的参数 - IllegalArgumentException".equals(str)) {
            this.f = 24;
            this.d = "1901";
            this.f741e = "IllegalArgumentException";
        } else if ("空指针异常 - NullPointException".equals(str)) {
            this.f = 25;
            this.d = "1903";
            this.f741e = "NullPointException";
        } else if ("url异常 - MalformedURLException".equals(str)) {
            this.f = 26;
            this.d = "1803";
            this.f741e = "MalformedURLException";
        } else if ("未知主机 - UnKnowHostException".equals(str)) {
            this.f = 27;
            this.d = "1804";
            this.f741e = "UnknownHostException";
        } else if (AMapException.ERROR_UNKNOW_SERVICE.equals(str)) {
            this.f = 28;
            this.d = "1805";
            this.f741e = "CannotConnectToHostException";
        } else if ("协议解析错误 - ProtocolException".equals(str)) {
            this.f = 29;
            this.d = "1801";
            this.f741e = "ProtocolException";
        } else if (AMapException.ERROR_CONNECTION.equals(str)) {
            this.f = 30;
            this.d = "1806";
            this.f741e = "ConnectionException";
        } else if ("服务QPS超限".equalsIgnoreCase(str)) {
            this.f = 30;
            this.d = "2001";
            this.f741e = "ConnectionException";
        } else if (AMapException.ERROR_UNKNOWN.equals(str)) {
            this.f = 31;
        } else if (AMapException.ERROR_FAILURE_AUTH.equals(str)) {
            this.f = 32;
        } else if ("限制访问的接口".equals(str)) {
            this.f = 33;
        } else if ("requeust is null".equals(str)) {
            this.f = 1;
        } else if ("request url is empty".equals(str)) {
            this.f = 2;
        } else if ("response is null".equals(str)) {
            this.f = 3;
        } else if ("thread pool has exception".equals(str)) {
            this.f = 4;
        } else if ("sdk name is invalid".equals(str)) {
            this.f = 5;
        } else if ("sdk info is null".equals(str)) {
            this.f = 6;
        } else if ("sdk packages is null".equals(str)) {
            this.f = 7;
        } else if ("线程池为空".equals(str)) {
            this.f = 8;
        } else if ("获取对象错误".equals(str)) {
            this.f = 101;
        } else if ("DNS解析失败".equals(str)) {
            this.f = 3;
        } else {
            this.f = -1;
        }
        if ("IO 操作异常 - IOException".equals(str)) {
            this.g = 7;
            return;
        }
        if (AMapException.ERROR_SOCKET.equals(str)) {
            this.g = 6;
            return;
        }
        if ("socket 连接超时 - SocketTimeoutException".equals(str)) {
            this.g = 2;
            return;
        }
        if (!"未知主机 - UnKnowHostException".equals(str)) {
            if (AMapException.ERROR_CONNECTION.equals(str)) {
                this.g = 6;
                return;
            } else if (!AMapException.ERROR_UNKNOWN.equals(str) && "DNS解析失败".equals(str)) {
                this.g = 3;
                return;
            }
        }
        this.g = 9;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.d;
    }

    public final String c() {
        return this.f741e;
    }

    public final String d() {
        return this.b;
    }

    public final String e() {
        return this.f740c;
    }

    public final int f() {
        return this.f;
    }

    public final int g() {
        return this.g;
    }

    public final int h() {
        this.g = 10;
        return 10;
    }

    public final boolean i() {
        return this.h;
    }

    public final void j() {
        this.h = true;
    }

    public final void a(int i) {
        this.f = i;
    }

    public final void a(String str) {
        this.i = str;
    }

    public final void a(Map<String, List<String>> map) {
        this.f742j = map;
    }

    public ik(String str, String str2, String str3) {
        this(str);
        this.b = str2;
        this.f740c = str3;
    }
}
