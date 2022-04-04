package fall_2018;

class A{
    public int ai; // this attribute already access in child class directly, that's hy it should be public

    public A(int ai) { this.ai = ai; }

    void set(){
        this.ai = 0;
    }
    void set(int ai){
        this.ai = ai;
    }
}

class B extends A{
    private int bi;
    public B(){ super(0); } // we have to pass data for parent class constructor, because No one will give data for parent class constructor's argument by default, I have to pass this data invoking super() (it's basically parent class constructor) method

    public B(int bi){
        super(bi); // must be pass argument for parent class constructor
    }
    void set(){
        ai = 0;
        bi = 0;
    }
    void set(int ai, int bi){ // data type & name must be seperated with white space
        this.ai = ai;
        this.bi = ai;
    }
}