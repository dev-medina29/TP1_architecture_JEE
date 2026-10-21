package net.medina.pres;

import net.medina.dao.DaoImpl;
import net.medina.ext.DaoImplV2;
import net.medina.metier.MetierImpl;

public class Pres1 {
   public static void main() {

       DaoImplV2 dao = new DaoImplV2();
       MetierImpl metier = new MetierImpl(dao);
//       metier.setDao(dao);
       System.out.println("Res="+metier.calcul());
    }
}
