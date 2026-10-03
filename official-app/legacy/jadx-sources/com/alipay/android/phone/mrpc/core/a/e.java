package com.alipay.android.phone.mrpc.core.a;

import com.alipay.android.phone.mrpc.core.RpcException;
import com.oplus.aiunit.vision.dvm;
import java.util.ArrayList;
import java.util.Objects;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: loaded from: classes12.dex */
public final class e extends b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f548c;
    public Object d;

    public e(int i, String str, Object obj) {
        super(str, obj);
        this.f548c = i;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final void a(Object obj) {
        this.d = obj;
    }

    @Override // com.alipay.android.phone.mrpc.core.a.f
    public final byte[] a() {
        try {
            ArrayList arrayList = new ArrayList();
            if (this.d != null) {
                arrayList.add(new BasicNameValuePair("extParam", dvm.a(this.d)));
            }
            arrayList.add(new BasicNameValuePair("operationType", this.a));
            StringBuilder sb = new StringBuilder();
            sb.append(this.f548c);
            arrayList.add(new BasicNameValuePair("id", sb.toString()));
            Objects.toString(this.b);
            Object obj = this.b;
            arrayList.add(new BasicNameValuePair("requestData", obj == null ? "[]" : dvm.a(obj)));
            return URLEncodedUtils.format(arrayList, "utf-8").getBytes();
        } catch (Exception e2) {
            StringBuilder sb2 = new StringBuilder("request  =");
            sb2.append(this.b);
            sb2.append(":");
            sb2.append(e2);
            throw new RpcException(9, sb2.toString() == null ? "" : e2.getMessage(), e2);
        }
    }
}
