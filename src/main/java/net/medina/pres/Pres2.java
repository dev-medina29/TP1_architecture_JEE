package net.medina.pres;

import net.medina.dao.IDao;
import net.medina.metier.IMetier;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Pres2 {
    static void main() throws FileNotFoundException, ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Scanner scanner=new Scanner(new File("config.txt"));

        String daoClassNane=scanner.nextLine();
        Class cDao = Class.forName(daoClassNane);
        IDao dao = (IDao) cDao.newInstance();

        String metierClassNane=scanner.nextLine();
        Class cMetier = Class.forName(metierClassNane);
        IMetier metier = (IMetier) cMetier.getConstructor(IDao.class).newInstance(dao);
        System.out.println("Res = "+metier.calcul());


    }

}
