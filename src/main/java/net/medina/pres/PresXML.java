package net.medina.pres;

import net.medina.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PresXML {
    public void main(){
        ApplicationContext springContext = new ClassPathXmlApplicationContext("config.xml");
        IMetier metier=(IMetier) springContext.getBean("metier");
        System.out.println("Res ="+metier.calcul());

    }
}
