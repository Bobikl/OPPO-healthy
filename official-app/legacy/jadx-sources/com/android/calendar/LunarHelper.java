package com.android.calendar;

import android.content.Context;
import android.content.res.Resources;
import com.heytap.wearable.support.watchface.common.R;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes12.dex */
public class LunarHelper {
    private static final int ARMY_BUILD_DAY_INDEX = 5;
    private static final int MAX_MONTHS = 12;
    private static final int MAX_YEAR = 2099;
    private static final int MIN_YEAR = 1900;
    private static final int NATIONAL_DAY_INDEX = 8;
    private static final int PARTY_BUILD_DAY_INDEX = 4;
    private static final int YEAR_BEGIN = 1949;
    private static final int YEAR_BEGIN_1933 = 1933;
    private static final int YEAR_BEGIN_1938 = 1938;
    private static volatile LunarHelper sLunarHelper;
    private String[] mAnimals;
    private String[] mChineseDayTable;
    private String[] mChineseMonthTable;
    private String[] mEnglishMonth;
    private String[] mGan;
    private String[] mLeapMonth;
    private String[] mLunarFeastTable;
    private int[] mLunarInfo;
    private String[] mOtherFeastTable;
    private final Resources mResources;
    private String[] mSolarFeastTable;
    private String[] mSolarTermTable;
    private String[] mZhi;

    private LunarHelper(Context context) {
        Resources resources = context.getResources();
        this.mResources = resources;
        this.mLeapMonth = resources.getStringArray(R.array.chinese_leap_month);
        this.mAnimals = resources.getStringArray(R.array.chinese_animal_year);
        this.mGan = resources.getStringArray(R.array.chinese_tiangan);
        this.mZhi = resources.getStringArray(R.array.chinese_dizhi);
        this.mChineseMonthTable = resources.getStringArray(R.array.chinese_month_number);
        this.mChineseDayTable = resources.getStringArray(R.array.chinese_day_number);
        this.mEnglishMonth = resources.getStringArray(R.array.english_month_number);
        this.mLunarInfo = resources.getIntArray(R.array.lunar_info);
        loadCHS(resources);
    }

    private int adjustLunarMonth(int i, int i2) {
        if (i2 <= 0 || i2 >= 13) {
            return i;
        }
        int i3 = i2 + 1;
        if (i3 == i) {
            return i2 + 12;
        }
        return i > i3 ? i - 1 : i;
    }

    private int daysInLunarMonth(int i, int i2) {
        return (this.mLunarInfo[i + (-1900)] & (1048576 >> i2)) == 0 ? 29 : 30;
    }

    private int daysInLunarYear(int i) {
        int i2 = getLeapMonth(i) != 0 ? 377 : 348;
        int i3 = this.mLunarInfo[i - 1900] & 1048448;
        for (int i4 = 524288; i4 > 7; i4 >>= 1) {
            if ((i3 & i4) != 0) {
                i2++;
            }
        }
        return i2;
    }

    private String getAnimals(int i) {
        return this.mAnimals[(i - 4) % 12];
    }

    private String getChineseLunarDayString(int i) {
        return this.mChineseDayTable[i - 1];
    }

    private String getChineseLunarMonthString(int i) {
        if (i > 12) {
            i -= 12;
        }
        return this.mChineseMonthTable[i] + this.mLeapMonth[1];
    }

    private String getGanZhi(int i) {
        int i2 = (i - 1900) + 36;
        return this.mGan[i2 % 10] + this.mZhi[i2 % 12];
    }

    public static LunarHelper getInstance(Context context) {
        if (sLunarHelper == null) {
            synchronized (LunarHelper.class) {
                if (sLunarHelper == null) {
                    sLunarHelper = new LunarHelper(context);
                }
            }
        }
        return sLunarHelper;
    }

    private String getLeapLunarMonthString(int i, int i2) {
        if (i2 <= 0 || i2 >= 13 || i - 12 != i2) {
            return getChineseLunarMonthString(i);
        }
        return this.mLeapMonth[0] + getChineseLunarMonthString(i2);
    }

    private int getLeapMonth(int i) {
        return (this.mLunarInfo[i - 1900] & 15728640) >> 20;
    }

