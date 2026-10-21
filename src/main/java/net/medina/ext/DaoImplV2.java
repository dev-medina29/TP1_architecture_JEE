package net.medina.ext;

import net.medina.dao.IDao;
import org.springframework.stereotype.Component;

@Component("d2")
public class DaoImplV2 implements IDao {
    @Override
    public double getData(){
        System.out.println( "Version capteur");
        return 30;
    }
}
