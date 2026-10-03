package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.lang.reflect.Field;
import java.nio.Buffer;
import java.nio.ByteOrder;
import java.security.AccessController;
import java.util.logging.Level;
import java.util.logging.Logger;
import libcore.io.Memory;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes13.dex */
final class zzgz {
    static final long zza;
    static final boolean zzb;
    private static final Unsafe zzc;
    private static final Class zzd;
    private static final boolean zze;
    private static final zzgy zzf;
    private static final boolean zzg;
    private static final boolean zzh;

    /* JADX WARN: Code duplicated, block: B:11:0x003e  */
    static {
        boolean z;
        boolean z2;
        zzgy zzgyVar;
        Unsafe unsafeZzg = zzg();
        zzc = unsafeZzg;
        int i = zzct.zza;
        zzd = Memory.class;
        Class<?> cls = Long.TYPE;
        boolean zZzv = zzv(cls);
        zze = zZzv;
        boolean zZzv2 = zzv(Integer.TYPE);
        zzgy zzgwVar = null;
        if (unsafeZzg != null) {
            if (zZzv) {
                zzgwVar = new zzgx(unsafeZzg);
            } else if (zZzv2) {
                zzgwVar = new zzgw(unsafeZzg);
            }
        }
        zzf = zzgwVar;
        if (zzgwVar == null) {
            z = false;
        } else {
            try {
                Class<?> cls2 = zzgwVar.zza.getClass();
                cls2.getMethod("objectFieldOffset", Field.class);
                cls2.getMethod("getLong", Object.class, cls);
                if (zzB() == null) {
                    z = false;
                } else {
                    z = true;
                }
            } catch (Throwable th) {
                zzh(th);
            }
        }
        zzg = z;
        zzgy zzgyVar2 = zzf;
        if (zzgyVar2 == null) {
            z2 = false;
        } else {
            try {
                Class<?> cls3 = zzgyVar2.zza.getClass();
                cls3.getMethod("objectFieldOffset", Field.class);
                cls3.getMethod("arrayBaseOffset", Class.class);
                cls3.getMethod("arrayIndexScale", Class.class);
                Class<?> cls4 = Long.TYPE;
                cls3.getMethod("getInt", Object.class, cls4);
                cls3.getMethod("putInt", Object.class, cls4, Integer.TYPE);
                cls3.getMethod("getLong", Object.class, cls4);
                cls3.getMethod("putLong", Object.class, cls4, cls4);
                cls3.getMethod("getObject", Object.class, cls4);
                cls3.getMethod("putObject", Object.class, cls4, Object.class);
                z2 = true;
            } catch (Throwable th2) {
                zzh(th2);
                z2 = false;
            }
        }
        zzh = z2;
        zza = zzz(byte[].class);
        zzz(boolean[].class);
        zzA(boolean[].class);
        zzz(int[].class);
        zzA(int[].class);
        zzz(long[].class);
        zzA(long[].class);
        zzz(float[].class);
        zzA(float[].class);
        zzz(double[].class);
        zzA(double[].class);
        zzz(Object[].class);
        zzA(Object[].class);
        Field fieldZzB = zzB();
        if (fieldZzB != null && (zzgyVar = zzf) != null) {
            zzgyVar.zza.objectFieldOffset(fieldZzB);
        }
        zzb = ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN;
    }

    private zzgz() {
    }

    private static int zzA(Class cls) {
        if (zzh) {
            return zzf.zza.arrayIndexScale(cls);
        }
        return -1;
    }

    private static Field zzB() {
        int i = zzct.zza;
        Field fieldZzC = zzC(Buffer.class, "effectiveDirectAddress");
        if (fieldZzC != null) {
            return fieldZzC;
        }
        Field fieldZzC2 = zzC(Buffer.class, "address");
        if (fieldZzC2 == null || fieldZzC2.getType() != Long.TYPE) {
            return null;
        }
        return fieldZzC2;
    }

