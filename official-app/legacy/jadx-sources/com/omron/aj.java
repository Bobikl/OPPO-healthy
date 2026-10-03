package com.omron;

import android.support.annotation.NonNull;
import android.util.AndroidRuntimeException;
import com.oplus.drs.rom.sdk.comm.util.OpenIdUtils;
import java.util.UUID;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes5.dex */
public class aj {
    private static final Pattern b = Pattern.compile("([0-9a-fA-F]{4})");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Pattern f8806c = Pattern.compile("([0-9a-fA-F]{8})");
    private static final Pattern d = Pattern.compile("([0-9a-fA-F]{8})[-]?([0-9a-fA-F]{4})[-]?([0-9a-fA-F]{4})[-]?([0-9a-fA-F]{4})[-]?([0-9a-fA-F]{12})");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Pattern f8807e = Pattern.compile("0000([0-9a-fA-F]{4})");
    private static final Pattern f = Pattern.compile("0000([0-9a-fA-F]{4})-0000-1000-8000-00805f9b34fb");

    @NonNull
    private final String a;

    public aj(@NonNull String str) {
        if (4 == str.length()) {
            if (!b.matcher(str).matches()) {
                throw new AndroidRuntimeException("Invalid uuid format. " + str);
            }
        } else if (8 == str.length()) {
            if (!f8806c.matcher(str).matches()) {
                throw new AndroidRuntimeException("Invalid uuid format. " + str);
            }
            if (f8807e.matcher(str).matches()) {
                str = str.substring(4);
            }
        } else {
            if (36 != str.length()) {
                throw new AndroidRuntimeException("Invalid length.");
            }
            if (!d.matcher(str).matches()) {
                throw new AndroidRuntimeException("Invalid uuid format. " + str);
            }
            if (f.matcher(str).matches()) {
                str = str.substring(4, 8);
            }
        }
        this.a = str.toUpperCase();
    }

    @NonNull
    public static aj a(@NonNull String str) {
        return new aj(str);
    }

    @NonNull
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (super.equals(obj)) {
            return true;
        }
        if (obj != null && (obj instanceof aj)) {
            return b().equalsIgnoreCase(((aj) obj).b());
        }
        return false;
    }

    public String toString() {
        return "CBUUID{" + ak.a(this.a) + '}';
    }

    public aj(@NonNull UUID uuid) {
        this(uuid.toString());
    }

    @NonNull
    private String b(@NonNull String str) {
        StringBuilder sb;
        if (4 == str.length()) {
            sb = new StringBuilder();
            sb.append(OpenIdUtils.DEFAULT_VALUE);
        } else {
            if (8 != str.length()) {
                if (36 == str.length()) {
                    return str;
                }
                throw new AndroidRuntimeException("Invalid length.");
            }
            sb = new StringBuilder();
        }
        sb.append(str);
        sb.append("-0000-1000-8000-00805f9b34fb");
        return sb.toString();
    }

    @NonNull
    public UUID a() {
        return UUID.fromString(b(this.a));
    }
}
