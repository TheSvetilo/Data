public class Repository<T> implements DataSource<T> {

    private final MutableDataSource<T> cachedDataSource;
    private final DataSource<T> networkDataSource;

    public Repository(MutableDataSource<T> cachedDataSource, DataSource<T> networkDataSource) {
        this.cachedDataSource = cachedDataSource;
        this.networkDataSource = networkDataSource;
    }

    @Override
    public T getData() {
        T result = cachedDataSource.getData();
        if (result == null) {
            System.out.println("Data from network:");
            result = networkDataSource.getData();
            cachedDataSource.saveData(result);
        } else {
            System.out.println("Data from cache:");
        }
        return result;
    }
}
