package org.exercises.arrays1;

public class Array5 {
    public static void main(String args[] ){
        var i = 0 ;
        int[] iA = {10, 20} ;
        iA[i] = i = 30 ;
        System.out.println(""+ iA[ 0 ] + " " + iA[ 1 ] + "  "+i) ;
    }
}


