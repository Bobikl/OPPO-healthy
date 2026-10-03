package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class vre implements yq9 {
    public final String a;
    public final String b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f17966c;
    public final String d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map<String, String> f17967e;

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f17968c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map<String, String> f17969e;

        public vre f() {
            return new vre(this);
        }

        public b g(@NonNull String str, @NonNull String str2) {
            this.f17968c = str;
            this.d = str2;
            return this;
        }

        public b h(Map<String, String> map) {
            this.f17969e = map;
            return this;
        }

        public b i(String str) {
            this.a = str;
            return this;
        }

        public b j(@NonNull String str) {
            this.b = str;
            return this;
        }
    }

    public static b b(String str) {
        return new b().i("GET").j(str);
    }

    public static b c(String str) {
        return new b().i("POST").j(str);
    }

    @Override // com.oplus.aiunit.vision.yq9
    @NonNull
    public Map<String, String> a() {
        Map<String, String> map = this.f17967e;
        return map == null ? new HashMap(0) : map;
    }

    @Override // com.oplus.aiunit.vision.yq9
    public String getContent() {
        return this.f17966c;
    }

    @Override // com.oplus.aiunit.vision.yq9
    public String getContentType() {
        return this.d;
    }

    @Override // com.oplus.aiunit.vision.yq9
    @NonNull
    public String getMethod() {
        return this.a;
    }

    @Override // com.oplus.aiunit.vision.yq9
    @NonNull
    public String getUrl() {
        return this.b;
    }

    public vre(b bVar) {
        this.a = bVar.a;
        this.b = bVar.b;
        this.f17966c = bVar.f17968c;
        this.d = bVar.d;
        this.f17967e = bVar.f17969e;
    }
}
