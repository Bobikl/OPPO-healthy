package androidx.databinding;

/* JADX INFO: loaded from: classes12.dex */
public class DataBinderMapperImpl extends MergedDataBinderMapper {
    public DataBinderMapperImpl() {
        addMapper(new com.heytap.health.DataBinderMapperImpl());
        addMapper("com.heytap.health.splitapk.operation");
    }
}
