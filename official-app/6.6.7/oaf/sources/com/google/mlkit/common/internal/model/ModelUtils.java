package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: loaded from: D:\项目\oppo通知转发\analysis\health667-dex\classes14.dex */
@KeepForSdk
@WorkerThread
public class ModelUtils {
    private static final GmsLogger zza = new GmsLogger("ModelUtils", "");

    @KeepForSdk
    public static abstract class AutoMLManifest {
        @NonNull
        @KeepForSdk
        public abstract String getLabelsFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelFile();

        @NonNull
        @KeepForSdk
        public abstract String getModelType();
    }

    @KeepForSdk
    public static abstract class ModelLoggingInfo {
        public static ModelLoggingInfo zza(long j, @Nullable String str, boolean z) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j, zzu.zzb(str), z);
        }

        @NonNull
        @KeepForSdk
        public abstract String getHash();

        @KeepForSdk
        public abstract long getSize();

        @KeepForSdk
        public abstract boolean isManifestModel();
    }

    private ModelUtils() {
    }

    /* JADX WARN: Code duplicated, block: B:104:0x0106 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    @Nullable
    @KeepForSdk
    public static ModelLoggingInfo getModelLoggingInfo(@NonNull Context context, @NonNull LocalModel localModel) throws Throwable {
        long length;
        String string;
        Throwable th;
        IOException e;
        InputStream inputStreamZzb;
        String strZzc;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri = localModel.getUri();
        ?? r5 = 0;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorOpenFd = context.getAssets().openFd(assetFilePath);
                try {
                    length = assetFileDescriptorOpenFd.getLength();
                    assetFileDescriptorOpenFd.close();
                } catch (Throwable th2) {
                    if (assetFileDescriptorOpenFd != null) {
                        try {
                            assetFileDescriptorOpenFd.close();
                        } catch (Throwable th3) {
                            th2.addSuppressed(th3);
                        }
                    }
                    throw th2;
                }
            } catch (IOException e2) {
                zza.e("ModelUtils", "Failed to open model file", e2);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else {
            if (uri == null) {
                zza.e("ModelUtils", "Local model doesn't have any valid path.");
                return null;
            }
            try {
                AssetFileDescriptor assetFileDescriptorZza = zzi.zza(context, uri, "r");
                try {
                    length = assetFileDescriptorZza.getLength();
                    assetFileDescriptorZza.close();
                } catch (Throwable th4) {
                    if (assetFileDescriptorZza != null) {
                        try {
                            assetFileDescriptorZza.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                    }
                    throw th4;
                }
            } catch (IOException e3) {
                zza.e("ModelUtils", "Failed to open model file", e3);
                return null;
            }
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            string = assetFilePath;
        } else {
            string = absoluteFilePath != null ? absoluteFilePath : ((Uri) Preconditions.checkNotNull(uri)).toString();
        }
        String strZzb = sharedPrefManager.zzb(string, length);
        if (strZzb != null) {
            return ModelLoggingInfo.zza(length, strZzb, localModel.isManifestFile());
        }
        try {
            try {
                if (assetFilePath != null) {
                    inputStreamZzb = context.getAssets().open(assetFilePath);
                } else if (absoluteFilePath != null) {
                    inputStreamZzb = new FileInputStream(new File(absoluteFilePath));
                } else {
                    Uri uri2 = (Uri) Preconditions.checkNotNull(uri);
                    int i = zzi.zza;
                    inputStreamZzb = zzi.zzb(context, uri2, zzh.zza);
                }
                if (inputStreamZzb != null) {
                    try {
                        strZzc = zzc(inputStreamZzb);
                    } catch (IOException e4) {
                        e = e4;
                        zza.e("ModelUtils", "Failed to open model file", e);
                        if (inputStreamZzb != null) {
                            try {
                                inputStreamZzb.close();
                            } catch (IOException e5) {
                                zza.e("ModelUtils", "Failed to close model file", e5);
                            }
                        }
                        return null;
                    }
                } else {
                    strZzc = null;
                }
                if (strZzc != null) {
                    sharedPrefManager.zzc(string, length, strZzc);
                }
                ModelLoggingInfo modelLoggingInfoZza = ModelLoggingInfo.zza(length, strZzc, localModel.isManifestFile());
                if (inputStreamZzb != null) {
                    try {
                        inputStreamZzb.close();
                    } catch (IOException e6) {
                        zza.e("ModelUtils", "Failed to close model file", e6);
                    }
                }
                return modelLoggingInfoZza;
            } catch (Throwable th6) {
                th = th6;
                r5 = context;
                if (r5 != 0) {
                    try {
                        r5.close();
                    } catch (IOException e7) {
                        zza.e("ModelUtils", "Failed to close model file", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            inputStreamZzb = null;
        } catch (Throwable th7) {
            th = th7;
            if (r5 != 0) {
                r5.close();
            }
            throw th;
        }
    }

    @Nullable
    @KeepForSdk
    public static String getSHA256(@NonNull File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                String strZzc = zzc(fileInputStream);
                fileInputStream.close();
                return strZzc;
            } catch (Throwable th) {
                try {
                    fileInputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            zza.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002b, code lost:
    
        if (new java.io.File(r5).exists() == false) goto L10;
     */
    @androidx.annotation.Nullable
    @com.google.android.gms.common.annotation.KeepForSdk
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(@androidx.annotation.NonNull java.lang.String r5, boolean r6, @androidx.annotation.NonNull android.content.Context r7) {
        /*
            java.lang.String r0 = java.lang.String.valueOf(r5)
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "Manifest file path: "
            java.lang.String r0 = r2.concat(r0)
            java.lang.String r2 = "ModelUtils"
            r1.d(r2, r0)
            r0 = 0
            if (r6 == 0) goto L22
            android.content.res.AssetManager r3 = r7.getAssets()     // Catch: java.io.IOException -> L2d
            java.io.InputStream r3 = r3.open(r5)     // Catch: java.io.IOException -> L2d
            if (r3 == 0) goto L35
            r3.close()     // Catch: java.io.IOException -> L2d
            goto L35
        L22:
            java.io.File r3 = new java.io.File
            r3.<init>(r5)
            boolean r3 = r3.exists()
            if (r3 != 0) goto L35
        L2d:
            com.google.android.gms.common.internal.GmsLogger r5 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r6 = "Manifest file does not exist."
            r5.e(r2, r6)
            return r0
        L35:
            boolean r3 = r5.isEmpty()     // Catch: java.lang.Throwable -> La6
            r4 = 0
            if (r3 == 0) goto L3f
            byte[] r5 = new byte[r4]     // Catch: java.lang.Throwable -> La6
            goto L62
        L3f:
            if (r6 == 0) goto L4a
            android.content.res.AssetManager r6 = r7.getAssets()     // Catch: java.lang.Throwable -> La6
            java.io.InputStream r5 = r6.open(r5)     // Catch: java.lang.Throwable -> La6
            goto L55
        L4a:
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> La6
            java.io.File r7 = new java.io.File     // Catch: java.lang.Throwable -> La6
            r7.<init>(r5)     // Catch: java.lang.Throwable -> La6
            r6.<init>(r7)     // Catch: java.lang.Throwable -> La6
            r5 = r6
        L55:
            int r6 = r5.available()     // Catch: java.lang.Throwable -> L9a
            byte[] r7 = new byte[r6]     // Catch: java.lang.Throwable -> L9a
            r5.read(r7, r4, r6)     // Catch: java.lang.Throwable -> L9a
            r5.close()     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            r5 = r7
        L62:
            java.lang.String r6 = new java.lang.String     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.String r7 = "UTF-8"
            r6.<init>(r5, r7)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            r5.<init>()     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.String r7 = "Json string from the manifest file: "
            r5.append(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            r5.append(r6)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            r1.d(r2, r5)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            r5.<init>(r6)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.String r6 = "modelType"
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.String r7 = "modelFile"
            java.lang.String r7 = r5.getString(r7)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            java.lang.String r1 = "labelsFile"
            java.lang.String r5 = r5.getString(r1)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest r1 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            r1.<init>(r6, r7, r5)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
            return r1
        L9a:
            r6 = move-exception
            if (r5 == 0) goto La5
            r5.close()     // Catch: java.lang.Throwable -> La1
            goto La5
        La1:
            r5 = move-exception
            r6.addSuppressed(r5)     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
        La5:
            throw r6     // Catch: java.lang.Throwable -> La6 java.lang.Throwable -> La6
        La6:
            r5 = move-exception
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r7 = "Error parsing the manifest file."
            r6.e(r2, r7, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(java.lang.String, boolean, android.content.Context):com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest");
    }

    public static boolean zza(@NonNull File file, @NonNull String str) {
        String sha256 = getSHA256(file);
        zza.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    @Nullable
    private static String zzb(Context context, String str, boolean z) {
        AutoMLManifest manifestFile = parseManifestFile(str, z, context);
        if (manifestFile != null) {
            return new File(new File(str).getParent(), manifestFile.getModelFile()).toString();
        }
        zza.e("ModelUtils", "Failed to parse manifest file.");
        return null;
    }

    @Nullable
    private static String zzc(InputStream inputStream) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int i2 = inputStream.read(bArr);
                if (i2 == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, i2);
            }
            byte[] bArrDigest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : bArrDigest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (IOException unused) {
            zza.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}
