package com.platform.usercenter.basic.core.mvvm;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.collection.ArrayMap;
import com.google.gson.JsonSyntaxException;
import com.oplus.aiunit.vision.xr2;
import com.oplus.aiunit.vision.ztf;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.io.IOException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import retrofit2.HttpException;

/* JADX INFO: loaded from: classes9.dex */
public class ApiResponse<T> {
    private static final String NEXT_LINK = "next";

    @Nullable
    private final T body;
    private final int code;

    @Nullable
    private final String errorMessage;

    @NonNull
    public final Map<String, String> links;
    private static final Pattern LINK_PATTERN = Pattern.compile("<([^>]*)>[\\s]*;[\\s]*rel=\"([a-zA-Z0-9]+)\"");
    private static final Pattern PAGE_PATTERN = Pattern.compile("\\bpage=(\\d+)");

    public ApiResponse(xr2<T> xr2Var, Throwable th) {
        if (th instanceof JsonSyntaxException) {
            if (th.getCause() instanceof NumberFormatException) {
                this.code = -1000;
            } else {
                this.code = -1004;
            }
        } else if (th instanceof HttpException) {
            this.code = ((HttpException) th).code();
        } else if (th instanceof SocketTimeoutException) {
            this.code = -1002;
        } else if (th instanceof ConnectException) {
            this.code = -1003;
        } else if (th instanceof UnknownHostException) {
            this.code = -1005;
        } else {
            this.code = -1001;
        }
        this.body = null;
        this.errorMessage = th.getMessage();
        this.links = Collections.emptyMap();
    }

    private String message(ztf<T> ztfVar) {
        if (ztfVar.e() == null) {
            return null;
        }
        try {
            return ztfVar.e().s();
        } catch (IOException e2) {
            UCLogUtil.e(e2.getMessage(), " error while parsing response");
            return null;
        }
    }

    @Nullable
    public T getBody() {
        return this.body;
    }

    public int getCode() {
        return this.code;
    }

    @Nullable
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public Integer getNextPage() {
        String str = this.links.get("next");
        if (str == null) {
            return null;
        }
        Matcher matcher = PAGE_PATTERN.matcher(str);
        if (matcher.find() && matcher.groupCount() == 1) {
            try {
                return Integer.valueOf(Integer.parseInt(matcher.group(1)));
            } catch (NumberFormatException unused) {
                UCLogUtil.w("cannot parse next page from %s", str);
            }
        }
        return null;
    }

    public boolean isSuccessful() {
        int i = this.code;
        return i >= 200 && i < 300;
    }

    public ApiResponse(xr2<T> xr2Var, ztf<T> ztfVar) {
        this.code = ztfVar.b();
        if (ztfVar.g()) {
            this.body = ztfVar.a();
            this.errorMessage = null;
        } else {
            String strMessage = ztfVar.e() != null ? message(ztfVar) : null;
            this.errorMessage = (strMessage == null || strMessage.trim().length() == 0) ? ztfVar.h() : strMessage;
            this.body = null;
        }
        String strA = ztfVar.f().a("link");
        if (strA == null) {
            this.links = Collections.emptyMap();
            return;
        }
        this.links = new ArrayMap();
        Matcher matcher = LINK_PATTERN.matcher(strA);
        while (matcher.find()) {
            if (matcher.groupCount() == 2) {
                this.links.put(matcher.group(2), matcher.group(1));
            }
        }
    }
}