    private static Field zzC(Class cls, String str) {
        try {
            return cls.getDeclaredField(str);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzD(Object obj, long j2, byte b) {
        zzgy zzgyVar = zzf;
        long j3 = (-4) & j2;
        int i = zzgyVar.zza.getInt(obj, j3);
        int i2 = ((~((int) j2)) & 3) << 3;
        zzgyVar.zza.putInt(obj, j3, ((255 & b) << i2) | (i & (~(255 << i2))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void zzE(Object obj, long j2, byte b) {
        zzgy zzgyVar = zzf;
        long j3 = (-4) & j2;
        int i = (((int) j2) & 3) << 3;
        zzgyVar.zza.putInt(obj, j3, ((255 & b) << i) | (zzgyVar.zza.getInt(obj, j3) & (~(255 << i))));
    }

    public static double zza(Object obj, long j2) {
        return zzf.zza(obj, j2);
    }

    public static float zzb(Object obj, long j2) {
        return zzf.zzb(obj, j2);
    }

    public static int zzc(Object obj, long j2) {
        return zzf.zza.getInt(obj, j2);
    }

    public static long zzd(Object obj, long j2) {
        return zzf.zza.getLong(obj, j2);
    }

    public static Object zze(Class cls) {
        try {
            return zzc.allocateInstance(cls);
        } catch (InstantiationException e2) {
            throw new IllegalStateException(e2);
        }
    }

    public static Object zzf(Object obj, long j2) {
        return zzf.zza.getObject(obj, j2);
    }

    public static Unsafe zzg() {
        try {
            return (Unsafe) AccessController.doPrivileged(new zzgv());
        } catch (Throwable unused) {
            return null;
        }
    }

    public static /* bridge */ /* synthetic */ void zzh(Throwable th) {
        Logger.getLogger(zzgz.class.getName()).logp(Level.WARNING, "com.google.protobuf.UnsafeUtil", "logMissingMethod", "platform method missing - proto runtime falling back to safer methods: ".concat(th.toString()));
    }

    public static void zzm(Object obj, long j2, boolean z) {
        zzf.zzc(obj, j2, z);
    }

    public static void zzn(byte[] bArr, long j2, byte b) {
        zzf.zzd(bArr, zza + j2, b);
    }

    public static void zzo(Object obj, long j2, double d) {
        zzf.zze(obj, j2, d);
    }

    public static void zzp(Object obj, long j2, float f) {
        zzf.zzf(obj, j2, f);
    }

    public static void zzq(Object obj, long j2, int i) {
        zzf.zza.putInt(obj, j2, i);
    }

    public static void zzr(Object obj, long j2, long j3) {
        zzf.zza.putLong(obj, j2, j3);
    }

    public static void zzs(Object obj, long j2, Object obj2) {
        zzf.zza.putObject(obj, j2, obj2);
    }

    public static /* bridge */ /* synthetic */ boolean zzt(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) (((~j2) & 3) << 3))) & 255)) != 0;
    }

    public static /* bridge */ /* synthetic */ boolean zzu(Object obj, long j2) {
        return ((byte) ((zzf.zza.getInt(obj, (-4) & j2) >>> ((int) ((j2 & 3) << 3))) & 255)) != 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static boolean zzv(Class cls) {
        int i = zzct.zza;
        try {
            Class cls2 = zzd;
            Class cls3 = Boolean.TYPE;
            cls2.getMethod("peekLong", cls, cls3);
            cls2.getMethod("pokeLong", cls, Long.TYPE, cls3);
            Class cls4 = Integer.TYPE;
            cls2.getMethod("pokeInt", cls, cls4, cls3);
            cls2.getMethod("peekInt", cls, cls3);
            cls2.getMethod("pokeByte", cls, Byte.TYPE);
            cls2.getMethod("peekByte", cls);
            cls2.getMethod("pokeByteArray", cls, byte[].class, cls4, cls4);
            cls2.getMethod("peekByteArray", cls, byte[].class, cls4, cls4);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean zzw(Object obj, long j2) {
        return zzf.zzg(obj, j2);
    }

    public static boolean zzx() {
        return zzh;
    }

    public static boolean zzy() {
        return zzg;
    }

    private static int zzz(Class cls) {
        if (zzh) {
            return zzf.zza.arrayBaseOffset(cls);
        }
        return -1;
    }
}
