package com.oplus.omes.srp.sysintegrity.cmm;

import androidx.annotation.Keep;
import com.oplus.aiunit.vision.lnm;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class BaseResponse {
    public static final int VERSION_V1 = 1;
    public Integer code;
    public String message;
    public int version;

    public int getCode() {
        return this.code.intValue();
    }

    public String getMessage() {
        return this.message;
    }

    public int getVersion() {
        return this.version;
    }

    public void setCode(int i) {
        this.code = Integer.valueOf(i);
    }

    public void setMessage(String str) {
        this.message = str;
    }

    public void setVersion(int i) {
        this.version = i;
    }

    public String toJson() {
        return lnm.c_a.toJson(this);
    }
}
