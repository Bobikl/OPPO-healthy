package com.heytap.nearx.cloudconfig.util;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import androidx.exifinterface.media.ExifInterface;
import com.heytap.log.formatter.LogFieldKey;
import com.heytap.nearx.cloudconfig.Env;
import com.heytap.nearx.cloudconfig.bean.Okio_api_250Kt;
import com.heytap.nearx.cloudconfig.stat.Const;
import com.heytap.nearx.cloudconfig.stat.TaskStat;
import com.heytap.store.base.core.http.HttpConst;
import com.oplus.aiunit.vision.d9f;
import com.oplus.aiunit.vision.r7b;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.lang.reflect.WildcardType;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.Objects;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import okio.BufferedSink;
import okio.Source;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.TypeCastException;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.StringCompanionObject;
import p010kotlin.text.Charsets;
import p010kotlin.text.StringsKt__StringsJVMKt;

/* JADX INFO: loaded from: classes17.dex */
@Metadata(d1 = {"\u0000~\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001a\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u0012\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u0010\u0010\t\u001a\u00020\b2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u001aE\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0018\u001a=\u0010\u0017\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0019\u001a5\u0010\u001a\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001b\u001a?\u0010\u001a\u001a\u00060\u0015j\u0002`\u00162\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0014\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00130\u0012\"\u00020\u0013¢\u0006\u0004\b\u001a\u0010\u001c\u001a\u0016\u0010\u001f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001e\u001a\u0016\u0010 \u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u001e\u001a\u001e\u0010%\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#\u001a(\u0010+\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020&2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0010\u001a(\u0010-\u001a\u0004\u0018\u00010&2\u0006\u0010'\u001a\u00020&2\u0006\u0010,\u001a\u00020&2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u0010\u001a6\u00100\u001a\u0004\u0018\u00010&2\b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010.\u001a\u0004\u0018\u00010&2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u00102\u0006\u0010/\u001a\u00020\bH\u0002\u001a\u000e\u00102\u001a\u00020\u00102\u0006\u00101\u001a\u00020\u0010\u001a\u0018\u00105\u001a\u00020&2\u0006\u00103\u001a\u00020&2\u0006\u00104\u001a\u00020&H\u0002\u001a\u0006\u00106\u001a\u00020\b\u001a\n\u00102\u001a\u00020\u0010*\u000207\u001a\u001c\u0010;\u001a\u00020\b*\u0002072\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109\u001a\u000e\u0010>\u001a\u00020\b2\u0006\u0010=\u001a\u00020<\u001a\u0010\u0010?\u001a\u0004\u0018\u00010<2\u0006\u0010=\u001a\u00020<\u001a\u0006\u0010@\u001a\u00020\u0010¨\u0006A"}, d2 = {ExifInterface.GPS_DIRECTION_TRUE, "Ljava/lang/Class;", "service", "", "validateServiceInterface", "Ljava/lang/reflect/Type;", "type", "getRawType", "", "hasUnresolvableType", "Ljava/lang/reflect/Method;", "method", "", "cause", "", LogFieldKey.PROCESS_NAME_KEY, "", "message", "", "", "args", "Ljava/lang/RuntimeException;", "Lkotlin/RuntimeException;", "parameterError", "(Ljava/lang/reflect/Method;Ljava/lang/Throwable;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;", "(Ljava/lang/reflect/Method;ILjava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;", "methodError", "(Ljava/lang/reflect/Method;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;", "(Ljava/lang/reflect/Method;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/RuntimeException;", "index", "Ljava/lang/reflect/ParameterizedType;", "getParameterUpperBound", "getParameterLowerBound", "Lcom/heytap/nearx/cloudconfig/Env;", HttpConst.SERVER_ENV, "Lcom/oplus/aiunit/vision/r7b;", "logger", "configError", "", "data", d9f.PUBLIC_KEY, "keySize", "transformation", "encryptRSA", d9f.PRIVATE_KEY, "decryptRSA", "key", "isEncrypt", "rsaTemplate", "text", "md5", "prefix", "suffix", "joins", "isMainThread", "Ljava/io/File;", "unZipDir", "Lcom/heytap/nearx/cloudconfig/stat/TaskStat;", "stat", "unzip", "Landroid/content/Context;", "context", "isConnectNet", "getStorageContext", "checkUpdateUrl", "com.heytap.nearx.cloudconfig"}, k = 2, mv = {1, 4, 0})
public final class UtilsKt {
    @NotNull
    public static final String checkUpdateUrl() {
        return "/v2/" + Const.INSTANCE.getPRODUCTD$com_heytap_nearx_cloudconfig() + "/checkUpdate";
    }

