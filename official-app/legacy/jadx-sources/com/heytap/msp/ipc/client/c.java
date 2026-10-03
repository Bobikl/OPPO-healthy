package com.heytap.msp.ipc.client;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.opos.process.bridge.base.BridgeConstant;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes19.dex */
public class c {
    public static boolean a(Object obj) {
        if (obj == null || (obj instanceof PersistableBundle) || (obj instanceof Size) || (obj instanceof SizeF) || (obj instanceof Integer) || (obj instanceof Map) || (obj instanceof Parcelable) || (obj instanceof Short) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof CharSequence) || (obj instanceof List) || (obj instanceof SparseArray) || (obj instanceof boolean[]) || (obj instanceof byte[]) || (obj instanceof CharSequence[]) || (obj instanceof IBinder) || (obj instanceof Parcelable[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof Byte) || (obj instanceof double[])) {
            return true;
        }
        Class<?> cls = obj.getClass();
        return (cls.isArray() && cls.getComponentType() == Object.class) || (obj instanceof Serializable);
    }

    public static boolean b(Object... objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (!a(obj)) {
                return false;
            }
        }
        return true;
    }

    public static Bundle c(String str, Parcelable parcelable, int i, Object... objArr) {
        Bundle bundleD = d(str, parcelable, i, objArr);
        Bundle bundleE = e(str, parcelable, i, objArr);
        bundleE.putAll(bundleD);
        return bundleE;
    }

    public static Bundle d(String str, Parcelable parcelable, int i, Object... objArr) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(c.class.getClassLoader());
        bundle.putString(BridgeConstant.KEY_TARGET_CLASS, str);
        if (parcelable != null) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeParcelable(parcelable, 0);
            bundle.putByteArray(BridgeConstant.KEY_TARGET_IDENTIFY, parcelObtain.marshall());
            parcelObtain.recycle();
        }
        bundle.putInt(BridgeConstant.KEY_METHOD_ID, i);
        if (objArr != null) {
            ArrayList arrayList = new ArrayList();
            int i2 = 0;
            for (int i3 = 0; i3 < objArr.length; i3++) {
                if (objArr[i3] instanceof IBinder) {
                    arrayList.add(Integer.valueOf(i3));
                    arrayList.add(1);
                    String str2 = BridgeConstant.KEY_ARGS_I_BINDER + i2;
                    arrayList.add(str2);
                    bundle.putBinder(str2, (IBinder) objArr[i3]);
                    i2++;
                } else {
                    arrayList.add(Integer.valueOf(i3));
                    arrayList.add(0);
                    arrayList.add(objArr[i3]);
                }
            }
            Parcel parcelObtain2 = Parcel.obtain();
            parcelObtain2.writeArray(arrayList.toArray());
            bundle.putByteArray("args", parcelObtain2.marshall());
            parcelObtain2.recycle();
        }
        return bundle;
    }

    public static Bundle e(String str, Parcelable parcelable, int i, Object... objArr) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(c.class.getClassLoader());
        bundle.putString(BridgeConstant.KEY_TARGET_CLASS, str);
        if (parcelable != null) {
            bundle.putParcelable(BridgeConstant.KEY_TARGET_IDENTIFY_V2, parcelable);
        }
        bundle.putInt(BridgeConstant.KEY_METHOD_ID, i);
        if (objArr != null) {
            bundle.putInt(BridgeConstant.KEY_PARAMS_COUNT, objArr.length);
            for (int i2 = 0; i2 < objArr.length; i2++) {
                Object obj = objArr[i2];
                if (obj == null) {
                    bundle.putBundle("params" + i2, null);
                } else if (obj instanceof Bundle) {
                    bundle.putBundle("params" + i2, (Bundle) objArr[i2]);
                } else if (obj instanceof IBinder) {
                    bundle.putBinder("params" + i2, (IBinder) objArr[i2]);
                } else if (obj instanceof Boolean) {
                    bundle.putBoolean("params" + i2, ((Boolean) objArr[i2]).booleanValue());
                } else if (obj instanceof boolean[]) {
                    bundle.putBooleanArray("params" + i2, (boolean[]) objArr[i2]);
                } else if (obj instanceof Byte) {
                    bundle.putByte("params" + i2, ((Byte) objArr[i2]).byteValue());
                } else if (obj instanceof byte[]) {
                    bundle.putByteArray("params" + i2, (byte[]) objArr[i2]);
                } else if (obj instanceof Character) {
                    bundle.putChar("params" + i2, ((Character) objArr[i2]).charValue());
                } else if (obj instanceof char[]) {
                    bundle.putCharArray("params" + i2, (char[]) objArr[i2]);
                } else if (obj instanceof CharSequence) {
                    bundle.putCharSequence("params" + i2, (CharSequence) objArr[i2]);
                } else if (obj instanceof CharSequence[]) {
                    bundle.putCharSequenceArray("params" + i2, (CharSequence[]) objArr[i2]);
                } else if ((obj instanceof ArrayList) && (((ArrayList) obj).get(0) instanceof CharSequence)) {
                    bundle.putCharSequenceArrayList("params" + i2, (ArrayList) objArr[i2]);
                } else {
                    Object obj2 = objArr[i2];
                    if (obj2 instanceof Double) {
                        bundle.putDouble("params" + i2, ((Double) objArr[i2]).doubleValue());
                    } else if (obj2 instanceof double[]) {
                        bundle.putDoubleArray("params" + i2, (double[]) objArr[i2]);
                    } else if (obj2 instanceof Float) {
                        bundle.putFloat("params" + i2, ((Float) objArr[i2]).floatValue());
                    } else if (obj2 instanceof float[]) {
                        bundle.putFloatArray("params" + i2, (float[]) objArr[i2]);
                    } else if (obj2 instanceof Integer) {
                        bundle.putInt("params" + i2, ((Integer) objArr[i2]).intValue());
                    } else if (obj2 instanceof int[]) {
                        bundle.putIntArray("params" + i2, (int[]) objArr[i2]);
                    } else if ((obj2 instanceof ArrayList) && (((ArrayList) obj2).get(0) instanceof Integer)) {
                        bundle.putIntegerArrayList("params" + i2, (ArrayList) objArr[i2]);
                    } else {
                        Object obj3 = objArr[i2];
                        if (obj3 instanceof Long) {
                            bundle.putLong("params" + i2, ((Long) objArr[i2]).longValue());
                        } else if (obj3 instanceof long[]) {
                            bundle.putLongArray("params" + i2, (long[]) objArr[i2]);
                        } else if (obj3 instanceof Short) {
                            bundle.putShort("params" + i2, ((Short) objArr[i2]).shortValue());
                        } else if (obj3 instanceof short[]) {
                            bundle.putShortArray("params" + i2, (short[]) objArr[i2]);
                        } else if (obj3 instanceof String) {
                            bundle.putString("params" + i2, (String) objArr[i2]);
                        } else if (obj3 instanceof String[]) {
                            bundle.putStringArray("params" + i2, (String[]) objArr[i2]);
                        } else if ((obj3 instanceof ArrayList) && (((ArrayList) obj3).get(0) instanceof String)) {
                            bundle.putStringArrayList("params" + i2, (ArrayList) objArr[i2]);
                        } else {
                            Object obj4 = objArr[i2];
                            if (obj4 instanceof Size) {
                                bundle.putSize("params" + i2, (Size) objArr[i2]);
                            } else if (obj4 instanceof SizeF) {
                                bundle.putSizeF("params" + i2, (SizeF) objArr[i2]);
                            } else if (obj4 instanceof Parcelable) {
                                bundle.putParcelable("params" + i2, (Parcelable) objArr[i2]);
                            } else if (obj4 instanceof Parcelable[]) {
                                bundle.putParcelableArray("params" + i2, (Parcelable[]) objArr[i2]);
                            } else if ((obj4 instanceof ArrayList) && (((ArrayList) obj4).get(0) instanceof Parcelable)) {
                                bundle.putParcelableArrayList("params" + i2, (ArrayList) objArr[i2]);
                            } else {
                                Object obj5 = objArr[i2];
                                if ((obj5 instanceof SparseArray) && (((SparseArray) obj5).get(0) instanceof Parcelable)) {
                                    bundle.putSparseParcelableArray("params" + i2, (SparseArray) objArr[i2]);
                                } else if (objArr[i2] instanceof Serializable) {
                                    bundle.putSerializable("params" + i2, (Serializable) objArr[i2]);
                                } else {
                                    h.b("EncodeParams", "Encode error:" + objArr[i2]);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            bundle.putInt(BridgeConstant.KEY_PARAMS_COUNT, 0);
        }
        return bundle;
    }

    public static Bundle f(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultCode", i);
        bundle.putString("resultMsg", str);
        return bundle;
    }
}
