package com.heytap.health.appInitializer.store;

import android.text.TextUtils;
import androidx.annotation.Keep;
import androidx.annotation.Nullable;
import java.util.Objects;

/* JADX INFO: loaded from: classes15.dex */
@Keep
class Configuration {
    private String clazz_name;

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (TextUtils.isEmpty(this.clazz_name) || !(obj instanceof Configuration)) {
            return false;
        }
        return Objects.equals(this.clazz_name, ((Configuration) obj).clazz_name);
    }

    public String getClassName() {
        return this.clazz_name;
    }

    public int hashCode() {
        return !TextUtils.isEmpty(this.clazz_name) ? this.clazz_name.hashCode() : super.hashCode();
    }

    public void setClassName(String str) {
        this.clazz_name = str;
    }

    public String toString() {
        return "Configuration{clazz_name='" + this.clazz_name + "'}";
    }
}
