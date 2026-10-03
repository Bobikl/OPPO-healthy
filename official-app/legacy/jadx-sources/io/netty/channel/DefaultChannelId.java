package io.netty.channel;

import io.netty.buffer.ByteBufUtil;
import io.netty.util.internal.EmptyArrays;
import io.netty.util.internal.MacAddressUtil;
import io.netty.util.internal.PlatformDependent;
import io.netty.util.internal.SystemPropertyUtil;
import io.netty.util.internal.logging.InternalLogger;
import io.netty.util.internal.logging.InternalLoggerFactory;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import org.apache.commons.codec.language.Soundex;

/* JADX INFO: loaded from: classes10.dex */
public final class DefaultChannelId implements ChannelId {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final byte[] MACHINE_ID;
    private static final int PROCESS_ID;
    private static final int PROCESS_ID_LEN = 4;
    private static final int RANDOM_LEN = 4;
    private static final int SEQUENCE_LEN = 4;
    private static final int TIMESTAMP_LEN = 8;
    private static final InternalLogger logger = InternalLoggerFactory.getInstance((Class<?>) DefaultChannelId.class);
    private static final AtomicInteger nextSequence = new AtomicInteger();
    private static final long serialVersionUID = 3884076183504074063L;
    private final byte[] data;
    private final int hashCode;
    private transient String longValue;
    private transient String shortValue;

    static {
        int i;
        String str = SystemPropertyUtil.get("io.netty.processId");
        int iDefaultProcessId = -1;
        if (str != null) {
            try {
                i = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                i = -1;
            }
            if (i < 0) {
                logger.warn("-Dio.netty.processId: {} (malformed)", str);
            } else {
                InternalLogger internalLogger = logger;
                if (internalLogger.isDebugEnabled()) {
                    internalLogger.debug("-Dio.netty.processId: {} (user-set)", Integer.valueOf(i));
                }
                iDefaultProcessId = i;
            }
        }
        if (iDefaultProcessId < 0) {
            iDefaultProcessId = defaultProcessId();
            InternalLogger internalLogger2 = logger;
            if (internalLogger2.isDebugEnabled()) {
                internalLogger2.debug("-Dio.netty.processId: {} (auto-detected)", Integer.valueOf(iDefaultProcessId));
            }
        }
        PROCESS_ID = iDefaultProcessId;
        String str2 = SystemPropertyUtil.get("io.netty.machineId");
        byte[] mac = null;
        if (str2 != null) {
            try {
                mac = MacAddressUtil.parseMAC(str2);
            } catch (Exception e2) {
                logger.warn("-Dio.netty.machineId: {} (malformed)", str2, e2);
            }
            if (mac != null) {
                logger.debug("-Dio.netty.machineId: {} (user-set)", str2);
            }
        }
        if (mac == null) {
            mac = MacAddressUtil.defaultMachineId();
            InternalLogger internalLogger3 = logger;
            if (internalLogger3.isDebugEnabled()) {
                internalLogger3.debug("-Dio.netty.machineId: {} (auto-detected)", MacAddressUtil.formatAddress(mac));
            }
        }
        MACHINE_ID = mac;
    }

    private DefaultChannelId() {
        byte[] bArr = MACHINE_ID;
        byte[] bArr2 = new byte[bArr.length + 4 + 4 + 8 + 4];
        this.data = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        writeInt(writeLong(writeInt(writeInt(bArr.length + 0, PROCESS_ID), nextSequence.getAndIncrement()), Long.reverse(System.nanoTime()) ^ System.currentTimeMillis()), PlatformDependent.threadLocalRandom().nextInt());
        this.hashCode = Arrays.hashCode(bArr2);
    }

    private int appendHexDumpField(StringBuilder sb, int i, int i2) {
        sb.append(ByteBufUtil.hexDump(this.data, i, i2));
        sb.append(Soundex.SILENT_MARKER);
        return i + i2;
    }

