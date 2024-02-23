package ext;

import dao.IDao;

public class DaoImplVWS implements IDao {

    @Override
    public double getData(){
        System.out.print("Version Web Service");
        return 90;
    }

}
