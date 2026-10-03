package com.nearme.instant.xcard.provider;

import android.content.ContentProviderClient;
import android.content.ContentValues;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import com.heytap.health.watch.notification.impl.pull.NotificationApiService;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
public class PublicSharedPreferences implements SharedPreferences {
    private static final String KEY = "value";
    private static final String PATH_APPLY = "apply";
    private static final String PATH_COMMIT = "commit";
    private static final String PATH_CONTAINS = "contains";
    private static final String PATH_GET_ALL = "getAll";
    private static final String PATH_GET_BOOLEAN = "getBoolean";
    private static final String PATH_GET_FLOAT = "getFloat";
    private static final String PATH_GET_INT = "getInt";
    private static final String PATH_GET_LONG = "getLong";
    private static final String PATH_GET_STRING = "getString";
    private static final String PUBLIC_SHARED_PREF = "public_shared_pref";
    private static final String TAG = "PublicSharedPreferences";
    private static volatile Uri sAuthorityUrl;
    private Context mContext;

    public final class EditorImpl implements SharedPreferences.Editor {
        private final Map<String, Object> mModified = new HashMap();
        private boolean mClear = false;

        public EditorImpl() {
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        private boolean setValue(String str) {
            boolean z;
            boolean z2;
            PublicSharedPreferences.this.checkInitAuthority();
            String[] strArr = {String.valueOf(this.mClear)};
            synchronized (this) {
                Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.withAppendedPath(PublicSharedPreferences.sAuthorityUrl, PublicSharedPreferences.PUBLIC_SHARED_PREF), str);
                ContentValues contentValuesContentValuesNewInstance = ReflectionUtil.contentValuesNewInstance((HashMap) this.mModified);
                ContentProviderClient contentProviderClient = null;
                z = false;
                try {
                    try {
                        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient = PublicSharedPreferences.this.mContext.getContentResolver().acquireUnstableContentProviderClient(uriWithAppendedPath);
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            try {
                                if (contentProviderClientAcquireUnstableContentProviderClient.update(uriWithAppendedPath, contentValuesContentValuesNewInstance, null, strArr) > 0) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                            } catch (Exception e2) {
                                e = e2;
                                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                e.printStackTrace();
                                if (contentProviderClient != null) {
                                    contentProviderClient.close();
                                }
                                this.mModified.clear();
                                this.mClear = false;
                            } catch (Throwable th) {
                                th = th;
                                contentProviderClient = contentProviderClientAcquireUnstableContentProviderClient;
                                if (contentProviderClient != null) {
                                    contentProviderClient.close();
                                }
                                this.mModified.clear();
                                this.mClear = z;
                                throw th;
                            }
                        } else {
                            z2 = false;
                        }
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        this.mModified.clear();
                        this.mClear = false;
                        z = z2;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                } catch (Exception e3) {
                    e = e3;
                }
            }
            return z;
        }

