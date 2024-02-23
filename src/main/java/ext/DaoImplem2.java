package ext;

import dao.IDao;
import org.springframework.stereotype.Component;

@Component("dao2")
public class DaoImplem2 implements IDao {
    @Override
    public double getData() {
        System.out.print("Version Capteur");
        double temp=6000;
        return temp;
    }
}
