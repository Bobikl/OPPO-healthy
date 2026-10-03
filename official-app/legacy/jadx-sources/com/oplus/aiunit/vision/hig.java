package com.oplus.aiunit.vision;

import android.content.Context;
import android.text.TextUtils;
import com.heytap.health.device_settings.impl.R$array;
import com.heytap.health.settings.watch.schoolmode.bean.AppItemBean;
import java.util.ArrayList;
import java.util.Comparator;

/* JADX INFO: loaded from: classes18.dex */
public class hig {
    public static final int DEFAULT_AM_END_TIME = 3072;
    public static final int DEFAULT_AM_START_TIME = 2048;
    public static final boolean DEFAULT_ENABLE = false;
    public static final int DEFAULT_PM_END_TIME = 4352;
    public static final int DEFAULT_PM_START_TIME = 3584;
    public static final int DEFAULT_REPEAT_TIME = 31;
    public static final int MAX_AM_TIME = 3072;
    public static final int MAX_PM_TIME = 5947;
    public static final int MIN_AM_TIME = 0;
    public static final int MIN_PM_TIME = 3073;

    public class a implements Comparator<AppItemBean> {
        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(AppItemBean appItemBean, AppItemBean appItemBean2) {
            int iB = b(appItemBean);
            int iB2 = b(appItemBean2);
            return iB2 == iB ? appItemBean.getLetter().compareTo(appItemBean2.getLetter()) : iB2 - iB;
        }

        public final int b(AppItemBean appItemBean) {
            int type = appItemBean.getType();
            if (type != 0) {
                if (type != 1) {
                    return type != 2 ? 0 : 2;
                }
                return 5;
            }
            if (appItemBean.isEnable()) {
                return appItemBean.isCanModify() ? 4 : 3;
            }
            return appItemBean.isCanModify() ? 1 : 0;
        }
    }

    public static Comparator<AppItemBean> a() {
        return new a();
    }

    public static int b(int i) {
        return (i >> 8) & 255;
    }

    public static int c(int i) {
        return i & 255;
    }

    public static boolean d(int i, int i2) {
        switch (i2) {
            case 0:
                return (i & 1) == 1;
            case 1:
                return (i & 2) == 2;
            case 2:
                return (i & 4) == 4;
            case 3:
                return (i & 8) == 8;
            case 4:
                return (i & 16) == 16;
            case 5:
                return (i & 32) == 32;
            case 6:
                return (i & 64) == 64;
            default:
                return false;
        }
    }

    public static String e(Context context, int i) {
        String[] stringArray = context.getResources().getStringArray(R$array.settings_weekday_list);
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        if ((i & 1) == 1) {
            arrayList.add(0);
        }
        if ((i & 2) == 2) {
            arrayList.add(1);
        }
        if ((i & 4) == 4) {
            arrayList.add(2);
        }
        if ((i & 8) == 8) {
            arrayList.add(3);
        }
        if ((i & 16) == 16) {
            arrayList.add(4);
        }
        if ((i & 32) == 32) {
            arrayList.add(5);
        }
        if ((i & 64) == 64) {
            arrayList.add(6);
        }
        String str = "";
        int i3 = -1;
        int i4 = -1;
        while (i2 < arrayList.size()) {
            int iIntValue = ((Integer) arrayList.get(i2)).intValue();
            if (i3 == -1) {
                String str2 = stringArray[iIntValue];
                if (TextUtils.isEmpty(str)) {
                    str = str + "" + str2;
                } else {
                    str = str + ", " + str2;
                }
            } else {
                int i5 = i3 + 1;
                if (iIntValue != i5 || i2 >= arrayList.size() - 1) {
                    if (i2 == arrayList.size() - 1 && iIntValue == i5) {
                        str = str + " - " + stringArray[iIntValue];
                    } else if (i3 != i4) {
                        str = str + " - " + stringArray[i3] + " , " + stringArray[iIntValue];
                    } else {
                        str = str + " , " + stringArray[iIntValue];
                    }
                }
                i2++;
                i3 = iIntValue;
            }
            i4 = iIntValue;
            i2++;
            i3 = iIntValue;
        }
        return str;
    }

    public static int f(int i, int i2) {
        return (i << 8) | i2;
    }

    public static int g(int i, int i2) {
        int i3;
        int i4 = (i >> 8) & 255;
        int i5 = i & 255;
        if (i2 > 0) {
            int i6 = i5 + i2;
            i4 += i6 / 60;
            i3 = i6 % 60;
        } else {
            int i7 = i5 + i2;
            if (i7 > 0) {
                i3 = i7;
            } else {
                i3 = i5 + i2 + 60;
                i4--;
            }
        }
        return i3 | (i4 << 8);
    }

    public static int h(int i, int i2) {
        return g(i, -i2);
    }

    public static String i(int i) {
        return b(i) + ":" + c(i);
    }
}