    private static int defaultProcessId() {
        ClassLoader classLoader;
        String string;
        int i;
        try {
            classLoader = PlatformDependent.getClassLoader(DefaultChannelId.class);
            try {
                Class<?> cls = Class.forName("java.lang.management.ManagementFactory", true, classLoader);
                Class<?> cls2 = Class.forName("java.lang.management.RuntimeMXBean", true, classLoader);
                Class<?>[] clsArr = EmptyArrays.EMPTY_CLASSES;
                Method method = cls.getMethod("getRuntimeMXBean", clsArr);
                Object[] objArr = EmptyArrays.EMPTY_OBJECTS;
                string = (String) cls2.getMethod("getName", clsArr).invoke(method.invoke(null, objArr), objArr);
            } catch (Throwable th) {
                th = th;
                logger.debug("Could not invoke ManagementFactory.getRuntimeMXBean().getName(); Android?", th);
                try {
                    string = Class.forName("android.os.Process", true, classLoader).getMethod("myPid", EmptyArrays.EMPTY_CLASSES).invoke(null, EmptyArrays.EMPTY_OBJECTS).toString();
                } catch (Throwable th2) {
                    logger.debug("Could not invoke Process.myPid(); not Android?", th2);
                    string = "";
                }
            }
        } catch (Throwable th3) {
            th = th3;
            classLoader = null;
        }
        int iIndexOf = string.indexOf(64);
        if (iIndexOf >= 0) {
            string = string.substring(0, iIndexOf);
        }
        try {
            i = Integer.parseInt(string);
        } catch (NumberFormatException unused) {
            i = -1;
        }
        if (i >= 0) {
            return i;
        }
        int iNextInt = PlatformDependent.threadLocalRandom().nextInt();
        logger.warn("Failed to find the current process ID from '{}'; using a random value: {}", string, Integer.valueOf(iNextInt));
        return iNextInt;
    }

    public static DefaultChannelId newInstance() {
        return new DefaultChannelId();
    }

    private String newLongValue() {
        StringBuilder sb = new StringBuilder((this.data.length * 2) + 5);
        appendHexDumpField(sb, appendHexDumpField(sb, appendHexDumpField(sb, appendHexDumpField(sb, appendHexDumpField(sb, 0, MACHINE_ID.length), 4), 4), 8), 4);
        return sb.substring(0, sb.length() - 1);
    }

    private int writeInt(int i, int i2) {
        byte[] bArr = this.data;
        int i3 = i + 1;
        bArr[i] = (byte) (i2 >>> 24);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (i2 >>> 16);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (i2 >>> 8);
        int i6 = i5 + 1;
        bArr[i5] = (byte) i2;
        return i6;
    }

    private int writeLong(int i, long j2) {
        byte[] bArr = this.data;
        int i2 = i + 1;
        bArr[i] = (byte) (j2 >>> 56);
        int i3 = i2 + 1;
        bArr[i2] = (byte) (j2 >>> 48);
        int i4 = i3 + 1;
        bArr[i3] = (byte) (j2 >>> 40);
        int i5 = i4 + 1;
        bArr[i4] = (byte) (j2 >>> 32);
        int i6 = i5 + 1;
        bArr[i5] = (byte) (j2 >>> 24);
        int i7 = i6 + 1;
        bArr[i6] = (byte) (j2 >>> 16);
        int i8 = i7 + 1;
        bArr[i7] = (byte) (j2 >>> 8);
        int i9 = i8 + 1;
        bArr[i8] = (byte) j2;
        return i9;
    }

    @Override // io.netty.channel.ChannelId
    public String asLongText() {
        String str = this.longValue;
        if (str != null) {
            return str;
        }
        String strNewLongValue = newLongValue();
        this.longValue = strNewLongValue;
        return strNewLongValue;
    }

    @Override // io.netty.channel.ChannelId
    public String asShortText() {
        String str = this.shortValue;
        if (str != null) {
            return str;
        }
        byte[] bArr = this.data;
        String strHexDump = ByteBufUtil.hexDump(bArr, bArr.length - 4, 4);
        this.shortValue = strHexDump;
        return strHexDump;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DefaultChannelId)) {
            return false;
        }
        DefaultChannelId defaultChannelId = (DefaultChannelId) obj;
        return this.hashCode == defaultChannelId.hashCode && Arrays.equals(this.data, defaultChannelId.data);
    }

    public int hashCode() {
        return this.hashCode;
    }

    public String toString() {
        return asShortText();
    }

    @Override // java.lang.Comparable
    public int compareTo(ChannelId channelId) {
        if (this == channelId) {
            return 0;
        }
        if (!(channelId instanceof DefaultChannelId)) {
            return asLongText().compareTo(channelId.asLongText());
        }
        byte[] bArr = ((DefaultChannelId) channelId).data;
        int length = this.data.length;
        int length2 = bArr.length;
        int iMin = Math.min(length, length2);
        for (int i = 0; i < iMin; i++) {
            byte b = this.data[i];
            byte b2 = bArr[i];
            if (b != b2) {
                return (b & 255) - (b2 & 255);
            }
        }
        return length - length2;
    }
}
