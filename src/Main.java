public class Main {

    public static void main(String[] args) {

        DataSource<MyData> repository = new Repository (
                new CachedDataSource<>(),
                new NetworkDataSource()
        );

        System.out.println(repository.getData());
        System.out.println(repository.getData());

        DataSource<AccountData> repository2 = new Repository(
                new CachedDataSource<>(),
                new AccountNetworkDataSource()
        );
        System.out.println(repository2.getData());
        System.out.println(repository2.getData());
    }
}
