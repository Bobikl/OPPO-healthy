package com.opos.process.bridge.provider;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PersistableBundle;
import android.util.Size;
import android.util.SizeF;
import android.util.SparseArray;
import com.opos.process.bridge.annotation.IBridgeTargetIdentify;
import com.opos.process.bridge.base.BridgeConstant;
import com.opos.process.bridge.base.BridgeResultCode;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes8.dex */
public class BundleUtil {
    public static boolean checkParam(Object obj) {
        if (obj == null || (obj instanceof PersistableBundle) || (obj instanceof Size) || (obj instanceof SizeF) || (obj instanceof Integer) || (obj instanceof Map) || (obj instanceof Parcelable) || (obj instanceof Short) || (obj instanceof Long) || (obj instanceof Float) || (obj instanceof Double) || (obj instanceof Boolean) || (obj instanceof CharSequence) || (obj instanceof List) || (obj instanceof SparseArray) || (obj instanceof boolean[]) || (obj instanceof byte[]) || (obj instanceof CharSequence[]) || (obj instanceof IBinder) || (obj instanceof Parcelable[]) || (obj instanceof int[]) || (obj instanceof long[]) || (obj instanceof Byte) || (obj instanceof double[])) {
            return true;
        }
        Class<?> cls = obj.getClass();
        return (cls.isArray() && cls.getComponentType() == Object.class) || (obj instanceof Serializable);
    }

    public static boolean checkParams(Object... objArr) {
        if (objArr == null) {
            return true;
        }
        for (Object obj : objArr) {
            if (!checkParam(obj)) {
                return false;
            }
        }
        return true;
    }

    public static Object[] decodeParamsGetArgs(Bundle bundle) throws Exception {
        if (bundle.containsKey(BridgeConstant.KEY_PARAMS_COUNT)) {
            return decodeParamsGetArgsV2(bundle);
        }
        if (bundle.containsKey(BridgeConstant.KEY_ARGS)) {
            return decodeParamsGetArgsV1(bundle);
        }
        throw new Exception("invalid bundle data");
    }

    private static Object[] decodeParamsGetArgsV1(Bundle bundle) throws Exception {
        byte[] byteArray = bundle.getByteArray(BridgeConstant.KEY_ARGS);
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
        parcelObtain.setDataPosition(0);
        Object[] array = parcelObtain.readArray(BundleUtil.class.getClassLoader());
        parcelObtain.recycle();
        if (array.length % 3 != 0) {
            throw new Exception("args length error");
        }
        Object[] objArr = new Object[array.length / 3];
        for (int i = 0; i < array.length; i += 3) {
            int i2 = i / 3;
            if (((Integer) array[i]).intValue() != i2) {
                throw new Exception("args index error");
            }
            if (((Integer) array[i + 1]).intValue() == 1) {
                objArr[i2] = bundle.getBinder((String) array[i + 2]);
            } else {
                objArr[i2] = array[i + 2];
            }
        }
        return objArr;
    }

