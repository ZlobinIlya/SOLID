
public class RoleRepository  implements IRepository<AccountEntity>{

//    @Override
//    public void add(RoleEntity entity) {
//        entity.addRole();
//        
//    }
//
//    @Override
//    public void save(RoleEntity entity) {
//        entity.sev();
//        
//    }

    @Override
    public void add(AccountEntity entity) {
        entity.addAccount();
        
    }

    @Override
    public void save(AccountEntity entity) {
        // TODO Auto-generated method stub
        
    }

}
