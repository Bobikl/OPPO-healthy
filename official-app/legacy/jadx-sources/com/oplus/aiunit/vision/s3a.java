package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes10.dex */
public abstract class s3a {

    public static class b extends s3a {
        public b() {
        }

        @Override // com.oplus.aiunit.vision.s3a
        @NonNull
        public String b(@NonNull String str) {
            return str;
        }
    }

    @NonNull
    public static s3a a() {
        return new b();
    }

    @NonNull
    public abstract String b(@NonNull String str);
}
