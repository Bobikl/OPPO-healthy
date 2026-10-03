package com.heytap.health.device.second;

import com.heytap.wearable.devicemanager.bean.second.PairSecond;
import p010kotlin.Metadata;
import p010kotlin.jvm.functions.Function1;
import p010kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes16.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
public /* synthetic */ class SecondActivity$SecondFragment$getPhoneName$2$phoneName$1 extends FunctionReferenceImpl implements Function1<byte[], PairSecond.PhoneName> {
    public static final SecondActivity$SecondFragment$getPhoneName$2$phoneName$1 INSTANCE = new SecondActivity$SecondFragment$getPhoneName$2$phoneName$1();

    public SecondActivity$SecondFragment$getPhoneName$2$phoneName$1() {
        super(1, PairSecond.PhoneName.class, "parseFrom", "parseFrom([B)Lcom/heytap/wearable/devicemanager/bean/second/PairSecond$PhoneName;", 0);
    }

    @Override // p010kotlin.jvm.functions.Function1
    public final PairSecond.PhoneName invoke(byte[] bArr) {
        return PairSecond.PhoneName.parseFrom(bArr);
    }
}
