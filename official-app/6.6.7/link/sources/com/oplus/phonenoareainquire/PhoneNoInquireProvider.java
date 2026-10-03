package com.oplus.phonenoareainquire;

import android.annotation.SuppressLint;
import android.content.ContentProvider;
import android.content.ContentProviderOperation;
import android.content.ContentProviderResult;
import android.content.ContentUris;
import android.content.ContentValues;
import android.content.Context;
import android.content.OperationApplicationException;
import android.content.UriMatcher;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.i18n.phonenumbers.NumberParseException;
import com.google.i18n.phonenumbers.PhoneNumberUtil;
import com.google.i18n.phonenumbers.Phonenumber;
import com.heytap.health.watch.contact.netnumber.R;
import com.oplus.aiunit.vision.bs8;
import com.oplus.aiunit.vision.cke;
import com.oplus.aiunit.vision.d14;
import com.oplus.aiunit.vision.d97;
import com.oplus.aiunit.vision.dke;
import com.oplus.aiunit.vision.eke;
import com.oplus.aiunit.vision.g3e;
import com.oplus.aiunit.vision.gqe;
import com.oplus.aiunit.vision.lb4;
import com.oplus.aiunit.vision.m08;
import com.oplus.aiunit.vision.mb4;
import com.oplus.aiunit.vision.roj;
import com.oplus.aiunit.vision.x5b;
import com.oplus.aiunit.vision.xje;
import com.oplus.os.OplusBuild;
import com.oplus.phonenoareainquire.utils.SelfHealUtil;
import com.oplus.smartenginehelper.ParserTag;
import com.oplus.utrace.lib.NodeIDKt;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class PhoneNoInquireProvider extends ContentProvider {
    public static final String AREANO = "areano";
    private static final int AREANO_AND_CITYNAMES = 1;
    private static final int AREANO_AND_CITYNAMES_ID = 2;
    public static final Uri AREANO_AND_CITYNAMEURI;
    private static final String AREANO_OTHER = "1";
    private static final String AREANO_OTHER_TITLE;
    public static final String AUTHORITY = "health_inquirenoarea";
    private static final int BACKGROUND_TASK_INIT = 1;
    private static final int BACKGROUND_TASK_UPDATE_LOCALE = 0;
    public static final String CHARACTERS = "'q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M'";
    public static final String CITYNAME = "cityname";
    public static final Uri CONTENT_URI;
    public static final int COUNTRY_CODE_US = 1;
    public static final String COUNTRY_ISO_US = "US";
    private static final int COUNTRY_LIST = 9;
    protected static boolean DEBUG = false;
    public static final String GROUP_MEMBER_COUNT = "member_count";
    private static final int INTERNATIONAL_PHONE_NUNBER = 6;
    public static final String[] IPCALL_PREFIX;
    public static final String IS_NEED_CARRIER_NAME_KEY = "is_need_carrier_name";
    public static final String KEY_FORCE_QUERY_DOMESTIC = "force_query_domestic";
    public static final String KEY_IS_DOMESTIC_SIM = "is_domestic_sim";
    public static final String KEY_IS_ROAM = "is_roam";
    public static final String LOCALE_US = "US";
    private static final int LOCATION_GROUPS = 11;
    public static final String NEED_CARRIERNAME_IF_NO_CITYNAME = "need_carriername_if_no_cityname";
    public static final String NEED_PHONE_NUMBER = "need_number";
    public static final int OPLUSOS_11_3 = 22;
    private static final int PHONE_NUMBERS = 8;
    private static final Executor PHONE_NUMBER_DATA_EXECUTOR;
    private static final int PHONE_NUNBER = 0;
    private static final String PLUS_CHARS = "+＋";
    private static final Pattern PLUS_ZERO_CHARS_PATTERN;
    private static final int PROVINCE_AND_CITY = 7;
    private static final String QUERY_ALL_DATA = "query_all_data";
    private static final int QUERY_COUNTRY_LIST_WAIT_TIME = 1000;
    private static final String QUERY_ERROR_DB_NULL = "mDb is null";
    public static final String TABLE_VERSION_NAME = "version";
    private static final String TAG = "PhoneNoProvider";
    private static final String UNKNOWN_NUMBER_COUNTRY_CODE = "unknown_number_country_code";
    private static final UriMatcher URI_MATCHER;
    public static final String VER = "ver";
    private static final int VERSION = 5;
    public static final int VERSION_LENGTH = 12;
    public static String sDataFilePath;
    public static String sExtendNumberFile;
    public static PhoneNoInquireProvider sInstace;
    public static String sMultiLanguageTableFile;
    public static String sNameMappingFile;
    public static String sOriginalResourceFile;
    public static String sPortedNumberFile;
    public static String sProvinceCityRelationCity;
    public static String sResourceFile;
    public boolean VERSION_CN;
    private ArrayList<String> mAccessCodeList;
    private Handler mBackgroundHandler;
    private byte[] mCityData;
    private HashMap<String, Integer> mExtendNumberInfo;
    private ArrayList<String> mExtendNumberList;
    private volatile CountDownLatch mInitializationLatch;
    private Locale mLocale;
    private com.oplus.phonenoareainquire.b mLocationCache;
    private dke mPhoneNumberOfflineGeocoder;
    private PhoneNumberUtil mPhoneNumberUtil;
    private ArrayList<String> numList;
    private HashMap<String, Integer> numOffest;
    public xje mDbHelper = null;
    private SQLiteDatabase mDb = null;
    private String mPhoneNo = null;
    private boolean mUnSupportAttribution = false;

    public class a extends HandlerThread {
        public a(String str, int i) {
            super(str, i);
        }

        @Override // android.os.HandlerThread, java.lang.Thread, java.lang.Runnable
        public void run() {
            g3e.a(PhoneNoInquireProvider.TAG, "ContactsProviderWorker is running");
            super.run();
        }
    }

    public class b implements Runnable {
        public final /* synthetic */ DataInputStream i;

        public b(DataInputStream dataInputStream) {
            this.i = dataInputStream;
        }

        @Override // java.lang.Runnable
        public void run() {
            StringBuilder sb;
            InputStream inputStreamB;
            try {
                try {
                    String strA = x5b.a();
                    if (x5b.c(strA)) {
                        strA = "US";
                    }
                    byte[] bArr = new byte[2000];
                    byte[] bArr2 = new byte[8000];
                    this.i.skip(this.i.available() - 12002);
                    this.i.read(new byte[2]);
                    this.i.read(bArr);
                    this.i.read(bArr2);
                    this.i.read(new byte[2000]);
                    try {
                        inputStreamB = com.oplus.phonenoareainquire.c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile);
                    } catch (Exception e) {
                        try {
                            inputStreamB = com.oplus.phonenoareainquire.c.b("Multi_Language_Table.txt", PhoneNoInquireProvider.sMultiLanguageTableFile);
                        } catch (Exception e2) {
                            g3e.b(PhoneNoInquireProvider.TAG, "e = " + e2);
                            inputStreamB = null;
                        }
                        g3e.b(PhoneNoInquireProvider.TAG, "e = " + e);
                    }
                    HashMap map = new HashMap();
                    int i = 0;
                    if (inputStreamB != null) {
                        InputStreamReader inputStreamReader = new InputStreamReader(inputStreamB);
                        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                        boolean z = true;
                        boolean z2 = false;
                        int i2 = 1;
                        while (true) {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null || line.trim().length() <= 0) {
                                    break;
                                    break;
                                }
                                String strTrim = line.trim();
                                if (strTrim.length() <= 0) {
                                    break;
                                }
                                if (z2) {
                                    String[] strArrSplit = strTrim.split("\t");
                                    map.put(strArrSplit[0], strArrSplit[i2]);
                                } else {
                                    String[] strArrSplit2 = strTrim.split("\t");
                                    for (int i3 = 1; i3 < strArrSplit2.length; i3++) {
                                        if (strArrSplit2[i3].equals(strA)) {
                                            i2 = i3;
                                        }
                                    }
                                    z2 = true;
                                }
                            } catch (Exception e3) {
                                g3e.b(PhoneNoInquireProvider.TAG, "e = " + e3);
                            }
                        }
                        z = false;
                        inputStreamReader.close();
                        bufferedReader.close();
                        if (z || map.size() <= 10) {
                            SelfHealUtil.e(PhoneNoInquireProvider.this.getContext());
                        }
                    }
                    while (i < 400) {
                        String strTrim2 = new String(bArr, i * 5, 5).trim();
                        String strTrim3 = new String(bArr2, i * 20, 20, "gbk").trim();
                        if (strTrim2.equals("") && strTrim3.equals("")) {
                            break;
                        }
                        i++;
                        String strValueOf = String.valueOf(i);
                        com.oplus.phonenoareainquire.b bVarC = com.oplus.phonenoareainquire.b.c();
                        if (map.get(strValueOf) != null) {
                            strTrim3 = (String) map.get(strValueOf);
                        }
                        bVarC.d(strValueOf, strTrim3, strTrim2);
                    }
                    try {
                        if (this.i != null) {
                        }
                    } catch (Exception e4) {
                        e = e4;
                        sb = new StringBuilder();
                        sb.append("");
                        sb.append(e);
                        String string = sb.toString();
                    }
                } finally {
                    try {
                        DataInputStream dataInputStream = this.i;
                        if (dataInputStream != null) {
                            dataInputStream.close();
                        }
                    } catch (Exception e5) {
                        g3e.b(PhoneNoInquireProvider.TAG, "" + e5);
                    }
                    SelfHealUtil.d();
                }
            } catch (Exception e6) {
                g3e.b(PhoneNoInquireProvider.TAG, "" + e6);
                try {
                    if (this.i != null) {
                    }
                } catch (Exception e7) {
                    e = e7;
                    sb = new StringBuilder();
                    sb.append("");
                    sb.append(e);
                    String string2 = sb.toString();
                }
            }
        }
    }

    public class c extends Handler {
        public c(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            PhoneNoInquireProvider.this.performBackgroundTask(message.what);
        }
    }

    static {
        Uri uri = Uri.parse("content://health_inquirenoarea");
        CONTENT_URI = uri;
        AREANO_AND_CITYNAMEURI = Uri.parse(uri + "/areano_and_citynames");
        IPCALL_PREFIX = new String[]{"17951", "12593", "125831", "125832", "125833", "+86125831", "+86125832", "+86125833", "0086125831", "0086125832", "0086125833", "17910", "17911", "10193", "10131", "96531", "17900", "17901", "17909", "11808"};
        UriMatcher uriMatcher = new UriMatcher(-1);
        URI_MATCHER = uriMatcher;
        AREANO_OTHER_TITLE = null;
        PLUS_ZERO_CHARS_PATTERN = Pattern.compile("^(0{2})|^[+＋]+");
        PHONE_NUMBER_DATA_EXECUTOR = bs8.f();
        sInstace = null;
        uriMatcher.addURI(AUTHORITY, "phoneno/*", 0);
        uriMatcher.addURI(AUTHORITY, "areano_and_citynames", 1);
        uriMatcher.addURI(AUTHORITY, "areano_and_citynames/#", 2);
        uriMatcher.addURI(AUTHORITY, "version", 5);
        uriMatcher.addURI(AUTHORITY, "international_phoneno/*", 6);
        uriMatcher.addURI(AUTHORITY, "province_and_city/", 7);
        uriMatcher.addURI(AUTHORITY, "oppo_location_groups/", 11);
        uriMatcher.addURI(AUTHORITY, "location_groups/", 11);
        uriMatcher.addURI(AUTHORITY, "phone_numbers", 8);
        uriMatcher.addURI(AUTHORITY, "country_list", 9);
    }

    private String addChina(String str, String str2) {
        String strB;
        if (TextUtils.isEmpty(str2)) {
            return str2;
        }
        if (this.VERSION_CN) {
            Locale locale = Locale.getDefault();
            strB = locale.getLanguage() + "_" + locale.getCountry();
        } else {
            strB = x5b.b();
        }
        g3e.a(TAG, "addChina " + strB);
        return mb4.h(str2, strB, this.VERSION_CN);
    }

    private void appendAreaAsDisplayName(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        this.mDbHelper.getWritableDatabase().execSQL("INSERT OR REPLACE INTO area_presence_db.presence_numbers_table(_id ,display_name ,data1 ,phonebook_bucket ,_index ,cityname ,photo_id ,areano) VALUES (?, ?, ?, ?, ?, ?, ?, ?)", new String[]{str, str2, str3, str4, str5, str6, str8, str7});
    }

    private void backgroundInit() {
        try {
            PhoneNoInquireProviderTransaction.INSTANCE.a();
            this.mDb = this.mDbHelper.getReadableDatabase();
            gqe.c(getContext().getAssets().open("PortabilityNumberData.dat"));
            g3e.a(TAG, "background init finished");
        } catch (Throwable th) {
            g3e.b(TAG, "Exception when copy portability number file to data dir " + th);
        }
    }

    private InputStream cache(InputStream inputStream) throws IOException {
        int iAvailable = inputStream.available();
        byte[] bArr = new byte[iAvailable];
        int i = 0;
        while (i < iAvailable) {
            i += inputStream.read(bArr, i, iAvailable - i);
        }
        return new ByteArrayInputStream(bArr);
    }

    private String[] findLocationAsCountry(String str, String str2) {
        String str3 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] strArr = {"", ""};
        Phonenumber.PhoneNumber phoneNumber = parsePhoneNumber(str, str2);
        String geocodedLocationFor = getGeocodedLocationFor(phoneNumber);
        if (TextUtils.isEmpty(geocodedLocationFor)) {
            return null;
        }
        String strAddChina = addChina(str2, geocodedLocationFor);
        if (!TextUtils.isEmpty(strAddChina) && phoneNumber != null) {
            str3 = "-" + phoneNumber.getCountryCode();
        }
        strArr[0] = str3;
        strArr[1] = strAddChina;
        return strArr;
    }

    private String formatNumberNotRemovePrefix(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        if (str.contains(" ")) {
            str = str.replace(" ", "");
        }
        if (str.contains("-")) {
            str = str.replace("-", "");
        }
        if (str.contains("(")) {
            str = str.replace("(", "");
        }
        return str.contains(")") ? str.replace(")", "") : str;
    }

    public static ArrayList<String> getAccessCodeList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("001");
        arrayList.add("002");
        return arrayList;
    }

    private int getCountryCode(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        try {
            Phonenumber.PhoneNumber andKeepRawInput = PhoneNumberUtil.getInstance().parseAndKeepRawInput(str, str2);
            if (andKeepRawInput == null) {
                return -1;
            }
            if (!str.startsWith("00") && andKeepRawInput.getCountryCodeSource() == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD) {
                return -1;
            }
            int countryCode = andKeepRawInput.getCountryCode();
            return countryCode;
        } catch (NumberParseException e) {
            g3e.b(TAG, "getCountryCode error " + e.getMessage());
            return -1;
        }
    }

    private String getCountryCodeOfNumber(String str, String str2) {
        return getCountryCodeOfNumber(str, str2, false);
    }

    private String getCurrentCountryIso() {
        return lb4.b(getContext()).a();
    }

    public static String getDataFilePath() {
        return sDataFilePath;
    }

    private Cursor getGeocodedLocationCursor(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getCurrentCountryIso();
        }
        if (DEBUG) {
            g3e.a(TAG, "number = " + logGarbleMiddle(str) + ", countryIso = " + str2);
        }
        Phonenumber.PhoneNumber phoneNumber = parsePhoneNumber(str, str2);
        String geocodedLocationFor = getGeocodedLocationFor(phoneNumber);
        if (!TextUtils.isEmpty(geocodedLocationFor)) {
            if (geocodedLocationFor.equals("Cina")) {
                geocodedLocationFor = "China";
            } else if (geocodedLocationFor.startsWith("Nam D") && geocodedLocationFor.endsWith("ng")) {
                geocodedLocationFor = "Indonesia";
            }
            geocodedLocationFor = addChina(getCountryCodeOfNumber(str, str2), geocodedLocationFor);
        }
        if (!TextUtils.isEmpty(geocodedLocationFor)) {
            String specialId = getSpecialId(str, str2);
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", AREANO, CITYNAME}, 1);
            matrixCursor.addRow(new String[]{NodeIDKt.DEFAULT_SPAN_NAME, specialId, geocodedLocationFor});
            return matrixCursor;
        }
        if (TextUtils.equals(str2, gqe.DEFAULT_LANGUAGE) || TextUtils.equals(str2, "HK") || TextUtils.equals(str2, "MO") || TextUtils.equals(str2, mb4.TW_ISO)) {
            int countryCode = phoneNumber != null ? phoneNumber.getCountryCode() : 0;
            if (countryCode != 86 && countryCode != 852 && countryCode != 853 && countryCode != 886 && countryCode != 0) {
                MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{"_id", AREANO, CITYNAME}, 1);
                matrixCursor2.addRow(new String[]{NodeIDKt.DEFAULT_SPAN_NAME, "-4", geocodedLocationFor});
                return matrixCursor2;
            }
        }
        return null;
    }

    private synchronized dke getPhoneNumberOfflineGeocoder() {
        if (this.mPhoneNumberOfflineGeocoder == null) {
            this.mPhoneNumberOfflineGeocoder = dke.d();
        }
        return this.mPhoneNumberOfflineGeocoder;
    }

    private synchronized PhoneNumberUtil getPhoneNumberUtil() {
        if (this.mPhoneNumberUtil == null) {
            this.mPhoneNumberUtil = PhoneNumberUtil.getInstance();
        }
        return this.mPhoneNumberUtil;
    }

    public static ArrayList<String> getPre() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("+86");
        arrayList.add("0086");
        return arrayList;
    }

    private static String getRegionDisplayName(String str, Locale locale) {
        return (str == null || str.equals("ZZ") || str.equals("001")) ? "" : new Locale("", str).getDisplayCountry(locale);
    }

    private String getShortNumberLocation(String str) {
        int length = str.length();
        if ((str.startsWith("2") || str.startsWith("3") || str.startsWith("5") || str.startsWith("7") || str.startsWith("8")) && length >= 3 && length <= 5) {
            return "1";
        }
        if (!str.startsWith("6") || length < 3 || length > 6) {
            return null;
        }
        return "1";
    }

    private String getSpecialId(String str, String str2) {
        int countryCode = getCountryCode(str, str2);
        if (countryCode == 852) {
            return NodeIDKt.DEFAULT_SPAN_NAME;
        }
        if (countryCode == 853) {
            return "-2";
        }
        return countryCode == 886 ? "-3" : "-4";
    }

    private static boolean isTWRegion() {
        return OplusBuild.getOplusOSVERSION() <= 22 ? mb4.TW_ISO.equals(roj.a("ro.vendor.oplus.regionmark", gqe.DEFAULT_LANGUAGE)) : mb4.TW_ISO.equals(d97.a());
    }

    private String logGarbleMiddle(String str) {
        if (TextUtils.isEmpty(str) || str.length() < 2) {
            return str;
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder();
        if (length > 7) {
            sb.append(str.substring(0, 3));
            sb.append("****");
            sb.append(str.substring(length - 4));
            return sb.toString();
        }
        if (length <= 2) {
            sb.append(str.charAt(0));
            sb.append("*");
            return sb.toString();
        }
        sb.append(str.charAt(0));
        sb.append("****");
        sb.append(str.substring(length - 1));
        return sb.toString();
    }

    private Phonenumber.PhoneNumber parsePhoneNumber(String str, String str2) {
        try {
            return getPhoneNumberUtil().parse(str, str2);
        } catch (NumberParseException unused) {
            return null;
        }
    }

    private String removeIpPrefixIfNeed(String str, String str2) {
        if (TextUtils.isEmpty(str) || !TextUtils.equals(str2, gqe.DEFAULT_LANGUAGE)) {
            return str;
        }
        for (String str3 : IPCALL_PREFIX) {
            if (str.startsWith(str3)) {
                return str.substring(str3.length());
            }
        }
        return str;
    }

    public static void setDataFilePath(String str) {
        sDataFilePath = str;
        sOriginalResourceFile = sDataFilePath + "PhoneNumberData_Revert.dat";
        sResourceFile = sDataFilePath + "PhoneNumberData_3_1_0.dat";
        sExtendNumberFile = sDataFilePath + "ExtendNumber.dat";
        sProvinceCityRelationCity = sDataFilePath + "city_name_table.txt";
        sMultiLanguageTableFile = sDataFilePath + "Multi_Language_Table.txt";
        sPortedNumberFile = sDataFilePath + "PortabilityNumberData.dat";
        sNameMappingFile = sDataFilePath + "CountryNameMappingFile.dat";
    }

    private void updateLocaleTask() {
        SQLiteDatabase writableDatabase = this.mDbHelper.getWritableDatabase();
        boolean zEquals = true;
        try {
            Cursor cursorRawQuery = writableDatabase.rawQuery("SELECT locale FROM android_metadata ORDER BY locale DESC LIMIT 1", null);
            try {
                if (cursorRawQuery.getCount() > 0) {
                    cursorRawQuery.moveToFirst();
                    String string = cursorRawQuery.getString(0);
                    String string2 = Locale.getDefault().toString();
                    g3e.a(TAG, string2 + "  " + string);
                    zEquals = true ^ TextUtils.equals(string2, string);
                }
                cursorRawQuery.close();
            } catch (Throwable th) {
                if (cursorRawQuery != null) {
                    try {
                        cursorRawQuery.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (Exception e) {
            g3e.b(TAG, "updateLocaleTask : " + e);
        }
        if (zEquals) {
            try {
                writableDatabase.setLocale(Locale.getDefault());
            } catch (Exception e2) {
                g3e.b(TAG, "Exception when setLocale " + e2);
            }
        }
        try {
            gqe.h();
        } catch (Throwable th3) {
            g3e.b(TAG, "Exception when init PortabilityNumbersUtil " + th3);
        }
        g3e.a(TAG, "updateLocaleTask run finished");
    }

    @Override // android.content.ContentProvider
    public ContentProviderResult[] applyBatch(ArrayList<ContentProviderOperation> arrayList) throws OperationApplicationException {
        SQLiteDatabase writableDatabase = this.mDbHelper.getWritableDatabase();
        writableDatabase.beginTransaction();
        try {
            ContentProviderResult[] contentProviderResultArrApplyBatch = super.applyBatch(arrayList);
            writableDatabase.setTransactionSuccessful();
            return contentProviderResultArrApplyBatch;
        } finally {
            writableDatabase.endTransaction();
        }
    }

    @Override // android.content.ContentProvider
    public Bundle call(String str, String str2, Bundle bundle) {
        if (xje.METHOD_REFRESH_PROVINCE_AND_CITY_TABLE.equals(str)) {
            this.mDbHelper.n(this.mDbHelper.getWritableDatabase());
        }
        return super.call(str, str2, bundle);
    }

    public void checkNumberData() {
        if (this.numOffest.size() <= 32) {
            SelfHealUtil.e(getContext());
        }
        Iterator<Map.Entry<String, Integer>> it = this.numOffest.entrySet().iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().getValue().intValue());
        }
        if (this.mCityData.length < iMax) {
            g3e.a(TAG, "the source data may have encounter error ");
            SelfHealUtil.e(getContext());
        }
        SelfHealUtil.d();
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        if (!getContext().getPackageName().equals(getCallingPackage())) {
            return 0;
        }
        SQLiteDatabase writableDatabase = this.mDbHelper.getWritableDatabase();
        writableDatabase.delete("version", null, null);
        writableDatabase.delete("areano_and_citynames", null, null);
        return 1;
    }

    @SuppressLint({"Range"})
    public Cursor getAttributionCursor(String str, String str2, Boolean bool, boolean z, boolean z2) {
        String countryCodeOfNumber;
        String string;
        String regionDisplayName;
        Cursor cursor;
        Cursor relativeNameCursor;
        if (DEBUG) {
            g3e.a(TAG, "getAttributionCursor countryIso = " + str2 + ", isForceQueryDomestic = " + bool + ", isRoam = " + z + ", isDomesticSim = " + z2);
        }
        if (TextUtils.isEmpty(str) || this.mUnSupportAttribution) {
            return null;
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = getCurrentCountryIso();
        }
        String strRemoveIpPrefixIfNeed = removeIpPrefixIfNeed(formatNumberNotRemovePrefix(str), str2);
        if (z2 && z && TextUtils.equals("US", str2)) {
            countryCodeOfNumber = getCountryCodeOfNumber(strRemoveIpPrefixIfNeed, str2, true);
            if (TextUtils.equals(countryCodeOfNumber, UNKNOWN_NUMBER_COUNTRY_CODE)) {
                if (DEBUG) {
                    g3e.a(TAG, "getAttributionCursor US roam for domestic sim card");
                }
                return null;
            }
        } else {
            countryCodeOfNumber = getCountryCodeOfNumber(strRemoveIpPrefixIfNeed, str2);
        }
        String strA = x5b.a();
        if (DEBUG) {
            g3e.a(TAG, "getAttributionCursor number = " + logGarbleMiddle(strRemoveIpPrefixIfNeed) + ", countryCode = " + countryCodeOfNumber + ", countryIso = " + str2 + ", country = " + strA);
        }
        if (this.VERSION_CN && (relativeNameCursor = getRelativeNameCursor(strRemoveIpPrefixIfNeed)) != null) {
            return relativeNameCursor;
        }
        Cursor cityNameCursor = (bool.booleanValue() || (TextUtils.equals(countryCodeOfNumber, gqe.DEFAULT_LANGUAGE) && (TextUtils.equals(strA, gqe.DEFAULT_LANGUAGE) || TextUtils.equals(strA, mb4.TW_ISO) || TextUtils.equals(strA, "HK") || x5b.c(strA)))) ? getCityNameCursor(strRemoveIpPrefixIfNeed) : getGeocodedLocationCursor(strRemoveIpPrefixIfNeed, str2);
        if (cityNameCursor == null || !cityNameCursor.moveToFirst()) {
            string = null;
        } else {
            do {
                string = cityNameCursor.getString(cityNameCursor.getColumnIndex(CITYNAME));
            } while (cityNameCursor.moveToNext());
        }
        if (cityNameCursor == null || TextUtils.isEmpty(string)) {
            cursor = cityNameCursor;
            cursor = cityNameCursor;
            if (!TextUtils.isEmpty(str2) && !TextUtils.equals(countryCodeOfNumber, str2) && PLUS_ZERO_CHARS_PATTERN.matcher(strRemoveIpPrefixIfNeed).lookingAt()) {
                if (this.VERSION_CN || TextUtils.equals(countryCodeOfNumber, "HK") || TextUtils.equals(countryCodeOfNumber, "MO")) {
                    cursor = cityNameCursor;
                    cursor = cityNameCursor;
                    cursor = cityNameCursor;
                    cursor = cityNameCursor;
                    cursor = cityNameCursor;
                    cursor = cityNameCursor;
                    regionDisplayName = getRegionDisplayName(countryCodeOfNumber, this.mLocale);
                } else {
                    cursor = cityNameCursor;
                    cursor = cityNameCursor;
                    regionDisplayName = "";
                }
                cursor = cityNameCursor;
                if (!TextUtils.isEmpty(regionDisplayName)) {
                    String strAddChina = addChina(countryCodeOfNumber, regionDisplayName);
                    String specialId = getSpecialId(strRemoveIpPrefixIfNeed, countryCodeOfNumber);
                    MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", AREANO, CITYNAME}, 1);
                    try {
                        matrixCursor.addRow(new String[]{specialId, null, strAddChina});
                        matrixCursor.close();
                        cursor = matrixCursor;
                    } catch (Throwable th) {
                        try {
                            matrixCursor.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
            }
        }
        cursor = cityNameCursor;
        cursor = cityNameCursor;
        cursor = cityNameCursor;
        cursor = cityNameCursor;
        return cursor;
    }

    public String getCarrierForNumber(String str, String str2) {
        if (str == null) {
            return null;
        }
        try {
            if (TextUtils.isEmpty(str2)) {
                str2 = getCurrentCountryIso();
            }
            String strReplace = str.replace("#", "").replace("-", "");
            if (!TextUtils.equals(gqe.DEFAULT_LANGUAGE, getCountryCodeOfNumber(strReplace, str2))) {
                return null;
            }
            PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
            if (strReplace.length() > 17) {
                strReplace = strReplace.substring(0, 17);
            }
            return eke.b().c(PhoneNumberUtil.getInstance().parseAndKeepRawInput(cke.d(phoneNumberUtil.parseAndKeepRawInput(strReplace, str2).getNationalNumber()), str2), Locale.getDefault());
        } catch (Exception e) {
            g3e.b(TAG, e + "");
            return null;
        }
    }

    public Cursor getCityNameCursor(String str) {
        String strSubstring;
        String strSubstring2;
        String strSubstring3;
        boolean z;
        com.oplus.phonenoareainquire.b.a aVarB;
        String strSubstring4;
        boolean z2;
        if (TextUtils.isEmpty(str)) {
            g3e.c(TAG, "phoneNo is empty return null ");
            return null;
        }
        String strReplace = str.replace("-", "").replace(" ", "");
        if (TextUtils.isEmpty(strReplace)) {
            return null;
        }
        if (this.mAccessCodeList == null) {
            this.mAccessCodeList = getAccessCodeList();
        }
        for (int i = 0; i < this.mAccessCodeList.size(); i++) {
            if (strReplace.startsWith(this.mAccessCodeList.get(i))) {
                strReplace = "+" + strReplace.substring(this.mAccessCodeList.get(i).length());
            }
        }
        if (this.numList == null) {
            this.numList = getPre();
        }
        for (int i2 = 0; i2 < this.numList.size(); i2++) {
            if (strReplace.startsWith(this.numList.get(i2))) {
                strReplace = strReplace.substring(this.numList.get(i2).length());
                if (TextUtils.isEmpty(strReplace) || ((!this.numList.get(i2).equals("+86") && !this.numList.get(i2).equals("0086")) || strReplace.length() < 6)) {
                    break;
                    break;
                    break;
                }
                int i3 = 0;
                while (true) {
                    try {
                        if (i3 >= this.mExtendNumberList.size()) {
                            z2 = true;
                            break;
                        }
                        String str2 = this.mExtendNumberList.get(i3);
                        if (!TextUtils.isEmpty(str2) && str2.startsWith("10") && strReplace.startsWith(str2) && strReplace.length() != 10) {
                            z2 = false;
                            break;
                        }
                        i3++;
                    } catch (Exception e) {
                        g3e.b(TAG, "" + e);
                    }
                }
                if ((!z2 || !strReplace.startsWith("10")) && (strReplace.startsWith("0") || strReplace.startsWith("1"))) {
                    break;
                    break;
                }
                strReplace = "0" + strReplace;
                break;
            }
        }
        if (!TextUtils.isEmpty(strReplace) && strReplace.length() > 3 && strReplace.startsWith("01") && strReplace.charAt(2) != '0') {
            strReplace = strReplace.substring(1);
        }
        if (strReplace.length() == 0) {
            g3e.c(TAG, "num is null or length is 0 return null ");
            return null;
        }
        try {
            int length = strReplace.length();
            for (int i4 = 0; i4 < length && i4 < 7; i4++) {
                if ("0123456789-".indexOf(strReplace.charAt(i4)) == -1) {
                    return null;
                }
            }
            String strReplace2 = strReplace.replace("-", "");
            if (strReplace2.length() == 0) {
                g3e.c(TAG, "Regular telephone number's length is 0 return");
                return null;
            }
            if (strReplace2.charAt(0) == '0') {
                if (strReplace2.length() < 3) {
                    return null;
                }
                if (strReplace2.charAt(1) == '1' || strReplace2.charAt(1) == '2') {
                    strSubstring4 = strReplace2.substring(0, 3);
                } else {
                    if (strReplace2.length() < 4) {
                        return null;
                    }
                    strSubstring4 = strReplace2.substring(0, 4);
                }
                return query(Uri.withAppendedPath(AREANO_AND_CITYNAMEURI, strSubstring4), null, null, null, null);
            }
            if (strReplace2.charAt(0) != '1' || strReplace2.length() < 7) {
                return null;
            }
            int i5 = 0;
            while (true) {
                try {
                    if (i5 >= this.mExtendNumberList.size()) {
                        strSubstring2 = null;
                        strSubstring3 = null;
                        strSubstring = null;
                        break;
                    }
                    String str3 = this.mExtendNumberList.get(i5);
                    if (TextUtils.isEmpty(str3) || !strReplace2.startsWith(str3)) {
                        i5++;
                    } else {
                        int iIntValue = this.mExtendNumberInfo.get(str3).intValue();
                        if (strReplace2.length() < iIntValue) {
                            return null;
                        }
                        strSubstring2 = strReplace2.substring(0, iIntValue);
                        strSubstring = strSubstring2.substring(0, str3.length());
                        try {
                            strSubstring3 = strSubstring2.substring(str3.length());
                            break;
                        } catch (Exception e2) {
                            e = e2;
                            g3e.b(TAG, "" + e);
                            strSubstring2 = null;
                            strSubstring3 = null;
                        }
                    }
                    g3e.b(TAG, "" + e);
                    strSubstring2 = null;
                    strSubstring3 = null;
                } catch (Exception e3) {
                    e = e3;
                    strSubstring = null;
                }
            }
            if (strSubstring2 == null) {
                String strSubstring5 = strReplace2.substring(0, 7);
                strSubstring = strSubstring5.substring(0, 3);
                strSubstring3 = strSubstring5.substring(3);
            }
            Integer num = this.numOffest.get(strSubstring);
            if (num == null) {
                g3e.a(TAG, "prefix == null return number = " + logGarbleMiddle(strReplace2));
                return null;
            }
            int iIntValue2 = num.intValue() + Integer.parseInt(strSubstring3);
            if (iIntValue2 % 2 != 0) {
                iIntValue2 = Math.max(iIntValue2 - 1, 0);
                z = true;
            } else {
                z = false;
            }
            int i6 = (iIntValue2 >> 1) * 3;
            byte[] bArr = this.mCityData;
            int i7 = bArr[i6] & 255;
            int i8 = bArr[i6 + 1] & 255;
            int i9 = bArr[i6 + 2] & 255;
            int i10 = (i7 << 4) | (i8 >> 4);
            int i11 = i9 | ((i8 & 15) << 8);
            if (z) {
                i10 = i11;
            }
            int i12 = i10 + 1;
            if (i12 == 1) {
                return null;
            }
            String strValueOf = String.valueOf(i12);
            com.oplus.phonenoareainquire.b bVar = this.mLocationCache;
            if (bVar == null || (aVarB = bVar.b(strValueOf)) == null || TextUtils.isEmpty(aVarB.a()) || TextUtils.isEmpty(aVarB.b())) {
                return query(Uri.withAppendedPath(AREANO_AND_CITYNAMEURI, Integer.toString(i12)), null, Integer.toString(i12), null, null);
            }
            MatrixCursor matrixCursor = new MatrixCursor(new String[]{"_id", AREANO, CITYNAME}, 1);
            matrixCursor.addRow(new String[]{strValueOf, aVarB.a(), aVarB.b()});
            return matrixCursor;
        } catch (Exception e4) {
            g3e.b(TAG, "e = " + e4);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:134:0x0350 A[Catch: Exception -> 0x03dd, TryCatch #8 {Exception -> 0x03dd, blocks: (B:12:0x0030, B:73:0x01aa, B:15:0x0054, B:17:0x005a, B:18:0x005e, B:20:0x0070, B:22:0x00a1, B:24:0x00ab, B:26:0x00cc, B:28:0x00d6, B:30:0x00dc, B:32:0x00e4, B:34:0x00ec, B:36:0x00f2, B:53:0x013e, B:54:0x0141, B:56:0x0147, B:58:0x014d, B:60:0x0153, B:62:0x015f, B:64:0x016b, B:66:0x0175, B:72:0x0194, B:67:0x0187, B:68:0x018a, B:69:0x018d, B:48:0x012c, B:50:0x0132, B:74:0x01b5, B:77:0x01d0, B:104:0x022f, B:147:0x03cb, B:103:0x0217, B:105:0x02bc, B:109:0x02c6, B:111:0x02cd, B:113:0x02d8, B:123:0x0324, B:132:0x0349, B:134:0x0350, B:145:0x03c1, B:146:0x03c6, B:135:0x0370, B:136:0x0384, B:138:0x038a, B:140:0x0390, B:143:0x03ab, B:151:0x03d9, B:152:0x03dc, B:112:0x02d3), top: B:177:0x0030, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:135:0x0370 A[Catch: Exception -> 0x03dd, TRY_LEAVE, TryCatch #8 {Exception -> 0x03dd, blocks: (B:12:0x0030, B:73:0x01aa, B:15:0x0054, B:17:0x005a, B:18:0x005e, B:20:0x0070, B:22:0x00a1, B:24:0x00ab, B:26:0x00cc, B:28:0x00d6, B:30:0x00dc, B:32:0x00e4, B:34:0x00ec, B:36:0x00f2, B:53:0x013e, B:54:0x0141, B:56:0x0147, B:58:0x014d, B:60:0x0153, B:62:0x015f, B:64:0x016b, B:66:0x0175, B:72:0x0194, B:67:0x0187, B:68:0x018a, B:69:0x018d, B:48:0x012c, B:50:0x0132, B:74:0x01b5, B:77:0x01d0, B:104:0x022f, B:147:0x03cb, B:103:0x0217, B:105:0x02bc, B:109:0x02c6, B:111:0x02cd, B:113:0x02d8, B:123:0x0324, B:132:0x0349, B:134:0x0350, B:145:0x03c1, B:146:0x03c6, B:135:0x0370, B:136:0x0384, B:138:0x038a, B:140:0x0390, B:143:0x03ab, B:151:0x03d9, B:152:0x03dc, B:112:0x02d3), top: B:177:0x0030, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:145:0x03c1 A[Catch: Exception -> 0x03dd, TryCatch #8 {Exception -> 0x03dd, blocks: (B:12:0x0030, B:73:0x01aa, B:15:0x0054, B:17:0x005a, B:18:0x005e, B:20:0x0070, B:22:0x00a1, B:24:0x00ab, B:26:0x00cc, B:28:0x00d6, B:30:0x00dc, B:32:0x00e4, B:34:0x00ec, B:36:0x00f2, B:53:0x013e, B:54:0x0141, B:56:0x0147, B:58:0x014d, B:60:0x0153, B:62:0x015f, B:64:0x016b, B:66:0x0175, B:72:0x0194, B:67:0x0187, B:68:0x018a, B:69:0x018d, B:48:0x012c, B:50:0x0132, B:74:0x01b5, B:77:0x01d0, B:104:0x022f, B:147:0x03cb, B:103:0x0217, B:105:0x02bc, B:109:0x02c6, B:111:0x02cd, B:113:0x02d8, B:123:0x0324, B:132:0x0349, B:134:0x0350, B:145:0x03c1, B:146:0x03c6, B:135:0x0370, B:136:0x0384, B:138:0x038a, B:140:0x0390, B:143:0x03ab, B:151:0x03d9, B:152:0x03dc, B:112:0x02d3), top: B:177:0x0030, inners: #11 }] */
    /* JADX WARN: Code duplicated, block: B:151:0x03d9 A[Catch: Exception -> 0x03dd, TryCatch #8 {Exception -> 0x03dd, blocks: (B:12:0x0030, B:73:0x01aa, B:15:0x0054, B:17:0x005a, B:18:0x005e, B:20:0x0070, B:22:0x00a1, B:24:0x00ab, B:26:0x00cc, B:28:0x00d6, B:30:0x00dc, B:32:0x00e4, B:34:0x00ec, B:36:0x00f2, B:53:0x013e, B:54:0x0141, B:56:0x0147, B:58:0x014d, B:60:0x0153, B:62:0x015f, B:64:0x016b, B:66:0x0175, B:72:0x0194, B:67:0x0187, B:68:0x018a, B:69:0x018d, B:48:0x012c, B:50:0x0132, B:74:0x01b5, B:77:0x01d0, B:104:0x022f, B:147:0x03cb, B:103:0x0217, B:105:0x02bc, B:109:0x02c6, B:111:0x02cd, B:113:0x02d8, B:123:0x0324, B:132:0x0349, B:134:0x0350, B:145:0x03c1, B:146:0x03c6, B:135:0x0370, B:136:0x0384, B:138:0x038a, B:140:0x0390, B:143:0x03ab, B:151:0x03d9, B:152:0x03dc, B:112:0x02d3), top: B:177:0x0030, inners: #11 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:134:0x0350, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x0370, please report this as an issue */
    @SuppressLint({"Range"})
    public Cursor getCityNames(String[] strArr, String str, boolean z, String str2) throws Throwable {
        Cursor cursor;
        Cursor cityNameCursor;
        SQLiteDatabase sQLiteDatabase;
        Cursor cursor2;
        Cursor cursorRawQuery;
        boolean z2;
        String str3;
        String str4;
        String str5;
        String str6;
        String strAddChina;
        String string;
        String string2;
        String[] strArr2 = strArr;
        boolean zIsEmpty = TextUtils.isEmpty(str);
        try {
            SQLiteDatabase writableDatabase = this.mDbHelper.getWritableDatabase();
            writableDatabase.execSQL("DELETE FROM area_presence_db.presence_numbers_table");
            int length = strArr2.length;
            if (length != 0) {
                try {
                    if (length % 6 == 0) {
                        StringBuilder sb = new StringBuilder();
                        int i = 0;
                        cityNameCursor = null;
                        while (true) {
                            String str7 = "1";
                            if (i >= length) {
                                break;
                            }
                            try {
                                String str8 = strArr2[i];
                                String str9 = strArr2[i + 1];
                                String str10 = strArr2[i + 2];
                                String str11 = strArr2[i + 3];
                                String currentCountryIso = strArr2[i + 4];
                                String str12 = strArr2[i + 5];
                                if (TextUtils.isEmpty(str10)) {
                                    i = i;
                                } else {
                                    if (TextUtils.isEmpty(currentCountryIso)) {
                                        currentCountryIso = getCurrentCountryIso();
                                    }
                                    String str13 = currentCountryIso;
                                    String strRemoveIpPrefixIfNeed = removeIpPrefixIfNeed(formatNumberNotRemovePrefix(str10), str13);
                                    String countryCodeOfNumber = getCountryCodeOfNumber(strRemoveIpPrefixIfNeed, str13);
                                    if (DEBUG) {
                                        g3e.a(TAG, "number = " + logGarbleMiddle(strRemoveIpPrefixIfNeed) + " ,countryCode = " + countryCodeOfNumber + " ,countryIso = " + str13);
                                    }
                                    String strA = x5b.a();
                                    if (getShortNumberLocation(strRemoveIpPrefixIfNeed) != null) {
                                        appendAreaAsDisplayName(str8, str9, strRemoveIpPrefixIfNeed, str11, "1", AREANO_OTHER_TITLE, null, str12);
                                    } else {
                                        length = length;
                                        sb = sb;
                                        if (TextUtils.equals(countryCodeOfNumber, gqe.DEFAULT_LANGUAGE) && (TextUtils.equals(strA, gqe.DEFAULT_LANGUAGE) || TextUtils.equals(strA, mb4.TW_ISO) || TextUtils.equals(strA, "HK") || x5b.c(strA))) {
                                            cityNameCursor = getCityNameCursor(strRemoveIpPrefixIfNeed);
                                            if (cityNameCursor == null) {
                                                cityNameCursor = cityNameCursor;
                                                str3 = null;
                                                z2 = false;
                                                str4 = "1";
                                            } else {
                                                try {
                                                    if (cityNameCursor.moveToFirst()) {
                                                        do {
                                                            string = cityNameCursor.getString(cityNameCursor.getColumnIndex("_id"));
                                                            string2 = cityNameCursor.getString(cityNameCursor.getColumnIndex(CITYNAME));
                                                        } while (cityNameCursor.moveToNext());
                                                        str4 = string;
                                                        str3 = string2;
                                                    } else {
                                                        str3 = null;
                                                        str4 = null;
                                                    }
                                                    z2 = false;
                                                } catch (Exception e) {
                                                    e = e;
                                                    cityNameCursor = cityNameCursor;
                                                }
                                            }
                                        } else {
                                            String[] strArrFindLocationAsCountry = findLocationAsCountry(strRemoveIpPrefixIfNeed, str13);
                                            if (strArrFindLocationAsCountry != null) {
                                                z2 = false;
                                                str4 = strArrFindLocationAsCountry[0];
                                                str3 = strArrFindLocationAsCountry[1];
                                            } else {
                                                z2 = false;
                                                str3 = null;
                                                str4 = null;
                                            }
                                        }
                                        if (cityNameCursor != null) {
                                            cityNameCursor.close();
                                        }
                                        if (!TextUtils.isEmpty(str3) || TextUtils.isEmpty(str13)) {
                                            str5 = str3;
                                            str6 = str4;
                                        } else {
                                            if (TextUtils.equals(countryCodeOfNumber, str13) || !PLUS_ZERO_CHARS_PATTERN.matcher(strRemoveIpPrefixIfNeed).lookingAt()) {
                                                strAddChina = AREANO_OTHER_TITLE;
                                            } else {
                                                String regionDisplayName = getRegionDisplayName(countryCodeOfNumber, this.mLocale);
                                                if (TextUtils.isEmpty(regionDisplayName)) {
                                                    strAddChina = AREANO_OTHER_TITLE;
                                                } else {
                                                    strAddChina = addChina(countryCodeOfNumber, regionDisplayName);
                                                    int countryCode = getCountryCode(strRemoveIpPrefixIfNeed, str13);
                                                    if (countryCode > 0) {
                                                        str7 = "-" + countryCode;
                                                    } else {
                                                        strAddChina = AREANO_OTHER_TITLE;
                                                    }
                                                }
                                            }
                                            str5 = strAddChina;
                                            str6 = str7;
                                        }
                                        appendAreaAsDisplayName(str8, str9, strRemoveIpPrefixIfNeed, str11, str6, str5, null, str12);
                                    }
                                    i += 6;
                                    sb = sb;
                                    length = length;
                                    writableDatabase = writableDatabase;
                                    strArr2 = strArr;
                                }
                                i += 6;
                                sb = sb;
                                length = length;
                                writableDatabase = writableDatabase;
                                strArr2 = strArr;
                            } catch (Exception e2) {
                                e = e2;
                            }
                            e = e2;
                            cursor = null;
                        }
                        StringBuilder sb2 = sb;
                        SQLiteDatabase sQLiteDatabase2 = writableDatabase;
                        StringBuilder sb3 = new StringBuilder();
                        sb2.setLength(0);
                        sb2.append("area_presence_db.presence_numbers_table");
                        if (zIsEmpty) {
                            String string3 = getContext().getString(R.string.UNKONW_AREA);
                            try {
                                sQLiteDatabase = sQLiteDatabase2;
                                try {
                                    Cursor cursorRawQuery2 = sQLiteDatabase.rawQuery("SELECT cityname FROM areano_and_citynames WHERE _id=?", new String[]{"1"});
                                    if (cursorRawQuery2 != null) {
                                        try {
                                            if (cursorRawQuery2.getCount() > 0) {
                                                cursorRawQuery2.moveToFirst();
                                                String string4 = cursorRawQuery2.getString(0);
                                                if (!TextUtils.isEmpty(string4)) {
                                                    string3 = string4;
                                                }
                                            }
                                        } catch (Throwable th) {
                                            if (cursorRawQuery2 == null) {
                                                throw th;
                                            }
                                            try {
                                                cursorRawQuery2.close();
                                                throw th;
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                                throw th;
                                            }
                                        }
                                    }
                                    if (cursorRawQuery2 != null) {
                                        cursorRawQuery2.close();
                                    }
                                } catch (Exception e3) {
                                    e = e3;
                                    g3e.a(TAG, "unKonwCursor error " + e.getMessage());
                                    String strReplace = string3.replace("'", "''");
                                    sb3.append(" SELECT _id, _index, cityname, COUNT(cityname) AS member_count ");
                                    sb3.append(" FROM ( ");
                                    sb3.append("   SELECT DISTINCT phones._id AS _id, ");
                                    sb3.append("          (CASE ");
                                    sb3.append(" WHEN phones._index IS NOT NULL THEN  phones._index    WHEN areano_and_citynames.areano is not null then  areano_and_citynames._id ELSE '1' END) AS _index,  ");
                                    sb3.append("   (CASE WHEN phones.cityname IS NOT NULL THEN phones.cityname ");
                                    sb3.append("           WHEN areano_and_citynames1.cityname IS not NULL THEN areano_and_citynames1. cityname");
                                    sb3.append("           WHEN areano_and_citynames.cityname IS NOT NULL THEN areano_and_citynames.cityname");
                                    sb3.append("   ELSE '" + strReplace + "' END) AS " + CITYNAME + " ");
                                    sb3.append("   FROM ( ");
                                    sb3.append((CharSequence) sb2);
                                    sb3.append("   ) AS phones ");
                                    sb3.append("   LEFT JOIN areano_and_citynames areano_and_citynames1 ON (areano_and_citynames1._id=phones._index) ");
                                    sb3.append("   LEFT JOIN areano_and_citynames ON (areano_and_citynames.areano=phones.areano) ");
                                    sb3.append(" ) ");
                                    sb3.append(" GROUP BY cityname ");
                                    sb3.append(" ORDER BY (CASE WHEN cityname='" + strReplace + "' THEN 1 ELSE 0 END) ASC, " + CITYNAME + " COLLATE LOCALIZED ASC ");
                                    return sQLiteDatabase.rawQuery(sb3.toString(), null);
                                }
                            } catch (Exception e4) {
                                e = e4;
                                sQLiteDatabase = sQLiteDatabase2;
                            }
                            String strReplace2 = string3.replace("'", "''");
                            sb3.append(" SELECT _id, _index, cityname, COUNT(cityname) AS member_count ");
                            sb3.append(" FROM ( ");
                            sb3.append("   SELECT DISTINCT phones._id AS _id, ");
                            sb3.append("          (CASE ");
                            sb3.append(" WHEN phones._index IS NOT NULL THEN  phones._index    WHEN areano_and_citynames.areano is not null then  areano_and_citynames._id ELSE '1' END) AS _index,  ");
                            sb3.append("   (CASE WHEN phones.cityname IS NOT NULL THEN phones.cityname ");
                            sb3.append("           WHEN areano_and_citynames1.cityname IS not NULL THEN areano_and_citynames1. cityname");
                            sb3.append("           WHEN areano_and_citynames.cityname IS NOT NULL THEN areano_and_citynames.cityname");
                            sb3.append("   ELSE '" + strReplace2 + "' END) AS " + CITYNAME + " ");
                            sb3.append("   FROM ( ");
                            sb3.append((CharSequence) sb2);
                            sb3.append("   ) AS phones ");
                            sb3.append("   LEFT JOIN areano_and_citynames areano_and_citynames1 ON (areano_and_citynames1._id=phones._index) ");
                            sb3.append("   LEFT JOIN areano_and_citynames ON (areano_and_citynames.areano=phones.areano) ");
                            sb3.append(" ) ");
                            sb3.append(" GROUP BY cityname ");
                            sb3.append(" ORDER BY (CASE WHEN cityname='" + strReplace2 + "' THEN 1 ELSE 0 END) ASC, " + CITYNAME + " COLLATE LOCALIZED ASC ");
                        } else {
                            sQLiteDatabase = sQLiteDatabase2;
                            if (!isNumericWithNegativeNumber(str)) {
                                return null;
                            }
                            sb3.append(" SELECT _id, display_name");
                            if (z) {
                                sb3.append(", data1");
                            } else {
                                sb3.append(", photo_id, account_name, account_type, lookup,  phonebook_bucket ");
                            }
                            sb3.append(" FROM ( ");
                            sb3.append("     SELECT DISTINCT phones._id  AS _id, display_name,  phones.photo_id AS photo_id,  NULL AS account_name,  NULL AS account_type,  NULL AS lookup,  phones.phonebook_bucket AS phonebook_bucket, (CASE WHEN phones._index IS NOT NULL THEN  phones._index WHEN areano_and_citynames._id is not null then  areano_and_citynames._id ELSE '1' END)    AS _index, data1, phones.cityname AS cityname");
                            sb3.append("     FROM ( ");
                            sb3.append((CharSequence) sb2);
                            sb3.append("     ) AS phones ");
                            sb3.append("    LEFT  JOIN areano_and_citynames AS areano_and_citynames1 ON (areano_and_citynames1._id=phones._index) ");
                            sb3.append("   LEFT JOIN areano_and_citynames ON (areano_and_citynames.areano=phones.areano) ");
                            sb3.append(" ) ");
                            ArrayList arrayList = new ArrayList();
                            try {
                                cursorRawQuery = sQLiteDatabase.rawQuery("SELECT _id FROM areano_and_citynames WHERE cityname = (SELECT cityname FROM areano_and_citynames WHERE _id =? )", new String[]{String.valueOf(str)});
                                while (cursorRawQuery != null) {
                                    try {
                                        try {
                                            if (!cursorRawQuery.moveToNext()) {
                                                break;
                                            }
                                            arrayList.add(String.valueOf(cursorRawQuery.getInt(0)));
                                        } catch (Exception e5) {
                                            e = e5;
                                            g3e.b(TAG, "idsCursor error" + e.getMessage());
                                            if (cursorRawQuery != null) {
                                            }
                                            if (arrayList.size() > 1) {
                                                sb3.append(" WHERE _index in (" + TextUtils.join(d14.COMMA_REGEX, arrayList) + ")");
                                            } else {
                                                sb3.append(" WHERE _index=" + str);
                                                try {
                                                    if (!TextUtils.isEmpty(str2)) {
                                                        sb3.append(" AND cityname='" + str2 + "'");
                                                    }
                                                } catch (NumberFormatException e6) {
                                                    g3e.b(TAG, "format error" + e6);
                                                }
                                            }
                                            if (!z) {
                                                sb3.append(" GROUP BY _id ");
                                            }
                                            sb3.append(" ORDER BY phonebook_bucket, ((CASE WHEN (SUBSTR(display_name,1,1) IN ('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M')) THEN 0 ELSE 1 END)/1) COLLATE NOCASE,display_name COLLATE PHONEBOOK, _id");
                                            return sQLiteDatabase.rawQuery(sb3.toString(), null);
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        cursor2 = cursorRawQuery;
                                        if (cursor2 != null) {
                                            cursor2.close();
                                        }
                                        throw th;
                                    }
                                }
                                if (cursorRawQuery != null) {
                                    cursorRawQuery.close();
                                }
                            } catch (Exception e7) {
                                e = e7;
                                cursorRawQuery = null;
                            } catch (Throwable th4) {
                                th = th4;
                                cursor2 = null;
                                if (cursor2 != null) {
                                    cursor2.close();
                                }
                                throw th;
                            }
                            if (arrayList.size() > 1) {
                                sb3.append(" WHERE _index in (" + TextUtils.join(d14.COMMA_REGEX, arrayList) + ")");
                            } else {
                                sb3.append(" WHERE _index=" + str);
                                if (!TextUtils.isEmpty(str2) && Integer.parseInt(str) < 0) {
                                    sb3.append(" AND cityname='" + str2 + "'");
                                }
                            }
                            if (!z) {
                                sb3.append(" GROUP BY _id ");
                            }
                            sb3.append(" ORDER BY phonebook_bucket, ((CASE WHEN (SUBSTR(display_name,1,1) IN ('q','w','e','r','t','y','u','i','o','p','a','s','d','f','g','h','j','k','l','z','x','c','v','b','n','m','Q','W','E','R','T','Y','U','I','O','P','A','S','D','F','G','H','J','K','L','Z','X','C','V','B','N','M')) THEN 0 ELSE 1 END)/1) COLLATE NOCASE,display_name COLLATE PHONEBOOK, _id");
                        }
                        return sQLiteDatabase.rawQuery(sb3.toString(), null);
                    }
                } catch (Exception e8) {
                    e = e8;
                    cursor = null;
                    cityNameCursor = null;
                }
                if (cityNameCursor != null) {
                    cityNameCursor.close();
                }
                g3e.b(TAG, "getCityNameCursorAsPhoneCursor error" + e);
                return cursor;
            }
            g3e.c(TAG, "phoneCursor is empty return null ");
            return null;
        } catch (Exception e9) {
            e = e9;
            cursor = null;
            cityNameCursor = null;
        }
    }

    public String getGeocodedLocationFor(Phonenumber.PhoneNumber phoneNumber) {
        if (phoneNumber == null) {
            return null;
        }
        if (getContext() != null) {
            this.mLocale = getContext().getResources().getConfiguration().locale;
        } else {
            g3e.b(TAG, "getGeocodedLocationFor getContext is null");
        }
        return getPhoneNumberOfflineGeocoder().b(phoneNumber, this.mLocale);
    }

    public gqe.NumberInfo getNumberInfo(String str) {
        try {
            String countryCodeOfNumber = getCountryCodeOfNumber(str, getCurrentCountryIso());
            Phonenumber.PhoneNumber andKeepRawInput = PhoneNumberUtil.getInstance().parseAndKeepRawInput(str, countryCodeOfNumber);
            String strA = x5b.a();
            if (TextUtils.equals(countryCodeOfNumber, gqe.DEFAULT_LANGUAGE) && (TextUtils.equals(strA, gqe.DEFAULT_LANGUAGE) || TextUtils.equals(strA, mb4.TW_ISO) || TextUtils.equals(strA, "HK") || x5b.c(strA))) {
                return gqe.g(andKeepRawInput.getNationalNumber(), strA);
            }
            return null;
        } catch (Exception e) {
            g3e.b(TAG, "exception when getCarrierForNumberFromDatabase " + e);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007e  */
    public Cursor getRelativeNameCursor(String str) {
        String string;
        MatrixCursor matrixCursor = null;
        if (TextUtils.isEmpty(str)) {
            g3e.c(TAG, "phoneNo is empty return null ");
            return null;
        }
        String strReplace = str.replace("-", "").replace(" ", "");
        if (TextUtils.isEmpty(strReplace)) {
            return null;
        }
        int length = strReplace.length();
        if (strReplace.startsWith("2") || strReplace.startsWith("3") || strReplace.startsWith("5") || strReplace.startsWith("7") || strReplace.startsWith("8")) {
            if (length == 3) {
                string = getContext().getString(R.string.family_number);
            } else if (length == 4 || length == 5) {
                string = getContext().getString(R.string.group_number);
            } else {
                string = null;
            }
        } else if (!strReplace.startsWith("6") || length < 3 || length > 6) {
            string = null;
        } else {
            string = getContext().getString(R.string.group_number);
        }
        if (string != null) {
            matrixCursor = new MatrixCursor(new String[]{"_id", AREANO, CITYNAME}, 1);
            try {
                matrixCursor.addRow(new String[]{"0", "9999", string});
                matrixCursor.close();
            } catch (Throwable th) {
                try {
                    matrixCursor.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int iMatch = URI_MATCHER.match(uri);
        if (iMatch == 0) {
            return "vnd.android.cursor.item/phoneno";
        }
        if (iMatch == 1) {
            return "vnd.android.cursor.dir/areano_and_citynames";
        }
        if (iMatch == 2) {
            return "vnd.android.cursor.item/areano_and_citynames";
        }
        if (iMatch != 5) {
            return null;
        }
        return "vnd.android.cursor.item/version";
    }

    public void initExtendNumberInfo() {
        try {
            try {
                FileInputStream fileInputStream = new FileInputStream(sExtendNumberFile);
                try {
                    DataInputStream dataInputStream = new DataInputStream(new BufferedInputStream(fileInputStream));
                    try {
                        HashMap<String, Integer> map = this.mExtendNumberInfo;
                        if (map == null) {
                            this.mExtendNumberInfo = new HashMap<>();
                        } else {
                            map.clear();
                        }
                        ArrayList<String> arrayList = this.mExtendNumberList;
                        if (arrayList == null) {
                            this.mExtendNumberList = new ArrayList<>();
                        } else {
                            arrayList.clear();
                        }
                        while (dataInputStream.available() > 0) {
                            String utf = dataInputStream.readUTF();
                            String utf2 = dataInputStream.readUTF();
                            this.mExtendNumberList.add(utf);
                            this.mExtendNumberInfo.put(utf, Integer.valueOf(utf2));
                        }
                        dataInputStream.close();
                        fileInputStream.close();
                    } catch (Throwable th) {
                        try {
                            dataInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                SelfHealUtil.d();
                throw th5;
            }
        } catch (NumberFormatException e) {
            g3e.b(TAG, "Exception: " + e);
            SelfHealUtil.e(getContext());
        } catch (Exception e2) {
            g3e.b(TAG, "Exception when init extend number data : " + e2);
        }
        SelfHealUtil.d();
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        long jInsert;
        this.mDb = this.mDbHelper.getWritableDatabase();
        int iMatch = URI_MATCHER.match(uri);
        if (iMatch != 1) {
            jInsert = iMatch != 5 ? 0L : this.mDb.insert("version", null, contentValues);
        } else {
            jInsert = this.mDb.insert("areano_and_citynames", null, contentValues);
        }
        if (jInsert > 0) {
            return ContentUris.withAppendedId(uri, jInsert);
        }
        return null;
    }

    public boolean isNumericWithNegativeNumber(String str) {
        return Pattern.compile("-?[0-9]*").matcher(str).matches();
    }

    /* JADX WARN: Code duplicated, block: B:136:0x027e A[Catch: all -> 0x02ee, TryCatch #9 {all -> 0x02ee, blocks: (B:134:0x0276, B:136:0x027e, B:138:0x0299, B:140:0x02a8, B:141:0x02b2, B:142:0x02c2, B:144:0x02c8, B:137:0x0296), top: B:224:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:137:0x0296 A[Catch: all -> 0x02ee, TryCatch #9 {all -> 0x02ee, blocks: (B:134:0x0276, B:136:0x027e, B:138:0x0299, B:140:0x02a8, B:141:0x02b2, B:142:0x02c2, B:144:0x02c8, B:137:0x0296), top: B:224:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:140:0x02a8 A[Catch: all -> 0x02ee, LOOP:6: B:139:0x02a6->B:140:0x02a8, LOOP_END, TryCatch #9 {all -> 0x02ee, blocks: (B:134:0x0276, B:136:0x027e, B:138:0x0299, B:140:0x02a8, B:141:0x02b2, B:142:0x02c2, B:144:0x02c8, B:137:0x0296), top: B:224:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:144:0x02c8 A[Catch: all -> 0x02ee, TRY_LEAVE, TryCatch #9 {all -> 0x02ee, blocks: (B:134:0x0276, B:136:0x027e, B:138:0x0299, B:140:0x02a8, B:141:0x02b2, B:142:0x02c2, B:144:0x02c8, B:137:0x0296), top: B:224:0x0276 }] */
    /* JADX WARN: Code duplicated, block: B:210:0x025d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:232:0x01b3 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:235:0x02f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:270:0x0267 A[EDGE_INSN: B:270:0x0267->B:132:0x0267 BREAK  A[LOOP:5: B:125:0x0256->B:271:?], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:? A[Catch: all -> 0x01bd, SYNTHETIC, TRY_LEAVE, TryCatch #17 {all -> 0x01bd, blocks: (B:67:0x019d, B:83:0x01bc, B:82:0x01b9, B:78:0x01b3), top: B:238:0x0117, inners: #13 }] */
    /* JADX WARN: Code duplicated, block: B:281:? A[Catch: all -> 0x0300, SYNTHETIC, TRY_LEAVE, TryCatch #21 {all -> 0x0300, blocks: (B:146:0x02e0, B:162:0x02ff, B:161:0x02fc, B:157:0x02f6), top: B:244:0x0254, inners: #15 }] */
    /* JADX WARN: Instruction removed from duplicated block: B:136:0x027e, please report this as an issue */
    public void loadNumberDataToCache() throws Throwable {
        IOException iOException;
        IOException iOException2;
        FileOutputStream fileOutputStream;
        Throwable th;
        FileInputStream fileInputStream;
        Throwable th2;
        InputStream inputStreamOpen;
        FileChannel channel;
        Throwable th3;
        byte[] bArr;
        int i;
        long jSkip;
        int iAvailable;
        int i2;
        HashMap map;
        int i3;
        Throwable th4;
        FileChannel fileChannel;
        Throwable th5;
        HashMap<String, Integer> map2 = this.numOffest;
        if (map2 == null) {
            this.numOffest = new HashMap<>();
        } else {
            map2.clear();
        }
        int i4 = 130;
        int i5 = 0;
        int i6 = 0;
        while (i5 < 10) {
            this.numOffest.put(Integer.toString(i4), Integer.valueOf(i6));
            i6 += 10000;
            i5++;
            i4++;
        }
        int i7 = 150;
        int i8 = 0;
        while (i8 < 10) {
            this.numOffest.put(Integer.toString(i7), Integer.valueOf(i6));
            i6 += 10000;
            i8++;
            i7++;
        }
        this.numOffest.put("188", Integer.valueOf(i6));
        int i9 = i6 + 10000;
        this.numOffest.put("189", Integer.valueOf(i9));
        int i10 = i9 + 10000;
        try {
            try {
                try {
                    FileInputStream fileInputStream2 = new FileInputStream(sResourceFile);
                    try {
                        if (fileInputStream2.available() == 0) {
                            try {
                                long jElapsedRealtime = SystemClock.elapsedRealtime();
                                File file = new File(sResourceFile);
                                file.delete();
                                file.createNewFile();
                                g3e.a(TAG, "copy PhoneNumberData.dat to /data/data/ again");
                                byte[] bArr2 = new byte[m08.MAX_BUFFER_SIZE];
                                try {
                                    FileOutputStream fileOutputStream2 = new FileOutputStream(file);
                                    try {
                                        InputStream inputStreamOpen2 = getContext().getResources().getAssets().open("PhoneNumberData_3_1_0.dat");
                                        while (true) {
                                            try {
                                                int i11 = inputStreamOpen2.read(bArr2);
                                                if (i11 == -1) {
                                                    break;
                                                } else {
                                                    fileOutputStream2.write(bArr2, 0, i11);
                                                }
                                            } catch (Throwable th6) {
                                                if (inputStreamOpen2 == null) {
                                                    throw th6;
                                                }
                                                try {
                                                    inputStreamOpen2.close();
                                                    throw th6;
                                                } catch (Throwable th7) {
                                                    th6.addSuppressed(th7);
                                                    throw th6;
                                                }
                                            }
                                            try {
                                                fileOutputStream2.close();
                                                throw th;
                                            } catch (Throwable th8) {
                                                th.addSuppressed(th8);
                                                throw th;
                                            }
                                        }
                                        fileOutputStream2.flush();
                                        inputStreamOpen2.close();
                                        fileOutputStream2.close();
                                        g3e.a(TAG, "copySourceFile time = " + (SystemClock.elapsedRealtime() - jElapsedRealtime));
                                    } catch (Throwable th9) {
                                        fileOutputStream2.close();
                                        throw th9;
                                    }
                                } catch (Exception e) {
                                    g3e.b(TAG, "exception tarFile " + e.getMessage());
                                }
                            } catch (Throwable th10) {
                                th = th10;
                                Throwable th11 = th;
                                try {
                                    fileInputStream2.close();
                                    throw th11;
                                } catch (Throwable th12) {
                                    th11.addSuppressed(th12);
                                    throw th11;
                                }
                            }
                        }
                        try {
                            try {
                                FileInputStream fileInputStream3 = new FileInputStream(sResourceFile);
                                try {
                                    try {
                                        FileChannel channel2 = fileInputStream3.getChannel();
                                        try {
                                            readPhoneNumberDataToCache(new DataInputStream(cache(fileInputStream3)));
                                            channel2.position(0L);
                                            fileChannel = channel2;
                                            try {
                                                long jSkip2 = fileInputStream3.skip(16L);
                                                if (jSkip2 > 0) {
                                                    g3e.a(TAG, "skip " + jSkip2 + " bytes");
                                                } else {
                                                    g3e.a(TAG, "skip fail");
                                                }
                                                int iAvailable2 = fileInputStream3.available();
                                                this.mCityData = new byte[fileInputStream3.available()];
                                                int i12 = 0;
                                                while (i12 < iAvailable2) {
                                                    i12 += fileInputStream3.read(this.mCityData, i12, iAvailable2 - i12);
                                                }
                                                HashMap map3 = (HashMap) getContext().getSharedPreferences(xje.EXPAND_NUM, 0).getAll();
                                                int i13 = i10;
                                                for (int i14 = 0; i14 < map3.size(); i14++) {
                                                    try {
                                                        this.numOffest.put((String) map3.get(Integer.toString(i14)), Integer.valueOf(i13));
                                                        i13 += 10000;
                                                    } catch (Throwable th13) {
                                                        th = th13;
                                                        th5 = th;
                                                        if (fileChannel != null) {
                                                            throw th5;
                                                        }
                                                        try {
                                                            fileChannel.close();
                                                            throw th5;
                                                        } catch (Throwable th14) {
                                                            th5.addSuppressed(th14);
                                                            throw th5;
                                                        }
                                                    }
                                                }
                                                fileChannel.close();
                                                fileInputStream3.close();
                                            } catch (Throwable th15) {
                                                th5 = th15;
                                                if (fileChannel != null) {
                                                    throw th5;
                                                }
                                                fileChannel.close();
                                                throw th5;
                                            }
                                        } catch (Throwable th16) {
                                            th = th16;
                                            fileChannel = channel2;
                                        }
                                    } catch (Throwable th17) {
                                        th = th17;
                                        th4 = th;
                                        try {
                                            fileInputStream3.close();
                                            throw th4;
                                        } catch (Throwable th18) {
                                            th4.addSuppressed(th18);
                                            throw th4;
                                        }
                                    }
                                } catch (Throwable th19) {
                                    th = th19;
                                    th4 = th;
                                    fileInputStream3.close();
                                    throw th4;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                g3e.b(TAG, "Exception when copySourceFile " + e.getMessage());
                            }
                        } catch (Exception e3) {
                            e = e3;
                            g3e.b(TAG, "Exception when copySourceFile " + e.getMessage());
                        }
                        fileInputStream2.close();
                    } catch (Throwable th20) {
                        th = th20;
                    }
                } catch (IOException e4) {
                    e = e4;
                    iOException = e;
                    try {
                        g3e.a(TAG, "IOException copySourceFile  again");
                        File file2 = new File(sResourceFile);
                        file2.delete();
                        file2.createNewFile();
                        g3e.a(TAG, "IOException copy PhoneNumberData.dat to /data/data/ again");
                        try {
                            try {
                                fileOutputStream = new FileOutputStream(file2);
                                try {
                                    try {
                                        fileInputStream = new FileInputStream(sResourceFile);
                                        try {
                                            try {
                                                inputStreamOpen = getContext().getResources().getAssets().open("PhoneNumberData_3_1_0.dat");
                                                try {
                                                    channel = fileInputStream.getChannel();
                                                    try {
                                                        try {
                                                            bArr = new byte[m08.MAX_BUFFER_SIZE];
                                                            while (true) {
                                                                i = inputStreamOpen.read(bArr);
                                                                if (i != -1) {
                                                                    break;
                                                                }
                                                                try {
                                                                    fileOutputStream.write(bArr, 0, i);
                                                                } catch (Throwable th21) {
                                                                    th3 = th21;
                                                                    iOException2 = iOException;
                                                                    if (channel != null) {
                                                                        throw th3;
                                                                    }
                                                                    try {
                                                                        channel.close();
                                                                        throw th3;
                                                                    } catch (Throwable th22) {
                                                                        th3.addSuppressed(th22);
                                                                        throw th3;
                                                                    }
                                                                }
                                                                th3 = th;
                                                                if (channel != null) {
                                                                    throw th3;
                                                                }
                                                                channel.close();
                                                                throw th3;
                                                            }
                                                            fileOutputStream.flush();
                                                            fileOutputStream.close();
                                                            channel.position(0L);
                                                            iOException2 = iOException;
                                                            try {
                                                                jSkip = fileInputStream.skip(16L);
                                                                if (jSkip > 0) {
                                                                    g3e.a(TAG, " has skiped " + jSkip + " bytes");
                                                                } else {
                                                                    g3e.a(TAG, "skip fail");
                                                                }
                                                                iAvailable = fileInputStream.available();
                                                                this.mCityData = new byte[fileInputStream.available()];
                                                                i2 = 0;
                                                                while (i2 < iAvailable) {
                                                                    i2 += fileInputStream.read(this.mCityData, i2, iAvailable - i2);
                                                                }
                                                                map = (HashMap) getContext().getSharedPreferences(xje.EXPAND_NUM, 0).getAll();
                                                                for (i3 = 0; i3 < map.size(); i3++) {
                                                                    this.numOffest.put((String) map.get(Integer.toString(i3)), Integer.valueOf(i10));
                                                                    i10 += 10000;
                                                                }
                                                                channel.close();
                                                                inputStreamOpen.close();
                                                                fileInputStream.close();
                                                                fileOutputStream.close();
                                                                g3e.b(TAG, "IOException: " + iOException2);
                                                            } catch (Throwable th23) {
                                                                th = th23;
                                                                th3 = th;
                                                                if (channel != null) {
                                                                    throw th3;
                                                                }
                                                                channel.close();
                                                                throw th3;
                                                            }
                                                        } catch (Throwable th24) {
                                                            th = th24;
                                                            iOException2 = iOException;
                                                        }
                                                    } catch (Throwable th25) {
                                                        th = th25;
                                                        Throwable th26 = th;
                                                        if (inputStreamOpen == null) {
                                                            throw th26;
                                                        }
                                                        try {
                                                            inputStreamOpen.close();
                                                            throw th26;
                                                        } catch (Throwable th27) {
                                                            th26.addSuppressed(th27);
                                                            throw th26;
                                                        }
                                                    }
                                                } catch (Throwable th28) {
                                                    th = th28;
                                                    iOException2 = iOException;
                                                }
                                            } catch (Throwable th29) {
                                                th = th29;
                                                th2 = th;
                                                try {
                                                    fileInputStream.close();
                                                    throw th2;
                                                } catch (Throwable th30) {
                                                    th2.addSuppressed(th30);
                                                    throw th2;
                                                }
                                            }
                                        } catch (Throwable th31) {
                                            th = th31;
                                            iOException2 = iOException;
                                            th2 = th;
                                            fileInputStream.close();
                                            throw th2;
                                        }
                                    } catch (Throwable th32) {
                                        th = th32;
                                        th = th;
                                        try {
                                            fileOutputStream.close();
                                            throw th;
                                        } catch (Throwable th33) {
                                            th.addSuppressed(th33);
                                            throw th;
                                        }
                                    }
                                } catch (Throwable th34) {
                                    th = th34;
                                    iOException2 = iOException;
                                    th = th;
                                    fileOutputStream.close();
                                    throw th;
                                }
                            } catch (Exception e5) {
                                e = e5;
                                iOException2 = iOException;
                                try {
                                    g3e.b(TAG, "copySourceFile again" + e.getMessage());
                                } catch (Exception e6) {
                                    e = e6;
                                    g3e.b(TAG, "Exception again:" + e);
                                    g3e.b(TAG, "IOException: " + iOException2);
                                }
                                g3e.b(TAG, "IOException: " + iOException2);
                            }
                        } catch (Exception e7) {
                            e = e7;
                            g3e.b(TAG, "copySourceFile again" + e.getMessage());
                            g3e.b(TAG, "IOException: " + iOException2);
                        }
                    } catch (Exception e8) {
                        e = e8;
                        iOException2 = iOException;
                    }
                }
            } catch (IOException e9) {
                e = e9;
                iOException = e;
                g3e.a(TAG, "IOException copySourceFile  again");
                File file3 = new File(sResourceFile);
                file3.delete();
                file3.createNewFile();
                g3e.a(TAG, "IOException copy PhoneNumberData.dat to /data/data/ again");
                fileOutputStream = new FileOutputStream(file3);
                fileInputStream = new FileInputStream(sResourceFile);
                inputStreamOpen = getContext().getResources().getAssets().open("PhoneNumberData_3_1_0.dat");
                channel = fileInputStream.getChannel();
                bArr = new byte[m08.MAX_BUFFER_SIZE];
                while (true) {
                    i = inputStreamOpen.read(bArr);
                    if (i != -1) {
                        break;
                        break;
                    }
                    fileOutputStream.write(bArr, 0, i);
                    th3 = th;
                    if (channel != null) {
                        throw th3;
                    }
                    channel.close();
                    throw th3;
                }
                fileOutputStream.flush();
                fileOutputStream.close();
                channel.position(0L);
                iOException2 = iOException;
                jSkip = fileInputStream.skip(16L);
                if (jSkip > 0) {
                    g3e.a(TAG, " has skiped " + jSkip + " bytes");
                } else {
                    g3e.a(TAG, "skip fail");
                }
                iAvailable = fileInputStream.available();
                this.mCityData = new byte[fileInputStream.available()];
                i2 = 0;
                while (i2 < iAvailable) {
                    i2 += fileInputStream.read(this.mCityData, i2, iAvailable - i2);
                }
                map = (HashMap) getContext().getSharedPreferences(xje.EXPAND_NUM, 0).getAll();
                while (i3 < map.size()) {
                    this.numOffest.put((String) map.get(Integer.toString(i3)), Integer.valueOf(i10));
                    i10 += 10000;
                }
                channel.close();
                inputStreamOpen.close();
                fileInputStream.close();
                fileOutputStream.close();
                g3e.b(TAG, "IOException: " + iOException2);
            }
        } catch (Exception e10) {
            g3e.b(TAG, "Exception when load number data to cache " + e10);
        }
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        g3e.a(TAG, "onCreate");
        Context context = getContext();
        setDataFilePath(context.getDatabasePath("inquirenoarea.db").getAbsolutePath().replace("inquirenoarea.db", ""));
        xje xjeVarL = xje.l(context);
        this.mDbHelper = xjeVarL;
        try {
            xjeVarL.getReadableDatabase();
        } catch (Throwable th) {
            g3e.b(TAG, "exception when get database : " + th);
            SelfHealUtil.e(getContext());
        }
        this.numList = getPre();
        this.mAccessCodeList = getAccessCodeList();
        this.mLocale = context.getResources().getConfiguration().locale;
        this.VERSION_CN = d97.e();
        this.mUnSupportAttribution = d97.d() || (context.getResources().getInteger(R.integer.product_flavor) == 1 && isTWRegion());
        this.mLocationCache = com.oplus.phonenoareainquire.b.c();
        a aVar = new a("ContactsProviderWorker", 10);
        aVar.start();
        this.mBackgroundHandler = new c(aVar.getLooper());
        scheduleBackgroundTask(1);
        scheduleBackgroundTask(0);
        if (this.numOffest == null || this.mCityData == null) {
            loadNumberDataToCache();
        }
        if (this.mExtendNumberInfo == null) {
            initExtendNumberInfo();
        }
        checkNumberData();
        this.mInitializationLatch = new CountDownLatch(1);
        mb4.i(getContext(), this.VERSION_CN, this.mInitializationLatch);
        sInstace = this;
        g3e.a(TAG, "onCreate  finish");
        return true;
    }

    public void onLocaleChanged() {
        this.mInitializationLatch = new CountDownLatch(1);
        mb4.i(getContext(), this.VERSION_CN, this.mInitializationLatch);
        updateLocaleTask();
    }

    public void performBackgroundTask(int i) {
        if (i == 0) {
            updateLocaleTask();
        } else {
            if (i != 1) {
                return;
            }
            backgroundInit();
        }
    }

    /* JADX WARN: Code duplicated, block: B:118:0x0119 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:136:0x0131 A[SYNTHETIC] */
    @Override // android.content.ContentProvider
    @SuppressLint({"Range"})
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) throws Throwable {
        String str3;
        Throwable th;
        Cursor cursor;
        int i;
        String str4;
        boolean z;
        MatrixCursor matrixCursor;
        Cursor cursorB;
        Exception exc;
        StringBuilder sb;
        SQLiteQueryBuilder sQLiteQueryBuilder = new SQLiteQueryBuilder();
        if (this.mDbHelper == null) {
            g3e.c(TAG, "mDbHelper is null");
            return null;
        }
        String queryParameter = uri.getQueryParameter("countryiso");
        int iMatch = URI_MATCHER.match(uri);
        g3e.a(TAG, " the match is : " + iMatch);
        if (iMatch == 0) {
            return PhoneNoInquireProviderTransaction.INSTANCE.b(this, uri.getPathSegments().get(1), queryParameter, uri.getBooleanQueryParameter(IS_NEED_CARRIER_NAME_KEY, false), uri.getBooleanQueryParameter(NEED_CARRIERNAME_IF_NO_CITYNAME, false), uri.getBooleanQueryParameter(KEY_FORCE_QUERY_DOMESTIC, false), uri.getBooleanQueryParameter(KEY_IS_ROAM, false), uri.getBooleanQueryParameter(KEY_IS_DOMESTIC_SIM, false));
        }
        if (iMatch == 1) {
            if (this.mDb == null) {
                g3e.c(TAG, QUERY_ERROR_DB_NULL);
                return null;
            }
            sQLiteQueryBuilder.setTables("areano_and_citynames");
            return sQLiteQueryBuilder.query(this.mDb, strArr, str, strArr2, null, null, null);
        }
        if (iMatch == 2) {
            if (this.mDb == null) {
                g3e.c(TAG, QUERY_ERROR_DB_NULL);
                return null;
            }
            sQLiteQueryBuilder.setTables("areano_and_citynames");
            if (str == null) {
                str3 = "areano ='" + uri.getPathSegments().get(1) + "'";
            } else {
                str3 = "_id = " + str;
            }
            return sQLiteQueryBuilder.query(this.mDb, strArr, str3, null, null, null, null);
        }
        String str5 = CITYNAME;
        if (iMatch == 11) {
            String queryParameter2 = uri.getQueryParameter(AREANO);
            String queryParameter3 = uri.getQueryParameter(CITYNAME);
            boolean zIsEmpty = TextUtils.isEmpty(queryParameter2);
            Cursor cityNames = getCityNames(strArr2, queryParameter2, uri.getBooleanQueryParameter(NEED_PHONE_NUMBER, false), queryParameter3);
            if (cityNames == null) {
                return zIsEmpty ? new MatrixCursor(new String[]{"_id", AREANO, CITYNAME, GROUP_MEMBER_COUNT}, 1) : new MatrixCursor(new String[]{"_id", "display_name", "photo_id", "account_name", "account_type", "lookup", " phonebook_bucket "}, 1);
            }
            return cityNames;
        }
        switch (iMatch) {
            case 5:
                if (this.mDb == null) {
                    g3e.c(TAG, QUERY_ERROR_DB_NULL);
                    return null;
                }
                sQLiteQueryBuilder.setTables("version");
                return sQLiteQueryBuilder.query(this.mDb, strArr, null, null, null, null, null);
            case 6:
                String str6 = uri.getPathSegments().get(1);
                this.mPhoneNo = str6;
                if (TextUtils.isEmpty(str6)) {
                    return null;
                }
                try {
                    return getGeocodedLocationCursor(this.mPhoneNo.replace("-", "").replace(" ", ""), queryParameter);
                } catch (Exception e) {
                    g3e.b(TAG, "Exception: " + e);
                    return null;
                }
            case 7:
                if (this.mDb == null) {
                    g3e.c(TAG, QUERY_ERROR_DB_NULL);
                    return null;
                }
                sQLiteQueryBuilder.setTables(uri.getBooleanQueryParameter(QUERY_ALL_DATA, false) ? "(SELECT province_and_city_relation._id, province, city, areano, equal_id FROM province_and_city_relation JOIN areano_and_citynames ON (province_and_city_relation._id=areano_and_citynames._id))" : "(SELECT MIN(province_and_city_relation._id) AS _id, province, city, areano, equal_id FROM province_and_city_relation JOIN areano_and_citynames ON (province_and_city_relation._id=areano_and_citynames._id) WHERE (areano<>'9999' AND areano<>'0000') GROUP BY areano,cityname ORDER BY province_and_city_relation.city COLLATE LOCALIZED ASC) ORDER BY province COLLATE LOCALIZED ASC");
                return sQLiteQueryBuilder.query(this.mDb, strArr, null, null, null, null, null);
            case 8:
                if (strArr2 == null) {
                    return null;
                }
                boolean z2 = false;
                boolean booleanQueryParameter = uri.getBooleanQueryParameter(IS_NEED_CARRIER_NAME_KEY, false);
                boolean booleanQueryParameter2 = uri.getBooleanQueryParameter(NEED_CARRIERNAME_IF_NO_CITYNAME, false);
                boolean booleanQueryParameter3 = uri.getBooleanQueryParameter(KEY_FORCE_QUERY_DOMESTIC, false);
                MatrixCursor matrixCursor2 = new MatrixCursor(new String[]{ParserTag.TAG_NUMBER, CITYNAME});
                int i2 = 0;
                while (i2 < strArr2.length) {
                    String str7 = strArr2[i2];
                    try {
                        try {
                            i = i2;
                            matrixCursor = matrixCursor2;
                            String str8 = str5;
                            try {
                                cursorB = PhoneNoInquireProviderTransaction.INSTANCE.b(this, str7, strArr2[i2 + 1], booleanQueryParameter, booleanQueryParameter2, booleanQueryParameter3, false, false);
                                try {
                                    try {
                                        cursorB.moveToFirst();
                                        String[] strArr3 = new String[2];
                                        z = false;
                                        try {
                                            strArr3[0] = str7;
                                            str4 = str8;
                                            try {
                                                strArr3[1] = cursorB.getString(cursorB.getColumnIndex(str4));
                                                matrixCursor.addRow(strArr3);
                                                cursorB.close();
                                                try {
                                                    cursorB.close();
                                                } catch (Exception e2) {
                                                    exc = e2;
                                                    sb = new StringBuilder();
                                                    sb.append("Exception when close oneNumberInfo cursor ");
                                                    sb.append(exc);
                                                    g3e.b(TAG, sb.toString());
                                                }
                                            } catch (Exception unused) {
                                                g3e.b(TAG, "exception when query one single number");
                                                if (cursorB != null) {
                                                    try {
                                                        cursorB.close();
                                                    } catch (Exception e3) {
                                                        exc = e3;
                                                        sb = new StringBuilder();
                                                        sb.append("Exception when close oneNumberInfo cursor ");
                                                        sb.append(exc);
                                                        g3e.b(TAG, sb.toString());
                                                    }
                                                }
                                            }
                                        } catch (Exception unused2) {
                                            str4 = str8;
                                        }
                                    } catch (Exception unused3) {
                                        str4 = str8;
                                        z = false;
                                    }
                                } catch (Throwable th2) {
                                    cursor = cursorB;
                                    th = th2;
                                    if (cursor == null) {
                                        throw th;
                                    }
                                    try {
                                        cursor.close();
                                        throw th;
                                    } catch (Exception e4) {
                                        g3e.b(TAG, "Exception when close oneNumberInfo cursor " + e4);
                                        throw th;
                                    }
                                }
                            } catch (Exception unused4) {
                                str4 = str8;
                                z = false;
                                cursorB = null;
                                g3e.b(TAG, "exception when query one single number");
                                if (cursorB != null) {
                                    cursorB.close();
                                }
                                i2 = i + 2;
                                str5 = str4;
                                matrixCursor2 = matrixCursor;
                                z2 = z;
                            }
                        } catch (Exception unused5) {
                            i = i2;
                            str4 = str5;
                            z = z2;
                            matrixCursor = matrixCursor2;
                        }
                        i2 = i + 2;
                        str5 = str4;
                        matrixCursor2 = matrixCursor;
                        z2 = z;
                    } catch (Throwable th3) {
                        th = th3;
                        cursor = null;
                    }
                }
                return matrixCursor2;
            case 9:
                try {
                    this.mInitializationLatch.await(1000L, TimeUnit.MILLISECONDS);
                    return mb4.INSTANCE.d();
                } catch (InterruptedException e5) {
                    g3e.b(TAG, "wait overtime , return a empty cursor" + e5);
                    return new MatrixCursor(new String[]{mb4.COL_COUNTRY_ISO, mb4.COL_DISPLAY_NAME, mb4.COL_COUNTRY_CODE});
                }
            default:
                return null;
        }
    }

    public void readPhoneNumberDataToCache(DataInputStream dataInputStream) {
        try {
            PHONE_NUMBER_DATA_EXECUTOR.execute(new b(dataInputStream));
        } catch (Exception e) {
            g3e.b(TAG, "Exception execute readPhoneNumberData async task " + e);
        }
    }

    public void scheduleBackgroundTask(int i) {
        this.mBackgroundHandler.sendEmptyMessage(i);
    }

    public void setInitializationLatch(CountDownLatch countDownLatch) {
        this.mInitializationLatch = countDownLatch;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        SQLiteDatabase writableDatabase = this.mDbHelper.getWritableDatabase();
        if (URI_MATCHER.match(uri) == 5) {
            return writableDatabase.update("version", contentValues, null, null);
        }
        return 0;
    }

    private String getCountryCodeOfNumber(String str, String str2, boolean z) {
        if (DEBUG) {
            g3e.a(TAG, "getCountryCodeOfNumber countryIso = " + str2);
        }
        List regionCodesForCountryCode = null;
        if (!TextUtils.isEmpty(str)) {
            PhoneNumberUtil phoneNumberUtil = PhoneNumberUtil.getInstance();
            try {
                Phonenumber.PhoneNumber andKeepRawInput = phoneNumberUtil.parseAndKeepRawInput(str, str2);
                if (andKeepRawInput != null) {
                    Phonenumber.PhoneNumber.CountryCodeSource countryCodeSource = andKeepRawInput.getCountryCodeSource();
                    if (DEBUG) {
                        g3e.a(TAG, "getCountryCodeOfNumber countryCodeSource = " + countryCodeSource);
                    }
                    if (z && countryCodeSource == Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITHOUT_PLUS_SIGN && andKeepRawInput.getCountryCode() == 1) {
                        return UNKNOWN_NUMBER_COUNTRY_CODE;
                    }
                    regionCodesForCountryCode = countryCodeSource != Phonenumber.PhoneNumber.CountryCodeSource.FROM_NUMBER_WITH_IDD ? phoneNumberUtil.getRegionCodesForCountryCode(andKeepRawInput.getCountryCode()) : null;
                    if (regionCodesForCountryCode == null && str.startsWith("00")) {
                        String rawInput = andKeepRawInput.getRawInput();
                        if (!TextUtils.isEmpty(rawInput)) {
                            if (rawInput.startsWith("00" + andKeepRawInput.getCountryCode())) {
                                regionCodesForCountryCode = phoneNumberUtil.getRegionCodesForCountryCode(andKeepRawInput.getCountryCode());
                            }
                        }
                    }
                }
            } catch (NumberParseException e) {
                g3e.b(TAG, "e = " + e);
            }
        }
        return (regionCodesForCountryCode == null || regionCodesForCountryCode.contains(str2)) ? str2 : (String) regionCodesForCountryCode.get(0);
    }
}
