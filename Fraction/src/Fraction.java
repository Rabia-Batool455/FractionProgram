public class Fraction {
    public int numer;
    public int deno;
    public Fraction(){

    }public Fraction(int numer,int deno){
        this.numer=numer;
        this.deno=deno;

    }public int getNumer(){
        return this.numer;
    }public int getDeno(){
        return this.deno;
    }public Fraction add(Fraction x){
        Fraction m=new Fraction();
        m.numer=this.numer*x.deno+this.deno*x.numer;
        m.deno=this.deno*x.deno;
        return m;}
    public Fraction sub(Fraction x){
        Fraction m=new Fraction();
        m.numer=this.numer*x.deno-this.deno*x.numer;
        m.deno=this.deno*x.deno;
        return m;}
    public Fraction mul(Fraction x){
        Fraction m=new Fraction();
        m.numer=this.numer*x.numer;
        m.deno=this.deno*x.deno;
        return m;}
    public Fraction div(Fraction x){
        Fraction m=new Fraction();
        m.numer=this.numer*x.deno;
        m.deno=this.deno*x.numer;
        return m;}

    public String simplify(){
        int i;
        if (this.numer>this.deno){
            i=this.numer;

        }else {
            i=this.deno;

        }//Fraction m=new Fraction(numer,deno);
        while (!(numer%i==0 && deno%i==0)&&i!=0){
            i--;
        }this.numer=this.numer/i;
        this.deno=this.deno/i;
        return this.toString();

    }

    //    }public void print(){
//        System.out.println(numer+"/"+deno);
//    }
    public String toString() {
        return "("+numer+"/"+deno+")";
    }

    public static void main(String[] args) {
        Fraction c = new Fraction(3, 2);
        Fraction d = new Fraction(1, 7);
        Fraction e,f;

        e = c.add(d);
        System.out.println(">>Add" +c+" +"+d+"="+ e);
        f=e;
        e=c.sub(d).add(e);
        System.out.println(">>Result" +c+" - "+d+c.add(d)+"="+ e);
        e=e.add(c.add(d));

        //System.out.println(">>Result" +e+" + ("+c+"+"+d+")="+ e);

        e = c.mul(d);
        System.out.println(c.mul(d));
        System.out.println(">>Multiplication" +c+"*"+d+"="+ e);
        e = c.div(d);
        System.out.println(">>Division" +c+"/"+d+"="+ e);

        Fraction g=new Fraction(550,100);
        System.out.println(">>Reduced form" + g.simplify());
    }
}


