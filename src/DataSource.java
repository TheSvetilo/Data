interface DataSource<T> {
    T getData();
}

interface MutableDataSource<T> extends DataSource<T> {
    void saveData(T myData);
}

class CachedDataSource<T> implements MutableDataSource<T> {

    private T myCacheData;

    @Override
    public T getData() {
        return myCacheData;
    }

    @Override
    public void saveData(T myData) {
        this.myCacheData = myData;
    }
}

class NetworkDataSource implements DataSource<MyData> {

    @Override
    public MyData getData() {
        return new MyData(1, "from network with love");
    }
}

class AccountNetworkDataSource implements DataSource<AccountData> {

    @Override
    public AccountData getData() {
        return new AccountData("Vlad", "Bogdanov");
    }
}