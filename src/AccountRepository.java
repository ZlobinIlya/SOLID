
public class AccountRepository implements IRepository<AccountEntity> {
    

    @Override
    public void add(AccountEntity entity) {
        entity.addAccount();
        
    }

    @Override
    public void save(AccountEntity entity) {
        // TODO Auto-generated method stub
        
    }

}
