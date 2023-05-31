import Clases.Despensa;
import Clases.Fiambreria;
import Clases.Papeleria;
import Clases.Product;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {

        List<Product> lista = new ArrayList<>();

        Fiambreria f = new Fiambreria("Salame", LocalDate.now(),"Serenisima",500,
                0,4000,"Premium");
        Despensa d = new Despensa("Fideo moño",LocalDate.now(),"Serenisima",650,0,60,
                LocalDate.of(2023,11,23),1);
        Papeleria p = new Papeleria("Papel Higienico",LocalDate.now(),"Higienol"
                ,1000,0,20,600);

        lista.add(f);
        lista.add(d);
        lista.add(p);

        System.out.println(lista);


    }
}