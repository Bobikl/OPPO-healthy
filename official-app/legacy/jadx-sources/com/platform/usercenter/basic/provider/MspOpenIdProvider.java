package com.platform.usercenter.basic.provider;

/* JADX INFO: loaded from: classes9.dex */
public class MspOpenIdProvider implements IOpenIdProvider<OpenIdBean> {
    private final OpenIdBean mBean;

    private MspOpenIdProvider(OpenIdBean openIdBean) {
        this.mBean = openIdBean;
    }

    public static MspOpenIdProvider inject(OpenIdBean openIdBean) {
        return new MspOpenIdProvider(openIdBean);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.platform.usercenter.basic.provider.IOpenIdProvider
    public OpenIdBean create() {
        return this.mBean;
    }
}
