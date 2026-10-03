package com.coloros.sceneservice.f;

/* JADX INFO: loaded from: classes13.dex */
public class c implements Runnable {
    public final /* synthetic */ d this$1;

    public c(d dVar) {
        this.this$1 = dVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        synchronized (this.this$1.this$0) {
            if (this.this$1.this$0.Ob != null) {
                f fVar = this.this$1.this$0;
                StringBuilder sb = new StringBuilder();
                sb.append("processed=0 and ");
                sb.append(this.this$1.this$0.b(f.Mb));
                this.this$1.this$0.Ob.onSceneDataChanged(fVar.a(null, sb.toString(), null, "occur_time ASC "));
            }
        }
    }
}
