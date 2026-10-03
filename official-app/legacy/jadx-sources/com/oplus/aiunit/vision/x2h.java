package com.oplus.aiunit.vision;

import com.oppo.osec.signer.http.HttpMethodName;
import java.io.InputStream;
import java.net.URI;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class x2h implements w2h {
    public Map<String, String> a;
    public URI b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f18478c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f18479e;
    public InputStream f;
    public Map<String, List<String>> d = new HashMap();
    public String g = "OLD";

    public x2h(String str, String str2, String str3, Map<String, String> map, InputStream inputStream) {
        this.a = new HashMap();
        this.b = URI.create(str);
        this.f18478c = str2;
        this.f18479e = str3;
        this.a = map == null ? new HashMap<>() : map;
        this.f = inputStream;
    }

    @Override // com.oplus.aiunit.vision.o5a
    public Map<String, String> a() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.w2h
    public void b(String str) {
        this.g = str;
    }

    @Override // com.oplus.aiunit.vision.o5a
    public HttpMethodName c() {
        return HttpMethodName.fromValue(this.f18479e);
    }

    @Override // com.oplus.aiunit.vision.o5a
    public String d() {
        return this.f18478c;
    }

    @Override // com.oplus.aiunit.vision.o5a
    public InputStream e() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.w2h
    public String f() {
        return this.g;
    }

    @Override // com.oplus.aiunit.vision.w2h
    public void g(String str, String str2) {
        List<String> arrayList = new ArrayList<>();
        if (this.d.get(str) != null) {
            arrayList = this.d.get(str);
        }
        arrayList.add(str2);
        this.d.put(str, arrayList);
    }

    @Override // com.oplus.aiunit.vision.o5a
    public InputStream getContent() {
        return this.f;
    }

    @Override // com.oplus.aiunit.vision.o5a
    public Map<String, List<String>> getParameters() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.o5a
    public vbf h() {
        return null;
    }

    @Override // com.oplus.aiunit.vision.o5a
    public URI i() {
        return this.b;
    }
}