    private String getLunarFeast(int i, int i2, int i3) {
        int lunarFeast = CalendarFeast.getLunarFeast(i, i2, i3);
        if (lunarFeast < 0 || lunarFeast >= 11) {
            return null;
        }
        return this.mLunarFeastTable[lunarFeast];
    }

    private String getOtherSolarFeast(int i, int i2, int i3) {
        int otherSolarFeast = CalendarFeast.getOtherSolarFeast(i, i2, i3);
        if (otherSolarFeast < 0 || otherSolarFeast >= 6) {
            return null;
        }
        if (otherSolarFeast == 4) {
            if (YEAR_BEGIN_1938 <= i) {
                return this.mOtherFeastTable[otherSolarFeast];
            }
            return null;
        }
        if (otherSolarFeast != 5 || YEAR_BEGIN_1933 <= i) {
            return this.mOtherFeastTable[otherSolarFeast];
        }
        return null;
    }

    private String getSolarFeast(int i, int i2, int i3) {
        int solarFeast = CalendarFeast.getSolarFeast(i, i2, i3);
        if (solarFeast < 0 || solarFeast >= 11) {
            return null;
        }
        if (solarFeast != 8 || YEAR_BEGIN <= i) {
            return this.mSolarFeastTable[solarFeast];
        }
        return null;
    }

    private String getSolarTerm(int i, int i2, int i3) {
        int solarTerm = CalendarFeast.getSolarTerm(i, i2, i3);
        if (solarTerm < 0 || solarTerm >= 24) {
            return null;
        }
        return this.mSolarTermTable[solarTerm];
    }

    private void loadCHS(Resources resources) {
        this.mSolarTermTable = resources.getStringArray(R.array.solar_term);
        this.mSolarFeastTable = resources.getStringArray(R.array.solar_feast);
        this.mLunarFeastTable = resources.getStringArray(R.array.lunar_feast);
        this.mOtherFeastTable = resources.getStringArray(R.array.chinese_other_feast);
    }

    private void loadCHT(Resources resources) {
        this.mSolarTermTable = resources.getStringArray(R.array.solar_term_tw);
        this.mSolarFeastTable = resources.getStringArray(R.array.solar_feast_tw);
        this.mLunarFeastTable = resources.getStringArray(R.array.lunar_feast_tw);
        this.mOtherFeastTable = resources.getStringArray(R.array.chinese_other_feast_tw);
    }

    private int[] solarToLunar(int i, int i2, int i3) {
        int[] iArr = new int[3];
        int i4 = 1900;
        int iDaysInLunarMonth = 0;
        int time = (int) ((new GregorianCalendar(i, i2 - 1, i3).getTime().getTime() - new GregorianCalendar(1900, 0, 31).getTime().getTime()) / TimeUnit.DAYS.toMillis(1L));
        int iDaysInLunarYear = 0;
        while (i4 <= MAX_YEAR && time > 0) {
            iDaysInLunarYear = daysInLunarYear(i4);
            time -= iDaysInLunarYear;
            i4++;
        }
        if (time < 0) {
            time += iDaysInLunarYear;
            i4--;
        }
        iArr[0] = i4;
        int i5 = 1;
        while (i5 <= 13 && time > 0) {
            iDaysInLunarMonth = daysInLunarMonth(i4, i5);
            time -= iDaysInLunarMonth;
            i5++;
        }
        if (time < 0) {
            time += iDaysInLunarMonth;
            i5--;
        }
        iArr[1] = i5;
        iArr[2] = time + 1;
        return iArr;
    }

