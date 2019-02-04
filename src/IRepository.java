
@SuppressWarnings("hiding")
public interface IRepository<AbstractEntity> {
    
    void add(AbstractEntity entity);
    
    void save(AbstractEntity entity);
    
}
