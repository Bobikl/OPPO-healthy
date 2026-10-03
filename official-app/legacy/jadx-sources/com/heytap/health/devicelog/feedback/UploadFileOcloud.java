package com.heytap.health.devicelog.feedback;

import android.net.Uri;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.lifecycle.MutableLiveData;
import com.cloud.sdk.cloudstorage.common.IProgressCallback;
import com.heytap.health.devicemanager.processor.bean.UserDeviceInfo;
import com.oplus.aiunit.vision.LogGetParam;
import com.oplus.aiunit.vision.LogGetResult;
import com.oplus.aiunit.vision.a7b;
import com.oplus.aiunit.vision.b78;
import com.oplus.aiunit.vision.ced;
import com.oplus.aiunit.vision.gea;
import com.oplus.aiunit.vision.gl4;
import com.oplus.aiunit.vision.ld7;
import com.oplus.aiunit.vision.um;
import com.oplus.smartenginehelper.ParserTag;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import p010kotlin.Metadata;
import p010kotlin.ResultKt;
import p010kotlin.coroutines.Continuation;
import p010kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsKt;
import p010kotlin.coroutines.jvm.internal.Boxing;
import p010kotlin.jvm.internal.Intrinsics;
import p010kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes16.dex */
@StabilityInferred(parameters = 0)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0006\u001a\u00020\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0004H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0007J=\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f0\u000e2\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000bH\u0082@ø\u0001\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/heytap/health/devicelog/feedback/UploadFileOcloud;", "Lcom/oplus/aiunit/vision/gea;", "Lcom/oplus/aiunit/vision/b6b;", "Lcom/oplus/aiunit/vision/c6b;", "Lcom/oplus/aiunit/vision/gea$a;", "chain", "a", "(Lcom/oplus/aiunit/vision/gea$a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/MutableLiveData;", "", "fileUploadProgress", "", "", "files", "", "b", "(Landroidx/lifecycle/MutableLiveData;Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<init>", "()V", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
@SourceDebugExtension({"SMAP\nLogGetInterceptors.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LogGetInterceptors.kt\ncom/heytap/health/devicelog/feedback/UploadFileOcloud\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 Uri.kt\nandroidx/core/net/UriKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,398:1\n1603#2,9:399\n1855#2:408\n1856#2:411\n1612#2:412\n1855#2,2:413\n29#3:409\n1#4:410\n*S KotlinDebug\n*F\n+ 1 LogGetInterceptors.kt\ncom/heytap/health/devicelog/feedback/UploadFileOcloud\n*L\n298#1:399,9\n298#1:408\n298#1:411\n298#1:412\n321#1:413,2\n299#1:409\n298#1:410\n*E\n"})
public final class UploadFileOcloud implements gea<LogGetParam, LogGetResult> {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¨\u0006\b"}, d2 = {"com/heytap/health/devicelog/feedback/UploadFileOcloud$a", "Lcom/cloud/sdk/cloudstorage/common/IProgressCallback;", "", "filePath", "", ParserTag.TAG_PERCENT, "", "onProgress", "device_settings_impl_release"}, k = 1, mv = {1, 8, 0})
    public static final class a implements IProgressCallback {
        public final /* synthetic */ MutableLiveData<Float> a;

        public a(MutableLiveData<Float> mutableLiveData) {
            this.a = mutableLiveData;
        }

        @Override // com.cloud.sdk.cloudstorage.common.IProgressCallback
        public void onProgress(@NotNull String filePath, double percent) {
            Intrinsics.checkNotNullParameter(filePath, "filePath");
            MutableLiveData<Float> mutableLiveData = this.a;
            if (mutableLiveData != null) {
                mutableLiveData.postValue(Float.valueOf((float) percent));
            }
            Feedback.INSTANCE.a();
            StringBuilder sb = new StringBuilder();
            sb.append("uploadFile onProgress: ");
            sb.append(percent);
        }
    }

    /* JADX WARN: Code duplicated, block: B:77:0x0223  */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x0236 A[LOOP:0: B:78:0x0230->B:80:0x0236, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:83:0x0288  */
    /* JADX WARN: Instruction removed from duplicated block: B:80:0x0236, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:83:0x0288, please report this as an issue */
    @Override // com.oplus.aiunit.vision.gea
    @Nullable
    public Object a(@NotNull gea.a<LogGetParam, LogGetResult> aVar, @NotNull Continuation<? super LogGetResult> continuation) throws Throwable {
        UploadFileOcloud$intercept$1 uploadFileOcloud$intercept$1;
        LogGetParam logGetParam;
        Object objB;
        List<String> list;
        String path;
        String mac;
        Map<? extends String, ? extends String> map;
        gea.a aVar2 = aVar;
        if (continuation instanceof UploadFileOcloud$intercept$1) {
            uploadFileOcloud$intercept$1 = (UploadFileOcloud$intercept$1) continuation;
            int i = uploadFileOcloud$intercept$1.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                uploadFileOcloud$intercept$1.label = i - Integer.MIN_VALUE;
            } else {
                uploadFileOcloud$intercept$1 = new UploadFileOcloud$intercept$1(this, continuation);
            }
        } else {
            uploadFileOcloud$intercept$1 = new UploadFileOcloud$intercept$1(this, continuation);
        }
        Object objA = uploadFileOcloud$intercept$1.result;
        Object coroutine_suspended = IntrinsicsKt__IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = uploadFileOcloud$intercept$1.label;
        if (i2 != 0) {
            if (i2 == 1) {
                ResultKt.throwOnFailure(objA);
            }
            if (i2 == 2) {
                List<String> list2 = (List) uploadFileOcloud$intercept$1.L$2;
                LogGetParam logGetParam2 = (LogGetParam) uploadFileOcloud$intercept$1.L$1;
                gea.a aVar3 = (gea.a) uploadFileOcloud$intercept$1.L$0;
                ResultKt.throwOnFailure(objA);
                list = list2;
                objB = objA;
                logGetParam = logGetParam2;
                aVar2 = aVar3;
                map = (Map) objB;
                if (map.keySet().size() >= list.size()) {
                    a7b.f(Feedback.INSTANCE.a(), "upload file error > toUploadFiles:" + list.size() + " fileKeys:" + map.keySet().size());
                    FeedbackOption fbOption = logGetParam.getFbOption();
                    throw new CacheErrorException("文件上传失败", fbOption.copy((3839 & 1) != 0 ? fbOption.bugDetail : null, (3839 & 2) != 0 ? fbOption.contact : null, (3839 & 4) != 0 ? fbOption.recentTime : null, (3839 & 8) != 0 ? fbOption.feedbackTime : 0L, (3839 & 16) != 0 ? fbOption.reproduceRate : null, (3839 & 32) != 0 ? fbOption.logNames : null, (3839 & 64) != 0 ? fbOption.medias : null, (3839 & 128) != 0 ? fbOption.fileKeys : null, (3839 & 256) != 0 ? fbOption.uploadFailFiles : list, (3839 & 512) != 0 ? fbOption.collectLog : false, (3839 & 1024) != 0 ? fbOption.logType : null, (3839 & 2048) != 0 ? fbOption.fid : null));
                }
                logGetParam.d().putAll(map);
                for (String str : list) {
                    boolean zDelete = new File(str).delete();
                    a7b.f(Feedback.INSTANCE.a(), "submitWithLog -> del temp file after upload:" + zDelete + " " + str);
                }
                a7b.f(Feedback.INSTANCE.a(), "UploadFileOcloud -> upload files success,size:" + map.size());
            } else {
                if (i2 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(objA);
            }
        }
        ResultKt.throwOnFailure(objA);
        logGetParam = (LogGetParam) aVar.request();
        FeedbackOption fbOption2 = logGetParam.getFbOption();
        Map<String, String> fileKeys = fbOption2.getFileKeys();
        if (!(fileKeys == null || fileKeys.isEmpty())) {
            a7b.f(Feedback.INSTANCE.a(), "UploadFileOcloud skip, current is pre commit error now retry");
            uploadFileOcloud$intercept$1.label = 1;
            objA = aVar2.a(logGetParam, uploadFileOcloud$intercept$1);
            return objA == coroutine_suspended ? coroutine_suspended : objA;
        }
        List<String> arrayList = new ArrayList<>();
        List<String> uploadFailFiles = fbOption2.getUploadFailFiles();
        if (uploadFailFiles == null || uploadFailFiles.isEmpty()) {
            if (!logGetParam.f().isEmpty()) {
                UserDeviceInfo userDeviceInfoJ = gl4.managerApi.j();
                String str2 = new SimpleDateFormat("MM-dd-HH-mm-ss").format(Boxing.boxLong(System.currentTimeMillis()));
                String model = userDeviceInfoJ != null ? userDeviceInfoJ.getModel() : null;
                Integer numBoxInt = (userDeviceInfoJ == null || (mac = userDeviceInfoJ.getMac()) == null) ? null : Boxing.boxInt(mac.hashCode());
                File file = new File(b78.a().getCacheDir(), model + "_health_log@" + numBoxInt + "@" + um.c().getSsoid().hashCode() + "_" + str2 + ".zip");
                file.deleteOnExit();
                ld7.B(logGetParam.f(), file.getAbsolutePath());
                String absolutePath = file.getAbsolutePath();
                Intrinsics.checkNotNullExpressionValue(absolutePath, "zipFile.absolutePath");
                arrayList.add(absolutePath);
            }
            List<String> medias = fbOption2.getMedias();
            if (medias != null) {
                Collection<? extends String> arrayList2 = new ArrayList<>();
                Iterator<T> it = medias.iterator();
                while (it.hasNext()) {
                    File fileY = ld7.y(Uri.parse((String) it.next()));
                    if (fileY == null) {
                        path = null;
                    } else {
                        Intrinsics.checkNotNullExpressionValue(fileY, "FileUtil.uriToFile(it.to…?: return@mapNotNull null");
                        a7b.f(Feedback.INSTANCE.a(), "UploadFileOcloud -> medal:" + ld7.x(fileY) + ", " + fileY.getPath());
                        path = fileY.getPath();
                    }
                    if (path != null) {
                        arrayList2.add(path);
                    }
                }
                Boxing.boxBoolean(arrayList.addAll(arrayList2));
            }
        } else {
            Collection<? extends String> uploadFailFiles2 = logGetParam.getFbOption().getUploadFailFiles();
            Intrinsics.checkNotNull(uploadFailFiles2);
            arrayList.addAll(uploadFailFiles2);
        }
        if (!arrayList.isEmpty()) {
            MutableLiveData<com.heytap.health.devicelog.feedback.a> mutableLiveDataC = logGetParam.c();
            if (Intrinsics.areEqual(mutableLiveDataC != null ? mutableLiveDataC.getValue() : null, com.heytap.health.devicelog.feedback.a.b.INSTANCE)) {
                logGetParam.c().postValue(com.heytap.health.devicelog.feedback.a.d.INSTANCE);
            }
            a7b.f(Feedback.INSTANCE.a(), "UploadFileOcloud -> to upload files start,size:" + arrayList.size());
            MutableLiveData<Float> mutableLiveDataE = logGetParam.e();
            uploadFileOcloud$intercept$1.L$0 = aVar2;
            uploadFileOcloud$intercept$1.L$1 = logGetParam;
            uploadFileOcloud$intercept$1.L$2 = arrayList;
            uploadFileOcloud$intercept$1.label = 2;
            objB = b(mutableLiveDataE, arrayList, uploadFileOcloud$intercept$1);
            if (objB == coroutine_suspended) {
                return coroutine_suspended;
            }
            list = arrayList;
            map = (Map) objB;
            if (map.keySet().size() >= list.size()) {
                a7b.f(Feedback.INSTANCE.a(), "upload file error > toUploadFiles:" + list.size() + " fileKeys:" + map.keySet().size());
                FeedbackOption fbOption3 = logGetParam.getFbOption();
                throw new CacheErrorException("文件上传失败", fbOption3.copy((3839 & 1) != 0 ? fbOption3.bugDetail : null, (3839 & 2) != 0 ? fbOption3.contact : null, (3839 & 4) != 0 ? fbOption3.recentTime : null, (3839 & 8) != 0 ? fbOption3.feedbackTime : 0L, (3839 & 16) != 0 ? fbOption3.reproduceRate : null, (3839 & 32) != 0 ? fbOption3.logNames : null, (3839 & 64) != 0 ? fbOption3.medias : null, (3839 & 128) != 0 ? fbOption3.fileKeys : null, (3839 & 256) != 0 ? fbOption3.uploadFailFiles : list, (3839 & 512) != 0 ? fbOption3.collectLog : false, (3839 & 1024) != 0 ? fbOption3.logType : null, (3839 & 2048) != 0 ? fbOption3.fid : null));
            }
            logGetParam.d().putAll(map);
            while (r5.hasNext()) {
                boolean zDelete2 = new File(str).delete();
                a7b.f(Feedback.INSTANCE.a(), "submitWithLog -> del temp file after upload:" + zDelete2 + " " + str);
            }
            a7b.f(Feedback.INSTANCE.a(), "UploadFileOcloud -> upload files success,size:" + map.size());
        }
        uploadFileOcloud$intercept$1.L$0 = null;
        uploadFileOcloud$intercept$1.L$1 = null;
        uploadFileOcloud$intercept$1.L$2 = null;
        uploadFileOcloud$intercept$1.label = 3;
        objA = aVar2.a(logGetParam, uploadFileOcloud$intercept$1);
        return objA == coroutine_suspended ? coroutine_suspended : objA;
    }

    public final Object b(MutableLiveData<Float> mutableLiveData, List<String> list, Continuation<? super Map<String, String>> continuation) {
        return ced.INSTANCE.e(list, new a(mutableLiveData), continuation);
    }
}