        @Override // android.content.SharedPreferences.Editor
        public void apply() {
            setValue(PublicSharedPreferences.PATH_APPLY);
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor clear() {
            synchronized (this) {
                this.mClear = true;
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public boolean commit() {
            return setValue("commit");
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putBoolean(String str, boolean z) {
            synchronized (this) {
                this.mModified.put(str, Boolean.valueOf(z));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putFloat(String str, float f) {
            synchronized (this) {
                this.mModified.put(str, Float.valueOf(f));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putInt(String str, int i) {
            synchronized (this) {
                this.mModified.put(str, Integer.valueOf(i));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putLong(String str, long j2) {
            synchronized (this) {
                this.mModified.put(str, Long.valueOf(j2));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putString(String str, String str2) {
            synchronized (this) {
                this.mModified.put(str, str2);
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor putStringSet(String str, Set<String> set) {
            synchronized (this) {
                this.mModified.put(str, set == null ? null : new HashSet(set));
            }
            return this;
        }

        @Override // android.content.SharedPreferences.Editor
        public SharedPreferences.Editor remove(String str) {
            synchronized (this) {
                this.mModified.put(str, null);
            }
            return this;
        }
    }

    public static class ReflectionUtil {
        private ReflectionUtil() {
        }

        public static ContentValues contentValuesNewInstance(HashMap<String, Object> map) {
            try {
                Constructor declaredConstructor = ContentValues.class.getDeclaredConstructor(HashMap.class);
                declaredConstructor.setAccessible(true);
                return (ContentValues) declaredConstructor.newInstance(map);
            } catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | InvocationTargetException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    public PublicSharedPreferences(Context context) {
        this.mContext = context.getApplicationContext();
        checkInitAuthority();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void checkInitAuthority() {
        if (sAuthorityUrl == null) {
            synchronized (this) {
                if (sAuthorityUrl == null) {
                    sAuthorityUrl = Uri.parse(NotificationApiService.CONTENT + "com.nearme.instant.public.sp");
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    private Object getValue(String str, String str2, Object obj) throws Throwable {
        Throwable th;
        ContentProviderClient contentProviderClientAcquireUnstableContentProviderClient;
        Cursor cursorQuery;
        Bundle extras;
        checkInitAuthority();
        Uri uriWithAppendedPath = Uri.withAppendedPath(Uri.withAppendedPath(sAuthorityUrl, PUBLIC_SHARED_PREF), str);
        String[] strArr = new String[2];
        strArr[0] = str2;
        Object obj2 = null;
        strArr[1] = obj == null ? null : String.valueOf(obj);
        try {
            contentProviderClientAcquireUnstableContentProviderClient = this.mContext.getContentResolver().acquireUnstableContentProviderClient(uriWithAppendedPath);
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                try {
                    try {
                        cursorQuery = contentProviderClientAcquireUnstableContentProviderClient.query(uriWithAppendedPath, null, null, strArr, null);
                    } catch (Exception e2) {
                        e = e2;
                        e.printStackTrace();
                        if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                            contentProviderClientAcquireUnstableContentProviderClient.close();
                        }
                        cursorQuery = null;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                        contentProviderClientAcquireUnstableContentProviderClient.close();
                    }
                    throw th;
                }
            } else {
                cursorQuery = null;
            }
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
        } catch (Exception e3) {
            e = e3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
        } catch (Throwable th3) {
            th = th3;
            contentProviderClientAcquireUnstableContentProviderClient = null;
            if (contentProviderClientAcquireUnstableContentProviderClient != null) {
                contentProviderClientAcquireUnstableContentProviderClient.close();
            }
            throw th;
        }
        if (cursorQuery != null) {
            try {
                extras = cursorQuery.getExtras();
            } catch (RuntimeException e4) {
                e4.printStackTrace();
                extras = null;
            }
            if (extras != null) {
                obj2 = extras.get("value");
                extras.clear();
            }
            cursorQuery.close();
        }
        return obj2 != null ? obj2 : obj;
    }

    @Override // android.content.SharedPreferences
    public boolean contains(String str) {
        return ((Boolean) getValue(PATH_CONTAINS, str, null)).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public SharedPreferences.Editor edit() {
        return new EditorImpl();
    }

    @Override // android.content.SharedPreferences
    public Map<String, ?> getAll() {
        Map<String, ?> map = (Map) getValue(PATH_GET_ALL, null, null);
        return map != null ? map : new HashMap();
    }

    @Override // android.content.SharedPreferences
    public boolean getBoolean(String str, boolean z) {
        return ((Boolean) getValue(PATH_GET_BOOLEAN, str, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public float getFloat(String str, float f) {
        return ((Float) getValue(PATH_GET_FLOAT, str, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public int getInt(String str, int i) {
        return ((Integer) getValue(PATH_GET_INT, str, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public long getLong(String str, long j2) {
        return ((Long) getValue(PATH_GET_LONG, str, Long.valueOf(j2))).longValue();
    }

    @Override // android.content.SharedPreferences
    public String getString(String str, String str2) {
        return (String) getValue(PATH_GET_STRING, str, str2);
    }

    @Override // android.content.SharedPreferences
    public Set<String> getStringSet(String str, Set<String> set) {
        return (Set) getValue(PATH_GET_STRING, str, set);
    }

    @Override // android.content.SharedPreferences
    public void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }

    @Override // android.content.SharedPreferences
    public void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
    }
}
