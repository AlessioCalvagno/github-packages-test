package it.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        List<Float> a = new ArrayList<>();
        a.add(2.0F);
        a.add(1.0F);
        MeanUtils.computeMean(a);

    }
}
