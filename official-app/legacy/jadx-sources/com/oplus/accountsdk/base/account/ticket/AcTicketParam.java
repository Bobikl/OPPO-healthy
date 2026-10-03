package com.oplus.accountsdk.base.account.ticket;

import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: loaded from: classes6.dex */
@Keep
public class AcTicketParam {

    @Nullable
    private final String appK;

    @Nullable
    private final String deviceId;

    @NonNull
    private final String guid;

    @NonNull
    private final String source;

    @NonNull
    private final String userToken;

    public static class b {
        public String a;
        public String b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f9106c;
        public String d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f9107e;

        public AcTicketParam f() {
            String str = this.d;
            if (str == null || str.isEmpty()) {
                throw new IllegalArgumentException("source is required");
            }
            String str2 = this.f9107e;
            if (str2 == null || str2.isEmpty()) {
                throw new IllegalArgumentException("guid is required");
            }
            return new AcTicketParam(this);
        }

        public b g(String str) {
            this.f9107e = str;
            return this;
        }

        public b h(String str) {
            this.a = str;
            return this;
        }

        public b i(String str) {
            this.f9106c = str;
            return this;
        }

        public b j(String str) {
            this.d = str;
            return this;
        }

        public b k(String str) {
            this.b = str;
            return this;
        }
    }

    public static b builder() {
        return new b();
    }

    @Nullable
    public String getAppK() {
        return this.appK;
    }

    @Nullable
    public String getDeviceId() {
        return this.deviceId;
    }

    @NonNull
    public String getGuid() {
        return this.guid;
    }

    @NonNull
    public String getSource() {
        return this.source;
    }

    @NonNull
    public String getUserToken() {
        return this.userToken;
    }

    private AcTicketParam(b bVar) {
        this.appK = bVar.a;
        this.userToken = bVar.b;
        this.deviceId = bVar.f9106c;
        this.source = bVar.d;
        this.guid = bVar.f9107e;
    }
}
