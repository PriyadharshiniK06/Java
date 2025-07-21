class par {
    void run()
    {
        System.out.print("hi");
    }
}
class ch1 extends par{
    void run()
    {
        System.out.print("  hello");
    }
}
class ch2 extends par{
    void run()
    {
        System.out.print("  world");
    }
}
class ch3 extends par {
    void run(){
        System.out.print("  !!!!!!");
    }
}
class fun_overriding{
    public static void main(String[]args)
    {
        par a = new par();
        ch1 b = new ch1();
        ch2 c = new ch2();
        ch3 d = new ch3();
        a.run();
        b.run();
        c.run();
        d.run();
    }
}