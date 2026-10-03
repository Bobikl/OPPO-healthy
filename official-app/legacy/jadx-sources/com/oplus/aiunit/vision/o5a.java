package com.oplus.aiunit.vision;

import com.oppo.osec.signer.http.HttpMethodName;
import java.io.InputStream;
import java.net.URI;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public interface o5a<T> {
    Map<String, String> a();

    HttpMethodName c();

    String d();

    InputStream e();

    InputStream getContent();

    Map<String, List<String>> getParameters();

    vbf h();

    URI i();
}
