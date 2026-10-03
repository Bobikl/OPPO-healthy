package com.heytap.store.message.service;

import com.heytap.health.operation.ecg.business.PdfViewActivity;
import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/heytap/store/message/service/MessageConst;", "", "()V", "CUST_MEDIUM", "", "CUST_MEDIUM_VALUE1", "CUST_MEDIUM_VALUE2", "CUST_MEDIUM_VALUE3", "CUST_MEDIUM_VALUE4", "CUST_MEDIUM_VALUE5", "CUST_MEDIUM_VALUE6", "CUST_ON_LINE_URL", "CUST_SOURCE", "CUST_SOURCE_VALUE1", "CUST_SOURCE_VALUE2", "CUST_SOURCE_VALUE3", "MESSAGE_COUNT", "MESSAGE_COUNT_PUSH", "PAGE_SOURCE", PdfViewActivity.SSOID, "TOKEN", "message-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class MessageConst {

    @NotNull
    public static final String CUST_MEDIUM = "cust_medium";

    @NotNull
    public static final String CUST_MEDIUM_VALUE1 = "shangxiangye";

    @NotNull
    public static final String CUST_MEDIUM_VALUE2 = "fuwuye";

    @NotNull
    public static final String CUST_MEDIUM_VALUE3 = "gerenzhongxin";

    @NotNull
    public static final String CUST_MEDIUM_VALUE4 = "jimu";

    @NotNull
    public static final String CUST_MEDIUM_VALUE5 = "dingdanxiangqing";

    @NotNull
    public static final String CUST_MEDIUM_VALUE6 = "xiaoxizhongxin";

    @NotNull
    public static final String CUST_ON_LINE_URL = "oppo.soboten.com";

    @NotNull
    public static final String CUST_SOURCE = "cust_source";

    @NotNull
    public static final String CUST_SOURCE_VALUE1 = "oppostore";

    @NotNull
    public static final String CUST_SOURCE_VALUE2 = "sdk";

    @NotNull
    public static final String CUST_SOURCE_VALUE3 = "oppocommunity";

    @NotNull
    public static final MessageConst INSTANCE = new MessageConst();

    @NotNull
    public static final String MESSAGE_COUNT = "mesage_count";

    @NotNull
    public static final String MESSAGE_COUNT_PUSH = "message_count_push";

    @NotNull
    public static final String PAGE_SOURCE = "page_source";

    @NotNull
    public static final String SSOID = "ssoid";

    @NotNull
    public static final String TOKEN = "token";

    private MessageConst() {
    }
}
