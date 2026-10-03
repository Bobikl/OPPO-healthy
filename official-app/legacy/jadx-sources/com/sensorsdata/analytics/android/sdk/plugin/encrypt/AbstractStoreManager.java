package com.sensorsdata.analytics.android.sdk.plugin.encrypt;

import android.content.Context;
import android.text.TextUtils;
import android.util.LruCache;
import com.sensorsdata.analytics.android.sdk.SALog;
import com.sensorsdata.analytics.android.sdk.util.SASpUtils;
import java.io.File;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/* JADX INFO: loaded from: classes10.dex */
public abstract class AbstractStoreManager {
    private static final String TAG = "SA.AbstractStoreManager";
    private String mMaxPluginType;
    private StorePlugin mMaxPriorityPlugin;
    protected boolean mDefaultState = true;
    private final List<StorePlugin> mStorePluginList = new ArrayList();
    private final LruCacheData mLruCacheSPData = new LruCacheData(10);
    private final Lock mLock = new ReentrantLock(true);
    private final Set<String> mStoreTypes = new HashSet();

    public class LruCacheData {
        private LruCache<String, Object> mCacheSPData;

        public LruCacheData(int i) {
            this.mCacheSPData = new LruCache<>(i);
        }

        public Object get(String str) {
            return this.mCacheSPData.get(AbstractStoreManager.this.mMaxPluginType + str);
        }

        public void put(String str, Object obj) {
            this.mCacheSPData.put(AbstractStoreManager.this.mMaxPluginType + str, obj);
        }

        public void remove(String str) {
            this.mCacheSPData.remove(AbstractStoreManager.this.mMaxPluginType + str);
        }
    }

    private <T> T getValue(String str, String str2, T t) {
        Object string;
        StorePlugin storePlugin = this.mMaxPriorityPlugin;
        for (StorePlugin storePlugin2 : this.mStorePluginList) {
            if (storePlugin2 instanceof DefaultStorePlugin) {
                DefaultStorePlugin defaultStorePlugin = (DefaultStorePlugin) storePlugin2;
                if (defaultStorePlugin.storeKeys() != null && defaultStorePlugin.storeKeys().contains(str)) {
                    storePlugin = storePlugin2;
                    break;
                }
            }
        }
        str2.hashCode();
        switch (str2) {
            case "String":
                string = storePlugin.getString(storePlugin.type() + str);
                break;
            case "Integer":
                string = storePlugin.getInteger(storePlugin.type() + str);
                break;
            case "Bool":
                string = storePlugin.getBool(storePlugin.type() + str);
                break;
            case "Long":
                string = storePlugin.getLong(storePlugin.type() + str);
                break;
            case "Float":
                string = storePlugin.getFloat(storePlugin.type() + str);
                break;
            default:
                string = null;
                break;
        }
        return string == null ? t : (T) string;
    }

    private void removeUselessValue(String str) {
        for (StorePlugin storePlugin : this.mStorePluginList) {
            if (storePlugin != this.mMaxPriorityPlugin) {
                storePlugin.remove(storePlugin.type() + str);
            }
        }
    }

    private void storeKeys(String str, Object obj, String str2) {
        StorePlugin storePlugin = this.mMaxPriorityPlugin;
        for (StorePlugin storePlugin2 : this.mStorePluginList) {
            if (storePlugin2 instanceof DefaultStorePlugin) {
                DefaultStorePlugin defaultStorePlugin = (DefaultStorePlugin) storePlugin2;
                if (defaultStorePlugin.storeKeys() != null && defaultStorePlugin.storeKeys().contains(str)) {
                    storePlugin = storePlugin2;
                    break;
                }
            }
        }
        str2.hashCode();
        switch (str2) {
            case "String":
                storePlugin.setString(storePlugin.type() + str, (String) obj);
                break;
            case "Integer":
                storePlugin.setInteger(storePlugin.type() + str, ((Integer) obj).intValue());
                break;
            case "Bool":
                storePlugin.setBool(storePlugin.type() + str, ((Boolean) obj).booleanValue());
                break;
            case "Long":
                storePlugin.setLong(storePlugin.type() + str, ((Long) obj).longValue());
                break;
            case "Float":
                storePlugin.setFloat(storePlugin.type() + str, ((Float) obj).floatValue());
                break;
        }
    }