    private static Object[] decodeParamsGetArgsV2(Bundle bundle) throws Exception {
        int i = bundle.getInt(BridgeConstant.KEY_PARAMS_COUNT);
        if (i <= 0) {
            return new Object[0];
        }
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = bundle.get("params" + i2);
        }
        return objArr;
    }

    public static IBridgeTargetIdentify decodeParamsGetIdentify(Bundle bundle) {
        if (bundle.containsKey(BridgeConstant.KEY_TARGET_IDENTIFY_V2)) {
            return (IBridgeTargetIdentify) bundle.getParcelable(BridgeConstant.KEY_TARGET_IDENTIFY_V2);
        }
        if (bundle.containsKey(BridgeConstant.KEY_TARGET_IDENTIFY)) {
            return decodeParamsGetIdentifyV1(bundle);
        }
        return null;
    }

    private static IBridgeTargetIdentify decodeParamsGetIdentifyV1(Bundle bundle) {
        byte[] byteArray = bundle.getByteArray(BridgeConstant.KEY_TARGET_IDENTIFY);
        if (byteArray == null || byteArray.length <= 0) {
            return null;
        }
        Parcel parcelObtain = Parcel.obtain();
        parcelObtain.unmarshall(byteArray, 0, byteArray.length);
        parcelObtain.setDataPosition(0);
        IBridgeTargetIdentify iBridgeTargetIdentify = (IBridgeTargetIdentify) parcelObtain.readParcelable(BundleUtil.class.getClassLoader());
        parcelObtain.recycle();
        return iBridgeTargetIdentify;
    }

    public static int decodeParamsGetMethodId(Bundle bundle) {
        return bundle.getInt(BridgeConstant.KEY_METHOD_ID);
    }

    public static String decodeParamsGetTargetClass(Bundle bundle) {
        return bundle.getString(BridgeConstant.KEY_TARGET_CLASS);
    }

    public static Bundle encodeParams(String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        Bundle bundleEncodeParamsV1 = encodeParamsV1(str, iBridgeTargetIdentify, i, objArr);
        Bundle bundleEncodeParamsV2 = encodeParamsV2(str, iBridgeTargetIdentify, i, objArr);
        bundleEncodeParamsV2.putAll(bundleEncodeParamsV1);
        return bundleEncodeParamsV2;
    }

    private static Bundle encodeParamsV1(String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(BundleUtil.class.getClassLoader());
        bundle.putString(BridgeConstant.KEY_TARGET_CLASS, str);
        if (iBridgeTargetIdentify != null) {
            Parcel parcelObtain = Parcel.obtain();
            parcelObtain.writeParcelable(iBridgeTargetIdentify, 0);
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
            bundle.putByteArray(BridgeConstant.KEY_ARGS, parcelObtain2.marshall());
            parcelObtain2.recycle();
        }
        return bundle;
    }

    private static Bundle encodeParamsV2(String str, IBridgeTargetIdentify iBridgeTargetIdentify, int i, Object... objArr) {
        Bundle bundle = new Bundle();
        bundle.setClassLoader(BundleUtil.class.getClassLoader());
        bundle.putString(BridgeConstant.KEY_TARGET_CLASS, str);
        if (iBridgeTargetIdentify != null) {
            bundle.putParcelable(BridgeConstant.KEY_TARGET_IDENTIFY_V2, iBridgeTargetIdentify);
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
                                    ProcessBridgeLog.e("EncodeParams", "Encode error:" + objArr[i2]);
                                }
                            }
                        }
                    }
                }
            }
        }
        return bundle;
    }

    public static Bundle makeBundle(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultCode", i);
        bundle.putString(BridgeConstant.KEY_RESULT_MSG, str);
        return bundle;
    }

    public static Bundle makeExceptionBundle(Exception exc) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultCode", BridgeResultCode.CODE_REMOTE_EXECUTE_ERROR);
        bundle.putSerializable(BridgeConstant.KEY_RESULT_EXCEPTION, exc);
        return bundle;
    }

    public static Bundle makeInterceptorResultBundle(int i, String str) {
        Bundle bundle = new Bundle();
        bundle.putInt("resultCode", BridgeResultCode.CODE_INTERCEPTOR_ERROR);
        bundle.putInt(BridgeConstant.KEY_INTERCEPTOR_CODE, i);
        bundle.putString(BridgeConstant.KEY_INTERCEPTOR_MSG, str);
        return bundle;
    }

    private static boolean packageArray(Bundle bundle, Object obj, Class<?> cls) {
        Class<?> componentType = cls.getComponentType();
        if (componentType == null) {
            return false;
        }
        if (componentType.equals(Boolean.TYPE)) {
            bundle.putBooleanArray(BridgeConstant.KEY_RESULT_DATA, (boolean[]) obj);
            return true;
        }
        if (componentType.equals(Character.class)) {
            bundle.putCharArray(BridgeConstant.KEY_RESULT_DATA, (char[]) obj);
            return true;
        }
        if (componentType.equals(Integer.TYPE)) {
            bundle.putIntArray(BridgeConstant.KEY_RESULT_DATA, (int[]) obj);
            return true;
        }
        if (componentType.equals(Short.TYPE)) {
            bundle.putShortArray(BridgeConstant.KEY_RESULT_DATA, (short[]) obj);
            return true;
        }
        if (componentType.equals(Long.TYPE)) {
            bundle.putLongArray(BridgeConstant.KEY_RESULT_DATA, (long[]) obj);
            return true;
        }
        if (componentType.equals(Float.TYPE)) {
            bundle.putFloatArray(BridgeConstant.KEY_RESULT_DATA, (float[]) obj);
            return true;
        }
        if (componentType.equals(Double.TYPE)) {
            bundle.putDoubleArray(BridgeConstant.KEY_RESULT_DATA, (double[]) obj);
            return true;
        }
        if (componentType.equals(Byte.TYPE)) {
            bundle.putByteArray(BridgeConstant.KEY_RESULT_DATA, (byte[]) obj);
            return true;
        }
        if (componentType.equals(String.class)) {
            bundle.putStringArray(BridgeConstant.KEY_RESULT_DATA, (String[]) obj);
            return true;
        }
        if (CharSequence.class.isAssignableFrom(componentType)) {
            bundle.putCharSequenceArray(BridgeConstant.KEY_RESULT_DATA, (CharSequence[]) obj);
            return true;
        }
        if (!Parcelable.class.isAssignableFrom(componentType)) {
            return false;
        }
        bundle.putParcelableArray(BridgeConstant.KEY_RESULT_DATA, (Parcelable[]) obj);
        return true;
    }

    public static Bundle packageBundle(Object obj, Class<?> cls) {
        Bundle bundle = new Bundle();
        try {
            bundle.putInt("resultCode", 0);
            if (cls.equals(Void.TYPE)) {
                return bundle;
            }
            if (cls.equals(Boolean.TYPE)) {
                bundle.putBoolean(BridgeConstant.KEY_RESULT_DATA, ((Boolean) obj).booleanValue());
                return bundle;
            }
            if (cls.equals(Character.TYPE)) {
                bundle.putChar(BridgeConstant.KEY_RESULT_DATA, ((Character) obj).charValue());
                return bundle;
            }
            if (cls.equals(Byte.TYPE)) {
                bundle.putByte(BridgeConstant.KEY_RESULT_DATA, ((Byte) obj).byteValue());
                return bundle;
            }
            if (cls.equals(Short.TYPE)) {
                bundle.putShort(BridgeConstant.KEY_RESULT_DATA, ((Short) obj).shortValue());
                return bundle;
            }
            if (cls.equals(Integer.TYPE)) {
                bundle.putInt(BridgeConstant.KEY_RESULT_DATA, ((Integer) obj).intValue());
                return bundle;
            }
            if (cls.equals(Float.TYPE)) {
                bundle.putFloat(BridgeConstant.KEY_RESULT_DATA, ((Float) obj).floatValue());
                return bundle;
            }
            if (cls.equals(Long.TYPE)) {
                bundle.putLong(BridgeConstant.KEY_RESULT_DATA, ((Long) obj).longValue());
                return bundle;
            }
            if (cls.equals(Double.TYPE)) {
                bundle.putDouble(BridgeConstant.KEY_RESULT_DATA, ((Double) obj).doubleValue());
                return bundle;
            }
            if (cls.equals(String.class)) {
                bundle.putString(BridgeConstant.KEY_RESULT_DATA, (String) obj);
                return bundle;
            }
            if (cls.equals(Bundle.class)) {
                bundle.putBundle(BridgeConstant.KEY_RESULT_DATA, (Bundle) obj);
                return bundle;
            }
            if (CharSequence.class.isAssignableFrom(cls)) {
                bundle.putCharSequence(BridgeConstant.KEY_RESULT_DATA, (CharSequence) obj);
                return bundle;
            }
            if (Array.class.isAssignableFrom(cls)) {
                return !packageArray(bundle, obj, cls) ? makeBundle(BridgeResultCode.CODE_REMOTE_RESULT_NOT_MATCH, "unsupported Array component type") : bundle;
            }
            if (SparseArray.class.isAssignableFrom(cls)) {
                if (cls.getComponentType() == null || !Parcelable.class.isAssignableFrom(cls.getComponentType())) {
                    return makeBundle(BridgeResultCode.CODE_REMOTE_RESULT_NOT_MATCH, "unsupported SparseArray type");
                }
                bundle.putSparseParcelableArray(BridgeConstant.KEY_RESULT_DATA, (SparseArray) obj);
                return bundle;
            }
            if (Serializable.class.isAssignableFrom(cls)) {
                bundle.putSerializable(BridgeConstant.KEY_RESULT_DATA, (Serializable) obj);
                return bundle;
            }
            if (Parcelable.class.isAssignableFrom(cls)) {
                bundle.putParcelable(BridgeConstant.KEY_RESULT_DATA, (Parcelable) obj);
                return bundle;
            }
            if (IBinder.class.isAssignableFrom(cls)) {
                bundle.putBinder(BridgeConstant.KEY_RESULT_DATA, (IBinder) obj);
                return bundle;
            }
            if (cls.equals(Size.class)) {
                bundle.putSize(BridgeConstant.KEY_RESULT_DATA, (Size) obj);
                return bundle;
            }
            if (!cls.equals(SizeF.class)) {
                return makeBundle(BridgeResultCode.CODE_REMOTE_RESULT_NOT_MATCH, "unsupported type");
            }
            bundle.putSizeF(BridgeConstant.KEY_RESULT_DATA, (SizeF) obj);
            return bundle;
        } catch (Exception e) {
            return makeBundle(BridgeResultCode.CODE_REMOTE_RESULT_NOT_MATCH, e.getMessage());
        }
    }
}
