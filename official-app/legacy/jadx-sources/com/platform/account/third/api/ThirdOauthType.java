package com.platform.account.third.api;

import android.content.Context;
import com.oplus.aiunit.vision.hrk;
import com.oplus.aiunit.vision.j2e;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Init of enum field 'WEI_XIN' uses external variables
	at jadx.core.dex.visitors.EnumVisitor.createEnumFieldByConstructor(EnumVisitor.java:485)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByField(EnumVisitor.java:399)
	at jadx.core.dex.visitors.EnumVisitor.processEnumFieldByWrappedInsn(EnumVisitor.java:364)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromFilledArray(EnumVisitor.java:349)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:284)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInvoke(EnumVisitor.java:315)
	at jadx.core.dex.visitors.EnumVisitor.extractEnumFieldsFromInsn(EnumVisitor.java:288)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:153)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX INFO: loaded from: classes9.dex */
public class ThirdOauthType {
    public static final ThirdOauthType GG;
    public static final ThirdOauthType KOU_KOU;
    public static final ThirdOauthType WEI_XIN;
    public static final ThirdOauthType W_AUTH;
    int logoId;
    String text;
    public static final ThirdOauthType LN = new ThirdOauthType("LN", 2, 0, hrk.b("dafm"));
    public static final ThirdOauthType FB = new ThirdOauthType("FB", 3, 0, hrk.b("nikmjggc"));
    public static final ThirdOauthType MOBILE_CT = new ThirdOauthType("MOBILE_CT", 5, 0, "CT");
    public static final ThirdOauthType MOBILE_CM = new ThirdOauthType("MOBILE_CM", 6, 0, "CM");
    public static final ThirdOauthType MOBILE_CU = new ThirdOauthType("MOBILE_CU", 7, 0, "CU");
    public static final ThirdOauthType WB_CLOUD_FACE = new ThirdOauthType("WB_CLOUD_FACE", 8, 0, "wbCloudFace");
    private static final /* synthetic */ ThirdOauthType[] $VALUES = $values();

    private static /* synthetic */ ThirdOauthType[] $values() {
        return new ThirdOauthType[]{WEI_XIN, KOU_KOU, LN, FB, GG, MOBILE_CT, MOBILE_CM, MOBILE_CU, WB_CLOUD_FACE, W_AUTH};
    }

    static {
        int i = 0;
        WEI_XIN = new ThirdOauthType("WEI_XIN", i, i, hrk.b("\u007fmk`i|")) { // from class: com.platform.account.third.api.ThirdOauthType.1
            @Override // com.platform.account.third.api.ThirdOauthType
            public boolean isApkAvailable(Context context) {
                return context != null && hrk.c(context, j2e.PK_WX);
            }
        };
        KOU_KOU = new ThirdOauthType("KOU_KOU", 1, i, hrk.b("yy")) { // from class: com.platform.account.third.api.ThirdOauthType.2
            @Override // com.platform.account.third.api.ThirdOauthType
            public boolean isApkAvailable(Context context) {
                return context != null && hrk.c(context, j2e.PK_KOU_KOU);
            }
        };
        GG = new ThirdOauthType("GG", 4, i, hrk.b("oggodm")) { // from class: com.platform.account.third.api.ThirdOauthType.3
            @Override // com.platform.account.third.api.ThirdOauthType
            public boolean isApkAvailable(Context context) {
                return context != null && hrk.c(context, j2e.GG_PKG);
            }
        };
        W_AUTH = new ThirdOauthType("W_AUTH", 9, i, "wauth") { // from class: com.platform.account.third.api.ThirdOauthType.4
            @Override // com.platform.account.third.api.ThirdOauthType
            public boolean isApkAvailable(Context context) {
                return context != null && hrk.c(context, j2e.WAUTH_PACKAGE);
            }
        };
    }

    public static ThirdOauthType valueOf(String str) {
        return (ThirdOauthType) Enum.valueOf(ThirdOauthType.class, str);
    }

    public static ThirdOauthType[] values() {
        return (ThirdOauthType[]) $VALUES.clone();
    }

    public int getLogoId() {
        return this.logoId;
    }

    public String getText() {
        return this.text;
    }

    public boolean isApkAvailable(Context context) {
        return true;
    }

    public void setLogoId(int i) {
        this.logoId = i;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.text;
    }

    private ThirdOauthType(String str, int i, int i2, String str2) {
        super(str, i);
        this.logoId = i2;
        this.text = str2;
    }
}
