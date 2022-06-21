public class DataTypesDemo {
    public static void main(String[] args) {
        byte b = 10;
        short sh = 20;
        int in = 30;
        long ln = 40;

        // 10, 20, 30, 40 these are literals

        //assign value of one varibale to another
        //b = sh;  //these two data types are not equivalent
        // becuase value of short data type cannot be assigned to byte datatype

        //b = in; //byte cannot hold the int data type

        // b = ln;  //not possible

        sh=b; // this thing is possible because short is of 2 byte and byte is of 1 byte
        // System.out.println(sh);
        // sh=in;  this thing is not possible
        // sh=ln this is also not possible

        in=b;
        in=sh;
        // in = ln; //cannot convert 

        ln=b;
        ln=sh;
        ln=in;


        // ********************************* //


        //b=in; this is not possible 
        // but when 10 ie this by default int is being assigned to byte and compiler is not showing any error ?
        // because
        // compiler will check whether number on right side is lying in the range of byte 
        // 10 is in the range of byte
        // it will implicitaley convert that number into byte 
        b=10; 
        // range of byte is -128 to 128
        // b = (byte) 10;  -> we canot see this thing 
        // this thing is done implicitely
        b=127;
        // b=128; //cannot convert integer to byte variable; outside the range of byte 
        // we can explicityly say to convert this
        b= (byte)128;
        System.out.println(b); //value will be -128

        // just think how we get -128 from 128
        //  4 bytes = 32 bits
        // binary representation 
        // 10000000 --> type integer

        //************************* */

        in=100000000; 
        // in=100000000000;  //does not belongs to range of integer
        // ln=10000000000; // it doesnot convert int to long 
        ln=10000000000L;
        System.out.println(ln);

        // how to store decimal numbers in a variable
        // float f =5.5; cannot convert from double to float
        // by decimal numbers of double (their literals value are of double)
        float f = 5.5f;  // converting explicitly into float
        System.out.println(f);

        double db=6.5; //this literal is already double
        System.out.println(db);

        //  float value to integer variable and integer value to float variable
        // in=f; //cannot cnvrt float to integer
        in=(int)f; //compiler will remove the decimal part and store the value
        System.out.println(in);

        f=in; // float has larger range than integer variable
        System.out.println(f);

        // Boolean data type

        boolean bit = true;
        // bit=1;// convert convert int to boolean
        // bit=0; // 
        if(bit){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }

        bit=false;
        if(bit){
            System.out.println("Hello");
        }else{
            System.out.println("Bye");
        }

        if(in>0){
            System.out.println("Greater");
        }else{
            System.out.println("Lesser or Equal");
        }

    }
}