package com.oplus.aiunit.vision;

import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Type;
import java.nio.charset.Charset;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public abstract class h41 {

    public interface a<T> {
        T a(BufferedReader bufferedReader) throws Exception;
    }

    public static /* synthetic */ Object i(Type type, BufferedReader bufferedReader) throws Exception {
        try {
            return new Gson().fromJson(bufferedReader, type);
        } catch (Throwable th) {
            throw new Exception("json parse failed! " + th.getMessage());
        }
    }

    @NonNull
    @WorkerThread
    public ar9 b(yq9 yq9Var) throws Exception {
        pnl.d().c();
        return pnl.d().b().a(yq9Var);
    }

    @WorkerThread
    public <T> T c(@NonNull ar9 ar9Var, a<T> aVar) throws Exception {
        try {
            InputStream inputStreamF = ar9Var.f();
            try {
                InputStreamReader inputStreamReader = new InputStreamReader(inputStreamF, Charset.forName(ar9Var.k() == null ? "UTF-8" : ar9Var.k()));
                try {
                    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                    try {
                        T tA = aVar.a(bufferedReader);
                        bufferedReader.close();
                        inputStreamReader.close();
                        if (inputStreamF != null) {
                            inputStreamF.close();
                        }
                        ar9Var.close();
                        return tA;
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    try {
                        inputStreamReader.close();
                    } catch (Throwable th4) {
                        th3.addSuppressed(th4);
                    }
                    throw th3;
                }
            } catch (Throwable th5) {
                if (inputStreamF != null) {
                    try {
                        inputStreamF.close();
                    } catch (Throwable th6) {
                        th5.addSuppressed(th6);
                    }
                }
                throw th5;
            }
        } catch (Throwable th7) {
            ar9Var.close();
            throw th7;
        }
    }

    @WorkerThread
    public <T> T d(ar9 ar9Var, final Type type) throws Exception {
        return (T) c(ar9Var, new a() { // from class: com.oplus.aiunit.vision.g41
            @Override // com.oplus.aiunit.vision.h41.a
            public final Object a(BufferedReader bufferedReader) {
                return h41.i(type, bufferedReader);
            }
        });
    }

    @WorkerThread
    public String e(ar9 ar9Var) throws Exception {
        return ar9Var.j();
    }

    @NonNull
    @WorkerThread
    public ar9 f(String str, Map<String, String> map) throws Exception {
        return b(vre.b(str).h(map).f());
    }
}
