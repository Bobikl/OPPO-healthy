package com.oplus.aiunit.vision;

import com.heytap.voiceassistant.sdk.tts.constant.SpeechConstant;
import java.security.AccessControlException;
import java.security.AccessController;
import java.security.PrivilegedAction;
import java.util.Map;
import org.spongycastle.util.Strings;

/* JADX INFO: loaded from: classes11.dex */
public class wye {
    public static final ThreadLocal a = new ThreadLocal();

    public static class a implements PrivilegedAction {
        public final /* synthetic */ String a;

        public a(String str) {
            this.a = str;
        }

        @Override // java.security.PrivilegedAction
        public Object run() {
            Map map = (Map) wye.a.get();
            return map != null ? map.get(this.a) : System.getProperty(this.a);
        }
    }

    public static String b(String str) {
        return (String) AccessController.doPrivileged(new a(str));
    }

    public static boolean c(String str) {
        try {
            String strB = b(str);
            if (strB != null) {
                return SpeechConstant.TRUE_STR.equals(Strings.f(strB));
            }
        } catch (AccessControlException unused) {
        }
        return false;
    }
}
