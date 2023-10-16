import java.util.*;
import java.lang.*;
import java.io.*;

class Pangram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        s=s.replace(" ","");
        if(Pangram(s)){
            System.out.println("Pangram");
        }else{
            System.out.println("Not pangram");
        }
        
    }
    public static boolean Pangram(String s){
        if(s.length()<26){
            return false;
        }
        String alphas="abcdefghijklmnopqrstuvwxyz";
        for(int i=0;i<26;i++){
                if(s.indexOf(alphas.charAt(i))==-1){
                    return false;
                }
        }
        return true;
    }
}