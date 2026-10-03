package com.heytap.usercenter.accountsdk.http;

import com.heytap.usercenter.accountsdk.AccountSDKConfig;
import com.platform.usercenter.basic.annotation.Host;
import com.platform.usercenter.basic.annotation.Keep;
import com.platform.usercenter.basic.annotation.NoSign;
import com.platform.usercenter.basic.annotation.Path;
import com.platform.usercenter.tools.algorithm.Base64Helper;
import com.platform.usercenter.tools.algorithm.XORUtils;
import com.platform.usercenter.tools.log.UCLogUtil;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes19.dex */
@Keep
@Deprecated
public abstract class UCBaseRequest {

    @NoSign
    private static final String HOST_PATH_FORMAT = "%s%s";

    public String getAnnotationUrl() {
        if (!(getClass().isAnnotationPresent(Host.class) && getClass().isAnnotationPresent(Path.class))) {
            throw new IllegalStateException("must make this class of annotations Host and Path");
        }
        Path path = (Path) getClass().getAnnotation(Path.class);
        Host host = (Host) getClass().getAnnotation(Host.class);
        if (AccountSDKConfig.sEnv == AccountSDKConfig.ENV.ENV_TEST_1) {
            return String.format(Locale.US, HOST_PATH_FORMAT, host.host_test1(), path.path());
        }
        if (AccountSDKConfig.sEnv == AccountSDKConfig.ENV.ENV_TEST_3) {
            return String.format(Locale.US, HOST_PATH_FORMAT, host.host_test3(), path.path());
        }
        return AccountSDKConfig.sEnv == AccountSDKConfig.ENV.ENV_DEV ? String.format(Locale.US, HOST_PATH_FORMAT, host.host_dev(), path.path()) : String.format(Locale.US, HOST_PATH_FORMAT, host.host_release(), path.path());
    }

    public String getRequestBody() {
        return toJsonString();
    }

    public abstract String getUrl();

    public final String toJsonString() {
        Object obj;
        JSONObject jSONObject = new JSONObject();
        for (Class<?> superclass = getClass(); superclass != Object.class; superclass = superclass.getSuperclass()) {
            for (Field field : superclass.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    field.setAccessible(true);
                    try {
                        obj = field.get(this);
                    } catch (IllegalAccessException e2) {
                        e2.printStackTrace();
                        obj = null;
                    } catch (IllegalArgumentException e3) {
                        e3.printStackTrace();
                        obj = null;
                    }
                    if (obj != null) {
                        try {
                            jSONObject.put(field.getName(), obj);
                        } catch (JSONException e4) {
                            e4.printStackTrace();
                        }
                    }
                }
            }
        }
        String string = jSONObject.toString();
        if (string != null && string.contains("\\/")) {
            string = string.replace("\\/", "/");
        }
        UCLogUtil.i("UCBaseRequest param toJson = " + XORUtils.encrypt(Base64Helper.base64Encode(string), 8));
        return string;
    }
}
