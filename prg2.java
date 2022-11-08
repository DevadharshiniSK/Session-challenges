import java.util.*;

class prg2 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);

String str = sc.nextLine();

char array[]= {'a', 'b', 'c', 'd','e','f','g','h','i','j','k','l','m','n','o','p',
'q','r','s','t','u','v','w','x','y','z'};

for(int i=0;i<=str.length();i++){
    for(int j=0;j<26;j++){
        if(str.charAt(i)==array[j]){
            System.out.println(j+1);
        }
    }
}
sc.close();
}
}