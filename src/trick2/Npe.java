package trick2;

class Npe {
    public static void main(String []args){
        try{
            String []a=new String[10];
            a=null;
            a[0]="string";
            System.out.println(a[0]);
        }catch(NullPointerException npe) {
            System.out.println("Null pointer Exception.");
        }
    }
}
