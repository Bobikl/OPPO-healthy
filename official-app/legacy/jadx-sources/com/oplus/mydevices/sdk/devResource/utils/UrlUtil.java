package com.oplus.mydevices.sdk.devResource.utils;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lcom/oplus/mydevices/sdk/devResource/utils/UrlUtil;", "", "()V", "DEBUG_BASE_URL_OAF", "", "RELEASE_BASE_URL_OAF", "TOKEN_VERIFY", "sdk_domesticRelease"}, k = 1, mv = {1, 4, 0})
public final class UrlUtil {

    @NotNull
    public static final String DEBUG_BASE_URL_OAF = "http://af-test.wanyol.com";
    public static final UrlUtil INSTANCE = new UrlUtil();

    @NotNull
    public static final String RELEASE_BASE_URL_OAF = "https://af-service-cn.allawntech.com";

    @NotNull
    public static final String TOKEN_VERIFY = "/update/v1";

    private UrlUtil() {
    }
}
