package com.oplus.instant.router.callback;

import android.database.Cursor;
import com.oplus.aiunit.vision.ium;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public abstract class Callback {

    public static class Response {
        public static final int DENIED = -8;
        public static final int FAIL = -4;
        public static final int SUCCESS = 1;
        public static final int UPDATE_CANCEL = -11;
        public static final String UPDATE_CANCEL_MESSAGE = "platform need update but user canceled";
        public static final int UPDATE_ERROR = -10;
        public static final String UPDATE_ERROR_MESSAGE = "platform need update but error occurred";
        public static final int UPDATE_SUCCESS = 10;
        public static final String UPDATE_SUCCESS_MESSAGE = "platform update success, please call request again";
        public int a;
        public String b;

        public int getCode() {
            return this.a;
        }

        public String getMsg() {
            return this.b;
        }

        public void setCode(int i) {
            this.a = i;
        }

        public void setMsg(String str) {
            this.b = str;
        }

        public String toString() {
            return this.a + "#" + this.b;
        }
    }

    public abstract void onResponse(Response response);

    public void onResponse(Map<String, Object> map, Cursor cursor) {
        String str;
        Object obj;
        Map<String, Object> mapB = ium.b(cursor);
        Response response = new Response();
        if (mapB == null || (obj = mapB.get("code")) == null) {
            response.a = -1;
            str = "fail to get response";
        } else {
            response.a = Long.valueOf(((Long) obj).longValue()).intValue();
            str = (String) mapB.get("msg");
        }
        response.b = str;
        onResponse(response);
    }
}
