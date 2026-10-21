package net.medina.pres;

import net.medina.metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class PresAnnotation {
    static void main() {
        ApplicationContext applicationContext= new AnnotationConfigApplicationContext("net.medina");
        IMetier metier=applicationContext.getBean(IMetier.class);
        System.out.println("Res ="+metier.calcul());

    }
}