    public boolean getBool(String str, boolean z) {
        boolean zBooleanValue;
        this.mLock.lock();
        try {
            try {
                Boolean bool = (Boolean) this.mLruCacheSPData.get(str);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    if (!this.mDefaultState) {
                        for (StorePlugin storePlugin : this.mStorePluginList) {
                            Boolean bool2 = storePlugin.getBool(storePlugin.type() + str);
                            if (bool2 != null) {
                                if (storePlugin != this.mMaxPriorityPlugin) {
                                    storePlugin.remove(storePlugin.type() + str);
                                    this.mMaxPriorityPlugin.setBool(this.mMaxPluginType + str, bool2.booleanValue());
                                }
                                this.mLruCacheSPData.put(str, bool2);
                                bool = bool2;
                                break;
                            }
                            bool = bool2;
                        }
                        if (bool != null) {
                            z = bool.booleanValue();
                        }
                        return z;
                    }
                    zBooleanValue = ((Boolean) getValue(str, "Bool", Boolean.valueOf(z))).booleanValue();
                }
                return zBooleanValue;
            } catch (Exception e2) {
                SALog.i(TAG, "get data failed,key = " + str, e2);
                return z;
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public float getFloat(String str, float f) {
        float fFloatValue;
        this.mLock.lock();
        try {
            try {
                Float f2 = (Float) this.mLruCacheSPData.get(str);
                if (f2 != null) {
                    fFloatValue = f2.floatValue();
                } else {
                    if (!this.mDefaultState) {
                        for (StorePlugin storePlugin : this.mStorePluginList) {
                            Float f3 = storePlugin.getFloat(storePlugin.type() + str);
                            if (f3 != null) {
                                if (storePlugin != this.mMaxPriorityPlugin) {
                                    storePlugin.remove(storePlugin.type() + str);
                                    this.mMaxPriorityPlugin.setFloat(this.mMaxPluginType + str, f3.floatValue());
                                }
                                this.mLruCacheSPData.put(str, f3);
                                f2 = f3;
                                break;
                            }
                            f2 = f3;
                        }
                        if (f2 != null) {
                            f = f2.floatValue();
                        }
                        return f;
                    }
                    fFloatValue = ((Float) getValue(str, "Float", Float.valueOf(f))).floatValue();
                }
                return fFloatValue;
            } catch (Exception e2) {
                SALog.i(TAG, "get data failed,key = " + str, e2);
                return f;
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public int getInteger(String str, int i) {
        int iIntValue;
        this.mLock.lock();
        try {
            try {
                Integer num = (Integer) this.mLruCacheSPData.get(str);
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    if (!this.mDefaultState) {
                        for (StorePlugin storePlugin : this.mStorePluginList) {
                            Integer integer = storePlugin.getInteger(storePlugin.type() + str);
                            if (integer != null) {
                                if (storePlugin != this.mMaxPriorityPlugin) {
                                    storePlugin.remove(storePlugin.type() + str);
                                    this.mMaxPriorityPlugin.setInteger(this.mMaxPluginType + str, integer.intValue());
                                }
                                this.mLruCacheSPData.put(str, integer);
                                num = integer;
                                break;
                            }
                            num = integer;
                        }
                        if (num != null) {
                            i = num.intValue();
                        }
                        return i;
                    }
                    iIntValue = ((Integer) getValue(str, "Integer", Integer.valueOf(i))).intValue();
                }
                return iIntValue;
            } catch (Exception e2) {
                SALog.i(TAG, "get data failed,key = " + str, e2);
                return i;
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public Long getLong(String str, long j2) {
        this.mLock.lock();
        try {
            Long l2 = (Long) this.mLruCacheSPData.get(str);
            if (l2 == null) {
                if (!this.mDefaultState) {
                    for (StorePlugin storePlugin : this.mStorePluginList) {
                        Long l3 = storePlugin.getLong(storePlugin.type() + str);
                        if (l3 != null) {
                            if (storePlugin != this.mMaxPriorityPlugin) {
                                storePlugin.remove(storePlugin.type() + str);
                                this.mMaxPriorityPlugin.setLong(this.mMaxPluginType + str, l3.longValue());
                            }
                            this.mLruCacheSPData.put(str, l3);
                            l2 = l3;
                            break;
                        }
                        l2 = l3;
                    }
                    return Long.valueOf(l2 == null ? j2 : l2.longValue());
                }
                l2 = (Long) getValue(str, "Long", Long.valueOf(j2));
            }
            return l2;
        } catch (Exception e2) {
            SALog.i(TAG, "get data failed,key = " + str, e2);
            return Long.valueOf(j2);
        } finally {
            this.mLock.unlock();
        }
    }

    public String getString(String str, String str2) {
        this.mLock.lock();
        try {
            try {
                String str3 = (String) this.mLruCacheSPData.get(str);
                if (str3 == null) {
                    if (!this.mDefaultState) {
                        for (StorePlugin storePlugin : this.mStorePluginList) {
                            String string = storePlugin.getString(storePlugin.type() + str);
                            if (!TextUtils.isEmpty(string)) {
                                if (storePlugin != this.mMaxPriorityPlugin) {
                                    storePlugin.remove(storePlugin.type() + str);
                                    this.mMaxPriorityPlugin.setString(this.mMaxPluginType + str, string);
                                }
                                this.mLruCacheSPData.put(str, string);
                                str3 = string;
                                break;
                            }
                            str3 = string;
                        }
                        if (str3 != null) {
                            str2 = str3;
                        }
                        this.mLock.unlock();
                        return str2;
                    }
                    str3 = (String) getValue(str, "String", str2);
                }
                this.mLock.unlock();
                return str3;
            } catch (Exception e2) {
                SALog.i(TAG, "get data failed,key = " + str, e2);
                this.mLock.unlock();
                return str2;
            }
        } catch (Throwable th) {
            this.mLock.unlock();
            throw th;
        }
    }

    public boolean isExists(String str) {
        this.mLock.lock();
        try {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (StorePlugin storePlugin : this.mStorePluginList) {
                if (storePlugin.isExists(storePlugin.type() + str)) {
                    return true;
                }
            }
        } catch (Exception e2) {
            SALog.i(TAG, "isExists failed,key = " + str, e2);
        } finally {
            this.mLock.unlock();
        }
        return false;
    }

    public boolean isRegisterPlugin(Context context, String str) {
        try {
            File file = new File("data/data/" + context.getPackageName() + "/shared_prefs", str + ".xml");
            if (!file.exists()) {
                return false;
            }
            if (SASpUtils.getSharedPreferences(context, str, 0).getAll().size() == 0) {
                SALog.i(TAG, "delete sp: " + str);
                return true ^ file.delete();
            }
        } catch (Exception e2) {
            SALog.printStackTrace(e2);
        }
        return true;
    }

    public void registerPlugin(StorePlugin storePlugin) {
        if (storePlugin == null) {
            return;
        }
        String strType = storePlugin.type();
        if (TextUtils.isEmpty(strType)) {
            SALog.i(TAG, "PluginType is null");
            return;
        }
        if (this.mStoreTypes.contains(strType)) {
            for (StorePlugin storePlugin2 : this.mStorePluginList) {
                if (TextUtils.equals(strType, storePlugin2.type())) {
                    this.mStorePluginList.remove(storePlugin2);
                    break;
                }
            }
        } else {
            this.mStoreTypes.add(strType);
        }
        this.mStorePluginList.add(0, storePlugin);
        this.mMaxPriorityPlugin = storePlugin;
        this.mMaxPluginType = storePlugin.type();
    }

    public void remove(String str) {
        this.mLock.lock();
        try {
            try {
                if (this.mDefaultState) {
                    StorePlugin storePlugin = this.mMaxPriorityPlugin;
                    for (StorePlugin storePlugin2 : this.mStorePluginList) {
                        if ((storePlugin2 instanceof DefaultStorePlugin) && ((DefaultStorePlugin) storePlugin2).storeKeys() != null && ((DefaultStorePlugin) storePlugin2).storeKeys().contains(str)) {
                            storePlugin = storePlugin2;
                            break;
                        }
                    }
                    storePlugin.remove(storePlugin.type() + str);
                } else {
                    for (StorePlugin storePlugin3 : this.mStorePluginList) {
                        storePlugin3.remove(storePlugin3.type() + str);
                    }
                }
                this.mLruCacheSPData.remove(str);
            } catch (Exception e2) {
                SALog.i(TAG, "remove failed,key = " + str, e2);
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void setBool(String str, boolean z) {
        this.mLock.lock();
        try {
            try {
                if (this.mDefaultState) {
                    storeKeys(str, Boolean.valueOf(z), "Bool");
                    return;
                }
                removeUselessValue(str);
                this.mMaxPriorityPlugin.setBool(this.mMaxPluginType + str, z);
                this.mLruCacheSPData.put(str, Boolean.valueOf(z));
            } catch (Exception e2) {
                SALog.i(TAG, "save data failed,key = " + str + "value = " + z, e2);
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void setFloat(String str, float f) {
        this.mLock.lock();
        try {
            try {
                if (this.mDefaultState) {
                    storeKeys(str, Float.valueOf(f), "Float");
                    return;
                }
                removeUselessValue(str);
                this.mMaxPriorityPlugin.setFloat(this.mMaxPluginType + str, f);
                this.mLruCacheSPData.put(str, Float.valueOf(f));
            } catch (Exception e2) {
                SALog.i(TAG, "save data failed,key = " + str + "value = " + f, e2);
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void setInteger(String str, int i) {
        this.mLock.lock();
        try {
            try {
                if (this.mDefaultState) {
                    storeKeys(str, Integer.valueOf(i), "Integer");
                    return;
                }
                removeUselessValue(str);
                this.mMaxPriorityPlugin.setInteger(this.mMaxPluginType + str, i);
                this.mLruCacheSPData.put(str, Integer.valueOf(i));
            } catch (Exception e2) {
                SALog.i(TAG, "save data failed,key = " + str + "value = " + i, e2);
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void setLong(String str, long j2) {
        this.mLock.lock();
        try {
            try {
                if (this.mDefaultState) {
                    storeKeys(str, Long.valueOf(j2), "Long");
                    return;
                }
                removeUselessValue(str);
                this.mMaxPriorityPlugin.setLong(this.mMaxPluginType + str, j2);
                this.mLruCacheSPData.put(str, Long.valueOf(j2));
            } catch (Exception e2) {
                SALog.i(TAG, "save data failed,key = " + str + "value = " + j2, e2);
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void setString(String str, String str2) {
        this.mLock.lock();
        try {
            try {
                if (this.mDefaultState) {
                    storeKeys(str, str2, "String");
                    return;
                }
                if (str2 == null) {
                    for (StorePlugin storePlugin : this.mStorePluginList) {
                        storePlugin.remove(storePlugin.type() + str);
                    }
                    this.mLruCacheSPData.remove(str);
                } else {
                    removeUselessValue(str);
                    this.mMaxPriorityPlugin.setString(this.mMaxPluginType + str, str2);
                    this.mLruCacheSPData.put(str, str2);
                }
            } catch (Exception e2) {
                SALog.i(TAG, "save data failed,key = " + str + "value = " + str2, e2);
            }
        } finally {
            this.mLock.unlock();
        }
    }

    public void upgrade() {
        this.mLock.lock();
        try {
            for (int size = this.mStorePluginList.size() - 1; size >= 0; size--) {
                StorePlugin storePlugin = this.mStorePluginList.get(size);
                int i = size - 1;
                StorePlugin storePlugin2 = i >= 0 ? this.mStorePluginList.get(i) : null;
                if (storePlugin2 != null) {
                    storePlugin2.upgrade(storePlugin);
                }
            }
        } catch (Exception e2) {
            SALog.i(TAG, "upgrade failed", e2);
        } finally {
            this.mLock.unlock();
        }
    }
}
