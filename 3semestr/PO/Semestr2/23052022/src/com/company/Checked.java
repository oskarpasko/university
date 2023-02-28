package com.company;

public class Checked {
    public boolean BlednaWartoscDlaSilniException(int x){
        if(x < 0){
            throw new IllegalArgumentException("Liczba musi byc większa od 0");
        }else{
            return true;
        }
    }
}
