package br.com.fiap.exemploadapters;

import java.util.ArrayList;
import java.util.List;

public class DB {
    public static List<Pais> getPaises(){
        List<Pais> paises = new ArrayList<>();

        Pais alemanha = new Pais("Alemanha","Berlin", R.drawable.alemanha);
        paises.add(alemanha);

        Pais franca = new Pais("França","Paris", R.drawable.franca);
        paises.add(franca);

        Pais italia = new Pais("Italia","Roma", R.drawable.italia);
        paises.add(italia);

        Pais japao = new Pais("Japão","Tokio", R.drawable.japan);
        paises.add(japao);

        Pais russia = new Pais("Russia","Moscow", R.drawable.russia);
        paises.add(russia);

        return paises;
    }
}