    public String[] getCurrentChineseStringArray(int i, int i2, int i3) {
        String[] feastStrings = getFeastStrings(i, i2, i3, false);
        ArrayList arrayList = new ArrayList();
        for (int i4 = 0; i4 < 4; i4++) {
            String str = feastStrings[i4];
            if (str != null) {
                arrayList.add(str);
            }
        }
        if (arrayList.size() == 0) {
            arrayList.add(feastStrings[4]);
        } else {
            arrayList.add("");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public String[] getFeastStrings(int i, int i2, int i3) {
        return getFeastStrings(i, i2, i3, true);
    }

    public String[] getFeastStringsForLauncher(int i, int i2, int i3, boolean z) {
        String[] strArr = new String[9];
        int[] iArrSolarToLunar = solarToLunar(i, i2, i3);
        int leapMonth = getLeapMonth(iArrSolarToLunar[0]);
        int iAdjustLunarMonth = adjustLunarMonth(iArrSolarToLunar[1], leapMonth);
        iArrSolarToLunar[1] = iAdjustLunarMonth;
        strArr[0] = getLunarFeast(iArrSolarToLunar[0], iAdjustLunarMonth, iArrSolarToLunar[2]);
        strArr[1] = getSolarFeast(i, i2, i3);
        strArr[2] = getOtherSolarFeast(i, i2, i3);
        strArr[3] = getSolarTerm(i, i2, i3);
        if (z) {
            strArr[4] = getChineseLunarDayString(iArrSolarToLunar[2]);
            strArr[5] = getLeapLunarMonthString(iArrSolarToLunar[1], leapMonth);
            strArr[6] = getAnimals(iArrSolarToLunar[0]);
            strArr[7] = getGanZhi(iArrSolarToLunar[0]);
        } else {
            strArr[4] = getChineseLunarDayString(iArrSolarToLunar[2]);
            strArr[5] = getChineseLunarMonthString(iArrSolarToLunar[1]);
        }
        return strArr;
    }

    public String getLunarMonthDayEnglisgString(int i, int i2, int i3) {
        String[] feastStrings = getFeastStrings(i, i2, i3, true);
        String string = feastStrings[4];
        String str = feastStrings[5];
        String string2 = this.mResources.getString(R.string.lunar_month);
        int i4 = 0;
        for (int i5 = 0; i5 < this.mChineseMonthTable.length; i5++) {
            if (str.equals(this.mChineseMonthTable[i5] + string2)) {
                str = this.mEnglishMonth[i5 - 1];
                break;
            }
        }
        while (true) {
            String[] strArr = this.mChineseDayTable;
            if (i4 >= strArr.length) {
                break;
            }
            if (string.equals(strArr[i4])) {
                string = Integer.toString(i4 + 1);
                break;
            }
            i4++;
        }
        return " " + str + " " + string;
    }

    public String getLunarMonthDayString(int i, int i2, int i3) {
        String[] feastStrings = getFeastStrings(i, i2, i3, true);
        String str = feastStrings[4];
        return feastStrings[5] + str;
    }

    public String[] getFeastStrings(int i, int i2, int i3, boolean z) {
        String[] strArr = {null, null, null, null, null, null, null, null, null};
        int[] iArrSolarToLunar = solarToLunar(i, i2, i3);
        int leapMonth = getLeapMonth(iArrSolarToLunar[0]);
        int iAdjustLunarMonth = adjustLunarMonth(iArrSolarToLunar[1], leapMonth);
        iArrSolarToLunar[1] = iAdjustLunarMonth;
        int i4 = iArrSolarToLunar[2];
        if (i4 == 1) {
            strArr[8] = "lunarFirstDay";
        }
        strArr[0] = getLunarFeast(iArrSolarToLunar[0], iAdjustLunarMonth, i4);
        strArr[1] = getSolarFeast(i, i2, i3);
        strArr[2] = getOtherSolarFeast(i, i2, i3);
        strArr[3] = getSolarTerm(i, i2, i3);
        if (z) {
            strArr[4] = getChineseLunarDayString(iArrSolarToLunar[2]);
            strArr[5] = getLeapLunarMonthString(iArrSolarToLunar[1], leapMonth);
            strArr[6] = getAnimals(iArrSolarToLunar[0]);
            strArr[7] = getGanZhi(iArrSolarToLunar[0]);
        } else {
            int i5 = iArrSolarToLunar[2];
            if (1 == i5) {
                strArr[4] = getLeapLunarMonthString(iArrSolarToLunar[1], leapMonth);
            } else {
                strArr[4] = getChineseLunarDayString(i5);
            }
            strArr[5] = getChineseLunarMonthString(iArrSolarToLunar[1]);
        }
        return strArr;
    }
}