    public static final void configError(@NotNull String message, @NotNull Env env, @NotNull r7b logger) {
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(env, "env");
        Intrinsics.checkParameterIsNotNull(logger, "logger");
        if (env == Env.TEST) {
            throw new IllegalArgumentException(message);
        }
        if (env == Env.RELEASE) {
            r7b.d(logger, "ConfigError", message, null, null, 12, null);
        }
    }

    @Nullable
    public static final byte[] decryptRSA(@NotNull byte[] data, @NotNull byte[] privateKey, int i, @NotNull String transformation) {
        Intrinsics.checkParameterIsNotNull(data, "data");
        Intrinsics.checkParameterIsNotNull(privateKey, "privateKey");
        Intrinsics.checkParameterIsNotNull(transformation, "transformation");
        return rsaTemplate(data, privateKey, i, transformation, false);
    }

    @Nullable
    public static final byte[] encryptRSA(@NotNull byte[] data, @NotNull byte[] publicKey, int i, @NotNull String transformation) {
        Intrinsics.checkParameterIsNotNull(data, "data");
        Intrinsics.checkParameterIsNotNull(publicKey, "publicKey");
        Intrinsics.checkParameterIsNotNull(transformation, "transformation");
        return rsaTemplate(data, publicKey, i, transformation, true);
    }

