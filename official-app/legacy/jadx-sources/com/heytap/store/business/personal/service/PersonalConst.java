package com.heytap.store.business.personal.service;

import org.jetbrains.annotations.NotNull;
import p010kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lcom/heytap/store/business/personal/service/PersonalConst;", "", "()V", PersonalConst.EVENT_TYPE_AGREE, "", PersonalConst.EVENT_TYPE_RECALL, PersonalConst.EVENT_TYPE_RENEW, "SP_PRIVACY_POLICY_AGREE", "SP_PRIVACY_POLICY_RENEW", "personal-service_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PersonalConst {

    @NotNull
    public static final String EVENT_TYPE_AGREE = "EVENT_TYPE_AGREE";

    @NotNull
    public static final String EVENT_TYPE_RECALL = "EVENT_TYPE_RECALL";

    @NotNull
    public static final String EVENT_TYPE_RENEW = "EVENT_TYPE_RENEW";

    @NotNull
    public static final PersonalConst INSTANCE = new PersonalConst();

    @NotNull
    public static final String SP_PRIVACY_POLICY_AGREE = "privacy_policy_agree";

    @NotNull
    public static final String SP_PRIVACY_POLICY_RENEW = "privacy_policy_renew";

    private PersonalConst() {
    }
}
