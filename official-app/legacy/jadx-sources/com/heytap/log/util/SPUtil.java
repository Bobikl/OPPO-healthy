package com.heytap.log.util;

import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes19.dex */
public class SPUtil {
    public static final String CLEAR_TRACE_DATE = "clearTraceDate";
    public static final String FILE_NAME = "share_data";
    public static final String HAS_CHECK_TIMES = "hasCheckTimes";
    public static final String LAST_CHECK_TIME = "lastCheckTime";
    public static final String MAX_TIME_PER_DAY = "maxTimePerDay";
    private static final Map<String, SPUtil> SP_UTILS_MAP = new HashMap();
    public static final String TRACE_ID = "traceIds";
    private SharedPreferences sp;

    private SPUtil(String str) {
        this.sp = AppUtil.getAppSpContext().getSharedPreferences(str, 0);
    }

    public static SPUtil getInstance() {
        return getInstance(FILE_NAME, 4);
    }

    private static boolean isSpace(String str) {
        if (str == null) {
            return true;
        }
        int length = str.length();
        for (int i = 0; i < length; i++) {
            if (!Character.isWhitespace(str.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public void clear() {
        clear(false);
    }

    public boolean contains(@NonNull String str) {
        return this.sp.contains(str);
    }

    public Map<String, ?> getAll() {
        return this.sp.getAll();
    }

    public boolean getBoolean(@NonNull String str) {
        return getBoolean(str, false);
    }

    public float getFloat(@NonNull String str) {
        return getFloat(str, -1.0f);
    }

    public int getInt(@NonNull String str) {
        return getInt(str, -1);
    }

    public long getLong(@NonNull String str) {
        if ((LAST_CHECK_TIME.equalsIgnoreCase(str) || HAS_CHECK_TIMES.equalsIgnoreCase(str)) && !TextUtils.isEmpty(AppUtil.sProcessName)) {
            str = str + "_" + AppUtil.sProcessName;
        }
        return getLong(str, -1L);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x003c A[Catch: IOException -> 0x004e, PHI: r1
  0x003c: PHI (r1v9 java.io.ObjectInputStream) = (r1v7 java.io.ObjectInputStream), (r1v8 java.io.ObjectInputStream), (r1v10 java.io.ObjectInputStream) binds: [B:18:0x003a, B:23:0x0046, B:26:0x004b] A[DONT_GENERATE, DONT_INLINE], TryCatch #10 {IOException -> 0x004e, blocks: (B:17:0x0037, B:19:0x003c, B:21:0x0041, B:25:0x0048), top: B:39:0x0019 }] */
    public <T> T getObject(String str, Class<T> cls) throws Throwable {
        ObjectInputStream objectInputStream;
        ObjectInputStream objectInputStream2 = null;
        if (this.sp.contains(str)) {
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(Base64.decode(this.sp.getString(str, null), 0));
            try {
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        T t = (T) objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                            objectInputStream.close();
                        } catch (IOException unused) {
                        }
                        return t;
                    } catch (StreamCorruptedException unused2) {
                        byteArrayInputStream.close();
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (IOException unused3) {
                        byteArrayInputStream.close();
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (ClassNotFoundException unused4) {
                        byteArrayInputStream.close();
                        if (objectInputStream != null) {
                            objectInputStream.close();
                        }
                        return null;
                    } catch (Throwable th) {
                        th = th;
                        objectInputStream2 = objectInputStream;
                        try {
                            byteArrayInputStream.close();
                            if (objectInputStream2 != null) {
                                objectInputStream2.close();
                            }
                        } catch (IOException unused5) {
                        }
                        throw th;
                    }
                } catch (IOException unused6) {
                }
            } catch (StreamCorruptedException unused7) {
                objectInputStream = null;
            } catch (IOException unused8) {
                objectInputStream = null;
            } catch (ClassNotFoundException unused9) {
                objectInputStream = null;
            } catch (Throwable th2) {
                th = th2;
            }
        }
        return null;
    }

    public String getString(@NonNull String str) {
        return getString(str, "");
    }

    public Set<String> getStringSet(@NonNull String str) {
        return getStringSet(str, Collections.emptySet());
    }

    public <T> T getValue(String str, Class<T> cls) {
        return (T) getValue(str, cls, this.sp);
    }

    public boolean hasBeenUpload(long j2) {
        String[] strArrSplit;
        String string = getInstance().getString(TRACE_ID, "");
        String strValueOf = String.valueOf(j2);
        if (!TextUtils.isEmpty(string) && (strArrSplit = string.split(",")) != null && strArrSplit.length != 0) {
            for (String str : strArrSplit) {
                if (TextUtils.equals(str, strValueOf)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void put(@NonNull final String str, final String str2) {
        ThreadUtil.executeInThreadPool(new Runnable() { // from class: com.heytap.log.util.SPUtil.1
            @Override // java.lang.Runnable
            public void run() {
                if (str.contains("dto")) {
                    SPUtil.this.put(str, str2, true);
                } else {
                    SPUtil.this.put(str, str2, false);
                }
            }
        });
    }

    public void remove(@NonNull String str) {
        remove(str, false);
    }

    public void setObject(String str, Object obj) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(obj);
                    String str2 = new String(Base64.encode(byteArrayOutputStream.toByteArray(), 0));
                    SharedPreferences.Editor editorEdit = this.sp.edit();
                    editorEdit.putString(str, str2);
                    editorEdit.commit();
                    byteArrayOutputStream.close();
                    objectOutputStream2.close();
                } catch (IOException e2) {
                    e = e2;
                    objectOutputStream = objectOutputStream2;
                    e.printStackTrace();
                    byteArrayOutputStream.close();
                    if (objectOutputStream != null) {
                        objectOutputStream.close();
                    }
                } catch (Throwable th) {
                    th = th;
                    objectOutputStream = objectOutputStream2;
                    try {
                        byteArrayOutputStream.close();
                        if (objectOutputStream != null) {
                            objectOutputStream.close();
                        }
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                    throw th;
                }
            } catch (IOException e4) {
                e = e4;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
    }

    public static SPUtil getInstance(int i) {
        return getInstance("", i);
    }

    private <T> T getValue(String str, Class<T> cls, SharedPreferences sharedPreferences) {
        try {
            T tNewInstance = cls.newInstance();
            if (tNewInstance instanceof Integer) {
                return (T) Integer.valueOf(sharedPreferences.getInt(str, 0));
            }
            if (tNewInstance instanceof String) {
                return (T) sharedPreferences.getString(str, "");
            }
            if (tNewInstance instanceof Boolean) {
                return (T) Boolean.valueOf(sharedPreferences.getBoolean(str, false));
            }
            if (tNewInstance instanceof Long) {
                return (T) Long.valueOf(sharedPreferences.getLong(str, 0L));
            }
            if (tNewInstance instanceof Float) {
                return (T) Float.valueOf(sharedPreferences.getFloat(str, 0.0f));
            }
            return null;
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            return null;
        } catch (InstantiationException e3) {
            e3.printStackTrace();
            return null;
        }
    }

    public void clear(boolean z) {
        if (z) {
            this.sp.edit().clear().commit();
        } else {
            this.sp.edit().clear().apply();
        }
    }

    public boolean getBoolean(@NonNull String str, boolean z) {
        return this.sp.getBoolean(str, z);
    }

    public float getFloat(@NonNull String str, float f) {
        return this.sp.getFloat(str, f);
    }

    public int getInt(@NonNull String str, int i) {
        if (MAX_TIME_PER_DAY.equalsIgnoreCase(str) && !TextUtils.isEmpty(AppUtil.sProcessName)) {
            str = str + "_" + AppUtil.sProcessName;
        }
        return this.sp.getInt(str, i);
    }

    public String getString(@NonNull String str, String str2) {
        return this.sp.getString(str, str2);
    }

    public Set<String> getStringSet(@NonNull String str, Set<String> set) {
        return this.sp.getStringSet(str, set);
    }

    public void remove(@NonNull String str, boolean z) {
        if (z) {
            this.sp.edit().remove(str).commit();
        } else {
            this.sp.edit().remove(str).apply();
        }
    }

    private SPUtil(String str, int i) {
        this.sp = AppUtil.getAppSpContext().getSharedPreferences(str, i);
    }

    public static SPUtil getInstance(String str) {
        return getInstance(str, 0);
    }

    public void put(@NonNull String str, String str2, boolean z) {
        if (z) {
            this.sp.edit().putString(str, str2).commit();
        } else {
            this.sp.edit().putString(str, str2).apply();
        }
    }

    public static SPUtil getInstance(String str, int i) {
        if (isSpace(str)) {
            str = "SPUtil";
        }
        Map<String, SPUtil> map = SP_UTILS_MAP;
        SPUtil sPUtil = map.get(str);
        if (sPUtil == null) {
            synchronized (SPUtil.class) {
                sPUtil = map.get(str);
                if (sPUtil == null) {
                    sPUtil = new SPUtil(str, i);
                    map.put(str, sPUtil);
                }
            }
        }
        return sPUtil;
    }

    public void put(@NonNull String str, int i) {
        put(str, i, false);
    }

    public long getLong(@NonNull String str, long j2) {
        return this.sp.getLong(str, j2);
    }

    public void put(@NonNull String str, int i, boolean z) {
        if (z) {
            this.sp.edit().putInt(str, i).commit();
        } else {
            this.sp.edit().putInt(str, i).apply();
        }
    }

    public void put(@NonNull String str, long j2) {
        if ((HAS_CHECK_TIMES.equalsIgnoreCase(str) || LAST_CHECK_TIME.equalsIgnoreCase(str)) && !TextUtils.isEmpty(AppUtil.sProcessName)) {
            str = str + "_" + AppUtil.sProcessName;
        }
        put(str, j2, false);
    }

    public void put(@NonNull String str, long j2, boolean z) {
        if (z) {
            this.sp.edit().putLong(str, j2).commit();
        } else {
            this.sp.edit().putLong(str, j2).apply();
        }
    }

    public void put(@NonNull String str, float f) {
        put(str, f, false);
    }

    public void put(@NonNull String str, float f, boolean z) {
        if (z) {
            this.sp.edit().putFloat(str, f).commit();
        } else {
            this.sp.edit().putFloat(str, f).apply();
        }
    }

    public void put(@NonNull String str, boolean z) {
        put(str, z, false);
    }

    public void put(@NonNull String str, boolean z, boolean z2) {
        if (z2) {
            this.sp.edit().putBoolean(str, z).commit();
        } else {
            this.sp.edit().putBoolean(str, z).apply();
        }
    }

    public void put(@NonNull String str, Set<String> set) {
        put(str, set, false);
    }

    public void put(@NonNull String str, Set<String> set, boolean z) {
        if (z) {
            this.sp.edit().putStringSet(str, set).commit();
        } else {
            this.sp.edit().putStringSet(str, set).apply();
        }
    }
}
