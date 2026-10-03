package com.oplus.aiunit.vision;

import android.content.Context;
import android.net.Uri;
import com.heytap.health.protocol.workout.WorkoutProto$VoiceRemindData;
import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes2.dex */
public final class n2l implements u2l.a {
    public static final int END_CODE_NO_VALID_SEGMENT_FILES = 2;
    public static final int END_CODE_SUCCESS = 1;
    public static final int FILE_CHECK_CODE_NO_VALID_SEGMENT_FILES = 2;
    public static final int FILE_CHECK_CODE_OK = 1;
    public static final String TEST_SEGMENT_PUSH_SUBDIR = "voice_packets";
    public final Context a;
    public final File b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final u2l f14318c;
    public q2l d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public a f14319e;
    public WorkoutProto$VoiceRemindData f;
    public boolean g;

    public interface a {
        void a(boolean z, int i, WorkoutProto$VoiceRemindData workoutProto$VoiceRemindData);

        void b(boolean z, int i, WorkoutProto$VoiceRemindData workoutProto$VoiceRemindData);
    }

    public n2l(Context context, File file) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext;
        this.b = file == null ? g(applicationContext) : file;
        this.f14318c = new u2l(this);
    }

    public static File g(Context context) {
        File file = new File(context.getApplicationContext().getFilesDir(), TEST_SEGMENT_PUSH_SUBDIR);
        if (!file.isDirectory() && !file.mkdirs()) {
            a7b.m("VMEDIA_LocalFilePlaylistPlayer", "defaultExternalSegmentsBaseDir mkdirs failed: " + file.getAbsolutePath());
        }
        return file;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i(WorkoutProto$VoiceRemindData workoutProto$VoiceRemindData, boolean z, int i) {
        this.f14318c.d();
        a aVar = this.f14319e;
        if (aVar != null) {
            if (z) {
                aVar.a(true, 1, workoutProto$VoiceRemindData);
            } else {
                aVar.a(false, 2, workoutProto$VoiceRemindData);
            }
        }
        this.f = null;
    }

    @Override // com.oplus.aiunit.vision.u2l.a
    public void a() {
    }

    @Override // com.oplus.aiunit.vision.u2l.a
    public void b() {
    }

    @Override // com.oplus.aiunit.vision.u2l.a
    public void c() {
    }

    public final LinkedList<Uri> e(String str, int i, Collection<String> collection) {
        if (collection == null) {
            return new LinkedList<>();
        }
        LinkedList<Uri> linkedListF = f(m(str, i), collection, str, i);
        if (!linkedListF.isEmpty()) {
            return linkedListF;
        }
        if (!"voice_default".equals(str)) {
            File fileM = m("voice_default", i);
            LinkedList<Uri> linkedListF2 = f(fileM, collection, "voice_default", i);
            if (!linkedListF2.isEmpty()) {
                a7b.m("VMEDIA_LocalFilePlaylistPlayer", "fallback to default voice pack, requested=" + str + ", version=" + i);
                return linkedListF2;
            }
            File fileL = l();
            if (fileL != null && (fileM == null || !fileL.getAbsolutePath().equals(fileM.getAbsolutePath()))) {
                LinkedList<Uri> linkedListF3 = f(fileL, collection, "voice_default", i);
                if (!linkedListF3.isEmpty()) {
                    a7b.m("VMEDIA_LocalFilePlaylistPlayer", "fallback to any default voice pack dir, requested=" + str + ", version=" + i + ", fallbackDir=" + fileL.getName());
                    return linkedListF3;
                }
            }
        }
        return new LinkedList<>();
    }

    public final LinkedList<Uri> f(File file, Collection<String> collection, String str, int i) {
        LinkedList<Uri> linkedList = new LinkedList<>();
        if (file == null || !file.isDirectory()) {
            a7b.m("VMEDIA_LocalFilePlaylistPlayer", "voice pack dir missing, name=" + str + ", version=" + i);
            return linkedList;
        }
        try {
            String str2 = file.getCanonicalPath() + File.separator;
            for (String str3 : collection) {
                if (str3 == null || str3.isEmpty()) {
                    a7b.m("VMEDIA_LocalFilePlaylistPlayer", "empty segment file name");
                    linkedList.clear();
                    break;
                }
                String strJ = j(str3);
                if (strJ.isEmpty()) {
                    a7b.m("VMEDIA_LocalFilePlaylistPlayer", "invalid segment file name: " + str3);
                    linkedList.clear();
                    return linkedList;
                }
                File file2 = new File(file, strJ);
                try {
                    if (!file2.getCanonicalPath().startsWith(str2)) {
                        a7b.m("VMEDIA_LocalFilePlaylistPlayer", "illegal segment path: " + str3);
                        linkedList.clear();
                        return linkedList;
                    }
                    if (!file2.isFile()) {
                        a7b.m("VMEDIA_LocalFilePlaylistPlayer", "missing segment file: " + file2.getAbsolutePath());
                        linkedList.clear();
                        return linkedList;
                    }
                    linkedList.add(Uri.fromFile(file2));
                } catch (IOException e2) {
                    a7b.n("VMEDIA_LocalFilePlaylistPlayer", "skip invalid segment path: " + str3, e2);
                    linkedList.clear();
                    return linkedList;
                }
            }
            return linkedList;
        } catch (IOException e3) {
            a7b.n("VMEDIA_LocalFilePlaylistPlayer", "resolve voice pack canonical path failed: " + file.getAbsolutePath(), e3);
            return linkedList;
        }
    }

    public final int h(String str) {
        int iLastIndexOf;
        if (str == null || str.isEmpty() || (iLastIndexOf = str.lastIndexOf(95)) < 0 || iLastIndexOf == str.length() - 1) {
            return -1;
        }
        try {
            return Integer.parseInt(str.substring(iLastIndexOf + 1));
        } catch (NumberFormatException unused) {
            return -1;
        }
    }

    public final String j(String str) {
        String strReplace = str.replace("\\", "/");
        while (strReplace.startsWith("/")) {
            strReplace = strReplace.substring(1);
        }
        while (strReplace.contains("//")) {
            strReplace = strReplace.replace("//", "/");
        }
        return strReplace;
    }

    public void k(final WorkoutProto$VoiceRemindData workoutProto$VoiceRemindData, boolean z) {
        if (this.g || workoutProto$VoiceRemindData == null) {
            return;
        }
        LinkedList<Uri> linkedListE = e(workoutProto$VoiceRemindData.getVoicePackName(), workoutProto$VoiceRemindData.getVersion(), workoutProto$VoiceRemindData.getFileNameList());
        if (linkedListE.isEmpty()) {
            a7b.m("VMEDIA_LocalFilePlaylistPlayer", "playSegmentFileNames: no valid files under " + this.b);
            a aVar = this.f14319e;
            if (aVar != null) {
                aVar.b(false, 2, workoutProto$VoiceRemindData);
            }
            this.f = null;
            return;
        }
        a aVar2 = this.f14319e;
        if (aVar2 != null) {
            aVar2.b(true, 1, workoutProto$VoiceRemindData);
        }
        q2l q2lVar = this.d;
        if (q2lVar != null && q2lVar.k()) {
            this.f = workoutProto$VoiceRemindData;
            this.d.p(linkedListE, false, this.f14318c.h(), workoutProto$VoiceRemindData.getVoiceId());
            return;
        }
        this.f = workoutProto$VoiceRemindData;
        if (!this.f14318c.k()) {
            a7b.m("VMEDIA_LocalFilePlaylistPlayer", "playSegmentFileNames: audio focus not granted");
        }
        q2l q2lVar2 = this.d;
        if (q2lVar2 == null) {
            this.d = new q2l(this.a);
        } else {
            q2lVar2.q();
        }
        this.d.s(this.f14318c.h());
        this.d.setOnPlaybackFinishedListener(new q2l.a() { // from class: com.oplus.aiunit.vision.m2l
            @Override // com.oplus.aiunit.vision.q2l.a
            public final void a(boolean z2, int i) {
                this.a.i(workoutProto$VoiceRemindData, z2, i);
            }
        });
        this.d.p(linkedListE, z, this.f14318c.h(), workoutProto$VoiceRemindData.getVoiceId());
    }

    public final File l() {
        File[] fileArrListFiles = this.b.listFiles();
        File file = null;
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            int i = -1;
            long j2 = Long.MIN_VALUE;
            for (File file2 : fileArrListFiles) {
                if (file2 != null && file2.isDirectory()) {
                    String name = file2.getName();
                    if (name.equals("voice_default") || name.startsWith("voice_default_")) {
                        int iH = h(name);
                        long jLastModified = file2.lastModified();
                        if (file == null || iH > i || (iH == i && jLastModified > j2)) {
                            file = file2;
                            i = iH;
                            j2 = jLastModified;
                        }
                    }
                }
            }
        }
        return file;
    }

    public final File m(String str, int i) {
        if (str == null || str.isEmpty()) {
            return null;
        }
        return a3l.b(this.b, str, i);
    }

    public void n(a aVar) {
        this.f14319e = aVar;
    }

    public void o() {
        q2l q2lVar = this.d;
        if (q2lVar != null) {
            q2lVar.t();
            this.d.q();
        }
        this.f14318c.d();
        this.f = null;
    }
}
