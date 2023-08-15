public class saya {

    protected String baju = "baju kurung\n"; // saya attribute
    public void material() {  //saya method
     System.out.println( "cantiknyaaa");
    }
}
 class kain extends saya {
    private String jeniskain = "Kain batik"; //kain attribute
    public static void main (String[] args){

        //create a mykain object
        kain mykain = new kain ();
        //call the honk()method (from the saya class) on the mykain object
        mykain.material();
        // Display the value of the brand attribute (from the saya class) and the value of the jenis kain from the kain
        System.out.println(mykain.baju + "" + mykain.jeniskain);
    }
 }