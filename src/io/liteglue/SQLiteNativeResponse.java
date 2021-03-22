package io.liteglue;

public class SQLiteNativeResponse {
    private int result;
    private long handle;

    public SQLiteNativeResponse(int result, long handle) {
        this.result = result;
        this.handle = handle;
    }

    public int getResult() {
        return this.result;
    }

    public long getHandle() {
        return this.handle;
    }

}