    @NotNull
    public static final Type getParameterLowerBound(int i, @NotNull ParameterizedType type) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        Type paramType = type.getActualTypeArguments()[i];
        if (!(paramType instanceof WildcardType)) {
            Intrinsics.checkExpressionValueIsNotNull(paramType, "paramType");
            return paramType;
        }
        Type type2 = ((WildcardType) paramType).getLowerBounds()[0];
        Intrinsics.checkExpressionValueIsNotNull(type2, "paramType.lowerBounds[0]");
        return type2;
    }

    @NotNull
    public static final Type getParameterUpperBound(int i, @NotNull ParameterizedType type) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        Type[] actualTypeArguments = type.getActualTypeArguments();
        Intrinsics.checkExpressionValueIsNotNull(actualTypeArguments, "type.actualTypeArguments");
        if (i >= 0 && i < actualTypeArguments.length) {
            Type paramType = actualTypeArguments[i];
            if (!(paramType instanceof WildcardType)) {
                Intrinsics.checkExpressionValueIsNotNull(paramType, "paramType");
                return paramType;
            }
            Type type2 = ((WildcardType) paramType).getUpperBounds()[0];
            Intrinsics.checkExpressionValueIsNotNull(type2, "paramType.upperBounds[0]");
            return type2;
        }
        throw new IllegalArgumentException("Index " + i + " not in range [0," + actualTypeArguments.length + ") for " + type);
    }

    @NotNull
    public static final Class<?> getRawType(@NotNull Type type) {
        Intrinsics.checkParameterIsNotNull(type, "type");
        Objects.requireNonNull(type, "type == null");
        if (type instanceof Class) {
            return (Class) type;
        }
        if (type instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) type).getRawType();
            if (!(rawType instanceof Class)) {
                rawType = null;
            }
            Class<?> cls = (Class) rawType;
            if (cls != null) {
                return cls;
            }
            throw new IllegalArgumentException();
        }
        if (type instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) type).getGenericComponentType();
            Intrinsics.checkExpressionValueIsNotNull(genericComponentType, "type.genericComponentType");
            return Array.newInstance(getRawType(genericComponentType), 0).getClass();
        }
        if (type instanceof TypeVariable) {
            return Object.class;
        }
        if (type instanceof WildcardType) {
            Type type2 = ((WildcardType) type).getUpperBounds()[0];
            Intrinsics.checkExpressionValueIsNotNull(type2, "type.upperBounds[0]");
            return getRawType(type2);
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + type.getClass().getName());
    }

    @Nullable
    public static final Context getStorageContext(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        return AppInfoUtil.INSTANCE.isFBEVersion() ? context.createDeviceProtectedStorageContext() : context.getApplicationContext();
    }

    public static final boolean hasUnresolvableType(@Nullable Type type) {
        String name;
        if (type instanceof Class) {
            return false;
        }
        if (type instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) type;
            if (parameterizedType == null) {
                Intrinsics.throwNpe();
            }
            for (Type type2 : parameterizedType.getActualTypeArguments()) {
                if (hasUnresolvableType(type2)) {
                    return true;
                }
            }
            return false;
        }
        if (type instanceof GenericArrayType) {
            return hasUnresolvableType(((GenericArrayType) type).getGenericComponentType());
        }
        if ((type instanceof TypeVariable) || (type instanceof WildcardType)) {
            return true;
        }
        if (type == null) {
            name = "null";
        } else {
            name = type.getClass().getName();
            Intrinsics.checkExpressionValueIsNotNull(name, "type!!.javaClass.name");
        }
        throw new IllegalArgumentException("Expected a Class, ParameterizedType, or GenericArrayType, but <" + type + "> is of type " + name);
    }

    public static final boolean isConnectNet(@NotNull Context context) {
        Intrinsics.checkParameterIsNotNull(context, "context");
        try {
            Object systemService = context.getSystemService("connectivity");
            if (systemService == null) {
                throw new TypeCastException("null cannot be cast to non-null type android.net.ConnectivityManager");
            }
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) systemService).getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                return activeNetworkInfo.isAvailable() || activeNetworkInfo.isConnected();
            }
            return false;
        } catch (Exception e2) {
            LogUtils.INSTANCE.w("Utils", "isConnectNet", e2, new Object[0]);
            return false;
        }
    }

    public static final boolean isMainThread() {
        return Intrinsics.areEqual(Looper.getMainLooper(), Looper.myLooper());
    }

    private static final byte[] joins(byte[] bArr, byte[] bArr2) {
        byte[] bArr3 = new byte[bArr.length + bArr2.length];
        System.arraycopy(bArr, 0, bArr3, 0, bArr.length);
        System.arraycopy(bArr2, 0, bArr3, bArr.length, bArr2.length);
        return bArr3;
    }

    @NotNull
    public static final String md5(@NotNull String text) {
        Intrinsics.checkParameterIsNotNull(text, "text");
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            Intrinsics.checkExpressionValueIsNotNull(messageDigest, "MessageDigest.getInstance(\"MD5\")");
            byte[] bytes = text.getBytes(Charsets.UTF_8);
            Intrinsics.checkExpressionValueIsNotNull(bytes, "(this as java.lang.String).getBytes(charset)");
            byte[] bArrDigest = messageDigest.digest(bytes);
            Intrinsics.checkExpressionValueIsNotNull(bArrDigest, "instance.digest(text.toByteArray())");
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                Intrinsics.checkExpressionValueIsNotNull(hexString, "Integer.toHexString(i)");
                if (hexString.length() < 2) {
                    hexString = "0" + hexString;
                }
                stringBuffer.append(hexString);
            }
            String string = stringBuffer.toString();
            Intrinsics.checkExpressionValueIsNotNull(string, "sb.toString()");
            return string;
        } catch (NoSuchAlgorithmException e2) {
            LogUtils logUtils = LogUtils.INSTANCE;
            String message = e2.getMessage();
            if (message == null) {
                message = "MD5Error";
            }
            logUtils.w("Utils", message, e2, new Object[0]);
            return "";
        }
    }

    @NotNull
    public static final RuntimeException methodError(@NotNull Method method, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(method, "method");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(args, "args");
        return methodError(method, null, message, args);
    }

    @NotNull
    public static final RuntimeException parameterError(@NotNull Method method, @NotNull Throwable cause, int i, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(method, "method");
        Intrinsics.checkParameterIsNotNull(cause, "cause");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(args, "args");
        return methodError(method, cause, message + " (parameter #" + (i + 1) + ")", args);
    }

    private static final byte[] rsaTemplate(byte[] bArr, byte[] bArr2, int i, String str, boolean z) {
        if (bArr != null && bArr.length != 0 && bArr2 != null && bArr2.length != 0) {
            try {
                Key keyGeneratePublic = z ? KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(bArr2)) : KeyFactory.getInstance("RSA").generatePrivate(new PKCS8EncodedKeySpec(bArr2));
                if (keyGeneratePublic == null) {
                    return null;
                }
                Cipher cipher = Cipher.getInstance(str);
                cipher.init(z ? 1 : 2, keyGeneratePublic);
                int length = bArr.length;
                int i2 = i / 8;
                if (z) {
                    if (str == null) {
                        throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                    }
                    String lowerCase = str.toLowerCase();
                    Intrinsics.checkExpressionValueIsNotNull(lowerCase, "(this as java.lang.String).toLowerCase()");
                    if (StringsKt__StringsJVMKt.endsWith$default(lowerCase, "pkcs1padding", false, 2, null)) {
                        i2 -= 11;
                    }
                }
                int i3 = length / i2;
                if (i3 <= 0) {
                    return cipher.doFinal(bArr);
                }
                byte[] bArrJoins = new byte[0];
                byte[] bArr3 = new byte[i2];
                int i4 = 0;
                for (int i5 = 0; i5 < i3; i5++) {
                    System.arraycopy(bArr, i4, bArr3, 0, i2);
                    byte[] bArrDoFinal = cipher.doFinal(bArr3);
                    Intrinsics.checkExpressionValueIsNotNull(bArrDoFinal, "cipher.doFinal(buff)");
                    bArrJoins = joins(bArrJoins, bArrDoFinal);
                    i4 += i2;
                }
                if (i4 == length) {
                    return bArrJoins;
                }
                int i6 = length - i4;
                byte[] bArr4 = new byte[i6];
                System.arraycopy(bArr, i4, bArr4, 0, i6);
                byte[] bArrDoFinal2 = cipher.doFinal(bArr4);
                Intrinsics.checkExpressionValueIsNotNull(bArrDoFinal2, "cipher.doFinal(buff)");
                return joins(bArrJoins, bArrDoFinal2);
            } catch (InvalidKeyException e2) {
                LogUtils logUtils = LogUtils.INSTANCE;
                String message = e2.getMessage();
                logUtils.w("Utils", message != null ? message : "rsaTemplateError", e2, new Object[0]);
            } catch (NoSuchAlgorithmException e3) {
                LogUtils logUtils2 = LogUtils.INSTANCE;
                String message2 = e3.getMessage();
                logUtils2.w("Utils", message2 != null ? message2 : "rsaTemplateError", e3, new Object[0]);
            } catch (InvalidKeySpecException e4) {
                LogUtils logUtils3 = LogUtils.INSTANCE;
                String message3 = e4.getMessage();
                logUtils3.w("Utils", message3 != null ? message3 : "rsaTemplateError", e4, new Object[0]);
            } catch (BadPaddingException e5) {
                LogUtils logUtils4 = LogUtils.INSTANCE;
                String message4 = e5.getMessage();
                logUtils4.w("Utils", message4 != null ? message4 : "rsaTemplateError", e5, new Object[0]);
            } catch (IllegalBlockSizeException e6) {
                LogUtils logUtils5 = LogUtils.INSTANCE;
                String message5 = e6.getMessage();
                logUtils5.w("Utils", message5 != null ? message5 : "rsaTemplateError", e6, new Object[0]);
            } catch (NoSuchPaddingException e7) {
                LogUtils logUtils6 = LogUtils.INSTANCE;
                String message6 = e7.getMessage();
                logUtils6.w("Utils", message6 != null ? message6 : "rsaTemplateError", e7, new Object[0]);
            }
        }
        return null;
    }

    public static final boolean unzip(@NotNull File unzip, @NotNull File unZipDir, @Nullable TaskStat taskStat) {
        Intrinsics.checkParameterIsNotNull(unzip, "$this$unzip");
        Intrinsics.checkParameterIsNotNull(unZipDir, "unZipDir");
        try {
            ZipFile zipFile = new ZipFile(unzip);
            Enumeration<? extends ZipEntry> enumerationEntries = zipFile.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry nextElement = enumerationEntries.nextElement();
                InputStream inputStream = zipFile.getInputStream(nextElement);
                Intrinsics.checkExpressionValueIsNotNull(inputStream, "inputStream");
                Source source = Okio_api_250Kt.toSource(inputStream);
                StringBuilder sb = new StringBuilder();
                sb.append(unZipDir.getAbsolutePath());
                sb.append(File.separator);
                Intrinsics.checkExpressionValueIsNotNull(nextElement, "nextElement");
                sb.append(nextElement.getName());
                File file = new File(sb.toString());
                String canonicalPath = file.getCanonicalPath();
                Intrinsics.checkExpressionValueIsNotNull(canonicalPath, "it.canonicalPath");
                String canonicalPath2 = unZipDir.getCanonicalPath();
                Intrinsics.checkExpressionValueIsNotNull(canonicalPath2, "unZipDir.canonicalPath");
                if (StringsKt__StringsJVMKt.startsWith$default(canonicalPath, canonicalPath2, false, 2, null)) {
                    BufferedSink buffer = Okio_api_250Kt.toBuffer(Okio_api_250Kt.toSink(file));
                    buffer.write(Okio_api_250Kt.toBuffer(source).readByteArray());
                    buffer.flush();
                    buffer.close();
                }
                source.close();
                inputStream.close();
            }
            zipFile.close();
            return true;
        } catch (Exception e2) {
            if (taskStat != null) {
                TaskStat.setStep$default(taskStat, -7, null, 2, null);
            }
            if (taskStat != null) {
                taskStat.onException(e2);
            }
            return false;
        }
    }

    public static final <T> void validateServiceInterface(@NotNull Class<T> service) {
        Intrinsics.checkParameterIsNotNull(service, "service");
        if (!service.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        Class<?>[] interfaces = service.getInterfaces();
        Intrinsics.checkExpressionValueIsNotNull(interfaces, "service.interfaces");
        if (!(interfaces.length == 0)) {
            throw new IllegalArgumentException("API interfaces must not extend other interfaces.");
        }
    }

    @NotNull
    public static final RuntimeException methodError(@NotNull Method method, @Nullable Throwable th, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(method, "method");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(args, "args");
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        Object[] objArrCopyOf = Arrays.copyOf(args, args.length);
        String str = String.format(message, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkExpressionValueIsNotNull(str, "java.lang.String.format(format, *args)");
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("\n    for method ");
        Class<?> declaringClass = method.getDeclaringClass();
        Intrinsics.checkExpressionValueIsNotNull(declaringClass, "method.declaringClass");
        sb.append(declaringClass.getSimpleName());
        sb.append(".");
        sb.append(method.getName());
        return new IllegalArgumentException(sb.toString(), th);
    }

    @NotNull
    public static final RuntimeException parameterError(@NotNull Method method, int i, @NotNull String message, @NotNull Object... args) {
        Intrinsics.checkParameterIsNotNull(method, "method");
        Intrinsics.checkParameterIsNotNull(message, "message");
        Intrinsics.checkParameterIsNotNull(args, "args");
        return methodError(method, message + " (parameter #" + (i + 1) + ")", args);
    }

    @NotNull
    public static final String md5(@NotNull File md5) throws IOException {
        Intrinsics.checkParameterIsNotNull(md5, "$this$md5");
        Source source = Okio_api_250Kt.toSource(md5);
        String strHex = Okio_api_250Kt.toBuffer(source).readByteString().md5().hex();
        source.close();
        return strHex;
    }
}
