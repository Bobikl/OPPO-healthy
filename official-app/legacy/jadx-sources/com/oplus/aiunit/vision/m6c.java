package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import com.oplus.wearable.linkservice.sdk.common.MessageEvent;

/* JADX INFO: loaded from: classes16.dex */
public interface m6c {
    public static final int RESULT_FAIL = 2;
    public static final int RESULT_RESP_OK = 1;
    public static final int RESULT_TIMEOUT = 3;

    public static class a {
        public final int a;
        public final MessageEvent b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final MessageEvent f13961c;
        public String d;

        public a(int i, MessageEvent messageEvent, MessageEvent messageEvent2) {
            this.a = i;
            this.b = messageEvent;
            this.f13961c = messageEvent2;
        }

        public int a() {
            return this.a;
        }

        public String b() {
            int i = this.a;
            if (i == 1) {
                return "SUCCESS";
            }
            if (i == 2) {
                return "SEND_MSG_FAIL";
            }
            return i == 3 ? "WAIT_RESPONSE_MSG_TIMEOUT" : "";
        }

        public String c() {
            return this.d;
        }

        @NonNull
        public MessageEvent d() {
            return this.b;
        }

        public MessageEvent e() {
            return this.f13961c;
        }

        public boolean f() {
            return this.a == 1;
        }

        public boolean g() {
            return this.a == 3;
        }

        public void h(String str) {
            this.d = str;
        }

        public String toString() {
            return "MsgResult{code=" + this.a + ", respMsg=" + this.f13961c + '}';
        }
    }

    void f(a aVar);
}
