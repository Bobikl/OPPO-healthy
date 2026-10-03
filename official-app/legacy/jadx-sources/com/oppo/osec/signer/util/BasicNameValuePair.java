package com.oppo.osec.signer.util;

import com.heytap.store.base.core.http.HttpUtils;
import com.oplus.aiunit.vision.sec;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
class BasicNameValuePair implements sec, Cloneable, Serializable {
    public static final int HASH_OFFSET = 37;
    public static final int HASH_SEED = 17;
    private static final long serialVersionUID = 1;
    private final String name;
    private final String value;

    public BasicNameValuePair(String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("Name must not be null");
        }
        this.name = str;
        this.value = str2;
    }

    private static int hashCode(int i, int i2) {
        return (i * 37) + i2;
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sec)) {
            return false;
        }
        BasicNameValuePair basicNameValuePair = (BasicNameValuePair) obj;
        return this.name.equals(basicNameValuePair.name) && equals(this.value, basicNameValuePair.value);
    }

    @Override // com.oplus.aiunit.vision.sec
    public String getName() {
        return this.name;
    }

    @Override // com.oplus.aiunit.vision.sec
    public String getValue() {
        return this.value;
    }

    public String toString() {
        if (this.value == null) {
            return this.name;
        }
        StringBuilder sb = new StringBuilder(this.name.length() + 1 + this.value.length());
        sb.append(this.name);
        sb.append(HttpUtils.EQUAL_SIGN);
        sb.append(this.value);
        return sb.toString();
    }

    public int hashCode() {
        return hashCode(hashCode(17, this.name), this.value);
    }

    private static int hashCode(int i, Object obj) {
        return hashCode(i, obj != null ? obj.hashCode() : 0);
    }

    private static boolean equals(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }
}
